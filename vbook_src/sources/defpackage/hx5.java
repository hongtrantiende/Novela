package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hx5  reason: default package */
/* loaded from: classes.dex */
public class hx5 extends ex5 implements fd6 {
    public qid M;

    public hx5(qid qidVar) {
        this.M = qidVar;
    }

    @Override // defpackage.ex5
    public final qid H1(qid qidVar) {
        return new ovc(qidVar, this.M);
    }

    @Override // defpackage.ex5
    public final void I1() {
        super.I1();
        ube.y(this);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        int d = this.L.d(e37Var, e37Var.getLayoutDirection()) - this.K.d(e37Var, e37Var.getLayoutDirection());
        int a = this.L.a(e37Var) - this.K.a(e37Var);
        int b = (this.L.b(e37Var, e37Var.getLayoutDirection()) - this.K.b(e37Var, e37Var.getLayoutDirection())) + d;
        int c = (this.L.c(e37Var) - this.K.c(e37Var)) + a;
        mw8 M = w27Var.M(y02.i(-b, j, -c));
        return e37Var.q0(y02.g(M.a + b, j), y02.f(M.b + c, j), ls3.a, new i52(M, d, a, 1));
    }
}
