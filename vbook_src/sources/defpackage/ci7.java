package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ci7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ rj8 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ Integer[] e;

    public /* synthetic */ ci7(List list, rj8 rj8Var, xt4 xt4Var, Integer[] numArr, int i) {
        this.a = i;
        this.b = list;
        this.c = rj8Var;
        this.d = xt4Var;
        this.e = numArr;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        dq4 dq4Var;
        boolean z3;
        long j;
        boolean z4;
        long j2;
        int i;
        long b;
        boolean z5;
        boolean z6;
        dq4 dq4Var2;
        boolean z7;
        long j3;
        boolean z8;
        long j4;
        long b2;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        dz dzVar = lz.a;
        lh9 lh9Var = ax1.a;
        float f = 4.0f;
        float f2 = 12.0f;
        kq7 kq7Var = kq7.a;
        boolean z9 = false;
        boolean z10 = true;
        Integer[] numArr = this.e;
        xt4 xt4Var = this.d;
        rj8 rj8Var = this.c;
        List list = this.b;
        switch (i2) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        if (rj8Var.k() == i3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        nq7 z11 = zbe.z(kq7Var, 12.0f, 4.0f);
                        boolean f3 = rv4Var.f(xt4Var) | rv4Var.d(i3);
                        Object P = rv4Var.P();
                        if (f3 || P == lh9Var) {
                            P = new tp0(xt4Var, i3, 6);
                            rv4Var.o0(P);
                        }
                        nq7 t = q1d.t(1, (vt4) P, rv4Var, z11, false);
                        gv9 a = ev9.a(dzVar, kh5.G, rv4Var, 48);
                        dz dzVar2 = dzVar;
                        int hashCode = Long.hashCode(rv4Var.T);
                        xt8 l = rv4Var.l();
                        nq7 p = lye.p(rv4Var, t);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var.i0();
                        int i4 = size;
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
                        String str = (String) list.get(i3);
                        oyb oybVar = r0f.A(rv4Var).j;
                        if (z2) {
                            dq4Var = dq4.D;
                        } else {
                            dq4Var = dq4.e;
                        }
                        dq4 dq4Var3 = dq4Var;
                        if (z2) {
                            rv4Var.e0(159880367);
                            j = r0f.y(rv4Var).a;
                            z3 = false;
                        } else {
                            z3 = false;
                            rv4Var.e0(159881617);
                            j = r0f.y(rv4Var).q;
                        }
                        rv4Var.q(z3);
                        cvb.c(str, null, j, null, 0L, null, dq4Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131002);
                        xbe.i(rv4Var, pna.s(kq7Var, 6.0f));
                        String valueOf = String.valueOf(numArr[i3].intValue());
                        if (z2) {
                            rv4Var.e0(159889615);
                            j2 = r0f.y(rv4Var).a;
                            z4 = false;
                        } else {
                            z4 = false;
                            rv4Var.e0(159890865);
                            j2 = r0f.y(rv4Var).q;
                        }
                        rv4Var.q(z4);
                        long j5 = j2;
                        oyb oybVar2 = r0f.A(rv4Var).o;
                        nq7 k = tte.k(kq7Var, uu9.a);
                        if (z2) {
                            rv4Var.e0(661911006);
                            i = i3;
                            b = zl1.b(0.2f, r0f.y(rv4Var).a);
                            rv4Var.q(false);
                        } else {
                            i = i3;
                            rv4Var.e0(662040028);
                            b = zl1.b(0.1f, r0f.y(rv4Var).q);
                            rv4Var.q(false);
                        }
                        cvb.c(valueOf, zbe.z(nmd.v(k, b, lre.g), 8.0f, 3.0f), j5, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar2, rv4Var, 0, 0, 131064);
                        rv4Var.q(true);
                        size = i4;
                        i3 = i + 1;
                        dzVar = dzVar2;
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z5)) {
                    int size2 = list.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        if (rj8Var.k() == i5) {
                            z6 = z10;
                        } else {
                            z6 = z9;
                        }
                        nq7 z12 = zbe.z(kq7Var, f2, f);
                        boolean f4 = rv4Var2.f(xt4Var) | rv4Var2.d(i5);
                        Object P2 = rv4Var2.P();
                        if (f4 || P2 == lh9Var) {
                            P2 = new tp0(xt4Var, i5, 17);
                            rv4Var2.o0(P2);
                        }
                        nq7 t2 = q1d.t(1, (vt4) P2, rv4Var2, z12, z9);
                        gv9 a2 = ev9.a(dzVar, kh5.G, rv4Var2, 48);
                        rj8 rj8Var2 = rj8Var;
                        int i6 = size2;
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, t2);
                        rw1.k.getClass();
                        zx1 zx1Var2 = qw1.b;
                        rv4Var2.i0();
                        pvc pvcVar2 = pvcVar;
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var2);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(qw1.f, rv4Var2, a2);
                        jce.F(qw1.e, rv4Var2, l2);
                        jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode2));
                        jce.C(qw1.h, rv4Var2);
                        jce.F(qw1.d, rv4Var2, p2);
                        String str2 = (String) list.get(i5);
                        oyb oybVar3 = r0f.A(rv4Var2).j;
                        if (z6) {
                            dq4Var2 = dq4.D;
                        } else {
                            dq4Var2 = dq4.e;
                        }
                        dq4 dq4Var4 = dq4Var2;
                        if (z6) {
                            rv4Var2.e0(-2033484029);
                            j3 = r0f.y(rv4Var2).a;
                            z7 = false;
                        } else {
                            z7 = false;
                            rv4Var2.e0(-2033482779);
                            j3 = r0f.y(rv4Var2).q;
                        }
                        rv4Var2.q(z7);
                        cvb.c(str2, null, j3, null, 0L, null, dq4Var4, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar3, rv4Var2, 0, 0, 131002);
                        xbe.i(rv4Var2, pna.s(kq7Var, 6.0f));
                        String valueOf2 = String.valueOf(numArr[i5].intValue());
                        if (z6) {
                            rv4Var2.e0(-2033474781);
                            j4 = r0f.y(rv4Var2).a;
                            z8 = false;
                        } else {
                            z8 = false;
                            rv4Var2.e0(-2033473531);
                            j4 = r0f.y(rv4Var2).q;
                        }
                        rv4Var2.q(z8);
                        long j6 = j4;
                        oyb oybVar4 = r0f.A(rv4Var2).o;
                        nq7 k2 = tte.k(kq7Var, uu9.a);
                        if (z6) {
                            rv4Var2.e0(1387091466);
                            b2 = zl1.b(0.2f, r0f.y(rv4Var2).a);
                            rv4Var2.q(false);
                        } else {
                            rv4Var2.e0(1387220488);
                            b2 = zl1.b(0.1f, r0f.y(rv4Var2).q);
                            rv4Var2.q(false);
                        }
                        cvb.c(valueOf2, zbe.z(nmd.v(k2, b2, lre.g), 8.0f, 3.0f), j6, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar4, rv4Var2, 0, 0, 131064);
                        rv4Var2.q(true);
                        i5++;
                        size2 = i6;
                        rj8Var = rj8Var2;
                        pvcVar = pvcVar2;
                        z10 = true;
                        f = 4.0f;
                        f2 = 12.0f;
                        z9 = false;
                    }
                    return pvcVar;
                }
                rv4Var2.X();
                return pvcVar;
        }
    }
}
