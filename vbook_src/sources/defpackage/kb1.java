package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kb1  reason: default package */
/* loaded from: classes3.dex */
public final class kb1 extends f5a {
    public final xy0 C;
    public final /* synthetic */ AtomicReferenceArray D;

    public kb1(long j, kb1 kb1Var, xy0 xy0Var, int i) {
        super(j, kb1Var, i);
        this.C = xy0Var;
        this.D = new AtomicReferenceArray(zy0.b * 2);
    }

    @Override // defpackage.f5a
    public final int l() {
        return zy0.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        s(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
        if (r1 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
        r4.getClass();
        r6 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
        if (r6 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
        defpackage.que.p(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0057, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    @Override // defpackage.f5a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r7, defpackage.d82 r8) {
        /*
            r6 = this;
            int r0 = defpackage.zy0.b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            int r0 = r7 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r6.D
            java.lang.Object r0 = r2.get(r0)
        L12:
            java.lang.Object r2 = r6.q(r7)
            boolean r3 = r2 instanceof defpackage.zed
            xy0 r4 = r6.C
            r5 = 0
            if (r3 != 0) goto L58
            boolean r3 = r2 instanceof defpackage.afd
            if (r3 == 0) goto L22
            goto L58
        L22:
            lie r3 = defpackage.zy0.j
            if (r2 == r3) goto L48
            lie r3 = defpackage.zy0.k
            if (r2 != r3) goto L2b
            goto L48
        L2b:
            lie r3 = defpackage.zy0.g
            if (r2 == r3) goto L12
            lie r3 = defpackage.zy0.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            lie r6 = defpackage.zy0.i
            if (r2 == r6) goto L79
            lie r6 = defpackage.zy0.d
            if (r2 != r6) goto L3d
            goto L79
        L3d:
            lie r6 = defpackage.zy0.l
            if (r2 != r6) goto L42
            goto L79
        L42:
            java.lang.String r6 = "unexpected state: "
            defpackage.xk5.p(r2, r6)
            return
        L48:
            r6.s(r7, r5)
            if (r1 == 0) goto L79
            r4.getClass()
            xt4 r6 = r4.b
            if (r6 == 0) goto L79
            defpackage.que.p(r6, r0, r8)
            return
        L58:
            if (r1 == 0) goto L5d
            lie r3 = defpackage.zy0.j
            goto L5f
        L5d:
            lie r3 = defpackage.zy0.k
        L5f:
            boolean r2 = r6.p(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.s(r7, r5)
            r2 = r1 ^ 1
            r6.r(r7, r2)
            if (r1 == 0) goto L79
            r4.getClass()
            xt4 r6 = r4.b
            if (r6 == 0) goto L79
            defpackage.que.p(r6, r0, r8)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb1.m(int, d82):void");
    }

    public final boolean p(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.D;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.D.get((i * 2) + 1);
    }

    public final void r(int i, boolean z) {
        if (z) {
            xy0 xy0Var = this.C;
            xy0Var.getClass();
            xy0Var.V((this.e * zy0.b) + i);
        }
        n();
    }

    public final void s(int i, Object obj) {
        this.D.set(i * 2, obj);
    }

    public final void t(int i, Object obj) {
        this.D.set((i * 2) + 1, obj);
    }
}
