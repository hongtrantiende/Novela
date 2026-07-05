package defpackage;

import android.content.Context;
import android.util.TypedValue;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cbe  reason: default package */
/* loaded from: classes.dex */
public abstract class cbe {
    public static final byte[] a = {-48, -49, 17, -32, -95, -79, 26, -31};
    public static final tu1 b = new tu1(new pv1(29), false, -728973153);
    public static final tu1 c = new tu1(new sv1(0), false, 1096018555);
    public static final tu1 d = new tu1(new sv1(1), false, 971362596);

    public static final void A(byte b2, long j) {
        switch (b2) {
            case 24:
                if (j >= 24) {
                    return;
                }
                throw new IOException(nk2.t(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
            case 25:
                if (j < 256) {
                    throw new IOException(nk2.t(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new IOException(nk2.t(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new IOException(nk2.t(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static final void a(vl6 vl6Var, go0 go0Var, boolean z, boolean z2, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        go0 go0Var2;
        kq7 kq7Var;
        float f;
        zx1 zx1Var;
        String str;
        float f2;
        boolean z4;
        xt4 xt4Var2 = xt4Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1215635491);
        if (rv4Var2.f(vl6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var2.f(go0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var2.g(z)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var2.g(z2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5 | 24576;
        if (rv4Var2.h(xt4Var2)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i12 = i11 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i13 = i12 | i7;
        if ((599187 & i13) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i13 & 1, z3)) {
            lk0 lk0Var = kh5.J;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            kq7 kq7Var2 = kq7.a;
            nq7 p = lye.p(rv4Var2, kq7Var2);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            nq7 k = tte.k(pna.f(kq7Var2, 1.0f), r0f.z(rv4Var2).c);
            int i14 = zl1.j;
            nq7 y = zbe.y(st0.d(k, 1.0f, zl1.f, r0f.z(rv4Var2).c), 8.0f);
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, y);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            String str2 = vl6Var.a;
            Map map = vl6Var.b;
            String str3 = (String) map.get("raw");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = vl6Var.d;
            String str5 = str3;
            String str6 = vl6Var.j;
            u22 u22Var = r0f.d;
            do5.c(str2, str5, str4, str6, u22Var, tte.k(pna.p(kq7Var2, 60.0f, 90.0f), r0f.z(rv4Var2).b), rv4Var2, 24576);
            xbe.i(rv4Var2, pna.s(kq7Var2, 8.0f));
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            we6 we6Var = new we6(f, true);
            lk0 lk0Var2 = kh5.I;
            xn1 a4 = wn1.a(ezVar, lk0Var2, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                zx1Var = zx1Var2;
                rv4Var2.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            String str7 = (String) map.get("raw");
            if (str7 == null) {
                str = "";
            } else {
                str = str7;
            }
            zx1 zx1Var3 = zx1Var;
            cvb.c(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).h, rv4Var, 0, 24960, 110590);
            xbe.i(rv4Var, pna.h(kq7Var2, 8.0f));
            cvb.c(vl6Var.j, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r0f.A(rv4Var).k, rv4Var, 0, 24960, 110590);
            xbe.i(rv4Var, hl5.e(rv4Var, true, true, kq7Var2, 8.0f));
            gv9 a5 = ev9.a(dzVar, kh5.F, rv4Var, 0);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, kq7Var2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a5);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            mfb mfbVar = jk3.e;
            nk5.a(rp5.c((wk3) mfbVar.getValue(), rv4Var, 0), null, pna.n(kq7Var2, 24.0f), r0f.y(rv4Var).a, rv4Var, 432, 0);
            xbe.i(rv4Var, pna.s(kq7Var2, 8.0f));
            nk5.a(rp5.c((wk3) mfbVar.getValue(), rv4Var, 0), null, pna.n(kq7Var2, 24.0f), r0f.y(rv4Var).a, rv4Var, 432, 0);
            rs8.u(rv4Var, true, kq7Var2, 8.0f, rv4Var);
            nq7 y2 = zbe.y(st0.d(tte.k(pna.f(kq7Var2, 1.0f), r0f.z(rv4Var).c), 1.0f, r0f.y(rv4Var).a, r0f.z(rv4Var).c), 8.0f);
            gv9 a6 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, y2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a6);
            jce.F(npVar2, rv4Var, l5);
            s21.t(hashCode5, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p5);
            do5.d(go0Var.a, go0Var.b, go0Var.c, u22Var, tte.k(pna.p(kq7Var2, 60.0f, 90.0f), r0f.z(rv4Var).b), rv4Var, 3072);
            xbe.i(rv4Var, pna.s(kq7Var2, 8.0f));
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            we6 we6Var2 = new we6(f2, true);
            xn1 a7 = wn1.a(ezVar, lk0Var2, rv4Var, 0);
            int hashCode6 = Long.hashCode(rv4Var.T);
            xt8 l6 = rv4Var.l();
            nq7 p6 = lye.p(rv4Var, we6Var2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a7);
            jce.F(npVar2, rv4Var, l6);
            s21.t(hashCode6, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p6);
            go0Var2 = go0Var;
            cvb.c(go0Var.a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var).h, rv4Var, 0, 24960, 110590);
            xbe.i(rv4Var, pna.h(kq7Var2, 8.0f));
            cvb.c(go0Var2.c, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r0f.A(rv4Var).k, rv4Var, 0, 24960, 110590);
            rv4Var.q(true);
            rv4Var.q(true);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            nq7 f3 = hl5.f(kq7Var2, 12.0f, rv4Var, kq7Var2, 1.0f);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new nd7(aw7Var, 16);
                rv4Var.o0(P2);
            }
            nq7 t = q1d.t(1, (vt4) P2, rv4Var, f3, false);
            gv9 a8 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode7 = Long.hashCode(rv4Var.T);
            xt8 l7 = rv4Var.l();
            nq7 p7 = lye.p(rv4Var, t);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a8);
            jce.F(npVar2, rv4Var, l7);
            s21.t(hashCode7, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p7);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new ig7(aw7Var, 21);
                rv4Var.o0(P3);
            }
            ase.b(booleanValue, (xt4) P3, null, false, null, rv4Var, 48);
            cvb.c(yqe.A((y3b) x2b.d0.getValue(), rv4Var), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).j, rv4Var, 0, 0, 131070);
            rs8.u(rv4Var, true, kq7Var2, 8.0f, rv4Var);
            if (z) {
                rv4Var.e0(-1316556270);
                eg0.f(pna.n(kq7Var2, 34.0f), r0f.y(rv4Var).a, null, rv4Var, 6, 4);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else if (z2) {
                rv4Var.e0(-1316343703);
                z1d.f(rp5.c((wk3) jk3.w.getValue(), rv4Var, 0), yqe.A((y3b) f2b.q0.getValue(), rv4Var), false, null, pna.f(kq7Var2, 1.0f), null, null, null, vt4Var, rv4Var, (234881024 & (i13 << 6)) | 24576, 236);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var.e0(-1316033176);
                ar5 c2 = rp5.c((wk3) jk3.c0.getValue(), rv4Var, 0);
                String A = yqe.A((y3b) v1b.v0.getValue(), rv4Var);
                nq7 f4 = pna.f(kq7Var2, 1.0f);
                if ((i13 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object P4 = rv4Var.P();
                if (!z4 && P4 != lh9Var) {
                    xt4Var2 = xt4Var;
                } else {
                    xt4Var2 = xt4Var;
                    P4 = new v90(8, xt4Var2, aw7Var);
                    rv4Var.o0(P4);
                }
                z1d.f(c2, A, false, null, f4, null, null, null, (vt4) P4, rv4Var, 24576, 236);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
                rv4Var2.q(true);
                kq7Var = kq7Var2;
            }
            xt4Var2 = xt4Var;
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            go0Var2 = go0Var;
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ih7(vl6Var, go0Var2, z, z2, kq7Var, xt4Var2, vt4Var, i);
        }
    }

    public static final void b(boolean z, gq0 gq0Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        gq0Var.getClass();
        boolean z5 = gq0Var.b;
        xt4Var.getClass();
        xt4Var2.getClass();
        vt4Var.getClass();
        rv4Var.g0(978635230);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(gq0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            boolean z6 = gq0Var.a;
            if (!z6 && !z5) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z6 && !z5) {
                z4 = true;
            } else {
                z4 = false;
            }
            xb.d(z, xt4Var, null, null, null, null, q0f.b, null, 0L, 0L, nae.e, z3, z4, jce.E(1562948786, new vg7(gq0Var, xt4Var2, vt4Var, 3), rv4Var), rv4Var, (i11 & 14) | 1572864 | ((i11 >> 3) & Token.ASSIGN_MOD), 1980);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new b62(z, gq0Var, xt4Var, xt4Var2, vt4Var, i);
        }
    }

    public static final void c(j48 j48Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        String str;
        y3b y3bVar;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1412439754);
        if (rv4Var2.h(j48Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).d);
            long g = rm1.g(r0f.y(rv4Var2), 2.0f);
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(lbe.f(15, vt4Var, nmd.v(k, g, ba5Var), null, false), 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            nq7 g2 = a82.g(rv4Var2, 8.0f, tte.k(pna.n(kq7Var, 40.0f), uu9.a), ba5Var);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, g2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            nk5.a(rp5.c((wk3) ok3.R.getValue(), rv4Var2, 0), null, zbe.y(kq7Var, 8.0f).a0(pna.c), 0L, rv4Var2, 432, 8);
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.n(kq7Var, 12.0f));
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            u48 u48Var = j48Var.c;
            if (u48Var instanceof s48) {
                rv4Var2.e0(360747622);
                s48 s48Var = (s48) u48Var;
                String str2 = s48Var.b;
                if (s48Var.c == 4) {
                    y3bVar = (y3b) x2b.w0.getValue();
                } else {
                    y3bVar = (y3b) x2b.x0.getValue();
                }
                str = str2 + " - " + yqe.B(y3bVar, new Object[]{Integer.valueOf(s48Var.d)}, rv4Var2);
                rv4Var2.q(false);
            } else if (u48Var instanceof r48) {
                rv4Var2.e0(11644719);
                rv4Var2.q(false);
                r48 r48Var = (r48) u48Var;
                String str3 = r48Var.b;
                String str4 = r48Var.a;
                if (!k4b.j0(str4)) {
                    str = k4b.N0(str4 + "\n" + str3).toString();
                } else {
                    str = str3;
                }
            } else if (u48Var instanceof t48) {
                rv4Var2.e0(11649975);
                rv4Var2.q(false);
                str = ((t48) u48Var).a;
            } else {
                throw rs8.b(11634601, rv4Var2, false);
            }
            cvb.c(str, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).k, rv4Var, 48, 24960, 110588);
            xbe.i(rv4Var, pna.h(kq7Var, 6.0f));
            tc4.l(j48Var.e, null, false, r0f.y(rv4Var).s, 0L, 0L, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).l, rv4Var, 0, 0, 131062);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            if (!j48Var.d) {
                rv4Var2.e0(-1098865655);
                ctd.a(0, 15, 0L, 0L, null, rv4Var, null);
                rv4Var2 = rv4Var;
                i4 = 0;
                rv4Var2.q(false);
            } else {
                i4 = 0;
                rv4Var2.e0(-1098835864);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            i4 = 0;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new f58(j48Var, vt4Var, i, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static final void d(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        lk0 lk0Var = kh5.I;
        rv4Var.g0(1292866130);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        ?? r7 = 0;
        boolean z2 = true;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            int i4 = 6;
            xn1 a2 = wn1.a(new hz(8.0f, true, new vs(2)), lk0Var, rv4Var, 6);
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
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            rv4Var.e0(-239958162);
            int i5 = 0;
            while (i5 < i4) {
                kq7 kq7Var = kq7.a;
                nq7 f = pna.f(kq7Var, 1.0f);
                tza tzaVar = j27.a;
                nq7 y = zbe.y(nmd.v(tte.k(f, ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 2.0f), lre.g), 12.0f);
                gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, r7);
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, y);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                np npVar = qw1.f;
                jce.F(npVar, rv4Var, a3);
                np npVar2 = qw1.e;
                jce.F(npVar2, rv4Var, l2);
                Integer valueOf = Integer.valueOf(hashCode2);
                np npVar3 = qw1.g;
                jce.F(npVar3, rv4Var, valueOf);
                kg kgVar = qw1.h;
                jce.C(kgVar, rv4Var);
                np npVar4 = qw1.d;
                jce.F(npVar4, rv4Var, p2);
                int i6 = i5;
                dpe.g(pna.n(kq7Var, 40.0f), uu9.a, rv4Var, i4, r7);
                xbe.i(rv4Var, pna.n(kq7Var, 12.0f));
                we6 we6Var = new we6(1.0f, true);
                xn1 a4 = wn1.a(lz.c, lk0Var, rv4Var, r7);
                int hashCode3 = Long.hashCode(rv4Var.T);
                xt8 l3 = rv4Var.l();
                nq7 p3 = lye.p(rv4Var, we6Var);
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, a4);
                jce.F(npVar2, rv4Var, l3);
                s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p3);
                dpe.g(pna.h(pna.f(kq7Var, 0.7f), 16.0f), null, rv4Var, 6, 2);
                dpe.g(pna.h(hl5.f(kq7Var, 10.0f, rv4Var, kq7Var, 0.3f), 12.0f), null, rv4Var, 6, 2);
                rv4Var.q(true);
                rv4Var.q(true);
                i5 = i6 + 1;
                i4 = 6;
                z2 = true;
                r7 = 0;
            }
            rv4Var.q(r7);
            rv4Var.q(z2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 22);
        }
    }

    public static final void e(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(1346618500);
        if (rv4Var.f(cz7Var)) {
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
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                t58 t58Var = (t58) ((fdd) voe.z(cm9.a(t58.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(t58Var.d, rv4Var);
                boolean f = rv4Var.f(t58Var);
                Object P = rv4Var.P();
                if (f || P == ax1.a) {
                    P = new cl7(t58Var, 10);
                    rv4Var.o0(P);
                }
                yte.b(t58Var, (xt4) P, rv4Var);
                fxe.h(yqe.A((y3b) x2b.v0.getValue(), rv4Var), pna.c, false, jce.E(-2094697984, new h64(cz7Var, 20), rv4Var), jce.E(13783145, new em7(2, t58Var, z2), rv4Var), null, jce.E(1298057743, new cs1(z2, t58Var, cz7Var), rv4Var), rv4Var, 1600560, 36);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h64(cz7Var, i, 21);
        }
    }

    public static final void f(long j, oyb oybVar, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-684938728);
        if ((i & 6) == 0) {
            if (rv4Var.e(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(oybVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(lu4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            ly1 ly1Var = cvb.a;
            pye.b(new i99[]{r12.a.a(new zl1(j)), ly1Var.a(((oyb) rv4Var.j(ly1Var)).e(oybVar))}, lu4Var, rv4Var, ((i2 >> 3) & Token.ASSIGN_MOD) | 8);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h99(j, oybVar, lu4Var, i, 0);
        }
    }

    public static final byte[] g(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            i2 += ((byte[]) obj).length;
        }
        byte[] bArr = new byte[i2];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            byte[] bArr2 = (byte[]) obj2;
            b00.c0(bArr2, i4, 0, bArr, 0, 12);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public static final byte[] h(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            i2 += ((byte[]) obj).length;
        }
        byte[] bArr = new byte[i2];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            byte[] bArr2 = (byte[]) obj2;
            b00.c0(bArr2, i4, 0, bArr, 0, 12);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3, rse rseVar) {
        bArr.getClass();
        bArr2.getClass();
        h hVar = new h(bArr2);
        oh1 oh1Var = oh1.d;
        oh1Var.getClass();
        byte[] d0 = b00.d0(bArr, 0, bArr.length);
        if (rseVar.equals(qh1.k)) {
            int length = d0.length;
            if (length % 16 != 0) {
                length = ((length / 16) + 1) * 16;
            }
            return Arrays.copyOf(oh1Var.a(Arrays.copyOf(d0, length), hVar, qh1.m, bArr3), d0.length);
        }
        return oh1Var.a(d0, hVar, rseVar, bArr3);
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, byte[] bArr3, rse rseVar) {
        bArr2.getClass();
        h hVar = new h(bArr2);
        oh1 oh1Var = oh1.d;
        oh1Var.getClass();
        byte[] d0 = b00.d0(bArr, 0, bArr.length);
        if (rseVar.equals(qh1.k)) {
            return Arrays.copyOf(oh1Var.b(d0, hVar, qh1.m, bArr3), d0.length);
        }
        return oh1Var.b(d0, hVar, rseVar, bArr3);
    }

    public static final double k(byte[] bArr, int i) {
        return Double.longBitsToDouble(((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48));
    }

    public static int l(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static final int m(s0b s0bVar, int i, int i2) {
        boolean z = s0bVar.l;
        g96 g96Var = s0bVar.a;
        List list = s0bVar.c;
        List list2 = s0bVar.b;
        if (!z) {
            return 0;
        }
        int A = k27.A(g96Var.b().c - (s0bVar.a() / 2.0f));
        if (i <= list2.size() - 1) {
            A = k27.A(((g96) list2.get(dce.n((list2.size() - 1) - i, 0, list2.size() - 1))).b().c - (s0bVar.a() / 2.0f));
        }
        int i3 = i2 - 1;
        if (i >= i3 - (list.size() - 1) && i2 > g96Var.C) {
            return k27.A(((g96) list.get(dce.n((list.size() - 1) - (i3 - i), 0, list.size() - 1))).c().c - (s0bVar.a() / 2.0f));
        }
        return A;
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static boolean o(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = az7.b;
            }
        } else if (collection instanceof ws5) {
            obj = ((ws5) collection).d;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static final int p(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [zl9, java.lang.Object] */
    public static final oa1 q(byte[] bArr) {
        String str;
        long j;
        bArr.getClass();
        if (bArr.length >= 512) {
            int i = 0;
            while (true) {
                char c2 = '\b';
                if (i < 8) {
                    if (bArr[i] == a[i]) {
                        i++;
                    } else {
                        throw new Exception("CFB magic byte mismatch");
                    }
                } else {
                    int v = v(bArr, 30);
                    if (v >= 7 && v <= 16) {
                        int i2 = 1 << v;
                        int v2 = v(bArr, 32);
                        if (v2 <= 16) {
                            int i3 = 1 << v2;
                            long x = x(bArr, 44);
                            if (x <= 10000) {
                                long x2 = x(bArr, 48);
                                long x3 = x(bArr, 56);
                                long x4 = x(bArr, 60);
                                long x5 = x(bArr, 64);
                                long x6 = x(bArr, 68);
                                long x7 = x(bArr, 72);
                                ArrayList arrayList = new ArrayList();
                                int i4 = 0;
                                while (i4 < 109) {
                                    char c3 = c2;
                                    if (arrayList.size() >= x) {
                                        break;
                                    }
                                    long x8 = x(bArr, (i4 * 4) + 76);
                                    if (x8 == 4294967295L || x8 == 4294967294L) {
                                        break;
                                    }
                                    arrayList.add(Long.valueOf(x8));
                                    i4++;
                                    c2 = c3;
                                }
                                HashSet hashSet = new HashSet();
                                long j2 = x6;
                                int i5 = 0;
                                while (i5 < x7 && j2 != 4294967294L && j2 != 4294967295L && !hashSet.contains(Long.valueOf(j2))) {
                                    hashSet.add(Long.valueOf(j2));
                                    byte[] s = s(i2, j2, bArr);
                                    int i6 = (i2 / 4) - 1;
                                    int i7 = 0;
                                    while (i7 < i6 && arrayList.size() < x) {
                                        int i8 = i7 * 4;
                                        HashSet hashSet2 = hashSet;
                                        if (i8 + 3 < s.length) {
                                            long x9 = x(s, i8);
                                            if (x9 != 4294967295L && x9 != 4294967294L) {
                                                arrayList.add(Long.valueOf(x9));
                                            }
                                        }
                                        i7++;
                                        hashSet = hashSet2;
                                    }
                                    HashSet hashSet3 = hashSet;
                                    int i9 = i6 * 4;
                                    if (i9 + 3 < s.length) {
                                        j2 = x(s, i9);
                                    } else {
                                        j2 = 4294967294L;
                                    }
                                    i5++;
                                    hashSet = hashSet3;
                                }
                                int i10 = i2 / 4;
                                long[] jArr = new long[arrayList.size() * i10];
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    Object obj = arrayList.get(i11);
                                    obj.getClass();
                                    byte[] s2 = s(i2, ((Number) obj).longValue(), bArr);
                                    int i12 = 0;
                                    while (i12 < i10) {
                                        int i13 = (i11 * i10) + i12;
                                        int i14 = i12 * 4;
                                        int i15 = i2;
                                        if (i14 + 3 < s2.length) {
                                            j = x(s2, i14);
                                        } else {
                                            j = 4294967295L;
                                        }
                                        jArr[i13] = j;
                                        i12++;
                                        i2 = i15;
                                    }
                                }
                                ?? obj2 = new Object();
                                int i16 = 64;
                                byte[] r = r(i2, jArr, bArr, x2, 12800000L);
                                ArrayList arrayList2 = new ArrayList();
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + Token.CASE;
                                    if (i18 > r.length || arrayList2.size() >= 100000) {
                                        break;
                                    }
                                    int v3 = v(r, i17 + 64);
                                    if (v3 > 0 && v3 <= i16) {
                                        int i19 = v3 - 2;
                                        if (i19 > 0) {
                                            StringBuilder sb = new StringBuilder(i19 / 2);
                                            int i20 = i19 + i17;
                                            int i21 = i17;
                                            while (true) {
                                                int i22 = i21 + 1;
                                                if (i22 >= i20) {
                                                    break;
                                                }
                                                sb.append((char) ((r[i21] & 255) | ((r[i22] & 255) << 8)));
                                                i21 += 2;
                                            }
                                            str = sb.toString();
                                        } else {
                                            str = "";
                                        }
                                        arrayList2.add(new na1(str, x(r, i17 + Token.COLON), x(r, i17 + 120), r[i17 + 66] & 255));
                                    } else {
                                        arrayList2.add(new na1("", 0L, 0L, 0));
                                    }
                                    i17 = i18;
                                    i16 = 64;
                                }
                                return new oa1(arrayList2, x3, i3, obj2, x5, x4, i2, jArr, bArr, new Object());
                            }
                            throw new Exception(hl5.k(x, "Too many FAT sectors: "));
                        }
                        throw new Exception(a82.j(v2, "Invalid mini sector size shift: "));
                    }
                    throw new Exception(a82.j(v, "Invalid sector size shift: "));
                }
            }
        } else {
            throw new Exception("CFB file is too short (minimum 512 bytes)");
        }
    }

    public static final byte[] r(int i, long[] jArr, byte[] bArr, long j, long j2) {
        byte[] bArr2;
        long j3 = 4294967294L;
        if (j != 4294967294L) {
            if (j != 4294967295L) {
                if (j2 <= 104857600) {
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet = new HashSet();
                    long j4 = 0;
                    long j5 = j;
                    for (long j6 = 4294967295L; j5 != j3 && j5 != j6 && j4 < j2 && !hashSet.contains(Long.valueOf(j5)) && hashSet.size() <= 1000000; j6 = 4294967295L) {
                        hashSet.add(Long.valueOf(j5));
                        byte[] s = s(i, j5, bArr);
                        long j7 = j2 - j4;
                        if (j7 < i) {
                            bArr2 = b00.d0(s, 0, Math.min((int) j7, s.length));
                        } else {
                            bArr2 = s;
                        }
                        arrayList.add(bArr2);
                        j4 += Math.min(s.length, j7);
                        if (j5 < jArr.length) {
                            j5 = jArr[(int) j5];
                        } else {
                            j5 = 4294967294L;
                        }
                        j3 = 4294967294L;
                    }
                    return g(arrayList);
                }
                throw new Exception("Stream is too large");
            }
        }
        return new byte[0];
    }

    public static final byte[] s(int i, long j, byte[] bArr) {
        long j2 = i;
        long j3 = (j * j2) + 512;
        if (j2 + j3 > bArr.length) {
            return new byte[0];
        }
        int i2 = (int) j3;
        return b00.d0(bArr, i2, i + i2);
    }

    public static final int t(int i, String str) {
        while (i < str.length() && nqe.y(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static Object u(re5 re5Var, String str, tl8 tl8Var, n42 n42Var) {
        gh5 gh5Var = new gh5();
        gh5Var.d(pg5.c);
        gh5Var.d = new my2(tl8Var);
        gh5Var.b(null);
        h40 h40Var = hh5.a;
        ytc.b(gh5Var.a, str);
        return new hi5(gh5Var, re5Var).c(n42Var);
    }

    public static final int v(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static final int w(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static final long x(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final long y(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final cse z(kse kseVar) {
        long j;
        try {
            ise G = kseVar.G();
            if (G != null) {
                try {
                    byte b2 = G.b;
                    byte b3 = G.a;
                    int i = 0;
                    if (b3 != Byte.MIN_VALUE) {
                        if (b3 != -96) {
                            if (b3 != -64) {
                                if (b3 != -32) {
                                    if (b3 != 0 && b3 != 32) {
                                        if (b3 != 64) {
                                            if (b3 == 96) {
                                                kseVar.g0((byte) 96);
                                                String str = new String(kseVar.m0(), StandardCharsets.UTF_8);
                                                A(b2, str.length());
                                                return new ure(str);
                                            }
                                            throw new IOException("Unidentifiable major type: " + ((b3 >> 5) & 7));
                                        }
                                        kseVar.g0((byte) 64);
                                        byte[] m0 = kseVar.m0();
                                        int length = m0.length;
                                        A(b2, length);
                                        return new gre(qpe.h(m0, length));
                                    }
                                    long q = kseVar.q();
                                    if (q > 0) {
                                        j = q;
                                    } else {
                                        j = ~q;
                                    }
                                    A(b2, j);
                                    return new nre(q);
                                }
                                return new ere(kseVar.Q());
                            }
                            throw new IOException("Tags are currently unsupported");
                        }
                        long C = kseVar.C();
                        if (C <= 1000) {
                            A(b2, C);
                            int i2 = (int) C;
                            rwa[] rwaVarArr = new rwa[i2];
                            cse cseVar = null;
                            int i3 = 0;
                            while (i3 < C) {
                                cse z = z(kseVar);
                                if (cseVar != null && z.compareTo(cseVar) <= 0) {
                                    throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + cseVar.toString() + "\nCurrent key: " + z.toString());
                                }
                                rwaVarArr[i3] = new rwa(20, z, z(kseVar));
                                i3++;
                                cseVar = z;
                            }
                            TreeMap treeMap = new TreeMap();
                            while (i < i2) {
                                rwa rwaVar = rwaVarArr[i];
                                if (!treeMap.containsKey((cse) rwaVar.b)) {
                                    treeMap.put((cse) rwaVar.b, (cse) rwaVar.c);
                                    i++;
                                } else {
                                    throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                }
                            }
                            return new tre(mee.b(treeMap));
                        }
                        throw new IOException("Parser being asked to read a large CBOR map");
                    }
                    long o = kseVar.o();
                    if (o <= 1000) {
                        A(b2, o);
                        cse[] cseVarArr = new cse[(int) o];
                        while (i < o) {
                            cseVarArr[i] = z(kseVar);
                            i++;
                        }
                        return new bre(vde.s(cseVarArr));
                    }
                    throw new IOException("Parser being asked to read a large CBOR array");
                } catch (IOException | RuntimeException e) {
                    throw new jre(e);
                }
            }
            throw new IOException("Parser being asked to parse an empty input stream");
        } catch (IOException e2) {
            throw new jre(e2);
        }
    }
}
