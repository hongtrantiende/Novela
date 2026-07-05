package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rr6  reason: default package */
/* loaded from: classes.dex */
public final class rr6 {
    public final Thread a;
    public final ggb b;
    public final pr6 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public rr6(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, xfb xfbVar, pr6 pr6Var, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = pr6Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper != null && xfbVar != null && pr6Var != null) {
            this.b = xfbVar.a(looper, new nr6(this, 0));
        } else {
            this.b = null;
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new qr6(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        boolean z;
        if (this.i) {
            if (Thread.currentThread() == this.a) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
        }
        ArrayDeque arrayDeque = this.f;
        if (!arrayDeque.isEmpty()) {
            if (this.c != null) {
                ggb ggbVar = this.b;
                ggbVar.getClass();
                Handler handler = ggbVar.a;
                if (!handler.hasMessages(1)) {
                    fgb a = ggbVar.a(1);
                    Message message = a.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a.a();
                }
            }
            ArrayDeque arrayDeque2 = this.e;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (isEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void c(int i, or6 or6Var) {
        boolean z;
        if (this.i) {
            if (Thread.currentThread() == this.a) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
        }
        this.f.add(new yt1(new CopyOnWriteArraySet(this.d), i, or6Var, 3));
    }

    public final void d() {
        boolean z;
        if (this.i) {
            if (Thread.currentThread() == this.a) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
        }
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            qr6 qr6Var = (qr6) it.next();
            pr6 pr6Var = this.c;
            qr6Var.d = true;
            if (pr6Var != null && qr6Var.c) {
                qr6Var.c = false;
                pr6Var.b(qr6Var.a, qr6Var.b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i, or6 or6Var) {
        c(i, or6Var);
        b();
    }

    public rr6(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
