package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yl(long j, boolean z, nq7 nq7Var, l88 l88Var) {
        this.c = j;
        this.b = z;
        this.d = nq7Var;
        this.e = l88Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        dz dzVar;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                nq7 nq7Var = (nq7) obj4;
                final l88 l88Var = (l88) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    long j = this.c;
                    int i2 = (j > 9205357640488583168L ? 1 : (j == 9205357640488583168L ? 0 : -1));
                    boolean z2 = this.b;
                    lh9 lh9Var = ax1.a;
                    if (i2 != 0) {
                        rv4Var.e0(3458246);
                        if (z2) {
                            dzVar = oc2.c;
                        } else {
                            dzVar = oc2.b;
                        }
                        nq7 m = pna.m(nq7Var, ug3.b(j), ug3.a(j), nae.e, nae.e, 12);
                        gv9 a = ev9.a(dzVar, kh5.F, rv4Var, 0);
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
                        jce.F(qw1.f, rv4Var, a);
                        jce.F(qw1.e, rv4Var, l);
                        jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var);
                        jce.F(qw1.d, rv4Var, p);
                        boolean h = rv4Var.h(l88Var);
                        Object P = rv4Var.P();
                        if (h || P == lh9Var) {
                            P = new vt4() { // from class: zl
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    int i3 = r2;
                                    boolean z3 = false;
                                    l88 l88Var2 = l88Var;
                                    switch (i3) {
                                        case 0:
                                            if ((9223372034707292159L & l88Var2.b()) != 9205357640488583168L) {
                                                z3 = true;
                                            }
                                            return Boolean.valueOf(z3);
                                        default:
                                            if ((9223372034707292159L & l88Var2.b()) != 9205357640488583168L) {
                                                z3 = true;
                                            }
                                            return Boolean.valueOf(z3);
                                    }
                                }
                            };
                            rv4Var.o0(P);
                        }
                        qre.o(6, (vt4) P, rv4Var, kq7.a, z2);
                        rv4Var.q(true);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(4389176);
                        boolean h2 = rv4Var.h(l88Var);
                        Object P2 = rv4Var.P();
                        if (h2 || P2 == lh9Var) {
                            P2 = new vt4() { // from class: zl
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    int i3 = r2;
                                    boolean z3 = false;
                                    l88 l88Var2 = l88Var;
                                    switch (i3) {
                                        case 0:
                                            if ((9223372034707292159L & l88Var2.b()) != 9205357640488583168L) {
                                                z3 = true;
                                            }
                                            return Boolean.valueOf(z3);
                                        default:
                                            if ((9223372034707292159L & l88Var2.b()) != 9205357640488583168L) {
                                                z3 = true;
                                            }
                                            return Boolean.valueOf(z3);
                                    }
                                }
                            };
                            rv4Var.o0(P2);
                        }
                        qre.o(0, (vt4) P2, rv4Var, nq7Var, z2);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                obe.c(this.b, this.c, (xt4) obj4, (xt4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ yl(boolean z, long j, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.b = z;
        this.c = j;
        this.d = xt4Var;
        this.e = xt4Var2;
    }
}
