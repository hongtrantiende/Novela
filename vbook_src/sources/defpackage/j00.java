package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j00  reason: default package */
/* loaded from: classes.dex */
public final class j00 extends mq7 implements fd6 {
    public float K;
    public boolean L;

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.K);
        }
        return w27Var.j(i);
    }

    public final long H1(boolean z, long j) {
        int round;
        int h = x02.h(j);
        if (h != Integer.MAX_VALUE && (round = Math.round(h * this.K)) > 0) {
            if (!z || jsc.I(round, j, h)) {
                return (round << 32) | (h & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long I1(boolean z, long j) {
        int round;
        int i = x02.i(j);
        if (i != Integer.MAX_VALUE && (round = Math.round(i / this.K)) > 0) {
            if (!z || jsc.I(i, j, round)) {
                return (i << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long J1(boolean z, long j) {
        int j2 = x02.j(j);
        int round = Math.round(j2 * this.K);
        if (round > 0) {
            if (!z || jsc.I(round, j, j2)) {
                return (round << 32) | (j2 & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long K1(boolean z, long j) {
        int k = x02.k(j);
        int round = Math.round(k / this.K);
        if (round > 0) {
            if (!z || jsc.I(k, j, round)) {
                return (k << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.K);
        }
        return w27Var.n0(i);
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.K);
        }
        return w27Var.F(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (defpackage.zy5.b(r5, 0) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
        if (defpackage.zy5.b(r5, 0) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bf, code lost:
        r5 = 0;
     */
    @Override // defpackage.fd6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c37 n(defpackage.e37 r8, defpackage.w27 r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.L
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L67
            long r5 = r7.I1(r2, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L14
            goto Lc0
        L14:
            long r5 = r7.H1(r2, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L20
            goto Lc0
        L20:
            long r5 = r7.K1(r2, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L2c
            goto Lc0
        L2c:
            long r5 = r7.J1(r2, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L38
            goto Lc0
        L38:
            long r5 = r7.I1(r1, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L44
            goto Lc0
        L44:
            long r5 = r7.H1(r1, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L50
            goto Lc0
        L50:
            long r5 = r7.K1(r1, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L5c
            goto Lc0
        L5c:
            long r5 = r7.J1(r1, r10)
            boolean r7 = defpackage.zy5.b(r5, r3)
            if (r7 != 0) goto Lbf
            goto Lc0
        L67:
            long r5 = r7.H1(r2, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L72
            goto Lc0
        L72:
            long r5 = r7.I1(r2, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L7d
            goto Lc0
        L7d:
            long r5 = r7.J1(r2, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L88
            goto Lc0
        L88:
            long r5 = r7.K1(r2, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L93
            goto Lc0
        L93:
            long r5 = r7.H1(r1, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto L9e
            goto Lc0
        L9e:
            long r5 = r7.I1(r1, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto La9
            goto Lc0
        La9:
            long r5 = r7.J1(r1, r10)
            boolean r0 = defpackage.zy5.b(r5, r3)
            if (r0 != 0) goto Lb4
            goto Lc0
        Lb4:
            long r5 = r7.K1(r1, r10)
            boolean r7 = defpackage.zy5.b(r5, r3)
            if (r7 != 0) goto Lbf
            goto Lc0
        Lbf:
            r5 = r3
        Lc0:
            boolean r7 = defpackage.zy5.b(r5, r3)
            if (r7 != 0) goto Le6
            r7 = 32
            long r10 = r5 >> r7
            int r7 = (int) r10
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r5
            int r10 = (int) r10
            if (r7 < 0) goto Ld6
            r11 = r2
            goto Ld7
        Ld6:
            r11 = r1
        Ld7:
            if (r10 < 0) goto Lda
            r1 = r2
        Lda:
            r11 = r11 & r1
            if (r11 != 0) goto Le2
            java.lang.String r11 = "width and height must be >= 0"
            defpackage.nv5.a(r11)
        Le2:
            long r10 = defpackage.y02.h(r7, r7, r10, r10)
        Le6:
            mw8 r7 = r9.M(r10)
            int r9 = r7.a
            int r10 = r7.b
            a1 r11 = new a1
            r11.<init>(r7, r2)
            ls3 r7 = defpackage.ls3.a
            c37 r7 = r8.q0(r9, r10, r7, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j00.n(e37, w27, long):c37");
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.K);
        }
        return w27Var.J(i);
    }
}
