package defpackage;

import java.util.Collection;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: al  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class al implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ al(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long j;
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        xt4 xt4Var = null;
        pvc pvcVar = pvc.a;
        Object obj2 = this.c;
        final int i4 = this.b;
        switch (i) {
            case 0:
                o9b o9bVar = (o9b) obj;
                o9bVar.getClass();
                int i5 = i4 + 1;
                if (((Boolean) obj2).booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                o9bVar.m(i5, j);
                return pvcVar;
            case 1:
                o9b o9bVar2 = (o9b) obj;
                o9bVar2.getClass();
                o9bVar2.B0(((Double) obj2).doubleValue(), i4 + 1);
                return pvcVar;
            case 2:
                o9b o9bVar3 = (o9b) obj;
                o9bVar3.getClass();
                o9bVar3.m(i4 + 1, ((Long) obj2).longValue());
                return pvcVar;
            case 3:
                ci6 ci6Var = (ci6) obj;
                bv2 bv2Var = ((qg6) obj2).a;
                zqa f = pae.f();
                if (f != null) {
                    xt4Var = f.e();
                }
                pae.n(f, pae.h(f), xt4Var);
                bv2Var.getClass();
                int i6 = ci6Var.a;
                if (i6 != -1) {
                    i2 = i6;
                }
                while (i3 < i2) {
                    ci6Var.a(i4 + i3);
                    i3++;
                }
                return pvcVar;
            case 4:
                ci6 ci6Var2 = (ci6) obj;
                bv2 bv2Var2 = ((kj6) obj2).a;
                zqa f2 = pae.f();
                if (f2 != null) {
                    xt4Var = f2.e();
                }
                pae.n(f2, pae.h(f2), xt4Var);
                bv2Var2.getClass();
                int i7 = ci6Var2.a;
                if (i7 != -1) {
                    i2 = i7;
                }
                while (i3 < i2) {
                    ci6Var2.a(i4 + i3);
                    i3++;
                }
                return pvcVar;
            case 5:
                dt8 dt8Var = (dt8) obj2;
                int intValue = ((Integer) obj).intValue();
                int i8 = i4 - 1;
                if (i8 < 0) {
                    i8 = 0;
                }
                dt8Var.a(dce.n(intValue, 0, i8), true);
                return pvcVar;
            case 6:
                return Boolean.valueOf(((List) obj).addAll(i4, (Collection) obj2));
            default:
                final xt4 xt4Var2 = (xt4) obj2;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6.A(ri6Var, 8, null, new tu1(new nu4() { // from class: kic
                    @Override // defpackage.nu4
                    public final Object h(Object obj3, Object obj4, Object obj5, Object obj6) {
                        boolean z;
                        boolean z2;
                        float f3;
                        boolean z3;
                        int i9;
                        int intValue2 = ((Integer) obj4).intValue();
                        rv4 rv4Var = (rv4) obj5;
                        int intValue3 = ((Integer) obj6).intValue();
                        ((xg6) obj3).getClass();
                        if ((intValue3 & 48) == 0) {
                            if (rv4Var.d(intValue2)) {
                                i9 = 32;
                            } else {
                                i9 = 16;
                            }
                            intValue3 |= i9;
                        }
                        if ((intValue3 & Token.TARGET) != 144) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (rv4Var.U(intValue3 & 1, z)) {
                            if (i4 == intValue2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            nq7 t = jsc.t(0.75f, pna.c(zbe.y(kq7.a, 4.0f), 1.0f), true);
                            long j2 = r0f.y(rv4Var).q;
                            ba5 ba5Var = lre.g;
                            nq7 d = st0.d(t, 1.0f, j2, ba5Var);
                            long j3 = r0f.y(rv4Var).a;
                            if (z2) {
                                f3 = 0.3f;
                            } else {
                                f3 = 0.1f;
                            }
                            nq7 v = nmd.v(d, zl1.b(f3, j3), ba5Var);
                            xt4 xt4Var3 = xt4Var2;
                            boolean f4 = rv4Var.f(xt4Var3);
                            if ((intValue3 & Token.ASSIGN_MOD) == 32) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z4 = z3 | f4;
                            Object P = rv4Var.P();
                            if (z4 || P == ax1.a) {
                                P = new tp0(xt4Var3, intValue2, 18);
                                rv4Var.o0(P);
                            }
                            nq7 f5 = lbe.f(15, (vt4) P, v, null, false);
                            b37 d2 = fu0.d(kh5.a, false);
                            int hashCode = Long.hashCode(rv4Var.T);
                            xt8 l = rv4Var.l();
                            nq7 p = lye.p(rv4Var, f5);
                            rw1.k.getClass();
                            zx1 zx1Var = qw1.b;
                            rv4Var.i0();
                            if (rv4Var.S) {
                                rv4Var.k(zx1Var);
                            } else {
                                rv4Var.r0();
                            }
                            jce.F(qw1.f, rv4Var, d2);
                            jce.F(qw1.e, rv4Var, l);
                            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                            jce.C(qw1.h, rv4Var);
                            jce.F(qw1.d, rv4Var, p);
                            switch (intValue2) {
                                case 0:
                                    rv4Var.e0(2114369479);
                                    nmd.l(r0f.y(rv4Var).q, pna.c, rv4Var, 48);
                                    rv4Var.q(false);
                                    break;
                                case 1:
                                    rv4Var.e0(2114610535);
                                    nmd.m(r0f.y(rv4Var).q, pna.c, rv4Var, 48);
                                    rv4Var.q(false);
                                    break;
                                case 2:
                                    rv4Var.e0(2114851591);
                                    nmd.n(r0f.y(rv4Var).q, pna.c, rv4Var, 48);
                                    rv4Var.q(false);
                                    break;
                                case 3:
                                    rv4Var.e0(2115092647);
                                    nmd.o(r0f.y(rv4Var).q, pna.c, rv4Var, 48);
                                    rv4Var.q(false);
                                    break;
                                case 4:
                                    rv4Var.e0(2115333703);
                                    nmd.p(r0f.y(rv4Var).q, pna.c, rv4Var, 48);
                                    rv4Var.q(false);
                                    break;
                                case 5:
                                    rv4Var.e0(2115574759);
                                    nmd.q(r0f.y(rv4Var).q, pna.c, rv4Var, 48);
                                    rv4Var.q(false);
                                    break;
                                case 6:
                                    rv4Var.e0(2115815815);
                                    nmd.r(r0f.y(rv4Var).q, pna.c, rv4Var, 48);
                                    rv4Var.q(false);
                                    break;
                                case 7:
                                    rv4Var.e0(2116056871);
                                    nmd.s(r0f.y(rv4Var).q, pna.c, rv4Var, 48);
                                    rv4Var.q(false);
                                    break;
                                default:
                                    rv4Var.e0(2116282303);
                                    rv4Var.q(false);
                                    break;
                            }
                            rv4Var.q(true);
                        } else {
                            rv4Var.X();
                        }
                        return pvc.a;
                    }
                }, true, -1166688611), 6);
                return pvcVar;
        }
    }

    public /* synthetic */ al(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
