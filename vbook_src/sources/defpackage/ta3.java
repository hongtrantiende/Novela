package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ta3  reason: default package */
/* loaded from: classes3.dex */
public final class ta3 extends wa3 implements o82, m42 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(ta3.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long E = u4f.a.objectFieldOffset(ta3.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public final Object C;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final f82 d;
    public final n42 e;
    public Object f;

    public ta3(f82 f82Var, n42 n42Var) {
        super(-1);
        this.d = f82Var;
        this.e = n42Var;
        this.f = ua3.a;
        this.C = a7c.b(n42Var.getContext());
    }

    @Override // defpackage.o82
    public final o82 getCallerFrame() {
        return this.e;
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.wa3
    public final Object i() {
        Object obj = this.f;
        this.f = ua3.a;
        return obj;
    }

    public final void j() {
        do {
            D.getClass();
        } while (u4f.a.getObjectVolatile(this, E) == ua3.b);
    }

    public final f61 k() {
        ta3 ta3Var;
        while (true) {
            D.getClass();
            Unsafe unsafe = u4f.a;
            long j = E;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            lie lieVar = ua3.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, lieVar);
                return null;
            }
            if (objectVolatile instanceof f61) {
                while (true) {
                    Unsafe unsafe2 = u4f.a;
                    ta3Var = this;
                    if (unsafe2.compareAndSwapObject(ta3Var, E, objectVolatile, lieVar)) {
                        return (f61) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(ta3Var, j) != objectVolatile) {
                        break;
                    }
                    this = ta3Var;
                }
            } else {
                ta3Var = this;
                if (objectVolatile != lieVar && !(objectVolatile instanceof Throwable)) {
                    xk5.p(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = ta3Var;
        }
    }

    public final f61 l() {
        D.getClass();
        Object objectVolatile = u4f.a.getObjectVolatile(this, E);
        if (objectVolatile instanceof f61) {
            return (f61) objectVolatile;
        }
        return null;
    }

    public final boolean o() {
        D.getClass();
        if (u4f.a.getObjectVolatile(this, E) != null) {
            return true;
        }
        return false;
    }

    public final boolean p(Throwable th) {
        ta3 ta3Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            D.getClass();
            Unsafe unsafe2 = u4f.a;
            long j = E;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            lie lieVar = ua3.b;
            if (c16.i(objectVolatile, lieVar)) {
                while (true) {
                    Unsafe unsafe3 = u4f.a;
                    ta3 ta3Var2 = this;
                    th2 = th;
                    ta3Var = ta3Var2;
                    if (!unsafe3.compareAndSwapObject(ta3Var2, E, lieVar, th2)) {
                        if (unsafe3.getObjectVolatile(ta3Var, j) != lieVar) {
                            break;
                        }
                        this = ta3Var;
                        th = th2;
                    } else {
                        return true;
                    }
                }
            } else {
                ta3Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = u4f.a;
                    if (unsafe.compareAndSwapObject(ta3Var, E, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(ta3Var, j) == objectVolatile);
            }
            this = ta3Var;
            th = th2;
        }
    }

    public final Throwable q(f61 f61Var) {
        Unsafe unsafe;
        ta3 ta3Var;
        f61 f61Var2;
        while (true) {
            D.getClass();
            Unsafe unsafe2 = u4f.a;
            long j = E;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            lie lieVar = ua3.b;
            if (objectVolatile != lieVar) {
                ta3 ta3Var2 = this;
                if (objectVolatile instanceof Throwable) {
                    do {
                        unsafe = u4f.a;
                        if (unsafe.compareAndSwapObject(ta3Var2, E, objectVolatile, (Object) null)) {
                            return (Throwable) objectVolatile;
                        }
                    } while (unsafe.getObjectVolatile(ta3Var2, j) == objectVolatile);
                    vs.m("Failed requirement.");
                    return null;
                }
                xk5.p(objectVolatile, "Inconsistent state ");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = u4f.a;
                ta3Var = this;
                f61Var2 = f61Var;
                if (unsafe3.compareAndSwapObject(ta3Var, E, lieVar, f61Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(ta3Var, j) != lieVar) {
                    break;
                }
                this = ta3Var;
                f61Var = f61Var2;
            }
            this = ta3Var;
            f61Var = f61Var2;
        }
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        Object ft1Var;
        Throwable a = hs9.a(obj);
        if (a == null) {
            ft1Var = obj;
        } else {
            ft1Var = new ft1(a, false);
        }
        n42 n42Var = this.e;
        d82 context = n42Var.getContext();
        f82 f82Var = this.d;
        if (ua3.c(f82Var, context)) {
            this.f = ft1Var;
            this.c = 0;
            ua3.b(f82Var, n42Var.getContext(), this);
            return;
        }
        lx3 a2 = c7c.a();
        if (a2.c >= 4294967296L) {
            this.f = ft1Var;
            this.c = 0;
            a2.I0(this);
            return;
        }
        a2.V0(true);
        try {
            d82 context2 = n42Var.getContext();
            Object c = a7c.c(context2, this.C);
            n42Var.resumeWith(obj);
            a7c.a(context2, c);
            do {
            } while (a2.k1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + nq2.D(this.e) + ']';
    }

    @Override // defpackage.wa3
    public final m42 d() {
        return this;
    }
}
