package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: os6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class os6 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ os6(nq7 nq7Var, long j, long j2, wea weaVar, List list, int i) {
        this.e = nq7Var;
        this.c = j;
        this.d = j2;
        this.f = weaVar;
        this.C = list;
        this.b = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.C;
        int i2 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                eg0.g((nq7) obj5, this.c, this.d, (wea) obj4, (List) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            default:
                k2a k2aVar = (k2a) obj5;
                k2a k2aVar2 = (k2a) obj4;
                xo3 xo3Var = (xo3) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    kq7 kq7Var = kq7.a;
                    nq7 A = zbe.A(rte.q(rte.C(kq7Var, k2aVar, 12), k2aVar2, 12), 4.0f, nae.e, 2);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, A);
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
                    ry5 ry5Var = new ry5(1, i2, 1);
                    Object P = rv4Var.P();
                    if (P == ax1.a) {
                        P = new bo7(15);
                        rv4Var.o0(P);
                    }
                    cvb.c(sl1.i0(ry5Var, "\n", null, null, (xt4) P, 30), pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, Integer.MAX_VALUE, 0, null, new oyb(sve.d(xo3Var.g), this.c, null, null, eo4.d, 0L, 0L, 6, 0, this.d, null, null, 16613340), rv4Var, 48, 27648, 106492);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ os6(k2a k2aVar, k2a k2aVar2, int i, xo3 xo3Var, long j, long j2) {
        this.e = k2aVar;
        this.f = k2aVar2;
        this.b = i;
        this.C = xo3Var;
        this.c = j;
        this.d = j2;
    }
}
