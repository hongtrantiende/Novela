package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qx3  reason: default package */
/* loaded from: classes3.dex */
public abstract class qx3 extends lx3 implements c03 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(qx3.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    public static final /* synthetic */ AtomicIntegerFieldUpdater E;
    public static final /* synthetic */ long F;
    public static final /* synthetic */ long G;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = u4f.a;
        G = unsafe.objectFieldOffset(qx3.class.getDeclaredField("_queue$volatile"));
        D = AtomicReferenceFieldUpdater.newUpdater(qx3.class, Object.class, "_delayed$volatile");
        F = unsafe.objectFieldOffset(qx3.class.getDeclaredField("_delayed$volatile"));
        E = AtomicIntegerFieldUpdater.newUpdater(qx3.class, "_isCompleted$volatile");
    }

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        n1(runnable);
    }

    @Override // defpackage.lx3
    public final long g1() {
        if (k1()) {
            return 0L;
        }
        o1();
        Runnable m1 = m1();
        if (m1 != null) {
            m1.run();
            return 0L;
        }
        return q1();
    }

    public final void l1() {
        qx3 qx3Var;
        Unsafe unsafe;
        while (true) {
            C.getClass();
            Unsafe unsafe2 = u4f.a;
            long j = G;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            lie lieVar = rx3.b;
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = u4f.a;
                    qx3 qx3Var2 = this;
                    qx3Var = qx3Var2;
                    if (!unsafe3.compareAndSwapObject(qx3Var2, G, (Object) null, lieVar)) {
                        if (unsafe3.getObjectVolatile(qx3Var, j) != null) {
                            break;
                        }
                        this = qx3Var;
                    } else {
                        return;
                    }
                }
            } else {
                qx3Var = this;
                if (objectVolatile instanceof wv6) {
                    ((wv6) objectVolatile).c();
                    return;
                } else if (objectVolatile != lieVar) {
                    wv6 wv6Var = new wv6(8, true);
                    wv6Var.a((Runnable) objectVolatile);
                    do {
                        unsafe = u4f.a;
                        if (unsafe.compareAndSwapObject(qx3Var, G, objectVolatile, wv6Var)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(qx3Var, j) == objectVolatile);
                } else {
                    return;
                }
            }
            this = qx3Var;
        }
    }

    public final Runnable m1() {
        qx3 qx3Var;
        Unsafe unsafe;
        while (true) {
            C.getClass();
            Unsafe unsafe2 = u4f.a;
            long j = G;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                if (objectVolatile instanceof wv6) {
                    wv6 wv6Var = (wv6) objectVolatile;
                    Object e = wv6Var.e();
                    if (e != wv6.g) {
                        return (Runnable) e;
                    }
                    wv6 d = wv6Var.d();
                    while (true) {
                        Unsafe unsafe3 = u4f.a;
                        qx3Var = this;
                        if (!unsafe3.compareAndSwapObject(qx3Var, G, objectVolatile, d) && unsafe3.getObjectVolatile(qx3Var, j) == objectVolatile) {
                            this = qx3Var;
                        }
                    }
                } else {
                    qx3Var = this;
                    if (objectVolatile == rx3.b) {
                        return null;
                    }
                    do {
                        unsafe = u4f.a;
                        if (unsafe.compareAndSwapObject(qx3Var, G, objectVolatile, (Object) null)) {
                            return (Runnable) objectVolatile;
                        }
                    } while (unsafe.getObjectVolatile(qx3Var, j) == objectVolatile);
                }
                this = qx3Var;
            } else {
                return null;
            }
        }
    }

    public void n1(Runnable runnable) {
        o1();
        if (p1(runnable)) {
            Thread r1 = r1();
            if (Thread.currentThread() != r1) {
                LockSupport.unpark(r1);
                return;
            }
            return;
        }
        rt2.H.n1(runnable);
    }

    public final void o1() {
        ox3 ox3Var;
        ox3 ox3Var2;
        boolean z;
        D.getClass();
        px3 px3Var = (px3) u4f.a.getObjectVolatile(this, F);
        if (px3Var == null || f7c.b.get(px3Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (px3Var) {
                try {
                    ox3[] ox3VarArr = px3Var.a;
                    ox3Var = null;
                    if (ox3VarArr != null) {
                        ox3Var2 = ox3VarArr[0];
                    } else {
                        ox3Var2 = null;
                    }
                    if (ox3Var2 != null) {
                        if (nanoTime - ox3Var2.a >= 0) {
                            z = p1(ox3Var2);
                        } else {
                            z = false;
                        }
                        if (z) {
                            ox3Var = px3Var.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (ox3Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p1(java.lang.Runnable r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.qx3.C
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r6 = defpackage.qx3.G
            java.lang.Object r4 = r0.getObjectVolatile(r9, r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.qx3.E
            int r0 = r0.get(r9)
            r8 = 1
            if (r0 != r8) goto L17
            goto L5c
        L17:
            if (r4 != 0) goto L2e
        L19:
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r2 = defpackage.qx3.G
            r4 = 0
            r1 = r9
            r5 = r10
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L27
            goto L79
        L27:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == 0) goto L19
            goto L0
        L2e:
            boolean r0 = r4 instanceof defpackage.wv6
            if (r0 == 0) goto L58
            r0 = r4
            wv6 r0 = (defpackage.wv6) r0
            int r2 = r0.a(r10)
            if (r2 == 0) goto L79
            if (r2 == r8) goto L41
            r0 = 2
            if (r2 == r0) goto L5c
            goto L0
        L41:
            wv6 r5 = r0.d()
        L45:
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r2 = defpackage.qx3.G
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L51
            goto L0
        L51:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L45
            goto L0
        L58:
            lie r0 = defpackage.rx3.b
            if (r4 != r0) goto L5e
        L5c:
            r0 = 0
            return r0
        L5e:
            wv6 r5 = new wv6
            r0 = 8
            r5.<init>(r0, r8)
            r0 = r4
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r5.a(r0)
            r5.a(r10)
        L6e:
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r2 = defpackage.qx3.G
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L7a
        L79:
            return r8
        L7a:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L6e
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx3.p1(java.lang.Runnable):boolean");
    }

    @Override // defpackage.c03
    public final void q(long j, f61 f61Var) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            mx3 mx3Var = new mx3(this, j2 + nanoTime, f61Var);
            w1(nanoTime, mx3Var);
            f61Var.x(new z51(mx3Var, 2));
        }
    }

    public final long q1() {
        long j;
        ox3 ox3Var;
        rz rzVar = this.e;
        if (rzVar == null || rzVar.isEmpty()) {
            j = Long.MAX_VALUE;
        } else {
            j = 0;
        }
        if (j != 0) {
            C.getClass();
            Unsafe unsafe = u4f.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, G);
            if (objectVolatile != null) {
                if (objectVolatile instanceof wv6) {
                    long j2 = wv6.f.get((wv6) objectVolatile);
                    if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == rx3.b) {
                    return Long.MAX_VALUE;
                }
            }
            D.getClass();
            px3 px3Var = (px3) unsafe.getObjectVolatile(this, F);
            if (px3Var != null) {
                synchronized (px3Var) {
                    ox3[] ox3VarArr = px3Var.a;
                    if (ox3VarArr != null) {
                        ox3Var = ox3VarArr[0];
                    } else {
                        ox3Var = null;
                    }
                }
                if (ox3Var != null) {
                    long nanoTime = ox3Var.a - System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread r1();

    public final boolean s1() {
        boolean z;
        rz rzVar = this.e;
        if (rzVar != null) {
            z = rzVar.isEmpty();
        } else {
            z = true;
        }
        if (z) {
            D.getClass();
            Unsafe unsafe = u4f.a;
            px3 px3Var = (px3) unsafe.getObjectVolatile(this, F);
            if (px3Var != null && f7c.b.get(px3Var) != 0) {
                return false;
            }
            C.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, G);
            if (objectVolatile != null) {
                if (objectVolatile instanceof wv6) {
                    long j = wv6.f.get((wv6) objectVolatile);
                    if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                } else if (objectVolatile == rx3.b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lx3
    public void shutdown() {
        c7c.a.set(null);
        E.set(this, 1);
        l1();
        do {
        } while (g1() <= 0);
        u1();
    }

    public void t1(long j, ox3 ox3Var) {
        rt2.H.w1(j, ox3Var);
    }

    public final void u1() {
        ox3 ox3Var;
        long nanoTime = System.nanoTime();
        while (true) {
            D.getClass();
            px3 px3Var = (px3) u4f.a.getObjectVolatile(this, F);
            if (px3Var != null) {
                synchronized (px3Var) {
                    if (f7c.b.get(px3Var) > 0) {
                        ox3Var = px3Var.b(0);
                    } else {
                        ox3Var = null;
                    }
                }
                if (ox3Var != null) {
                    t1(nanoTime, ox3Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void v1() {
        C.getClass();
        Unsafe unsafe = u4f.a;
        unsafe.putObjectVolatile(this, G, (Object) null);
        D.getClass();
        unsafe.putObjectVolatile(this, F, (Object) null);
    }

    public final void w1(long j, ox3 ox3Var) {
        Thread r1;
        int x1 = x1(j, ox3Var);
        if (x1 != 0) {
            if (x1 != 1) {
                if (x1 != 2) {
                    vs.k("unexpected result");
                    return;
                }
                return;
            }
            t1(j, ox3Var);
        } else if (y1(ox3Var) && Thread.currentThread() != (r1 = r1())) {
            LockSupport.unpark(r1);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, px3] */
    public final int x1(long j, ox3 ox3Var) {
        qx3 qx3Var;
        Unsafe unsafe;
        if (E.get(this) == 1) {
            return 1;
        }
        D.getClass();
        Unsafe unsafe2 = u4f.a;
        long j2 = F;
        px3 px3Var = (px3) unsafe2.getObjectVolatile(this, j2);
        if (px3Var == null) {
            ?? obj = new Object();
            obj.c = j;
            while (true) {
                unsafe = u4f.a;
                qx3Var = this;
                if (!unsafe.compareAndSwapObject(qx3Var, F, (Object) null, (Object) obj) && unsafe.getObjectVolatile(qx3Var, j2) == null) {
                    this = qx3Var;
                }
            }
            Object objectVolatile = unsafe.getObjectVolatile(qx3Var, j2);
            objectVolatile.getClass();
            px3Var = (px3) objectVolatile;
        } else {
            qx3Var = this;
        }
        return ox3Var.c(j, px3Var, qx3Var);
    }

    public final boolean y1(ox3 ox3Var) {
        D.getClass();
        px3 px3Var = (px3) u4f.a.getObjectVolatile(this, F);
        ox3 ox3Var2 = null;
        if (px3Var != null) {
            synchronized (px3Var) {
                ox3[] ox3VarArr = px3Var.a;
                if (ox3VarArr != null) {
                    ox3Var2 = ox3VarArr[0];
                }
            }
        }
        if (ox3Var2 != ox3Var) {
            return false;
        }
        return true;
    }
}
