package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ew0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew0 implements mu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ew0(vo9 vo9Var, boolean z, xt4 xt4Var, boolean z2, xt4 xt4Var2) {
        this.f = vo9Var;
        this.b = z;
        this.c = xt4Var;
        this.d = z2;
        this.e = xt4Var2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        Object obj4 = this.f;
        switch (i2) {
            case 0:
                vt4 vt4Var = (vt4) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ou0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    w06 w06Var = w06.b;
                    kq7 kq7Var = kq7.a;
                    nq7 t = pna.t(zj0.m(kq7Var, w06Var), 200.0f, 320.0f);
                    tza tzaVar = j27.a;
                    nq7 y = zbe.y(nmd.v(t, rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 18.0f);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, y);
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
                    nq2.p(384, this.c, rv4Var, pna.f(kq7Var, 1.0f), yqe.A((y3b) v1b.A0.getValue(), rv4Var), this.b);
                    xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
                    nq2.p(384, this.e, rv4Var, pna.f(kq7Var, 1.0f), yqe.A((y3b) v1b.B0.getValue(), rv4Var), this.d);
                    vqe.m(nae.e, 6, 2, rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f), rv4Var, zbe.A(kq7Var, nae.e, 8.0f, 1));
                    String A = yqe.A((y3b) v1b.C0.getValue(), rv4Var);
                    oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.j;
                    long j = ((h27) rv4Var.j(tzaVar)).a.w;
                    nq7 k = tte.k(pna.f(kq7Var, 1.0f), ((h27) rv4Var.j(tzaVar)).c.b);
                    boolean f = rv4Var.f(vt4Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new pa(5, vt4Var);
                        rv4Var.o0(P);
                    }
                    cvb.c(A, zbe.A(lbe.f(15, (vt4) P, k, null, false), nae.e, 8.0f, 1), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131064);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                vo9 vo9Var = (vo9) obj4;
                xg6 xg6Var = (xg6) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xg6Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(xg6Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    final boolean z3 = this.b;
                    final xt4 xt4Var = this.c;
                    final boolean z4 = this.d;
                    final xt4 xt4Var2 = this.e;
                    vqe.p(xg6Var, vo9Var, "highlight", null, false, null, jce.E(-957982048, new nu4() { // from class: s32
                        @Override // defpackage.nu4
                        public final Object h(Object obj5, Object obj6, Object obj7, Object obj8) {
                            boolean z5;
                            ((Boolean) obj6).getClass();
                            rv4 rv4Var3 = (rv4) obj7;
                            int intValue3 = ((Integer) obj8).intValue();
                            ((do9) obj5).getClass();
                            if ((intValue3 & Token.DEFAULT) != 128) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (rv4Var3.U(intValue3 & 1, z5)) {
                                kq7 kq7Var2 = kq7.a;
                                nq7 f2 = pna.f(kq7Var2, 1.0f);
                                xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                                int hashCode2 = Long.hashCode(rv4Var3.T);
                                xt8 l2 = rv4Var3.l();
                                nq7 p2 = lye.p(rv4Var3, f2);
                                rw1.k.getClass();
                                zx1 zx1Var2 = qw1.b;
                                rv4Var3.i0();
                                if (rv4Var3.S) {
                                    rv4Var3.k(zx1Var2);
                                } else {
                                    rv4Var3.r0();
                                }
                                np npVar = qw1.f;
                                jce.F(npVar, rv4Var3, a2);
                                np npVar2 = qw1.e;
                                jce.F(npVar2, rv4Var3, l2);
                                Integer valueOf = Integer.valueOf(hashCode2);
                                np npVar3 = qw1.g;
                                jce.F(npVar3, rv4Var3, valueOf);
                                kg kgVar = qw1.h;
                                jce.C(kgVar, rv4Var3);
                                np npVar4 = qw1.d;
                                jce.F(npVar4, rv4Var3, p2);
                                nq7 k2 = tte.k(pna.f(kq7Var2, 1.0f), r0f.z(rv4Var3).d);
                                long g = rm1.g(r0f.y(rv4Var3), 3.0f);
                                ba5 ba5Var = lre.g;
                                nq7 z6 = zbe.z(nmd.v(k2, g, ba5Var), 12.0f, 8.0f);
                                gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var3, 48);
                                int hashCode3 = Long.hashCode(rv4Var3.T);
                                xt8 l3 = rv4Var3.l();
                                nq7 p3 = lye.p(rv4Var3, z6);
                                rv4Var3.i0();
                                if (rv4Var3.S) {
                                    rv4Var3.k(zx1Var2);
                                } else {
                                    rv4Var3.r0();
                                }
                                jce.F(npVar, rv4Var3, a3);
                                jce.F(npVar2, rv4Var3, l3);
                                s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
                                jce.F(npVar4, rv4Var3, p3);
                                xbe.i(rv4Var3, pna.s(kq7Var2, 12.0f));
                                cvb.c(yqe.A((y3b) f3b.d0.getValue(), rv4Var3), new we6(1.0f, true), r0f.y(rv4Var3).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var3).j, rv4Var3, 0, 0, 131064);
                                tte.g(z4, false, null, xt4Var2, rv4Var3, 0, 6);
                                rs8.u(rv4Var3, true, kq7Var2, 4.0f, rv4Var3);
                                lpe.f(0, xt4Var, rv4Var3, zbe.A(a82.g(rv4Var3, 1.0f, tte.k(pna.f(kq7Var2, 1.0f), v72.d(r0f.z(rv4Var3).d, null, null, r0f.z(rv4Var3).a.c, r0f.z(rv4Var3).a.d, 3)), ba5Var), 12.0f, nae.e, 2), z3);
                                rv4Var3.q(true);
                            } else {
                                rv4Var3.X();
                            }
                            return pvc.a;
                        }
                    }, rv4Var2), rv4Var2, (intValue2 & 14) | 1597824, 20);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ ew0(boolean z, xt4 xt4Var, boolean z2, xt4 xt4Var2, vt4 vt4Var) {
        this.b = z;
        this.c = xt4Var;
        this.d = z2;
        this.e = xt4Var2;
        this.f = vt4Var;
    }
}
