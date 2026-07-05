package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f61  reason: default package */
/* loaded from: classes3.dex */
public class f61 extends wa3 implements e61, o82, zed {
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    public static final /* synthetic */ long E;
    public static final /* synthetic */ long F;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final m42 d;
    public final d82 e;
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(f61.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(f61.class, Object.class, "_state$volatile");

    static {
        Unsafe unsafe = u4f.a;
        F = unsafe.objectFieldOffset(f61.class.getDeclaredField("_state$volatile"));
        D = AtomicReferenceFieldUpdater.newUpdater(f61.class, Object.class, "_parentHandle$volatile");
        E = unsafe.objectFieldOffset(f61.class.getDeclaredField("_parentHandle$volatile"));
    }

    public f61(int i, m42 m42Var) {
        super(i);
        this.d = m42Var;
        this.e = m42Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = t5.a;
    }

    public static Object F(f48 f48Var, Object obj, int i, mu4 mu4Var) {
        a61 a61Var;
        if (obj instanceof ft1) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (mu4Var == null && !(f48Var instanceof a61)) {
            return obj;
        }
        if (f48Var instanceof a61) {
            a61Var = (a61) f48Var;
        } else {
            a61Var = null;
        }
        return new dt1(obj, a61Var, mu4Var, (Throwable) null, 16);
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        ta3 ta3Var;
        Throwable q;
        m42 m42Var = this.d;
        if (m42Var instanceof ta3) {
            ta3Var = (ta3) m42Var;
        } else {
            ta3Var = null;
        }
        if (ta3Var != null && (q = ta3Var.q(this)) != null) {
            o();
            a(q);
        }
    }

    public final boolean C() {
        C.getClass();
        Unsafe unsafe = u4f.a;
        long j = F;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof dt1) && ((dt1) objectVolatile).d != null) {
            o();
            return false;
        }
        f.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, t5.a);
        return true;
    }

    public final void D(Object obj, int i, mu4 mu4Var) {
        f61 f61Var;
        while (true) {
            C.getClass();
            Unsafe unsafe = u4f.a;
            long j = F;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof f48) {
                Object F2 = F((f48) objectVolatile, obj, i, mu4Var);
                while (true) {
                    Unsafe unsafe2 = u4f.a;
                    f61Var = this;
                    if (unsafe2.compareAndSwapObject(f61Var, F, objectVolatile, F2)) {
                        if (!f61Var.y()) {
                            f61Var.o();
                        }
                        f61Var.p(i);
                        return;
                    } else if (unsafe2.getObjectVolatile(f61Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = f61Var;
                    }
                }
            } else {
                f61 f61Var2 = this;
                if (objectVolatile instanceof i61) {
                    i61 i61Var = (i61) objectVolatile;
                    if (i61.c.compareAndSet(i61Var, 0, 1)) {
                        if (mu4Var != null) {
                            f61Var2.k(mu4Var, i61Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                xk5.p(obj, "Already resumed, but proposed with update ");
                return;
            }
            this = f61Var;
        }
    }

    public final void E(f82 f82Var) {
        ta3 ta3Var;
        f82 f82Var2;
        int i;
        m42 m42Var = this.d;
        if (m42Var instanceof ta3) {
            ta3Var = (ta3) m42Var;
        } else {
            ta3Var = null;
        }
        if (ta3Var != null) {
            f82Var2 = ta3Var.d;
        } else {
            f82Var2 = null;
        }
        if (f82Var2 == f82Var) {
            i = 4;
        } else {
            i = this.c;
        }
        D(pvc.a, i, null);
    }

    public final lie G(Object obj, mu4 mu4Var) {
        f61 f61Var;
        while (true) {
            C.getClass();
            Unsafe unsafe = u4f.a;
            long j = F;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof f48) {
                Object F2 = F((f48) objectVolatile, obj, this.c, mu4Var);
                while (true) {
                    Unsafe unsafe2 = u4f.a;
                    f61Var = this;
                    if (unsafe2.compareAndSwapObject(f61Var, F, objectVolatile, F2)) {
                        boolean y = f61Var.y();
                        lie lieVar = g61.a;
                        if (!y) {
                            f61Var.o();
                        }
                        return lieVar;
                    } else if (unsafe2.getObjectVolatile(f61Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = f61Var;
                    }
                }
            } else {
                return null;
            }
            this = f61Var;
        }
    }

    @Override // defpackage.e61
    public final boolean a(Throwable th) {
        Throwable th2;
        f61 f61Var;
        while (true) {
            C.getClass();
            Unsafe unsafe = u4f.a;
            long j = F;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            boolean z = false;
            if (!(objectVolatile instanceof f48)) {
                return false;
            }
            if ((objectVolatile instanceof a61) || (objectVolatile instanceof f5a)) {
                z = true;
            }
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            ft1 ft1Var = new ft1(th2, z);
            while (true) {
                Unsafe unsafe2 = u4f.a;
                f61Var = this;
                if (unsafe2.compareAndSwapObject(f61Var, F, objectVolatile, ft1Var)) {
                    f48 f48Var = (f48) objectVolatile;
                    if (f48Var instanceof a61) {
                        f61Var.j((a61) objectVolatile, th);
                    } else if (f48Var instanceof f5a) {
                        f61Var.l((f5a) objectVolatile, th);
                    }
                    if (!f61Var.y()) {
                        f61Var.o();
                    }
                    f61Var.p(f61Var.c);
                    return true;
                } else if (unsafe2.getObjectVolatile(f61Var, j) != objectVolatile) {
                    break;
                } else {
                    this = f61Var;
                }
            }
            this = f61Var;
        }
    }

    @Override // defpackage.zed
    public final void b(f5a f5aVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                vs.k("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        x(f5aVar);
    }

    @Override // defpackage.wa3
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        f61 f61Var;
        while (true) {
            C.getClass();
            Unsafe unsafe = u4f.a;
            long j = F;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof f48)) {
                if (!(objectVolatile instanceof ft1)) {
                    if (objectVolatile instanceof dt1) {
                        dt1 dt1Var = (dt1) objectVolatile;
                        if (dt1Var.e == null) {
                            dt1 a = dt1.a(dt1Var, null, cancellationException, 15);
                            while (true) {
                                Unsafe unsafe2 = u4f.a;
                                f61 f61Var2 = this;
                                if (unsafe2.compareAndSwapObject(f61Var2, F, objectVolatile, a)) {
                                    a61 a61Var = dt1Var.b;
                                    if (a61Var != null) {
                                        f61Var2.j(a61Var, cancellationException);
                                    }
                                    mu4 mu4Var = dt1Var.c;
                                    if (mu4Var != null) {
                                        f61Var2.k(mu4Var, cancellationException, dt1Var.a);
                                        return;
                                    }
                                    return;
                                } else if (unsafe2.getObjectVolatile(f61Var2, j) != objectVolatile) {
                                    cancellationException2 = cancellationException;
                                    f61Var = f61Var2;
                                    break;
                                } else {
                                    this = f61Var2;
                                }
                            }
                        } else {
                            vs.k("Must be called at most once");
                            return;
                        }
                    } else {
                        f61 f61Var3 = this;
                        CancellationException cancellationException3 = cancellationException;
                        dt1 dt1Var2 = new dt1(objectVolatile, (a61) null, (mu4) null, cancellationException3, 14);
                        cancellationException2 = cancellationException3;
                        while (true) {
                            dt1 dt1Var3 = dt1Var2;
                            Unsafe unsafe3 = u4f.a;
                            f61Var = f61Var3;
                            boolean compareAndSwapObject = unsafe3.compareAndSwapObject(f61Var, F, objectVolatile, dt1Var3);
                            dt1Var2 = dt1Var3;
                            if (compareAndSwapObject) {
                                return;
                            }
                            if (unsafe3.getObjectVolatile(f61Var, j) != objectVolatile) {
                                break;
                            }
                            f61Var3 = f61Var;
                        }
                    }
                    cancellationException = cancellationException2;
                    this = f61Var;
                } else {
                    return;
                }
            } else {
                vs.k("Not completed");
                return;
            }
        }
    }

    @Override // defpackage.wa3
    public final m42 d() {
        return this.d;
    }

    @Override // defpackage.wa3
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // defpackage.wa3
    public final Object f(Object obj) {
        if (obj instanceof dt1) {
            return ((dt1) obj).a;
        }
        return obj;
    }

    @Override // defpackage.e61
    public final lie g(Object obj, mu4 mu4Var) {
        return G(obj, mu4Var);
    }

    @Override // defpackage.o82
    public final o82 getCallerFrame() {
        m42 m42Var = this.d;
        if (m42Var instanceof o82) {
            return (o82) m42Var;
        }
        return null;
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return this.e;
    }

    @Override // defpackage.wa3
    public final Object i() {
        return t();
    }

    public final void j(a61 a61Var, Throwable th) {
        try {
            a61Var.a(th);
        } catch (Throwable th2) {
            c16.p(this.e, new gt1(0, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(mu4 mu4Var, Throwable th, Object obj) {
        d82 d82Var = this.e;
        try {
            mu4Var.c(th, obj, d82Var);
        } catch (Throwable th2) {
            c16.p(d82Var, new gt1(0, "Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(f5a f5aVar, Throwable th) {
        d82 d82Var = this.e;
        int i = f.get(this) & 536870911;
        if (i != 536870911) {
            try {
                f5aVar.m(i, d82Var);
                return;
            } catch (Throwable th2) {
                c16.p(d82Var, new gt1(0, "Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        vs.k("The index for Segment.onCancellation(..) is broken");
    }

    @Override // defpackage.e61
    public final void m(Object obj, mu4 mu4Var) {
        D(obj, this.c, mu4Var);
    }

    @Override // defpackage.e61
    public final void n(Object obj) {
        p(this.c);
    }

    public final void o() {
        kb3 r = r();
        if (r == null) {
            return;
        }
        r.a();
        D.getClass();
        u4f.a.putObjectVolatile(this, E, w38.a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean z;
        boolean z2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z3 = false;
                    if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m42 m42Var = this.d;
                    if (!z && (m42Var instanceof ta3)) {
                        if (i != 1 && i != 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i4 = this.c;
                        if (i4 == 1 || i4 == 2) {
                            z3 = true;
                        }
                        if (z2 == z3) {
                            ta3 ta3Var = (ta3) m42Var;
                            f82 f82Var = ta3Var.d;
                            d82 context = ta3Var.e.getContext();
                            if (ua3.c(f82Var, context)) {
                                ua3.b(f82Var, context, this);
                                return;
                            }
                            lx3 a = c7c.a();
                            if (a.c >= 4294967296L) {
                                a.I0(this);
                                return;
                            }
                            a.V0(true);
                            try {
                                nqe.z(this, m42Var, true);
                                do {
                                } while (a.k1());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    nqe.z(this, m42Var, z);
                    return;
                }
                vs.k("Already resumed");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(l36 l36Var) {
        return l36Var.getCancellationException();
    }

    public final kb3 r() {
        D.getClass();
        return (kb3) u4f.a.getObjectVolatile(this, E);
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        Throwable a = hs9.a(obj);
        if (a != null) {
            obj = new ft1(a, false);
        }
        D(obj, this.c, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        w26 w26Var;
        boolean y = y();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (y) {
                        B();
                    }
                    Object t = t();
                    if (!(t instanceof ft1)) {
                        int i3 = this.c;
                        if ((i3 == 1 || i3 == 2) && (w26Var = (w26) this.e.get(r0f.I)) != null && !w26Var.isActive()) {
                            CancellationException cancellationException = w26Var.getCancellationException();
                            c(cancellationException);
                            throw cancellationException;
                        }
                        return f(t);
                    }
                    throw ((ft1) t).a;
                }
                vs.k("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (r() == null) {
            v();
        }
        if (y) {
            B();
        }
        return n82.a;
    }

    public final Object t() {
        C.getClass();
        return u4f.a.getObjectVolatile(this, F);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(nq2.D(this.d));
        sb.append("){");
        Object t = t();
        if (t instanceof f48) {
            str = "Active";
        } else if (t instanceof i61) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(nq2.y(this));
        return sb.toString();
    }

    public final void u() {
        kb3 v = v();
        if (v != null && !(t() instanceof f48)) {
            v.a();
            D.getClass();
            u4f.a.putObjectVolatile(this, E, w38.a);
        }
    }

    public final kb3 v() {
        w26 w26Var = (w26) this.e.get(r0f.I);
        if (w26Var == null) {
            return null;
        }
        kb3 t = k27.t(w26Var, true, new wg1(this));
        while (true) {
            D.getClass();
            Unsafe unsafe = u4f.a;
            long j = E;
            f61 f61Var = this;
            if (!unsafe.compareAndSwapObject(f61Var, j, (Object) null, t) && unsafe.getObjectVolatile(f61Var, j) == null) {
                this = f61Var;
            }
        }
        return t;
    }

    public final void w(xt4 xt4Var) {
        x(new z51(xt4Var, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
        z(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.f48 r11) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f61.x(f48):void");
    }

    public final boolean y() {
        if (this.c == 2 && ((ta3) this.d).o()) {
            return true;
        }
        return false;
    }
}
