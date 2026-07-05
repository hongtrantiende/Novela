package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: md5  reason: default package */
/* loaded from: classes.dex */
public final class md5 extends de5 {
    public md5() {
        super("ForeignContent", 23);
    }

    public static boolean b(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        de5 de5Var = ed5Var.l;
        de5Var.getClass();
        return de5Var.a(dccVar, ed5Var);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        cp3 r;
        int i;
        dccVar.getClass();
        acc accVar = (acc) dccVar.c;
        int ordinal = accVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 6) {
                                xk5.j(accVar, "Unexpected state: ");
                                return false;
                            }
                        } else {
                            tbc tbcVar = (tbc) dccVar;
                            if (lh9.p(de5.a, tbcVar)) {
                                ed5Var.O(tbcVar, false);
                                return true;
                            }
                            ed5Var.O(tbcVar, true);
                            ed5Var.v = false;
                            return true;
                        }
                    } else {
                        ed5Var.Q((ubc) dccVar);
                        return true;
                    }
                } else {
                    xbc xbcVar = (xbc) dccVar;
                    if (!r4b.J(xbcVar.e, "br", false) && !r4b.J(xbcVar.e, "p", false)) {
                        if (r4b.J(xbcVar.e, "script", false)) {
                            ArrayList arrayList = ed5Var.e;
                            if (arrayList != null) {
                                i = arrayList.size();
                            } else {
                                i = 0;
                            }
                            if (i != 0) {
                                cp3 a = ed5Var.a();
                                if (c16.i(a.e.b, "script") && c16.i(a.e.c, "http://www.w3.org/2000/svg")) {
                                    ed5Var.r();
                                    return true;
                                }
                            }
                        }
                        ArrayList arrayList2 = ed5Var.e;
                        arrayList2.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            cp3 cp3Var = (cp3) obj;
                            if (cp3Var != null) {
                                arrayList3.add(cp3Var);
                            }
                        }
                        cp3[] cp3VarArr = (cp3[]) arrayList3.toArray(new cp3[0]);
                        ArrayList m = tl1.m(Arrays.copyOf(cp3VarArr, cp3VarArr.length));
                        if (!m.isEmpty()) {
                            int size2 = m.size() - 1;
                            Object obj2 = m.get(size2);
                            obj2.getClass();
                            cp3 cp3Var2 = (cp3) obj2;
                            if (!cp3Var2.r(xbcVar.e)) {
                                ed5Var.H(this);
                            }
                            do {
                                if (size2 != 0) {
                                    if (cp3Var2.r(xbcVar.e)) {
                                        String str = cp3Var2.e.b;
                                        str.getClass();
                                        ArrayList arrayList4 = ed5Var.e;
                                        arrayList4.getClass();
                                        for (int size3 = arrayList4.size() - 1; -1 < size3 && ((r = ed5Var.r()) == null || !r.r(str)); size3--) {
                                        }
                                    } else {
                                        size2--;
                                        Object obj3 = m.get(size2);
                                        obj3.getClass();
                                        cp3Var2 = (cp3) obj3;
                                    }
                                }
                            } while (!c16.i(cp3Var2.e.c, "http://www.w3.org/1999/xhtml"));
                            return b(dccVar, ed5Var);
                        }
                        vs.k("Stack unexpectedly empty");
                        return false;
                    }
                    return b(dccVar, ed5Var);
                }
            } else {
                ybc ybcVar = (ybc) dccVar;
                String[] strArr = d4b.a;
                String str2 = ybcVar.e;
                str2.getClass();
                if (d4b.h(str2, (String[]) Arrays.copyOf(xxe.O, 44))) {
                    return b(dccVar, ed5Var);
                }
                if (r4b.J(ybcVar.e, "font", false) && (ybcVar.S("color") || ybcVar.S("face") || ybcVar.S("size"))) {
                    return b(dccVar, ed5Var);
                }
                String str3 = ed5Var.a().e.c;
                ed5Var.T(ybcVar, str3);
                String V = ybcVar.d.V();
                String str4 = ybcVar.e;
                str4.getClass();
                ifc f = ed5Var.y(V, str4, str3, ed5Var.m()).f();
                if (f != null) {
                    boolean i3 = c16.i(ybcVar.e, "script");
                    rcc rccVar = ed5Var.c;
                    if (i3) {
                        rccVar.getClass();
                        rccVar.p(ifc.E);
                        return true;
                    }
                    rccVar.getClass();
                    rccVar.p(f);
                }
            }
            return true;
        }
        ed5Var.H(this);
        return true;
    }
}
