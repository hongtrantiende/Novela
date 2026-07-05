package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ud5  reason: default package */
/* loaded from: classes.dex */
public final class ud5 extends de5 {
    public ud5() {
        super("InRow", 13);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        boolean e = dccVar.e();
        xd5 xd5Var = de5.F;
        yd5 yd5Var = de5.J;
        String[] strArr = ed5.E;
        if (e) {
            ybc ybcVar = (ybc) dccVar;
            String W = ybcVar.W();
            String[] strArr2 = d4b.a;
            if (d4b.c(W, xxe.x)) {
                ed5Var.E();
                ed5Var.R(ybcVar);
                ed5Var.l = de5.L;
                ed5Var.r.add(null);
                return true;
            } else if (d4b.c(W, xxe.F)) {
                if (!ed5Var.M("tr", strArr, null)) {
                    ed5Var.H(this);
                    return false;
                }
                ed5Var.E();
                ed5Var.r();
                ed5Var.l = yd5Var;
                return ed5Var.s(dccVar);
            } else {
                return xd5Var.a(dccVar, ed5Var);
            }
        } else if (dccVar.d()) {
            String W2 = ((xbc) dccVar).W();
            if (W2.equals("tr")) {
                if (!ed5Var.M(W2, strArr, null)) {
                    ed5Var.H(this);
                    return false;
                }
                ed5Var.E();
                ed5Var.r();
                ed5Var.l = yd5Var;
                return true;
            } else if (W2.equals("table")) {
                if (!ed5Var.M("tr", strArr, null)) {
                    ed5Var.H(this);
                    return false;
                }
                ed5Var.E();
                ed5Var.r();
                ed5Var.l = yd5Var;
                return ed5Var.s(dccVar);
            } else {
                String[] strArr3 = d4b.a;
                if (d4b.c(W2, xxe.u)) {
                    if (!ed5Var.M(W2, strArr, null)) {
                        ed5Var.H(this);
                        return false;
                    } else if (!ed5Var.M("tr", strArr, null)) {
                        return false;
                    } else {
                        ed5Var.E();
                        ed5Var.r();
                        ed5Var.l = yd5Var;
                        return ed5Var.s(dccVar);
                    }
                } else if (d4b.c(W2, xxe.G)) {
                    ed5Var.H(this);
                    return false;
                } else {
                    return xd5Var.a(dccVar, ed5Var);
                }
            }
        } else {
            return xd5Var.a(dccVar, ed5Var);
        }
    }
}
