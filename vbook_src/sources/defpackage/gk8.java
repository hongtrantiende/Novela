package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gk8  reason: default package */
/* loaded from: classes3.dex */
public final class gk8 implements nu4 {
    public final /* synthetic */ vt4 C;
    public final /* synthetic */ xt4 D;
    public final /* synthetic */ xt4 E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ su0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public gk8(List list, su0 su0Var, e6c e6cVar, cyb cybVar, j2c j2cVar, sxb sxbVar, ymb ymbVar, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2) {
        this.a = 2;
        this.b = list;
        this.c = su0Var;
        this.d = e6cVar;
        this.e = cybVar;
        this.f = j2cVar;
        this.F = sxbVar;
        this.G = ymbVar;
        this.C = vt4Var;
        this.D = xt4Var;
        this.E = xt4Var2;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        rv4 rv4Var;
        boolean z2;
        float f;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        rv4 rv4Var2;
        boolean z5;
        boolean z6;
        int ordinal;
        float f2;
        int i4;
        int i5;
        boolean z7;
        int i6;
        int i7 = this.a;
        vt4 vt4Var = this.C;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        Object obj5 = this.G;
        Object obj6 = this.F;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        List list = this.b;
        int i8 = 4;
        switch (i7) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                lu4 lu4Var = (lu4) obj8;
                lu4 lu4Var2 = (lu4) obj9;
                if ((intValue2 & 6) == 0) {
                    if (!rv4Var3.f(xg6Var)) {
                        i8 = 2;
                    }
                    i = intValue2 | i8;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var3.d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var3.U(i & 1, z)) {
                    vh8 vh8Var = (vh8) list.get(intValue);
                    rv4Var3.e0(1786951842);
                    boolean z8 = vh8Var instanceof po5;
                    lh9 lh9Var = ax1.a;
                    su0 su0Var = this.c;
                    if (z8) {
                        rv4Var3.e0(1786963404);
                        if (rg3.a(su0Var.c(), nae.e) > 0) {
                            f = su0Var.d() / su0Var.c();
                        } else {
                            f = 1.0f;
                        }
                        po5 po5Var = (po5) vh8Var;
                        nq7 s = pna.s(pna.c(kq7Var, 1.0f), su0Var.d());
                        boolean f3 = rv4Var3.f(lu4Var2) | rv4Var3.f(vh8Var);
                        Object P = rv4Var3.P();
                        if (f3 || P == lh9Var) {
                            P = new ek8(lu4Var2, po5Var, 0);
                            rv4Var3.o0(P);
                        }
                        xt4 xt4Var = (xt4) P;
                        boolean f4 = rv4Var3.f(lu4Var) | rv4Var3.f(vh8Var);
                        Object P2 = rv4Var3.P();
                        if (f4 || P2 == lh9Var) {
                            P2 = new ek8(lu4Var, po5Var, 1);
                            rv4Var3.o0(P2);
                        }
                        xt4 xt4Var2 = (xt4) P2;
                        mu4 mu4Var = (mu4) obj7;
                        if ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var3.d(intValue)) || (i & 48) == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Object P3 = rv4Var3.P();
                        if (z3 || P3 == lh9Var) {
                            P3 = new fk8(intValue, (aw7) obj5, (yya) obj6);
                            rv4Var3.o0(P3);
                        }
                        fce.o(po5Var, f, li8.b, s, xt4Var, xt4Var2, mu4Var, (xt4) P3, rv4Var3, 384);
                        rv4Var = rv4Var3;
                        rv4Var.q(false);
                        z2 = false;
                    } else {
                        rv4Var = rv4Var3;
                        if (vh8Var instanceof f4a) {
                            rv4Var.e0(1787875021);
                            f4a f4aVar = (f4a) vh8Var;
                            nq7 c = pna.c(kq7Var, 1.0f);
                            boolean f5 = rv4Var.f(lu4Var2) | rv4Var.f(vh8Var);
                            Object P4 = rv4Var.P();
                            if (f5 || P4 == lh9Var) {
                                P4 = new v52(lu4Var2, f4aVar, 2);
                                rv4Var.o0(P4);
                            }
                            z2 = false;
                            fce.m(f4aVar, pna.s(q1d.t(1, (vt4) P4, rv4Var, c, false), su0Var.d()), vt4Var, rv4Var, 0);
                            rv4Var.q(false);
                        } else if (vh8Var instanceof k0b) {
                            rv4Var.e0(1788294761);
                            k0b k0bVar = (k0b) vh8Var;
                            nq7 c2 = pna.c(kq7Var, 1.0f);
                            boolean f6 = rv4Var.f(lu4Var2) | rv4Var.f(vh8Var);
                            Object P5 = rv4Var.P();
                            if (f6 || P5 == lh9Var) {
                                P5 = new w52(lu4Var2, k0bVar, 2);
                                rv4Var.o0(P5);
                            }
                            z2 = false;
                            fce.n(k0bVar, pna.s(q1d.t(1, (vt4) P5, rv4Var, c2, false), su0Var.d()), this.D, this.E, rv4Var, 0);
                            rv4Var.q(false);
                        } else {
                            z2 = false;
                            if (vh8Var instanceof et3) {
                                rv4Var.e0(1788769495);
                                fce.l(6, vt4Var, rv4Var, pna.c);
                                rv4Var.q(false);
                            } else {
                                rv4Var.e0(1788991083);
                                rv4Var.q(false);
                            }
                        }
                    }
                    rv4Var.q(z2);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 1:
                xg6 xg6Var2 = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                lu4 lu4Var3 = (lu4) obj8;
                aw7 aw7Var = (aw7) obj5;
                yya yyaVar = (yya) obj6;
                lu4 lu4Var4 = (lu4) obj9;
                if ((intValue4 & 6) == 0) {
                    if (!rv4Var4.f(xg6Var2)) {
                        i8 = 2;
                    }
                    i3 = intValue4 | i8;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var4.d(intValue3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(i3 & 1, z4)) {
                    vh8 vh8Var2 = (vh8) list.get(intValue3);
                    rv4Var4.e0(617921471);
                    boolean z9 = vh8Var2 instanceof po5;
                    su0 su0Var2 = this.c;
                    lh9 lh9Var2 = ax1.a;
                    if (z9) {
                        rv4Var4.e0(617932971);
                        int intValue5 = ((Number) yyaVar.getValue()).intValue();
                        fi8 fi8Var = (fi8) aw7Var.getValue();
                        int i9 = i3;
                        if ((((i3 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var4.d(intValue3)) || (i9 & 48) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean d = rv4Var4.d(intValue5) | z6 | rv4Var4.d(fi8Var.ordinal());
                        Object P6 = rv4Var4.P();
                        if (d || P6 == lh9Var2) {
                            int intValue6 = ((Number) yyaVar.getValue()).intValue();
                            P6 = li8.a;
                            if (intValue3 >= intValue6) {
                                int intValue7 = ((Number) yyaVar.getValue()).intValue();
                                li8 li8Var = li8.b;
                                if (intValue3 != intValue7 || (ordinal = ((fi8) aw7Var.getValue()).ordinal()) == 1 || ordinal != 2) {
                                    P6 = li8Var;
                                }
                            }
                            rv4Var4.o0(P6);
                        }
                        li8 li8Var2 = (li8) P6;
                        if (rg3.a(su0Var2.c(), nae.e) > 0) {
                            f2 = su0Var2.d() / su0Var2.c();
                        } else {
                            f2 = 1.0f;
                        }
                        po5 po5Var2 = (po5) vh8Var2;
                        nq7 f7 = pna.f(pna.h(kq7Var, su0Var2.c()), 1.0f);
                        boolean f8 = rv4Var4.f(lu4Var4) | rv4Var4.f(vh8Var2);
                        Object P7 = rv4Var4.P();
                        if (f8 || P7 == lh9Var2) {
                            P7 = new ek8(lu4Var4, po5Var2, 2);
                            rv4Var4.o0(P7);
                        }
                        xt4 xt4Var3 = (xt4) P7;
                        boolean f9 = rv4Var4.f(lu4Var3) | rv4Var4.f(vh8Var2);
                        Object P8 = rv4Var4.P();
                        if (f9 || P8 == lh9Var2) {
                            P8 = new ek8(lu4Var3, po5Var2, 3);
                            rv4Var4.o0(P8);
                        }
                        xt4 xt4Var4 = (xt4) P8;
                        mu4 mu4Var2 = (mu4) obj7;
                        Object P9 = rv4Var4.P();
                        if (P9 == lh9Var2) {
                            P9 = m74.M;
                            rv4Var4.o0(P9);
                        }
                        fce.o(po5Var2, f2, li8Var2, f7, xt4Var3, xt4Var4, mu4Var2, (xt4) P9, rv4Var4, 12582912);
                        rv4Var2 = rv4Var4;
                        rv4Var2.q(false);
                        z5 = false;
                    } else {
                        rv4Var2 = rv4Var4;
                        if (vh8Var2 instanceof f4a) {
                            rv4Var2.e0(619379896);
                            f4a f4aVar2 = (f4a) vh8Var2;
                            nq7 h = pna.h(kq7Var, su0Var2.c());
                            boolean f10 = rv4Var2.f(vh8Var2) | rv4Var2.f(lu4Var4);
                            Object P10 = rv4Var2.P();
                            if (f10 || P10 == lh9Var2) {
                                P10 = new v52(lu4Var4, f4aVar2, 3);
                                rv4Var2.o0(P10);
                            }
                            fce.m(f4aVar2, pna.f(q1d.t(1, (vt4) P10, rv4Var2, h, false), 1.0f), vt4Var, rv4Var2, 0);
                            rv4Var2.q(false);
                            z5 = false;
                        } else if (vh8Var2 instanceof k0b) {
                            rv4Var2.e0(619800628);
                            k0b k0bVar2 = (k0b) vh8Var2;
                            nq7 f11 = pna.f(kq7Var, 1.0f);
                            boolean f12 = rv4Var2.f(vh8Var2) | rv4Var2.f(lu4Var4);
                            Object P11 = rv4Var2.P();
                            if (f12 || P11 == lh9Var2) {
                                P11 = new w52(lu4Var4, k0bVar2, 3);
                                rv4Var2.o0(P11);
                            }
                            z5 = false;
                            fce.n(k0bVar2, pna.h(q1d.t(1, (vt4) P11, rv4Var2, f11, false), su0Var2.c()), this.D, this.E, rv4Var2, 0);
                            rv4Var2.q(false);
                        } else {
                            z5 = false;
                            if (vh8Var2 instanceof et3) {
                                rv4Var2.e0(620276323);
                                fce.l(6, vt4Var, rv4Var2, pna.c);
                                rv4Var2.q(false);
                            } else {
                                rv4Var2.e0(620497911);
                                rv4Var2.q(false);
                            }
                        }
                    }
                    rv4Var2.q(z5);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var3 = (xg6) obj;
                int intValue8 = ((Number) obj2).intValue();
                rv4 rv4Var5 = (rv4) obj3;
                int intValue9 = ((Number) obj4).intValue();
                if ((intValue9 & 6) == 0) {
                    if (!rv4Var5.f(xg6Var3)) {
                        i8 = 2;
                    }
                    i5 = intValue9 | i8;
                } else {
                    i5 = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    if (rv4Var5.d(intValue8)) {
                        i6 = 32;
                    } else {
                        i6 = 16;
                    }
                    i5 |= i6;
                }
                if ((i5 & Token.EXPR_VOID) != 146) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var5.U(i5 & 1, z7)) {
                    rv4Var5.e0(-2110974923);
                    hif.c(this.c, (wh8) list.get(intValue8), ((e6c) obj9).c, (cyb) obj8, (j2c) obj7, (sxb) obj6, (ymb) obj5, pna.f(kq7Var, 1.0f), this.C, this.D, this.E, rv4Var5, 12582912);
                    rv4Var5.q(false);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ gk8(List list, su0 su0Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, yya yyaVar, aw7 aw7Var, int i) {
        this.a = i;
        this.b = list;
        this.c = su0Var;
        this.d = lu4Var;
        this.e = lu4Var2;
        this.f = mu4Var;
        this.C = vt4Var;
        this.D = xt4Var;
        this.E = xt4Var2;
        this.F = yyaVar;
        this.G = aw7Var;
    }
}
