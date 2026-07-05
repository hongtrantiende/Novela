package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qd5  reason: default package */
/* loaded from: classes.dex */
public final class qd5 extends de5 {
    public qd5() {
        super("InColumnGroup", 11);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (lh9.p(de5.a, dccVar)) {
            ed5Var.O((tbc) dccVar, false);
            return true;
        }
        int ordinal = ((acc) dccVar.c).ordinal();
        if (ordinal != 0) {
            sd5 sd5Var = de5.e;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 6) {
                            return b(dccVar, ed5Var);
                        }
                        if (ed5Var.b("html")) {
                            return true;
                        }
                        return b(dccVar, ed5Var);
                    }
                    ed5Var.Q((ubc) dccVar);
                    return true;
                }
                String W = ((xbc) dccVar).W();
                if (W.equals("colgroup")) {
                    if (!ed5Var.b(W)) {
                        ed5Var.H(this);
                        return false;
                    }
                    ed5Var.r();
                    ed5Var.l = de5.F;
                    return true;
                } else if (W.equals("template")) {
                    sd5Var.a(dccVar, ed5Var);
                    return true;
                } else {
                    return b(dccVar, ed5Var);
                }
            }
            ybc ybcVar = (ybc) dccVar;
            String W2 = ybcVar.W();
            int hashCode = W2.hashCode();
            if (hashCode != -1321546630) {
                if (hashCode != 98688) {
                    if (hashCode == 3213227 && W2.equals("html")) {
                        return de5.D.a(dccVar, ed5Var);
                    }
                } else if (W2.equals("col")) {
                    ed5Var.S(ybcVar);
                    return true;
                }
            } else if (W2.equals("template")) {
                sd5Var.a(dccVar, ed5Var);
                return true;
            }
            return b(dccVar, ed5Var);
        }
        ed5Var.H(this);
        return true;
    }

    public final boolean b(dcc dccVar, ed5 ed5Var) {
        if (!ed5Var.b("colgroup")) {
            ed5Var.H(this);
            return false;
        }
        ed5Var.r();
        ed5Var.l = de5.F;
        ed5Var.s(dccVar);
        return true;
    }
}
