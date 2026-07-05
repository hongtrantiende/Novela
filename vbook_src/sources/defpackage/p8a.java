package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p8a  reason: default package */
/* loaded from: classes3.dex */
public class p8a {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C;
    public static final /* synthetic */ long D;
    public static final /* synthetic */ long E;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(p8a.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final pl7 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = u4f.a;
        D = unsafe.objectFieldOffset(p8a.class.getDeclaredField("head$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(p8a.class, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(p8a.class, Object.class, "tail$volatile");
        E = unsafe.objectFieldOffset(p8a.class.getDeclaredField("tail$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(p8a.class, "enqIdx$volatile");
        C = AtomicIntegerFieldUpdater.newUpdater(p8a.class, "_availablePermits$volatile");
    }

    public p8a(int i) {
        this.a = i;
        if (i > 0) {
            if (i >= 0) {
                s8a s8aVar = new s8a(0L, null, 2);
                this.head$volatile = s8aVar;
                this.tail$volatile = s8aVar;
                this._availablePermits$volatile = i;
                this.b = new pl7(this, 9);
                return;
            }
            p1a.k(a82.j(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        p1a.k(a82.j(i, "Semaphore should have at least 1 permit, but had "));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        r5.m(r3, r4.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.p8a.C
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.a
            if (r1 > r2) goto L0
            pvc r3 = defpackage.pvc.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            m42 r5 = defpackage.w92.t(r5)
            f61 r5 = defpackage.pbe.j(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            pl7 r4 = r4.b     // Catch: java.lang.Throwable -> L3f
            r5.m(r3, r4)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r4 = r5.s()
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != r5) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            r4 = move-exception
            r5.B()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p8a.a(n42):java.lang.Object");
    }

    public final boolean b(zed zedVar) {
        Object a;
        Unsafe unsafe;
        p8a p8aVar = this;
        e.getClass();
        Unsafe unsafe2 = u4f.a;
        long j = E;
        s8a s8aVar = (s8a) unsafe2.getObjectVolatile(p8aVar, j);
        long andIncrement = f.getAndIncrement(p8aVar);
        n8a n8aVar = n8a.a;
        long j2 = andIncrement / r8a.f;
        loop0: while (true) {
            a = sy1.a(s8aVar, j2, n8aVar);
            if (aye.n(a)) {
                break;
            }
            f5a l = aye.l(a);
            while (true) {
                f5a f5aVar = (f5a) u4f.a.getObjectVolatile(p8aVar, j);
                if (f5aVar.e >= l.e) {
                    p8aVar = this;
                    break loop0;
                } else if (!l.o()) {
                    break;
                } else {
                    do {
                        unsafe = u4f.a;
                        p8aVar = this;
                        if (unsafe.compareAndSwapObject(p8aVar, E, f5aVar, l)) {
                            if (f5aVar.k()) {
                                f5aVar.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(p8aVar, j) == f5aVar);
                    if (l.k()) {
                        l.i();
                    }
                }
            }
            p8aVar = this;
        }
        s8a s8aVar2 = (s8a) aye.l(a);
        AtomicReferenceArray atomicReferenceArray = s8aVar2.C;
        int i = (int) (andIncrement % r8a.f);
        while (!atomicReferenceArray.compareAndSet(i, null, zedVar)) {
            if (atomicReferenceArray.get(i) != null) {
                lie lieVar = r8a.b;
                lie lieVar2 = r8a.c;
                while (!atomicReferenceArray.compareAndSet(i, lieVar, lieVar2)) {
                    if (atomicReferenceArray.get(i) != lieVar) {
                        return false;
                    }
                }
                ((e61) zedVar).m(pvc.a, p8aVar.b);
                return true;
            }
        }
        zedVar.b(s8aVar2, i);
        return true;
    }

    public final void c() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement < i2) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                cp8.j(i2, "The number of released permits cannot be greater than ");
                return;
            }
        } while (!d());
    }

    public final boolean d() {
        Object a;
        Unsafe unsafe;
        c.getClass();
        Unsafe unsafe2 = u4f.a;
        long j = D;
        s8a s8aVar = (s8a) unsafe2.getObjectVolatile(this, j);
        long andIncrement = d.getAndIncrement(this);
        long j2 = andIncrement / r8a.f;
        o8a o8aVar = o8a.a;
        loop0: while (true) {
            a = sy1.a(s8aVar, j2, o8aVar);
            if (aye.n(a)) {
                break;
            }
            f5a l = aye.l(a);
            while (true) {
                f5a f5aVar = (f5a) u4f.a.getObjectVolatile(this, j);
                if (f5aVar.e >= l.e) {
                    break loop0;
                } else if (!l.o()) {
                    break;
                } else {
                    do {
                        unsafe = u4f.a;
                        if (unsafe.compareAndSwapObject(this, D, f5aVar, l)) {
                            if (f5aVar.k()) {
                                f5aVar.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j) == f5aVar);
                    if (l.k()) {
                        l.i();
                    }
                }
            }
        }
        s8a s8aVar2 = (s8a) aye.l(a);
        AtomicReferenceArray atomicReferenceArray = s8aVar2.C;
        s8aVar2.b();
        boolean z = false;
        if (s8aVar2.e <= j2) {
            int i = (int) (andIncrement % r8a.f);
            Object andSet = atomicReferenceArray.getAndSet(i, r8a.b);
            if (andSet == null) {
                int i2 = r8a.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == r8a.c) {
                        return true;
                    }
                }
                lie lieVar = r8a.b;
                lie lieVar2 = r8a.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, lieVar, lieVar2)) {
                        z = true;
                        break;
                    } else if (atomicReferenceArray.get(i) != lieVar) {
                        break;
                    }
                }
                return !z;
            } else if (andSet != r8a.e) {
                boolean z2 = andSet instanceof e61;
                pvc pvcVar = pvc.a;
                if (z2) {
                    e61 e61Var = (e61) andSet;
                    lie g = e61Var.g(pvcVar, this.b);
                    if (g != null) {
                        e61Var.n(g);
                        return true;
                    }
                } else if (andSet instanceof w5a) {
                    return ((w5a) andSet).j(this, pvcVar);
                } else {
                    xk5.p(andSet, "unexpected: ");
                    return false;
                }
            }
        }
        return false;
    }
}
