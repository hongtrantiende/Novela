package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y2c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2c implements mu4 {
    public final /* synthetic */ vt4 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ hu4 F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ vt4 f;

    public /* synthetic */ y2c(vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, boolean z, xt4 xt4Var, vt4 vt4Var5, vt4 vt4Var6, String str, String str2) {
        this.e = vt4Var;
        this.f = vt4Var2;
        this.C = vt4Var3;
        this.D = vt4Var4;
        this.b = z;
        this.c = xt4Var;
        this.E = vt4Var5;
        this.F = vt4Var6;
        this.d = str;
        this.G = str2;
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        float f;
        wk3 wk3Var;
        ?? r12;
        float f2;
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        Object obj4 = this.G;
        hu4 hu4Var = this.F;
        Object obj5 = this.E;
        Object obj6 = this.D;
        boolean z2 = false;
        switch (i2) {
            case 0:
                vt4 vt4Var = (vt4) obj6;
                vt4 vt4Var2 = (vt4) obj5;
                vt4 vt4Var3 = (vt4) hu4Var;
                String str = (String) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    lk0 lk0Var = kh5.I;
                    ez ezVar = lz.c;
                    xn1 a = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, f3);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var, p);
                    nq7 h = q1d.h(rv4Var, pna.f(kq7Var, 1.0f));
                    tza tzaVar = j27.a;
                    nq7 y = zbe.y(mwe.u(nmd.v(h, zl1.b(0.95f, rm1.g(((h27) rv4Var.j(tzaVar)).a, 4.0f)), lre.g), false, 7), 12.0f);
                    xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, y);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a2);
                    jce.F(npVar2, rv4Var, l2);
                    s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p2);
                    nq7 f4 = pna.f(kq7Var, 1.0f);
                    mk0 mk0Var = kh5.F;
                    dz dzVar = lz.a;
                    gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var, 0);
                    int hashCode3 = Long.hashCode(rv4Var.T);
                    xt8 l3 = rv4Var.l();
                    nq7 p3 = lye.p(rv4Var, f4);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a3);
                    jce.F(npVar2, rv4Var, l3);
                    s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p3);
                    eh.a(rp5.c(jk3.a(), rv4Var, 0), null, this.f, null, rv4Var, 0, 10);
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    xbe.i(rv4Var, new we6(f, true));
                    eh.a(rp5.c((wk3) ok3.g0.getValue(), rv4Var, 0), null, this.C, null, rv4Var, 0, 10);
                    xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
                    eh.a(rp5.c((wk3) rk3.f.getValue(), rv4Var, 0), null, vt4Var, null, rv4Var, 0, 10);
                    xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
                    boolean z3 = this.b;
                    if (z3) {
                        wk3Var = (wk3) jk3.m.getValue();
                    } else {
                        wk3Var = (wk3) jk3.l.getValue();
                    }
                    ar5 c = rp5.c(wk3Var, rv4Var, 0);
                    xt4 xt4Var = this.c;
                    boolean f5 = rv4Var.f(xt4Var) | rv4Var.g(z3);
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (f5 || P == lh9Var) {
                        P = new up0(23, xt4Var, z3);
                        rv4Var.o0(P);
                    }
                    eh.a(c, null, (vt4) P, null, rv4Var, 0, 10);
                    xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
                    eh.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var, 0), null, vt4Var2, null, rv4Var, 0, 10);
                    xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
                    eh.a(rp5.c((wk3) ok3.M.getValue(), rv4Var, 0), null, vt4Var3, null, rv4Var, 0, 10);
                    rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
                    nq7 f6 = pna.f(kq7Var, 1.0f);
                    vt4 vt4Var4 = this.e;
                    boolean f7 = rv4Var.f(vt4Var4);
                    Object P2 = rv4Var.P();
                    if (!f7 && P2 != lh9Var) {
                        r12 = 0;
                    } else {
                        r12 = 0;
                        P2 = new a3c(0, vt4Var4);
                        rv4Var.o0(P2);
                    }
                    nq7 t = q1d.t(1, (vt4) P2, rv4Var, f6, r12);
                    xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, r12);
                    int hashCode4 = Long.hashCode(rv4Var.T);
                    xt8 l4 = rv4Var.l();
                    nq7 p4 = lye.p(rv4Var, t);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a4);
                    jce.F(npVar2, rv4Var, l4);
                    s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p4);
                    cvb.c(this.d, null, ((h27) rv4Var.j(tzaVar)).a.q, null, zr1.q(16), null, dq4.D, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, rv4Var, 1597440, 24960, 241578);
                    nq7 f8 = pna.f(kq7Var, 1.0f);
                    gv9 a5 = ev9.a(dzVar, kh5.G, rv4Var, 48);
                    int hashCode5 = Long.hashCode(rv4Var.T);
                    xt8 l5 = rv4Var.l();
                    nq7 p5 = lye.p(rv4Var, f8);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a5);
                    jce.F(npVar2, rv4Var, l5);
                    s21.t(hashCode5, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p5);
                    long q = zr1.q(14);
                    long j = ((h27) rv4Var.j(tzaVar)).a.q;
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    cvb.c(str, new we6(f2, false), j, null, q, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, null, rv4Var, 24576, 24960, 240616);
                    nk5.a(rp5.c((wk3) ok3.t.getValue(), rv4Var, 0), null, pna.n(kq7Var, 16.0f), ((h27) rv4Var.j(tzaVar)).a.q, rv4Var, 432, 0);
                    hl5.v(rv4Var, true, true, true);
                    vqe.m(nae.e, 6, 2, rm1.g(((h27) rv4Var.j(tzaVar)).a, 4.0f), rv4Var, pna.f(kq7Var, 1.0f));
                    rv4Var.q(true);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar;
            default:
                List list = (List) obj6;
                p6d p6dVar = (p6d) obj5;
                xt4 xt4Var2 = (xt4) hu4Var;
                xt4 xt4Var3 = (xt4) obj4;
                su0 su0Var = (su0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(su0Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                }
                if (rv4Var2.U(1 & intValue2, z2)) {
                    nmd.d(this.b, this.c, pna.h(kq7Var, (su0Var.c() * 2.0f) / 3.0f), true, null, null, ((h27) rv4Var2.j(j27.a)).a.p, 0L, nae.e, 0L, null, jce.E(337775251, new sq5(this.d, list, p6dVar, xt4Var2, this.e, this.f, this.C, xt4Var3), rv4Var2), rv4Var2, 3072, 48, 1968);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ y2c(boolean z, xt4 xt4Var, String str, List list, p6d p6dVar, xt4 xt4Var2, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, xt4 xt4Var3) {
        this.b = z;
        this.c = xt4Var;
        this.d = str;
        this.D = list;
        this.E = p6dVar;
        this.F = xt4Var2;
        this.e = vt4Var;
        this.f = vt4Var2;
        this.C = vt4Var3;
        this.G = xt4Var3;
    }
}
