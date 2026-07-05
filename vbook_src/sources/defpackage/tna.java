package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tna  reason: default package */
/* loaded from: classes.dex */
public final class tna extends mq7 implements fd6 {
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        long H1 = H1(ry6Var);
        if (x02.f(H1)) {
            return x02.h(H1);
        }
        if (!this.O) {
            i = y02.g(i, H1);
        }
        return y02.f(w27Var.j(i), H1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r4 != Integer.MAX_VALUE) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long H1(defpackage.e37 r7) {
        /*
            r6 = this;
            float r0 = r6.M
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.M
            int r0 = r7.X0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.N
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.N
            int r3 = r7.X0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.K
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.K
            int r4 = r7.X0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.L
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.L
            int r6 = r7.X0(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = defpackage.y02.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tna.H1(e37):long");
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        long H1 = H1(ry6Var);
        if (x02.f(H1)) {
            return x02.h(H1);
        }
        if (!this.O) {
            i = y02.g(i, H1);
        }
        return y02.f(w27Var.n0(i), H1);
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        long H1 = H1(ry6Var);
        if (x02.g(H1)) {
            return x02.i(H1);
        }
        if (!this.O) {
            i = y02.f(i, H1);
        }
        return y02.g(w27Var.F(i), H1);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        int k;
        int i;
        int j2;
        int h;
        long a;
        long H1 = H1(e37Var);
        if (this.O) {
            a = y02.e(j, H1);
        } else {
            if (!Float.isNaN(this.K)) {
                k = x02.k(H1);
            } else {
                k = x02.k(j);
                int i2 = x02.i(H1);
                if (k > i2) {
                    k = i2;
                }
            }
            if (!Float.isNaN(this.M)) {
                i = x02.i(H1);
            } else {
                i = x02.i(j);
                int k2 = x02.k(H1);
                if (i < k2) {
                    i = k2;
                }
            }
            if (!Float.isNaN(this.L)) {
                j2 = x02.j(H1);
            } else {
                j2 = x02.j(j);
                int h2 = x02.h(H1);
                if (j2 > h2) {
                    j2 = h2;
                }
            }
            if (!Float.isNaN(this.N)) {
                h = x02.h(H1);
            } else {
                h = x02.h(j);
                int j3 = x02.j(H1);
                if (h < j3) {
                    h = j3;
                }
            }
            a = y02.a(k, i, j2, h);
        }
        mw8 M = w27Var.M(a);
        return e37Var.q0(M.a, M.b, ls3.a, new a1(M, 13));
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        long H1 = H1(ry6Var);
        if (x02.g(H1)) {
            return x02.i(H1);
        }
        if (!this.O) {
            i = y02.f(i, H1);
        }
        return y02.g(w27Var.J(i), H1);
    }
}
