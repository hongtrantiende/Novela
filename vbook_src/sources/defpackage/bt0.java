package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bt0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt0 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bt0(int i, xt4 xt4Var, int i2, nq7 nq7Var, tu1 tu1Var, int i3) {
        this.b = i;
        this.f = xt4Var;
        this.d = i2;
        this.c = nq7Var;
        this.C = tu1Var;
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        nk0 nk0Var;
        boolean z3;
        boolean z4;
        pvc pvcVar;
        long j;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i = this.a;
        int i2 = this.e;
        int i3 = this.d;
        pvc pvcVar2 = pvc.a;
        Object obj3 = this.c;
        Object obj4 = this.C;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pt0.b(this.b, (xt4) obj5, this.d, (nq7) obj3, (tu1) obj4, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar2;
            case 1:
                ((Integer) obj2).getClass();
                int p = xoe.p(i3 | 1);
                int i4 = this.b;
                int i5 = this.e;
                sue.g(i4, p, i5, (lu4) obj4, (rv4) obj, (nq7) obj3, (String) obj5);
                return pvcVar2;
            case 2:
                xt4 xt4Var = (xt4) obj5;
                List list = (List) obj3;
                xt4 xt4Var2 = (xt4) obj4;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                nk0 nk0Var2 = kh5.a;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    b37 d = fu0.d(nk0Var2, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    kq7 kq7Var = kq7.a;
                    nq7 p2 = lye.p(rv4Var, kq7Var);
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
                    jce.F(qw1.d, rv4Var, p2);
                    ar5 c = rp5.c((wk3) jk3.M.getValue(), rv4Var, 0);
                    int i6 = this.b;
                    if (i6 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean f = rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    Object obj6 = ax1.a;
                    if (f || P == obj6) {
                        P = new ux0(12, xt4Var);
                        rv4Var.o0(P);
                    }
                    nxe.f(c, z2, null, (vt4) P, rv4Var, 0);
                    if (i3 > 0) {
                        rv4Var.e0(666449420);
                        nk0Var = nk0Var2;
                        ctd.a(3072, 6, 0L, 0L, jce.E(253360494, new zj7(i3, 7), rv4Var), rv4Var, pu0.a.a(kq7Var, kh5.c));
                        rv4Var = rv4Var;
                        rv4Var.q(false);
                    } else {
                        nk0Var = nk0Var2;
                        rv4Var.e0(666603180);
                        rv4Var.q(false);
                    }
                    rv4Var.q(true);
                    ar5 c2 = rp5.c((wk3) jk3.t.getValue(), rv4Var, 0);
                    if (1 == i6) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean f2 = rv4Var.f(xt4Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == obj6) {
                        P2 = new ux0(14, xt4Var);
                        rv4Var.o0(P2);
                    }
                    nxe.f(c2, z3, null, (vt4) P2, rv4Var, 0);
                    ar5 c3 = rp5.c((wk3) ok3.l.getValue(), rv4Var, 0);
                    if (2 == i6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean f3 = rv4Var.f(xt4Var);
                    Object P3 = rv4Var.P();
                    if (f3 || P3 == obj6) {
                        P3 = new ux0(15, xt4Var);
                        rv4Var.o0(P3);
                    }
                    nxe.f(c3, z4, null, (vt4) P3, rv4Var, 0);
                    List m = cqe.m((q3b) nz.x.getValue(), rv4Var);
                    boolean f4 = rv4Var.f(list);
                    Object P4 = rv4Var.P();
                    if (!f4 && P4 != obj6) {
                        pvcVar = pvcVar2;
                    } else {
                        List Z = sl1.Z(m);
                        ArrayList arrayList = new ArrayList(tl1.s(Z, 10));
                        int i7 = 0;
                        for (Object obj7 : Z) {
                            int i8 = i7 + 1;
                            if (i7 >= 0) {
                                String str = (String) obj7;
                                Long l2 = (Long) sl1.f0(i7, list);
                                if (l2 != null) {
                                    j = l2.longValue();
                                } else {
                                    j = 0;
                                }
                                pvc pvcVar3 = pvcVar2;
                                List list2 = list;
                                arrayList.add(new uia(str, j, i7));
                                i7 = i8;
                                pvcVar2 = pvcVar3;
                                list = list2;
                            } else {
                                tl1.M();
                                throw null;
                            }
                        }
                        pvcVar = pvcVar2;
                        P4 = yae.z(arrayList);
                        rv4Var.o0(P4);
                    }
                    aw7 aw7Var = P4;
                    b37 d2 = fu0.d(nk0Var, false);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l3 = rv4Var.l();
                    nq7 p3 = lye.p(rv4Var, kq7Var);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var2);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d2);
                    jce.F(qw1.e, rv4Var, l3);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p3);
                    Object[] objArr = new Object[0];
                    Object P5 = rv4Var.P();
                    if (P5 == obj6) {
                        P5 = new k85(2);
                        rv4Var.o0(P5);
                    }
                    aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P5, rv4Var, 48);
                    String str2 = (String) sl1.f0(i2, m);
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    if (3 == i6) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z9 = !((List) aw7Var.getValue()).isEmpty();
                    boolean f5 = rv4Var.f(xt4Var);
                    Object P6 = rv4Var.P();
                    if (f5 || P6 == obj6) {
                        P6 = new ux0(16, xt4Var);
                        rv4Var.o0(P6);
                    }
                    vt4 vt4Var = (vt4) P6;
                    boolean f6 = rv4Var.f(aw7Var) | rv4Var.f(aw7Var2);
                    Object P7 = rv4Var.P();
                    if (f6 || P7 == obj6) {
                        P7 = new he1(aw7Var, aw7Var2, 5);
                        rv4Var.o0(P7);
                    }
                    rv4 rv4Var2 = rv4Var;
                    nxe.l(str3, z5, z9, vt4Var, (vt4) P7, rv4Var2, 3072, 0);
                    boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                    List list3 = (List) aw7Var.getValue();
                    boolean f7 = rv4Var2.f(aw7Var2);
                    Object P8 = rv4Var2.P();
                    if (f7 || P8 == obj6) {
                        P8 = new ea4(aw7Var2, 9);
                        rv4Var2.o0(P8);
                    }
                    vt4 vt4Var2 = (vt4) P8;
                    boolean f8 = rv4Var2.f(xt4Var2) | rv4Var2.f(aw7Var2);
                    Object P9 = rv4Var2.P();
                    if (!f8 && P9 != obj6) {
                        z6 = true;
                    } else {
                        z6 = true;
                        P9 = new v73(1, xt4Var2, aw7Var2);
                        rv4Var2.o0(P9);
                    }
                    nxe.k(booleanValue, list3, vt4Var2, (xt4) P9, rv4Var2, 0);
                    rv4Var2.q(z6);
                    String A = yqe.A((y3b) s2b.v0.getValue(), rv4Var2);
                    if (4 == i6) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean f9 = rv4Var2.f(xt4Var);
                    Object P10 = rv4Var2.P();
                    if (f9 || P10 == obj6) {
                        P10 = new ux0(17, xt4Var);
                        rv4Var2.o0(P10);
                    }
                    nxe.l(A, z7, false, (vt4) P10, null, rv4Var2, 3072, 36);
                    String A2 = yqe.A((y3b) s2b.g0.getValue(), rv4Var2);
                    if (5 == i6) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean f10 = rv4Var2.f(xt4Var);
                    Object P11 = rv4Var2.P();
                    if (f10 || P11 == obj6) {
                        P11 = new ux0(13, xt4Var);
                        rv4Var2.o0(P11);
                    }
                    nxe.l(A2, z8, false, (vt4) P11, null, rv4Var2, 3072, 36);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar2;
            default:
                ((Integer) obj2).getClass();
                wq9.e((ar5) obj5, (String) obj4, this.b, (nq7) obj3, (rv4) obj, xoe.p(i3 | 1), this.e);
                return pvcVar2;
        }
    }

    public /* synthetic */ bt0(int i, xt4 xt4Var, List list, int i2, int i3, xt4 xt4Var2) {
        this.b = i;
        this.f = xt4Var;
        this.c = list;
        this.d = i2;
        this.e = i3;
        this.C = xt4Var2;
    }

    public /* synthetic */ bt0(ar5 ar5Var, String str, int i, nq7 nq7Var, int i2, int i3) {
        this.f = ar5Var;
        this.C = str;
        this.b = i;
        this.c = nq7Var;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ bt0(String str, int i, nq7 nq7Var, lu4 lu4Var, int i2, int i3) {
        this.f = str;
        this.b = i;
        this.c = nq7Var;
        this.C = lu4Var;
        this.d = i2;
        this.e = i3;
    }
}
