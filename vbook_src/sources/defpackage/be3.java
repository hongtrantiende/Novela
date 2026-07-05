package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: be3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class be3 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ co3 b;

    public /* synthetic */ be3(co3 co3Var, int i) {
        this.a = i;
        this.b = co3Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        lh9 lh9Var = ax1.a;
        boolean z2 = false;
        pvc pvcVar = pvc.a;
        co3 co3Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                co3Var.b(str, str2);
                return pvcVar;
            case 1:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    boolean f = rv4Var.f(co3Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new de3(co3Var, 2);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, b23.b, rv4Var, 805306368, 510);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    Object P2 = rv4Var2.P();
                    if (P2 == lh9Var) {
                        P2 = s21.e(rv4Var2);
                    }
                    zm4 zm4Var = (zm4) P2;
                    Object P3 = rv4Var2.P();
                    if (P3 == lh9Var) {
                        P3 = new sr3(zm4Var, null, 7);
                        rv4Var2.o0(P3);
                    }
                    yte.g((lu4) P3, rv4Var2, zm4Var);
                    kq7 kq7Var = kq7.a;
                    nq7 C = rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var2), 14);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, C);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, a);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    String str3 = (String) co3Var.b.getValue();
                    tza tzaVar = j27.a;
                    v72 v72Var = ((h27) rv4Var2.j(tzaVar)).c.b;
                    nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                    boolean f2 = rv4Var2.f(co3Var);
                    Object P4 = rv4Var2.P();
                    if (f2 || P4 == lh9Var) {
                        P4 = new if7(co3Var, 1);
                        rv4Var2.o0(P4);
                    }
                    uwe.h(str3, (xt4) P4, n, false, false, null, b23.d, null, null, null, false, null, null, null, true, 0, 0, v72Var, null, rv4Var2, 1572864, 12582912, 6160312);
                    xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
                    String str4 = (String) co3Var.c.getValue();
                    v72 v72Var2 = ((h27) rv4Var2.j(tzaVar)).c.b;
                    nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                    boolean f3 = rv4Var2.f(co3Var);
                    Object P5 = rv4Var2.P();
                    if (f3 || P5 == lh9Var) {
                        P5 = new if7(co3Var, 2);
                        rv4Var2.o0(P5);
                    }
                    uwe.h(str4, (xt4) P5, A, false, false, null, b23.e, null, null, null, false, null, null, null, false, 0, 0, v72Var2, null, rv4Var2, 1573248, 0, 6291384);
                    rs8.u(rv4Var2, true, kq7Var, 12.0f, rv4Var2);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
