package okhttp3;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Dispatcher {
    public ThreadPoolExecutor a;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public static void c(Dispatcher dispatcher, RealCall.AsyncCall asyncCall, RealCall.AsyncCall asyncCall2, int i) {
        Dispatcher$promoteAndExecute$Effects dispatcher$promoteAndExecute$Effects;
        RealCall.AsyncCall b;
        if ((i & 1) != 0) {
            asyncCall = null;
        }
        if ((i & 4) != 0) {
            asyncCall2 = null;
        }
        dispatcher.getClass();
        TimeZone timeZone = _UtilJvmKt.a;
        boolean isShutdown = ((ThreadPoolExecutor) dispatcher.a()).isShutdown();
        synchronized (dispatcher) {
            if (asyncCall2 != null) {
                try {
                    asyncCall2.b.decrementAndGet();
                    if (!dispatcher.c.remove(asyncCall2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (asyncCall != null) {
                dispatcher.b.add(asyncCall);
                RealCall realCall = RealCall.this;
                if (!realCall.c && (b = dispatcher.b(realCall.b.a.d)) != null) {
                    asyncCall.b = b.b;
                }
            }
            if (asyncCall2 != null && (isShutdown || dispatcher.c.isEmpty())) {
                dispatcher.d.isEmpty();
            }
            if (isShutdown) {
                List C0 = sl1.C0(dispatcher.b);
                dispatcher.b.clear();
                dispatcher$promoteAndExecute$Effects = new Dispatcher$promoteAndExecute$Effects(C0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = dispatcher.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall3 = (RealCall.AsyncCall) it.next();
                    if (dispatcher.c.size() >= 64) {
                        break;
                    } else if (asyncCall3.b.get() < 5) {
                        it.remove();
                        asyncCall3.b.incrementAndGet();
                        arrayList.add(asyncCall3);
                        dispatcher.c.add(asyncCall3);
                    }
                }
                dispatcher$promoteAndExecute$Effects = new Dispatcher$promoteAndExecute$Effects(arrayList);
            }
        }
        int size = dispatcher$promoteAndExecute$Effects.a.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            RealCall.AsyncCall asyncCall4 = (RealCall.AsyncCall) dispatcher$promoteAndExecute$Effects.a.get(i2);
            if (asyncCall4 == asyncCall) {
                z = false;
            } else {
                RealCall.this.e.l(RealCall.this, dispatcher);
            }
            if (isShutdown) {
                asyncCall4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                RealCall realCall2 = RealCall.this;
                realCall2.h(interruptedIOException);
                asyncCall4.a.e(realCall2, interruptedIOException);
            } else {
                ExecutorService a = dispatcher.a();
                asyncCall4.getClass();
                RealCall realCall3 = RealCall.this;
                realCall3.a.a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) a).execute(asyncCall4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        RealCall realCall4 = RealCall.this;
                        realCall4.h(interruptedIOException2);
                        asyncCall4.a.e(realCall4, interruptedIOException2);
                        Dispatcher dispatcher2 = realCall3.a.a;
                        dispatcher2.getClass();
                        c(dispatcher2, null, asyncCall4, 3);
                    }
                } catch (Throwable th2) {
                    Dispatcher dispatcher3 = realCall3.a.a;
                    dispatcher3.getClass();
                    c(dispatcher3, null, asyncCall4, 3);
                    throw th2;
                }
            }
        }
        if (z && asyncCall != null) {
            RealCall.this.e.m(RealCall.this, dispatcher);
        }
    }

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.a == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new etd(_UtilJvmKt.b + " Dispatcher", false));
            }
            threadPoolExecutor = this.a;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final RealCall.AsyncCall b(String str) {
        Iterator it = this.c.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (c16.i(RealCall.this.b.a.d, str)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.b.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (c16.i(RealCall.this.b.a.d, str)) {
                return asyncCall2;
            }
        }
        return null;
    }
}
