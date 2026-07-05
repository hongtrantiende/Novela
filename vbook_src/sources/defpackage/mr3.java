package defpackage;

import java.util.List;
import java.util.RandomAccess;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mr3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr3 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;

    public /* synthetic */ mr3(aw7 aw7Var, int i) {
        this.a = i;
        this.b = aw7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        kn6 kn6Var;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        xe0 xe0Var;
        boolean z11;
        int i2 = this.a;
        pu0 pu0Var = pu0.a;
        kq7 kq7Var = kq7.a;
        lh9 lh9Var = ax1.a;
        pvc pvcVar = pvc.a;
        boolean z12 = true;
        aw7 aw7Var = this.b;
        boolean z13 = false;
        switch (i2) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((rh8) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    ze4 ze4Var = pna.c;
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, ze4Var);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    ec6 ec6Var = ((dc6) rv4Var.j(zf0.a)).a;
                    nq7 y = zbe.y(mwe.u(pu0Var.a(kq7Var, kh5.E), false, 12), 16.0f);
                    long j = ((h27) rv4Var.j(j27.a)).a.h;
                    dj4 dj4Var = new dj4(2.0f, sve.m, sve.k, sve.l);
                    Object P = rv4Var.P();
                    if (P == lh9Var) {
                        P = new ea3(aw7Var, 11);
                        rv4Var.o0(P);
                    }
                    wq9.c((vt4) P, y, null, ec6Var, j, 0L, dj4Var, rse.a, rv4Var, 100663302, Token.TO_DOUBLE);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((rh8) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    ze4 ze4Var2 = pna.c;
                    b37 d2 = fu0.d(kh5.a, false);
                    int hashCode2 = Long.hashCode(rv4Var2.T);
                    xt8 l2 = rv4Var2.l();
                    nq7 p2 = lye.p(rv4Var2, ze4Var2);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d2);
                    jce.F(qw1.e, rv4Var2, l2);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p2);
                    long j2 = ((h27) rv4Var2.j(j27.a)).a.h;
                    ec6 ec6Var2 = ((dc6) rv4Var2.j(zf0.a)).a;
                    nq7 y2 = zbe.y(mwe.u(pu0Var.a(kq7Var, kh5.E), false, 12), 16.0f);
                    dj4 dj4Var2 = new dj4(2.0f, sve.m, sve.k, sve.l);
                    boolean f = rv4Var2.f(aw7Var);
                    Object P2 = rv4Var2.P();
                    if (f || P2 == lh9Var) {
                        P2 = new iia(aw7Var, 0);
                        rv4Var2.o0(P2);
                    }
                    wq9.c((vt4) P2, y2, null, ec6Var2, j2, 0L, dj4Var2, y9e.a, rv4Var2, 100663296, Token.TO_DOUBLE);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                jz7 jz7Var = (jz7) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var3.f(jz7Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue3 |= i;
                }
                if ((intValue3 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    List<Object> list = (List) aw7Var.getValue();
                    if ((intValue3 & 14) != 4) {
                        z12 = false;
                    }
                    Object P3 = rv4Var3.P();
                    if (z12 || P3 == lh9Var) {
                        P3 = new u0(jz7Var, 4);
                        rv4Var3.o0(P3);
                    }
                    xt4 xt4Var = (xt4) P3;
                    if (list instanceof RandomAccess) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (((Boolean) xt4Var.invoke(list.get(i3))).booleanValue()) {
                                kn6Var = kn6.e;
                            }
                        }
                        kn6Var = kn6.c;
                    } else {
                        if (list == null || !list.isEmpty()) {
                            for (Object obj4 : list) {
                                if (((Boolean) xt4Var.invoke(obj4)).booleanValue()) {
                                    kn6Var = kn6.e;
                                }
                            }
                        }
                        kn6Var = kn6.c;
                    }
                    pye.a(nu6.a.a(r1d.r(kn6Var, rv4Var3)), jce.E(-1713684244, new tf0(jz7Var, 0), rv4Var3), rv4Var3, 56);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    ar5 c = rp5.c((wk3) ok3.l0.getValue(), rv4Var4, 0);
                    boolean f2 = rv4Var4.f(aw7Var);
                    Object P4 = rv4Var4.P();
                    if (f2 || P4 == lh9Var) {
                        P4 = new en(aw7Var, 11);
                        rv4Var4.o0(P4);
                    }
                    kwe.d(c, null, 0L, (vt4) P4, rv4Var4, 0, 6);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                rv4 rv4Var5 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var5.U(intValue5 & 1, z5)) {
                    ar5 c2 = rp5.c((wk3) ok3.l0.getValue(), rv4Var5, 0);
                    boolean f3 = rv4Var5.f(aw7Var);
                    Object P5 = rv4Var5.P();
                    if (f3 || P5 == lh9Var) {
                        P5 = new ea3(aw7Var, 1);
                        rv4Var5.o0(P5);
                    }
                    kwe.d(c2, null, 0L, (vt4) P5, rv4Var5, 0, 6);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 5:
                rv4 rv4Var6 = (rv4) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ou0) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z6)) {
                    ar5 c3 = rp5.c((wk3) jk3.b0.getValue(), rv4Var6, 0);
                    boolean f4 = rv4Var6.f(aw7Var);
                    Object P6 = rv4Var6.P();
                    if (f4 || P6 == lh9Var) {
                        P6 = new ea3(aw7Var, 29);
                        rv4Var6.o0(P6);
                    }
                    kwe.d(c3, null, 0L, (vt4) P6, rv4Var6, 0, 6);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 6:
                rv4 rv4Var7 = (rv4) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var7.U(intValue7 & 1, z7)) {
                    ar5 c4 = rp5.c((wk3) ok3.l0.getValue(), rv4Var7, 0);
                    boolean f5 = rv4Var7.f(aw7Var);
                    Object P7 = rv4Var7.P();
                    if (f5 || P7 == lh9Var) {
                        P7 = new ea4(aw7Var, 10);
                        rv4Var7.o0(P7);
                    }
                    kwe.d(c4, null, 0L, (vt4) P7, rv4Var7, 0, 6);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 7:
                rv4 rv4Var8 = (rv4) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var8.U(intValue8 & 1, z8)) {
                    List m = cqe.m((q3b) nz.b.getValue(), rv4Var8);
                    int size2 = m.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        String str = (String) m.get(i4);
                        if (i4 == ((Number) aw7Var.getValue()).intValue()) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean f6 = rv4Var8.f(aw7Var) | rv4Var8.d(i4);
                        Object P8 = rv4Var8.P();
                        if (f6 || P8 == lh9Var) {
                            P8 = new rd7(i4, aw7Var, 0);
                            rv4Var8.o0(P8);
                        }
                        ese.m(0, (vt4) P8, rv4Var8, null, null, null, str, z9);
                    }
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 8:
                rv4 rv4Var9 = (rv4) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z13 = true;
                }
                if (rv4Var9.U(intValue9 & 1, z13)) {
                    cvb.c(String.valueOf((int) ((Number) aw7Var.getValue()).floatValue()), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var9.j(j27.a)).b.j, rv4Var9, 0, 0, 131070);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 9:
                float floatValue = ((Float) obj2).floatValue();
                af0 af0Var = (af0) obj3;
                af0Var.getClass();
                aw7Var.setValue(new ok5(((y78) obj).a, floatValue, af0Var, true));
                return pvcVar;
            case 10:
                tu1 tu1Var = ape.a;
                rv4 rv4Var10 = (rv4) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var10.U(intValue10 & 1, z10)) {
                    Float valueOf = Float.valueOf(((ok5) aw7Var.getValue()).b);
                    int ordinal = ((ok5) aw7Var.getValue()).c.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            xe0Var = xe0.b;
                        } else {
                            xk5.o();
                            return null;
                        }
                    } else {
                        xe0Var = xe0.a;
                    }
                    tu1Var.h(valueOf, xe0Var, rv4Var10, 0);
                    return pvcVar;
                }
                rv4Var10.X();
                return pvcVar;
            default:
                rv4 rv4Var11 = (rv4) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (rv4Var11.U(intValue11 & 1, z11)) {
                    if (((xfa) aw7Var.getValue()).j) {
                        rv4Var11.e0(-1450633799);
                        ts6.a(nae.e, 384, 2, ((h27) rv4Var11.j(j27.a)).a.a, rv4Var11, pna.n(kq7Var, 24.0f));
                        rv4Var11.q(false);
                    } else {
                        rv4Var11.e0(-1450429664);
                        cvb.c(yqe.A((y3b) o2b.t.getValue(), rv4Var11), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var11, 0, 0, 262142);
                        rv4Var11.q(false);
                    }
                } else {
                    rv4Var11.X();
                }
                return pvcVar;
        }
    }
}
