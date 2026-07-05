package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: af4  reason: default package */
/* loaded from: classes.dex */
public final class af4 extends mq7 implements fd6 {
    public j73 K;
    public float L;

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        int k;
        int i;
        int i2;
        int i3;
        if (x02.e(j) && this.K != j73.a) {
            int round = Math.round(x02.i(j) * this.L);
            int k2 = x02.k(j);
            k = x02.i(j);
            if (round < k2) {
                round = k2;
            }
            if (round <= k) {
                k = round;
            }
            i = k;
        } else {
            k = x02.k(j);
            i = x02.i(j);
        }
        if (x02.d(j) && this.K != j73.b) {
            int round2 = Math.round(x02.h(j) * this.L);
            int j2 = x02.j(j);
            i2 = x02.h(j);
            if (round2 < j2) {
                round2 = j2;
            }
            if (round2 <= i2) {
                i2 = round2;
            }
            i3 = i2;
        } else {
            int j3 = x02.j(j);
            int h = x02.h(j);
            i2 = j3;
            i3 = h;
        }
        mw8 M = w27Var.M(y02.a(k, i, i2, i3));
        return e37Var.q0(M.a, M.b, ls3.a, new a1(M, 7));
    }
}
