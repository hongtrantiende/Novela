package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lg7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ Set d;

    public /* synthetic */ lg7(Set set, xt4 xt4Var, Set set2, int i) {
        this.a = i;
        this.b = set;
        this.c = xt4Var;
        this.d = set2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        Object gs9Var;
        mv6 mv6Var;
        boolean z2;
        int i = this.a;
        Object obj4 = ax1.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        Set<Number> set = this.d;
        xt4 xt4Var = this.c;
        Set set2 = this.b;
        boolean z3 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    String A = yqe.A((y3b) v1b.f0.getValue(), rv4Var);
                    boolean isEmpty = set2.isEmpty();
                    boolean f = rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f || P == obj4) {
                        P = new hg7(3, xt4Var);
                        rv4Var.o0(P);
                    }
                    w9e.g(0, (vt4) P, rv4Var, null, null, null, A, isEmpty);
                    List m = cqe.m((q3b) nz.c.getValue(), rv4Var);
                    for (Number number : set) {
                        int intValue2 = number.intValue();
                        if (intValue2 > 0) {
                            rv4Var.e0(827925952);
                            String str2 = (String) sl1.f0(intValue2 - 1, m);
                            if (str2 == null) {
                                str = "";
                            } else {
                                str = str2;
                            }
                            boolean contains = set2.contains(Integer.valueOf(intValue2));
                            boolean f2 = rv4Var.f(xt4Var) | rv4Var.d(intValue2);
                            Object P2 = rv4Var.P();
                            if (f2 || P2 == obj4) {
                                P2 = new tp0(xt4Var, intValue2, 4);
                                rv4Var.o0(P2);
                            }
                            w9e.g(0, (vt4) P2, rv4Var, null, null, null, str, contains);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(828288249);
                            rv4Var.q(false);
                        }
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                }
                if (rv4Var2.U(intValue3 & 1, z3)) {
                    String A2 = yqe.A((y3b) v1b.f0.getValue(), rv4Var2);
                    boolean isEmpty2 = set2.isEmpty();
                    boolean f3 = rv4Var2.f(xt4Var);
                    Object P3 = rv4Var2.P();
                    if (f3 || P3 == obj4) {
                        P3 = new hg7(2, xt4Var);
                        rv4Var2.o0(P3);
                    }
                    w9e.g(0, (vt4) P3, rv4Var2, null, null, null, A2, isEmpty2);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        boolean f4 = rv4Var2.f(str3);
                        Object P4 = rv4Var2.P();
                        if (f4 || P4 == obj4) {
                            str3.getClass();
                            String O = r4b.O(k4b.N0(str3).toString(), '_', '-');
                            String str4 = null;
                            O = (O.length() == 0 || O.equalsIgnoreCase("und")) ? null : null;
                            if (O == null) {
                                mv6Var = null;
                            } else {
                                try {
                                    gs9Var = new mv6(xve.c(O));
                                } catch (Throwable th) {
                                    gs9Var = new gs9(th);
                                }
                                if (gs9Var instanceof gs9) {
                                    gs9Var = null;
                                }
                                mv6Var = (mv6) gs9Var;
                            }
                            if (mv6Var != null) {
                                str4 = mv6Var.b();
                            }
                            if (str4 == null) {
                                str4 = "";
                            }
                            if (str4.length() == 0) {
                                P4 = str3;
                            } else {
                                P4 = str4;
                            }
                            rv4Var2.o0(P4);
                        }
                        String str5 = (String) P4;
                        boolean contains2 = set2.contains(str3);
                        boolean f5 = rv4Var2.f(xt4Var) | rv4Var2.f(str3);
                        Object P5 = rv4Var2.P();
                        if (f5 || P5 == obj4) {
                            P5 = new xr1(2, xt4Var, str3);
                            rv4Var2.o0(P5);
                        }
                        w9e.g(0, (vt4) P5, rv4Var2, null, null, null, str5, contains2);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                }
                if (rv4Var3.U(intValue4 & 1, z3)) {
                    String A3 = yqe.A((y3b) v1b.f0.getValue(), rv4Var3);
                    boolean isEmpty3 = set2.isEmpty();
                    boolean f6 = rv4Var3.f(xt4Var);
                    Object P6 = rv4Var3.P();
                    if (f6 || P6 == obj4) {
                        P6 = new hg7(1, xt4Var);
                        rv4Var3.o0(P6);
                    }
                    w9e.g(0, (vt4) P6, rv4Var3, null, null, null, A3, isEmpty3);
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        String str6 = (String) it2.next();
                        boolean contains3 = set2.contains(str6);
                        boolean f7 = rv4Var3.f(xt4Var) | rv4Var3.f(str6);
                        Object P7 = rv4Var3.P();
                        if (f7 || P7 == obj4) {
                            P7 = new xr1(1, xt4Var, str6);
                            rv4Var3.o0(P7);
                        }
                        w9e.g(0, (vt4) P7, rv4Var3, null, null, null, str6, contains3);
                    }
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var4.U(intValue5 & 1, z2)) {
                    s9e.f(zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(-1909888079, new lg7(set2, xt4Var, set, 0), rv4Var4), rv4Var4, 1573302);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                rv4 rv4Var5 = (rv4) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z3 = true;
                }
                if (rv4Var5.U(intValue6 & 1, z3)) {
                    s9e.f(zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(437850920, new lg7(set2, xt4Var, set, 1), rv4Var5), rv4Var5, 1573302);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var6 = (rv4) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z3 = true;
                }
                if (rv4Var6.U(intValue7 & 1, z3)) {
                    s9e.f(zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(1703921705, new lg7(set2, xt4Var, set, 2), rv4Var6), rv4Var6, 1573302);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
        }
    }
}
