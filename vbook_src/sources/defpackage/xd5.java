package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xd5  reason: default package */
/* loaded from: classes.dex */
public final class xd5 extends de5 {
    public xd5() {
        super("InTable", 8);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (((acc) dccVar.c) == acc.e) {
            String[] strArr = d4b.a;
            if (d4b.c(ed5Var.a().e.b, xxe.C)) {
                ArrayList arrayList = ed5Var.t;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ed5Var.m = ed5Var.l;
                ed5Var.l = de5.G;
                return ed5Var.s(dccVar);
            }
        }
        if (dccVar.a()) {
            ed5Var.Q((ubc) dccVar);
            return true;
        } else if (dccVar.b()) {
            ed5Var.H(this);
            return false;
        } else {
            boolean e = dccVar.e();
            sd5 sd5Var = de5.e;
            String[] strArr2 = ed5.E;
            if (e) {
                ybc ybcVar = (ybc) dccVar;
                String W = ybcVar.W();
                if (W.equals("caption")) {
                    ed5Var.D();
                    ed5Var.r.add(null);
                    ed5Var.R(ybcVar);
                    ed5Var.l = de5.H;
                    return true;
                } else if (W.equals("colgroup")) {
                    ed5Var.D();
                    ed5Var.R(ybcVar);
                    ed5Var.l = de5.I;
                    return true;
                } else if (W.equals("col")) {
                    ed5Var.D();
                    ed5Var.u("colgroup");
                    return ed5Var.s(dccVar);
                } else {
                    String[] strArr3 = d4b.a;
                    if (d4b.c(W, xxe.u)) {
                        ed5Var.D();
                        ed5Var.R(ybcVar);
                        ed5Var.l = de5.J;
                        return true;
                    } else if (d4b.c(W, xxe.v)) {
                        ed5Var.D();
                        ed5Var.u("tbody");
                        return ed5Var.s(dccVar);
                    } else {
                        if (W.equals("table")) {
                            ed5Var.H(this);
                            if (ed5Var.M(W, strArr2, null)) {
                                ed5Var.Z(W);
                                if (!ed5Var.e0()) {
                                    ed5Var.R(ybcVar);
                                    return true;
                                }
                                return ed5Var.s(dccVar);
                            }
                        } else if (d4b.c(W, xxe.w)) {
                            return sd5Var.a(dccVar, ed5Var);
                        } else {
                            if (W.equals("input")) {
                                j40 j40Var = ybcVar.g;
                                if (j40Var != null) {
                                    j40Var.getClass();
                                    if (j40Var.g("type").equalsIgnoreCase("hidden")) {
                                        ed5Var.S(ybcVar);
                                        return true;
                                    }
                                }
                                b(dccVar, ed5Var);
                                return true;
                            } else if (W.equals("form")) {
                                ed5Var.H(this);
                                if (ed5Var.p == null && !ed5Var.X("template")) {
                                    ed5Var.U(ybcVar, false, false);
                                    return true;
                                }
                            } else {
                                b(dccVar, ed5Var);
                                return true;
                            }
                        }
                        return false;
                    }
                }
            } else if (dccVar.d()) {
                String W2 = ((xbc) dccVar).W();
                if (W2.equals("table")) {
                    if (!ed5Var.M(W2, strArr2, null)) {
                        ed5Var.H(this);
                        return false;
                    }
                    ed5Var.Z("table");
                    ed5Var.e0();
                    return true;
                }
                String[] strArr4 = d4b.a;
                if (d4b.c(W2, xxe.B)) {
                    ed5Var.H(this);
                    return false;
                } else if (W2.equals("template")) {
                    sd5Var.a(dccVar, ed5Var);
                    return true;
                } else {
                    b(dccVar, ed5Var);
                    return true;
                }
            } else if (dccVar.c()) {
                if (ed5Var.b("html")) {
                    ed5Var.H(this);
                }
                return true;
            } else {
                b(dccVar, ed5Var);
                return true;
            }
        }
    }

    public final void b(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        ed5Var.H(this);
        ed5Var.w = true;
        de5.D.a(dccVar, ed5Var);
        ed5Var.w = false;
    }
}
