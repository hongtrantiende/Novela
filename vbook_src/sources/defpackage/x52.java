package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x52  reason: default package */
/* loaded from: classes3.dex */
public final class x52 implements nu4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ hu4 c;
    public final /* synthetic */ hu4 d;
    public final /* synthetic */ hu4 e;
    public final /* synthetic */ xt4 f;

    public x52(List list, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, xt4 xt4Var7) {
        this.a = 2;
        this.b = list;
        this.f = xt4Var;
        this.C = xt4Var2;
        this.c = xt4Var3;
        this.d = xt4Var4;
        this.e = xt4Var5;
        this.D = xt4Var6;
        this.E = xt4Var7;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        rv4 rv4Var;
        boolean z2;
        w52 w52Var;
        v52 v52Var;
        boolean z3;
        nq7 s;
        nq7 s2;
        int i2;
        int i3;
        boolean z4;
        rv4 rv4Var2;
        boolean z5;
        int i4;
        w52 w52Var2;
        int i5;
        v52 v52Var2;
        boolean z6;
        nq7 v;
        nq7 h;
        int i6;
        int i7;
        boolean z7;
        int i8;
        int i9;
        int i10 = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        List list = this.b;
        lh9 lh9Var = ax1.a;
        hu4 hu4Var = this.c;
        hu4 hu4Var2 = this.d;
        hu4 hu4Var3 = this.e;
        Object obj5 = this.D;
        Object obj6 = this.E;
        switch (i10) {
            case 0:
                int i11 = 4;
                vt4 vt4Var = (vt4) hu4Var3;
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                lu4 lu4Var = (lu4) hu4Var2;
                aw7 aw7Var = (aw7) obj6;
                if ((intValue2 & 6) == 0) {
                    if (!rv4Var3.f(xg6Var)) {
                        i11 = 2;
                    }
                    i = intValue2 | i11;
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
                    rv4Var3.e0(1441837038);
                    if (vh8Var instanceof po5) {
                        rv4Var3.e0(1441847732);
                        po5 po5Var = (po5) vh8Var;
                        int i12 = po5Var.i;
                        int i13 = po5Var.h;
                        if (i13 > 0 && i12 > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        nq7 c = pna.c(kq7Var, 1.0f);
                        if (z3) {
                            s = jsc.t(i13 / i12, pna.c(kq7Var, 1.0f), true);
                        } else {
                            s = pna.s(pna.c(kq7Var, 1.0f), ((rg3) aw7Var.getValue()).a);
                        }
                        nq7 nq7Var = s;
                        if (z3) {
                            s2 = jsc.t(i13 / i12, pna.c(kq7Var, 1.0f), true);
                        } else {
                            s2 = pna.s(pna.c(kq7Var, 1.0f), ((rg3) aw7Var.getValue()).a);
                        }
                        npe.d(po5Var, c, nq7Var, s2, (mu4) hu4Var, rv4Var3, 48);
                        rv4Var = rv4Var3;
                        z2 = false;
                        rv4Var.q(false);
                    } else {
                        rv4Var = rv4Var3;
                        if (vh8Var instanceof f4a) {
                            rv4Var.e0(1443163806);
                            f4a f4aVar = (f4a) vh8Var;
                            nq7 s3 = pna.s(pna.c(kq7Var, 1.0f), ((rg3) aw7Var.getValue()).a);
                            boolean f = rv4Var.f(vh8Var) | rv4Var.f(lu4Var);
                            Object P = rv4Var.P();
                            if (!f && P != lh9Var) {
                                z2 = false;
                                v52Var = P;
                            } else {
                                z2 = false;
                                v52 v52Var3 = new v52(lu4Var, f4aVar, 0);
                                rv4Var.o0(v52Var3);
                                v52Var = v52Var3;
                            }
                            npe.j(f4aVar, q1d.t(1, (vt4) v52Var, rv4Var, s3, z2), vt4Var, rv4Var, z2 ? 1 : 0);
                            rv4Var.q(z2);
                        } else if (vh8Var instanceof k0b) {
                            rv4Var.e0(1443548702);
                            k0b k0bVar = (k0b) vh8Var;
                            nq7 s4 = pna.s(pna.c(kq7Var, 1.0f), ((rg3) aw7Var.getValue()).a);
                            boolean f2 = rv4Var.f(vh8Var) | rv4Var.f(lu4Var);
                            Object P2 = rv4Var.P();
                            if (!f2 && P2 != lh9Var) {
                                z2 = false;
                                w52Var = P2;
                            } else {
                                z2 = false;
                                w52 w52Var3 = new w52(lu4Var, k0bVar, 0);
                                rv4Var.o0(w52Var3);
                                w52Var = w52Var3;
                            }
                            npe.k(k0bVar, q1d.t(1, (vt4) w52Var, rv4Var, s4, z2), this.f, this.C, rv4Var, 0);
                            rv4Var.q(z2);
                        } else {
                            z2 = false;
                            z2 = false;
                            if (vh8Var instanceof et3) {
                                rv4Var.e0(1443985399);
                                npe.i(0, vt4Var, rv4Var, pna.v((nq7) obj5));
                                rv4Var.q(false);
                            } else {
                                rv4Var.e0(1444189565);
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
                int i14 = 4;
                vt4 vt4Var2 = (vt4) hu4Var3;
                xg6 xg6Var2 = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                aw7 aw7Var2 = (aw7) obj6;
                lu4 lu4Var2 = (lu4) hu4Var2;
                if ((intValue4 & 6) == 0) {
                    if (!rv4Var4.f(xg6Var2)) {
                        i14 = 2;
                    }
                    i3 = intValue4 | i14;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var4.d(intValue3)) {
                        i6 = 32;
                    } else {
                        i6 = 16;
                    }
                    i3 |= i6;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(i3 & 1, z4)) {
                    vh8 vh8Var2 = (vh8) list.get(intValue3);
                    rv4Var4.e0(1790280365);
                    if (vh8Var2 instanceof po5) {
                        rv4Var4.e0(1790290966);
                        po5 po5Var2 = (po5) vh8Var2;
                        int i15 = po5Var2.i;
                        int i16 = po5Var2.h;
                        if (i16 > 0 && i15 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        nq7 f3 = pna.f(kq7Var, 1.0f);
                        if (z6) {
                            z5 = false;
                            v = jsc.t(i16 / i15, pna.f(kq7Var, 1.0f), false);
                        } else {
                            z5 = false;
                            v = pna.v(pna.f(kq7Var, 1.0f));
                        }
                        nq7 nq7Var2 = v;
                        if (z6) {
                            h = jsc.t(i16 / i15, pna.f(kq7Var, 1.0f), z5);
                        } else {
                            h = pna.h(pna.f(kq7Var, 1.0f), ((rg3) aw7Var2.getValue()).a);
                        }
                        npe.d(po5Var2, f3, nq7Var2, h, (mu4) hu4Var, rv4Var4, 48);
                        rv4Var2 = rv4Var4;
                        rv4Var2.q(z5);
                    } else {
                        rv4Var2 = rv4Var4;
                        if (vh8Var2 instanceof f4a) {
                            rv4Var2.e0(1791316880);
                            f4a f4aVar2 = (f4a) vh8Var2;
                            nq7 f4 = pna.f(kq7Var, 1.0f);
                            boolean f5 = rv4Var2.f(vh8Var2) | rv4Var2.f(lu4Var2);
                            Object P3 = rv4Var2.P();
                            if (!f5 && P3 != lh9Var) {
                                i5 = 1;
                                v52Var2 = P3;
                            } else {
                                i5 = 1;
                                v52 v52Var4 = new v52(lu4Var2, f4aVar2, 1);
                                rv4Var2.o0(v52Var4);
                                v52Var2 = v52Var4;
                            }
                            z5 = false;
                            npe.j(f4aVar2, pna.v(q1d.t(i5, (vt4) v52Var2, rv4Var2, f4, false)), vt4Var2, rv4Var2, 0);
                            rv4Var2.q(false);
                        } else if (vh8Var2 instanceof k0b) {
                            rv4Var2.e0(1791703729);
                            k0b k0bVar2 = (k0b) vh8Var2;
                            nq7 f6 = pna.f(kq7Var, 1.0f);
                            boolean f7 = rv4Var2.f(vh8Var2) | rv4Var2.f(lu4Var2);
                            Object P4 = rv4Var2.P();
                            if (!f7 && P4 != lh9Var) {
                                i4 = 1;
                                w52Var2 = P4;
                            } else {
                                i4 = 1;
                                w52 w52Var4 = new w52(lu4Var2, k0bVar2, 1);
                                rv4Var2.o0(w52Var4);
                                w52Var2 = w52Var4;
                            }
                            z5 = false;
                            npe.k(k0bVar2, pna.h(q1d.t(i4, (vt4) w52Var2, rv4Var2, f6, false), ((rg3) aw7Var2.getValue()).a), this.f, this.C, rv4Var2, 0);
                            rv4Var2.q(false);
                        } else {
                            z5 = false;
                            if (vh8Var2 instanceof et3) {
                                rv4Var2.e0(1792141387);
                                npe.i(0, vt4Var2, rv4Var2, pna.v((nq7) obj5));
                                rv4Var2.q(false);
                            } else {
                                rv4Var2.e0(1792345553);
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
                yf6 yf6Var = (yf6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var5 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                xt4 xt4Var = (xt4) obj6;
                xt4 xt4Var2 = (xt4) obj5;
                xt4 xt4Var3 = (xt4) hu4Var3;
                xt4 xt4Var4 = (xt4) hu4Var2;
                xt4 xt4Var5 = (xt4) hu4Var;
                if ((intValue6 & 6) == 0) {
                    if (rv4Var5.f(yf6Var)) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    i7 = intValue6 | i9;
                } else {
                    i7 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (rv4Var5.d(intValue5)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                int i17 = i7;
                if ((i17 & Token.EXPR_VOID) != 146) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var5.U(i17 & 1, z7)) {
                    ef3 ef3Var = (ef3) list.get(intValue5);
                    rv4Var5.e0(287809821);
                    nq7 a = yf6.a(yf6Var, pna.f(kq7Var, 1.0f));
                    xt4 xt4Var6 = this.f;
                    boolean f8 = rv4Var5.f(xt4Var6) | rv4Var5.h(ef3Var);
                    Object P5 = rv4Var5.P();
                    of3 of3Var = P5;
                    if (f8 || P5 == lh9Var) {
                        of3 of3Var2 = new of3(xt4Var6, ef3Var, 0);
                        rv4Var5.o0(of3Var2);
                        of3Var = of3Var2;
                    }
                    vt4 vt4Var3 = (vt4) of3Var;
                    xt4 xt4Var7 = this.C;
                    boolean f9 = rv4Var5.f(xt4Var7) | rv4Var5.h(ef3Var);
                    Object P6 = rv4Var5.P();
                    of3 of3Var3 = P6;
                    if (f9 || P6 == lh9Var) {
                        of3 of3Var4 = new of3(xt4Var7, ef3Var, 1);
                        rv4Var5.o0(of3Var4);
                        of3Var3 = of3Var4;
                    }
                    vt4 vt4Var4 = (vt4) of3Var3;
                    boolean f10 = rv4Var5.f(xt4Var5) | rv4Var5.h(ef3Var);
                    Object P7 = rv4Var5.P();
                    of3 of3Var5 = P7;
                    if (f10 || P7 == lh9Var) {
                        of3 of3Var6 = new of3(xt4Var5, ef3Var, 2);
                        rv4Var5.o0(of3Var6);
                        of3Var5 = of3Var6;
                    }
                    vt4 vt4Var5 = (vt4) of3Var5;
                    boolean f11 = rv4Var5.f(xt4Var4) | rv4Var5.h(ef3Var);
                    Object P8 = rv4Var5.P();
                    of3 of3Var7 = P8;
                    if (f11 || P8 == lh9Var) {
                        of3 of3Var8 = new of3(xt4Var4, ef3Var, 3);
                        rv4Var5.o0(of3Var8);
                        of3Var7 = of3Var8;
                    }
                    vt4 vt4Var6 = (vt4) of3Var7;
                    boolean f12 = rv4Var5.f(xt4Var3) | rv4Var5.h(ef3Var);
                    Object P9 = rv4Var5.P();
                    of3 of3Var9 = P9;
                    if (f12 || P9 == lh9Var) {
                        of3 of3Var10 = new of3(xt4Var3, ef3Var, 4);
                        rv4Var5.o0(of3Var10);
                        of3Var9 = of3Var10;
                    }
                    vt4 vt4Var7 = (vt4) of3Var9;
                    boolean f13 = rv4Var5.f(xt4Var2) | rv4Var5.h(ef3Var);
                    Object P10 = rv4Var5.P();
                    of3 of3Var11 = P10;
                    if (f13 || P10 == lh9Var) {
                        of3 of3Var12 = new of3(xt4Var2, ef3Var, 5);
                        rv4Var5.o0(of3Var12);
                        of3Var11 = of3Var12;
                    }
                    vt4 vt4Var8 = (vt4) of3Var11;
                    boolean f14 = rv4Var5.f(xt4Var) | rv4Var5.h(ef3Var);
                    Object P11 = rv4Var5.P();
                    of3 of3Var13 = P11;
                    if (f14 || P11 == lh9Var) {
                        of3 of3Var14 = new of3(xt4Var, ef3Var, 6);
                        rv4Var5.o0(of3Var14);
                        of3Var13 = of3Var14;
                    }
                    ese.d(ef3Var, a, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, (vt4) of3Var13, rv4Var5, 0);
                    rv4Var5.q(false);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ x52(List list, mu4 mu4Var, lu4 lu4Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, nq7 nq7Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = list;
        this.c = mu4Var;
        this.d = lu4Var;
        this.e = vt4Var;
        this.f = xt4Var;
        this.C = xt4Var2;
        this.D = nq7Var;
        this.E = aw7Var;
    }
}
