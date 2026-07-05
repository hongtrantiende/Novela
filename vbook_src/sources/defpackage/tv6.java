package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tv6  reason: default package */
/* loaded from: classes3.dex */
public class tv6 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(tv6.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = u4f.a;
        d = unsafe.objectFieldOffset(tv6.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(tv6.class, Object.class, "_prev$volatile");
        e = unsafe.objectFieldOffset(tv6.class.getDeclaredField("_prev$volatile"));
        c = AtomicReferenceFieldUpdater.newUpdater(tv6.class, Object.class, "_removedRef$volatile");
        f = unsafe.objectFieldOffset(tv6.class.getDeclaredField("_removedRef$volatile"));
    }

    public static tv6 h(tv6 tv6Var) {
        while (tv6Var.m()) {
            b.getClass();
            tv6Var = (tv6) u4f.a.getObjectVolatile(tv6Var, e);
        }
        return tv6Var;
    }

    public final boolean d(tv6 tv6Var, int i) {
        tv6 l;
        do {
            l = l();
            if (l instanceof lq6) {
                if ((((lq6) l).C & i) != 0 || !l.d(tv6Var, i)) {
                    return false;
                }
                return true;
            }
        } while (!l.e(tv6Var, this));
        return true;
    }

    public final boolean e(tv6 tv6Var, tv6 tv6Var2) {
        b.getClass();
        Unsafe unsafe = u4f.a;
        unsafe.putObjectVolatile(tv6Var, e, this);
        a.getClass();
        long j = d;
        unsafe.putObjectVolatile(tv6Var, j, tv6Var2);
        while (true) {
            Unsafe unsafe2 = u4f.a;
            tv6 tv6Var3 = this;
            tv6 tv6Var4 = tv6Var;
            tv6 tv6Var5 = tv6Var2;
            if (unsafe2.compareAndSwapObject(tv6Var3, d, tv6Var5, tv6Var4)) {
                tv6Var4.i(tv6Var5);
                return true;
            } else if (unsafe2.getObjectVolatile(tv6Var3, j) != tv6Var5) {
                return false;
            } else {
                this = tv6Var3;
                tv6Var2 = tv6Var5;
                tv6Var = tv6Var4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.p38 r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.tv6.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r1 = defpackage.tv6.e
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.tv6.a
            r1.getClass()
            long r1 = defpackage.tv6.d
            r0.putObjectVolatile(r10, r1, r9)
        L16:
            java.lang.Object r0 = r9.j()
            if (r0 == r9) goto L1d
            return
        L1d:
            sun.misc.Unsafe r3 = defpackage.u4f.a
            long r5 = defpackage.tv6.d
            r7 = r9
            r4 = r9
            r8 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2e
            r8.i(r4)
            return
        L2e:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r4) goto L37
            r9 = r4
            r10 = r8
            goto L16
        L37:
            r9 = r4
            r10 = r8
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.f(p38):void");
    }

    public final tv6 g() {
        tv6 tv6Var;
        tv6 tv6Var2;
        Unsafe unsafe;
        loop0: while (true) {
            b.getClass();
            Unsafe unsafe2 = u4f.a;
            long j = e;
            tv6 tv6Var3 = (tv6) unsafe2.getObjectVolatile(this, j);
            tv6 tv6Var4 = null;
            tv6Var = tv6Var3;
            while (true) {
                a.getClass();
                if (tv6Var != null) {
                    Unsafe unsafe3 = u4f.a;
                    long j2 = d;
                    Object objectVolatile = unsafe3.getObjectVolatile(tv6Var, j2);
                    if (objectVolatile == this) {
                        if (tv6Var3 == tv6Var) {
                            break;
                        }
                        while (true) {
                            Unsafe unsafe4 = u4f.a;
                            tv6 tv6Var5 = this;
                            boolean compareAndSwapObject = unsafe4.compareAndSwapObject(tv6Var5, e, tv6Var3, tv6Var);
                            tv6 tv6Var6 = tv6Var3;
                            tv6Var2 = tv6Var5;
                            if (compareAndSwapObject) {
                                break loop0;
                            } else if (unsafe4.getObjectVolatile(tv6Var2, j) != tv6Var6) {
                                break;
                            } else {
                                this = tv6Var2;
                                tv6Var3 = tv6Var6;
                            }
                        }
                    } else {
                        tv6 tv6Var7 = tv6Var3;
                        tv6Var2 = this;
                        if (tv6Var2.m()) {
                            return null;
                        }
                        if (objectVolatile instanceof vn9) {
                            if (tv6Var4 != null) {
                                tv6 tv6Var8 = ((vn9) objectVolatile).a;
                                do {
                                    tv6 tv6Var9 = tv6Var;
                                    unsafe = u4f.a;
                                    boolean compareAndSwapObject2 = unsafe.compareAndSwapObject(tv6Var4, d, tv6Var9, tv6Var8);
                                    tv6Var = tv6Var9;
                                    if (compareAndSwapObject2) {
                                        this = tv6Var2;
                                        tv6Var = tv6Var4;
                                        tv6Var3 = tv6Var7;
                                        tv6Var4 = null;
                                    }
                                } while (unsafe.getObjectVolatile(tv6Var4, j2) == tv6Var);
                            } else if (tv6Var != null) {
                                tv6Var = (tv6) unsafe3.getObjectVolatile(tv6Var, j);
                            } else {
                                vm1.h();
                                return null;
                            }
                        } else {
                            objectVolatile.getClass();
                            tv6Var4 = tv6Var;
                            tv6Var = (tv6) objectVolatile;
                        }
                        this = tv6Var2;
                        tv6Var3 = tv6Var7;
                    }
                } else {
                    vm1.h();
                    return null;
                }
            }
            this = tv6Var2;
        }
        return tv6Var;
    }

    public final void i(tv6 tv6Var) {
        tv6 tv6Var2;
        while (true) {
            b.getClass();
            if (tv6Var != null) {
                Unsafe unsafe = u4f.a;
                long j = e;
                tv6 tv6Var3 = (tv6) unsafe.getObjectVolatile(tv6Var, j);
                if (this.j() == tv6Var) {
                    while (tv6Var != null) {
                        Unsafe unsafe2 = u4f.a;
                        tv6Var2 = this;
                        tv6 tv6Var4 = tv6Var;
                        if (unsafe2.compareAndSwapObject(tv6Var4, e, tv6Var3, tv6Var2)) {
                            if (tv6Var2.m()) {
                                tv6Var4.g();
                                return;
                            }
                            return;
                        } else if (tv6Var4 != null) {
                            tv6Var = tv6Var4;
                            if (unsafe2.getObjectVolatile(tv6Var4, j) != tv6Var3) {
                                break;
                            }
                            this = tv6Var2;
                        } else {
                            vm1.h();
                            return;
                        }
                    }
                    vm1.h();
                    return;
                }
                return;
            }
            vm1.h();
            return;
            this = tv6Var2;
        }
    }

    public final Object j() {
        a.getClass();
        return u4f.a.getObjectVolatile(this, d);
    }

    public final tv6 k() {
        vn9 vn9Var;
        Object j = j();
        if (j instanceof vn9) {
            vn9Var = (vn9) j;
        } else {
            vn9Var = null;
        }
        if (vn9Var != null) {
            return vn9Var.a;
        }
        j.getClass();
        return (tv6) j;
    }

    public final tv6 l() {
        tv6 g = g();
        if (g == null) {
            b.getClass();
            return h((tv6) u4f.a.getObjectVolatile(this, e));
        }
        return g;
    }

    public boolean m() {
        return j() instanceof vn9;
    }

    public final tv6 n() {
        tv6 tv6Var;
        while (true) {
            Object j = this.j();
            if (j instanceof vn9) {
                return ((vn9) j).a;
            }
            if (j == this) {
                return (tv6) j;
            }
            j.getClass();
            tv6 tv6Var2 = (tv6) j;
            vn9 o = tv6Var2.o();
            while (true) {
                a.getClass();
                Unsafe unsafe = u4f.a;
                long j2 = d;
                tv6Var = this;
                if (unsafe.compareAndSwapObject(tv6Var, j2, j, o)) {
                    tv6Var2.g();
                    return null;
                } else if (unsafe.getObjectVolatile(tv6Var, j2) != j) {
                    break;
                } else {
                    this = tv6Var;
                }
            }
            this = tv6Var;
        }
    }

    public final vn9 o() {
        c.getClass();
        Unsafe unsafe = u4f.a;
        long j = f;
        vn9 vn9Var = (vn9) unsafe.getObjectVolatile(this, j);
        if (vn9Var == null) {
            vn9 vn9Var2 = new vn9(this);
            unsafe.putObjectVolatile(this, j, vn9Var2);
            return vn9Var2;
        }
        return vn9Var;
    }

    public String toString() {
        return new xf6(1, 4, nq2.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + nq2.y(this);
    }
}
