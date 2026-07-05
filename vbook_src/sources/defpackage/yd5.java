package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yd5  reason: default package */
/* loaded from: classes.dex */
public final class yd5 extends de5 {
    public yd5() {
        super("InTableBody", 12);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        int ordinal = ((acc) dccVar.c).ordinal();
        xd5 xd5Var = de5.F;
        if (ordinal != 1) {
            if (ordinal != 2) {
                return xd5Var.a(dccVar, ed5Var);
            }
            String W = ((xbc) dccVar).W();
            String[] strArr = d4b.a;
            if (d4b.c(W, xxe.J)) {
                if (!ed5Var.M(W, ed5.E, null)) {
                    ed5Var.H(this);
                    return false;
                }
                ed5Var.C("tbody", "tfoot", "thead", "template");
                ed5Var.r();
                ed5Var.l = xd5Var;
                return true;
            } else if (W.equals("table")) {
                return b(dccVar, ed5Var);
            } else {
                if (d4b.c(W, xxe.E)) {
                    ed5Var.H(this);
                    return false;
                }
                return xd5Var.a(dccVar, ed5Var);
            }
        }
        ybc ybcVar = (ybc) dccVar;
        String W2 = ybcVar.W();
        if (W2.equals("tr")) {
            ed5Var.C("tbody", "tfoot", "thead", "template");
            ed5Var.R(ybcVar);
            ed5Var.l = de5.K;
            return true;
        }
        String[] strArr2 = d4b.a;
        if (d4b.c(W2, xxe.x)) {
            ed5Var.H(this);
            ed5Var.u("tr");
            return ed5Var.s(ybcVar);
        } else if (d4b.c(W2, xxe.D)) {
            return b(dccVar, ed5Var);
        } else {
            return xd5Var.a(dccVar, ed5Var);
        }
    }

    public final boolean b(dcc dccVar, ed5 ed5Var) {
        String[] strArr = ed5.E;
        if (!ed5Var.M("tbody", strArr, null) && !ed5Var.M("thead", strArr, null) && !ed5Var.M("tfoot", ed5.z, null)) {
            ed5Var.H(this);
            return false;
        }
        ed5Var.C("tbody", "tfoot", "thead", "template");
        ed5Var.t(ed5Var.a().e.b);
        return ed5Var.s(dccVar);
    }
}
