package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: na9  reason: default package */
/* loaded from: classes.dex */
public final class na9 {
    public static final na9 a = new Object();
    public static final su9 b = uu9.a;
    public static final float c = 80.0f;
    public static final float d = 80.0f;
    public static final float e = 3.0f;

    public final void a(final ya9 ya9Var, final boolean z, final nq7 nq7Var, final float f, wea weaVar, final long j, float f2, final tu1 tu1Var, rv4 rv4Var, final int i, final int i2) {
        final ya9 ya9Var2;
        int i3;
        float f3;
        int i4;
        Object obj;
        boolean z2;
        final wea weaVar2;
        final float f4;
        int i5;
        su9 su9Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        mu4 mu4Var;
        final wea weaVar3;
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        rv4Var.g0(-1341144489);
        if ((i & 6) == 0) {
            ya9Var2 = ya9Var;
            if (rv4Var.f(ya9Var2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i;
        } else {
            ya9Var2 = ya9Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i11 = 256;
            } else {
                i11 = Token.CASE;
            }
            i3 |= i11;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.c(f)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.e(j)) {
                i9 = 131072;
            } else {
                i9 = Parser.ARGC_LIMIT;
            }
            i3 |= i9;
        }
        if ((i & 1572864) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f2;
                if (rv4Var.c(f3)) {
                    i8 = 1048576;
                    i3 |= i8;
                }
            } else {
                f3 = f2;
            }
            i8 = 524288;
            i3 |= i8;
        } else {
            f3 = f2;
        }
        if ((i & 12582912) == 0) {
            if (rv4Var.h(tu1Var)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        if ((i & 100663296) == 0) {
            i4 = 1572864;
            obj = this;
            if (rv4Var.f(obj)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        } else {
            i4 = 1572864;
            obj = this;
        }
        if ((i3 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i5 = i3 & (-57345);
                if ((i2 & 64) != 0) {
                    i5 = i3 & (-3727361);
                }
                su9Var = weaVar;
                f4 = f3;
            } else {
                i5 = i3 & (-57345);
                int i14 = i2 & 64;
                su9 su9Var2 = b;
                if (i14 != 0) {
                    i5 = i3 & (-3727361);
                    f4 = e;
                } else {
                    f4 = f3;
                }
                su9Var = su9Var2;
            }
            rv4Var.r();
            float f5 = ra9.a;
            nq7 n = pna.n(nq7Var, 40.0f);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new rg8(22);
                rv4Var.o0(P);
            }
            nq7 t = ote.t(n, (xt4) P);
            if ((i5 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i5 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z4 | z3;
            if ((((i5 & 7168) ^ 3072) > 2048 && rv4Var.c(f)) || (i5 & 3072) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = z9 | z5;
            if ((((3670016 & i5) ^ i4) > 1048576 && rv4Var.c(f4)) || (i5 & i4) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean f6 = z10 | z6 | rv4Var.f(su9Var);
            Object P2 = rv4Var.P();
            if (!f6 && P2 != lh9Var) {
                mu4Var = P2;
                z7 = false;
                z8 = true;
                weaVar3 = su9Var;
            } else {
                weaVar3 = su9Var;
                z7 = false;
                z8 = true;
                mu4Var = new mu4() { // from class: ja9
                    @Override // defpackage.mu4
                    public final Object c(Object obj2, Object obj3, Object obj4) {
                        final mw8 M = ((w27) obj3).M(((x02) obj4).a);
                        int i15 = M.a;
                        int i16 = M.b;
                        final ya9 ya9Var3 = ya9.this;
                        final boolean z11 = z;
                        final float f7 = f;
                        final float f8 = f4;
                        final wea weaVar4 = weaVar3;
                        return ((e37) obj2).q0(i15, i16, ls3.a, new xt4() { // from class: la9
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj5) {
                                final ya9 ya9Var4 = ya9Var3;
                                final boolean z12 = z11;
                                final float f9 = f7;
                                final float f10 = f8;
                                final wea weaVar5 = weaVar4;
                                lw8.L((lw8) obj5, mw8.this, 0, 0, new xt4() { // from class: ma9
                                    @Override // defpackage.xt4
                                    public final Object invoke(Object obj6) {
                                        boolean z13;
                                        t15 t15Var = (t15) obj6;
                                        ya9 ya9Var5 = ya9.this;
                                        float a2 = ya9Var5.a();
                                        float f11 = nae.e;
                                        if (a2 <= nae.e && !z12) {
                                            z13 = false;
                                        } else {
                                            z13 = true;
                                        }
                                        t15Var.i((ya9Var5.a() * t15Var.X0(f9)) - Float.intBitsToFloat((int) (t15Var.b() & 4294967295L)));
                                        if (z13) {
                                            f11 = t15Var.f() * f10;
                                        }
                                        t15Var.e(f11);
                                        t15Var.J0(weaVar5);
                                        t15Var.w(true);
                                        return pvc.a;
                                    }
                                }, 4);
                                return pvc.a;
                            }
                        });
                    }
                };
                rv4Var.o0(mu4Var);
            }
            nq7 v = nmd.v(sze.f(t, mu4Var), j, weaVar3);
            int i15 = ((i5 >> 12) & 7168) | 48;
            b37 d2 = fu0.d(kh5.e, z7);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, v);
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
            tu1Var.c(pu0.a, rv4Var, Integer.valueOf(((i15 >> 6) & Token.ASSIGN_MOD) | 6));
            rv4Var.q(z8);
            weaVar2 = weaVar3;
        } else {
            rv4Var.X();
            weaVar2 = weaVar;
            f4 = f3;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final na9 na9Var = obj;
            u.d = new lu4() { // from class: ka9
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    na9.this.a(ya9Var, z, nq7Var, f, weaVar2, j, f4, tu1Var, (rv4) obj2, xoe.p(i | 1), i2);
                    return pvc.a;
                }
            };
        }
    }

    public final void b(final ya9 ya9Var, final boolean z, final nq7 nq7Var, long j, long j2, float f, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        final long j3;
        final long j4;
        final float f2;
        int i5;
        float f3;
        long j5;
        final long j6;
        rv4Var.g0(182619560);
        if (rv4Var.f(ya9Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4 | 599040;
        if ((4793491 & i8) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i5 = i8 & (-4193281);
                j5 = j;
                j6 = j2;
                f3 = f;
            } else {
                float f4 = ms6.a;
                long e2 = rm1.e(ch0.k, rv4Var);
                long e3 = rm1.e(ch0.j, rv4Var);
                i5 = i8 & (-4193281);
                f3 = d;
                j5 = e2;
                j6 = e3;
            }
            rv4Var.r();
            final long j7 = j5;
            long j8 = j6;
            f2 = f3;
            a(ya9Var, z, pna.p(nq7Var, ra9.b, ra9.a), f2, null, j7, nae.e, jce.E(2122932769, new mu4() { // from class: ga9
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    ou0 ou0Var = (ou0) obj;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 17) != 16) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        Boolean valueOf = Boolean.valueOf(z);
                        lf4 y = kqe.y(ur7.c, rv4Var2);
                        final long j9 = j7;
                        final long j10 = j6;
                        final ya9 ya9Var2 = ya9Var;
                        ctd.g(valueOf, null, y, null, jce.E(1703313632, new mu4() { // from class: ia9
                            @Override // defpackage.mu4
                            public final Object c(Object obj4, Object obj5, Object obj6) {
                                boolean z4;
                                int i9;
                                boolean booleanValue = ((Boolean) obj4).booleanValue();
                                rv4 rv4Var3 = (rv4) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                if ((intValue2 & 6) == 0) {
                                    if (rv4Var3.g(booleanValue)) {
                                        i9 = 4;
                                    } else {
                                        i9 = 2;
                                    }
                                    intValue2 |= i9;
                                }
                                if ((intValue2 & 19) != 18) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (rv4Var3.U(intValue2 & 1, z4)) {
                                    kq7 kq7Var = kq7.a;
                                    long j11 = j9;
                                    long j12 = j10;
                                    if (booleanValue) {
                                        rv4Var3.e0(-1622128210);
                                        eg0.b(pna.l(kq7Var, ra9.b, ra9.a), j11, j12, null, null, rv4Var3, 6);
                                        rv4Var3.q(false);
                                    } else {
                                        rv4Var3.e0(-1621590019);
                                        ya9 ya9Var3 = ya9Var2;
                                        boolean f5 = rv4Var3.f(ya9Var3);
                                        Object P = rv4Var3.P();
                                        lh9 lh9Var = ax1.a;
                                        if (f5 || P == lh9Var) {
                                            P = new u76(ya9Var3, 27);
                                            rv4Var3.o0(P);
                                        }
                                        vt4 vt4Var = (vt4) P;
                                        nq7 l = pna.l(kq7Var, ra9.b, ra9.a);
                                        boolean f6 = rv4Var3.f(ya9Var3);
                                        Object P2 = rv4Var3.P();
                                        if (f6 || P2 == lh9Var) {
                                            P2 = new cl7(ya9Var3, 20);
                                            rv4Var3.o0(P2);
                                        }
                                        eg0.c(vt4Var, ote.t(l, (xt4) P2), j11, j12, null, null, rv4Var3, 0);
                                        rv4Var3.q(false);
                                    }
                                } else {
                                    rv4Var3.X();
                                }
                                return pvc.a;
                            }
                        }, rv4Var2), rv4Var2, 24576);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 100663296, 16);
            j3 = j7;
            j4 = j8;
        } else {
            rv4Var.X();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(ya9Var, z, nq7Var, j3, j4, f2, i) { // from class: ha9
                public final /* synthetic */ float C;
                public final /* synthetic */ ya9 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ nq7 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(12582913);
                    na9.this.b(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }
}
