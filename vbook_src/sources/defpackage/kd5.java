package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kd5  reason: default package */
/* loaded from: classes.dex */
public final class kd5 extends de5 {
    public kd5() {
        super("BeforeHead", 2);
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
            if (dccVar.e()) {
                ybc ybcVar = (ybc) dccVar;
                if (ybcVar.W().equals("head")) {
                    ed5Var.o = ed5Var.R(ybcVar);
                    ed5Var.l = de5.e;
                    return true;
                }
            }
            if (dccVar.d()) {
                String[] strArr = d4b.a;
                if (d4b.c(((xbc) dccVar).W(), xxe.h)) {
                    ed5Var.u("head");
                    return ed5Var.s(dccVar);
                }
            }
            if (dccVar.d()) {
                ed5Var.H(this);
                return false;
            }
            ed5Var.u("head");
            return ed5Var.s(dccVar);
        }
    }
}
