package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sd5  reason: default package */
/* loaded from: classes.dex */
public final class sd5 extends de5 {
    public sd5() {
        super("InHead", 3);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        lh9 lh9Var = de5.a;
        if (lh9.p(lh9Var, dccVar)) {
            ed5Var.O((tbc) dccVar, false);
            return true;
        }
        int ordinal = ((acc) dccVar.c).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        ed5Var.t("head");
                        return ed5Var.s(dccVar);
                    }
                    ed5Var.Q((ubc) dccVar);
                    return true;
                }
                String W = ((xbc) dccVar).W();
                if (W.equals("head")) {
                    ed5Var.r();
                    ed5Var.l = de5.C;
                    return true;
                }
                String[] strArr = d4b.a;
                if (d4b.c(W, xxe.f)) {
                    ed5Var.t("head");
                    return ed5Var.s(dccVar);
                } else if (W.equals("template")) {
                    if (!ed5Var.X(W)) {
                        ed5Var.H(this);
                        return true;
                    }
                    ed5Var.J(true);
                    if (!ed5Var.b(W)) {
                        ed5Var.H(this);
                    }
                    ed5Var.Z(W);
                    ed5Var.B();
                    ed5Var.a0();
                    ed5Var.e0();
                    return true;
                } else {
                    ed5Var.H(this);
                    return false;
                }
            }
            ybc ybcVar = (ybc) dccVar;
            String W2 = ybcVar.W();
            if (W2.equals("html")) {
                return de5.D.a(dccVar, ed5Var);
            }
            String[] strArr2 = d4b.a;
            if (d4b.c(W2, xxe.d)) {
                cp3 S = ed5Var.S(ybcVar);
                if (W2.equals("base") && S.n("href") && !ed5Var.n) {
                    String a = S.a("href");
                    if (a.length() > 0) {
                        ed5Var.f = a;
                        ed5Var.n = true;
                        ed5Var.j().N(a);
                        return true;
                    }
                }
            } else if (W2.equals("meta")) {
                ed5Var.S(ybcVar);
                return true;
            } else if (W2.equals("title")) {
                lh9.o(lh9Var, ybcVar, ed5Var, ed5Var.x(ybcVar).f());
                return true;
            } else if (d4b.c(W2, xxe.e)) {
                lh9.o(lh9Var, ybcVar, ed5Var, ed5Var.x(ybcVar).f());
                return true;
            } else if (W2.equals("noscript")) {
                ed5Var.R(ybcVar);
                ed5Var.l = de5.f;
                return true;
            } else if (W2.equals("script")) {
                rcc rccVar = ed5Var.c;
                rccVar.getClass();
                rccVar.p(ifc.E);
                ed5Var.m = ed5Var.l;
                ed5Var.l = de5.E;
                ed5Var.R(ybcVar);
                return true;
            } else if (W2.equals("head")) {
                ed5Var.H(this);
                return false;
            } else if (W2.equals("template")) {
                ed5Var.R(ybcVar);
                ed5Var.r.add(null);
                ed5Var.v = false;
                ae5 ae5Var = de5.O;
                ed5Var.l = ae5Var;
                ArrayList arrayList = ed5Var.s;
                if (arrayList != null) {
                    arrayList.add(ae5Var);
                }
            } else {
                ed5Var.t("head");
                return ed5Var.s(dccVar);
            }
            return true;
        }
        ed5Var.H(this);
        return false;
    }
}
