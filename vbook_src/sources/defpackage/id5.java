package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: id5  reason: default package */
/* loaded from: classes.dex */
public final class id5 extends de5 {
    public id5() {
        super("AfterFrameset", 20);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (lh9.p(de5.a, dccVar)) {
            ed5Var.O((tbc) dccVar, false);
            return true;
        } else if (dccVar.a()) {
            ed5Var.Q((ubc) dccVar);
            return true;
        } else if (dccVar.b()) {
            ed5Var.H(this);
            return false;
        } else if (dccVar.e() && ((ybc) dccVar).W().equals("html")) {
            return de5.D.a(dccVar, ed5Var);
        } else {
            if (dccVar.d() && ((xbc) dccVar).W().equals("html")) {
                ed5Var.l = de5.T;
                return true;
            } else if (dccVar.e() && ((ybc) dccVar).W().equals("noframes")) {
                return de5.e.a(dccVar, ed5Var);
            } else {
                if (!dccVar.c()) {
                    ed5Var.H(this);
                    return false;
                }
                return true;
            }
        }
    }
}
