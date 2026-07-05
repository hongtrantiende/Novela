package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ye7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m13 b;

    public /* synthetic */ ye7(m13 m13Var, int i) {
        this.a = i;
        this.b = m13Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long b;
        boolean z2;
        int i = this.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        m13 m13Var = this.b;
        boolean z3 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    ar5 c = rp5.c((wk3) ok3.e0.getValue(), rv4Var, 0);
                    if (((Boolean) m13Var.c.getValue()).booleanValue()) {
                        rv4Var.e0(370292709);
                        b = ((h27) rv4Var.j(j27.a)).a.a;
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(370387600);
                        b = zl1.b(0.5f, ((h27) rv4Var.j(j27.a)).a.q);
                        rv4Var.q(false);
                    }
                    long j = b;
                    nq7 n = pna.n(kq7Var, 24.0f);
                    boolean f = rv4Var.f(m13Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new ze7(m13Var, 0);
                        rv4Var.o0(P);
                    }
                    nk5.a(c, null, lbe.f(15, (vt4) P, n, null, false), j, rv4Var, 48, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z3)) {
                    boolean f2 = rv4Var2.f(m13Var);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new ze7(m13Var, 1);
                        rv4Var2.o0(P2);
                    }
                    nmd.j((vt4) P2, null, false, null, null, null, xxe.a, rv4Var2, 805306368, 510);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z2)) {
                    Object P3 = rv4Var3.P();
                    if (P3 == lh9Var) {
                        P3 = s21.e(rv4Var3);
                    }
                    zm4 zm4Var = (zm4) P3;
                    Object P4 = rv4Var3.P();
                    if (P4 == lh9Var) {
                        P4 = new sr3(zm4Var, null, 6);
                        rv4Var3.o0(P4);
                    }
                    yte.g((lu4) P4, rv4Var3, zm4Var);
                    Object P5 = rv4Var3.P();
                    if (P5 == lh9Var) {
                        int length = ((String) m13Var.b.getValue()).length();
                        P5 = yae.z(new jub((String) m13Var.b.getValue(), sze.a(length, length), 4));
                        rv4Var3.o0(P5);
                    }
                    aw7 aw7Var = (aw7) P5;
                    nq7 C = rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var3), 14);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var3.T);
                    xt8 l = rv4Var3.l();
                    nq7 p = lye.p(rv4Var3, C);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, d);
                    jce.F(qw1.e, rv4Var3, l);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p);
                    jub jubVar = (jub) aw7Var.getValue();
                    t86 t86Var = new t86(0, 7, Token.INC);
                    v72 v72Var = ((h27) rv4Var3.j(j27.a)).c.b;
                    nq7 n2 = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                    boolean f3 = rv4Var3.f(m13Var);
                    Object P6 = rv4Var3.P();
                    if (f3 || P6 == lh9Var) {
                        P6 = new j34(27, m13Var, aw7Var);
                        rv4Var3.o0(P6);
                    }
                    uwe.g(jubVar, (xt4) P6, n2, false, null, xxe.c, null, jce.E(-1739686492, new ye7(m13Var, 0), rv4Var3), false, null, t86Var, null, false, 0, 0, v72Var, null, rv4Var3, 806879232, 196608, 6258104);
                    rs8.u(rv4Var3, true, kq7Var, 12.0f, rv4Var3);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
