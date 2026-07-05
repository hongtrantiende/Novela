package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sw7  reason: default package */
/* loaded from: classes3.dex */
public final class sw7 extends p8a implements qw7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(sw7.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long G = u4f.a.objectFieldOffset(sw7.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public sw7() {
        super(1);
        this.owner$volatile = tw7.a;
    }

    public final boolean e() {
        if (Math.max(p8a.C.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        int g = g();
        if (g == 0) {
            return true;
        }
        if (g != 1) {
            if (g != 2) {
                vs.k("unexpected");
                return false;
            }
            cy7.a("This mutex is already locked by the specified owner: null");
            return false;
        }
        return false;
    }

    public final int g() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p8a.C;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else if (i2 <= 0) {
                return 1;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    F.getClass();
                    u4f.a.putObjectVolatile(this, G, (Object) null);
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        r5 = defpackage.sw7.F;
        r2 = r0.b;
        r5.set(r2, null);
        r5 = r0.a;
        r5.D(r1, r5.c, new defpackage.qo4(new defpackage.cl7(5, r2, r0), 6));
     */
    @Override // defpackage.qw7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.m42 r6) {
        /*
            r5 = this;
            boolean r0 = r5.f()
            pvc r1 = defpackage.pvc.a
            if (r0 == 0) goto L9
            goto L51
        L9:
            m42 r6 = defpackage.w92.t(r6)
            f61 r6 = defpackage.pbe.j(r6)
            rw7 r0 = new rw7     // Catch: java.lang.Throwable -> L52
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L52
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.p8a.C     // Catch: java.lang.Throwable -> L52
            int r2 = r2.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L52
            int r3 = r5.a     // Catch: java.lang.Throwable -> L52
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.sw7.F     // Catch: java.lang.Throwable -> L52
            sw7 r2 = r0.b     // Catch: java.lang.Throwable -> L52
            r3 = 0
            r5.set(r2, r3)     // Catch: java.lang.Throwable -> L52
            f61 r5 = r0.a     // Catch: java.lang.Throwable -> L52
            cl7 r3 = new cl7     // Catch: java.lang.Throwable -> L52
            r4 = 5
            r3.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L52
            int r0 = r5.c     // Catch: java.lang.Throwable -> L52
            qo4 r2 = new qo4     // Catch: java.lang.Throwable -> L52
            r4 = 6
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L52
            r5.D(r1, r0, r2)     // Catch: java.lang.Throwable -> L52
            goto L44
        L3e:
            boolean r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L16
        L44:
            java.lang.Object r5 = r6.s()
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L4d
            goto L4e
        L4d:
            r5 = r1
        L4e:
            if (r5 != r6) goto L51
            return r5
        L51:
            return r1
        L52:
            r5 = move-exception
            r6.B()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw7.o(m42):java.lang.Object");
    }

    @Override // defpackage.qw7
    public final void q(Object obj) {
        while (this.e()) {
            F.getClass();
            Unsafe unsafe = u4f.a;
            long j = G;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            lie lieVar = tw7.a;
            if (objectVolatile != lieVar) {
                if (objectVolatile != obj && obj != null) {
                    xk5.l("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = u4f.a;
                    sw7 sw7Var = this;
                    if (unsafe2.compareAndSwapObject(sw7Var, G, objectVolatile, lieVar)) {
                        sw7Var.c();
                        return;
                    } else if (unsafe2.getObjectVolatile(sw7Var, j) != objectVolatile) {
                        this = sw7Var;
                        break;
                    } else {
                        this = sw7Var;
                    }
                }
            }
        }
        vs.k("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(nq2.y(this));
        sb.append("[isLocked=");
        sb.append(e());
        sb.append(",owner=");
        F.getClass();
        sb.append(u4f.a.getObjectVolatile(this, G));
        sb.append(']');
        return sb.toString();
    }
}
