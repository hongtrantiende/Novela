package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uc5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc5 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ uc5(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.a;
        int i2 = 4;
        String str = this.b;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        boolean z5 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 nq7Var = pna.c;
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, nq7Var);
                    rw1.k.getClass();
                    vt4 vt4Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(vt4Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    Object obj4 = this.b;
                    boolean f = rv4Var.f(obj4);
                    Object P = rv4Var.P();
                    Object obj5 = ax1.a;
                    if (f || P == obj5) {
                        P = yae.z(i10.a);
                        rv4Var.o0(P);
                    }
                    aw7 aw7Var = (aw7) P;
                    nq7 a = pu0.a.a(kq7Var, kh5.D);
                    if (((m10) aw7Var.getValue()) instanceof l10) {
                        m10 m10Var = (m10) aw7Var.getValue();
                        m10Var.getClass();
                        int e = ((l10) m10Var).b.a.e();
                        m10 m10Var2 = (m10) aw7Var.getValue();
                        m10Var2.getClass();
                        int d2 = ((l10) m10Var2).b.a.d();
                        if (e > 0 && d2 > 0) {
                            if (e > d2) {
                                nq7Var = jsc.t(e / d2, pna.f(kq7Var, 1.0f), false);
                            } else {
                                nq7Var = jsc.t(d2 / e, pna.c(kq7Var, 1.0f), false);
                            }
                        }
                    }
                    nq7 a0 = a.a0(nq7Var);
                    u22 u22Var = r0f.e;
                    boolean f2 = rv4Var.f(aw7Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == obj5) {
                        P2 = new qp4(aw7Var, 8);
                        rv4Var.o0(P2);
                    }
                    do5.a(obj4, u22Var, false, null, null, que.c, a0, (xt4) P2, rv4Var, 1572912, 572);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                ou0 ou0Var = (ou0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ou0Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (!rv4Var2.f(ou0Var)) {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    dxe.h(rp5.b((wk3) jk3.D.getValue(), rv4Var2, 0), null, ou0Var.b(), null, r0f.d, nae.e, null, rv4Var2, 24632, Token.ASSIGN_LOGICAL_AND);
                    oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.i;
                    cvb.c(this.b, ou0Var.a(zbe.y(kq7Var, 12.0f), kh5.e), zl1.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var2, 384, 0, 131064);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                ou0 ou0Var2 = (ou0) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ou0Var2.getClass();
                if ((intValue3 & 6) == 0) {
                    if (!rv4Var3.f(ou0Var2)) {
                        i2 = 2;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    dxe.h(rp5.b((wk3) jk3.D.getValue(), rv4Var3, 0), null, ou0Var2.b(), null, r0f.d, nae.e, null, rv4Var3, 24632, Token.ASSIGN_LOGICAL_AND);
                    oyb oybVar2 = ((h27) rv4Var3.j(j27.a)).b.i;
                    cvb.c(this.b, ou0Var2.a(zbe.y(kq7Var, 12.0f), kh5.e), zl1.b, new qa0(zr1.q(9), zr1.q(14), zr1.p(0.25d)), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar2, rv4Var3, 384, 0, 131056);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    nk5.a(rp5.c((wk3) rk3.h.getValue(), rv4Var4, 0), null, null, 0L, rv4Var4, 48, 12);
                    xbe.i(rv4Var4, pna.s(kq7Var, 8.0f));
                    cvb.c(yqe.B((y3b) k3b.O.getValue(), new Object[]{str}, rv4Var4), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var4, 0, 0, 262142);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var5 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z5 = true;
                }
                if (rv4Var5.U(intValue5 & 1, z5)) {
                    cvb.c(yqe.B((y3b) k3b.a0.getValue(), new Object[]{str}, rv4Var5), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var5, 0, 0, 262142);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
        }
    }
}
