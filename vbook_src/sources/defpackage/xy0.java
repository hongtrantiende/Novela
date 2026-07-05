package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xy0  reason: default package */
/* loaded from: classes3.dex */
public class xy0 implements ta1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E;
    public static final /* synthetic */ AtomicReferenceFieldUpdater F;
    public static final /* synthetic */ AtomicReferenceFieldUpdater G;
    public static final /* synthetic */ AtomicReferenceFieldUpdater H;
    public static final /* synthetic */ long I;
    public static final /* synthetic */ long J;
    public static final /* synthetic */ long K;
    public static final /* synthetic */ long L;
    public static final /* synthetic */ long M;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final xt4 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final qo4 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(xy0.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(xy0.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(xy0.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater C = AtomicLongFieldUpdater.newUpdater(xy0.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(xy0.class, Object.class, "sendSegment$volatile");

    static {
        Unsafe unsafe = u4f.a;
        M = unsafe.objectFieldOffset(xy0.class.getDeclaredField("sendSegment$volatile"));
        E = AtomicReferenceFieldUpdater.newUpdater(xy0.class, Object.class, "receiveSegment$volatile");
        L = unsafe.objectFieldOffset(xy0.class.getDeclaredField("receiveSegment$volatile"));
        F = AtomicReferenceFieldUpdater.newUpdater(xy0.class, Object.class, "bufferEndSegment$volatile");
        J = unsafe.objectFieldOffset(xy0.class.getDeclaredField("bufferEndSegment$volatile"));
        G = AtomicReferenceFieldUpdater.newUpdater(xy0.class, Object.class, "_closeCause$volatile");
        I = unsafe.objectFieldOffset(xy0.class.getDeclaredField("_closeCause$volatile"));
        H = AtomicReferenceFieldUpdater.newUpdater(xy0.class, Object.class, "closeHandler$volatile");
        K = unsafe.objectFieldOffset(xy0.class.getDeclaredField("closeHandler$volatile"));
    }

    public xy0(int i, xt4 xt4Var) {
        long j;
        this.a = i;
        this.b = xt4Var;
        if (i >= 0) {
            kb1 kb1Var = zy0.a;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd$volatile = j;
            this.completedExpandBuffersAndPauseFlag$volatile = f.get(this);
            kb1 kb1Var2 = new kb1(0L, null, this, 3);
            this.sendSegment$volatile = kb1Var2;
            this.receiveSegment$volatile = kb1Var2;
            if (I()) {
                kb1Var2 = zy0.a;
                kb1Var2.getClass();
            }
            this.bufferEndSegment$volatile = kb1Var2;
            this.c = xt4Var != null ? new qo4(this, 5) : null;
            this._closeCause$volatile = zy0.s;
            return;
        }
        p1a.k(hl5.l("Invalid channel capacity: ", ", should be >=0", i));
        throw null;
    }

    public static void B(xy0 xy0Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = C;
        if ((atomicLongFieldUpdater.addAndGet(xy0Var, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(xy0Var) & 4611686018427387904L) != 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
        if (r13 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fb, code lost:
        r1 = r4.l();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object L(defpackage.xy0 r13, defpackage.m42 r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.L(xy0, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object M(defpackage.xy0 r13, defpackage.n42 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.vy0
            if (r0 == 0) goto L14
            r0 = r14
            vy0 r0 = (defpackage.vy0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            vy0 r0 = new vy0
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.a
            int r0 = r6.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            defpackage.hre.r(r14)
            jb1 r14 = (defpackage.jb1) r14
            java.lang.Object r13 = r14.a
            return r13
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r13)
            return r1
        L32:
            defpackage.hre.r(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.xy0.E
            r14.getClass()
            sun.misc.Unsafe r14 = defpackage.u4f.a
            long r3 = defpackage.xy0.L
            java.lang.Object r14 = r14.getObjectVolatile(r13, r3)
            kb1 r14 = (defpackage.kb1) r14
        L44:
            boolean r0 = r13.F()
            if (r0 == 0) goto L54
            java.lang.Throwable r13 = r13.w()
            hb1 r14 = new hb1
            r14.<init>(r13)
            return r14
        L54:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.xy0.e
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.zy0.b
            long r7 = (long) r0
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L71
            kb1 r0 = r13.u(r9, r14)
            if (r0 != 0) goto L6f
            goto L44
        L6f:
            r8 = r0
            goto L72
        L71:
            r8 = r14
        L72:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.T(r8, r9, r10, r12)
            lie r14 = defpackage.zy0.m
            if (r13 == r14) goto La6
            lie r14 = defpackage.zy0.o
            if (r13 != r14) goto L90
            long r13 = r7.z()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8d
            r8.b()
        L8d:
            r13 = r7
            r14 = r8
            goto L44
        L90:
            lie r14 = defpackage.zy0.n
            if (r13 != r14) goto La2
            r6.c = r2
            r1 = r7
            r2 = r8
            java.lang.Object r13 = r1.N(r2, r3, r4, r6)
            n82 r14 = defpackage.n82.a
            if (r13 != r14) goto La1
            return r14
        La1:
            return r13
        La2:
            r8.b()
            return r13
        La6:
            java.lang.String r13 = "unexpected"
            defpackage.vs.k(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.M(xy0, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object Q(defpackage.xy0 r26, java.lang.Object r27, defpackage.m42 r28) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.Q(xy0, java.lang.Object, m42):java.lang.Object");
    }

    public static final void a(xy0 xy0Var, Object obj, f61 f61Var) {
        xt4 xt4Var = xy0Var.b;
        if (xt4Var != null) {
            que.p(xt4Var, obj, f61Var.e);
        }
        f61Var.resumeWith(new gs9(xy0Var.y()));
    }

    public static final int g(xy0 xy0Var, kb1 kb1Var, int i, Object obj, long j, Object obj2, boolean z) {
        kb1Var.s(i, obj);
        if (z) {
            return xy0Var.U(kb1Var, i, obj, j, obj2, z);
        }
        Object q = kb1Var.q(i);
        if (q == null) {
            if (xy0Var.n(j)) {
                if (kb1Var.p(i, null, zy0.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (kb1Var.p(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (q instanceof zed) {
            kb1Var.s(i, null);
            if (xy0Var.R(q, obj)) {
                kb1Var.t(i, zy0.i);
                return 0;
            }
            lie lieVar = zy0.k;
            if (kb1Var.D.getAndSet((i * 2) + 1, lieVar) != lieVar) {
                kb1Var.r(i, true);
                return 5;
            }
            return 5;
        }
        return xy0Var.U(kb1Var, i, obj, j, obj2, z);
    }

    public final boolean A() {
        while (true) {
            E.getClass();
            Unsafe unsafe = u4f.a;
            long j = L;
            kb1 kb1Var = (kb1) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j2 = atomicLongFieldUpdater.get(this);
            if (z() > j2) {
                long j3 = zy0.b;
                long j4 = j2 / j3;
                if (kb1Var.e != j4 && (kb1Var = u(j4, kb1Var)) == null) {
                    if (((kb1) unsafe.getObjectVolatile(this, j)).e < j4) {
                        return false;
                    }
                } else {
                    kb1Var.b();
                    int i = (int) (j2 % j3);
                    while (true) {
                        Object q = kb1Var.q(i);
                        if (q != null && q != zy0.e) {
                            if (q != zy0.d) {
                                if (q != zy0.j && q != zy0.l && q != zy0.i && q != zy0.h) {
                                    if (q != zy0.g) {
                                        if (q != zy0.f && j2 == atomicLongFieldUpdater.get(this)) {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                }
                            } else {
                                return true;
                            }
                        } else if (kb1Var.p(i, q, zy0.h)) {
                            s();
                            break;
                        }
                    }
                    e.compareAndSet(this, j2, j2 + 1);
                }
            } else {
                return false;
            }
        }
    }

    public final void C() {
        Object objectVolatile;
        lie lieVar;
        xy0 xy0Var;
        loop0: while (true) {
            H.getClass();
            Unsafe unsafe = u4f.a;
            long j = K;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                lieVar = zy0.q;
            } else {
                lieVar = zy0.r;
            }
            lie lieVar2 = lieVar;
            while (true) {
                Unsafe unsafe2 = u4f.a;
                xy0Var = this;
                if (unsafe2.compareAndSwapObject(xy0Var, K, objectVolatile, lieVar2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(xy0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = xy0Var;
                }
            }
            this = xy0Var;
        }
        if (objectVolatile == null) {
            return;
        }
        jsc.u(1, objectVolatile);
        ((xt4) objectVolatile).invoke(xy0Var.w());
    }

    public final void D(tz6 tz6Var) {
        Unsafe unsafe;
        while (true) {
            H.getClass();
            Unsafe unsafe2 = u4f.a;
            xy0 xy0Var = this;
            if (unsafe2.compareAndSwapObject(xy0Var, K, (Object) null, tz6Var)) {
                return;
            }
            long j = K;
            if (unsafe2.getObjectVolatile(xy0Var, j) != null) {
                while (true) {
                    Object objectVolatile = u4f.a.getObjectVolatile(xy0Var, j);
                    lie lieVar = zy0.q;
                    if (objectVolatile == lieVar) {
                        lie lieVar2 = zy0.r;
                        do {
                            xy0 xy0Var2 = xy0Var;
                            unsafe = u4f.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(xy0Var2, K, lieVar, lieVar2);
                            xy0Var = xy0Var2;
                            if (compareAndSwapObject) {
                                tz6Var.invoke(xy0Var.w());
                                return;
                            }
                        } while (unsafe.getObjectVolatile(xy0Var, j) == lieVar);
                    } else if (objectVolatile == zy0.r) {
                        vs.k("Another handler was already registered and successfully invoked");
                        return;
                    } else {
                        xk5.p(objectVolatile, "Another handler is already registered: ");
                        return;
                    }
                }
            } else {
                this = xy0Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
        r13 = (defpackage.kb1) r13.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(boolean r13, long r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.E(boolean, long):boolean");
    }

    public final boolean F() {
        return E(true, d.get(this));
    }

    public final boolean G() {
        return E(false, d.get(this));
    }

    public boolean H() {
        return false;
    }

    public final boolean I() {
        long j = f.get(this);
        if (j != 0 && j != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r5.k() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        r5.i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(long r7, defpackage.kb1 r9) {
        /*
            r6 = this;
        L0:
            long r0 = r9.e
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            ty1 r0 = r9.d()
            kb1 r0 = (defpackage.kb1) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.g()
            if (r7 == 0) goto L23
            ty1 r7 = r5.d()
            kb1 r7 = (defpackage.kb1) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.xy0.F
            r7.getClass()
            sun.misc.Unsafe r7 = defpackage.u4f.a
            long r8 = defpackage.xy0.J
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            f5a r4 = (defpackage.f5a) r4
            long r0 = r4.e
            long r2 = r5.e
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L3c
            goto L58
        L3c:
            boolean r7 = r5.o()
            if (r7 != 0) goto L44
            r9 = r5
            goto L11
        L44:
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r2 = defpackage.xy0.J
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L59
            boolean r6 = r4.k()
            if (r6 == 0) goto L58
            r4.i()
        L58:
            return
        L59:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L6a
            boolean r6 = r5.k()
            if (r6 == 0) goto L68
            r5.i()
        L68:
            r6 = r1
            goto L23
        L6a:
            r6 = r1
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.J(long, kb1):void");
    }

    public final Object K(m42 m42Var, Object obj) {
        gt1 q;
        f61 f61Var = new f61(1, w92.t(m42Var));
        f61Var.u();
        xt4 xt4Var = this.b;
        if (xt4Var != null && (q = que.q(xt4Var, obj, null)) != null) {
            pye.e(q, y());
            f61Var.resumeWith(new gs9(q));
        } else {
            f61Var.resumeWith(new gs9(y()));
        }
        Object s = f61Var.s();
        if (s == n82.a) {
            return s;
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
        if (r11 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
        r2 = m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
        if (r11 != null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(defpackage.kb1 r10, int r11, long r12, defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.N(kb1, int, long, n42):java.lang.Object");
    }

    public final void O(w5a w5aVar) {
        kb1 kb1Var;
        xy0 xy0Var;
        w5a w5aVar2;
        int i;
        w5a w5aVar3;
        E.getClass();
        kb1 kb1Var2 = (kb1) u4f.a.getObjectVolatile(this, L);
        while (!this.F()) {
            long andIncrement = e.getAndIncrement(this);
            long j = zy0.b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (kb1Var2.e != j2) {
                kb1 u = this.u(j2, kb1Var2);
                if (u == null) {
                    continue;
                } else {
                    kb1Var = u;
                    w5aVar2 = w5aVar;
                    i = i2;
                    xy0Var = this;
                }
            } else {
                kb1Var = kb1Var2;
                xy0Var = this;
                w5aVar2 = w5aVar;
                i = i2;
            }
            Object T = xy0Var.T(kb1Var, i, andIncrement, w5aVar2);
            kb1Var2 = kb1Var;
            if (T == zy0.m) {
                if (w5aVar2 != null) {
                    w5aVar3 = w5aVar2;
                } else {
                    w5aVar3 = null;
                }
                if (w5aVar3 != null) {
                    w5aVar3.c = kb1Var2;
                    w5aVar3.d = i;
                    return;
                }
                return;
            } else if (T == zy0.o) {
                if (andIncrement < xy0Var.z()) {
                    kb1Var2.b();
                }
                this = xy0Var;
                w5aVar = w5aVar2;
            } else if (T != zy0.n) {
                kb1Var2.b();
                w5aVar2.e = T;
                return;
            } else {
                vs.k("unexpected");
                return;
            }
        }
        w5aVar.e = zy0.l;
    }

    public final void P(zed zedVar, boolean z) {
        Throwable y;
        if (zedVar instanceof e61) {
            m42 m42Var = (m42) zedVar;
            if (z) {
                y = x();
            } else {
                y = y();
            }
            m42Var.resumeWith(new gs9(y));
        } else if (zedVar instanceof bk9) {
            ((bk9) zedVar).a.resumeWith(new jb1(new hb1(w())));
        } else if (zedVar instanceof qy0) {
            qy0 qy0Var = (qy0) zedVar;
            f61 f61Var = qy0Var.b;
            f61Var.getClass();
            qy0Var.b = null;
            qy0Var.a = zy0.l;
            Throwable w = qy0Var.c.w();
            if (w == null) {
                f61Var.resumeWith(Boolean.FALSE);
            } else {
                f61Var.resumeWith(new gs9(w));
            }
        } else if (zedVar instanceof w5a) {
            ((w5a) zedVar).j(this, zy0.l);
        } else {
            xk5.p(zedVar, "Unexpected waiter: ");
        }
    }

    public final boolean R(Object obj, Object obj2) {
        if (obj instanceof w5a) {
            return ((w5a) obj).j(this, obj2);
        }
        boolean z = obj instanceof bk9;
        xt4 xt4Var = this.b;
        mu4 mu4Var = null;
        if (z) {
            f61 f61Var = ((bk9) obj).a;
            jb1 jb1Var = new jb1(obj2);
            if (xt4Var != null) {
                mu4Var = m();
            }
            return zy0.a(f61Var, jb1Var, mu4Var);
        } else if (obj instanceof qy0) {
            qy0 qy0Var = (qy0) obj;
            f61 f61Var2 = qy0Var.b;
            f61Var2.getClass();
            qy0Var.b = null;
            qy0Var.a = obj2;
            Boolean bool = Boolean.TRUE;
            xt4 xt4Var2 = qy0Var.c.b;
            if (xt4Var2 != null) {
                mu4Var = new t81(13, xt4Var2, obj2);
            }
            return zy0.a(f61Var2, bool, mu4Var);
        } else if (obj instanceof e61) {
            e61 e61Var = (e61) obj;
            if (xt4Var != null) {
                mu4Var = l();
            }
            return zy0.a(e61Var, obj2, mu4Var);
        } else {
            xk5.p(obj, "Unexpected receiver type: ");
            return false;
        }
    }

    public final boolean S(Object obj, kb1 kb1Var, int i) {
        soc socVar;
        boolean z = obj instanceof e61;
        pvc pvcVar = pvc.a;
        if (z) {
            return zy0.a((e61) obj, pvcVar, null);
        }
        if (obj instanceof w5a) {
            int k = ((w5a) obj).k(this, pvcVar);
            soc socVar2 = soc.a;
            soc socVar3 = soc.b;
            if (k != 0) {
                if (k != 1) {
                    if (k != 2) {
                        if (k == 3) {
                            socVar = soc.d;
                        } else {
                            cp8.j(k, "Unexpected internal result: ");
                            return false;
                        }
                    } else {
                        socVar = soc.c;
                    }
                } else {
                    socVar = socVar3;
                }
            } else {
                socVar = socVar2;
            }
            if (socVar == socVar3) {
                kb1Var.s(i, null);
            }
            if (socVar != socVar2) {
                return false;
            }
            return true;
        }
        xk5.p(obj, "Unexpected waiter: ");
        return false;
    }

    public final Object T(kb1 kb1Var, int i, long j, Object obj) {
        Object q = kb1Var.q(i);
        AtomicReferenceArray atomicReferenceArray = kb1Var.D;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (q == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return zy0.n;
                }
                if (kb1Var.p(i, q, obj)) {
                    s();
                    return zy0.m;
                }
            }
        } else if (q == zy0.d && kb1Var.p(i, q, zy0.i)) {
            s();
            Object obj2 = atomicReferenceArray.get(i * 2);
            kb1Var.s(i, null);
            return obj2;
        }
        while (true) {
            Object q2 = kb1Var.q(i);
            if (q2 != null && q2 != zy0.e) {
                if (q2 == zy0.d) {
                    if (kb1Var.p(i, q2, zy0.i)) {
                        s();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        kb1Var.s(i, null);
                        return obj3;
                    }
                } else {
                    lie lieVar = zy0.j;
                    if (q2 == lieVar) {
                        return zy0.o;
                    }
                    if (q2 == zy0.h) {
                        return zy0.o;
                    }
                    if (q2 == zy0.l) {
                        s();
                        return zy0.o;
                    } else if (q2 != zy0.g && kb1Var.p(i, q2, zy0.f)) {
                        boolean z = q2 instanceof afd;
                        if (z) {
                            q2 = ((afd) q2).a;
                        }
                        if (S(q2, kb1Var, i)) {
                            kb1Var.t(i, zy0.i);
                            s();
                            Object obj4 = atomicReferenceArray.get(i * 2);
                            kb1Var.s(i, null);
                            return obj4;
                        }
                        kb1Var.t(i, lieVar);
                        kb1Var.n();
                        if (z) {
                            s();
                        }
                        return zy0.o;
                    }
                }
            } else if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (kb1Var.p(i, q2, zy0.h)) {
                    s();
                    return zy0.o;
                }
            } else if (obj == null) {
                return zy0.n;
            } else {
                if (kb1Var.p(i, q2, obj)) {
                    s();
                    return zy0.m;
                }
            }
        }
    }

    public final int U(kb1 kb1Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object q = kb1Var.q(i);
            if (q == null) {
                if (n(j) && !z) {
                    if (kb1Var.p(i, null, zy0.d)) {
                        break;
                    }
                } else if (z) {
                    if (kb1Var.p(i, null, zy0.j)) {
                        kb1Var.n();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (kb1Var.p(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (q == zy0.e) {
                if (kb1Var.p(i, q, zy0.d)) {
                    break;
                }
            } else {
                lie lieVar = zy0.k;
                if (q == lieVar) {
                    kb1Var.s(i, null);
                    return 5;
                } else if (q == zy0.h) {
                    kb1Var.s(i, null);
                    return 5;
                } else if (q == zy0.l) {
                    kb1Var.s(i, null);
                    G();
                    return 4;
                } else {
                    kb1Var.s(i, null);
                    if (q instanceof afd) {
                        q = ((afd) q).a;
                    }
                    if (R(q, obj)) {
                        kb1Var.t(i, zy0.i);
                        return 0;
                    }
                    if (kb1Var.D.getAndSet((i * 2) + 1, lieVar) != lieVar) {
                        kb1Var.r(i, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void V(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z;
        xy0 xy0Var = this;
        if (!xy0Var.I()) {
            while (true) {
                atomicLongFieldUpdater = f;
                if (atomicLongFieldUpdater.get(xy0Var) > j) {
                    break;
                }
                xy0Var = this;
            }
            int i = zy0.c;
            int i2 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = C;
                if (i2 < i) {
                    long j2 = atomicLongFieldUpdater.get(xy0Var);
                    if (j2 != (4611686018427387903L & atomicLongFieldUpdater2.get(xy0Var)) || j2 != atomicLongFieldUpdater.get(xy0Var)) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j3 = atomicLongFieldUpdater2.get(xy0Var);
                        if (atomicLongFieldUpdater2.compareAndSet(xy0Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        xy0Var = this;
                    }
                    while (true) {
                        long j4 = atomicLongFieldUpdater.get(xy0Var);
                        long j5 = atomicLongFieldUpdater2.get(xy0Var);
                        long j6 = j5 & 4611686018427387903L;
                        if ((j5 & 4611686018427387904L) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j4 == j6 && j4 == atomicLongFieldUpdater.get(xy0Var)) {
                            break;
                        } else if (!z) {
                            xy0Var = this;
                            atomicLongFieldUpdater2.compareAndSet(xy0Var, j5, 4611686018427387904L + j6);
                        } else {
                            xy0Var = this;
                        }
                    }
                    while (true) {
                        long j7 = atomicLongFieldUpdater2.get(xy0Var);
                        if (atomicLongFieldUpdater2.compareAndSet(xy0Var, j7, j7 & 4611686018427387903L)) {
                            return;
                        }
                        xy0Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.ta1
    public final t5a b() {
        ry0 ry0Var = ry0.a;
        jsc.u(3, ry0Var);
        sy0 sy0Var = sy0.a;
        jsc.u(3, sy0Var);
        return new oaa(this, ry0Var, sy0Var, this.c, 24);
    }

    @Override // defpackage.ta1
    public final t5a c() {
        ty0 ty0Var = ty0.a;
        jsc.u(3, ty0Var);
        uy0 uy0Var = uy0.a;
        jsc.u(3, uy0Var);
        return new oaa(this, ty0Var, uy0Var, this.c, 24);
    }

    @Override // defpackage.ta1
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        p(cancellationException, true);
    }

    @Override // defpackage.ta1
    public final Object d() {
        kb1 kb1Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = d.get(this);
        if (E(true, j2)) {
            return new hb1(w());
        }
        int i = (j > (j2 & 1152921504606846975L) ? 1 : (j == (j2 & 1152921504606846975L) ? 0 : -1));
        ib1 ib1Var = jb1.b;
        if (i >= 0) {
            return ib1Var;
        }
        lie lieVar = zy0.k;
        E.getClass();
        kb1 kb1Var2 = (kb1) u4f.a.getObjectVolatile(this, L);
        while (!this.F()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = zy0.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (kb1Var2.e != j4) {
                kb1 u = this.u(j4, kb1Var2);
                if (u == null) {
                    continue;
                } else {
                    kb1Var = u;
                }
            } else {
                kb1Var = kb1Var2;
            }
            xy0 xy0Var = this;
            Object T = xy0Var.T(kb1Var, i2, andIncrement, lieVar);
            kb1Var2 = kb1Var;
            zed zedVar = null;
            if (T == zy0.m) {
                if (lieVar instanceof zed) {
                    zedVar = (zed) lieVar;
                }
                if (zedVar != null) {
                    zedVar.b(kb1Var2, i2);
                }
                xy0Var.V(andIncrement);
                kb1Var2.n();
                return ib1Var;
            } else if (T == zy0.o) {
                if (andIncrement < xy0Var.z()) {
                    kb1Var2.b();
                }
                this = xy0Var;
            } else if (T != zy0.n) {
                kb1Var2.b();
                return T;
            } else {
                vs.k("unexpected");
                return null;
            }
        }
        return new hb1(this.w());
    }

    @Override // defpackage.u8a
    public Object e(m42 m42Var, Object obj) {
        return Q(this, obj, m42Var);
    }

    @Override // defpackage.u8a
    public final boolean f(Throwable th) {
        return p(th, false);
    }

    @Override // defpackage.ta1
    public final Object i(aab aabVar) {
        return L(this, aabVar);
    }

    @Override // defpackage.ta1
    public final qy0 iterator() {
        return new qy0(this);
    }

    @Override // defpackage.u8a
    public Object j(Object obj) {
        boolean z;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        long j = atomicLongFieldUpdater.get(this);
        boolean z2 = false;
        long j2 = 1152921504606846975L;
        if (E(false, j)) {
            z = false;
        } else {
            z = !n(j & 1152921504606846975L);
        }
        ib1 ib1Var = jb1.b;
        if (z) {
            return ib1Var;
        }
        lie lieVar = zy0.j;
        D.getClass();
        kb1 kb1Var = (kb1) u4f.a.getObjectVolatile(this, M);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean E2 = E(z2, andIncrement);
            int i = zy0.b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (kb1Var.e != j5) {
                kb1 v = v(j5, kb1Var);
                if (v == null) {
                    if (E2) {
                        return new hb1(y());
                    }
                    z2 = false;
                    j2 = 1152921504606846975L;
                } else {
                    kb1Var = v;
                }
            }
            int g = g(this, kb1Var, i2, obj, j3, lieVar, E2);
            pvc pvcVar = pvc.a;
            if (g != 0) {
                if (g != 1) {
                    zed zedVar = null;
                    if (g != 2) {
                        if (g != 3) {
                            if (g != 4) {
                                if (g == 5) {
                                    kb1Var.b();
                                }
                                z2 = false;
                                j2 = 1152921504606846975L;
                            } else {
                                if (j3 < e.get(this)) {
                                    kb1Var.b();
                                }
                                return new hb1(y());
                            }
                        } else {
                            vs.k("unexpected");
                            return null;
                        }
                    } else if (E2) {
                        kb1Var.n();
                        return new hb1(y());
                    } else {
                        if (lieVar instanceof zed) {
                            zedVar = (zed) lieVar;
                        }
                        if (zedVar != null) {
                            zedVar.b(kb1Var, i2 + i);
                        }
                        kb1Var.n();
                        return ib1Var;
                    }
                } else {
                    return pvcVar;
                }
            } else {
                kb1Var.b();
                return pvcVar;
            }
        }
    }

    @Override // defpackage.ta1
    public final Object k(co1 co1Var) {
        return M(this, co1Var);
    }

    public final ig l() {
        return new ig(3, this, xy0.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
    }

    public final ig m() {
        return new ig(3, this, xy0.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 2);
    }

    public final boolean n(long j) {
        if (j >= f.get(this) && j >= e.get(this) + this.a) {
            return false;
        }
        return true;
    }

    public final kb1 o() {
        F.getClass();
        Unsafe unsafe = u4f.a;
        kb1 objectVolatile = unsafe.getObjectVolatile(this, J);
        D.getClass();
        kb1 kb1Var = (kb1) unsafe.getObjectVolatile(this, M);
        if (kb1Var.e > ((kb1) objectVolatile).e) {
            objectVolatile = kb1Var;
        }
        E.getClass();
        kb1 kb1Var2 = (kb1) unsafe.getObjectVolatile(this, L);
        if (kb1Var2.e > ((kb1) objectVolatile).e) {
            objectVolatile = kb1Var2;
        }
        ty1 ty1Var = (ty1) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ty1.a;
            Object e2 = ty1Var.e();
            if (e2 == sy1.a) {
                break;
            }
            ty1 ty1Var2 = (ty1) e2;
            if (ty1Var2 == null) {
                if (ty1Var.h()) {
                    break;
                }
            } else {
                ty1Var = ty1Var2;
            }
        }
        return (kb1) ty1Var;
    }

    public final boolean p(Throwable th, boolean z) {
        xy0 xy0Var;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                kb1 kb1Var = zy0.a;
                xy0Var = this;
                if (atomicLongFieldUpdater.compareAndSet(xy0Var, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = xy0Var;
            }
        }
        xy0Var = this;
        lie lieVar = zy0.s;
        while (true) {
            G.getClass();
            xy0 xy0Var2 = xy0Var;
            Unsafe unsafe = u4f.a;
            long j5 = I;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(xy0Var2, j5, lieVar, th2);
            xy0Var = xy0Var2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            } else if (unsafe.getObjectVolatile(xy0Var, j5) != lieVar) {
                z2 = false;
                break;
            } else {
                th = th2;
            }
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(xy0Var);
            } while (!atomicLongFieldUpdater.compareAndSet(xy0Var, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(xy0Var);
                int i = (int) (j >> 60);
                if (i != 0) {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                } else {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(xy0Var, j, j2));
        }
        xy0Var.G();
        if (z2) {
            xy0Var.C();
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r1 = (defpackage.kb1) r1.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kb1 q(long r12) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.q(long):kb1");
    }

    public final void r(long j) {
        gt1 q;
        E.getClass();
        kb1 kb1Var = (kb1) u4f.a.getObjectVolatile(this, L);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.a + j2, f.get(this))) {
                return;
            }
            xy0 xy0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(xy0Var, j2, 1 + j2)) {
                long j3 = zy0.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (kb1Var.e != j4) {
                    kb1 u = xy0Var.u(j4, kb1Var);
                    if (u != null) {
                        kb1Var = u;
                    }
                }
                kb1 kb1Var2 = kb1Var;
                Object T = xy0Var.T(kb1Var2, i, j2, null);
                if (T == zy0.o) {
                    if (j2 < xy0Var.z()) {
                        kb1Var2.b();
                    }
                } else {
                    kb1Var2.b();
                    xt4 xt4Var = xy0Var.b;
                    if (xt4Var != null && (q = que.q(xt4Var, T, null)) != null) {
                        throw q;
                    }
                }
                this = xy0Var;
                kb1Var = kb1Var2;
            }
            this = xy0Var;
        }
    }

    public final void s() {
        xy0 xy0Var;
        if (I()) {
            return;
        }
        F.getClass();
        kb1 kb1Var = (kb1) u4f.a.getObjectVolatile(this, J);
        loop0: while (true) {
            long andIncrement = f.getAndIncrement(this);
            long j = zy0.b;
            long j2 = andIncrement / j;
            if (this.z() <= andIncrement) {
                if (kb1Var.e < j2 && kb1Var.d() != null) {
                    this.J(j2, kb1Var);
                }
                B(this);
                return;
            }
            xy0Var = this;
            if (kb1Var.e != j2) {
                kb1 t = xy0Var.t(j2, kb1Var, andIncrement);
                if (t == null) {
                    continue;
                    this = xy0Var;
                } else {
                    kb1Var = t;
                }
            }
            int i = (int) (andIncrement % j);
            Object q = kb1Var.q(i);
            boolean z = q instanceof zed;
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            if (z && andIncrement >= atomicLongFieldUpdater.get(xy0Var) && kb1Var.p(i, q, zy0.g)) {
                if (xy0Var.S(q, kb1Var, i)) {
                    kb1Var.t(i, zy0.d);
                    break;
                }
                kb1Var.t(i, zy0.j);
                kb1Var.n();
                B(xy0Var);
            } else {
                while (true) {
                    Object q2 = kb1Var.q(i);
                    if (q2 instanceof zed) {
                        if (andIncrement < atomicLongFieldUpdater.get(xy0Var)) {
                            if (kb1Var.p(i, q2, new afd((zed) q2))) {
                                break loop0;
                            }
                        } else if (kb1Var.p(i, q2, zy0.g)) {
                            if (xy0Var.S(q2, kb1Var, i)) {
                                kb1Var.t(i, zy0.d);
                                break;
                            } else {
                                kb1Var.t(i, zy0.j);
                                kb1Var.n();
                            }
                        }
                    } else if (q2 != zy0.j) {
                        if (q2 == null) {
                            if (kb1Var.p(i, q2, zy0.e)) {
                                break loop0;
                            }
                        } else if (q2 == zy0.d || q2 == zy0.h || q2 == zy0.i || q2 == zy0.k || q2 == zy0.l) {
                            break loop0;
                        } else if (q2 != zy0.f) {
                            xk5.p(q2, "Unexpected cell state: ");
                            return;
                        }
                    } else {
                        break;
                    }
                }
                B(xy0Var);
            }
            this = xy0Var;
        }
        B(xy0Var);
    }

    public final kb1 t(long j, kb1 kb1Var, long j2) {
        Object a;
        Unsafe unsafe;
        kb1 kb1Var2 = zy0.a;
        yy0 yy0Var = yy0.a;
        loop0: while (true) {
            a = sy1.a(kb1Var, j, yy0Var);
            if (!aye.n(a)) {
                f5a l = aye.l(a);
                while (true) {
                    F.getClass();
                    Unsafe unsafe2 = u4f.a;
                    long j3 = J;
                    f5a f5aVar = (f5a) unsafe2.getObjectVolatile(this, j3);
                    if (f5aVar.e >= l.e) {
                        break loop0;
                    } else if (!l.o()) {
                        break;
                    } else {
                        do {
                            unsafe = u4f.a;
                            if (unsafe.compareAndSwapObject(this, J, f5aVar, l)) {
                                if (f5aVar.k()) {
                                    f5aVar.i();
                                }
                            }
                        } while (unsafe.getObjectVolatile(this, j3) == f5aVar);
                        if (l.k()) {
                            l.i();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (aye.n(a)) {
            G();
            J(j, kb1Var);
            B(this);
            return null;
        }
        kb1 kb1Var3 = (kb1) aye.l(a);
        long j4 = kb1Var3.e;
        if (j4 > j) {
            long j5 = j4 * zy0.b;
            if (f.compareAndSet(this, j2 + 1, j5)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = C;
                if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) == 0) {
                    return null;
                }
                do {
                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                return null;
            }
            B(this);
            return null;
        }
        return kb1Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
        r15 = r8;
        r3 = (defpackage.kb1) r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d1, code lost:
        if (r3 != null) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c9 A[EDGE_INSN: B:105:0x01c9->B:87:0x01c9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if (r8.k() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
        r8.i();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kb1 u(long r16, defpackage.kb1 r18) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.u(long, kb1):kb1");
    }

    public final kb1 v(long j, kb1 kb1Var) {
        Object a;
        long j2;
        long j3;
        Unsafe unsafe;
        kb1 kb1Var2 = zy0.a;
        yy0 yy0Var = yy0.a;
        loop0: while (true) {
            a = sy1.a(kb1Var, j, yy0Var);
            if (!aye.n(a)) {
                f5a l = aye.l(a);
                while (true) {
                    D.getClass();
                    Unsafe unsafe2 = u4f.a;
                    long j4 = M;
                    f5a f5aVar = (f5a) unsafe2.getObjectVolatile(this, j4);
                    if (f5aVar.e >= l.e) {
                        break loop0;
                    } else if (!l.o()) {
                        break;
                    } else {
                        do {
                            unsafe = u4f.a;
                            if (unsafe.compareAndSwapObject(this, M, f5aVar, l)) {
                                if (f5aVar.k()) {
                                    f5aVar.i();
                                }
                            }
                        } while (unsafe.getObjectVolatile(this, j4) == f5aVar);
                        if (l.k()) {
                            l.i();
                        }
                    }
                }
            } else {
                break;
            }
        }
        boolean n = aye.n(a);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (n) {
            G();
            if (kb1Var.e * zy0.b < atomicLongFieldUpdater.get(this)) {
                kb1Var.b();
                return null;
            }
        } else {
            kb1 kb1Var3 = (kb1) aye.l(a);
            long j5 = kb1Var3.e;
            if (j5 > j) {
                long j6 = j5 * zy0.b;
                do {
                    j2 = d.get(this);
                    j3 = 1152921504606846975L & j2;
                    if (j3 >= j6) {
                        break;
                    }
                } while (!d.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
                if (j5 * zy0.b < atomicLongFieldUpdater.get(this)) {
                    kb1Var3.b();
                }
            } else {
                return kb1Var3;
            }
        }
        return null;
    }

    public final Throwable w() {
        G.getClass();
        return (Throwable) u4f.a.getObjectVolatile(this, I);
    }

    public final Throwable x() {
        Throwable w = w();
        if (w == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return w;
    }

    public final Throwable y() {
        Throwable w = w();
        if (w == null) {
            return new IllegalStateException("Channel was closed");
        }
        return w;
    }

    public final long z() {
        return d.get(this) & 1152921504606846975L;
    }
}
