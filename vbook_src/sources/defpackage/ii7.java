package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ii7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ hu4 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ii7(k08 k08Var, boolean z, boolean z2, lf4 lf4Var, boolean z3, tu1 tu1Var) {
        this.a = 2;
        this.f = k08Var;
        this.b = z;
        this.c = z2;
        this.d = lf4Var;
        this.e = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long j;
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o28.p((mq5) obj4, this.b, this.c, (nq7) obj3, (vt4) hu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                l0e.t((u2c) obj4, this.b, this.c, (nq7) obj3, (vt4) hu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                k08 k08Var = (k08) obj4;
                lf4 lf4Var = (lf4) obj3;
                tu1 tu1Var = (tu1) hu4Var;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    if (!this.c) {
                        j = k08Var.f;
                    } else if (this.b) {
                        j = k08Var.a;
                    } else {
                        j = k08Var.d;
                    }
                    yya a = wma.a(j, lf4Var, rv4Var, 0, 12);
                    rv4Var.e0(453016797);
                    rv4Var.q(false);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, kq7.a);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    pye.a(r12.a.a(new zl1(((zl1) a.getValue()).a)), tu1Var, rv4Var, 8);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ ii7(Object obj, boolean z, boolean z2, nq7 nq7Var, vt4 vt4Var, int i, int i2) {
        this.a = i2;
        this.f = obj;
        this.b = z;
        this.c = z2;
        this.d = nq7Var;
        this.e = vt4Var;
    }
}
