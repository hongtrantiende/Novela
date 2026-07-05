package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tl7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl7 implements mu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tl7(int i, xt4 xt4Var, String str, List list) {
        this.c = str;
        this.b = i;
        this.d = xt4Var;
        this.e = list;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float f;
        int i = this.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        Object obj4 = this.e;
        Object obj5 = this.c;
        int i2 = this.b;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj5;
                xt4 xt4Var = (xt4) obj6;
                List list = (List) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    if (i2 < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean f2 = rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f2 || P == lh9Var) {
                        P = new hg7(26, xt4Var);
                        rv4Var.o0(P);
                    }
                    xl7.h(str, z2, (vt4) P, rv4Var, 0);
                    int i3 = 0;
                    for (Object obj7 : list) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            String str2 = ((hbd) obj7).a;
                            if (i3 == i2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean f3 = rv4Var.f(xt4Var) | rv4Var.d(i3);
                            Object P2 = rv4Var.P();
                            if (f3 || P2 == lh9Var) {
                                P2 = new tp0(xt4Var, i3, 11);
                                rv4Var.o0(P2);
                            }
                            xl7.h(str2, z3, (vt4) P2, rv4Var, 0);
                            i3 = i4;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                m82 m82Var = (m82) obj5;
                kj6 kj6Var = (kj6) obj6;
                yya yyaVar = (yya) obj4;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z4)) {
                    nq7 n = pna.n(kq7Var, 36.0f);
                    su9 su9Var = uu9.a;
                    boolean h = rv4Var2.h(m82Var) | rv4Var2.f(kj6Var) | rv4Var2.d(i2);
                    Object P3 = rv4Var2.P();
                    if (h || P3 == lh9Var) {
                        P3 = new hm(m82Var, kj6Var, i2, 4);
                        rv4Var2.o0(P3);
                    }
                    wq9.c((vt4) P3, n, su9Var, null, 0L, 0L, null, jce.E(1263541898, new gi7(yyaVar, 2), rv4Var2), rv4Var2, 100663344, 248);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                xt4 xt4Var2 = (xt4) obj6;
                Set set = (Set) obj5;
                u43 u43Var = (u43) obj4;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z5)) {
                    nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2);
                    long g = rm1.g(r0f.y(rv4Var3), 2.0f);
                    ba5 ba5Var = lre.g;
                    nq7 v = nmd.v(A, g, ba5Var);
                    boolean f4 = rv4Var3.f(xt4Var2) | rv4Var3.d(i2);
                    Object P4 = rv4Var3.P();
                    if (f4 || P4 == lh9Var) {
                        P4 = new tp0(xt4Var2, i2, 14);
                        rv4Var3.o0(P4);
                    }
                    nq7 z6 = zbe.z(lbe.f(15, (vt4) P4, v, null, false), 16.0f, 12.0f);
                    b37 d = fu0.d(kh5.a, false);
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
                    jce.F(npVar, rv4Var3, d);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var3, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var3, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var3);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var3, p);
                    nq7 f5 = pna.f(kq7Var, 1.0f);
                    nk0 nk0Var = kh5.d;
                    pu0 pu0Var = pu0.a;
                    nq7 C = zbe.C(pu0Var.a(f5, nk0Var), nae.e, nae.e, 28.0f, nae.e, 11);
                    gv9 a = ev9.a(lz.a, kh5.F, rv4Var3, 0);
                    int hashCode2 = Long.hashCode(rv4Var3.T);
                    xt8 l2 = rv4Var3.l();
                    nq7 p2 = lye.p(rv4Var3, C);
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(npVar, rv4Var3, a);
                    jce.F(npVar2, rv4Var3, l2);
                    s21.t(hashCode2, rv4Var3, npVar3, rv4Var3, kgVar);
                    jce.F(npVar4, rv4Var3, p2);
                    cvb.c(u43Var.a, new we6(1.0f, false), r0f.y(rv4Var3).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var3).h, rv4Var3, 0, 0, 131064);
                    xbe.i(rv4Var3, pna.s(kq7Var, 8.0f));
                    cvb.c(String.valueOf(u43Var.b.size()), zbe.z(nmd.v(tte.k(kq7Var, uu9.a), zl1.b(0.14f, r0f.y(rv4Var3).a), ba5Var), 8.0f, 3.0f), r0f.y(rv4Var3).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var3).m, rv4Var3, 0, 0, 131064);
                    rv4Var3.q(true);
                    if (set.contains(Integer.valueOf(i2))) {
                        f = -90.0f;
                    } else {
                        f = 0.0f;
                    }
                    yya b = nq.b(f, null, null, rv4Var3, 0, 30);
                    ar5 c = rp5.c((wk3) ok3.t.getValue(), rv4Var3, 0);
                    nq7 n2 = pna.n(pu0Var.a(kq7Var, kh5.f), 24.0f);
                    boolean f6 = rv4Var3.f(b);
                    Object P5 = rv4Var3.P();
                    if (f6 || P5 == lh9Var) {
                        P5 = new jt0(b, 10);
                        rv4Var3.o0(P5);
                    }
                    nk5.a(c, null, axe.k(n2, (xt4) P5), 0L, rv4Var3, 48, 8);
                    rv4Var3.q(true);
                    return pvcVar;
                }
                rv4Var3.X();
                return pvcVar;
        }
    }

    public /* synthetic */ tl7(m82 m82Var, kj6 kj6Var, int i, yya yyaVar) {
        this.c = m82Var;
        this.d = kj6Var;
        this.b = i;
        this.e = yyaVar;
    }

    public /* synthetic */ tl7(xt4 xt4Var, int i, Set set, u43 u43Var) {
        this.d = xt4Var;
        this.b = i;
        this.c = set;
        this.e = u43Var;
    }
}
