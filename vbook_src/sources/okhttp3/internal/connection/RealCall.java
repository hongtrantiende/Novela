package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RealCall implements Call, Cloneable, Lockable {
    public static final /* synthetic */ int Q = 0;
    public final AtomicBoolean C;
    public Object D;
    public ExchangeFinder E;
    public RealConnection F;
    public boolean G;
    public Exchange H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public volatile boolean N;
    public volatile Exchange O;
    public final CopyOnWriteArrayList P;
    public final OkHttpClient a;
    public final Request b;
    public final boolean c;
    public final RealConnectionPool d;
    public volatile EventListener e;
    public final RealCall$timeout$1 f;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public final class AsyncCall implements Runnable {
        public final Callback a;
        public volatile AtomicInteger b = new AtomicInteger(0);

        public AsyncCall(Callback callback) {
            this.a = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Dispatcher dispatcher;
            String concat = "OkHttp ".concat(RealCall.this.b.a.g());
            RealCall realCall = RealCall.this;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(concat);
            try {
                realCall.f.i();
                boolean z = false;
                try {
                    try {
                        this.a.d(realCall, realCall.f());
                        dispatcher = realCall.a.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            Platform platform = Platform.a;
                            Platform.a.j(4, "Callback failure for ".concat(RealCall.a(realCall)), e);
                        } else {
                            this.a.e(realCall, e);
                        }
                        dispatcher = realCall.a.a;
                        dispatcher.getClass();
                        Dispatcher.c(dispatcher, null, this, 3);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        realCall.d();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.a.e(realCall, iOException);
                        }
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                            dispatcher = realCall.a.a;
                            dispatcher.getClass();
                            Dispatcher.c(dispatcher, null, this, 3);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                dispatcher.getClass();
                Dispatcher.c(dispatcher, null, this, 3);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class CallReference extends WeakReference<RealCall> {
        public final Object a;

        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            this.a = obj;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    static {
        AtomicReferenceFieldUpdater.newUpdater(RealCall.class, EventListener.class, "e");
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [dac, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        request.getClass();
        this.a = okHttpClient;
        this.b = request;
        this.c = z;
        this.d = okHttpClient.C.a;
        okHttpClient.d.getClass();
        EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.a;
        TimeZone timeZone = _UtilJvmKt.a;
        this.e = eventListener$Companion$NONE$1;
        ?? r3 = new e30() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // defpackage.e30
            public final void l() {
                RealCall.this.d();
            }
        };
        r3.g(0L, TimeUnit.MILLISECONDS);
        this.f = r3;
        this.C = new AtomicBoolean();
        this.M = true;
        this.P = new CopyOnWriteArrayList();
        new AtomicReference(request.f);
    }

    public static final String a(RealCall realCall) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (realCall.N) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (realCall.c) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(realCall.b.a.g());
        return sb.toString();
    }

    @Override // okhttp3.Call
    public final void G(Callback callback) {
        if (this.C.compareAndSet(false, true)) {
            Platform platform = Platform.a;
            this.D = Platform.a.h();
            this.e.e(this);
            Dispatcher dispatcher = this.a.a;
            AsyncCall asyncCall = new AsyncCall(callback);
            dispatcher.getClass();
            Dispatcher.c(dispatcher, asyncCall, null, 6);
            return;
        }
        vs.k("Already Executed");
    }

    @Override // okhttp3.Call
    public final boolean Q() {
        return this.N;
    }

    public final void b(RealConnection realConnection) {
        realConnection.getClass();
        TimeZone timeZone = _UtilJvmKt.a;
        if (this.F == null) {
            this.F = realConnection;
            realConnection.L.add(new CallReference(this, this.D));
            return;
        }
        vs.k("Check failed.");
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket i;
        TimeZone timeZone = _UtilJvmKt.a;
        RealConnection realConnection = this.F;
        if (realConnection != null) {
            synchronized (realConnection) {
                i = i();
            }
            if (this.F == null) {
                if (i != null) {
                    _UtilJvmKt.c(i);
                }
                this.e.k(this, realConnection);
            } else if (i != null) {
                vs.k("Check failed.");
                return null;
            }
        }
        if (this.G || !j()) {
            iOException2 = iOException;
        } else {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        }
        EventListener eventListener = this.e;
        if (iOException != null) {
            iOException2.getClass();
            eventListener.d(this, iOException2);
            return iOException2;
        }
        eventListener.c(this);
        return iOException2;
    }

    public final Object clone() {
        return new RealCall(this.a, this.b, this.c);
    }

    public final void d() {
        if (this.N) {
            return;
        }
        this.N = true;
        Exchange exchange = this.O;
        if (exchange != null) {
            exchange.c.cancel();
        }
        Iterator it = this.P.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((RoutePlanner.Plan) it.next()).cancel();
        }
        this.e.f(this);
    }

    public final void e(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.M) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (exchange = this.O) != null) {
            exchange.c.cancel();
            exchange.a.g(exchange, true, true, true, true, null);
        }
        this.H = null;
    }

    public final Response f() {
        ArrayList arrayList = new ArrayList();
        xl1.P(arrayList, this.a.b);
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(ConnectInterceptor.a);
        if (!this.c) {
            xl1.P(arrayList, this.a.c);
        }
        arrayList.add(CallServerInterceptor.a);
        Request request = this.b;
        OkHttpClient okHttpClient = this.a;
        request.getClass();
        try {
            try {
                Response b = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.v, okHttpClient.w, okHttpClient.x, okHttpClient.g, okHttpClient.t, okHttpClient.C, okHttpClient.j, okHttpClient.k, okHttpClient.s, okHttpClient.m, okHttpClient.l, okHttpClient.e, okHttpClient.n, okHttpClient.o, okHttpClient.p, okHttpClient.u).b(this.b);
                if (!this.N) {
                    h(null);
                    return b;
                }
                _UtilCommonKt.b(b);
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException h = h(e);
                h.getClass();
                throw h;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                h(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException g(okhttp3.internal.connection.Exchange r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
        /*
            r3 = this;
            r4.getClass()
            okhttp3.internal.connection.Exchange r0 = r3.O
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ld
            goto L78
        Ld:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L19
            boolean r1 = r3.I     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
            goto L19
        L17:
            r4 = move-exception
            goto L59
        L19:
            if (r6 == 0) goto L1f
            boolean r1 = r3.J     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L1f:
            if (r8 == 0) goto L25
            boolean r1 = r3.K     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L25:
            if (r7 == 0) goto L5b
            boolean r1 = r3.L     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L5b
        L2b:
            if (r5 == 0) goto L2f
            r3.I = r0     // Catch: java.lang.Throwable -> L17
        L2f:
            if (r6 == 0) goto L33
            r3.J = r0     // Catch: java.lang.Throwable -> L17
        L33:
            if (r8 == 0) goto L37
            r3.K = r0     // Catch: java.lang.Throwable -> L17
        L37:
            if (r7 == 0) goto L3b
            r3.L = r0     // Catch: java.lang.Throwable -> L17
        L3b:
            boolean r5 = r3.I     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.J     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.K     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.L     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L55
            boolean r6 = r3.M     // Catch: java.lang.Throwable -> L17
            if (r6 != 0) goto L55
            r0 = r4
        L55:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L5c
        L59:
            monitor-exit(r3)
            throw r4
        L5b:
            r5 = r0
        L5c:
            monitor-exit(r3)
            if (r0 == 0) goto L71
            r6 = 0
            r3.O = r6
            okhttp3.internal.connection.RealConnection r6 = r3.F
            if (r6 == 0) goto L71
            monitor-enter(r6)
            int r7 = r6.I     // Catch: java.lang.Throwable -> L6e
            int r7 = r7 + r4
            r6.I = r7     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)
            goto L71
        L6e:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L71:
            if (r5 == 0) goto L78
            java.io.IOException r3 = r3.c(r9)
            return r3
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.g(okhttp3.internal.connection.Exchange, boolean, boolean, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.M) {
                this.M = false;
                if (!this.I && !this.J && !this.K) {
                    if (!this.L) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket i() {
        RealConnection realConnection = this.F;
        realConnection.getClass();
        TimeZone timeZone = _UtilJvmKt.a;
        ArrayList arrayList = realConnection.L;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (c16.i(((Reference) obj).get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.F = null;
            if (!arrayList.isEmpty()) {
                return null;
            }
            realConnection.M = System.nanoTime();
            RealConnectionPool realConnectionPool = this.d;
            ConcurrentLinkedQueue concurrentLinkedQueue = realConnectionPool.d;
            TaskQueue taskQueue = realConnectionPool.b;
            TimeZone timeZone2 = _UtilJvmKt.a;
            if (!realConnection.F) {
                taskQueue.d(realConnectionPool.c, 0L);
                return null;
            }
            realConnection.F = true;
            concurrentLinkedQueue.remove(realConnection);
            if (concurrentLinkedQueue.isEmpty()) {
                taskQueue.a();
            }
            return realConnection.e;
        }
        vs.k("Check failed.");
        return null;
    }
}
