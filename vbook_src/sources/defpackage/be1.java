package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: be1  reason: default package */
/* loaded from: classes3.dex */
public final class be1 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;

    public /* synthetic */ be1(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        v72 d;
        int i4 = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        List list = this.c;
        List list2 = this.b;
        int i5 = 16;
        int i6 = 2;
        switch (i4) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(xg6Var)) {
                        i6 = 4;
                    }
                    i = intValue2 | i6;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i5 = 32;
                    }
                    i |= i5;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    ((Number) list2.get(intValue)).intValue();
                    rv4Var.e0(2018235496);
                    nq7 k = tte.k(pna.f(kq7Var, 1.0f), fbe.x(intValue, list.size(), rv4Var));
                    tza tzaVar = j27.a;
                    v9b.a(nmd.v(k, rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), null, zl1.b(nae.e, ((h27) rv4Var.j(tzaVar)).a.p), 0L, nae.e, nae.e, null, p1d.d, rv4Var, 12582912, Token.FUNCTION);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                xg6 xg6Var2 = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(xg6Var2)) {
                        i6 = 4;
                    }
                    i2 = intValue4 | i6;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i5 = 32;
                    }
                    i2 |= i5;
                }
                if ((i2 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(i2 & 1, z2)) {
                    ((Number) list2.get(intValue3)).intValue();
                    rv4Var2.e0(-283903236);
                    nq7 k2 = tte.k(pna.f(kq7Var, 1.0f), fbe.x(intValue3, list.size(), rv4Var2));
                    tza tzaVar2 = j27.a;
                    v9b.a(nmd.v(k2, rm1.g(((h27) rv4Var2.j(tzaVar2)).a, 1.0f), lre.g), null, zl1.b(nae.e, ((h27) rv4Var2.j(tzaVar2)).a.p), 0L, nae.e, nae.e, null, oc2.e, rv4Var2, 12582912, Token.FUNCTION);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                yf6 yf6Var = (yf6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (rv4Var3.f(yf6Var)) {
                        i6 = 4;
                    }
                    i3 = intValue6 | i6;
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (rv4Var3.d(intValue5)) {
                        i5 = 32;
                    }
                    i3 |= i5;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(i3 & 1, z3)) {
                    ((Number) list2.get(intValue5)).intValue();
                    rv4Var3.e0(207549207);
                    if (intValue5 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (intValue5 == tl1.x(list)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    nq7 f = pna.f(kq7Var, 1.0f);
                    if (!z4 && !z5) {
                        rv4Var3.e0(422345797);
                        d = ((h27) rv4Var3.j(j27.a)).c.a;
                        rv4Var3.q(false);
                    } else if (z4 && z5) {
                        rv4Var3.e0(422348544);
                        d = ((h27) rv4Var3.j(j27.a)).c.d;
                        rv4Var3.q(false);
                    } else if (z4) {
                        rv4Var3.e0(207984198);
                        tza tzaVar3 = j27.a;
                        d = v72.d(((h27) rv4Var3.j(tzaVar3)).c.d, null, null, ((h27) rv4Var3.j(tzaVar3)).c.a.c, ((h27) rv4Var3.j(tzaVar3)).c.a.d, 3);
                        rv4Var3.q(false);
                    } else {
                        rv4Var3.e0(422360560);
                        tza tzaVar4 = j27.a;
                        d = v72.d(((h27) rv4Var3.j(tzaVar4)).c.d, ((h27) rv4Var3.j(tzaVar4)).c.a.a, ((h27) rv4Var3.j(tzaVar4)).c.a.b, null, null, 12);
                        rv4Var3.q(false);
                    }
                    nq7 k3 = tte.k(f, d);
                    tza tzaVar5 = j27.a;
                    nq7 z6 = zbe.z(nmd.v(k3, rm1.g(((h27) rv4Var3.j(tzaVar5)).a, 1.0f), lre.g), 16.0f, 8.0f);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                    int hashCode = Long.hashCode(rv4Var3.T);
                    xt8 l = rv4Var3.l();
                    nq7 p = lye.p(rv4Var3, z6);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var3, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var3, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var3, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var3);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var3, p);
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var3, 48);
                    int hashCode2 = Long.hashCode(rv4Var3.T);
                    xt8 l2 = rv4Var3.l();
                    nq7 p2 = lye.p(rv4Var3, f2);
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(npVar, rv4Var3, a2);
                    jce.F(npVar2, rv4Var3, l2);
                    s21.t(hashCode2, rv4Var3, npVar3, rv4Var3, kgVar);
                    jce.F(npVar4, rv4Var3, p2);
                    dpe.g(pna.n(kq7Var, 30.0f), uu9.a, rv4Var3, 6, 0);
                    xbe.i(rv4Var3, pna.s(kq7Var, 8.0f));
                    dpe.g(pna.h(pna.f(kq7Var, 0.5f), 20.0f), ((h27) rv4Var3.j(tzaVar5)).c.b, rv4Var3, 6, 0);
                    rs8.u(rv4Var3, true, kq7Var, 6.0f, rv4Var3);
                    dpe.g(pna.h(pna.f(kq7Var, 0.8f), 16.0f), ((h27) rv4Var3.j(tzaVar5)).c.b, rv4Var3, 6, 0);
                    dpe.g(pna.h(hl5.f(kq7Var, 6.0f, rv4Var3, kq7Var, 0.6f), 16.0f), ((h27) rv4Var3.j(tzaVar5)).c.b, rv4Var3, 6, 0);
                    rv4Var3.q(true);
                    rv4Var3.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
