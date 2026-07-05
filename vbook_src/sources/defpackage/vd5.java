package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vd5  reason: default package */
/* loaded from: classes.dex */
public final class vd5 extends de5 {
    public vd5() {
        super("InSelect", 15);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        cp3 z;
        dccVar.getClass();
        int ordinal = ((acc) dccVar.c).ordinal();
        if (ordinal != 0) {
            sd5 sd5Var = de5.e;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 6) {
                                ed5Var.H(this);
                                return false;
                            }
                            if (!ed5Var.b("html")) {
                                ed5Var.H(this);
                            }
                            return true;
                        }
                        ed5Var.O((tbc) dccVar, false);
                        return true;
                    }
                    ed5Var.Q((ubc) dccVar);
                    return true;
                }
                String str = ((xbc) dccVar).e;
                str.getClass();
                switch (str.hashCode()) {
                    case -1321546630:
                        if (str.equals("template")) {
                            return sd5Var.a(dccVar, ed5Var);
                        }
                        break;
                    case -1010136971:
                        if (str.equals("option")) {
                            if (ed5Var.b("option")) {
                                ed5Var.r();
                                return true;
                            }
                            ed5Var.H(this);
                            return true;
                        }
                        break;
                    case -906021636:
                        if (str.equals("select")) {
                            if (!ed5Var.L(str)) {
                                ed5Var.H(this);
                                return false;
                            }
                            ed5Var.Z(str);
                            ed5Var.e0();
                            return true;
                        }
                        break;
                    case -80773204:
                        if (str.equals("optgroup")) {
                            if (ed5Var.b("option") && (z = ed5Var.z(ed5Var.a())) != null && z.r("optgroup")) {
                                ed5Var.t("option");
                            }
                            if (ed5Var.b("optgroup")) {
                                ed5Var.r();
                                return true;
                            }
                            ed5Var.H(this);
                            return true;
                        }
                        break;
                }
                ed5Var.H(this);
                return false;
            }
            ybc ybcVar = (ybc) dccVar;
            String str2 = ybcVar.e;
            str2.getClass();
            if (str2.equals("html")) {
                return de5.D.a(ybcVar, ed5Var);
            }
            if (str2.equals("option")) {
                if (ed5Var.b("option")) {
                    ed5Var.t("option");
                }
                ed5Var.R(ybcVar);
                return true;
            } else if (str2.equals("optgroup")) {
                if (ed5Var.b("option")) {
                    ed5Var.t("option");
                }
                if (ed5Var.b("optgroup")) {
                    ed5Var.t("optgroup");
                }
                ed5Var.R(ybcVar);
                return true;
            } else if (str2.equals("select")) {
                ed5Var.H(this);
                return ed5Var.t("select");
            } else {
                String[] strArr = d4b.a;
                if (d4b.c(str2, xxe.H)) {
                    ed5Var.H(this);
                    if (!ed5Var.L("select")) {
                        return false;
                    }
                    do {
                        ed5Var.Z("select");
                        ed5Var.e0();
                    } while (ed5Var.L("select"));
                    return ed5Var.s(ybcVar);
                } else if (!str2.equals("script") && !str2.equals("template")) {
                    ed5Var.H(this);
                    return false;
                } else {
                    return sd5Var.a(dccVar, ed5Var);
                }
            }
        }
        ed5Var.H(this);
        return false;
    }
}
