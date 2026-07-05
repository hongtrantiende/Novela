package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pd5  reason: default package */
/* loaded from: classes.dex */
public final class pd5 extends de5 {
    public pd5() {
        super("InCell", 14);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        boolean d = dccVar.d();
        nd5 nd5Var = de5.D;
        String[] strArr = ed5.E;
        if (d) {
            String W = ((xbc) dccVar).W();
            String[] strArr2 = d4b.a;
            if (d4b.c(W, xxe.x)) {
                boolean M = ed5Var.M(W, strArr, null);
                ud5 ud5Var = de5.K;
                if (!M) {
                    ed5Var.H(this);
                    ed5Var.l = ud5Var;
                    return false;
                }
                ed5Var.J(false);
                if (!ed5Var.b(W)) {
                    ed5Var.H(this);
                }
                ed5Var.Z(W);
                ed5Var.B();
                ed5Var.l = ud5Var;
                return true;
            } else if (d4b.c(W, xxe.y)) {
                ed5Var.H(this);
                return false;
            } else if (d4b.c(W, xxe.z)) {
                if (!ed5Var.M(W, strArr, null)) {
                    ed5Var.H(this);
                    return false;
                }
                if (ed5Var.M("td", strArr, null)) {
                    ed5Var.t("td");
                } else {
                    ed5Var.t("th");
                }
                return ed5Var.s(dccVar);
            } else {
                return nd5Var.a(dccVar, ed5Var);
            }
        }
        if (dccVar.e()) {
            String[] strArr3 = d4b.a;
            if (d4b.c(((ybc) dccVar).W(), xxe.A)) {
                if (!ed5Var.M("td", strArr, null) && !ed5Var.M("th", strArr, null)) {
                    ed5Var.H(this);
                    return false;
                }
                if (ed5Var.M("td", strArr, null)) {
                    ed5Var.t("td");
                } else {
                    ed5Var.t("th");
                }
                return ed5Var.s(dccVar);
            }
        }
        return nd5Var.a(dccVar, ed5Var);
    }
}
