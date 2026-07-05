package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qh implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ nq7 c;

    public /* synthetic */ qh(long j, nq7 nq7Var) {
        this.a = 0;
        this.b = j;
        this.c = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        nq7 nq7Var = this.c;
        pvc pvcVar = pvc.a;
        long j = this.b;
        rv4 rv4Var = (rv4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    int i2 = (j > 9205357640488583168L ? 1 : (j == 9205357640488583168L ? 0 : -1));
                    nq7 nq7Var2 = this.c;
                    if (i2 != 0) {
                        rv4Var.e0(-1244013944);
                        nq7 m = pna.m(nq7Var2, ug3.b(j), ug3.a(j), nae.e, nae.e, 12);
                        b37 d = fu0.d(kh5.b, false);
                        int hashCode = Long.hashCode(rv4Var.T);
                        xt8 l = rv4Var.l();
                        nq7 p = lye.p(rv4Var, m);
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
                        vh.b(0, 1, rv4Var, null);
                        rv4Var.q(true);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-1243644858);
                        vh.b(0, 0, rv4Var, nq7Var2);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                num.getClass();
                uaf.p(j, nq7Var, rv4Var, xoe.p(49));
                return pvcVar;
            case 2:
                num.getClass();
                nmd.q(j, nq7Var, rv4Var, xoe.p(49));
                return pvcVar;
            case 3:
                num.getClass();
                nmd.o(j, nq7Var, rv4Var, xoe.p(49));
                return pvcVar;
            case 4:
                num.getClass();
                nmd.l(j, nq7Var, rv4Var, xoe.p(49));
                return pvcVar;
            case 5:
                num.getClass();
                nmd.p(j, nq7Var, rv4Var, xoe.p(49));
                return pvcVar;
            case 6:
                num.getClass();
                nmd.n(j, nq7Var, rv4Var, xoe.p(49));
                return pvcVar;
            case 7:
                num.getClass();
                nmd.s(j, nq7Var, rv4Var, xoe.p(49));
                return pvcVar;
            case 8:
                num.getClass();
                nmd.r(j, nq7Var, rv4Var, xoe.p(49));
                return pvcVar;
            default:
                num.getClass();
                nmd.m(j, nq7Var, rv4Var, xoe.p(49));
                return pvcVar;
        }
    }

    public /* synthetic */ qh(long j, nq7 nq7Var, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = nq7Var;
    }
}
