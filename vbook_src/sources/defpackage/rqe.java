package defpackage;

import android.content.Context;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rqe  reason: default package */
/* loaded from: classes.dex */
public abstract class rqe {
    public static final tu1 a = new tu1(new c8(25, (byte) 0), false, -1109857292);
    public static final tu1 b = new tu1(new c8(26, (byte) 0), false, 55829149);
    public static final tu1 c = new tu1(new c8(27, (byte) 0), false, -981287428);
    public static final tu1 d = new tu1(new c8(28, (byte) 0), false, 1350350892);
    public static final tu1 e = new tu1(new c8(29, (byte) 0), false, -32383403);
    public static final tu1 f = new tu1(new tx0(26), false, -1610309117);
    public static final tu1 g = new tu1(new cv1(0), false, 1223717120);
    public static final tu1 h = new tu1(new wu1(3), false, -596974779);
    public static final afa i = afa.a;
    public static final qm1 j = qm1.e;
    public static final qm1 k = qm1.E;
    public static final qm1 l = qm1.I;

    public static final w13 a(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        np4 a2 = op4.a(f2);
        if (a2 == null) {
            a2 = new uo6(f2);
        }
        return new w13(f3, f2, a2);
    }

    public static final void b(yf6 yf6Var, qo9 qo9Var, Object obj, nq7 nq7Var, boolean z, nq7 nq7Var2, tu1 tu1Var, rv4 rv4Var, int i2) {
        int i3;
        nq7 a2;
        kq7 kq7Var;
        int i4;
        boolean z2;
        nq7 nq7Var3;
        boolean z3;
        nq7 nq7Var4;
        nq7 nq7Var5;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        yf6Var.getClass();
        qo9Var.getClass();
        obj.getClass();
        rv4Var.g0(-952947733);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(yf6Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(qo9Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(obj)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        }
        int i9 = i3 | 27648;
        if ((196608 & i2) == 0) {
            i9 = 93184 | i3;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var.h(tu1Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i9 |= i5;
        }
        if ((599187 & i9) == 599186 && rv4Var.E()) {
            rv4Var.X();
            nq7Var4 = nq7Var;
            z2 = z;
            nq7Var5 = nq7Var2;
        } else {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i4 = i9 & (-458753);
                kq7Var = nq7Var;
                z2 = z;
                a2 = nq7Var2;
            } else {
                kq7 kq7Var2 = kq7.a;
                a2 = yf6.a(yf6Var, kq7Var2);
                kq7Var = kq7Var2;
                i4 = i9 & (-458753);
                z2 = true;
            }
            rv4Var.r();
            h23 q = yae.q(new hg(22, obj, qo9Var));
            boolean booleanValue = ((Boolean) q.getValue()).booleanValue();
            lh9 lh9Var = ax1.a;
            if (booleanValue) {
                rv4Var.e0(-16669332);
                tpd tpdVar = new tpd(1.0f);
                rv4Var.e0(-1663103542);
                if ((i4 & Token.ASSIGN_MOD) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object P = rv4Var.P();
                if (z4 || P == lh9Var) {
                    P = new oo9(qo9Var, 0);
                    rv4Var.o0(P);
                }
                rv4Var.q(false);
                nq7Var3 = axe.k(tpdVar, (xt4) P);
                rv4Var.q(false);
            } else if (obj.equals(qo9Var.s.getValue())) {
                rv4Var.e0(-16414264);
                tpd tpdVar2 = new tpd(1.0f);
                rv4Var.e0(-1663095314);
                if ((i4 & Token.ASSIGN_MOD) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object P2 = rv4Var.P();
                if (z3 || P2 == lh9Var) {
                    P2 = new oo9(qo9Var, 1);
                    rv4Var.o0(P2);
                }
                rv4Var.q(false);
                nq7Var3 = axe.k(tpdVar2, (xt4) P2);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-16142952);
                rv4Var.q(false);
                nq7Var3 = a2;
            }
            nqe.o(qo9Var, obj, kq7Var.a0(nq7Var3), z2, ((Boolean) q.getValue()).booleanValue(), tu1Var, rv4Var, (i4 >> 3) & 466046);
            nq7Var4 = kq7Var;
            nq7Var5 = a2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new no9(yf6Var, qo9Var, obj, nq7Var4, z2, nq7Var5, tu1Var, i2);
        }
    }

    public static final int c(long j2, long j3) {
        boolean l2 = l(j2);
        if (l2 != l(j3)) {
            if (!l2) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(j(j2) - j(j3));
        if (Math.min(j(j2), j(j3)) >= nae.e && k(j2) != k(j3)) {
            if (!k(j2)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    public static final String h(String str, Object... objArr) {
        str.getClass();
        Locale a2 = pv6.b().a(0);
        if (a2 == null) {
            a2 = Locale.getDefault();
        }
        a2.getClass();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(a2, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c8, code lost:
        r2 = r1[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d1, code lost:
        if (r2 > 100.01d) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d7, code lost:
        if (r1[1] > 100.01d) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01dd, code lost:
        if (r1[2] <= 100.01d) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e0, code lost:
        r1 = (defpackage.xbe.l(r1[2]) & 255) | ((((defpackage.xbe.l(r2) & 255) << 16) | (-16777216)) | ((defpackage.xbe.l(r1[1]) & 255) << 8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.i45 i(double r57, double r59, double r61) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqe.i(double, double, double):i45");
    }

    public static final float j(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final boolean k(long j2) {
        if ((j2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean l(long j2) {
        if ((j2 & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Type inference failed for: r5v3, types: [my0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.ta6 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.g2d
            if (r0 == 0) goto L13
            r0 = r5
            g2d r0 = (defpackage.g2d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            g2d r0 = new g2d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            my0 r4 = r0.b
            ta6 r0 = r0.a
            defpackage.hre.r(r5)     // Catch: java.lang.Throwable -> L2a
            goto L4d
        L2a:
            r4 = move-exception
            goto L56
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L32:
            defpackage.hre.r(r5)
            my0 r5 = new my0     // Catch: java.lang.Throwable -> L54
            r5.<init>()     // Catch: java.lang.Throwable -> L54
            r0.a = r4     // Catch: java.lang.Throwable -> L54
            r0.b = r5     // Catch: java.lang.Throwable -> L54
            r0.d = r2     // Catch: java.lang.Throwable -> L54
            s11 r1 = r4.a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = defpackage.fre.y(r1, r5, r0)     // Catch: java.lang.Throwable -> L54
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
            r4 = r5
        L4d:
            defpackage.dxe.r(r0, r3)
            return r4
        L51:
            r0 = r4
            r4 = r5
            goto L56
        L54:
            r5 = move-exception
            goto L51
        L56:
            throw r4     // Catch: java.lang.Throwable -> L57
        L57:
            r5 = move-exception
            defpackage.dxe.r(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqe.m(ta6, n42):java.lang.Object");
    }

    public static int n(ea1 ea1Var, int i2, int i3, int i4) {
        boolean z;
        if (Math.max(Math.max(i2, i3), i4) <= 31) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        n4f.m(n4f.m(i5, i6), 1 << i4);
        if (ea1Var.b() >= i2) {
            int g2 = ea1Var.g(i2);
            if (g2 == i5) {
                if (ea1Var.b() >= i3) {
                    int g3 = ea1Var.g(i3);
                    g2 += g3;
                    if (g3 == i6) {
                        if (ea1Var.b() < i4) {
                            return -1;
                        }
                        return ea1Var.g(i4) + g2;
                    }
                } else {
                    return -1;
                }
            }
            return g2;
        }
        return -1;
    }

    public static final qo9 o(qg6 qg6Var, rh8 rh8Var, nu4 nu4Var, rv4 rv4Var, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        qg6Var.getClass();
        nu4Var.getClass();
        rv4Var.e0(1209098259);
        rv4Var.e0(-1246997158);
        int i3 = i2 & 14;
        if (((i3 ^ 6) > 4 && rv4Var.f(qg6Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (z || P == obj) {
            P = new ik(qg6Var, 23);
            rv4Var.o0(P);
        }
        rv4Var.q(false);
        o3a n = p17.n(qg6Var, (vt4) P, rv4Var, i3);
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        float L0 = r13Var.L0(48.0f);
        Object P2 = rv4Var.P();
        if (P2 == obj) {
            Object ey1Var = new ey1(yte.s(rv4Var));
            rv4Var.o0(ey1Var);
            P2 = ey1Var;
        }
        m82 m82Var = ((ey1) P2).a;
        aw7 D = yae.D(nu4Var, rv4Var);
        tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
        d0 d0Var = new d0(r13Var.L0(zbe.o(rh8Var, tc6Var)), r13Var.L0(zbe.n(rh8Var, tc6Var)), r13Var.L0(rh8Var.d()), r13Var.L0(rh8Var.a()));
        rv4Var.e0(-1246964004);
        boolean f2 = rv4Var.f(m82Var);
        if ((((i2 & 14) ^ 6) > 4 && rv4Var.f(qg6Var)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = f2 | z2;
        if ((((i2 & 896) ^ 384) > 256 && rv4Var.c(48.0f)) || (i2 & 384) == 256) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z6 | z3;
        if ((((i2 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.f(rh8Var)) || (i2 & 48) == 32) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z8 = z4 | z7;
        if ((((i2 & 7168) ^ 3072) > 2048 && rv4Var.f(n)) || (i2 & 3072) == 2048) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z9 = z8 | z5;
        Object P3 = rv4Var.P();
        if (z9 || P3 == obj) {
            n.getClass();
            tc6Var.getClass();
            Object mo9Var = new mo9(new l97(qg6Var), m82Var, D, L0, d0Var, n, c2a.a, tc6Var, null, 768);
            rv4Var.o0(mo9Var);
            P3 = mo9Var;
        }
        qo9 qo9Var = (qo9) P3;
        rv4Var.q(false);
        rv4Var.q(false);
        return qo9Var;
    }

    public static void p(ea1 ea1Var) {
        ea1Var.o(3);
        ea1Var.o(8);
        boolean f2 = ea1Var.f();
        boolean f3 = ea1Var.f();
        if (f2) {
            ea1Var.o(5);
        }
        if (f3) {
            ea1Var.o(6);
        }
    }

    public static void q(ea1 ea1Var) {
        int i2;
        int g2;
        int g3 = ea1Var.g(2);
        int i3 = 6;
        if (g3 == 0) {
            ea1Var.o(6);
            return;
        }
        int i4 = 5;
        int n = n(ea1Var, 5, 8, 16) + 1;
        if (g3 == 1) {
            ea1Var.o(n * 7);
        } else if (g3 == 2) {
            boolean f2 = ea1Var.f();
            if (f2) {
                i2 = 1;
            } else {
                i2 = 5;
            }
            if (f2) {
                i4 = 7;
            }
            if (f2) {
                i3 = 8;
            }
            int i5 = 0;
            while (i5 < n) {
                if (ea1Var.f()) {
                    ea1Var.o(7);
                    g2 = 0;
                } else {
                    if (ea1Var.g(2) == 3 && ea1Var.g(i4) * i2 != 0) {
                        ea1Var.n();
                    }
                    g2 = ea1Var.g(i3) * i2;
                    if (g2 != 0 && g2 != 180) {
                        ea1Var.n();
                    }
                    ea1Var.n();
                }
                if (g2 != 0 && g2 != 180 && ea1Var.f()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    public static final int r(fj6 fj6Var) {
        List list = fj6Var.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((gj6) list.get(i3)).q;
        }
        return (i2 / list.size()) + fj6Var.r;
    }

    public static BigDecimal s(String str) {
        t(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void t(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        throw new NumberFormatException(nk2.v(new StringBuilder(substring.length() + 28), "Number string too large: ", substring, "..."));
    }

    public abstract int d(StringBuilder sb, byte[] bArr, int i2);

    public abstract void e(b50 b50Var, String str, int i2);

    public abstract int f(int i2);

    public abstract int g(int i2);
}
