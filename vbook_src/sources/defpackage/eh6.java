package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eh6  reason: default package */
/* loaded from: classes.dex */
public final class eh6 extends mq7 implements fd6 {
    public static final ch6 O = new Object();
    public fh6 K;
    public mce L;
    public boolean M;
    public ff8 N;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
        if (r4.N == defpackage.ff8.a) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r4.N == defpackage.ff8.b) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H1(defpackage.ah6 r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L6
            goto L9
        L6:
            r0 = 6
            if (r6 != r0) goto L10
        L9:
            ff8 r0 = r4.N
            ff8 r3 = defpackage.ff8.b
            if (r0 != r3) goto L24
            goto L3b
        L10:
            r0 = 3
            if (r6 != r0) goto L14
            goto L17
        L14:
            r0 = 4
            if (r6 != r0) goto L1e
        L17:
            ff8 r0 = r4.N
            ff8 r3 = defpackage.ff8.a
            if (r0 != r3) goto L24
            goto L3b
        L1e:
            if (r6 != r2) goto L21
            goto L24
        L21:
            r0 = 2
            if (r6 != r0) goto L3c
        L24:
            boolean r6 = r4.I1(r6)
            if (r6 == 0) goto L36
            int r5 = r5.b
            fh6 r4 = r4.K
            int r4 = r4.a()
            int r4 = r4 - r2
            if (r5 >= r4) goto L3b
            goto L3a
        L36:
            int r4 = r5.a
            if (r4 <= 0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        L3c:
            java.lang.String r4 = "Lazy list does not support beyond bounds layout for the specified direction"
            defpackage.vs.k(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh6.H1(ah6, int):boolean");
    }

    public final boolean I1(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 5) {
                    return this.M;
                }
                if (i == 6) {
                    if (this.M) {
                        return false;
                    }
                } else if (i == 3) {
                    int ordinal = voe.v(this).W.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (this.M) {
                                return false;
                            }
                        } else {
                            xk5.o();
                            return false;
                        }
                    } else {
                        return this.M;
                    }
                } else if (i == 4) {
                    int ordinal2 = voe.v(this).W.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            return this.M;
                        }
                        xk5.o();
                        return false;
                    } else if (this.M) {
                        return false;
                    }
                } else {
                    vs.k("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(j);
        return e37Var.q0(M.a, M.b, ls3.a, new a1(M, 10));
    }
}
