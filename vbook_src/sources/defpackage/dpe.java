package defpackage;

import android.content.Context;
import android.os.UserManager;
import android.view.inputmethod.ExtractedText;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dpe  reason: default package */
/* loaded from: classes.dex */
public abstract class dpe {
    public static final tu1 a = new tu1(new tx0(6), false, 759698998);
    public static final tu1 b = new tu1(new tx0(7), false, 486633673);
    public static final Object c = new Object();

    public static final void a(tm3 tm3Var, tu1 tu1Var, rv4 rv4Var, int i) {
        rv4Var.g0(-1977781714);
        if (((i | 2) & 19) == 18 && rv4Var.E()) {
            rv4Var.X();
        } else {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            } else {
                tm3Var = (tm3) rv4Var.j(by1.e);
            }
            rv4Var.r();
            pye.b(new i99[]{by1.e.a(tm3Var)}, tu1Var, rv4Var, 48);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jh(i, 2, tu1Var, tm3Var);
        }
    }

    public static final long b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ov5.a("The span value should be higher than 0");
        }
        return i;
    }

    public static final void c(final boolean z, final boolean z2, final float f, final float f2, nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        nq7 nq7Var2;
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        rv4Var.g0(959986603);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.c(f)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var.c(f2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5 | 24576;
        if (rv4Var.h(xt4Var2)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(xt4Var3)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i13 = i12 | i7;
        if ((4793491 & i13) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i13 & 1, z3)) {
            if (z2) {
                rv4Var.e0(-1226052795);
                int i14 = i13 & 14;
                int i15 = i13 >> 3;
                e(z, f, f2, xt4Var, xt4Var2, xt4Var3, rv4Var, (458752 & i15) | i14 | (i15 & Token.ASSIGN_MOD) | (i15 & 896) | 27648 | (i15 & 3670016));
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1225743136);
                int i16 = i13 & 14;
                int i17 = i13 >> 3;
                d(z, f, f2, xt4Var, xt4Var2, xt4Var3, rv4Var, i16 | (i17 & Token.ASSIGN_MOD) | (i17 & 896) | 27648 | (458752 & i17) | (i17 & 3670016));
                rv4Var.q(false);
            }
            nq7Var2 = kq7.a;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final nq7 nq7Var3 = nq7Var2;
            u.d = new lu4(z, z2, f, f2, nq7Var3, xt4Var, xt4Var2, xt4Var3, i) { // from class: uo7
                public final /* synthetic */ xt4 C;
                public final /* synthetic */ xt4 D;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ nq7 e;
                public final /* synthetic */ xt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(196609);
                    dpe.c(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void d(boolean z, final float f, final float f2, xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        xt4 xt4Var4;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(-103134161);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.c(f)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.c(f2)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        int i10 = i & 3072;
        kq7 kq7Var = kq7.a;
        if (i10 == 0) {
            if (rv4Var.f(kq7Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            xt4Var4 = xt4Var;
            if (rv4Var.h(xt4Var4)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            xt4Var4 = xt4Var;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            nmd.d(z, xt4Var4, kq7Var, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(1109631827, new mu4() { // from class: xo7
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zn1) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        dpe.j(f, f2, zbe.y(mwe.u(pna.f(kq7.a, 1.0f), false, 14), 24.0f), xt4Var2, xt4Var3, rv4Var2, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i2 & 14) | 3072 | ((i2 >> 9) & Token.ASSIGN_MOD) | ((i2 >> 3) & 896), 48, 2032);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yo7(z, f, f2, xt4Var, xt4Var2, xt4Var3, i, 0);
        }
    }

    public static final void e(boolean z, final float f, final float f2, xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(1423774367);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.c(f)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.c(f2)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        int i10 = i & 3072;
        kq7 kq7Var = kq7.a;
        if (i10 == 0) {
            if (rv4Var.f(kq7Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            xb.d(z, xt4Var, null, kq7Var, null, jce.E(38226728, new id1(xt4Var, 24, (byte) 0), rv4Var), yf2.c, null, 0L, 0L, nae.e, false, false, jce.E(474042995, new lu4() { // from class: zo7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        dpe.j(f, f2, pna.f(kq7.a, 1.0f), xt4Var2, xt4Var3, rv4Var2, 384);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i2 & 14) | 1769472 | ((i2 >> 9) & Token.ASSIGN_MOD) | (i2 & 7168), 8084);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yo7(z, f, f2, xt4Var, xt4Var2, xt4Var3, i, 1);
        }
    }

    public static final void f(yja yjaVar, nq7 nq7Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        rv4Var.g0(523799468);
        if ((i & 6) == 0) {
            i3 = i | 2;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            } else {
                yjaVar = o28.u(cka.a, rv4Var);
                if (i5 != 0) {
                    nq7Var = kq7.a;
                }
            }
            rv4Var.r();
            nq7Var.getClass();
            nq7 a0 = nq7Var.a0(new zw1(new pl7(yjaVar, 11)));
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, a0);
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
            ze4 ze4Var = pna.c;
            tza tzaVar = j27.a;
            fu0.a(nmd.v(ze4Var, zl1.b(0.1f, rm1.a(((h27) rv4Var.j(tzaVar)).a, ((h27) rv4Var.j(tzaVar)).a.p)), lre.g), rv4Var, 0);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        yja yjaVar2 = yjaVar;
        nq7 nq7Var2 = nq7Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ns1(i, i2, 3, yjaVar2, nq7Var2);
        }
    }

    public static final void g(nq7 nq7Var, wea weaVar, rv4 rv4Var, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        rv4Var.g0(1582646960);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && rv4Var.f(weaVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            } else if ((i2 & 2) != 0) {
                weaVar = ((h27) rv4Var.j(j27.a)).c.b;
            }
            rv4Var.r();
            f(null, tte.k(nq7Var, weaVar), rv4Var, 0, 1);
        } else {
            rv4Var.X();
        }
        wea weaVar2 = weaVar;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ns1(i, i2, 4, nq7Var, weaVar2);
        }
    }

    public static final void h(zxa zxaVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        aw7 aw7Var;
        lu4 olVar;
        aw7 aw7Var2;
        int i3;
        int i4;
        zxaVar.getClass();
        rv4Var.g0(79759912);
        if ((i & 6) == 0) {
            if (rv4Var.f(zxaVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = i2;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            yxa a2 = zxaVar.a();
            int i6 = i5 & 14;
            if (i6 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            boolean z3 = true;
            if (z2 || P == lh9Var) {
                P = new oj3(zxaVar, null);
                rv4Var.o0(P);
            }
            yte.g((lu4) P, rv4Var, a2);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = yae.z(null);
                rv4Var.o0(P2);
            }
            aw7 aw7Var3 = (aw7) P2;
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = yae.z(Boolean.FALSE);
                rv4Var.o0(P3);
            }
            aw7 aw7Var4 = (aw7) P3;
            yxa a3 = zxaVar.a();
            if (i6 != 4) {
                z3 = false;
            }
            Object P4 = rv4Var.P();
            if (z3 || P4 == lh9Var) {
                aw7Var = aw7Var3;
                aw7Var2 = aw7Var4;
                olVar = new ol(zxaVar, aw7Var, aw7Var2, (m42) null, 20);
                rv4Var.o0(olVar);
            } else {
                aw7Var = aw7Var3;
                olVar = P4;
                aw7Var2 = aw7Var4;
            }
            yte.g(olVar, rv4Var, a3);
            fpe.l(((Boolean) aw7Var2.getValue()).booleanValue(), (yxa) aw7Var.getValue(), nq7Var, rv4Var, (i5 << 3) & 896);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(zxaVar, nq7Var, i, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final float r63, final float r64, final float r65, final java.lang.String r66, boolean r67, defpackage.nq7 r68, final defpackage.xt4 r69, final defpackage.vt4 r70, defpackage.rv4 r71, final int r72, final int r73) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpe.i(float, float, float, java.lang.String, boolean, nq7, xt4, vt4, rv4, int, int):void");
    }

    public static final void j(final float f, final float f2, final nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int i6;
        rv4 rv4Var2 = rv4Var;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var2.g0(525945381);
        if (rv4Var2.c(f)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i2 | i;
        if (rv4Var2.c(f2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i8 |= i6;
        }
        if (rv4Var2.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(xt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i10 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            String A = yqe.A((y3b) z1b.j0.getValue(), rv4Var2);
            if ((57344 & i10) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new in7(14, xt4Var2);
                rv4Var2.o0(P);
            }
            i(f, 0.5f, 6.0f, A, false, null, xt4Var2, (vt4) P, rv4Var, (i10 & 14) | 432 | ((i10 << 6) & 3670016), 48);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7.a, 32.0f));
            String A2 = yqe.A((y3b) z1b.Y.getValue(), rv4Var2);
            if ((i10 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (z3 || P2 == lh9Var) {
                P2 = new in7(15, xt4Var);
                rv4Var2.o0(P2);
            }
            i(f2, 0.5f, 3.0f, A2, false, null, xt4Var, (vt4) P2, rv4Var2, ((i10 >> 3) & 14) | 432 | ((i10 << 9) & 3670016), 48);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: ap7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dpe.j(f, f2, nq7Var, xt4Var, xt4Var2, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final ExtractedText k(jub jubVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = jubVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = jubVar.b;
        extractedText.selectionStart = fxb.g(j);
        extractedText.selectionEnd = fxb.f(j);
        extractedText.flags = !k4b.W(jubVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final ls0 l(h49 h49Var, String str, boolean z) {
        h49Var.getClass();
        return new ls0(h49Var, str, z);
    }

    public static o71 o() {
        return new o71(o17.s(new yk8("paragraph", new qm0("Paragraph", "Plain text paragraph", tl1.B("text", "p"))), new yk8("heading_1", new qm0("Heading 1", "Heading level 1", tl1.B("h1", "heading", "title"))), new yk8("heading_2", new qm0("Heading 2", "Heading level 2", tl1.B("h2", "heading", "title"))), new yk8("heading_3", new qm0("Heading 3", "Heading level 3", tl1.B("h3", "heading", "title"))), new yk8("heading_4", new qm0("Heading 4", "Heading level 4", tl1.B("h4", "heading", "title"))), new yk8("heading_5", new qm0("Heading 5", "Heading level 5", tl1.B("h5", "heading", "title"))), new yk8("heading_6", new qm0("Heading 6", "Heading level 6", tl1.B("h6", "heading", "title"))), new yk8("todo", new qm0("To-do", "Task with checkbox", tl1.B("checkbox", "task", "check", "todo"))), new yk8("bullet_list", new qm0("Bullet List", "Unordered list item", tl1.B("list", "bullet", "ul", "unordered"))), new yk8("numbered_list", new qm0("Numbered List", "Ordered list item", tl1.B("list", "number", "ol", "ordered"))), new yk8("quote", new qm0("Quote", "Quoted text block", tl1.B("blockquote", "citation"))), new yk8("code", new qm0("Code", "Plain code block", tl1.B("code", "snippet", "monospace"))), new yk8("divider", new qm0("Divider", "Horizontal line separator", tl1.B("hr", "line", "separator", "horizontal"))), new yk8("image", new qm0("Image", "Embedded image", tl1.B("picture", "photo", "img")))));
    }

    public static final vi4 p(h49 h49Var, String str, float f) {
        h49Var.getClass();
        return new vi4(h49Var, str, f);
    }

    public static final hy5 q(h49 h49Var, String str, int i) {
        h49Var.getClass();
        return new hy5(h49Var, str, i);
    }

    public static boolean r(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final wx6 s(h49 h49Var, String str, long j) {
        h49Var.getClass();
        return new wx6(h49Var, str, j);
    }

    public static final u68 t(h49 h49Var, String str, s76 s76Var) {
        h49Var.getClass();
        s76Var.getClass();
        return new u68(h49Var, str, s76Var);
    }

    public static final u68 u(h49 h49Var, String str, String str2) {
        h49Var.getClass();
        return new u68(h49Var, str, str2);
    }

    public static int v(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public abstract void m(lo1 lo1Var, Set set);

    public abstract int n(lo1 lo1Var);
}
