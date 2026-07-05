package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w34  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class w34 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo3 b;

    public /* synthetic */ w34(fo3 fo3Var, int i) {
        this.a = i;
        this.b = fo3Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        lh9 lh9Var = ax1.a;
        boolean z2 = false;
        pvc pvcVar = pvc.a;
        fo3 fo3Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                fo3Var.a(str, str2);
                return pvcVar;
            case 1:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    boolean f = rv4Var.f(fo3Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new v34(fo3Var, 1);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, lye.a, rv4Var, 805306368, 510);
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
                        P3 = new sr3(zm4Var, null, 10);
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
                    hm8 hm8Var = fo3Var.b;
                    hm8 hm8Var2 = fo3Var.d;
                    String str3 = (String) hm8Var.getValue();
                    t86 t86Var = new t86(0, 7, Token.INC);
                    tza tzaVar = j27.a;
                    v72 v72Var = ((h27) rv4Var2.j(tzaVar)).c.b;
                    nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                    if (((Boolean) hm8Var2.getValue()).booleanValue()) {
                        A = mwe.n(A, zm4Var);
                    }
                    boolean f2 = rv4Var2.f(fo3Var);
                    Object P4 = rv4Var2.P();
                    if (f2 || P4 == lh9Var) {
                        P4 = new uf7(fo3Var, 1);
                        rv4Var2.o0(P4);
                    }
                    uwe.h(str3, (xt4) P4, A, false, false, null, lye.c, null, null, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var2, 1572864, 12779520, 6127544);
                    xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
                    String str4 = (String) fo3Var.c.getValue();
                    v72 v72Var2 = ((h27) rv4Var2.j(tzaVar)).c.b;
                    nq7 A2 = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                    if (!((Boolean) hm8Var2.getValue()).booleanValue()) {
                        A2 = mwe.n(A2, zm4Var);
                    }
                    boolean f3 = rv4Var2.f(fo3Var);
                    Object P5 = rv4Var2.P();
                    if (f3 || P5 == lh9Var) {
                        P5 = new uf7(fo3Var, 2);
                        rv4Var2.o0(P5);
                    }
                    uwe.h(str4, (xt4) P5, A2, false, false, null, lye.d, null, null, null, false, null, null, null, false, 0, 0, v72Var2, null, rv4Var2, 1572864, 0, 6291384);
                    rs8.u(rv4Var2, true, kq7Var, 12.0f, rv4Var2);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
