package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s90  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s90 implements mu4 {
    public final /* synthetic */ hu4 C;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s90(boolean z, float f, List list, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var) {
        this.b = z;
        this.c = f;
        this.f = list;
        this.d = xt4Var;
        this.C = xt4Var2;
        this.e = vt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        wk3 wk3Var;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.C;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                vt4 vt4Var = (vt4) obj4;
                vt4 vt4Var2 = (vt4) hu4Var;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    mk0 mk0Var = kh5.G;
                    su9 su9Var = uu9.a;
                    kq7 kq7Var = kq7.a;
                    nq7 y = zbe.y(q1d.h(rv4Var, tte.k(kq7Var, su9Var)), 4.0f);
                    dz dzVar = lz.a;
                    gv9 a = ev9.a(dzVar, mk0Var, rv4Var, 48);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, y);
                    rw1.k.getClass();
                    vt4 vt4Var3 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(vt4Var3);
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
                    boolean z4 = this.b;
                    if (z4) {
                        wk3Var = (wk3) ok3.W.getValue();
                    } else {
                        wk3Var = (wk3) ok3.a0.getValue();
                    }
                    ar5 c = rp5.c(wk3Var, rv4Var, 0);
                    nq7 k = tte.k(pna.n(kq7Var, 32.0f), su9Var);
                    long b = zl1.b(0.95f, rm1.g(r0f.y(rv4Var), 4.0f));
                    ba5 ba5Var = lre.g;
                    nq7 v = nmd.v(k, b, ba5Var);
                    boolean g = rv4Var.g(z4);
                    vt4 vt4Var4 = this.e;
                    boolean f3 = g | rv4Var.f(vt4Var4) | rv4Var.f(vt4Var);
                    Object P = rv4Var.P();
                    Object obj5 = ax1.a;
                    if (!f3 && P != obj5) {
                        z2 = false;
                    } else {
                        z2 = false;
                        P = new u90(z4, vt4Var4, vt4Var, 0);
                        rv4Var.o0(P);
                    }
                    nk5.a(c, null, zbe.y(lbe.f(15, (vt4) P, v, null, z2), 6.0f), r0f.y(rv4Var).q, rv4Var, 48, 0);
                    xbe.i(rv4Var, pna.s(kq7Var, 6.0f));
                    float f4 = this.c;
                    boolean c2 = rv4Var.c(f4);
                    Object P2 = rv4Var.P();
                    if (c2 || P2 == obj5) {
                        P2 = yae.z(Float.valueOf(f4));
                        rv4Var.o0(P2);
                    }
                    aw7 aw7Var = (aw7) P2;
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                        f = Float.MAX_VALUE;
                    } else {
                        f = Float.MAX_VALUE;
                        f2 = 1.0f;
                    }
                    nq7 v2 = nmd.v(new we6(f2, true), zl1.b(0.95f, rm1.g(r0f.y(rv4Var), 4.0f)), su9Var);
                    gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var, 48);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, v2);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(vt4Var3);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a2);
                    jce.F(npVar2, rv4Var, l2);
                    s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p2);
                    nq7 h = pna.h(tte.k(kq7Var, su9Var), 32.0f);
                    float f5 = 1.0f;
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > f) {
                        f5 = f;
                    }
                    nq7 A = zbe.A(h.a0(new we6(f5, true)), 8.0f, nae.e, 2);
                    kpa kpaVar = kpa.a;
                    gpa d = kpa.d(r0f.y(rv4Var).q, r0f.y(rv4Var).q, zl1.b(0.2f, r0f.y(rv4Var).q), rv4Var, 1012);
                    float floatValue = ((Number) aw7Var.getValue()).floatValue();
                    jk1 jk1Var = new jk1(0.1f, 5.0f);
                    boolean f6 = rv4Var.f(aw7Var);
                    Object P3 = rv4Var.P();
                    if (f6 || P3 == obj5) {
                        P3 = new s7(aw7Var, 3);
                        rv4Var.o0(P3);
                    }
                    xt4 xt4Var = (xt4) P3;
                    xt4 xt4Var2 = this.d;
                    boolean f7 = rv4Var.f(xt4Var2) | rv4Var.f(aw7Var);
                    Object P4 = rv4Var.P();
                    if (f7 || P4 == obj5) {
                        P4 = new v90(0, xt4Var2, aw7Var);
                        rv4Var.o0(P4);
                    }
                    dae.d(floatValue, xt4Var, A, false, (vt4) P4, d, null, 0, null, null, jk1Var, rv4Var, 0, 0, 968);
                    cvb.c(rqe.h("%.1f", Float.valueOf(((Number) aw7Var.getValue()).floatValue())), zbe.C(kq7Var, nae.e, nae.e, 8.0f, nae.e, 11), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).l, rv4Var, 48, 0, 131064);
                    s21.x(rv4Var, true, kq7Var, 6.0f, rv4Var);
                    ar5 c3 = rp5.c((wk3) jk3.w.getValue(), rv4Var, 0);
                    nq7 v3 = nmd.v(tte.k(pna.n(kq7Var, 32.0f), su9Var), zl1.b(0.95f, rm1.g(r0f.y(rv4Var), 4.0f)), ba5Var);
                    boolean f8 = rv4Var.f(vt4Var2);
                    Object P5 = rv4Var.P();
                    if (f8 || P5 == obj5) {
                        P5 = new pa(1, vt4Var2);
                        rv4Var.o0(P5);
                    }
                    nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) P5, v3, null, false), 6.0f), r0f.y(rv4Var).q, rv4Var, 48, 0);
                    rv4Var.q(true);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar;
            default:
                List list = (List) obj4;
                xt4 xt4Var3 = (xt4) hu4Var;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z3)) {
                    xoe.e(this.b, this.c, list, zbe.y(mwe.u(pna.f(kq7.a, 1.0f), false, 14), 24.0f), this.d, xt4Var3, this.e, rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ s90(boolean z, vt4 vt4Var, vt4 vt4Var2, float f, vt4 vt4Var3, xt4 xt4Var) {
        this.b = z;
        this.e = vt4Var;
        this.f = vt4Var2;
        this.c = f;
        this.C = vt4Var3;
        this.d = xt4Var;
    }
}
