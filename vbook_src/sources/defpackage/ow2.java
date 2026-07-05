package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ow2  reason: default package */
/* loaded from: classes3.dex */
public abstract class ow2 implements k78 {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(ow2.class, "top");
    public final int a;
    public final int b;
    public final AtomicReferenceArray c;
    public final int[] d;
    private volatile /* synthetic */ long top;

    public ow2(int i) {
        if (i > 0) {
            if (i <= 536870911) {
                this.top = 0L;
                int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
                this.a = highestOneBit;
                this.b = Integer.numberOfLeadingZeros(highestOneBit) + 1;
                int i2 = highestOneBit + 1;
                this.c = new AtomicReferenceArray(i2);
                this.d = new int[i2];
                return;
            }
            p1a.k(a82.j(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        p1a.k(a82.j(i, "capacity should be positive but it is "));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
        r6 = 0;
        r1 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C() {
        /*
            r10 = this;
        L0:
            long r2 = r10.top
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto Lc
        L9:
            r6 = r1
            r1 = r10
            goto L2e
        Lc:
            r0 = 32
            long r4 = r2 >> r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r8 = 1
            long r4 = r4 + r8
            long r6 = r6 & r2
            int r6 = (int) r6
            if (r6 != 0) goto L1e
            goto L9
        L1e:
            int[] r1 = r10.d
            r1 = r1[r6]
            long r4 = r4 << r0
            long r0 = (long) r1
            long r4 = r4 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ow2.e
            r1 = r10
            boolean r10 = r0.compareAndSet(r1, r2, r4)
            if (r10 == 0) goto L39
        L2e:
            r10 = 0
            if (r6 != 0) goto L32
            return r10
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.c
            java.lang.Object r10 = r0.getAndSet(r6, r10)
            return r10
        L39:
            r10 = r1
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow2.C():java.lang.Object");
    }

    public void G(Object obj) {
        obj.getClass();
    }

    @Override // defpackage.k78
    public final Object I() {
        Object C = C();
        if (C != null) {
            return o(C);
        }
        return q();
    }

    @Override // defpackage.k78
    public final void R0(Object obj) {
        obj.getClass();
        G(obj);
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.b) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.c;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, null, obj)) {
                ow2 ow2Var = this;
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = ow2Var.a;
                    }
                    i++;
                    this = ow2Var;
                } else {
                    this = ow2Var;
                }
            }
            if (identityHashCode <= 0) {
                vs.m("index should be positive");
                return;
            }
            while (true) {
                long j = this.top;
                long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | identityHashCode;
                this.d[identityHashCode] = (int) (4294967295L & j);
                ow2 ow2Var2 = this;
                if (!e.compareAndSet(ow2Var2, j, j2)) {
                    this = ow2Var2;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.k78
    public final void a() {
        do {
        } while (C() != null);
    }

    public abstract Object q();

    public Object o(Object obj) {
        return obj;
    }
}
