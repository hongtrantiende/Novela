package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ihb  reason: default package */
/* loaded from: classes3.dex */
public final class ihb implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ ihb(List list, List list2, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = xt4Var;
        this.e = xt4Var2;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        v72 d;
        boolean z4;
        String str;
        float f;
        boolean z5;
        int i2;
        int i3;
        int i4;
        boolean z6;
        boolean z7;
        boolean z8;
        v72 d2;
        boolean z9;
        gpb gpbVar;
        String str2;
        gpb gpbVar2;
        float f2;
        boolean z10;
        int i5;
        int i6;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        v72 d3;
        boolean z14;
        String str3;
        float f3;
        boolean z15;
        int i8;
        int i9;
        int i10;
        boolean z16;
        boolean z17;
        boolean z18;
        v72 d4;
        boolean z19;
        int i11;
        int i12;
        int i13 = this.a;
        pvc pvcVar = pvc.a;
        dz dzVar = lz.a;
        kq7 kq7Var = kq7.a;
        List list = this.c;
        List list2 = this.b;
        xt4 xt4Var = this.d;
        lh9 lh9Var = ax1.a;
        xt4 xt4Var2 = this.e;
        switch (i13) {
            case 0:
                yf6 yf6Var = (yf6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(yf6Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = i3 | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
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
                if (rv4Var.U(i & 1, z)) {
                    doa doaVar = (doa) list2.get(intValue);
                    rv4Var.e0(-1806655370);
                    if (intValue == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (intValue == tl1.x(list)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z2 && !z3) {
                        rv4Var.e0(-1582293603);
                        d = ((h27) rv4Var.j(j27.a)).c.a;
                        rv4Var.q(false);
                    } else if (z2 && z3) {
                        rv4Var.e0(-1582290984);
                        d = ((h27) rv4Var.j(j27.a)).c.d;
                        rv4Var.q(false);
                    } else if (z2) {
                        rv4Var.e0(-1806303366);
                        tza tzaVar = j27.a;
                        d = v72.d(((h27) rv4Var.j(tzaVar)).c.d, null, null, ((h27) rv4Var.j(tzaVar)).c.a.c, ((h27) rv4Var.j(tzaVar)).c.a.d, 3);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-1582279620);
                        tza tzaVar2 = j27.a;
                        d = v72.d(((h27) rv4Var.j(tzaVar2)).c.d, ((h27) rv4Var.j(tzaVar2)).c.a.a, ((h27) rv4Var.j(tzaVar2)).c.a.b, null, null, 12);
                        rv4Var.q(false);
                    }
                    nq7 k = tte.k(kq7Var, d);
                    tza tzaVar3 = j27.a;
                    nq7 v = nmd.v(k, rm1.g(((h27) rv4Var.j(tzaVar3)).a, 1.0f), lre.g);
                    boolean f4 = rv4Var.f(xt4Var) | rv4Var.h(doaVar);
                    Object P = rv4Var.P();
                    if (!f4 && P != lh9Var) {
                        z4 = false;
                    } else {
                        z4 = false;
                        P = new hhb(xt4Var, doaVar, 0);
                        rv4Var.o0(P);
                    }
                    nq7 a = yf6.a(yf6Var, zbe.A(lbe.f(15, (vt4) P, v, null, z4), nae.e, 4.0f, 1));
                    gv9 a2 = ev9.a(dzVar, kh5.G, rv4Var, 48);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, a);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var, a2);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var);
                    np npVar4 = qw1.d;
                    nq7 C = zbe.C(s21.f(rv4Var, p, npVar4, 1.0f, true), 16.0f, nae.e, nae.e, nae.e, 14);
                    xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, C);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a3);
                    jce.F(npVar2, rv4Var, l2);
                    s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p2);
                    String str4 = doaVar.b;
                    String str5 = doaVar.c;
                    cvb.c(str4, pna.f(kq7Var, 1.0f), ((h27) rv4Var.j(tzaVar3)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar3)).b.k, rv4Var, 48, 0, 131064);
                    rv4Var.e0(-1942997487);
                    if (str5.length() == 0) {
                        str = yqe.A((y3b) o2b.z0.getValue(), rv4Var);
                    } else {
                        str = str5;
                    }
                    rv4Var.q(false);
                    oyb oybVar = ((h27) rv4Var.j(tzaVar3)).b.k;
                    long j = ((h27) rv4Var.j(tzaVar3)).a.q;
                    if (str5.length() == 0) {
                        f = 0.2f;
                    } else {
                        f = 1.0f;
                    }
                    cvb.c(str, pna.f(kq7Var, 1.0f), zl1.b(f, j), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 48, 0, 131064);
                    rv4Var.q(true);
                    ar5 c = rp5.c((wk3) jk3.H.getValue(), rv4Var, 0);
                    long j2 = zl1.f;
                    nq7 k2 = tte.k(pna.n(kq7Var, 40.0f), uu9.a);
                    boolean f5 = rv4Var.f(xt4Var2) | rv4Var.h(doaVar);
                    Object P2 = rv4Var.P();
                    if (!f5 && P2 != lh9Var) {
                        z5 = true;
                    } else {
                        z5 = true;
                        P2 = new hhb(xt4Var2, doaVar, 1);
                        rv4Var.o0(P2);
                    }
                    nk5.a(c, null, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 8.0f), j2, rv4Var, 3120, 0);
                    rv4Var.q(z5);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                yf6 yf6Var2 = (yf6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(yf6Var2)) {
                        i6 = 4;
                    } else {
                        i6 = 2;
                    }
                    i4 = i6 | intValue4;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                if ((i4 & Token.EXPR_VOID) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var2.U(i4 & 1, z6)) {
                    af9 af9Var = (af9) list2.get(intValue3);
                    rv4Var2.e0(-1552808986);
                    if (intValue3 == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (intValue3 == tl1.x(list)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    nq7 f6 = pna.f(kq7Var, 1.0f);
                    if (!z7 && !z8) {
                        rv4Var2.e0(1612484969);
                        d2 = ((h27) rv4Var2.j(j27.a)).c.a;
                        rv4Var2.q(false);
                    } else if (z7 && z8) {
                        rv4Var2.e0(1612487716);
                        d2 = ((h27) rv4Var2.j(j27.a)).c.d;
                        rv4Var2.q(false);
                    } else if (z7) {
                        rv4Var2.e0(-1552407134);
                        tza tzaVar4 = j27.a;
                        d2 = v72.d(((h27) rv4Var2.j(tzaVar4)).c.d, null, null, ((h27) rv4Var2.j(tzaVar4)).c.a.c, ((h27) rv4Var2.j(tzaVar4)).c.a.d, 3);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(1612499732);
                        tza tzaVar5 = j27.a;
                        d2 = v72.d(((h27) rv4Var2.j(tzaVar5)).c.d, ((h27) rv4Var2.j(tzaVar5)).c.a.a, ((h27) rv4Var2.j(tzaVar5)).c.a.b, null, null, 12);
                        rv4Var2.q(false);
                    }
                    nq7 k3 = tte.k(f6, d2);
                    long g = rm1.g(r0f.y(rv4Var2), 1.0f);
                    ba5 ba5Var = lre.g;
                    nq7 v2 = nmd.v(k3, g, ba5Var);
                    int i14 = af9Var.f;
                    String str6 = af9Var.d;
                    if (i14 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean f7 = rv4Var2.f(xt4Var) | rv4Var2.h(af9Var);
                    Object P3 = rv4Var2.P();
                    if (f7 || P3 == lh9Var) {
                        P3 = new lpb(xt4Var, af9Var, 0);
                        rv4Var2.o0(P3);
                    }
                    nq7 a4 = yf6.a(yf6Var2, zbe.z(lbe.f(14, (vt4) P3, v2, null, z9), 16.0f, 6.0f));
                    gv9 a5 = ev9.a(dzVar, kh5.G, rv4Var2, 48);
                    int hashCode3 = Long.hashCode(rv4Var2.T);
                    xt8 l3 = rv4Var2.l();
                    nq7 p3 = lye.p(rv4Var2, a4);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    np npVar5 = qw1.f;
                    jce.F(npVar5, rv4Var2, a5);
                    np npVar6 = qw1.e;
                    jce.F(npVar6, rv4Var2, l3);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    np npVar7 = qw1.g;
                    jce.F(npVar7, rv4Var2, valueOf2);
                    kg kgVar2 = qw1.h;
                    jce.C(kgVar2, rv4Var2);
                    np npVar8 = qw1.d;
                    we6 f8 = s21.f(rv4Var2, p3, npVar8, 1.0f, true);
                    xn1 a6 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                    int hashCode4 = Long.hashCode(rv4Var2.T);
                    xt8 l4 = rv4Var2.l();
                    nq7 p4 = lye.p(rv4Var2, f8);
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(npVar5, rv4Var2, a6);
                    jce.F(npVar6, rv4Var2, l4);
                    s21.t(hashCode4, rv4Var2, npVar7, rv4Var2, kgVar2);
                    jce.F(npVar8, rv4Var2, p4);
                    String str7 = af9Var.c;
                    gpb gpbVar3 = gpb.b;
                    gpb gpbVar4 = gpb.d;
                    if (i14 == 1) {
                        gpbVar = gpbVar4;
                    } else {
                        gpbVar = gpbVar3;
                    }
                    cvb.c(str7, pna.f(kq7Var, 1.0f), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, gpbVar, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).j, rv4Var2, 48, 0, 130552);
                    rv4Var2.e0(1485405361);
                    if (str6.length() == 0) {
                        str2 = yqe.A((y3b) o2b.z0.getValue(), rv4Var2);
                    } else {
                        str2 = str6;
                    }
                    rv4Var2.q(false);
                    oyb oybVar2 = r0f.A(rv4Var2).j;
                    if (i14 == 1) {
                        gpbVar2 = gpbVar4;
                    } else {
                        gpbVar2 = gpbVar3;
                    }
                    long j3 = r0f.y(rv4Var2).q;
                    if (str6.length() == 0) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    cvb.c(str2, pna.f(kq7Var, 1.0f), zl1.b(f2, j3), null, 0L, null, null, null, 0L, gpbVar2, null, 0L, 0, false, 0, 0, null, oybVar2, rv4Var2, 48, 0, 130552);
                    rv4Var2.q(true);
                    ar5 c2 = rp5.c((wk3) jk3.H.getValue(), rv4Var2, 0);
                    long j4 = zl1.f;
                    nq7 g2 = a82.g(rv4Var2, 2.0f, tte.k(pna.n(kq7Var, 32.0f), uu9.a), ba5Var);
                    boolean f9 = rv4Var2.f(xt4Var2) | rv4Var2.h(af9Var);
                    Object P4 = rv4Var2.P();
                    if (!f9 && P4 != lh9Var) {
                        z10 = true;
                    } else {
                        z10 = true;
                        P4 = new lpb(xt4Var2, af9Var, 1);
                        rv4Var2.o0(P4);
                    }
                    nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P4, g2, null, false), 6.0f), j4, rv4Var2, 3120, 0);
                    rv4Var2.q(z10);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                yf6 yf6Var3 = (yf6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (rv4Var3.f(yf6Var3)) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    i7 = intValue6 | i9;
                } else {
                    i7 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (rv4Var3.d(intValue5)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((i7 & Token.EXPR_VOID) != 146) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (rv4Var3.U(i7 & 1, z11)) {
                    ox7 ox7Var = (ox7) list2.get(intValue5);
                    rv4Var3.e0(1971800726);
                    if (intValue5 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (intValue5 == list.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    nq7 f10 = pna.f(kq7Var, 1.0f);
                    if (!z12 && !z13) {
                        rv4Var3.e0(-2014594652);
                        d3 = ((h27) rv4Var3.j(j27.a)).c.a;
                        rv4Var3.q(false);
                    } else if (z12 && z13) {
                        rv4Var3.e0(-2014591777);
                        d3 = ((h27) rv4Var3.j(j27.a)).c.d;
                        rv4Var3.q(false);
                    } else if (z12) {
                        rv4Var3.e0(1972249915);
                        tza tzaVar6 = j27.a;
                        d3 = v72.d(((h27) rv4Var3.j(tzaVar6)).c.d, null, null, ((h27) rv4Var3.j(tzaVar6)).c.a.c, ((h27) rv4Var3.j(tzaVar6)).c.a.d, 3);
                        rv4Var3.q(false);
                    } else {
                        rv4Var3.e0(-2014579109);
                        tza tzaVar7 = j27.a;
                        d3 = v72.d(((h27) rv4Var3.j(tzaVar7)).c.d, ((h27) rv4Var3.j(tzaVar7)).c.a.a, ((h27) rv4Var3.j(tzaVar7)).c.a.b, null, null, 12);
                        rv4Var3.q(false);
                    }
                    nq7 k4 = tte.k(f10, d3);
                    long g3 = rm1.g(r0f.y(rv4Var3), 1.0f);
                    ba5 ba5Var2 = lre.g;
                    nq7 v3 = nmd.v(k4, g3, ba5Var2);
                    boolean f11 = rv4Var3.f(xt4Var) | rv4Var3.h(ox7Var);
                    Object P5 = rv4Var3.P();
                    if (!f11 && P5 != lh9Var) {
                        z14 = false;
                    } else {
                        z14 = false;
                        P5 = new ypb(xt4Var, ox7Var, 0);
                        rv4Var3.o0(P5);
                    }
                    nq7 a7 = yf6.a(yf6Var3, zbe.z(lbe.f(15, (vt4) P5, v3, null, z14), 16.0f, 8.0f));
                    gv9 a8 = ev9.a(dzVar, kh5.G, rv4Var3, 48);
                    int hashCode5 = Long.hashCode(rv4Var3.T);
                    xt8 l5 = rv4Var3.l();
                    nq7 p5 = lye.p(rv4Var3, a7);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var3);
                    } else {
                        rv4Var3.r0();
                    }
                    np npVar9 = qw1.f;
                    jce.F(npVar9, rv4Var3, a8);
                    np npVar10 = qw1.e;
                    jce.F(npVar10, rv4Var3, l5);
                    Integer valueOf3 = Integer.valueOf(hashCode5);
                    np npVar11 = qw1.g;
                    jce.F(npVar11, rv4Var3, valueOf3);
                    kg kgVar3 = qw1.h;
                    jce.C(kgVar3, rv4Var3);
                    np npVar12 = qw1.d;
                    we6 f12 = s21.f(rv4Var3, p5, npVar12, 1.0f, true);
                    xn1 a9 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                    int hashCode6 = Long.hashCode(rv4Var3.T);
                    xt8 l6 = rv4Var3.l();
                    nq7 p6 = lye.p(rv4Var3, f12);
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var3);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(npVar9, rv4Var3, a9);
                    jce.F(npVar10, rv4Var3, l6);
                    s21.t(hashCode6, rv4Var3, npVar11, rv4Var3, kgVar3);
                    jce.F(npVar12, rv4Var3, p6);
                    String str8 = ox7Var.c;
                    String str9 = ox7Var.d;
                    cvb.c(str8, pna.f(kq7Var, 1.0f), r0f.y(rv4Var3).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var3).j, rv4Var3, 48, 0, 131064);
                    rv4Var3.e0(-1547947464);
                    if (str9.length() == 0) {
                        str3 = yqe.A((y3b) o2b.z0.getValue(), rv4Var3);
                    } else {
                        str3 = str9;
                    }
                    rv4Var3.q(false);
                    oyb oybVar3 = r0f.A(rv4Var3).j;
                    long j5 = r0f.y(rv4Var3).q;
                    if (str9.length() == 0) {
                        f3 = 0.5f;
                    } else {
                        f3 = 1.0f;
                    }
                    cvb.c(str3, pna.f(kq7Var, 1.0f), zl1.b(f3, j5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar3, rv4Var3, 48, 0, 131064);
                    rv4Var3.q(true);
                    ar5 c3 = rp5.c((wk3) jk3.H.getValue(), rv4Var3, 0);
                    long j6 = zl1.f;
                    nq7 g4 = a82.g(rv4Var3, 2.0f, tte.k(pna.n(kq7Var, 32.0f), uu9.a), ba5Var2);
                    boolean f13 = rv4Var3.f(xt4Var2) | rv4Var3.h(ox7Var);
                    Object P6 = rv4Var3.P();
                    if (!f13 && P6 != lh9Var) {
                        z15 = true;
                    } else {
                        z15 = true;
                        P6 = new ypb(xt4Var2, ox7Var, 1);
                        rv4Var3.o0(P6);
                    }
                    nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) P6, g4, null, false), 6.0f), j6, rv4Var3, 3120, 0);
                    rv4Var3.q(z15);
                    rv4Var3.q(false);
                    return pvcVar;
                }
                rv4Var3.X();
                return pvcVar;
            default:
                yf6 yf6Var4 = (yf6) obj;
                int intValue7 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (rv4Var4.f(yf6Var4)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i10 = intValue8 | i12;
                } else {
                    i10 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (rv4Var4.d(intValue7)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                int i15 = i10;
                if ((i15 & Token.EXPR_VOID) != 146) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rv4Var4.U(i15 & 1, z16)) {
                    mnc mncVar = (mnc) list2.get(intValue7);
                    rv4Var4.e0(-1297545780);
                    if (intValue7 == 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (intValue7 == tl1.x(list)) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    nq7 f14 = pna.f(kq7Var, 1.0f);
                    if (!z17 && !z18) {
                        rv4Var4.e0(-1565868264);
                        d4 = ((h27) rv4Var4.j(j27.a)).c.a;
                        rv4Var4.q(false);
                    } else if (z17 && z18) {
                        rv4Var4.e0(-1565865517);
                        d4 = ((h27) rv4Var4.j(j27.a)).c.d;
                        rv4Var4.q(false);
                    } else if (z17) {
                        rv4Var4.e0(-1297109549);
                        tza tzaVar8 = j27.a;
                        d4 = v72.d(((h27) rv4Var4.j(tzaVar8)).c.d, null, null, ((h27) rv4Var4.j(tzaVar8)).c.a.c, ((h27) rv4Var4.j(tzaVar8)).c.a.d, 3);
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(-1565853501);
                        tza tzaVar9 = j27.a;
                        d4 = v72.d(((h27) rv4Var4.j(tzaVar9)).c.d, ((h27) rv4Var4.j(tzaVar9)).c.a.a, ((h27) rv4Var4.j(tzaVar9)).c.a.b, null, null, 12);
                        rv4Var4.q(false);
                    }
                    nq7 k5 = tte.k(f14, d4);
                    tza tzaVar10 = j27.a;
                    long g5 = rm1.g(((h27) rv4Var4.j(tzaVar10)).a, 1.0f);
                    ba5 ba5Var3 = lre.g;
                    nq7 v4 = nmd.v(k5, g5, ba5Var3);
                    boolean f15 = rv4Var4.f(xt4Var) | rv4Var4.h(mncVar);
                    Object P7 = rv4Var4.P();
                    if (f15 || P7 == lh9Var) {
                        P7 = new u3c(xt4Var, mncVar, 0);
                        rv4Var4.o0(P7);
                    }
                    nq7 a10 = yf6.a(yf6Var4, zbe.z(lbe.f(15, (vt4) P7, v4, null, false), 16.0f, 4.0f));
                    gv9 a11 = ev9.a(dzVar, kh5.G, rv4Var4, 48);
                    int hashCode7 = Long.hashCode(rv4Var4.T);
                    xt8 l7 = rv4Var4.l();
                    nq7 p7 = lye.p(rv4Var4, a10);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var4);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, a11);
                    jce.F(qw1.e, rv4Var4, l7);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode7));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p7);
                    cvb.c(mncVar.c, zbe.A(new we6(1.0f, true), nae.e, 8.0f, 1), ((h27) rv4Var4.j(tzaVar10)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var4.j(tzaVar10)).b.j, rv4Var4, 0, 0, 131064);
                    ar5 c4 = rp5.c((wk3) jk3.H.getValue(), rv4Var4, 0);
                    long j7 = zl1.f;
                    nq7 v5 = nmd.v(tte.k(pna.n(kq7Var, 32.0f), uu9.a), rm1.g(((h27) rv4Var4.j(tzaVar10)).a, 2.0f), ba5Var3);
                    boolean f16 = rv4Var4.f(xt4Var2) | rv4Var4.h(mncVar);
                    Object P8 = rv4Var4.P();
                    if (!f16 && P8 != lh9Var) {
                        z19 = true;
                    } else {
                        z19 = true;
                        P8 = new u3c(xt4Var2, mncVar, 1);
                        rv4Var4.o0(P8);
                    }
                    nk5.a(c4, null, zbe.y(lbe.f(15, (vt4) P8, v5, null, false), 6.0f), j7, rv4Var4, 3120, 0);
                    rv4Var4.q(z19);
                    rv4Var4.q(false);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
