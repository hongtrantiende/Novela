package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ah7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ah7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Object value;
        boolean z3;
        float f;
        boolean z4;
        boolean z5;
        dq4 dq4Var;
        int i = this.a;
        ez ezVar = lz.c;
        kq7 kq7Var = kq7.a;
        boolean z6 = false;
        pvc pvcVar = pvc.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                dm5 dm5Var = (dm5) obj4;
                ur5 ur5Var = (ur5) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    ze4 ze4Var = pna.c;
                    nq7 x = zbe.x(ze4Var, mwe.f(13, rv4Var, false));
                    xn1 a = wn1.a(ezVar, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, x);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    z87.d(0, rv4Var);
                    z87.c(dm5Var, ur5Var, rte.C(ze4Var, rte.u(rv4Var), 14), rv4Var, 0);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                dm5 dm5Var2 = (dm5) obj4;
                ss8 ss8Var = (ss8) obj3;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    ze4 ze4Var2 = pna.c;
                    nq7 x2 = zbe.x(ze4Var2, mwe.f(5, rv4Var2, false));
                    xn1 a2 = wn1.a(ezVar, kh5.I, rv4Var2, 0);
                    int hashCode2 = Long.hashCode(rv4Var2.T);
                    xt8 l2 = rv4Var2.l();
                    nq7 p2 = lye.p(rv4Var2, x2);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, a2);
                    jce.F(qw1.e, rv4Var2, l2);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p2);
                    oc2.f(0, rv4Var2);
                    oc2.e(dm5Var2, ss8Var, rte.C(ze4Var2, rte.u(rv4Var2), 14), rv4Var2, 0);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                zr1.c((bzc) obj4, (nq7) obj3, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                w92.a((cz7) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 4:
                ((Integer) obj2).getClass();
                yb.a((uxa) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 5:
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                pe peVar = ((ke) obj4).a;
                peVar.j.i(floatValue);
                peVar.k.i(floatValue2);
                ((wl9) obj3).a = floatValue;
                return pvcVar;
            case 6:
                ((Integer) obj2).getClass();
                ((r0f) obj4).h((tu1) obj3, (rv4) obj, xoe.p(7));
                return pvcVar;
            case 7:
                aw7 aw7Var = (aw7) obj3;
                String str = (String) obj;
                go0 go0Var = (go0) obj2;
                str.getClass();
                go0Var.getClass();
                cza czaVar = ((mq0) obj4).G;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, gq0.a((gq0) value, false, false, null, go0Var, str, 4)));
                    aw7Var.setValue(Boolean.TRUE);
                    return pvcVar;
                }
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 8:
                tu1 tu1Var = (tu1) obj4;
                lu4 lu4Var = (lu4) obj3;
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    tu1Var.invoke(rv4Var3, 0);
                    pye.a(cvb.a.a(((h27) rv4Var3.j(j27.a)).b.o), jce.E(-14065845, new tb(1, lu4Var), rv4Var3), rv4Var3, 56);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 9:
                p6b p6bVar = (p6b) obj;
                x02 x02Var = (x02) obj2;
                return ((b37) obj4).e(p6bVar, p6bVar.j0(pvcVar, new tu1(new ru0((tu1) obj3, new su0(p6bVar, x02Var.a), 0), true, -431986394)), x02Var.a);
            case 10:
                ((Integer) obj2).getClass();
                yf2.g((l54) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 11:
                ((Integer) obj2).getClass();
                yf2.h((uv0) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 12:
                rh8 rh8Var = (rh8) obj4;
                mu4 mu4Var = (mu4) obj3;
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z6 = true;
                }
                if (rv4Var4.U(intValue4 & 1, z6)) {
                    float f2 = xz0.c;
                    if (((Boolean) a39.a.getValue()).booleanValue()) {
                        f = 36.0f;
                    } else {
                        f = 40.0f;
                    }
                    nq7 x3 = zbe.x(pna.a(kq7Var, f2, f), rh8Var);
                    gv9 a3 = ev9.a(lz.e, kh5.G, rv4Var4, 54);
                    int hashCode3 = Long.hashCode(rv4Var4.T);
                    xt8 l3 = rv4Var4.l();
                    nq7 p3 = lye.p(rv4Var4, x3);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var3);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, a3);
                    jce.F(qw1.e, rv4Var4, l3);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p3);
                    mu4Var.c(jv9.a, rv4Var4, 6);
                    rv4Var4.q(true);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 13:
                nq7 nq7Var = (nq7) obj4;
                k81 k81Var = (k81) obj3;
                rv4 rv4Var5 = (rv4) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var5.U(intValue5 & 1, z4)) {
                    nq7 f3 = pna.f(nq7Var, 1.0f);
                    xn1 a4 = wn1.a(ezVar, kh5.I, rv4Var5, 0);
                    int hashCode4 = Long.hashCode(rv4Var5.T);
                    xt8 l4 = rv4Var5.l();
                    nq7 p4 = lye.p(rv4Var5, f3);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var4);
                    } else {
                        rv4Var5.r0();
                    }
                    jce.F(qw1.f, rv4Var5, a4);
                    jce.F(qw1.e, rv4Var5, l4);
                    jce.F(qw1.g, rv4Var5, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var5);
                    jce.F(qw1.d, rv4Var5, p4);
                    rv4Var5.e0(-1193027275);
                    for (xl0 xl0Var : k81Var.a.e().a) {
                        npe.a(k81Var, xl0Var, zbe.A(kq7Var, nae.e, 2.0f, 1), rv4Var5, 384);
                    }
                    rv4Var5.q(false);
                    rv4Var5.q(true);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 14:
                ((Integer) obj2).getClass();
                bbe.b((cia) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 15:
                ((Integer) obj2).getClass();
                dce.b((cz7) obj4, (rj8) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 16:
                ((Integer) obj2).getClass();
                ((r32) obj4).a((n32) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 17:
                xh8 xh8Var = (xh8) obj4;
                x42 x42Var = (x42) obj3;
                rv4 rv4Var6 = (rv4) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                }
                if (rv4Var6.U(intValue6 & 1, z6)) {
                    ki8.c(xh8Var, null, x42Var.c, rv4Var6, 0, 2);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 18:
                ((Integer) obj2).getClass();
                z1d.e((zc2) obj4, (nq7) obj3, (rv4) obj, xoe.p(49));
                return pvcVar;
            case 19:
                ef2 ef2Var = (ef2) obj4;
                ((z09) obj).getClass();
                ef2Var.f.c(ef2Var, new zy5(((hab) ((d19) obj3)).U), (y78) obj2);
                return pvcVar;
            case 20:
                ((Integer) obj2).getClass();
                ((sv2) obj4).a((wz7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 21:
                ((Integer) obj2).getClass();
                ((tv2) obj4).a((m08) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 22:
                ((Integer) obj2).getClass();
                ((ax2) obj4).a((qma) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 23:
                oob oobVar = (oob) obj4;
                apb apbVar = (apb) obj3;
                rv4 rv4Var7 = (rv4) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var7.U(intValue7 & 1, z5)) {
                    boolean f4 = rv4Var7.f(oobVar);
                    Object P = rv4Var7.P();
                    if (f4 || P == ax1.a) {
                        P = yae.q(new v7(0, oobVar, oob.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 17));
                        rv4Var7.o0(P);
                    }
                    xx2.a(apbVar, (nob) ((yya) P).getValue(), rv4Var7, 0);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 24:
                ((Integer) obj2).getClass();
                xx2.a((apb) obj4, (nob) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 25:
                ((Integer) obj2).getClass();
                ((sy2) obj4).a((crc) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 26:
                ((Integer) obj2).getClass();
                nqe.p((us9) obj4, (nq7) obj3, (rv4) obj, xoe.p(49));
                return pvcVar;
            case 27:
                Boolean bool = (Boolean) obj4;
                String str2 = (String) obj3;
                rv4 rv4Var8 = (rv4) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z6 = true;
                }
                if (rv4Var8.U(intValue8 & 1, z6)) {
                    oyb oybVar = ((h27) rv4Var8.j(j27.a)).b.k;
                    if (c16.i(bool, Boolean.TRUE)) {
                        dq4Var = dq4.C;
                    } else {
                        dq4Var = dq4.e;
                    }
                    cvb.c(str2, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, dq4Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var8, 48, 0, 131004);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 28:
                ((Integer) obj2).getClass();
                fxe.b((vp3) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                qj4.b((mj4) obj4, (nq7) obj3, (rv4) obj, xoe.p(49));
                return pvcVar;
        }
    }

    public /* synthetic */ ah7(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
