package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i11  reason: default package */
/* loaded from: classes3.dex */
public final class i11 implements s11, f31 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(i11.class, Object.class, "suspensionSlot");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public final boolean b;
    private volatile int flushBufferSize;
    public final ly0 c = new Object();
    public final Object d = new Object();
    volatile /* synthetic */ Object suspensionSlot = a11.b;
    public final ly0 e = new Object();
    public final ly0 f = new Object();
    volatile /* synthetic */ Object _closedCause = null;
    private volatile /* synthetic */ Object closeHandler = null;

    static {
        Unsafe unsafe = u4f.a;
        l = unsafe.objectFieldOffset(i11.class.getDeclaredField("suspensionSlot"));
        h = AtomicReferenceFieldUpdater.newUpdater(i11.class, Object.class, "_closedCause");
        j = unsafe.objectFieldOffset(i11.class.getDeclaredField("_closedCause"));
        i = AtomicReferenceFieldUpdater.newUpdater(i11.class, Object.class, "closeHandler");
        k = unsafe.objectFieldOffset(i11.class.getDeclaredField("closeHandler"));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ly0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ly0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ly0, java.lang.Object] */
    public i11(boolean z) {
        this.b = z;
    }

    @Override // defpackage.s11, defpackage.f31
    public final void a(Throwable th) {
        i11 i11Var;
        Throwable ik1Var;
        if (this._closedCause != null) {
            return;
        }
        fk1 fk1Var = new fk1(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = u4f.a;
            long j2 = j;
            i11Var = this;
            if (!unsafe.compareAndSwapObject(i11Var, j2, (Object) null, fk1Var) && unsafe.getObjectVolatile(i11Var, j2) == null) {
                this = i11Var;
            }
        }
        Throwable th2 = fk1Var.a;
        if (th2 == null) {
            ik1Var = null;
        } else if (th2 instanceof c72) {
            ik1Var = ((c72) th2).a();
        } else if (th2 instanceof CancellationException) {
            ik1Var = nye.b(((CancellationException) th2).getMessage(), fk1Var.a);
        } else {
            ik1Var = new ik1(th2);
        }
        i11Var.l(ik1Var);
    }

    @Override // defpackage.s11, defpackage.f31
    public final Throwable b() {
        Throwable th;
        fk1 fk1Var = (fk1) this._closedCause;
        if (fk1Var != null && (th = fk1Var.a) != null) {
            if (th instanceof c72) {
                return ((c72) th).a();
            }
            if (th instanceof CancellationException) {
                return nye.b(((CancellationException) th).getMessage(), fk1Var.a);
            }
            return new ik1(th);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0127 -> B:67:0x0129). Please submit an issue!!! */
    @Override // defpackage.f31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i11.c(n42):java.lang.Object");
    }

    @Override // defpackage.f31
    public final boolean d() {
        if (this._closedCause != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0148 -> B:66:0x014a). Please submit an issue!!! */
    @Override // defpackage.s11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r22, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i11.e(int, n42):java.lang.Object");
    }

    @Override // defpackage.f31
    public final zma f() {
        Throwable ik1Var;
        if (d()) {
            fk1 fk1Var = (fk1) this._closedCause;
            if (fk1Var != null) {
                Throwable th = fk1Var.a;
                if (th == null) {
                    ik1Var = null;
                } else if (th instanceof c72) {
                    ik1Var = ((c72) th).a();
                } else if (th instanceof CancellationException) {
                    ik1Var = nye.b(((CancellationException) th).getMessage(), fk1Var.a);
                } else {
                    ik1Var = new ik1(th);
                }
                if (ik1Var != null) {
                    throw ik1Var;
                }
            }
            throw new IOException(null, null);
        }
        return this.f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:25|26))(4:27|28|29|(1:31))|11|12|(2:13|(3:21|22|23)(2:15|(2:18|19)(1:17)))))|33|6|7|(0)(0)|11|12|(3:13|(0)(0)|17)) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f A[SYNTHETIC] */
    @Override // defpackage.f31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.m42 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.h11
            if (r0 == 0) goto L13
            r0 = r10
            h11 r0 = (defpackage.h11) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            h11 r0 = new h11
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L26:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r2
        L2c:
            defpackage.hre.r(r10)
            r0.c = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r10 = r9.c(r0)     // Catch: java.lang.Throwable -> L3a
            n82 r0 = defpackage.n82.a
            if (r10 != r0) goto L3a
            return r0
        L3a:
            fk1 r8 = defpackage.obe.a
        L3c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = defpackage.i11.h
            r10.getClass()
            sun.misc.Unsafe r3 = defpackage.u4f.a
            long r5 = defpackage.i11.j
            r7 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            pvc r10 = defpackage.pvc.a
            if (r9 == 0) goto L53
            r4.l(r2)
            return r10
        L53:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r5)
            if (r9 == 0) goto L5a
            return r10
        L5a:
            r9 = r4
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i11.g(m42):java.lang.Object");
    }

    @Override // defpackage.s11
    public final ly0 h() {
        Throwable ik1Var;
        fk1 fk1Var = (fk1) this._closedCause;
        if (fk1Var != null) {
            Throwable th = fk1Var.a;
            if (th == null) {
                ik1Var = null;
            } else if (th instanceof c72) {
                ik1Var = ((c72) th).a();
            } else if (th instanceof CancellationException) {
                ik1Var = nye.b(((CancellationException) th).getMessage(), fk1Var.a);
            } else {
                ik1Var = new ik1(th);
            }
            if (ik1Var != null) {
                throw ik1Var;
            }
        }
        if (this.e.k()) {
            o();
        }
        return this.e;
    }

    @Override // defpackage.s11
    public final boolean i() {
        if (b() == null) {
            if (!d() || this.flushBufferSize != 0 || !this.e.k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.f31
    public final boolean j() {
        return this.b;
    }

    public final void k() {
        m();
        fk1 fk1Var = obe.a;
        while (true) {
            h.getClass();
            Unsafe unsafe = u4f.a;
            long j2 = j;
            i11 i11Var = this;
            if (unsafe.compareAndSwapObject(i11Var, j2, (Object) null, fk1Var)) {
                i11Var.l(null);
                return;
            } else if (unsafe.getObjectVolatile(i11Var, j2) != null) {
                return;
            } else {
                this = i11Var;
            }
        }
    }

    public final void l(Throwable th) {
        z01 z01Var;
        if (th != null) {
            z01Var = new z01(th);
        } else {
            e11.a.getClass();
            z01Var = kh5.M;
        }
        g.getClass();
        Unsafe unsafe = u4f.a;
        e11 e11Var = (e11) unsafe.getAndSetObject(this, l, z01Var);
        if (e11Var instanceof c11) {
            ((c11) e11Var).a(th);
        }
        i.getClass();
        xt4 xt4Var = (xt4) unsafe.getAndSetObject(this, k, (Object) null);
        if (xt4Var != null) {
            xt4Var.invoke(th);
        }
    }

    public final void m() {
        if (!this.f.k()) {
            synchronized (this.d) {
                ly0 ly0Var = this.f;
                this.c.D0(ly0Var);
                this.flushBufferSize += (int) ly0Var.c;
            }
            e11 e11Var = (e11) this.suspensionSlot;
            if (e11Var instanceof b11) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                a11 a11Var = a11.b;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = u4f.a;
                    long j2 = l;
                    i11 i11Var = this;
                    if (unsafe.compareAndSwapObject(i11Var, j2, e11Var, a11Var)) {
                        ((c11) e11Var).b();
                        return;
                    } else if (unsafe.getObjectVolatile(i11Var, j2) == e11Var) {
                        this = i11Var;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void n(n11 n11Var) {
        Unsafe unsafe;
        long j2;
        fk1 fk1Var = (fk1) this._closedCause;
        Throwable th = null;
        if (fk1Var != null) {
            Throwable th2 = fk1Var.a;
            if (th2 != null) {
                if (th2 instanceof c72) {
                    th = ((c72) th2).a();
                } else if (th2 instanceof CancellationException) {
                    th = nye.b(((CancellationException) th2).getMessage(), fk1Var.a);
                } else {
                    th = new ik1(th2);
                }
            }
            n11Var.invoke(th);
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe2 = u4f.a;
            long j3 = k;
            i11 i11Var = this;
            n11 n11Var2 = n11Var;
            if (unsafe2.compareAndSwapObject(i11Var, j3, (Object) null, n11Var2)) {
                fk1 fk1Var2 = (fk1) i11Var._closedCause;
                if (fk1Var2 != null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
                    do {
                        atomicReferenceFieldUpdater2.getClass();
                        unsafe = u4f.a;
                        j2 = k;
                        n11 n11Var3 = n11Var2;
                        n11Var2 = n11Var3;
                        if (unsafe.compareAndSwapObject(i11Var, j2, n11Var3, (Object) null)) {
                            Throwable th3 = fk1Var2.a;
                            if (th3 != null) {
                                if (th3 instanceof c72) {
                                    th = ((c72) th3).a();
                                } else if (th3 instanceof CancellationException) {
                                    th = nye.b(((CancellationException) th3).getMessage(), fk1Var2.a);
                                } else {
                                    th = new ik1(th3);
                                }
                            }
                            n11Var2.invoke(th);
                            return;
                        }
                    } while (unsafe.getObjectVolatile(i11Var, j2) == n11Var2);
                    return;
                }
                return;
            } else if (unsafe2.getObjectVolatile(i11Var, j3) == null) {
                this = i11Var;
                n11Var = n11Var2;
            } else {
                vs.k("Only one invokeOnClose handler is supported per channel");
                return;
            }
        }
    }

    public final void o() {
        synchronized (this.d) {
            this.c.V(this.e);
            this.flushBufferSize = 0;
        }
        e11 e11Var = (e11) this.suspensionSlot;
        if (e11Var instanceof d11) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            a11 a11Var = a11.b;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = u4f.a;
                long j2 = l;
                i11 i11Var = this;
                if (unsafe.compareAndSwapObject(i11Var, j2, e11Var, a11Var)) {
                    ((c11) e11Var).b();
                    return;
                } else if (unsafe.getObjectVolatile(i11Var, j2) == e11Var) {
                    this = i11Var;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
