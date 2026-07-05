package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: voe  reason: default package */
/* loaded from: classes.dex */
public abstract class voe {
    public static final tu1 a = new tu1(new tx0(2), false, -1415589547);
    public static final tu1 b = new tu1(new xu1(5), false, 612665182);
    public static final tu1 c = new tu1(new sv1(15), false, -1426005477);
    public static final tu1 d = new tu1(new sv1(16), false, -1910950726);
    public static final tu1 e = new tu1(new tv1(16), false, 2006391562);
    public static final tu1 f = new tu1(new tv1(17), false, -2113533676);
    public static final tu1 g = new tu1(new tv1(18), false, 1016127549);
    public static final us h = new us(5);
    public static final us i = new us(2);
    public static final us j = new us(0);
    public static final us k = new us(3);

    public static void A(int i2, int i3) {
        String r;
        if (i2 >= 0 && i2 < i3) {
            return;
        }
        if (i2 >= 0) {
            if (i3 < 0) {
                vs.m(nk2.s(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
                return;
            }
            r = xoe.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            r = xoe.r("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(r);
    }

    public static void B(int i2, int i3) {
        if (i2 >= 0 && i2 <= i3) {
            return;
        }
        cy7.k(D(i2, i3, "index"));
    }

    public static void C(int i2, int i3, int i4) {
        String D;
        if (i2 >= 0 && i3 >= i2 && i3 <= i4) {
            return;
        }
        if (i2 >= 0 && i2 <= i4) {
            if (i3 >= 0 && i3 <= i4) {
                D = xoe.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                D = D(i3, i4, "end index");
            }
        } else {
            D = D(i2, i4, "start index");
        }
        throw new IndexOutOfBoundsException(D);
    }

    public static String D(int i2, int i3, String str) {
        if (i2 < 0) {
            return xoe.r("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return xoe.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        vs.m(nk2.s(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
        return null;
    }

    public static final void a(final nq7 nq7Var, qg6 qg6Var, final p25 p25Var, final rh8 rh8Var, final boolean z, final li4 li4Var, final boolean z2, final wi wiVar, final jz jzVar, final fz fzVar, final xt4 xt4Var, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        qg6 qg6Var2;
        boolean z4;
        boolean z5;
        boolean z6;
        d38 d38Var;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        qg6 qg6Var3;
        ff8 ff8Var;
        boolean z15;
        nq7 nq7Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean h2;
        int i15;
        int i16;
        int i17;
        rv4Var.g0(708740370);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i4 = i17 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(qg6Var)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i4 |= i16;
        }
        if ((i2 & 384) == 0) {
            if ((i2 & 512) == 0) {
                h2 = rv4Var.f(p25Var);
            } else {
                h2 = rv4Var.h(p25Var);
            }
            if (h2) {
                i15 = 256;
            } else {
                i15 = Token.CASE;
            }
            i4 |= i15;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(rh8Var)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i4 |= i14;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.g(false)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i4 |= i13;
        }
        if ((i2 & 196608) == 0) {
            if (rv4Var.g(z)) {
                i12 = 131072;
            } else {
                i12 = Parser.ARGC_LIMIT;
            }
            i4 |= i12;
        }
        if ((i2 & 1572864) == 0) {
            if (rv4Var.f(li4Var)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        if ((i2 & 12582912) == 0) {
            if (rv4Var.g(z2)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        if ((i2 & 100663296) == 0) {
            if (rv4Var.f(wiVar)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i4 |= i9;
        }
        if ((i2 & 805306368) == 0) {
            if (rv4Var.f(jzVar)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i4 |= i8;
        }
        if ((i3 & 6) == 0) {
            if (rv4Var.f(fzVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i3 | i7;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i5 |= i6;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var.U(i4 & 1, z3)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            int i18 = i4 >> 3;
            int i19 = i18 & 14;
            int i20 = i19 | (i5 & Token.ASSIGN_MOD);
            aw7 D = yae.D(xt4Var, rv4Var);
            int i21 = i4;
            if ((((i20 & 14) ^ 6) > 4 && rv4Var.f(qg6Var)) || (i20 & 6) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (z4 || P == obj2) {
                r0f r0fVar = r0f.L;
                P = new xf6(0, 0, yya.class, yae.r(new mf6(1, yae.r(new ea4(D, 21), r0fVar), qg6Var), r0fVar), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                rv4Var.o0(P);
            }
            p76 p76Var = (p76) P;
            int i22 = i19 | ((i21 >> 9) & Token.ASSIGN_MOD);
            if ((((i22 & 14) ^ 6) > 4 && rv4Var.f(qg6Var)) || (i22 & 6) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((((i22 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.g(false)) || (i22 & 48) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z16 = z6 | z5;
            Object P2 = rv4Var.P();
            if (z16 || P2 == obj2) {
                P2 = new rj6(qg6Var);
                rv4Var.o0(P2);
            }
            rj6 rj6Var = (rj6) P2;
            Object P3 = rv4Var.P();
            if (P3 == obj2) {
                P3 = yte.s(rv4Var);
                rv4Var.o0(P3);
            }
            m82 m82Var = (m82) P3;
            m15 m15Var = (m15) rv4Var.j(dy1.g);
            if (!((Boolean) rv4Var.j(dy1.x)).booleanValue()) {
                d38Var = m0b.a;
            } else {
                d38Var = null;
            }
            int i23 = (i21 & 524272) | ((i5 << 18) & 3670016) | ((i21 >> 6) & 29360128);
            d38 d38Var2 = d38Var;
            if ((((i23 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.f(qg6Var)) || (i23 & 48) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((((i23 & 896) ^ 384) > 256 && rv4Var.f(p25Var)) || (i23 & 384) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z17 = z8 | z7;
            if ((((i23 & 7168) ^ 3072) > 2048 && rv4Var.f(rh8Var)) || (i23 & 3072) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z18 = z17 | z9;
            if ((((57344 & i23) ^ 24576) > 16384 && rv4Var.g(false)) || (i23 & 24576) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z19 = z18 | z10;
            if ((((458752 & i23) ^ 196608) > 131072 && rv4Var.g(z)) || (i23 & 196608) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z20 = z19 | z11;
            if ((((i23 & 3670016) ^ 1572864) > 1048576 && rv4Var.f(fzVar)) || (i23 & 1572864) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z21 = z20 | z12;
            if ((((i23 & 29360128) ^ 12582912) > 8388608 && rv4Var.f(jzVar)) || (i23 & 12582912) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean f2 = z13 | z21 | rv4Var.f(m15Var);
            Object P4 = rv4Var.P();
            if (!f2 && P4 != obj2) {
                qg6Var3 = qg6Var;
                obj = obj2;
                z14 = true;
            } else {
                obj = obj2;
                z14 = true;
                Object cg6Var = new cg6(qg6Var, z, rh8Var, p76Var, p25Var, jzVar, fzVar, m82Var, m15Var, d38Var2);
                qg6Var3 = qg6Var;
                rv4Var.o0(cg6Var);
                P4 = cg6Var;
            }
            uh6 uh6Var = (uh6) P4;
            if (z) {
                ff8Var = ff8.a;
            } else {
                ff8Var = ff8.b;
            }
            ff8 ff8Var2 = ff8Var;
            if (z2) {
                rv4Var.e0(27281635);
                if (((i19 ^ 6) <= 4 || !rv4Var.f(qg6Var3)) && (i18 & 6) != 4) {
                    z14 = false;
                }
                Object P5 = rv4Var.P();
                if (z14 || P5 == obj) {
                    P5 = new rf6(qg6Var3);
                    rv4Var.o0(P5);
                }
                z15 = false;
                nq7Var2 = q0f.l((rf6) P5, qg6Var3.n, false, ff8Var2);
                rv4Var.q(false);
            } else {
                z15 = false;
                rv4Var.e0(27577840);
                rv4Var.q(false);
                nq7Var2 = kq7.a;
            }
            qg6 qg6Var4 = qg6Var3;
            qg6Var2 = qg6Var4;
            r1d.e(p76Var, tte.u(uaf.x(fca.q(nq7Var.a0(qg6Var3.k).a0(qg6Var3.l), p76Var, rj6Var, ff8Var2, z2, z15).a0(nq7Var2), qg6Var3.m), qg6Var4, ff8Var2, wiVar, z2, z15, li4Var, qg6Var3.f, null), qg6Var2.o, uh6Var, rv4Var, 0, 0);
        } else {
            qg6Var2 = qg6Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final qg6 qg6Var5 = qg6Var2;
            u.d = new lu4() { // from class: zf6
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int p = xoe.p(i2 | 1);
                    int p2 = xoe.p(i3);
                    voe.a(nq7.this, qg6Var5, p25Var, rh8Var, z, li4Var, z2, wiVar, jzVar, fzVar, xt4Var, (rv4) obj3, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(boolean z, vxb vxbVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        vxbVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        rv4Var.g0(1719456416);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(vxbVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (rv4Var.h(xt4Var3)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-1748597405);
                d(z, vxbVar, xt4Var, xt4Var2, xt4Var3, rv4Var, i12 & 65534);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1748338493);
                c(z, vxbVar, xt4Var, xt4Var2, xt4Var3, rv4Var, i12 & 65534);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xn7(z, vxbVar, xt4Var, xt4Var2, xt4Var3, i2, 0);
        }
    }

    public static final void c(boolean z, vxb vxbVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        rv4Var.g0(1177946095);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(vxbVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (rv4Var.h(xt4Var3)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            nmd.f(z, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(1732293726, new ax(3, vxbVar, xt4Var2, xt4Var3), rv4Var), rv4Var, (i12 & 14) | 805309440 | ((i12 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xn7(z, vxbVar, xt4Var, xt4Var2, xt4Var3, i2, 1);
        }
    }

    public static final void d(boolean z, vxb vxbVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        rv4Var.g0(1209140628);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(vxbVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (rv4Var.h(xt4Var3)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            z87.a(z, xt4Var, null, null, kh5.c, zl1.b(0.3f, zl1.b), false, false, null, jce.E(935483250, new g83((Object) vxbVar, xt4Var3, (hu4) xt4Var, (Object) xt4Var2, 5), rv4Var), rv4Var, (i12 & 14) | 805527552 | ((i12 >> 3) & Token.ASSIGN_MOD), 460);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xn7(z, vxbVar, xt4Var, xt4Var2, xt4Var3, i2, 2);
        }
    }

    public static final void e(vxb vxbVar, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i2, int i3) {
        int i4;
        th8 th8Var;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        rv4Var.g0(-1443760276);
        if (rv4Var.f(vxbVar)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i2 | i4;
        int i10 = i3 & 2;
        if (i10 != 0) {
            i6 = i9 | 48;
            th8Var = rh8Var;
        } else {
            th8Var = rh8Var;
            if (rv4Var.f(th8Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i9 | i5;
        }
        if (rv4Var.f(nq7Var)) {
            i7 = 256;
        } else {
            i7 = Token.CASE;
        }
        int i11 = i6 | i7;
        if (rv4Var.h(xt4Var)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i12 = i11 | i8;
        boolean z3 = false;
        if ((i12 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i12 & 1, z)) {
            if (i10 != 0) {
                th8Var = new th8(nae.e, nae.e, nae.e, nae.e);
            }
            bkd r = mwe.r(th8Var, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            if ((i12 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i12 & 7168) == 2048) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new fl7(2, vxbVar, xt4Var);
                rv4Var.o0(P);
            }
            pc2.c(nq7Var, null, th8Var, null, null, null, false, r, 0L, 0L, nae.e, (xt4) P, rv4Var, ((i12 >> 6) & 14) | ((i12 << 3) & 896), 0, 3834);
        } else {
            rv4Var.X();
        }
        rh8 rh8Var2 = th8Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(vxbVar, rh8Var2, nq7Var, xt4Var, i2, i3, 13);
        }
    }

    public static final void f(rxb rxbVar, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        nq7 nq7Var2 = nq7Var;
        rv4Var.g0(504751738);
        if (rv4Var.f(rxbVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var.f(nq7Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            long j2 = ((h27) rv4Var.j(j27.a)).a.c;
            boolean f2 = rv4Var.f(rxbVar.d);
            Object P = rv4Var.P();
            if (f2 || P == ax1.a) {
                ps psVar = rxbVar.d;
                String str = psVar.b;
                List<os> c2 = psVar.c();
                ArrayList arrayList = new ArrayList(tl1.s(c2, 10));
                for (os osVar : c2) {
                    ArrayList arrayList2 = arrayList;
                    long j3 = j2;
                    arrayList2.add(os.a(osVar, new uva(0L, 0L, null, null, null, null, null, 0L, null, null, null, j3, null, null, 63487), 0, 0, 14));
                    str = str;
                    arrayList = arrayList2;
                    j2 = j3;
                }
                P = new ps(str, arrayList);
                rv4Var.o0(P);
            }
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.j;
            nq7Var2 = nq7Var;
            cvb.d((ps) P, nq7Var2, ((h27) rv4Var.j(tzaVar)).a.q, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, oybVar, rv4Var, i6 & Token.ASSIGN_MOD, 0, 262136);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sv4(rxbVar, nq7Var2, i2, 25);
        }
    }

    public static final void g(gw7 gw7Var, mq7 mq7Var) {
        gw7 z = v(mq7Var).z();
        int i2 = z.c - 1;
        Object[] objArr = z.a;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                gw7Var.b((mq7) ((od6) objArr[i2]).c0.C);
                i2--;
            }
        }
    }

    public static final mq7 h(gw7 gw7Var) {
        int i2;
        if (gw7Var != null && (i2 = gw7Var.c) != 0) {
            return (mq7) gw7Var.k(i2 - 1);
        }
        return null;
    }

    public static void i(eqa eqaVar, List list, fk9 fk9Var) {
        Object obj;
        ek9 ek9Var;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int c2 = eqaVar.c((lv4) list.get(i2));
                int P = eqaVar.P(eqaVar.r(c2), eqaVar.b);
                if (P < eqaVar.g(eqaVar.r(c2 + 1), eqaVar.b)) {
                    obj = eqaVar.c[eqaVar.h(P)];
                } else {
                    obj = ax1.a;
                }
                if (obj instanceof ek9) {
                    ek9Var = (ek9) obj;
                } else {
                    ek9Var = null;
                }
                if (ek9Var != null) {
                    ek9Var.a = fk9Var;
                }
            }
        }
    }

    public static final fd6 j(mq7 mq7Var) {
        if ((mq7Var.c & 2) != 0) {
            if (mq7Var instanceof fd6) {
                return (fd6) mq7Var;
            }
            if (mq7Var instanceof m03) {
                mq7 mq7Var2 = ((m03) mq7Var).L;
                while (mq7Var2 != null) {
                    if (mq7Var2 instanceof fd6) {
                        return (fd6) mq7Var2;
                    }
                    if ((mq7Var2 instanceof m03) && (mq7Var2.c & 2) != 0) {
                        mq7Var2 = ((m03) mq7Var2).L;
                    } else {
                        mq7Var2 = mq7Var2.f;
                    }
                }
            }
        }
        return null;
    }

    public static int[] m(String str) {
        int i2;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i3 = indexOf4 + 2;
        if (i3 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i3) == '/') {
            i2 = str.indexOf(47, indexOf4 + 3);
            if (i2 == -1 || i2 > indexOf2) {
                i2 = indexOf2;
            }
        } else {
            i2 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i2;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [kc1, java.lang.Object] */
    public static final kc1 n(byte[] bArr) {
        int i2;
        Integer num = null;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        Integer num2 = null;
        while (true) {
            int i4 = i3 + 2;
            if (i4 <= bArr.length) {
                int I = yae.I(bArr, i3);
                switch ((I >>> 13) & 7) {
                    case 0:
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                    case 4:
                    case 5:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 6:
                        i2 = -1;
                        break;
                    case 7:
                        i2 = 3;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                if (i2 < 0) {
                    if (i4 < bArr.length) {
                        i2 = bArr[i4] & 255;
                        i4 = i3 + 3;
                    }
                }
                i3 = i4 + i2;
                if (i3 <= bArr.length) {
                    if (I != 2101) {
                        if (I != 2102) {
                            if (I != 19011) {
                                if (I == 27139 && i2 >= 4) {
                                    num2 = Integer.valueOf((int) yae.J(bArr, i4));
                                }
                            } else if (i2 >= 2) {
                                num = Integer.valueOf(yae.I(bArr, i4));
                            }
                        } else if (i2 >= 1) {
                            int i5 = bArr[i4] & 255;
                            if (i5 != 1 && i5 != 129) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        }
                    } else if (i2 >= 1) {
                        int i6 = bArr[i4] & 255;
                        if (i6 != 1 && i6 != 129) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.a = z;
        obj.b = z2;
        obj.c = num;
        obj.d = num2;
        return obj;
    }

    public static final m71 p(vt4 vt4Var, rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = m71.b;
        boolean f2 = rv4Var.f(vt4Var);
        Object P = rv4Var.P();
        if (f2 || P == ax1.a) {
            P = new pa(20, vt4Var);
            rv4Var.o0(P);
        }
        m71 m71Var = (m71) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 0);
        m71Var.a.G.setValue(vt4Var);
        return m71Var;
    }

    public static String q(StringBuilder sb, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i7 = i2;
        int i8 = i7;
        while (i7 <= i3) {
            if (i7 == i3) {
                i4 = i7;
            } else if (sb.charAt(i7) == '/') {
                i4 = i7 + 1;
            } else {
                i7++;
            }
            int i9 = i8 + 1;
            if (i7 == i9 && sb.charAt(i8) == '.') {
                sb.delete(i8, i4);
                i3 -= i4 - i8;
            } else {
                if (i7 == i8 + 2 && sb.charAt(i8) == '.' && sb.charAt(i9) == '.') {
                    i5 = sb.lastIndexOf("/", i8 - 2) + 1;
                    if (i5 > i2) {
                        i6 = i5;
                    } else {
                        i6 = i2;
                    }
                    sb.delete(i6, i4);
                    i3 -= i4 - i6;
                } else {
                    i5 = i7 + 1;
                }
                i8 = i5;
            }
            i7 = i8;
        }
        return sb.toString();
    }

    public static final void r(f03 f03Var) {
        cf autofillManager;
        od6 v = v(f03Var);
        if (!v.Q) {
            rg rgVar = (rg) rd6.a(v);
            if (rg.e() && (autofillManager = rgVar.getAutofillManager()) != null) {
                Rect rect = autofillManager.f;
                vk9 vk9Var = autofillManager.d;
                od6 od6Var = (od6) vk9Var.a.b(v.b);
                if (od6Var != null && od6Var.C != -4) {
                    kj kjVar = vk9Var.c;
                    int e2 = vk9Var.e(od6Var);
                    long[] jArr = (long[]) kjVar.b;
                    long j2 = jArr[e2];
                    long j3 = jArr[e2 + 1];
                    rect.set((int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3);
                    autofillManager.a.g(autofillManager.c, v.b, rect);
                }
            }
        }
    }

    public static final i38 s(f03 f03Var, int i2) {
        i38 i38Var = ((mq7) f03Var).a.D;
        i38Var.getClass();
        if (i38Var.E1() == f03Var && o38.g(i2)) {
            i38 i38Var2 = i38Var.R;
            i38Var2.getClass();
            return i38Var2;
        }
        return i38Var;
    }

    public static final m15 t(f03 f03Var) {
        return ((rg) w(f03Var)).getGraphicsContext();
    }

    public static final i38 u(f03 f03Var) {
        if (!((mq7) f03Var).a.J) {
            lv5.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        i38 s = s(f03Var, 2);
        if (!s.E1().J) {
            lv5.c("LayoutCoordinates is not attached.");
        }
        return s;
    }

    public static final od6 v(f03 f03Var) {
        i38 i38Var = ((mq7) f03Var).a.D;
        if (i38Var != null) {
            return i38Var.O;
        }
        throw a82.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final wg8 w(f03 f03Var) {
        wg8 wg8Var = v(f03Var).K;
        if (wg8Var != null) {
            return wg8Var;
        }
        throw a82.f("This node does not have an owner.");
    }

    public static String x(String str, String str2) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] m = m(str2);
        if (m[0] != -1) {
            sb.append(str2);
            q(sb, m[1], m[2]);
            return sb.toString();
        }
        int[] m2 = m(str);
        if (m[3] == 0) {
            sb.append((CharSequence) str, 0, m2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (m[2] == 0) {
            sb.append((CharSequence) str, 0, m2[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i3 = m[1];
            if (i3 != 0) {
                int i4 = m2[0] + 1;
                sb.append((CharSequence) str, 0, i4);
                sb.append(str2);
                return q(sb, m[1] + i4, i4 + m[2]);
            } else if (str2.charAt(i3) == '/') {
                sb.append((CharSequence) str, 0, m2[1]);
                sb.append(str2);
                int i5 = m2[1];
                return q(sb, i5, m[2] + i5);
            } else {
                int i6 = m2[0] + 2;
                int i7 = m2[1];
                if (i6 < i7 && i7 == m2[2]) {
                    sb.append((CharSequence) str, 0, i7);
                    sb.append('/');
                    sb.append(str2);
                    int i8 = m2[1];
                    return q(sb, i8, m[2] + i8 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, m2[2] - 1);
                if (lastIndexOf == -1) {
                    i2 = m2[1];
                } else {
                    i2 = lastIndexOf + 1;
                }
                sb.append((CharSequence) str, 0, i2);
                sb.append(str2);
                return q(sb, m2[1], i2 + m[2]);
            }
        }
    }

    public static Uri y(String str, String str2) {
        return Uri.parse(x(str, str2));
    }

    public static final gdd z(gi1 gi1Var, qdd qddVar, String str, pb2 pb2Var, q0a q0aVar, vt4 vt4Var) {
        qddVar.getClass();
        pb2Var.getClass();
        odd oddVar = new odd(qddVar, new s96(gi1Var, q0aVar, vt4Var), pb2Var);
        gi1Var.f();
        if (str == null) {
            str = null;
        }
        if (str != null) {
            return oddVar.a(gi1Var, str);
        }
        String f2 = gi1Var.f();
        if (f2 != null) {
            return oddVar.a(gi1Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f2));
        }
        vs.m("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public abstract Intent k(Context context, Object obj);

    public uwd l(Context context, Object obj) {
        return null;
    }

    public abstract Object o(Intent intent, int i2);
}
