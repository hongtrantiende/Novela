package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: or3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class or3 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ or3(aw7 aw7Var, xt4 xt4Var) {
        this.a = 2;
        this.c = aw7Var;
        this.b = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        boolean z5 = false;
        aw7 aw7Var = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z5 = true;
                }
                if (rv4Var.U(intValue & 1, z5)) {
                    boolean j0 = true ^ k4b.j0((String) aw7Var.getValue());
                    boolean f = rv4Var.f(xt4Var) | rv4Var.f(aw7Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new v90(2, xt4Var, aw7Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, j0, null, null, null, rse.b, rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z5 = true;
                }
                if (rv4Var2.U(1 & intValue2, z5)) {
                    boolean f2 = rv4Var2.f(xt4Var);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new v90(5, xt4Var, aw7Var);
                        rv4Var2.o0(P2);
                    }
                    nmd.j((vt4) P2, null, false, null, null, null, qye.a, rv4Var2, 805306368, 510);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var3.U(intValue3 & 1, z)) {
                    kq7 kq7Var = kq7.a;
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                    int hashCode = Long.hashCode(rv4Var3.T);
                    xt8 l = rv4Var3.l();
                    nq7 p = lye.p(rv4Var3, f3);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, a);
                    jce.F(qw1.e, rv4Var3, l);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p);
                    nq7 z6 = zbe.z(hl5.f(kq7Var, 12.0f, rv4Var3, kq7Var, 1.0f), 16.0f, 8.0f);
                    if (((cs9) aw7Var.getValue()) == cs9.a) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String A = yqe.A((y3b) k3b.g.getValue(), rv4Var3);
                    String A2 = yqe.A((y3b) k3b.h.getValue(), rv4Var3);
                    boolean f4 = rv4Var3.f(aw7Var);
                    Object P3 = rv4Var3.P();
                    if (f4 || P3 == lh9Var) {
                        P3 = new ig7(aw7Var, 16);
                        rv4Var3.o0(P3);
                    }
                    l0e.m(A, A2, z6, false, z2, (xt4) P3, rv4Var3, 384, 8);
                    nq7 z7 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 8.0f);
                    if (((cs9) aw7Var.getValue()) == cs9.b) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String A3 = yqe.A((y3b) k3b.c.getValue(), rv4Var3);
                    String A4 = yqe.A((y3b) k3b.d.getValue(), rv4Var3);
                    boolean f5 = rv4Var3.f(aw7Var);
                    Object P4 = rv4Var3.P();
                    if (f5 || P4 == lh9Var) {
                        P4 = new ig7(aw7Var, 17);
                        rv4Var3.o0(P4);
                    }
                    l0e.m(A3, A4, z7, false, z3, (xt4) P4, rv4Var3, 384, 8);
                    nq7 z8 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 8.0f);
                    if (((cs9) aw7Var.getValue()) == cs9.c) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    String A5 = yqe.A((y3b) k3b.e.getValue(), rv4Var3);
                    String A6 = yqe.A((y3b) k3b.f.getValue(), rv4Var3);
                    boolean f6 = rv4Var3.f(aw7Var);
                    Object P5 = rv4Var3.P();
                    if (f6 || P5 == lh9Var) {
                        P5 = new ig7(aw7Var, 18);
                        rv4Var3.o0(P5);
                    }
                    l0e.m(A5, A6, z8, false, z4, (xt4) P5, rv4Var3, 384, 8);
                    xbe.i(rv4Var3, pna.h(kq7Var, 12.0f));
                    String A7 = yqe.A((y3b) s2b.E0.getValue(), rv4Var3);
                    nq7 f7 = pna.f(zbe.A(kq7Var, 12.0f, nae.e, 2), 1.0f);
                    boolean f8 = rv4Var3.f(xt4Var) | rv4Var3.f(aw7Var);
                    Object P6 = rv4Var3.P();
                    if (f8 || P6 == lh9Var) {
                        P6 = new v90(7, xt4Var, aw7Var);
                        rv4Var3.o0(P6);
                    }
                    z1d.f(null, A7, false, null, f7, null, null, null, (vt4) P6, rv4Var3, 24582, 236);
                    hl5.w(kq7Var, 8.0f, rv4Var3, true);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z5 = true;
                }
                if (rv4Var4.U(intValue4 & 1, z5)) {
                    boolean f9 = rv4Var4.f(xt4Var) | rv4Var4.f(aw7Var);
                    Object P7 = rv4Var4.P();
                    if (f9 || P7 == lh9Var) {
                        P7 = new v90(9, xt4Var, aw7Var);
                        rv4Var4.o0(P7);
                    }
                    nmd.j((vt4) P7, null, false, null, null, null, eg0.h, rv4Var4, 805306368, 510);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ or3(int i, xt4 xt4Var, aw7 aw7Var) {
        this.a = i;
        this.b = xt4Var;
        this.c = aw7Var;
    }
}
