package defpackage;

import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sv1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv1 implements mu4 {
    public final /* synthetic */ int a;

    public /* synthetic */ sv1(int i) {
        this.a = i;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i = this.a;
        dz dzVar = lz.a;
        pu0 pu0Var = pu0.a;
        float f2 = nae.e;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z12 = true;
                }
                if (rv4Var.U(intValue & 1, z12)) {
                    String A = yqe.A((y3b) o3b.L.getValue(), rv4Var);
                    nq7 A2 = zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2);
                    tza tzaVar = j27.a;
                    cvb.c(A, zbe.C(nmd.v(tte.k(A2, v72.d(((h27) rv4Var.j(tzaVar)).c.d, new sg3(nae.e), new sg3(nae.e), null, null, 12)), rm1.g(((h27) rv4Var.j(tzaVar)).a, 2.0f), lre.g), nae.e, nae.e, nae.e, 16.0f, 7), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, null, rv4Var, 0, 0, 261116);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    nq7 A3 = zbe.A(pna.f(kq7Var, 1.0f), nae.e, 12.0f, 1);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, A3);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    eg0.f(pna.n(zbe.A(pu0Var.a(kq7Var, kh5.e), nae.e, 12.0f, 1), 32.0f), 0L, null, rv4Var2, 0, 6);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z12 = true;
                }
                if (!rv4Var3.U(intValue3 & 1, z12)) {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ou0) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z12 = true;
                }
                if (!rv4Var4.U(intValue4 & 1, z12)) {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                rv4 rv4Var5 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ou0) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z12 = true;
                }
                if (!rv4Var5.U(intValue5 & 1, z12)) {
                    rv4Var5.X();
                }
                return pvcVar;
            case 5:
                rv4 rv4Var6 = (rv4) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((wpa) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z2)) {
                    nq7 n = pna.n(kq7Var, 16.0f);
                    b37 d2 = fu0.d(kh5.e, false);
                    int hashCode2 = Long.hashCode(rv4Var6.T);
                    xt8 l2 = rv4Var6.l();
                    nq7 p2 = lye.p(rv4Var6, n);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var6.i0();
                    if (rv4Var6.S) {
                        rv4Var6.k(zx1Var2);
                    } else {
                        rv4Var6.r0();
                    }
                    jce.F(qw1.f, rv4Var6, d2);
                    jce.F(qw1.e, rv4Var6, l2);
                    jce.F(qw1.g, rv4Var6, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var6);
                    jce.F(qw1.d, rv4Var6, p2);
                    xbe.i(rv4Var6, nmd.v(pna.n(kq7Var, 12.0f), ((h27) rv4Var6.j(j27.a)).a.a, uu9.a));
                    rv4Var6.q(true);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 6:
                rv4 rv4Var7 = (rv4) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var7.U(intValue7 & 1, z3)) {
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    tza tzaVar2 = j27.a;
                    nq7 y = zbe.y(nmd.v(tte.k(f3, ((h27) rv4Var7.j(tzaVar2)).c.d), rm1.g(((h27) rv4Var7.j(tzaVar2)).a, 2.0f), lre.g), 12.0f);
                    lk0 lk0Var = kh5.I;
                    ez ezVar = lz.c;
                    xn1 a = wn1.a(ezVar, lk0Var, rv4Var7, 0);
                    int hashCode3 = Long.hashCode(rv4Var7.T);
                    xt8 l3 = rv4Var7.l();
                    nq7 p3 = lye.p(rv4Var7, y);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var7.i0();
                    if (rv4Var7.S) {
                        rv4Var7.k(zx1Var3);
                    } else {
                        rv4Var7.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var7, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var7, l3);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var7, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var7);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var7, p3);
                    gv9 a2 = ev9.a(dzVar, kh5.G, rv4Var7, 48);
                    int hashCode4 = Long.hashCode(rv4Var7.T);
                    xt8 l4 = rv4Var7.l();
                    nq7 p4 = lye.p(rv4Var7, kq7Var);
                    rv4Var7.i0();
                    if (rv4Var7.S) {
                        rv4Var7.k(zx1Var3);
                    } else {
                        rv4Var7.r0();
                    }
                    jce.F(npVar, rv4Var7, a2);
                    jce.F(npVar2, rv4Var7, l4);
                    s21.t(hashCode4, rv4Var7, npVar3, rv4Var7, kgVar);
                    jce.F(npVar4, rv4Var7, p4);
                    dpe.f(null, tte.k(pna.n(kq7Var, 38.0f), uu9.a), rv4Var7, 0, 1);
                    xbe.i(rv4Var7, pna.s(kq7Var, 10.0f));
                    xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var7, 0);
                    int hashCode5 = Long.hashCode(rv4Var7.T);
                    xt8 l5 = rv4Var7.l();
                    nq7 p5 = lye.p(rv4Var7, kq7Var);
                    rv4Var7.i0();
                    if (rv4Var7.S) {
                        rv4Var7.k(zx1Var3);
                    } else {
                        rv4Var7.r0();
                    }
                    jce.F(npVar, rv4Var7, a3);
                    jce.F(npVar2, rv4Var7, l5);
                    s21.t(hashCode5, rv4Var7, npVar3, rv4Var7, kgVar);
                    jce.F(npVar4, rv4Var7, p5);
                    dpe.g(pna.h(pna.s(kq7Var, 110.0f), 18.0f), null, rv4Var7, 6, 2);
                    xbe.i(rv4Var7, pna.h(kq7Var, 6.0f));
                    dpe.g(pna.h(pna.s(kq7Var, 56.0f), 12.0f), null, rv4Var7, 6, 2);
                    xbe.i(rv4Var7, hl5.e(rv4Var7, true, true, kq7Var, 16.0f));
                    dpe.g(pna.h(pna.f(kq7Var, 0.82f), 24.0f), null, rv4Var7, 6, 2);
                    xbe.i(rv4Var7, pna.h(kq7Var, 10.0f));
                    rv4Var7.e0(-1358152532);
                    for (int i2 = 0; i2 < 4; i2++) {
                        if (i2 == 3) {
                            f = 0.68f;
                        } else {
                            f = 1.0f;
                        }
                        dpe.g(pna.h(pna.f(kq7Var, f), 12.0f), null, rv4Var7, 0, 2);
                        xbe.i(rv4Var7, pna.h(kq7Var, 6.0f));
                    }
                    rv4Var7.q(false);
                    xbe.i(rv4Var7, pna.h(kq7Var, 8.0f));
                    gv9 a4 = ev9.a(new hz(8.0f, true, new vs(2)), kh5.F, rv4Var7, 6);
                    int hashCode6 = Long.hashCode(rv4Var7.T);
                    xt8 l6 = rv4Var7.l();
                    nq7 p6 = lye.p(rv4Var7, kq7Var);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var7.i0();
                    if (rv4Var7.S) {
                        rv4Var7.k(zx1Var4);
                    } else {
                        rv4Var7.r0();
                    }
                    jce.F(qw1.f, rv4Var7, a4);
                    jce.F(qw1.e, rv4Var7, l6);
                    jce.F(qw1.g, rv4Var7, Integer.valueOf(hashCode6));
                    jce.C(qw1.h, rv4Var7);
                    jce.F(qw1.d, rv4Var7, p6);
                    su9 su9Var = uu9.a;
                    dpe.g(pna.h(pna.s(kq7Var, 74.0f), 36.0f), su9Var, rv4Var7, 6, 0);
                    dpe.g(pna.h(pna.s(kq7Var, 112.0f), 20.0f), su9Var, rv4Var7, 6, 0);
                    rv4Var7.q(true);
                    rv4Var7.q(true);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 7:
                rv4 rv4Var8 = (rv4) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var8.U(intValue8 & 1, z4)) {
                    nq7 f4 = pna.f(kq7Var, 1.0f);
                    tza tzaVar3 = j27.a;
                    nq7 z13 = zbe.z(nmd.v(tte.k(f4, ((h27) rv4Var8.j(tzaVar3)).c.d), rm1.g(((h27) rv4Var8.j(tzaVar3)).a, 2.0f), lre.g), 12.0f, 9.0f);
                    gv9 a5 = ev9.a(dzVar, kh5.G, rv4Var8, 48);
                    int hashCode7 = Long.hashCode(rv4Var8.T);
                    xt8 l7 = rv4Var8.l();
                    nq7 p7 = lye.p(rv4Var8, z13);
                    rw1.k.getClass();
                    zx1 zx1Var5 = qw1.b;
                    rv4Var8.i0();
                    if (rv4Var8.S) {
                        rv4Var8.k(zx1Var5);
                    } else {
                        rv4Var8.r0();
                    }
                    np npVar5 = qw1.f;
                    jce.F(npVar5, rv4Var8, a5);
                    np npVar6 = qw1.e;
                    jce.F(npVar6, rv4Var8, l7);
                    Integer valueOf2 = Integer.valueOf(hashCode7);
                    np npVar7 = qw1.g;
                    jce.F(npVar7, rv4Var8, valueOf2);
                    kg kgVar2 = qw1.h;
                    jce.C(kgVar2, rv4Var8);
                    np npVar8 = qw1.d;
                    jce.F(npVar8, rv4Var8, p7);
                    gv9 a6 = ev9.a(new hz(-10.0f, true, new vs(2)), kh5.F, rv4Var8, 6);
                    int hashCode8 = Long.hashCode(rv4Var8.T);
                    xt8 l8 = rv4Var8.l();
                    nq7 p8 = lye.p(rv4Var8, kq7Var);
                    rv4Var8.i0();
                    if (rv4Var8.S) {
                        rv4Var8.k(zx1Var5);
                    } else {
                        rv4Var8.r0();
                    }
                    jce.F(npVar5, rv4Var8, a6);
                    jce.F(npVar6, rv4Var8, l8);
                    s21.t(hashCode8, rv4Var8, npVar7, rv4Var8, kgVar2);
                    jce.F(npVar8, rv4Var8, p8);
                    rv4Var8.e0(-818963706);
                    for (int i3 = 0; i3 < 3; i3++) {
                        dpe.f(null, tte.k(pna.n(kq7Var, 28.0f), uu9.a), rv4Var8, 0, 1);
                    }
                    rv4Var8.q(false);
                    rv4Var8.q(true);
                    xbe.i(rv4Var8, pna.s(kq7Var, 12.0f));
                    dpe.g(pna.h(pna.s(kq7Var, 84.0f), 14.0f), null, rv4Var8, 6, 2);
                    xbe.i(rv4Var8, pna.s(kq7Var, 10.0f));
                    dpe.g(pna.h(pna.s(kq7Var, 94.0f), 14.0f), null, rv4Var8, 6, 2);
                    xbe.i(rv4Var8, new we6(1.0f, true));
                    dpe.g(pna.h(pna.s(kq7Var, 72.0f), 30.0f), uu9.a, rv4Var8, 6, 0);
                    rv4Var8.q(true);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 8:
                rv4 rv4Var9 = (rv4) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var9.U(intValue9 & 1, z5)) {
                    jsc.c(6, 0, rv4Var9, zbe.C(kq7.a, nae.e, nae.e, nae.e, 14.0f, 7));
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 9:
                rv4 rv4Var10 = (rv4) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var10.U(intValue10 & 1, z6)) {
                    jsc.c(6, 0, rv4Var10, zbe.C(kq7.a, nae.e, nae.e, nae.e, 14.0f, 7));
                } else {
                    rv4Var10.X();
                }
                return pvcVar;
            case 10:
                rv4 rv4Var11 = (rv4) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var11.U(intValue11 & 1, z7)) {
                    nq7 A4 = zbe.A(pna.f(kq7Var, 1.0f), nae.e, 8.0f, 1);
                    nk0 nk0Var = kh5.e;
                    b37 d3 = fu0.d(nk0Var, false);
                    int hashCode9 = Long.hashCode(rv4Var11.T);
                    xt8 l9 = rv4Var11.l();
                    nq7 p9 = lye.p(rv4Var11, A4);
                    rw1.k.getClass();
                    zx1 zx1Var6 = qw1.b;
                    rv4Var11.i0();
                    if (rv4Var11.S) {
                        rv4Var11.k(zx1Var6);
                    } else {
                        rv4Var11.r0();
                    }
                    jce.F(qw1.f, rv4Var11, d3);
                    jce.F(qw1.e, rv4Var11, l9);
                    jce.F(qw1.g, rv4Var11, Integer.valueOf(hashCode9));
                    jce.C(qw1.h, rv4Var11);
                    jce.F(qw1.d, rv4Var11, p9);
                    eg0.f(pu0Var.a(pna.n(kq7Var, 24.0f), nk0Var), ((h27) rv4Var11.j(j27.a)).a.b, null, rv4Var11, 0, 4);
                    rv4Var11.q(true);
                } else {
                    rv4Var11.X();
                }
                return pvcVar;
            case 11:
                rv4 rv4Var12 = (rv4) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var12.U(1 & intValue12, z8)) {
                    ar5 c = rp5.c((wk3) jk3.H.getValue(), rv4Var12, 0);
                    tza tzaVar4 = j27.a;
                    nk5.a(c, null, pna.n(kq7Var, 20.0f), ((h27) rv4Var12.j(tzaVar4)).a.w, rv4Var12, 432, 0);
                    xbe.i(rv4Var12, pna.n(kq7Var, 8.0f));
                    cvb.c(yqe.A((y3b) o2b.z.getValue(), rv4Var12), null, ((h27) rv4Var12.j(tzaVar4)).a.w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var12, 0, 0, 262138);
                } else {
                    rv4Var12.X();
                }
                return pvcVar;
            case 12:
                rv4 rv4Var13 = (rv4) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue13 & 17) != 16) {
                    z12 = true;
                }
                if (!rv4Var13.U(intValue13 & 1, z12)) {
                    rv4Var13.X();
                }
                return pvcVar;
            case 13:
                rv4 rv4Var14 = (rv4) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue14 & 17) != 16) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (rv4Var14.U(intValue14 & 1, z9)) {
                    nq7 A5 = zbe.A(pna.f(kq7Var, 1.0f), nae.e, 12.0f, 1);
                    b37 d4 = fu0.d(kh5.a, false);
                    int hashCode10 = Long.hashCode(rv4Var14.T);
                    xt8 l10 = rv4Var14.l();
                    nq7 p10 = lye.p(rv4Var14, A5);
                    rw1.k.getClass();
                    zx1 zx1Var7 = qw1.b;
                    rv4Var14.i0();
                    if (rv4Var14.S) {
                        rv4Var14.k(zx1Var7);
                    } else {
                        rv4Var14.r0();
                    }
                    jce.F(qw1.f, rv4Var14, d4);
                    jce.F(qw1.e, rv4Var14, l10);
                    jce.F(qw1.g, rv4Var14, Integer.valueOf(hashCode10));
                    jce.C(qw1.h, rv4Var14);
                    jce.F(qw1.d, rv4Var14, p10);
                    ts6.a(nae.e, 0, 3, 0L, rv4Var14, pna.n(zbe.A(pu0Var.a(kq7Var, kh5.e), nae.e, 12.0f, 1), 24.0f));
                    rv4Var14.q(true);
                } else {
                    rv4Var14.X();
                }
                return pvcVar;
            case 14:
                rv4 rv4Var15 = (rv4) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((wpa) obj).getClass();
                if ((intValue15 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var15.U(intValue15 & 1, z10)) {
                    nq7 n2 = pna.n(kq7Var, 16.0f);
                    b37 d5 = fu0.d(kh5.e, false);
                    int hashCode11 = Long.hashCode(rv4Var15.T);
                    xt8 l11 = rv4Var15.l();
                    nq7 p11 = lye.p(rv4Var15, n2);
                    rw1.k.getClass();
                    zx1 zx1Var8 = qw1.b;
                    rv4Var15.i0();
                    if (rv4Var15.S) {
                        rv4Var15.k(zx1Var8);
                    } else {
                        rv4Var15.r0();
                    }
                    jce.F(qw1.f, rv4Var15, d5);
                    jce.F(qw1.e, rv4Var15, l11);
                    jce.F(qw1.g, rv4Var15, Integer.valueOf(hashCode11));
                    jce.C(qw1.h, rv4Var15);
                    jce.F(qw1.d, rv4Var15, p11);
                    xbe.i(rv4Var15, nmd.v(pna.n(kq7Var, 12.0f), ((h27) rv4Var15.j(j27.a)).a.q, uu9.a));
                    rv4Var15.q(true);
                } else {
                    rv4Var15.X();
                }
                return pvcVar;
            case 15:
                rv4 rv4Var16 = (rv4) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ou0) obj).getClass();
                if ((intValue16 & 17) != 16) {
                    z12 = true;
                }
                if (!rv4Var16.U(intValue16 & 1, z12)) {
                    rv4Var16.X();
                }
                return pvcVar;
            case 16:
                rv4 rv4Var17 = (rv4) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((ou0) obj).getClass();
                if ((intValue17 & 17) != 16) {
                    z12 = true;
                }
                if (!rv4Var17.U(intValue17 & 1, z12)) {
                    rv4Var17.X();
                }
                return pvcVar;
            case 17:
                nq7 nq7Var = (nq7) obj;
                rv4 rv4Var18 = (rv4) obj2;
                ((Integer) obj3).getClass();
                nq7Var.getClass();
                rv4Var18.e0(125481379);
                nq7 v = nmd.v(nq7Var, zl1.b(0.2f, ((h27) rv4Var18.j(j27.a)).a.a), lre.g);
                rv4Var18.q(false);
                return v;
            case 18:
                Throwable th = (Throwable) obj3;
                ((xh5) obj).getClass();
                ((gh5) obj2).getClass();
                th.getClass();
                h40 h40Var = mh5.a;
                Throwable s = lye.s(th);
                return Boolean.valueOf(((s instanceof nh5) || (s instanceof cz1) || (s instanceof SocketTimeoutException) || (th instanceof CancellationException)) ? false : false);
            case 19:
                oh5 oh5Var = (oh5) obj3;
                ((xh5) obj).getClass();
                ((fh5) obj2).getClass();
                oh5Var.getClass();
                int i4 = oh5Var.e().a;
                return Boolean.valueOf((500 > i4 || i4 >= 600) ? false : false);
            case 20:
                float floatValue = ((Float) obj).floatValue();
                rv4 rv4Var19 = (rv4) obj2;
                ((Integer) obj3).intValue();
                rv4Var19.e0(-1824032304);
                String h = rqe.h("%d", Integer.valueOf((int) floatValue));
                rv4Var19.q(false);
                return h;
            case 21:
                float floatValue2 = ((Float) obj).floatValue();
                rv4 rv4Var20 = (rv4) obj2;
                ((Integer) obj3).intValue();
                rv4Var20.e0(2013276167);
                String h2 = rqe.h("%d", Integer.valueOf((int) floatValue2));
                rv4Var20.q(false);
                return h2;
            case 22:
                float floatValue3 = ((Float) obj).floatValue();
                rv4 rv4Var21 = (rv4) obj2;
                ((Integer) obj3).intValue();
                rv4Var21.e0(-996628600);
                String h3 = rqe.h("%d", Integer.valueOf((int) floatValue3));
                rv4Var21.q(false);
                return h3;
            case 23:
                float floatValue4 = ((Float) obj).floatValue();
                rv4 rv4Var22 = (rv4) obj2;
                ((Integer) obj3).intValue();
                rv4Var22.e0(288433929);
                String h4 = rqe.h("%d", Integer.valueOf((int) floatValue4));
                rv4Var22.q(false);
                return h4;
            case 24:
                float floatValue5 = ((Float) obj).floatValue();
                rv4 rv4Var23 = (rv4) obj2;
                ((Integer) obj3).getClass();
                rv4Var23.e0(-619125104);
                String B = yqe.B((y3b) b3b.i.getValue(), new Object[]{Integer.valueOf((int) (floatValue5 * 100.0f))}, rv4Var23);
                rv4Var23.q(false);
                return B;
            case 25:
                float floatValue6 = ((Float) obj).floatValue();
                rv4 rv4Var24 = (rv4) obj2;
                ((Integer) obj3).getClass();
                rv4Var24.e0(1523722873);
                String B2 = yqe.B((y3b) b3b.i.getValue(), new Object[]{Integer.valueOf((int) (floatValue6 * 100.0f))}, rv4Var24);
                rv4Var24.q(false);
                return B2;
            case 26:
                float floatValue7 = ((Float) obj).floatValue();
                rv4 rv4Var25 = (rv4) obj2;
                ((Integer) obj3).getClass();
                rv4Var25.e0(635685336);
                String B3 = yqe.B((y3b) b3b.i.getValue(), new Object[]{Integer.valueOf((int) (floatValue7 * 100.0f))}, rv4Var25);
                rv4Var25.q(false);
                return B3;
            case 27:
                Float f5 = (Float) obj;
                f5.floatValue();
                rv4 rv4Var26 = (rv4) obj2;
                ((Integer) obj3).intValue();
                rv4Var26.e0(-1525897854);
                String h5 = rqe.h("%.1f", f5);
                rv4Var26.q(false);
                return h5;
            case 28:
                rv4 rv4Var27 = (rv4) obj2;
                ((Integer) obj3).getClass();
                ((nq7) obj).getClass();
                rv4Var27.e0(2047499361);
                nq7 r = pna.r(pna.f(zbe.y(kq7Var, 24.0f), 1.0f), nae.e, nae.e, 300.0f, 3);
                tza tzaVar5 = j27.a;
                nq7 y2 = zbe.y(nmd.v(tte.k(r, ((h27) rv4Var27.j(tzaVar5)).c.d), ((h27) rv4Var27.j(tzaVar5)).a.n, lre.g), 24.0f);
                rv4Var27.q(false);
                return y2;
            default:
                nq7 nq7Var2 = (nq7) obj;
                rv4 rv4Var28 = (rv4) obj2;
                ((Integer) obj3).getClass();
                nq7Var2.getClass();
                rv4Var28.e0(1799047365);
                if (!((om3) rv4Var28.j(nm3.a)).f()) {
                    f2 = 80.0f;
                }
                nq7 C = zbe.C(nq7Var2, nae.e, nae.e, nae.e, f2, 7);
                rv4Var28.q(false);
                return C;
        }
    }
}
