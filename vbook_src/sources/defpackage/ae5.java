package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ae5  reason: default package */
/* loaded from: classes.dex */
public final class ae5 extends de5 {
    public ae5() {
        super("InTemplate", 17);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        acc accVar = (acc) dccVar.c;
        int ordinal = accVar.ordinal();
        nd5 nd5Var = de5.D;
        if (ordinal != 0) {
            sd5 sd5Var = de5.e;
            if (ordinal != 1) {
                int i = 0;
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        if (ordinal == 6) {
                            if (ed5Var.X("template")) {
                                ed5Var.H(this);
                                ed5Var.Z("template");
                                ed5Var.B();
                                ed5Var.a0();
                                ed5Var.e0();
                                if (ed5Var.l != this) {
                                    ArrayList arrayList = ed5Var.s;
                                    if (arrayList != null) {
                                        i = arrayList.size();
                                    }
                                    if (i < 12) {
                                        return ed5Var.s(dccVar);
                                    }
                                }
                            }
                            return true;
                        }
                        xk5.j(accVar, "Unexpected state: ");
                        return false;
                    }
                } else if (((xbc) dccVar).W().equals("template")) {
                    sd5Var.a(dccVar, ed5Var);
                    return true;
                } else {
                    ed5Var.H(this);
                    return false;
                }
            } else {
                String W = ((ybc) dccVar).W();
                String[] strArr = d4b.a;
                if (d4b.c(W, xxe.M)) {
                    sd5Var.a(dccVar, ed5Var);
                    return true;
                } else if (d4b.c(W, xxe.N)) {
                    ed5Var.a0();
                    ArrayList arrayList2 = ed5Var.s;
                    xd5 xd5Var = de5.F;
                    if (arrayList2 != null) {
                        arrayList2.add(xd5Var);
                    }
                    ed5Var.l = xd5Var;
                    return ed5Var.s(dccVar);
                } else if (W.equals("col")) {
                    ed5Var.a0();
                    ArrayList arrayList3 = ed5Var.s;
                    qd5 qd5Var = de5.I;
                    if (arrayList3 != null) {
                        arrayList3.add(qd5Var);
                    }
                    ed5Var.l = qd5Var;
                    return ed5Var.s(dccVar);
                } else if (W.equals("tr")) {
                    ed5Var.a0();
                    ArrayList arrayList4 = ed5Var.s;
                    yd5 yd5Var = de5.J;
                    if (arrayList4 != null) {
                        arrayList4.add(yd5Var);
                    }
                    ed5Var.l = yd5Var;
                    return ed5Var.s(dccVar);
                } else if (!W.equals("td") && !W.equals("th")) {
                    ed5Var.a0();
                    ArrayList arrayList5 = ed5Var.s;
                    if (arrayList5 != null) {
                        arrayList5.add(nd5Var);
                    }
                    ed5Var.l = nd5Var;
                    return ed5Var.s(dccVar);
                } else {
                    ed5Var.a0();
                    ArrayList arrayList6 = ed5Var.s;
                    ud5 ud5Var = de5.K;
                    if (arrayList6 != null) {
                        arrayList6.add(ud5Var);
                    }
                    ed5Var.l = ud5Var;
                    return ed5Var.s(dccVar);
                }
            }
        }
        nd5Var.a(dccVar, ed5Var);
        return true;
    }
}
