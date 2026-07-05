package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uaf  reason: default package */
/* loaded from: classes.dex */
public abstract class uaf {
    public static o0f a;
    public static final tu1 b = new tu1(new kv1(24), false, 2057384248);
    public static final tu1 c = new tu1(new kv1(25), false, -501284613);

    public static final String A(ca7 ca7Var, rv4 rv4Var) {
        int i = ca7Var.c;
        String str = ca7Var.b;
        String str2 = ca7Var.d.b;
        switch (i) {
            case 100:
                rv4Var.e0(-896154845);
                String B = yqe.B((y3b) k2b.S.getValue(), new Object[]{str2, Integer.valueOf(ca7Var.d().size())}, rv4Var);
                rv4Var.q(false);
                return B;
            case 101:
                rv4Var.e0(-896149158);
                String B2 = yqe.B((y3b) k2b.Y.getValue(), new Object[]{str2}, rv4Var);
                rv4Var.q(false);
                return B2;
            case 102:
                rv4Var.e0(-896144498);
                String B3 = yqe.B((y3b) k2b.W.getValue(), new Object[]{str2, Integer.valueOf(Math.max(ca7Var.d().size(), 1))}, rv4Var);
                rv4Var.q(false);
                return B3;
            case Token.ASSIGN_BITAND /* 103 */:
                rv4Var.e0(-2010483615);
                String B4 = yqe.B((y3b) k2b.b0.getValue(), new Object[]{str2}, rv4Var);
                if (!k4b.j0(str)) {
                    B4 = eub.o(B4, ": ", str);
                }
                rv4Var.q(false);
                return B4;
            case Token.ASSIGN_LOGICAL_AND /* 104 */:
                rv4Var.e0(-896129735);
                String B5 = yqe.B((y3b) k2b.U.getValue(), new Object[]{str2}, rv4Var);
                rv4Var.q(false);
                return B5;
            default:
                rv4Var.e0(-896126254);
                String A = yqe.A((y3b) k2b.a0.getValue(), rv4Var);
                rv4Var.q(false);
                return A;
        }
    }

    public static final String B(long j) {
        StringBuilder sb = new StringBuilder();
        int i = qy5.c;
        sb.append((int) (j >> 32));
        sb.append('x');
        sb.append((int) (j & 4294967295L));
        return sb.toString();
    }

    public static Integer C(String str) {
        String str2;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            str2.getClass();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 115187:
                    if (str2.equals("tts")) {
                        return 5;
                    }
                    break;
                case 93166550:
                    if (str2.equals("audio")) {
                        return 3;
                    }
                    break;
                case 94843483:
                    if (str2.equals("comic")) {
                        return 2;
                    }
                    break;
                case 105010748:
                    if (str2.equals("novel")) {
                        return 1;
                    }
                    break;
                case 112202875:
                    if (str2.equals("video")) {
                        return 4;
                    }
                    break;
                case 1052832078:
                    if (str2.equals("translate")) {
                        return 6;
                    }
                    break;
            }
        }
        return null;
    }

    public static void D(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xk5.k(str.concat(" must not be null"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x020e, code lost:
        if (r0 == defpackage.ax1.a) goto L47;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r34, defpackage.nl5 r35, java.lang.String r36, java.lang.String r37, java.util.List r38, defpackage.nq7 r39, defpackage.vt4 r40, defpackage.rv4 r41, int r42) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaf.a(java.lang.String, nl5, java.lang.String, java.lang.String, java.util.List, nq7, vt4, rv4, int):void");
    }

    public static final void b(int i, int i2, int i3, rv4 rv4Var, nq7 nq7Var, String str) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        nq7 nq7Var2;
        boolean z2;
        long a2;
        rv4Var.g0(779294550);
        if (rv4Var.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i3 | i4;
        if (rv4Var.d(i)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i8 | i5;
        if (rv4Var.d(i2)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i10 = i9 | i6;
        if (rv4Var.f(nq7Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i11 = i10 | i7;
        boolean z3 = false;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            int i12 = i11 >> 3;
            nid f = gwe.f(rv4Var);
            r13 r13Var = (r13) rv4Var.j(dy1.h);
            boolean f2 = rv4Var.f(f);
            if ((((i12 & 14) ^ 6) > 4 && rv4Var.d(i)) || (i12 & 6) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | f2;
            if ((((i12 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.d(i2)) || (i12 & 48) == 32) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object P = rv4Var.P();
            if (z5 || P == ax1.a) {
                if (i != 0 && i2 != 0) {
                    float L0 = r13Var.L0(f.b) * 0.8f;
                    float f3 = i;
                    float m = dce.m(f3, r13Var.L0(100.0f), r13Var.L0(f.a) * 0.5f);
                    float f4 = i2;
                    float f5 = (f4 * m) / f3;
                    if (f5 > L0) {
                        m = (f3 * L0) / f4;
                    } else {
                        L0 = f5;
                    }
                    a2 = ote.a(r13Var.B0(m), r13Var.B0(L0));
                } else {
                    a2 = ote.a(100.0f, 100.0f);
                }
                Object ug3Var = new ug3(a2);
                rv4Var.o0(ug3Var);
                P = ug3Var;
            }
            nq7Var2 = nq7Var;
            do5.a(str, r0f.e, false, null, null, cwe.c, pna.o(((ug3) P).a, nq7Var2), null, rv4Var, (i11 & 14) | 1572912, 828);
        } else {
            nq7Var2 = nq7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ns1(i, i2, i3, nq7Var2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    public static final void c(boolean z, ba7 ba7Var, db7 db7Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? r3;
        lh9 lh9Var;
        db7 db7Var2;
        int i4;
        np npVar;
        db7 db7Var3;
        bzc bzcVar;
        zx1 zx1Var;
        kg kgVar;
        np npVar2;
        rv4 rv4Var2;
        ?? r5;
        boolean z6;
        boolean z7;
        lh9 lh9Var2;
        ba7 ba7Var2;
        boolean z8;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        xt4 xt4Var4 = xt4Var3;
        rv4 rv4Var3 = rv4Var;
        bzc bzcVar2 = ba7Var.e;
        rv4Var3.g0(-2122894065);
        if ((i & 6) == 0) {
            if (rv4Var3.g(z)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var3.f(ba7Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var3.d(db7Var.ordinal())) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var3.f(nq7Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (rv4Var3.h(xt4Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (rv4Var3.h(xt4Var2)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var3.h(vt4Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var3.h(xt4Var4)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((4793491 & i2) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var3.U(i2 & 1, z2)) {
            int i13 = i2 >> 9;
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var3, 0);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            nq7 p = lye.p(rv4Var3, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var2);
            } else {
                rv4Var3.r0();
            }
            np npVar3 = qw1.f;
            jce.F(npVar3, rv4Var3, a2);
            np npVar4 = qw1.e;
            jce.F(npVar4, rv4Var3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar5 = qw1.g;
            jce.F(npVar5, rv4Var3, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var3);
            np npVar6 = qw1.d;
            jce.F(npVar6, rv4Var3, p);
            kq7 kq7Var = kq7.a;
            nq7 s = pna.s(zbe.C(kq7Var, 6.0f, 6.0f, nae.e, nae.e, 12), 30.0f);
            int i14 = i2;
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var3.T);
            xt8 l2 = rv4Var3.l();
            nq7 p2 = lye.p(rv4Var3, s);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var2);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar3, rv4Var3, d);
            jce.F(npVar4, rv4Var3, l2);
            s21.t(hashCode2, rv4Var3, npVar5, rv4Var3, kgVar2);
            jce.F(npVar6, rv4Var3, p2);
            db7 db7Var4 = db7.d;
            lh9 lh9Var3 = ax1.a;
            db7 db7Var5 = db7.a;
            if (db7Var != db7Var5 && db7Var != db7Var4) {
                rv4Var3.e0(1165053769);
                rv4Var3.q(false);
                db7Var3 = db7Var4;
                bzcVar = bzcVar2;
                lh9Var = lh9Var3;
                db7Var2 = db7Var5;
                zx1Var = zx1Var2;
                kgVar = kgVar2;
                npVar = npVar5;
                npVar2 = npVar4;
                i4 = i13;
                r3 = 1;
                i3 = 29360128;
                rv4Var2 = rv4Var3;
                r5 = 0;
            } else {
                rv4Var3.e0(1164672252);
                String str = bzcVar2.c;
                u22 u22Var = r0f.d;
                i3 = 29360128;
                nq7 v = nmd.v(tte.k(pna.n(kq7Var, 30.0f), uu9.a), ((h27) rv4Var3.j(j27.a)).a.a, lre.g);
                if ((i14 & 29360128) == 8388608) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i14 & Token.ASSIGN_MOD) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z9 = z3 | z4;
                Object P = rv4Var3.P();
                if (!z9 && P != lh9Var3) {
                    z5 = false;
                } else {
                    z5 = false;
                    P = new oa7(xt4Var4, ba7Var, 0);
                    rv4Var3.o0(P);
                }
                nq7 t = q1d.t(1, (vt4) P, rv4Var3, v, z5);
                r3 = 1;
                lh9Var = lh9Var3;
                db7Var2 = db7Var5;
                i4 = i13;
                boolean z10 = z5;
                npVar = npVar5;
                db7Var3 = db7Var4;
                bzcVar = bzcVar2;
                zx1Var = zx1Var2;
                kgVar = kgVar2;
                npVar2 = npVar4;
                do5.a(str, u22Var, false, null, null, null, t, null, rv4Var3, 48, 892);
                rv4Var2 = rv4Var3;
                rv4Var2.q(z10);
                r5 = z10;
            }
            rv4Var2.q(r3);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, r5);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar3, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar, rv4Var2, kgVar);
            jce.F(npVar6, rv4Var2, p3);
            if (db7Var != db7Var2 && db7Var != db7Var3) {
                rv4Var2.e0(1354722105);
                rv4Var2.q(r5);
                ba7Var2 = ba7Var;
                xt4Var4 = xt4Var3;
                lh9Var2 = lh9Var;
            } else {
                rv4Var2.e0(1354420351);
                nq7 A = zbe.A(zbe.C(pna.f(kq7Var, 1.0f), nae.e, 6.0f, nae.e, nae.e, 13), 6.0f, nae.e, 2);
                if ((i14 & i3) == 8388608) {
                    z6 = r3;
                } else {
                    z6 = r5;
                }
                if ((i14 & Token.ASSIGN_MOD) == 32) {
                    z7 = r3;
                } else {
                    z7 = r5;
                }
                boolean z11 = z7 | z6;
                Object P2 = rv4Var2.P();
                if (!z11) {
                    lh9Var2 = lh9Var;
                    if (P2 != lh9Var2) {
                        ba7Var2 = ba7Var;
                        xt4Var4 = xt4Var3;
                        s(bzcVar, A, (vt4) P2, rv4Var2, 56);
                        rv4Var2.q(r5);
                    }
                } else {
                    lh9Var2 = lh9Var;
                }
                ba7Var2 = ba7Var;
                xt4Var4 = xt4Var3;
                P2 = new oa7(xt4Var4, ba7Var2, r3);
                rv4Var2.o0(P2);
                s(bzcVar, A, (vt4) P2, rv4Var2, 56);
                rv4Var2.q(r5);
            }
            if ((i14 & 896) == 256) {
                z8 = r3;
            } else {
                z8 = r5;
            }
            Object P3 = rv4Var2.P();
            if (z8 || P3 == lh9Var2) {
                int ordinal = db7Var.ordinal();
                float f3 = 2.0f;
                if (ordinal != 0 && ordinal != 3) {
                    f = 2.0f;
                } else {
                    f = 8.0f;
                }
                int ordinal2 = db7Var.ordinal();
                if (ordinal2 == 2 || ordinal2 == 3) {
                    f3 = 8.0f;
                }
                P3 = bue.b(f, 8.0f, 8.0f, f3);
                rv4Var2.o0(P3);
            }
            ba7 ba7Var3 = ba7Var2;
            boolean z12 = r3;
            rv4Var3 = rv4Var2;
            k(z, true, pna.f(kq7Var, 1.0f), vt4Var, jce.E(1313065432, new pa7(ba7Var3, xt4Var, xt4Var2, (v72) P3, db7Var, 0), rv4Var2), rv4Var3, (i14 & 14) | 25008 | (i4 & 7168));
            rv4Var3.q(z12);
            rv4Var3.q(z12);
        } else {
            rv4Var3.X();
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new c01(z, ba7Var, db7Var, nq7Var, xt4Var, xt4Var2, vt4Var, xt4Var4, i, 4);
        }
    }

    public static final void d(ba7 ba7Var, boolean z, db7 db7Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(-508542482);
        if ((i & 6) == 0) {
            if (rv4Var.f(ba7Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        boolean z3 = false;
        if ((i & 384) == 0) {
            if (rv4Var.g(false)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.d(db7Var.ordinal())) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            if ((i2 & 7168) == 2048) {
                z3 = true;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                int ordinal = db7Var.ordinal();
                float f2 = 2.0f;
                if (ordinal != 0 && ordinal != 3) {
                    f = 2.0f;
                } else {
                    f = 8.0f;
                }
                int ordinal2 = db7Var.ordinal();
                if (ordinal2 == 2 || ordinal2 == 3) {
                    f2 = 8.0f;
                }
                P = bue.b(8.0f, f, f2, 8.0f);
                rv4Var.o0(P);
            }
            k(true, false, pna.f(kq7.a, 1.0f), vt4Var, jce.E(-50513507, new fs1(nq7Var, z, (v72) P, db7Var, ba7Var, xt4Var, xt4Var2, 2), rv4Var), rv4Var, ((i2 >> 12) & 7168) | 25014);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg1(ba7Var, z, db7Var, nq7Var, xt4Var, xt4Var2, vt4Var, i, 5);
        }
    }

    public static final long e(int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = qy5.c;
        return j;
    }

    public static final void f(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(1089948172);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var, 0);
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var = kq7.a;
            dpe.g(pna.n(kq7Var, 30.0f), uu9.a, rv4Var, 6, 0);
            nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 6.0f, nae.e, 2);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, A);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            dpe.g(pna.p(kq7Var, 100.0f, 16.0f), null, rv4Var, 6, 2);
            nq7 f = hl5.f(kq7Var, 4.0f, rv4Var, kq7Var, 1.0f);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            dpe.g(pna.h(pna.f(kq7Var, 0.5f), 50.0f), bue.b(8.0f, 8.0f, 8.0f, 2.0f), rv4Var, 54, 0);
            dpe.g(pna.h(hl5.f(kq7Var, 2.0f, rv4Var, kq7Var, 0.6f), 80.0f), bue.b(2.0f, 8.0f, 8.0f, 2.0f), rv4Var, 54, 0);
            dpe.g(pna.h(hl5.f(kq7Var, 2.0f, rv4Var, kq7Var, 0.4f), 40.0f), bue.b(2.0f, 8.0f, 8.0f, 8.0f), rv4Var, 54, 0);
            hl5.v(rv4Var, true, true, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 13);
        }
    }

    public static final void g(boolean z, ff1 ff1Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        nq7 nq7Var2 = nq7Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-857840211);
        if (rv4Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var2.f(ff1Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var2.f(nq7Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var2.h(xt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if (rv4Var2.h(xt4Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i15 & 1, z2)) {
            fa7 fa7Var = ff1Var.a;
            boolean z3 = ff1Var.b;
            if (fa7Var instanceof da7) {
                rv4Var2.e0(-861991183);
                if (z3) {
                    rv4Var2.e0(-861974443);
                    o((da7) fa7Var, ff1Var.c, ff1Var.d, nq7Var2, xt4Var, xt4Var2, vt4Var, rv4Var2, (i15 << 6) & 33546240);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(-861524447);
                    int i16 = i15 & 14;
                    int i17 = i15 << 3;
                    n(z, (da7) fa7Var, ff1Var.d, nq7Var, xt4Var, xt4Var2, vt4Var, xt4Var3, rv4Var2, (i17 & 29360128) | i16 | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016));
                    rv4Var2 = rv4Var2;
                    rv4Var2.q(false);
                }
                rv4Var2.q(false);
                nq7Var2 = nq7Var;
            } else if (fa7Var instanceof ba7) {
                rv4Var2.e0(-861036817);
                if (z3) {
                    rv4Var2.e0(-861003244);
                    nq7Var2 = nq7Var;
                    d((ba7) fa7Var, ff1Var.c, ff1Var.d, nq7Var2, xt4Var, xt4Var2, vt4Var, rv4Var2, (i15 << 6) & 33546240);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(-860569120);
                    int i18 = i15 & 14;
                    int i19 = i15 << 3;
                    nq7Var2 = nq7Var;
                    c(z, (ba7) fa7Var, ff1Var.d, nq7Var2, xt4Var, xt4Var2, vt4Var, xt4Var3, rv4Var2, i18 | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128));
                    rv4Var2 = rv4Var2;
                    rv4Var2.q(false);
                }
                rv4Var2.q(false);
            } else {
                nq7Var2 = nq7Var;
                if (fa7Var instanceof ca7) {
                    rv4Var2.e0(-860102508);
                    dye.a(jce.E(-395205444, new sv4(11, ff1Var, nq7Var2), rv4Var2), rv4Var2, 6);
                    rv4Var2.q(false);
                } else {
                    throw rs8.b(249288109, rv4Var2, false);
                }
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new xa4(z, ff1Var, nq7Var2, xt4Var, xt4Var2, vt4Var, xt4Var3, i);
        }
    }

    public static final void h(final boolean z, final List list, final boolean z2, final bkd bkdVar, final kj6 kj6Var, final nq7 nq7Var, final vt4 vt4Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, rv4 rv4Var, final int i) {
        int i2;
        vt4 vt4Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean h;
        int i11;
        int i12;
        rv4 rv4Var2 = rv4Var;
        list.getClass();
        vt4Var.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        rv4Var2.g0(-2067791181);
        if ((i & 6) == 0) {
            if (rv4Var2.g(z)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.g(z2)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(bkdVar)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.f(kj6Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            vt4Var2 = vt4Var;
            if (rv4Var2.h(vt4Var2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        } else {
            vt4Var2 = vt4Var;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        boolean z9 = true;
        if ((i2 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i2 & 1, z3)) {
            rv4Var2.Z();
            if ((i & 1) != 0 && !rv4Var2.B()) {
                rv4Var2.X();
            }
            rv4Var2.r();
            int i13 = i2;
            ej6.c(kj6Var, 0, vt4Var2, rv4Var2, (i2 >> 12) & 910, 2);
            p59 t = lbe.t(rv4Var2);
            boolean f = rv4Var2.f(t);
            Object P = rv4Var2.P();
            Object obj = ax1.a;
            if (f || P == obj) {
                P = new ma7(t, 0);
                rv4Var2.o0(P);
            }
            xt4 xt4Var4 = (xt4) P;
            if ((i13 & Token.ASSIGN_MOD) != 32 && ((i13 & 64) == 0 || !rv4Var2.h(list))) {
                z4 = false;
            } else {
                z4 = true;
            }
            if ((i13 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean f2 = z4 | z5 | rv4Var2.f(xt4Var4);
            if ((29360128 & i13) == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = f2 | z6;
            if ((234881024 & i13) == 67108864) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11 = z10 | z7;
            if ((1879048192 & i13) == 536870912) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z12 = z11 | z8;
            if ((i13 & 896) != 256) {
                z9 = false;
            }
            boolean z13 = z12 | z9;
            Object P2 = rv4Var2.P();
            if (z13 || P2 == obj) {
                w32 w32Var = new w32(list, z2, z, xt4Var4, xt4Var, xt4Var2, xt4Var3);
                rv4Var2.o0(w32Var);
                P2 = w32Var;
            }
            jce.d(nq7Var, kj6Var, bkdVar, true, null, null, null, false, null, (xt4) P2, rv4Var2, ((i13 >> 15) & 14) | 3072 | ((i13 >> 9) & Token.ASSIGN_MOD) | ((i13 >> 3) & 896), 496);
            rv4Var2 = rv4Var2;
            lbe.a(t, rv4Var2, 0);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: ta7
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    uaf.h(z, list, z2, bkdVar, kj6Var, nq7Var, vt4Var, xt4Var, xt4Var2, xt4Var3, (rv4) obj2, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(ov7 ov7Var, jn6 jn6Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        ov7Var.getClass();
        rv4Var.g0(-1762804606);
        if (rv4Var.f(ov7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 48;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            jn6Var = jn6.ON_RESUME;
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new st1(1, jn6Var, ov7Var);
                rv4Var.o0(P);
            }
            rn6 rn6Var = (rn6) P;
            xn6 k = ((un6) rv4Var.j(nu6.a)).k();
            boolean h = rv4Var.h(k) | rv4Var.h(rn6Var);
            Object P2 = rv4Var.P();
            if (h || P2 == lh9Var) {
                P2 = new fl7(23, k, rn6Var);
                rv4Var.o0(P2);
            }
            yte.c(k, rn6Var, (xt4) P2, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new f58(ov7Var, jn6Var, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x025c, code lost:
        if (r1 == r0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.fa7 r35, defpackage.nq7 r36, defpackage.xt4 r37, defpackage.xt4 r38, defpackage.rv4 r39, int r40) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaf.j(fa7, nq7, xt4, xt4, rv4, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0244, code lost:
        if (r15 == r14) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final boolean r47, final boolean r48, final defpackage.nq7 r49, final defpackage.vt4 r50, defpackage.tu1 r51, defpackage.rv4 r52, final int r53) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaf.k(boolean, boolean, nq7, vt4, tu1, rv4, int):void");
    }

    public static final void l(ca7 ca7Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1355864988);
        if (rv4Var2.f(ca7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            String A = A(ca7Var, rv4Var2);
            nq7 z2 = zbe.z(nq7Var, 12.0f, 6.0f);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            tza tzaVar = j27.a;
            cvb.c(A, zbe.z(nmd.v(tte.k(pu0.a.a(kq7.a, kh5.e), uu9.a), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 2.0f), lre.g), 12.0f, 6.0f), ((h27) rv4Var2.j(tzaVar)).a.s, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var, 0, 0, 130040);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new sv4(ca7Var, nq7Var, i, 10);
        }
    }

    public static final void m(ps psVar, oyb oybVar, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(-1685278049);
        if ((i & 6) == 0) {
            if (rv4Var.f(psVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(oybVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            dye.b(null, jce.E(-73997284, new i31(psVar, oybVar, nq7Var, xt4Var), rv4Var), rv4Var, 48, 1);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(psVar, oybVar, nq7Var, xt4Var, i, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    public static final void n(boolean z, final da7 da7Var, db7 db7Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        final ?? r3;
        lh9 lh9Var;
        db7 db7Var2;
        int i4;
        np npVar;
        bzc bzcVar;
        db7 db7Var3;
        zx1 zx1Var;
        kg kgVar;
        np npVar2;
        rv4 rv4Var2;
        ?? r5;
        boolean z6;
        boolean z7;
        lh9 lh9Var2;
        final da7 da7Var2;
        boolean z8;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final xt4 xt4Var4 = xt4Var3;
        rv4 rv4Var3 = rv4Var;
        bzc bzcVar2 = da7Var.c;
        rv4Var3.g0(-1597655061);
        if ((i & 6) == 0) {
            if (rv4Var3.g(z)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var3.f(da7Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var3.d(db7Var.ordinal())) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var3.f(nq7Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (rv4Var3.h(xt4Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (rv4Var3.h(xt4Var2)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var3.h(vt4Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var3.h(xt4Var4)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((4793491 & i2) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var3.U(i2 & 1, z2)) {
            int i13 = i2 >> 9;
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var3, 0);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            nq7 p = lye.p(rv4Var3, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var2);
            } else {
                rv4Var3.r0();
            }
            np npVar3 = qw1.f;
            jce.F(npVar3, rv4Var3, a2);
            np npVar4 = qw1.e;
            jce.F(npVar4, rv4Var3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar5 = qw1.g;
            jce.F(npVar5, rv4Var3, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var3);
            np npVar6 = qw1.d;
            jce.F(npVar6, rv4Var3, p);
            kq7 kq7Var = kq7.a;
            nq7 s = pna.s(zbe.C(kq7Var, 6.0f, 6.0f, nae.e, nae.e, 12), 30.0f);
            int i14 = i2;
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var3.T);
            xt8 l2 = rv4Var3.l();
            nq7 p2 = lye.p(rv4Var3, s);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var2);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar3, rv4Var3, d);
            jce.F(npVar4, rv4Var3, l2);
            s21.t(hashCode2, rv4Var3, npVar5, rv4Var3, kgVar2);
            jce.F(npVar6, rv4Var3, p2);
            db7 db7Var4 = db7.d;
            lh9 lh9Var3 = ax1.a;
            db7 db7Var5 = db7.a;
            if (db7Var != db7Var5 && db7Var != db7Var4) {
                rv4Var3.e0(-1496159123);
                rv4Var3.q(false);
                bzcVar = bzcVar2;
                db7Var3 = db7Var4;
                lh9Var = lh9Var3;
                db7Var2 = db7Var5;
                zx1Var = zx1Var2;
                kgVar = kgVar2;
                npVar = npVar5;
                npVar2 = npVar4;
                i4 = i13;
                r3 = 1;
                i3 = 29360128;
                rv4Var2 = rv4Var3;
                r5 = 0;
            } else {
                rv4Var3.e0(-1496540640);
                String str = bzcVar2.c;
                u22 u22Var = r0f.d;
                i3 = 29360128;
                nq7 v = nmd.v(tte.k(pna.n(kq7Var, 30.0f), uu9.a), ((h27) rv4Var3.j(j27.a)).a.a, lre.g);
                if ((i14 & 29360128) == 8388608) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i14 & Token.ASSIGN_MOD) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z9 = z3 | z4;
                Object P = rv4Var3.P();
                if (!z9 && P != lh9Var3) {
                    z5 = false;
                } else {
                    z5 = false;
                    P = new vt4() { // from class: va7
                        @Override // defpackage.vt4
                        public final Object invoke() {
                            int i15 = r3;
                            pvc pvcVar = pvc.a;
                            da7 da7Var3 = da7Var;
                            xt4 xt4Var5 = xt4Var4;
                            switch (i15) {
                                case 0:
                                    xt4Var5.invoke(da7Var3.c);
                                    return pvcVar;
                                default:
                                    xt4Var5.invoke(da7Var3.c);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var3.o0(P);
                }
                nq7 t = q1d.t(1, (vt4) P, rv4Var3, v, z5);
                r3 = 1;
                lh9Var = lh9Var3;
                db7Var2 = db7Var5;
                i4 = i13;
                boolean z10 = z5;
                npVar = npVar5;
                bzcVar = bzcVar2;
                db7Var3 = db7Var4;
                zx1Var = zx1Var2;
                kgVar = kgVar2;
                npVar2 = npVar4;
                do5.a(str, u22Var, false, null, null, null, t, null, rv4Var3, 48, 892);
                rv4Var2 = rv4Var3;
                rv4Var2.q(z10);
                r5 = z10;
            }
            rv4Var2.q(r3);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, r5);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar3, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar, rv4Var2, kgVar);
            jce.F(npVar6, rv4Var2, p3);
            if (db7Var != db7Var2 && db7Var != db7Var3) {
                rv4Var2.e0(-159732643);
                rv4Var2.q(r5);
                da7Var2 = da7Var;
                xt4Var4 = xt4Var3;
                lh9Var2 = lh9Var;
            } else {
                rv4Var2.e0(-160034397);
                nq7 A = zbe.A(zbe.C(pna.f(kq7Var, 1.0f), nae.e, 6.0f, nae.e, nae.e, 13), 6.0f, nae.e, 2);
                if ((i14 & i3) == 8388608) {
                    z6 = r3;
                } else {
                    z6 = r5;
                }
                if ((i14 & Token.ASSIGN_MOD) == 32) {
                    z7 = r3;
                } else {
                    z7 = r5;
                }
                boolean z11 = z7 | z6;
                Object P2 = rv4Var2.P();
                if (!z11) {
                    lh9Var2 = lh9Var;
                    if (P2 != lh9Var2) {
                        da7Var2 = da7Var;
                        xt4Var4 = xt4Var3;
                        s(bzcVar, A, (vt4) P2, rv4Var2, 56);
                        rv4Var2.q(r5);
                    }
                } else {
                    lh9Var2 = lh9Var;
                }
                da7Var2 = da7Var;
                xt4Var4 = xt4Var3;
                P2 = new vt4() { // from class: va7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i15 = r3;
                        pvc pvcVar = pvc.a;
                        da7 da7Var3 = da7Var2;
                        xt4 xt4Var5 = xt4Var4;
                        switch (i15) {
                            case 0:
                                xt4Var5.invoke(da7Var3.c);
                                return pvcVar;
                            default:
                                xt4Var5.invoke(da7Var3.c);
                                return pvcVar;
                        }
                    }
                };
                rv4Var2.o0(P2);
                s(bzcVar, A, (vt4) P2, rv4Var2, 56);
                rv4Var2.q(r5);
            }
            if ((i14 & 896) == 256) {
                z8 = r3;
            } else {
                z8 = r5;
            }
            Object P3 = rv4Var2.P();
            if (z8 || P3 == lh9Var2) {
                int ordinal = db7Var.ordinal();
                float f3 = 2.0f;
                if (ordinal != 0 && ordinal != 3) {
                    f = 2.0f;
                } else {
                    f = 8.0f;
                }
                int ordinal2 = db7Var.ordinal();
                if (ordinal2 == 2 || ordinal2 == 3) {
                    f3 = 8.0f;
                }
                P3 = bue.b(f, 8.0f, 8.0f, f3);
                rv4Var2.o0(P3);
            }
            da7 da7Var3 = da7Var2;
            boolean z12 = r3;
            rv4Var3 = rv4Var2;
            k(z, true, pna.f(kq7Var, 1.0f), vt4Var, jce.E(202566388, new na7((v72) P3, da7Var3, xt4Var, xt4Var2, db7Var, 0), rv4Var2), rv4Var3, (i14 & 14) | 25008 | (i4 & 7168));
            rv4Var3.q(z12);
            rv4Var3.q(z12);
        } else {
            rv4Var3.X();
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new c01(z, da7Var, db7Var, nq7Var, xt4Var, xt4Var2, vt4Var, xt4Var4, i, 3);
        }
    }

    public static final void o(da7 da7Var, boolean z, db7 db7Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(-634081406);
        if ((i & 6) == 0) {
            if (rv4Var.f(da7Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        boolean z3 = false;
        if ((i & 384) == 0) {
            if (rv4Var.g(false)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.d(db7Var.ordinal())) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            if ((i2 & 7168) == 2048) {
                z3 = true;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                int ordinal = db7Var.ordinal();
                float f2 = 2.0f;
                if (ordinal != 0 && ordinal != 3) {
                    f = 2.0f;
                } else {
                    f = 8.0f;
                }
                int ordinal2 = db7Var.ordinal();
                if (ordinal2 == 2 || ordinal2 == 3) {
                    f2 = 8.0f;
                }
                P = bue.b(8.0f, f, f2, 8.0f);
                rv4Var.o0(P);
            }
            k(true, false, pna.f(kq7.a, 1.0f), vt4Var, jce.E(778684145, new fs1(nq7Var, z, (v72) P, da7Var, xt4Var, xt4Var2, db7Var, 3), rv4Var), rv4Var, ((i2 >> 12) & 7168) | 25014);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg1(da7Var, z, db7Var, nq7Var, xt4Var, xt4Var2, vt4Var, i, 6);
        }
    }

    public static final void p(long j, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        lu4 ya7Var;
        aw7 aw7Var;
        String str;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-364668381);
        if (rv4Var2.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = yae.z("");
                rv4Var2.o0(P2);
            }
            aw7 aw7Var3 = (aw7) P2;
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                P3 = yae.z(zj1.f(j, "HH:mm EEE dd/MM"));
                rv4Var2.o0(P3);
            }
            aw7 aw7Var4 = (aw7) P3;
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P4 = rv4Var2.P();
            if (!z2 && P4 != lh9Var) {
                ya7Var = P4;
                aw7Var = aw7Var3;
            } else {
                aw7Var = aw7Var3;
                ya7Var = new ya7(j, aw7Var, null, 0);
                rv4Var2.o0(ya7Var);
            }
            yte.g(ya7Var, rv4Var2, pvc.a);
            Boolean bool = (Boolean) aw7Var2.getValue();
            bool.booleanValue();
            Object P5 = rv4Var2.P();
            if (P5 == lh9Var) {
                P5 = new as2(aw7Var2, null, 2);
                rv4Var2.o0(P5);
            }
            yte.g((lu4) P5, rv4Var2, bool);
            b37 d = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var2, d);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            if (((Boolean) aw7Var2.getValue()).booleanValue()) {
                str = (String) aw7Var4.getValue();
            } else {
                str = (String) aw7Var.getValue();
            }
            tza tzaVar = j27.a;
            long j2 = ((h27) rv4Var2.j(tzaVar)).a.q;
            nq7 z3 = zbe.z(nmd.v(tte.k(pu0.a.a(kq7.a, kh5.e), uu9.a), zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar)).a.q), lre.g), 12.0f, 4.0f);
            Object P6 = rv4Var2.P();
            if (P6 == lh9Var) {
                P6 = new ea4(aw7Var2, 28);
                rv4Var2.o0(P6);
            }
            cvb.c(str, q1d.t(1, (vt4) P6, rv4Var2, z3, false), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.o, rv4Var, 0, 0, 131064);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qh(j, nq7Var, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x075e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final defpackage.qzc r50, defpackage.rh8 r51, defpackage.nq7 r52, defpackage.nu4 r53, defpackage.lu4 r54, defpackage.xt4 r55, defpackage.vt4 r56, defpackage.rv4 r57, int r58) {
        /*
            Method dump skipped, instructions count: 2052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaf.q(qzc, rh8, nq7, nu4, lu4, xt4, vt4, rv4, int):void");
    }

    public static final void r(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(1054852708);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = true;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                szc szcVar = (szc) ((fdd) voe.z(cm9.a(szc.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(szcVar.d, rv4Var);
                kb kbVar = (kb) rv4Var.j(yb.a);
                s02 s02Var = szcVar.e;
                boolean f = rv4Var.f(kbVar);
                if ((i3 & 14) != 4) {
                    z2 = false;
                }
                boolean z4 = f | z2;
                Object P = rv4Var.P();
                if (z4 || P == ax1.a) {
                    P = new we1(kbVar, cz7Var, (m42) null, 15);
                    rv4Var.o0(P);
                }
                jye.b(s02Var, null, (mu4) P, rv4Var, 0);
                rv4Var2 = rv4Var;
                fxe.j(yqe.A((y3b) v1b.a.getValue(), rv4Var), null, jce.E(-915445259, new ebc(cz7Var, 6), rv4Var), null, jce.E(-1500142873, new u32(8, szcVar, z3), rv4Var), rv4Var2, 199680, 22);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ebc(cz7Var, i, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r4 == defpackage.ax1.a) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(defpackage.bzc r23, defpackage.nq7 r24, defpackage.vt4 r25, defpackage.rv4 r26, int r27) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaf.s(bzc, nq7, vt4, rv4, int):void");
    }

    public static final long t(boolean z, long j, float f, float f2, long j2) {
        float intBitsToFloat;
        float intBitsToFloat2;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            return 0L;
        }
        if (z) {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (sxd.j(j) >> 32));
            float f3 = (1.0f / f2) - (1.0f / f);
            intBitsToFloat = intBitsToFloat3 * f3;
            intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f3;
        } else {
            float f4 = (1.0f / f2) - (1.0f / f);
            intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f4;
            intBitsToFloat2 = (Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (sxd.j(j) & 4294967295L))) * f4;
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ox1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ox1] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [ey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kk9] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [ey] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5, types: [w26] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [tba, m42, n42] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.jac r19, android.content.Context r20, defpackage.ey r21, defpackage.iac r22, defpackage.rba r23, defpackage.n42 r24) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaf.u(jac, android.content.Context, ey, iac, rba, n42):java.lang.Object");
    }

    public static final nq7 v(nq7 nq7Var, bzc bzcVar, wea weaVar, rv4 rv4Var) {
        long j;
        List<String> list = bzcVar.f;
        boolean f = rv4Var.f(list);
        Object P = rv4Var.P();
        Object obj = ax1.a;
        Object obj2 = P;
        if (f || P == obj) {
            ArrayList arrayList = new ArrayList(tl1.s(list, 10));
            for (String str : list) {
                arrayList.add(new zl1(zl1.b(0.6f, kve.v(str))));
            }
            rv4Var.o0(arrayList);
            obj2 = arrayList;
        }
        List list2 = (List) obj2;
        Object obj3 = (r13) rv4Var.j(dy1.h);
        tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
        if (list2.size() > 1) {
            rv4Var.e0(-859795397);
            Object y = y(rv4Var);
            boolean h = rv4Var.h(list2) | rv4Var.f(y) | rv4Var.f(weaVar) | rv4Var.d(tc6Var.ordinal()) | rv4Var.f(obj3);
            Object P2 = rv4Var.P();
            if (h || P2 == obj) {
                Object p6Var = new p6(list2, weaVar, tc6Var, obj3, y, 12);
                rv4Var.o0(p6Var);
                P2 = p6Var;
            }
            nq7 s = ote.s(nq7Var, (xt4) P2);
            rv4Var.q(false);
            return s;
        }
        rv4Var.e0(-858383905);
        zl1 zl1Var = (zl1) sl1.e0(list2);
        if (zl1Var == null) {
            rv4Var.e0(-1690253803);
            j = rm1.g(((h27) rv4Var.j(j27.a)).a, 10.0f);
            rv4Var.q(false);
        } else {
            rv4Var.e0(-1690255849);
            rv4Var.q(false);
            j = zl1Var.a;
        }
        nq7 d = st0.d(nq7Var, 1.0f, j, weaVar);
        rv4Var.q(false);
        return d;
    }

    public static void w(tj3 tj3Var, float f) {
        tj3Var.getClass();
        if (Build.VERSION.SDK_INT < 31 || f <= nae.e) {
            return;
        }
        if (tj3Var.f != null && f > tj3Var.e) {
            tj3Var.e = f;
        }
        tj3Var.f = new tn0(tj3Var.f, f, f, 0);
    }

    public static final nq7 x(nq7 nq7Var, qh6 qh6Var) {
        return nq7Var.a0(new eb3(qh6Var));
    }

    public static final yu5 y(rv4 rv4Var) {
        return qye.i(qye.n(1, rv4Var), nae.e, 1.0f, tte.q(tte.x(4000, 0, on3.d, 2), yo9.a, 0L, 4), rv4Var, 4536, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.oyb z(defpackage.oyb r28, defpackage.tc6 r29) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaf.z(oyb, tc6):oyb");
    }
}
