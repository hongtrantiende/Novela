package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: chb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class chb implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ kd4 c;
    public final /* synthetic */ vhb d;

    public /* synthetic */ chb(aw7 aw7Var, kd4 kd4Var, vhb vhbVar, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = kd4Var;
        this.d = vhbVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        vhb vhbVar = this.d;
        kd4 kd4Var = this.c;
        aw7 aw7Var = this.b;
        boolean z2 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    String A = yqe.A((y3b) s2b.E0.getValue(), rv4Var);
                    tu1 tu1Var = yae.b;
                    boolean f = rv4Var.f(aw7Var) | rv4Var.f(kd4Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new fe3(kd4Var, aw7Var, 3);
                        rv4Var.o0(P);
                    }
                    iue.g(A, null, tu1Var, null, null, (vt4) P, rv4Var, 384, 26);
                    String A2 = yqe.A((y3b) s2b.u.getValue(), rv4Var);
                    tu1 tu1Var2 = yae.c;
                    boolean f2 = rv4Var.f(aw7Var) | rv4Var.f(vhbVar);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new a0b(4, vhbVar, aw7Var);
                        rv4Var.o0(P2);
                    }
                    iue.g(A2, null, tu1Var2, null, null, (vt4) P2, rv4Var, 384, 26);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, kq7.a);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    ar5 c = rp5.c((wk3) ok3.M.getValue(), rv4Var2, 0);
                    boolean f3 = rv4Var2.f(aw7Var);
                    Object P3 = rv4Var2.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new iia(aw7Var, 10);
                        rv4Var2.o0(P3);
                    }
                    kwe.d(c, null, 0L, (vt4) P3, rv4Var2, 0, 6);
                    boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                    th8 th8Var = new th8(12.0f, 12.0f, 12.0f, 12.0f);
                    boolean f4 = rv4Var2.f(aw7Var);
                    Object P4 = rv4Var2.P();
                    if (f4 || P4 == lh9Var) {
                        P4 = new iia(aw7Var, 11);
                        rv4Var2.o0(P4);
                    }
                    iue.e(booleanValue, null, 0L, null, nae.e, th8Var, (vt4) P4, jce.E(-1990452908, new chb(aw7Var, kd4Var, vhbVar, 0), rv4Var2), rv4Var2, 12779520, 30);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
