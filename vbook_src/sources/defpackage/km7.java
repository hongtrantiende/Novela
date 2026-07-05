package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: km7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class km7 implements mu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ km7(vt4 vt4Var, vt4 vt4Var2, int i, int i2, xt4 xt4Var, int i3, vt4 vt4Var3, vt4 vt4Var4) {
        this.e = vt4Var;
        this.f = vt4Var2;
        this.b = i;
        this.c = i2;
        this.C = xt4Var;
        this.d = i3;
        this.D = vt4Var3;
        this.E = vt4Var4;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        aw7 aw7Var;
        aw7 aw7Var2;
        aw7 aw7Var3;
        aw7 aw7Var4;
        aw7 aw7Var5;
        boolean z;
        float f;
        dm8 g;
        int i;
        float f2;
        float f3;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        Object obj4 = this.E;
        Object obj5 = this.D;
        int i3 = this.d;
        Object obj6 = this.C;
        int i4 = this.c;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i2) {
            case 0:
                boolean z2 = false;
                aw7 aw7Var6 = (aw7) obj8;
                aw7 aw7Var7 = (aw7) obj7;
                aw7 aw7Var8 = (aw7) obj6;
                aw7 aw7Var9 = (aw7) obj5;
                aw7 aw7Var10 = (aw7) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    float intValue2 = ((Number) aw7Var10.getValue()).intValue();
                    String A = yqe.A((y3b) x2b.X.getValue(), rv4Var);
                    nq7 f4 = pna.f(kq7Var, 1.0f);
                    sv1 sv1Var = new sv1(20);
                    boolean f5 = rv4Var.f(aw7Var6) | rv4Var.f(aw7Var7) | rv4Var.f(aw7Var8) | rv4Var.f(aw7Var9);
                    Object P = rv4Var.P();
                    if (!f5 && P != lh9Var) {
                        aw7Var = aw7Var8;
                    } else {
                        bd4 bd4Var = new bd4(aw7Var6, aw7Var7, aw7Var8, aw7Var9, 4);
                        aw7Var = aw7Var8;
                        rv4Var.o0(bd4Var);
                        P = bd4Var;
                    }
                    ctd.q(intValue2, A, sv1Var, nae.e, 100.0f, 1.0f, f4, (xt4) P, rv4Var, 1797120);
                    float f6 = this.b;
                    String A2 = yqe.A((y3b) x2b.Y.getValue(), rv4Var);
                    nq7 f7 = pna.f(kq7Var, 1.0f);
                    sv1 sv1Var2 = new sv1(21);
                    boolean f8 = rv4Var.f(aw7Var6) | rv4Var.f(aw7Var10) | rv4Var.f(aw7Var7) | rv4Var.f(aw7Var9);
                    Object P2 = rv4Var.P();
                    if (!f8 && P2 != lh9Var) {
                        aw7Var2 = aw7Var10;
                        aw7Var3 = aw7Var7;
                    } else {
                        aw7Var2 = aw7Var10;
                        P2 = new bd4(aw7Var6, aw7Var2, aw7Var7, aw7Var9, 5);
                        aw7Var3 = aw7Var7;
                        rv4Var.o0(P2);
                    }
                    ctd.q(f6, A2, sv1Var2, nae.e, 100.0f, 1.0f, f7, (xt4) P2, rv4Var, 1797120);
                    float f9 = i4;
                    String A3 = yqe.A((y3b) x2b.Z.getValue(), rv4Var);
                    nq7 f10 = pna.f(kq7Var, 1.0f);
                    sv1 sv1Var3 = new sv1(22);
                    boolean f11 = rv4Var.f(aw7Var6) | rv4Var.f(aw7Var2) | rv4Var.f(aw7Var) | rv4Var.f(aw7Var9);
                    Object P3 = rv4Var.P();
                    if (!f11 && P3 != lh9Var) {
                        aw7Var5 = aw7Var;
                        aw7Var4 = aw7Var2;
                    } else {
                        aw7Var4 = aw7Var2;
                        aw7Var5 = aw7Var;
                        P3 = new bd4(aw7Var6, aw7Var4, aw7Var5, aw7Var9, 6);
                        aw7Var6 = aw7Var6;
                        rv4Var.o0(P3);
                    }
                    ctd.q(f9, A3, sv1Var3, nae.e, 100.0f, 1.0f, f10, (xt4) P3, rv4Var, 1797120);
                    float f12 = i3;
                    String A4 = yqe.A((y3b) x2b.W.getValue(), rv4Var);
                    nq7 f13 = pna.f(kq7Var, 1.0f);
                    sv1 sv1Var4 = new sv1(23);
                    boolean f14 = rv4Var.f(aw7Var6) | rv4Var.f(aw7Var4) | rv4Var.f(aw7Var3) | rv4Var.f(aw7Var5);
                    Object P4 = rv4Var.P();
                    if (f14 || P4 == lh9Var) {
                        bd4 bd4Var2 = new bd4(aw7Var6, aw7Var4, aw7Var3, aw7Var5, 7);
                        rv4Var.o0(bd4Var2);
                        P4 = bd4Var2;
                    }
                    ctd.q(f12, A4, sv1Var4, nae.e, 100.0f, 1.0f, f13, (xt4) P4, rv4Var, 1797120);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                vt4 vt4Var = (vt4) obj8;
                vt4 vt4Var2 = (vt4) obj7;
                xt4 xt4Var = (xt4) obj6;
                vt4 vt4Var3 = (vt4) obj5;
                vt4 vt4Var4 = (vt4) obj4;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue3 & 1, z)) {
                    nq7 f15 = pna.f(kq7Var, 1.0f);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, f15);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var2, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var2, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var2);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var2, p);
                    nq7 f16 = pna.f(kq7Var, 1.0f);
                    tza tzaVar = j27.a;
                    vqe.m(nae.e, 6, 2, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), rv4Var2, f16);
                    nq7 z3 = zbe.z(mwe.u(nmd.v(q1d.h(rv4Var2, pna.f(kq7Var, 1.0f)), zl1.b(0.9f, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 4.0f)), lre.g), false, 14), 12.0f, 6.0f);
                    gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
                    int hashCode2 = Long.hashCode(rv4Var2.T);
                    xt8 l2 = rv4Var2.l();
                    nq7 p2 = lye.p(rv4Var2, z3);
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(npVar, rv4Var2, a2);
                    jce.F(npVar2, rv4Var2, l2);
                    s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                    jce.F(npVar4, rv4Var2, p2);
                    mfb mfbVar = jk3.d;
                    pc2.a(rp5.c((wk3) mfbVar.getValue(), rv4Var2, 0), null, vt4Var, rv4Var2, 0, 2);
                    xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                    pc2.a(rp5.c((wk3) ok3.m0.getValue(), rv4Var2, 0), null, vt4Var2, rv4Var2, 0, 2);
                    xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                    Object P5 = rv4Var2.P();
                    if (P5 == lh9Var) {
                        P5 = yae.z(Boolean.FALSE);
                        rv4Var2.o0(P5);
                    }
                    aw7 aw7Var11 = (aw7) P5;
                    int i5 = this.b;
                    boolean d = rv4Var2.d(i5);
                    Object P6 = rv4Var2.P();
                    if (!d && P6 != lh9Var) {
                        g = P6;
                        f = 1.0f;
                    } else {
                        aw7Var11.setValue(Boolean.FALSE);
                        f = 1.0f;
                        g = hl5.g(i5 + 1.0f, rv4Var2);
                    }
                    dm8 dm8Var = g;
                    if (((Boolean) aw7Var11.getValue()).booleanValue()) {
                        i = (int) (dm8Var.h() - f);
                    } else {
                        i = i5;
                    }
                    boolean d2 = rv4Var2.d(i) | rv4Var2.d(i4);
                    Object P7 = rv4Var2.P();
                    float f17 = nae.e;
                    if (d2 || P7 == lh9Var) {
                        if (i4 <= 0) {
                            f2 = 0.0f;
                        } else {
                            f2 = ((i + 1.0f) * 100.0f) / i4;
                        }
                        P7 = rqe.h("%.1f", Float.valueOf(f2));
                        rv4Var2.o0(P7);
                    }
                    cvb.c(yqe.B((y3b) b3b.i.getValue(), new Object[]{(String) P7}, rv4Var2), zbe.A(kq7Var, nae.e, 6.0f, 1), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var2, 48, 0, 131064);
                    xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                    float f18 = i4;
                    if (f18 < 1.0f) {
                        f18 = 1.0f;
                    }
                    if (((Boolean) aw7Var11.getValue()).booleanValue()) {
                        f3 = dm8Var.h();
                    } else {
                        f3 = i5 + 1.0f;
                    }
                    float m = dce.m(f3, 1.0f, f18);
                    jk1 jk1Var = new jk1(1.0f, f18);
                    kpa kpaVar = kpa.a;
                    gpa d3 = kpa.d(0L, 0L, zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar)).a.a), rv4Var2, 1015);
                    we6 we6Var = new we6(1.0f, true);
                    boolean f19 = rv4Var2.f(dm8Var);
                    Object P8 = rv4Var2.P();
                    if (f19 || P8 == lh9Var) {
                        P8 = new wo8(aw7Var11, dm8Var, 0);
                        rv4Var2.o0(P8);
                    }
                    xt4 xt4Var2 = (xt4) P8;
                    boolean f20 = rv4Var2.f(dm8Var) | rv4Var2.d(i5) | rv4Var2.f(xt4Var);
                    Object P9 = rv4Var2.P();
                    if (f20 || P9 == lh9Var) {
                        P9 = new vo8(i5, xt4Var, dm8Var, aw7Var11, 1);
                        rv4Var2.o0(P9);
                    }
                    dae.d(m, xt4Var2, we6Var, false, (vt4) P9, d3, null, 0, null, null, jk1Var, rv4Var2, 0, 0, 968);
                    xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                    if (i3 != 0) {
                        if (i3 != 1) {
                            f17 = -45.0f;
                        } else {
                            f17 = -135.0f;
                        }
                    }
                    pc2.a(rp5.c((wk3) ok3.k0.getValue(), rv4Var2, 0), tte.t(kq7Var, ((Number) nq.b(f17, null, null, rv4Var2, 0, 30).getValue()).floatValue()), vt4Var3, rv4Var2, 0, 0);
                    xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                    pc2.a(rp5.c((wk3) mfbVar.getValue(), rv4Var2, 0), tte.t(kq7Var, 180.0f), vt4Var4, rv4Var2, 48, 0);
                    rv4Var2.q(true);
                    rv4Var2.q(true);
                    return pvcVar;
                }
                rv4Var2.X();
                return pvcVar;
        }
    }

    public /* synthetic */ km7(aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, int i, aw7 aw7Var5, int i2, int i3) {
        this.e = aw7Var;
        this.f = aw7Var2;
        this.C = aw7Var3;
        this.D = aw7Var4;
        this.b = i;
        this.E = aw7Var5;
        this.c = i2;
        this.d = i3;
    }
}
