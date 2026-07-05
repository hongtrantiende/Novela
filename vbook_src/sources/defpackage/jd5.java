package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jd5  reason: default package */
/* loaded from: classes.dex */
public final class jd5 extends de5 {
    public jd5() {
        super("AfterHead", 5);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (lh9.p(de5.a, dccVar)) {
            ed5Var.O((tbc) dccVar, false);
        } else if (dccVar.a()) {
            ed5Var.Q((ubc) dccVar);
        } else if (dccVar.b()) {
            ed5Var.H(this);
        } else {
            boolean e = dccVar.e();
            sd5 sd5Var = de5.e;
            if (e) {
                ybc ybcVar = (ybc) dccVar;
                String W = ybcVar.W();
                boolean equals = W.equals("html");
                nd5 nd5Var = de5.D;
                if (equals) {
                    return nd5Var.a(dccVar, ed5Var);
                }
                if (W.equals("body")) {
                    ed5Var.R(ybcVar);
                    ed5Var.v = false;
                    ed5Var.l = nd5Var;
                } else if (W.equals("frameset")) {
                    ed5Var.R(ybcVar);
                    ed5Var.l = de5.Q;
                } else {
                    String[] strArr = d4b.a;
                    if (d4b.c(W, xxe.j)) {
                        ed5Var.H(this);
                        cp3 cp3Var = ed5Var.o;
                        cp3Var.getClass();
                        ed5Var.v(cp3Var);
                        sd5Var.a(dccVar, ed5Var);
                        ed5Var.d0(cp3Var);
                    } else if (W.equals("head")) {
                        ed5Var.H(this);
                        return false;
                    } else {
                        ed5Var.u("body");
                        ed5Var.v = true;
                        ed5Var.s(dccVar);
                    }
                }
            } else if (dccVar.d()) {
                String W2 = ((xbc) dccVar).W();
                String[] strArr2 = d4b.a;
                if (d4b.c(W2, xxe.g)) {
                    ed5Var.u("body");
                    ed5Var.v = true;
                    ed5Var.s(dccVar);
                } else if (W2.equals("template")) {
                    sd5Var.a(dccVar, ed5Var);
                } else {
                    ed5Var.H(this);
                    return false;
                }
            } else {
                ed5Var.u("body");
                ed5Var.v = true;
                ed5Var.s(dccVar);
            }
        }
        return true;
    }
}
