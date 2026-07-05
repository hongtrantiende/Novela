package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l14  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class l14 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t14 b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ l14(t14 t14Var, xt4 xt4Var, int i) {
        this.a = i;
        this.b = t14Var;
        this.c = xt4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        String str;
        pvc pvcVar;
        boolean z2;
        np npVar;
        String str2;
        kg kgVar;
        boolean z3;
        boolean h;
        boolean z4;
        int i2 = this.a;
        pvc pvcVar2 = pvc.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        int i3 = 16;
        xt4 xt4Var = this.c;
        t14 t14Var = this.b;
        int i4 = 2;
        switch (i2) {
            case 0:
                y61 y61Var = (y61) obj;
                int intValue = ((Integer) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                y61Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h = rv4Var.f(y61Var);
                    } else {
                        h = rv4Var.h(y61Var);
                    }
                    if (h) {
                        i4 = 4;
                    }
                    i = intValue2 | i4;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i3 = 32;
                    }
                    i |= i3;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    r14 r14Var = (r14) t14Var.f.get(intValue);
                    vw4 a = y61Var.a(r0f.z(rv4Var).d, rv4Var);
                    ze4 ze4Var = pna.c;
                    nq7 k = tte.k(ze4Var, a);
                    boolean h2 = rv4Var.h(r14Var) | rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (h2 || P == lh9Var) {
                        P = new m14(r14Var, xt4Var, 0);
                        rv4Var.o0(P);
                    }
                    nq7 b = q1d.b(k, false, nae.e, (vt4) P, 3);
                    nk0 nk0Var = kh5.a;
                    b37 d = fu0.d(nk0Var, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, b);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    np npVar2 = qw1.f;
                    jce.F(npVar2, rv4Var, d);
                    np npVar3 = qw1.e;
                    jce.F(npVar3, rv4Var, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar4 = qw1.g;
                    jce.F(npVar4, rv4Var, valueOf);
                    kg kgVar2 = qw1.h;
                    jce.C(kgVar2, rv4Var);
                    np npVar5 = qw1.d;
                    jce.F(npVar5, rv4Var, p);
                    String str3 = r14Var.b;
                    String str4 = r14Var.c;
                    String str5 = r14Var.a;
                    String str6 = r14Var.d;
                    do5.a(str3, r0f.d, false, 720, null, null, ze4Var, null, rv4Var, 12607536, 876);
                    rv4 rv4Var2 = rv4Var;
                    int length = str6.length();
                    pu0 pu0Var = pu0.a;
                    if (length > 0) {
                        rv4Var2.e0(1692343610);
                        str = str4;
                        pvcVar = pvcVar2;
                        cvb.c(str6, pu0Var.a(zbe.z(nmd.v(zbe.y(kq7Var, 4.0f), zl1.b(0.8f, zl1.b), r0f.z(rv4Var2).a), 4.0f, 2.0f), nk0Var), zl1.e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).l, rv4Var2, 384, 0, 131064);
                        rv4Var2 = rv4Var2;
                        rv4Var2.q(false);
                    } else {
                        str = str4;
                        pvcVar = pvcVar2;
                        rv4Var2.e0(1692900463);
                        rv4Var2.q(false);
                    }
                    if (str5.length() > 0) {
                        rv4Var2.e0(1692986302);
                        Object P2 = rv4Var2.P();
                        if (P2 == lh9Var) {
                            Float valueOf2 = Float.valueOf((float) nae.e);
                            long j = zl1.b;
                            npVar = npVar5;
                            str2 = str5;
                            kgVar = kgVar2;
                            P2 = ox9.C(new yk8[]{new yk8(valueOf2, new zl1(zl1.b(nae.e, j))), new yk8(Float.valueOf(0.4f), new zl1(zl1.b(0.6f, j))), new yk8(Float.valueOf(1.0f), new zl1(zl1.b(1.0f, j)))});
                            rv4Var2.o0(P2);
                        } else {
                            npVar = npVar5;
                            str2 = str5;
                            kgVar = kgVar2;
                        }
                        nq7 z5 = zbe.z(nmd.u(pna.f(pu0Var.a(kq7Var, kh5.C), 1.0f), (hy0) P2), 12.0f, 8.0f);
                        xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, z5);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar2, rv4Var2, a2);
                        jce.F(npVar3, rv4Var2, l2);
                        s21.t(hashCode2, rv4Var2, npVar4, rv4Var2, kgVar);
                        jce.F(npVar, rv4Var2, p2);
                        cvb.c(str2, pna.f(kq7Var, 1.0f), zl1.e, null, 0L, null, dq4.C, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).j, rv4Var2, 1573296, 24960, 110520);
                        if (str.length() > 0) {
                            rv4Var2.e0(1402546055);
                            cvb.c(str, null, zl1.b(0.6f, r0f.y(rv4Var2).q), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r0f.A(rv4Var2).l, rv4Var2, 0, 24960, 110586);
                            z3 = false;
                            rv4Var2.q(false);
                        } else {
                            z3 = false;
                            rv4Var2.e0(1402906151);
                            rv4Var2.q(false);
                        }
                        z2 = true;
                        rv4Var2.q(true);
                        rv4Var2.q(z3);
                    } else {
                        z2 = true;
                        rv4Var2.e0(1694386479);
                        rv4Var2.q(false);
                    }
                    rv4Var2.q(z2);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar2;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((yj6) obj).getClass();
                if ((intValue4 & 48) == 0) {
                    if (rv4Var3.d(intValue3)) {
                        i3 = 32;
                    }
                    intValue4 |= i3;
                }
                int i5 = intValue4;
                if ((i5 & Token.TARGET) != 144) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var3.U(i5 & 1, z4)) {
                    r14 r14Var2 = (r14) t14Var.f.get(intValue3);
                    nq7 c = pna.c(kq7Var, 1.0f);
                    tza tzaVar = j27.a;
                    nq7 v = nmd.v(tte.k(c, ((h27) rv4Var3.j(tzaVar)).c.c), ((h27) rv4Var3.j(tzaVar)).a.r, lre.g);
                    boolean h3 = rv4Var3.h(r14Var2) | rv4Var3.f(xt4Var);
                    Object P3 = rv4Var3.P();
                    if (h3 || P3 == lh9Var) {
                        P3 = new m14(r14Var2, xt4Var, 2);
                        rv4Var3.o0(P3);
                    }
                    nq7 A = zbe.A(q1d.b(v, false, nae.e, (vt4) P3, 3), 16.0f, nae.e, 2);
                    b37 d2 = fu0.d(kh5.e, false);
                    int hashCode3 = Long.hashCode(rv4Var3.T);
                    xt8 l3 = rv4Var3.l();
                    nq7 p3 = lye.p(rv4Var3, A);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var2);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, d2);
                    jce.F(qw1.e, rv4Var3, l3);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p3);
                    cvb.c(r14Var2.a, null, ((h27) rv4Var3.j(tzaVar)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var3.j(tzaVar)).b.h, rv4Var3, 0, 24576, 114682);
                    rv4Var3.q(true);
                } else {
                    rv4Var3.X();
                }
                return pvcVar2;
        }
    }
}
