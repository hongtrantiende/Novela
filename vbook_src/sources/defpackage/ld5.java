package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ld5  reason: default package */
/* loaded from: classes.dex */
public final class ld5 extends de5 {
    public ld5() {
        super("BeforeHtml", 1);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (dccVar.b()) {
            ed5Var.H(this);
            return false;
        } else if (dccVar.a()) {
            ed5Var.Q((ubc) dccVar);
            return true;
        } else if (lh9.p(de5.a, dccVar)) {
            ed5Var.O((tbc) dccVar, false);
            return true;
        } else {
            boolean e = dccVar.e();
            kd5 kd5Var = de5.d;
            if (e) {
                ybc ybcVar = (ybc) dccVar;
                if (ybcVar.W().equals("html")) {
                    ed5Var.R(ybcVar);
                    ed5Var.l = kd5Var;
                    return true;
                }
            }
            if (dccVar.d()) {
                String[] strArr = d4b.a;
                if (d4b.c(((xbc) dccVar).W(), xxe.h)) {
                    ed5Var.u("html");
                    ed5Var.l = kd5Var;
                    return ed5Var.s(dccVar);
                }
            }
            if (dccVar.d()) {
                ed5Var.H(this);
                return false;
            }
            ed5Var.u("html");
            ed5Var.l = kd5Var;
            return ed5Var.s(dccVar);
        }
    }
}
