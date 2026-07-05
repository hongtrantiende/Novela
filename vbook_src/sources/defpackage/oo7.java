package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oo7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ oo7(vt4 vt4Var, xt4 xt4Var) {
        this.a = 0;
        this.c = xt4Var;
        this.b = vt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        lh9 lh9Var = ax1.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        vt4 vt4Var = this.b;
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
                    ze4 ze4Var = pna.c;
                    nq7 u = mwe.u(ze4Var, false, 13);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, u);
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
                    cvb.c(yqe.A((y3b) b3b.b0.getValue(), rv4Var), zbe.z(kq7.a, 24.0f, 12.0f), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.f, rv4Var, 0, 0, 131068);
                    ape.m(ze4Var, xt4Var, vt4Var, rv4Var, 6);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(1 & intValue2, z2)) {
                    boolean f = rv4Var2.f(vt4Var) | rv4Var2.f(xt4Var);
                    Object P = rv4Var2.P();
                    if (f || P == lh9Var) {
                        P = new o65(0, vt4Var, xt4Var);
                        rv4Var2.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, mue.a, rv4Var2, 805306368, 510);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    boolean f2 = rv4Var3.f(vt4Var) | rv4Var3.f(xt4Var);
                    Object P2 = rv4Var3.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new o65(7, vt4Var, xt4Var);
                        rv4Var3.o0(P2);
                    }
                    nmd.j((vt4) P2, null, false, null, null, null, eg0.e, rv4Var3, 805306368, 510);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                if (rv4Var4.U(intValue4 & 1, z3)) {
                    boolean f3 = rv4Var4.f(vt4Var) | rv4Var4.f(xt4Var);
                    Object P3 = rv4Var4.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new o65(8, vt4Var, xt4Var);
                        rv4Var4.o0(P3);
                    }
                    nmd.j((vt4) P3, null, false, null, null, null, y9e.b, rv4Var4, 805306368, 510);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ oo7(int i, vt4 vt4Var, xt4 xt4Var) {
        this.a = i;
        this.b = vt4Var;
        this.c = xt4Var;
    }
}
