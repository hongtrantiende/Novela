package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rd5  reason: default package */
/* loaded from: classes.dex */
public final class rd5 extends de5 {
    public rd5() {
        super("InFrameset", 19);
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
        } else if (dccVar.e()) {
            ybc ybcVar = (ybc) dccVar;
            String W = ybcVar.W();
            switch (W.hashCode()) {
                case -1644953643:
                    if (W.equals("frameset")) {
                        ed5Var.R(ybcVar);
                        return true;
                    }
                    break;
                case 3213227:
                    if (W.equals("html")) {
                        return de5.D.a(ybcVar, ed5Var);
                    }
                    break;
                case 97692013:
                    if (W.equals("frame")) {
                        ed5Var.S(ybcVar);
                        return true;
                    }
                    break;
                case 1192721831:
                    if (W.equals("noframes")) {
                        return de5.e.a(ybcVar, ed5Var);
                    }
                    break;
            }
            ed5Var.H(this);
            return false;
        } else {
            if (dccVar.d() && ((xbc) dccVar).W().equals("frameset")) {
                if (!ed5Var.b("frameset")) {
                    ed5Var.H(this);
                    return false;
                }
                ed5Var.r();
                if (!ed5Var.x && !ed5Var.b("frameset")) {
                    ed5Var.l = de5.R;
                    return true;
                }
            } else if (dccVar.c()) {
                if (!ed5Var.b("html")) {
                    ed5Var.H(this);
                }
            } else {
                ed5Var.H(this);
                return false;
            }
            return true;
        }
    }
}
