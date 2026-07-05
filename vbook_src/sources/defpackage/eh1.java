package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eh1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh1 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ eh1(tu1 tu1Var, boolean z, wea weaVar, nq7 nq7Var, vt4 vt4Var, int i, int i2) {
        this.f = tu1Var;
        this.b = z;
        this.C = weaVar;
        this.D = nq7Var;
        this.c = vt4Var;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        int i2 = this.d;
        pvc pvcVar = pvc.a;
        Object obj3 = this.c;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ese.n((tu1) obj6, this.b, (wea) obj5, (nq7) obj4, (vt4) obj3, (rv4) obj, xoe.p(i2 | 1), this.e);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                nqe.h((String) obj6, (String) obj5, (cz7) obj4, this.b, (vt4) obj3, (rv4) obj, xoe.p(i2 | 1), this.e);
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                mwe.a((vt4) obj3, (nq7) obj4, this.b, (lk5) obj6, (lu4) obj5, (rv4) obj, xoe.p(i2 | 1), this.e);
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                ctd.e((String) obj6, (List) obj5, this.d, this.b, (nq7) obj4, (xt4) obj3, (rv4) obj, xoe.p(this.e | 1));
                return pvcVar;
            default:
                aw7 aw7Var = (aw7) obj6;
                t86 t86Var = (t86) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (P == lh9Var) {
                        P = s21.e(rv4Var);
                    }
                    zm4 zm4Var = (zm4) P;
                    Object P2 = rv4Var.P();
                    if (P2 == lh9Var) {
                        P2 = new sr3(zm4Var, null, 14);
                        rv4Var.o0(P2);
                    }
                    yte.g((lu4) P2, rv4Var, zm4Var);
                    kq7 kq7Var = kq7.a;
                    nq7 f = pna.f(kq7Var, 1.0f);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, f);
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
                    jub jubVar = (jub) aw7Var.getValue();
                    tza tzaVar = j27.a;
                    v72 v72Var = ((h27) rv4Var.j(tzaVar)).c.b;
                    nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                    boolean f2 = rv4Var.f(aw7Var);
                    Object P3 = rv4Var.P();
                    if (f2 || P3 == lh9Var) {
                        P3 = new qo7(aw7Var, 0);
                        rv4Var.o0(P3);
                    }
                    uwe.g(jubVar, (xt4) P3, n, false, null, jce.E(1661022665, new jd1(str2, 23), rv4Var), null, null, false, null, t86Var, null, this.b, this.d, this.e, v72Var, null, rv4Var, 1572864, 0, 5341112);
                    if (str.length() > 0) {
                        s21.w(rv4Var, -1433495134, kq7Var, 8.0f, rv4Var);
                        cvb.c(str, zbe.A(kq7Var, 8.0f, nae.e, 2), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 48, 0, 131068);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-1433221249);
                        rv4Var.q(false);
                    }
                    rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ eh1(vt4 vt4Var, nq7 nq7Var, boolean z, lk5 lk5Var, lu4 lu4Var, int i, int i2) {
        this.c = vt4Var;
        this.D = nq7Var;
        this.b = z;
        this.f = lk5Var;
        this.C = lu4Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ eh1(aw7 aw7Var, t86 t86Var, boolean z, int i, int i2, String str, String str2) {
        this.f = aw7Var;
        this.C = t86Var;
        this.b = z;
        this.d = i;
        this.e = i2;
        this.D = str;
        this.c = str2;
    }

    public /* synthetic */ eh1(String str, String str2, cz7 cz7Var, boolean z, vt4 vt4Var, int i, int i2) {
        this.f = str;
        this.C = str2;
        this.D = cz7Var;
        this.b = z;
        this.c = vt4Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ eh1(String str, List list, int i, boolean z, nq7 nq7Var, xt4 xt4Var, int i2) {
        this.f = str;
        this.C = list;
        this.d = i;
        this.b = z;
        this.D = nq7Var;
        this.c = xt4Var;
        this.e = i2;
    }
}
