package defpackage;

import java.util.Locale;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: do5  reason: default package */
/* loaded from: classes.dex */
public abstract class do5 {
    public static final ly1 a = new ly1(new k85(16));

    /* JADX WARN: Removed duplicated region for block: B:134:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.Object r21, defpackage.w22 r22, boolean r23, java.lang.Integer r24, defpackage.mu4 r25, defpackage.mu4 r26, defpackage.nq7 r27, defpackage.xt4 r28, defpackage.rv4 r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do5.a(java.lang.Object, w22, boolean, java.lang.Integer, mu4, mu4, nq7, xt4, rv4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.Object r19, defpackage.w22 r20, boolean r21, defpackage.nu4 r22, defpackage.tu1 r23, defpackage.nq7 r24, defpackage.rv4 r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do5.b(java.lang.Object, w22, boolean, nu4, tu1, nq7, rv4, int, int):void");
    }

    public static final void c(String str, String str2, String str3, String str4, w22 w22Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        hl5.z(str, str2, str3, str4);
        rv4Var.g0(1826106065);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(str2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(str3)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(str4)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(w22Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        int i9 = i2 | 1572864;
        if ((599187 & i9) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            if (str.length() == 0) {
                rv4Var.e0(1470263745);
                dpe.f(null, nq7Var, rv4Var, (i9 >> 12) & Token.ASSIGN_MOD, 1);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1470356125);
                if ((i9 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i9 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z5 = z2 | z3;
                if ((i9 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z6 = z5 | z4;
                Object P = rv4Var.P();
                if (z6 || P == ax1.a) {
                    P = new ho0(str, str3, str4);
                    rv4Var.o0(P);
                }
                a((ho0) P, w22Var, false, 480, jce.E(1893914501, new uc5(str2, 1), rv4Var), uue.d, nq7Var, null, rv4Var, ((i9 << 9) & 1879048192) | ((i9 >> 9) & Token.ASSIGN_MOD) | 1794048 | ((i9 << 6) & 29360128), 268);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ru1(str, str2, str3, str4, w22Var, nq7Var, i, 3);
        }
    }

    public static final void d(String str, String str2, String str3, w22 w22Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        String str4;
        String str5;
        rv4 rv4Var2;
        String str6;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rs8.w(str, str2, str3);
        rv4Var.g0(83274841);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(str2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(str3)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(w22Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i8 = i2 | 196608;
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            if (str2.length() == 0) {
                rv4Var.e0(-1650066125);
                b37 d = fu0.d(kh5.a, false);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, nq7Var);
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
                dxe.h(rp5.b((wk3) jk3.D.getValue(), rv4Var, 0), null, pna.c, null, r0f.d, nae.e, null, rv4Var, 25016, Token.ASSIGN_LOGICAL_AND);
                cvb.c(str, pu0.a.a(zbe.y(kq7.a, 12.0f), kh5.e), zl1.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.i, rv4Var, (i8 & 14) | 384, 0, 131064);
                str6 = str;
                rv4Var2 = rv4Var;
                rv4Var2.q(true);
                rv4Var2.q(false);
                str4 = str2;
                str5 = str3;
            } else {
                boolean z3 = true;
                str6 = str;
                rv4Var.e0(-1649504033);
                if ((i8 & Token.ASSIGN_MOD) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i8 & 896) != 256) {
                    z3 = false;
                }
                boolean z4 = z3 | z2;
                Object P = rv4Var.P();
                if (!z4 && P != ax1.a) {
                    str4 = str2;
                    str5 = str3;
                } else {
                    str4 = str2;
                    str5 = str3;
                    P = new rq0(str4, str5);
                    rv4Var.o0(P);
                }
                a((rq0) P, w22Var, false, 480, jce.E(1113122853, new uc5(str6, 2), rv4Var), uue.e, nq7Var, null, rv4Var, ((i8 >> 6) & Token.ASSIGN_MOD) | 1794048 | ((i8 << 9) & 29360128) | ((i8 << 12) & 1879048192), 268);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
        } else {
            str4 = str2;
            str5 = str3;
            rv4Var2 = rv4Var;
            str6 = str;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ud1(str6, (Object) str4, (Object) str5, (Object) w22Var, nq7Var, i, 7);
        }
    }

    public static final void e(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2;
        rv4Var.g0(2065722846);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                P = "https://flagsapi.com/" + upperCase + "/flat/64.png";
                rv4Var.o0(P);
            }
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            a((String) P, null, false, null, null, null, nq7Var2, null, rv4Var2, 12582912, 894);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new o7(str, nq7Var2, i, 6);
        }
    }

    public static final void f(io5 io5Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        boolean h;
        int i4;
        io5Var.getClass();
        rv4Var.g0(972749801);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(io5Var);
            } else {
                h = rv4Var.h(io5Var);
            }
            if (h) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            pye.a(a.a(io5Var), tu1Var, rv4Var, i2 & Token.ASSIGN_MOD);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(io5Var, tu1Var, i, 11);
        }
    }
}
