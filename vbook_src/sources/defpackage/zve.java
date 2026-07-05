package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zve  reason: default package */
/* loaded from: classes.dex */
public abstract class zve {
    public static final tu1 a = new tu1(new ev1(13), false, -2051092940);
    public static final qm1 b = qm1.L;
    public static final qm1 c = qm1.M;
    public static final float d = 0.38f;
    public static final float e = 6.0f;
    public static final float f = 1.0f;
    public static final e7c g = new e7c(0, new long[0], new Object[0]);
    public static ar5 h;
    public static ar5 i;

    public static final void a(xl0 xl0Var, boolean z, oyb oybVar, nq7 nq7Var, zl0 zl0Var, rv4 rv4Var, int i2) {
        Object obj;
        int i3;
        Object obj2;
        boolean z2;
        boolean h2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(386961049);
        if ((i2 & 6) == 0) {
            obj = xl0Var;
            if (rv4Var.f(obj)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            obj = xl0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.g(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            obj2 = oybVar;
            if (rv4Var.f(obj2)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        } else {
            obj2 = oybVar;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                h2 = rv4Var.f(zl0Var);
            } else {
                h2 = rv4Var.h(zl0Var);
            }
            if (h2) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            long j = ((e81) rv4Var.j(jt6.a)).a.w;
            nq7 f2 = pna.f(nq7Var, 1.0f);
            boolean e2 = rv4Var.e(j);
            Object P = rv4Var.P();
            if (e2 || P == ax1.a) {
                P = new th(j, 18);
                rv4Var.o0(P);
            }
            nq7 z3 = zbe.z(ote.r(f2, (xt4) P), 12.0f, 8.0f);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z3);
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
            xve.e(obj, z, obj2, pna.f(kq7.a, 1.0f), zl0Var, rv4Var, (i3 & 14) | 3072 | (i3 & Token.ASSIGN_MOD) | (i3 & 896) | (i3 & 57344));
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new cmb(xl0Var, z, oybVar, nq7Var, zl0Var, i2, 3);
        }
    }

    public static final void b(xl0 xl0Var, boolean z, oyb oybVar, nq7 nq7Var, zl0 zl0Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        ek9 ek9Var;
        cmb cmbVar;
        String valueOf;
        String u;
        boolean h2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(2029016207);
        if ((i2 & 6) == 0) {
            if (rv4Var2.f(xl0Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            if (rv4Var2.g(z2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.f(oybVar)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                h2 = rv4Var2.f(zl0Var);
            } else {
                h2 = rv4Var2.h(zl0Var);
            }
            if (h2) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i3 & 1, z3)) {
            cf8 cf8Var = (cf8) rv4Var2.j(af8.a);
            hn0 hn0Var = xl0Var.b;
            if (hn0Var instanceof zm0) {
                u = "•";
            } else if (hn0Var instanceof dn0) {
                int i9 = ((dn0) hn0Var).a;
                String str = xl0Var.a;
                cf8Var.getClass();
                str.getClass();
                bf8 bf8Var = (bf8) cf8Var.a.get(new pm0(str));
                if (bf8Var == null) {
                    bf8Var = bf8.a;
                }
                int ordinal = bf8Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            ty5 ty5Var = af8.b;
                            int i10 = ty5Var.a;
                            if (i9 <= ty5Var.b && i10 <= i9) {
                                StringBuilder sb = new StringBuilder();
                                for (yk8 yk8Var : af8.c) {
                                    int intValue = ((Number) yk8Var.a).intValue();
                                    String str2 = (String) yk8Var.b;
                                    while (i9 >= intValue) {
                                        sb.append(str2);
                                        i9 -= intValue;
                                    }
                                }
                                valueOf = sb.toString();
                            } else {
                                valueOf = String.valueOf(i9);
                            }
                        } else {
                            xk5.o();
                            return;
                        }
                    } else if (i9 <= 0) {
                        valueOf = String.valueOf(i9);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        while (i9 > 0) {
                            int i11 = i9 - 1;
                            sb2.append((char) ((i11 % 26) + 97));
                            i9 = i11 / 26;
                        }
                        valueOf = sb2.reverse().toString();
                    }
                } else {
                    valueOf = String.valueOf(i9);
                }
                u = nk2.u(valueOf, ".");
            } else {
                ek9Var = rv4Var2.u();
                if (ek9Var != null) {
                    cmbVar = new cmb(xl0Var, z, oybVar, nq7Var, zl0Var, i2, 4);
                    ek9Var.d = cmbVar;
                }
                return;
            }
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
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
            oyb a3 = oyb.a(oybVar, 0L, 0L, null, null, null, 0L, null, 6, 0L, null, 16744447);
            nq7 u2 = pna.u(kq7.a, 24.0f, nae.e, 2);
            n95 n95Var = hc.a;
            qye.b(u, u2.a0(new ild(n95Var)), a3, null, 0, false, 0, 0, null, rv4Var2, 0, 1016);
            r0f.N.l(8.0f, rv4Var2, 54);
            float f2 = 1.0f;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            xve.e(xl0Var, z2, oybVar, new we6(f2, true).a0(new ild(n95Var)), zl0Var, rv4Var2, i3 & 58366);
            rv4Var2 = rv4Var2;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9Var = rv4Var2.u();
        if (ek9Var != null) {
            cmbVar = new cmb(xl0Var, z, oybVar, nq7Var, zl0Var, i2, 5);
            ek9Var.d = cmbVar;
        }
    }

    public static final void c(xl0 xl0Var, boolean z, oyb oybVar, nq7 nq7Var, zl0 zl0Var, rv4 rv4Var, int i2) {
        Object obj;
        int i3;
        Object obj2;
        boolean z2;
        boolean h2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(362898252);
        if ((i2 & 6) == 0) {
            obj = xl0Var;
            if (rv4Var.f(obj)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            obj = xl0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.g(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            obj2 = oybVar;
            if (rv4Var.f(obj2)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        } else {
            obj2 = oybVar;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                h2 = rv4Var.f(zl0Var);
            } else {
                h2 = rv4Var.h(zl0Var);
            }
            if (h2) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            p71 p71Var = ((e81) rv4Var.j(jt6.a)).a;
            long j = p71Var.r;
            long j2 = p71Var.s;
            nq7 f2 = pna.f(nq7Var, 1.0f);
            boolean e2 = rv4Var.e(j2) | rv4Var.e(j);
            Object P = rv4Var.P();
            if (e2 || P == ax1.a) {
                i01 i01Var = new i01(j2, j, 1);
                rv4Var.o0(i01Var);
                P = i01Var;
            }
            nq7 C = zbe.C(ote.r(f2, (xt4) P), 15.0f, 4.0f, nae.e, 4.0f, 4);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, C);
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
            xve.e(obj, z, obj2, pna.f(kq7.a, 1.0f), zl0Var, rv4Var, (i3 & 14) | 3072 | (i3 & Token.ASSIGN_MOD) | (i3 & 896) | (i3 & 57344));
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new cmb(xl0Var, z, oybVar, nq7Var, zl0Var, i2, 6);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ky9] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, ky9] */
    public static ky9 d(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            ?? obj = new Object();
            new LinkedHashMap();
            obj.a = new bm1(ls3.a);
            return obj;
        }
        ClassLoader classLoader = ky9.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        r07 r07Var = new r07(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            r07Var.put(str, bundle.get(str));
        }
        r07 b2 = r07Var.b();
        ?? obj2 = new Object();
        new LinkedHashMap();
        obj2.a = new bm1(b2);
        return obj2;
    }

    public static final me6 e(lp3 lp3Var) {
        ne6 ne6Var;
        a73 a73Var;
        boolean z;
        ee6 ee6Var;
        le6 w = me6.w();
        vt3 vt3Var = vt3.Z;
        if (lp3Var instanceof mp3) {
            ne6Var = ne6.BOX;
        } else if (lp3Var instanceof qp3) {
            if (((qp3) lp3Var).c.b(vt3Var)) {
                ne6Var = ne6.RADIO_ROW;
            } else {
                ne6Var = ne6.ROW;
            }
        } else if (lp3Var instanceof np3) {
            if (((np3) lp3Var).c.b(vt3Var)) {
                ne6Var = ne6.RADIO_COLUMN;
            } else {
                ne6Var = ne6.COLUMN;
            }
        } else if (lp3Var instanceof tp3) {
            ne6Var = ne6.TEXT;
        } else if (lp3Var instanceof sp3) {
            ne6Var = ne6.SPACER;
        } else if (lp3Var instanceof pp3) {
            ne6Var = ne6.IMAGE;
        } else if (lp3Var instanceof rn9) {
            ne6Var = ne6.REMOTE_VIEWS_ROOT;
        } else if (lp3Var instanceof rp3) {
            ne6Var = ne6.SIZE_BOX;
        } else {
            fb4.m(lp3Var.getClass().getCanonicalName(), "Unknown element type ");
            return null;
        }
        w.c();
        me6.k((me6) w.b, ne6Var);
        mid midVar = (mid) lp3Var.a().a(null, f8a.a0);
        a73 a73Var2 = y63.a;
        if (midVar != null) {
            a73Var = midVar.a;
        } else {
            a73Var = a73Var2;
        }
        fe6 j = j(a73Var);
        w.c();
        me6.l((me6) w.b, j);
        u55 u55Var = (u55) lp3Var.a().a(null, kid.b);
        if (u55Var != null) {
            a73Var2 = u55Var.a;
        }
        fe6 j2 = j(a73Var2);
        w.c();
        me6.m((me6) w.b, j2);
        int i2 = 0;
        boolean z2 = true;
        if (lp3Var.a().a(null, f8a.Y) != null) {
            z = true;
        } else {
            z = false;
        }
        w.c();
        me6.r((me6) w.b, z);
        if (lp3Var.a().a(null, f8a.Z) != null) {
            w.c();
            me6.q((me6) w.b);
        }
        if (lp3Var instanceof pp3) {
            pp3 pp3Var = (pp3) lp3Var;
            int i3 = pp3Var.d;
            if (i3 == 1) {
                ee6Var = ee6.FIT;
            } else if (i3 == 0) {
                ee6Var = ee6.CROP;
            } else if (i3 == 2) {
                ee6Var = ee6.FILL_BOUNDS;
            } else {
                cp8.u(v22.a(pp3Var.d), "Unknown content scale ");
                return null;
            }
            w.c();
            me6.p((me6) w.b, ee6Var);
            w.c();
            me6.t((me6) w.b, !xwe.h(pp3Var));
            if (pp3Var.c == null) {
                z2 = false;
            }
            w.c();
            me6.u((me6) w.b, z2);
        } else if (lp3Var instanceof np3) {
            ge6 l = l(((np3) lp3Var).e);
            w.c();
            me6.n((me6) w.b, l);
        } else if (lp3Var instanceof qp3) {
            oe6 k = k(((qp3) lp3Var).e);
            w.c();
            me6.o((me6) w.b, k);
        } else if (lp3Var instanceof mp3) {
            mp3 mp3Var = (mp3) lp3Var;
            ge6 l2 = l(mp3Var.d.a);
            w.c();
            me6.n((me6) w.b, l2);
            oe6 k2 = k(mp3Var.d.b);
            w.c();
            me6.o((me6) w.b, k2);
        }
        if (lp3Var instanceof up3) {
            ArrayList arrayList = ((up3) lp3Var).b;
            ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                arrayList2.add(e((lp3) obj));
            }
            w.c();
            me6.s((me6) w.b, arrayList2);
        }
        return (me6) w.a();
    }

    public static final zl1 f(String str) {
        str.getClass();
        if (str.equals("null")) {
            return null;
        }
        return new zl1(sve.b(Integer.parseInt(str)));
    }

    public static final n10 g(Object obj, io5 io5Var, xt4 xt4Var, xt4 xt4Var2, w22 w22Var, rv4 rv4Var, int i2) {
        if ((i2 & 4) != 0) {
            xt4Var = n10.R;
        }
        if ((i2 & 8) != 0) {
            xt4Var2 = null;
        }
        if ((i2 & 16) != 0) {
            w22Var = r0f.e;
        }
        g10 g10Var = (g10) rv4Var.j(ct6.a);
        rv4Var.e0(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            jp5 c2 = j2d.c(obj, rv4Var);
            j2d.f(c2);
            h10 h10Var = new h10(io5Var, c2, g10Var);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new n10(h10Var);
                rv4Var.o0(P);
            }
            n10 n10Var = (n10) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = yte.s(rv4Var);
                rv4Var.o0(P2);
            }
            n10Var.H = (m82) P2;
            n10Var.I = xt4Var;
            n10Var.J = xt4Var2;
            n10Var.K = w22Var;
            n10Var.L = 1;
            n10Var.M = j2d.a(rv4Var);
            n10Var.n(h10Var);
            rv4Var.q(false);
            return n10Var;
        } finally {
            Trace.endSection();
        }
    }

    public static final String h(zl1 zl1Var) {
        long j = zl1Var.a;
        if (j == 16) {
            return "null";
        }
        return String.valueOf(sve.x(j));
    }

    public static final void i(h49 h49Var, String str, String str2) {
        h49Var.getClass();
        str.getClass();
        str2.getClass();
        h49Var.i(str, str2);
    }

    public static final fe6 j(a73 a73Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jid.a.a(a73Var);
        }
        Map map = re6.a;
        if (a73Var instanceof t63) {
            return fe6.EXACT;
        }
        if (a73Var instanceof y63) {
            return fe6.WRAP;
        }
        if (a73Var instanceof v63) {
            return fe6.FILL;
        }
        if (a73Var instanceof u63) {
            return fe6.EXPAND;
        }
        vs.k("After resolution, no other type should be present");
        return null;
    }

    public static final oe6 k(int i2) {
        if (i2 == 0) {
            return oe6.TOP;
        }
        if (i2 == 1) {
            return oe6.CENTER_VERTICALLY;
        }
        if (i2 == 2) {
            return oe6.BOTTOM;
        }
        cp8.u(bc.b(i2), "unknown vertical alignment ");
        return null;
    }

    public static final ge6 l(int i2) {
        if (i2 == 0) {
            return ge6.START;
        }
        if (i2 == 1) {
            return ge6.CENTER_HORIZONTALLY;
        }
        if (i2 == 2) {
            return ge6.END;
        }
        cp8.u(ac.b(i2), "unknown horizontal alignment ");
        return null;
    }

    public static final long m(long j, long j2) {
        boolean z;
        int e2;
        int g2 = fxb.g(j);
        int f2 = fxb.f(j);
        boolean z2 = false;
        if (fxb.g(j2) < fxb.f(j)) {
            z = true;
        } else {
            z = false;
        }
        if (fxb.g(j) < fxb.f(j2)) {
            z2 = true;
        }
        if (z & z2) {
            if (fxb.a(j2, j)) {
                g2 = fxb.g(j2);
                f2 = g2;
            } else {
                if (fxb.a(j, j2)) {
                    e2 = fxb.e(j2);
                } else {
                    int g3 = fxb.g(j2);
                    if (g2 < fxb.f(j2) && g3 <= g2) {
                        g2 = fxb.g(j2);
                        e2 = fxb.e(j2);
                    } else {
                        f2 = fxb.g(j2);
                    }
                }
                f2 -= e2;
            }
        } else if (f2 > fxb.g(j2)) {
            g2 -= fxb.e(j2);
            e2 = fxb.e(j2);
            f2 -= e2;
        }
        return sze.a(g2, f2);
    }
}
