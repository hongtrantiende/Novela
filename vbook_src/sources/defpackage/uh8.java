package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uh8  reason: default package */
/* loaded from: classes.dex */
public final class uh8 extends mq7 implements fd6 {
    public rh8 K;

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float b = this.K.b(e37Var.getLayoutDirection());
        float d = this.K.d();
        float c = this.K.c(e37Var.getLayoutDirection());
        float a = this.K.a();
        boolean z4 = false;
        if (rg3.a(b, nae.e) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (rg3.a(d, nae.e) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (rg3.a(c, nae.e) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (rg3.a(a, nae.e) >= 0) {
            z4 = true;
        }
        if (!(z6 & z4)) {
            jv5.a("Padding must be non-negative");
        }
        int X0 = e37Var.X0(b);
        int X02 = e37Var.X0(c) + X0;
        int X03 = e37Var.X0(d);
        int X04 = e37Var.X0(a) + X03;
        mw8 M = w27Var.M(y02.i(-X02, j, -X04));
        return e37Var.q0(y02.g(M.a + X02, j), y02.f(M.b + X04, j), ls3.a, new i52(M, X0, X03, 3));
    }
}
