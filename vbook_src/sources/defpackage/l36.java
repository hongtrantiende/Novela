package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l36  reason: default package */
/* loaded from: classes3.dex */
public class l36 implements w26, ah1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(l36.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = u4f.a;
        d = unsafe.objectFieldOffset(l36.class.getDeclaredField("_state$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(l36.class, Object.class, "_parentHandle$volatile");
        c = unsafe.objectFieldOffset(l36.class.getDeclaredField("_parentHandle$volatile"));
    }

    public l36(boolean z) {
        bs3 bs3Var;
        if (z) {
            bs3Var = m36.g;
        } else {
            bs3Var = m36.f;
        }
        this._state$volatile = bs3Var;
    }

    public static yg1 U(tv6 tv6Var) {
        while (tv6Var.m()) {
            tv6Var = tv6Var.l();
        }
        while (true) {
            tv6Var = tv6Var.k();
            if (!tv6Var.m()) {
                if (tv6Var instanceof yg1) {
                    return (yg1) tv6Var;
                }
                if (tv6Var instanceof p38) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj) {
        if (obj instanceof f36) {
            f36 f36Var = (f36) obj;
            if (f36Var.e()) {
                return "Cancelling";
            }
            if (f36.b.get(f36Var) != 1) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof gt5) {
            if (((gt5) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof ft1) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public static CancellationException f0(l36 l36Var, Throwable th) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            return new x26(l36Var, l36Var.v(), th);
        }
        return cancellationException;
    }

    public final Object A() {
        Object I = I();
        if (!(I instanceof gt5)) {
            if (!(I instanceof ft1)) {
                return m36.a(I);
            }
            throw ((ft1) I).a;
        }
        vs.k("This job has not completed yet");
        return null;
    }

    public final Throwable B(f36 f36Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!f36Var.e()) {
                return null;
            }
            return new x26(this, v(), null);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof eac) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof eac)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean D() {
        return true;
    }

    public boolean E() {
        return this instanceof bt1;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [p38, tv6] */
    public final p38 F(gt5 gt5Var) {
        p38 c2 = gt5Var.c();
        if (c2 == null) {
            if (gt5Var instanceof bs3) {
                return new tv6();
            }
            if (gt5Var instanceof b36) {
                a0((b36) gt5Var);
                return null;
            }
            xk5.p(gt5Var, "State should have list: ");
            return null;
        }
        return c2;
    }

    public final xg1 H() {
        b.getClass();
        return (xg1) u4f.a.getObjectVolatile(this, c);
    }

    public final Object I() {
        a.getClass();
        return u4f.a.getObjectVolatile(this, d);
    }

    public boolean J(Throwable th) {
        return false;
    }

    public final void L(w26 w26Var) {
        w38 w38Var = w38.a;
        if (w26Var == null) {
            c0(w38Var);
            return;
        }
        w26Var.start();
        xg1 attachChild = w26Var.attachChild(this);
        c0(attachChild);
        if (N()) {
            attachChild.a();
            c0(w38Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kb3 M(boolean r7, defpackage.b36 r8) {
        /*
            r6 = this;
            r8.C = r6
        L2:
            java.lang.Object r4 = r6.I()
            boolean r0 = r4 instanceof defpackage.bs3
            if (r0 == 0) goto L33
            r0 = r4
            bs3 r0 = (defpackage.bs3) r0
            boolean r1 = r0.a
            if (r1 == 0) goto L2d
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.l36.a
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r2 = defpackage.l36.d
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L23
            goto L74
        L23:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2a
            goto L75
        L2a:
            r6 = r1
            r8 = r5
            goto L11
        L2d:
            r1 = r6
            r5 = r8
            r1.Z(r0)
            goto L75
        L33:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof defpackage.gt5
            w38 r8 = defpackage.w38.a
            r0 = 0
            if (r6 == 0) goto L78
            r6 = r4
            gt5 r6 = (defpackage.gt5) r6
            p38 r2 = r6.c()
            if (r2 != 0) goto L4b
            b36 r4 = (defpackage.b36) r4
            r1.a0(r4)
            goto L75
        L4b:
            boolean r3 = r5.q()
            if (r3 == 0) goto L6d
            boolean r3 = r6 instanceof defpackage.f36
            if (r3 == 0) goto L58
            f36 r6 = (defpackage.f36) r6
            goto L59
        L58:
            r6 = r0
        L59:
            if (r6 == 0) goto L5f
            java.lang.Throwable r0 = r6.d()
        L5f:
            if (r0 != 0) goto L67
            r6 = 5
            boolean r6 = r2.d(r5, r6)
            goto L72
        L67:
            if (r7 == 0) goto L8d
            r5.r(r0)
            return r8
        L6d:
            r6 = 1
            boolean r6 = r2.d(r5, r6)
        L72:
            if (r6 == 0) goto L75
        L74:
            return r5
        L75:
            r6 = r1
            r8 = r5
            goto L2
        L78:
            if (r7 == 0) goto L8d
            java.lang.Object r6 = r1.I()
            boolean r7 = r6 instanceof defpackage.ft1
            if (r7 == 0) goto L85
            ft1 r6 = (defpackage.ft1) r6
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8a
            java.lang.Throwable r0 = r6.a
        L8a:
            r5.r(r0)
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l36.M(boolean, b36):kb3");
    }

    public final boolean N() {
        return !(I() instanceof gt5);
    }

    public boolean O() {
        return this instanceof jn0;
    }

    public final boolean P(Object obj) {
        Object k0;
        do {
            k0 = k0(I(), obj);
            if (k0 == m36.a) {
                return false;
            }
            if (k0 == m36.b) {
                return true;
            }
        } while (k0 == m36.c);
        l(k0);
        return true;
    }

    public final Object R(Object obj) {
        Object k0;
        ft1 ft1Var;
        do {
            k0 = k0(I(), obj);
            if (k0 == m36.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof ft1) {
                    ft1Var = (ft1) obj;
                } else {
                    ft1Var = null;
                }
                if (ft1Var != null) {
                    th = ft1Var.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (k0 == m36.c);
        return k0;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    public final void W(p38 p38Var, Throwable th) {
        p38Var.d(new lq6(4), 4);
        Object j = p38Var.j();
        j.getClass();
        gt1 gt1Var = null;
        for (tv6 tv6Var = (tv6) j; !tv6Var.equals(p38Var); tv6Var = tv6Var.k()) {
            if ((tv6Var instanceof b36) && ((b36) tv6Var).q()) {
                try {
                    ((b36) tv6Var).r(th);
                } catch (Throwable th2) {
                    if (gt1Var != null) {
                        pye.e(gt1Var, th2);
                    } else {
                        gt1Var = new gt1(0, "Exception in completion handler " + tv6Var + " for " + this, th2);
                    }
                }
            }
        }
        if (gt1Var != null) {
            K(gt1Var);
        }
        u(th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p38, tv6] */
    public final void Z(bs3 bs3Var) {
        ft5 ft5Var;
        ?? tv6Var = new tv6();
        if (bs3Var.a) {
            ft5Var = tv6Var;
        } else {
            ft5Var = new ft5(tv6Var);
        }
        while (true) {
            a.getClass();
            Unsafe unsafe = u4f.a;
            long j = d;
            l36 l36Var = this;
            bs3 bs3Var2 = bs3Var;
            if (unsafe.compareAndSwapObject(l36Var, j, bs3Var2, ft5Var) || unsafe.getObjectVolatile(l36Var, j) != bs3Var2) {
                return;
            }
            this = l36Var;
            bs3Var = bs3Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p38, tv6] */
    public final void a0(b36 b36Var) {
        b36Var.f(new tv6());
        tv6 k = b36Var.k();
        Object obj = b36Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = u4f.a;
            long j = d;
            l36 l36Var = this;
            Object obj2 = obj;
            if (unsafe.compareAndSwapObject(l36Var, j, obj2, k) || unsafe.getObjectVolatile(l36Var, j) != obj2) {
                return;
            }
            this = l36Var;
            obj = obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        return r5;
     */
    @Override // defpackage.w26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xg1 attachChild(defpackage.ah1 r7) {
        /*
            r6 = this;
            yg1 r5 = new yg1
            r5.<init>(r7)
            r5.C = r6
        L7:
            java.lang.Object r4 = r6.I()
            boolean r7 = r4 instanceof defpackage.bs3
            if (r7 == 0) goto L35
            r7 = r4
            bs3 r7 = (defpackage.bs3) r7
            boolean r0 = r7.a
            if (r0 == 0) goto L30
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.l36.a
            r7.getClass()
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r2 = defpackage.l36.d
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L27
            goto L7a
        L27:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2e
            goto L4b
        L2e:
            r6 = r1
            goto L16
        L30:
            r1 = r6
            r1.Z(r7)
            goto L4b
        L35:
            r1 = r6
            boolean r6 = r4 instanceof defpackage.gt5
            w38 r7 = defpackage.w38.a
            r0 = 0
            if (r6 == 0) goto L7c
            r6 = r4
            gt5 r6 = (defpackage.gt5) r6
            p38 r6 = r6.c()
            if (r6 != 0) goto L4d
            b36 r4 = (defpackage.b36) r4
            r1.a0(r4)
        L4b:
            r6 = r1
            goto L7
        L4d:
            r2 = 7
            boolean r2 = r6.d(r5, r2)
            if (r2 == 0) goto L55
            goto L7a
        L55:
            r2 = 3
            boolean r6 = r6.d(r5, r2)
            java.lang.Object r1 = r1.I()
            boolean r2 = r1 instanceof defpackage.f36
            if (r2 == 0) goto L69
            f36 r1 = (defpackage.f36) r1
            java.lang.Throwable r0 = r1.d()
            goto L75
        L69:
            boolean r2 = r1 instanceof defpackage.ft1
            if (r2 == 0) goto L70
            ft1 r1 = (defpackage.ft1) r1
            goto L71
        L70:
            r1 = r0
        L71:
            if (r1 == 0) goto L75
            java.lang.Throwable r0 = r1.a
        L75:
            r5.r(r0)
            if (r6 == 0) goto L7b
        L7a:
            return r5
        L7b:
            return r7
        L7c:
            java.lang.Object r6 = r1.I()
            boolean r1 = r6 instanceof defpackage.ft1
            if (r1 == 0) goto L87
            ft1 r6 = (defpackage.ft1) r6
            goto L88
        L87:
            r6 = r0
        L88:
            if (r6 == 0) goto L8c
            java.lang.Throwable r0 = r6.a
        L8c:
            r5.r(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l36.attachChild(ah1):xg1");
    }

    public Object await(m42 m42Var) {
        return r(m42Var);
    }

    public final void b0(b36 b36Var) {
        l36 l36Var;
        while (true) {
            Object I = this.I();
            if (I instanceof b36) {
                if (I != b36Var) {
                    return;
                }
                while (true) {
                    a.getClass();
                    Unsafe unsafe = u4f.a;
                    long j = d;
                    l36Var = this;
                    if (!unsafe.compareAndSwapObject(l36Var, j, I, m36.g)) {
                        if (unsafe.getObjectVolatile(l36Var, j) != I) {
                            break;
                        }
                        this = l36Var;
                    } else {
                        return;
                    }
                }
            } else if ((I instanceof gt5) && ((gt5) I).c() != null) {
                b36Var.n();
                return;
            } else {
                return;
            }
            this = l36Var;
        }
    }

    public final void c0(xg1 xg1Var) {
        b.getClass();
        u4f.a.putObjectVolatile(this, c, xg1Var);
    }

    @Override // defpackage.w26
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new x26(this, v(), null);
        }
        t(cancellationException);
    }

    public final int d0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof bs3;
        long j = d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((bs3) obj).a) {
                return 0;
            }
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe2 = u4f.a;
                l36 l36Var = this;
                Object obj2 = obj;
                if (unsafe2.compareAndSwapObject(l36Var, d, obj2, m36.g)) {
                    l36Var.Y();
                    return 1;
                } else if (unsafe2.getObjectVolatile(l36Var, j) == obj2) {
                    this = l36Var;
                    obj = obj2;
                } else {
                    return -1;
                }
            }
        } else {
            l36 l36Var2 = this;
            Object obj3 = obj;
            if (obj3 instanceof ft5) {
                p38 p38Var = ((ft5) obj3).a;
                do {
                    atomicReferenceFieldUpdater.getClass();
                    l36 l36Var3 = l36Var2;
                    unsafe = u4f.a;
                    Object obj4 = obj3;
                    boolean compareAndSwapObject = unsafe.compareAndSwapObject(l36Var3, d, obj4, p38Var);
                    l36Var2 = l36Var3;
                    obj3 = obj4;
                    if (compareAndSwapObject) {
                        l36Var2.Y();
                        return 1;
                    }
                } while (unsafe.getObjectVolatile(l36Var2, j) == obj3);
                return -1;
            }
            return 0;
        }
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(obj, this);
    }

    @Override // defpackage.d82
    public final b82 get(c82 c82Var) {
        return nq2.x(this, c82Var);
    }

    @Override // defpackage.w26
    public final CancellationException getCancellationException() {
        Object I = I();
        CancellationException cancellationException = null;
        if (I instanceof f36) {
            Throwable d2 = ((f36) I).d();
            if (d2 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (d2 instanceof CancellationException) {
                    cancellationException = (CancellationException) d2;
                }
                if (cancellationException == null) {
                    return new x26(this, concat, d2);
                }
                return cancellationException;
            }
            xk5.p(this, "Job is still new or active: ");
            return null;
        } else if (!(I instanceof gt5)) {
            if (I instanceof ft1) {
                return f0(this, ((ft1) I).a);
            }
            return new x26(this, getClass().getSimpleName().concat(" has completed normally"), null);
        } else {
            xk5.p(this, "Job is still new or active: ");
            return null;
        }
    }

    @Override // defpackage.w26
    public final b9a getChildren() {
        return new c00(new p45(this, null, 1), 2);
    }

    public Object getCompleted() {
        return A();
    }

    public final Throwable getCompletionExceptionOrNull() {
        ft1 ft1Var;
        Object I = I();
        if (!(I instanceof gt5)) {
            if (I instanceof ft1) {
                ft1Var = (ft1) I;
            } else {
                ft1Var = null;
            }
            if (ft1Var == null) {
                return null;
            }
            return ft1Var.a;
        }
        vs.k("This job has not completed yet");
        return null;
    }

    @Override // defpackage.b82
    public final c82 getKey() {
        return r0f.I;
    }

    public final boolean h0(gt5 gt5Var, Object obj) {
        kt5 kt5Var;
        if (obj instanceof gt5) {
            kt5Var = new kt5((gt5) obj);
        } else {
            kt5Var = obj;
        }
        while (true) {
            a.getClass();
            Unsafe unsafe = u4f.a;
            long j = d;
            l36 l36Var = this;
            gt5 gt5Var2 = gt5Var;
            if (unsafe.compareAndSwapObject(l36Var, j, gt5Var2, kt5Var)) {
                l36Var.X(obj);
                l36Var.x(gt5Var2, obj);
                return true;
            } else if (unsafe.getObjectVolatile(l36Var, j) != gt5Var2) {
                return false;
            } else {
                this = l36Var;
                gt5Var = gt5Var2;
            }
        }
    }

    public final boolean i0(gt5 gt5Var, Throwable th) {
        p38 F = F(gt5Var);
        if (F != null) {
            f36 f36Var = new f36(F, th);
            while (true) {
                a.getClass();
                Unsafe unsafe = u4f.a;
                long j = d;
                l36 l36Var = this;
                gt5 gt5Var2 = gt5Var;
                if (unsafe.compareAndSwapObject(l36Var, j, gt5Var2, f36Var)) {
                    l36Var.W(F, th);
                    return true;
                } else if (unsafe.getObjectVolatile(l36Var, j) != gt5Var2) {
                    return false;
                } else {
                    this = l36Var;
                    gt5Var = gt5Var2;
                }
            }
        } else {
            return false;
        }
    }

    @Override // defpackage.w26
    public final kb3 invokeOnCompletion(boolean z, boolean z2, xt4 xt4Var) {
        b36 z16Var;
        if (z) {
            z16Var = new y16(xt4Var);
        } else {
            z16Var = new z16(xt4Var);
        }
        return M(z2, z16Var);
    }

    @Override // defpackage.w26
    public boolean isActive() {
        Object I = I();
        if ((I instanceof gt5) && ((gt5) I).isActive()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w26
    public final boolean isCancelled() {
        Object I = I();
        if (!(I instanceof ft1)) {
            if (!(I instanceof f36) || !((f36) I).e()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.w26
    public final Object join(m42 m42Var) {
        Object I;
        pvc pvcVar;
        do {
            I = I();
            boolean z = I instanceof gt5;
            pvcVar = pvc.a;
            if (!z) {
                k27.q(m42Var.getContext());
                return pvcVar;
            }
        } while (d0(I) < 0);
        f61 f61Var = new f61(1, w92.t(m42Var));
        f61Var.u();
        f61Var.x(new z51(k27.t(this, true, new ns9(f61Var)), 2));
        Object s = f61Var.s();
        n82 n82Var = n82.a;
        if (s != n82Var) {
            s = pvcVar;
        }
        if (s == n82Var) {
            return s;
        }
        return pvcVar;
    }

    public final Object k0(Object obj, Object obj2) {
        f36 f36Var;
        boolean z;
        ft1 ft1Var;
        if (!(obj instanceof gt5)) {
            return m36.a;
        }
        if (((obj instanceof bs3) || (obj instanceof b36)) && !(obj instanceof yg1) && !(obj2 instanceof ft1)) {
            if (h0((gt5) obj, obj2)) {
                return obj2;
            }
            return m36.c;
        }
        gt5 gt5Var = (gt5) obj;
        p38 F = F(gt5Var);
        if (F == null) {
            return m36.c;
        }
        Throwable th = null;
        if (gt5Var instanceof f36) {
            f36Var = (f36) gt5Var;
        } else {
            f36Var = null;
        }
        if (f36Var == null) {
            f36Var = new f36(F, null);
        }
        synchronized (f36Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36.b;
            if (atomicIntegerFieldUpdater.get(f36Var) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return m36.a;
            }
            atomicIntegerFieldUpdater.set(f36Var, 1);
            if (f36Var != gt5Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, gt5Var, f36Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != gt5Var) {
                        return m36.c;
                    }
                }
            }
            boolean e = f36Var.e();
            if (obj2 instanceof ft1) {
                ft1Var = (ft1) obj2;
            } else {
                ft1Var = null;
            }
            if (ft1Var != null) {
                f36Var.a(ft1Var.a);
            }
            Throwable d2 = f36Var.d();
            if (!e) {
                th = d2;
            }
            if (th != null) {
                W(F, th);
            }
            yg1 U = U(F);
            if (U != null && l0(f36Var, U, obj2)) {
                return m36.b;
            }
            F.d(new lq6(2), 2);
            yg1 U2 = U(F);
            if (U2 != null && l0(f36Var, U2, obj2)) {
                return m36.b;
            }
            return z(f36Var, obj2);
        }
    }

    public final boolean l0(f36 f36Var, yg1 yg1Var, Object obj) {
        while (k27.t(yg1Var.D, false, new e36(this, f36Var, yg1Var, obj)) == w38.a) {
            yg1Var = U(yg1Var);
            if (yg1Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        return nq2.B(this, c82Var);
    }

    public void p(Object obj) {
        l(obj);
    }

    @Override // defpackage.d82
    public final d82 plus(d82 d82Var) {
        return nq2.C(this, d82Var);
    }

    public final Object r(m42 m42Var) {
        Object I;
        do {
            I = I();
            if (!(I instanceof gt5)) {
                if (!(I instanceof ft1)) {
                    return m36.a(I);
                }
                throw ((ft1) I).a;
            }
        } while (d0(I) < 0);
        d36 d36Var = new d36(w92.t(m42Var), this);
        d36Var.u();
        d36Var.x(new z51(k27.t(this, true, new ms9(d36Var)), 2));
        return d36Var.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 == defpackage.m36.b) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l36.s(java.lang.Object):boolean");
    }

    @Override // defpackage.w26
    public final boolean start() {
        int d0;
        do {
            d0 = d0(I());
            if (d0 == 0) {
                return false;
            }
        } while (d0 != 1);
        return true;
    }

    public void t(Throwable th) {
        s(th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(T() + '{' + e0(I()) + '}');
        sb.append('@');
        sb.append(nq2.y(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (!O()) {
            boolean z = th instanceof CancellationException;
            xg1 H = H();
            if (H != null && H != w38.a) {
                if (!H.b(th) && !z) {
                    return false;
                }
                return true;
            }
            return z;
        }
        return true;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (s(th) && D()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void x(gt5 gt5Var, Object obj) {
        ft1 ft1Var;
        Throwable th;
        xg1 H = H();
        if (H != null) {
            H.a();
            c0(w38.a);
        }
        gt1 gt1Var = null;
        if (obj instanceof ft1) {
            ft1Var = (ft1) obj;
        } else {
            ft1Var = null;
        }
        if (ft1Var != null) {
            th = ft1Var.a;
        } else {
            th = null;
        }
        if (gt5Var instanceof b36) {
            try {
                ((b36) gt5Var).r(th);
                return;
            } catch (Throwable th2) {
                K(new gt1(0, "Exception in completion handler " + gt5Var + " for " + this, th2));
                return;
            }
        }
        p38 c2 = gt5Var.c();
        if (c2 != null) {
            c2.d(new lq6(1), 1);
            Object j = c2.j();
            j.getClass();
            for (tv6 tv6Var = (tv6) j; !tv6Var.equals(c2); tv6Var = tv6Var.k()) {
                if (tv6Var instanceof b36) {
                    try {
                        ((b36) tv6Var).r(th);
                    } catch (Throwable th3) {
                        if (gt1Var != null) {
                            pye.e(gt1Var, th3);
                        } else {
                            gt1Var = new gt1(0, "Exception in completion handler " + tv6Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (gt1Var != null) {
                K(gt1Var);
            }
        }
    }

    public final Throwable y(Object obj) {
        boolean z;
        Throwable th;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        CancellationException cancellationException = null;
        if (z) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new x26(this, v(), null);
            }
            return th2;
        }
        obj.getClass();
        l36 l36Var = (l36) obj;
        Object I = l36Var.I();
        if (I instanceof f36) {
            th = ((f36) I).d();
        } else if (I instanceof ft1) {
            th = ((ft1) I).a;
        } else if (!(I instanceof gt5)) {
            th = null;
        } else {
            xk5.p(I, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new x26(l36Var, "Parent job is ".concat(e0(I)), th);
        }
        return cancellationException;
    }

    public final Object z(f36 f36Var, Object obj) {
        ft1 ft1Var;
        f36 f36Var2;
        Throwable th;
        Throwable B;
        kt5 kt5Var;
        l36 l36Var;
        f36 f36Var3;
        Throwable th2 = null;
        if (obj instanceof ft1) {
            ft1Var = (ft1) obj;
        } else {
            ft1Var = null;
        }
        if (ft1Var != null) {
            th2 = ft1Var.a;
        }
        synchronized (f36Var) {
            try {
                f36Var.e();
                ArrayList f = f36Var.f(th2);
                B = B(f36Var, f);
                if (B != null) {
                    try {
                        if (f.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                            int size = f.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = f.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != B && th3 != B && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    pye.e(B, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        f36Var2 = f36Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                f36Var2 = f36Var;
                th = th5;
            }
        }
        if (B != null && B != th2) {
            obj = new ft1(B, false);
        }
        if (B != null && (u(B) || J(B))) {
            obj.getClass();
            ft1.b.compareAndSet((ft1) obj, 0, 1);
        }
        X(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (obj instanceof gt5) {
            kt5Var = new kt5((gt5) obj);
        } else {
            kt5Var = obj;
        }
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = u4f.a;
            long j = d;
            l36Var = this;
            f36Var3 = f36Var;
            if (!unsafe.compareAndSwapObject(l36Var, j, f36Var3, kt5Var) && unsafe.getObjectVolatile(l36Var, j) == f36Var3) {
                this = l36Var;
                f36Var = f36Var3;
            }
        }
        l36Var.x(f36Var3, obj);
        return obj;
    }

    @Override // defpackage.w26
    public final kb3 invokeOnCompletion(xt4 xt4Var) {
        return M(true, new z16(xt4Var));
    }

    public void Y() {
    }

    public void K(gt1 gt1Var) {
        throw gt1Var;
    }

    public void X(Object obj) {
    }

    public void l(Object obj) {
    }
}
