package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.vbook.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fbe  reason: default package */
/* loaded from: classes3.dex */
public abstract class fbe {
    public static final tu1 a = new tu1(new rv1(12), false, 1079581084);
    public static final tu1 b = new tu1(new rv1(13), false, -1557815517);
    public static final tu1 c = new tu1(new rv1(14), false, -1736522022);
    public static final tu1 d = new tu1(new rv1(15), false, 410044443);

    public fbe() {
        new ConcurrentHashMap();
    }

    public static fq4 C(fq4[] fq4VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        fq4 fq4Var = null;
        int i4 = Integer.MAX_VALUE;
        for (fq4 fq4Var2 : fq4VarArr) {
            int abs = Math.abs(fq4Var2.c - i2) * 2;
            if (fq4Var2.d == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (fq4Var == null || i4 > i5) {
                fq4Var = fq4Var2;
                i4 = i5;
            }
        }
        return fq4Var;
    }

    public static final int D(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static SharedPreferences E(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final void F(aj2 aj2Var, String str, xt4 xt4Var) {
        aj2Var.getClass();
        if (aj2Var instanceof e1) {
            e1 e1Var = (e1) aj2Var;
            jsc.u(1, xt4Var);
            hy b2 = e1Var.b();
            e1 h = e1Var.h();
            xt4Var.invoke(h);
            b2.a(new ue8(str, new ny1(h.b().a)));
            return;
        }
        vs.k("impossible");
    }

    public static y18 G(mj9 mj9Var) {
        int parseInt = Integer.parseInt(mj9Var.c0(Long.MAX_VALUE));
        long parseLong = Long.parseLong(mj9Var.c0(Long.MAX_VALUE));
        long parseLong2 = Long.parseLong(mj9Var.c0(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int parseInt2 = Integer.parseInt(mj9Var.c0(Long.MAX_VALUE));
        for (int i = 0; i < parseInt2; i++) {
            String c0 = mj9Var.c0(Long.MAX_VALUE);
            int f0 = k4b.f0(c0, ':', 0, 6);
            if (f0 != -1) {
                String obj = k4b.N0(c0.substring(0, f0)).toString();
                String substring = c0.substring(f0 + 1);
                String lowerCase = obj.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Object obj2 = linkedHashMap.get(lowerCase);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(lowerCase, obj2);
                }
                ((List) obj2).add(substring);
            } else {
                p1a.k("Unexpected header: ".concat(c0));
                return null;
            }
        }
        return new y18(parseInt, parseLong, parseLong2, new s18(o17.y(linkedHashMap)), null, null);
    }

    public static final void H(vf6 vf6Var, String str, List list, vt4 vt4Var, lu4 lu4Var) {
        vf6Var.getClass();
        str.getClass();
        lu4Var.getClass();
        vf6Var.z(list.size(), new poa(1, new eja(23), list), new aw0(4, new tsa(0, (byte) 0), list), new pj7(23, list), new tu1(new td0(list, str, vt4Var, lu4Var, 10), true, -1117249557));
    }

    public static void I(y18 y18Var, lj9 lj9Var) {
        lj9Var.o(y18Var.a);
        lj9Var.writeByte(10);
        lj9Var.o(y18Var.b);
        lj9Var.writeByte(10);
        lj9Var.o(y18Var.c);
        lj9Var.writeByte(10);
        Set<Map.Entry> entrySet = y18Var.d.a.entrySet();
        int i = 0;
        for (Map.Entry entry : entrySet) {
            i += ((List) entry.getValue()).size();
        }
        lj9Var.o(i);
        lj9Var.writeByte(10);
        for (Map.Entry entry2 : entrySet) {
            for (String str : (List) entry2.getValue()) {
                lj9Var.i0((String) entry2.getKey());
                lj9Var.i0(":");
                lj9Var.i0(str);
                lj9Var.writeByte(10);
            }
        }
    }

    public static String J(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final void a(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str, boolean z) {
        int i2;
        boolean z2;
        Object obj;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1802770092);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            if (rv4Var2.g(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            obj = xt4Var;
            if (rv4Var2.h(obj)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        } else {
            obj = xt4Var;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i2 & 1, z3)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
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
            ase.b(z2, obj, null, false, null, rv4Var2, (i2 >> 3) & Token.ELSE);
            tza tzaVar = j27.a;
            cvb.c(str, new we6(1.0f, true), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, i2 & 14, 0, 131064);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new eh7(str, z, xt4Var, nq7Var, i);
        }
    }

    public static final void b(String str, List list, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        int i3;
        int i4;
        int i5;
        boolean h;
        int i6;
        int i7;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(825517233);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
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
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            if (list.size() > 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
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
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var2.P();
            if (z3 || P == ax1.a) {
                P = new on7(26, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 t = q1d.t(0, (vt4) P, rv4Var2, f, z2);
            gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            rv4Var2.e0(1995636229);
            if (str.length() == 0) {
                str2 = yqe.A((y3b) k2b.b.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            boolean z4 = z2;
            we6 we6Var = new we6(1.0f, true);
            tza tzaVar = j27.a;
            cvb.c(str2, we6Var, ((h27) rv4Var2.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.g, rv4Var, 0, 0, 131064);
            rv4Var2 = rv4Var;
            if (z4) {
                rv4Var2.e0(1735457570);
                i3 = 0;
                nk5.a(rp5.c((wk3) jk3.f.getValue(), rv4Var2, 0), null, pna.n(kq7Var, 24.0f), 0L, rv4Var2, 432, 8);
                rv4Var2.q(false);
            } else {
                i3 = 0;
                rv4Var2.e0(1735664619);
                rv4Var2.q(false);
            }
            rs8.u(rv4Var2, true, kq7Var, 12.0f, rv4Var2);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var2, i3);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            rv4Var2.e0(2032716160);
            int min = Math.min(list.size(), 3);
            for (int i8 = 0; i8 < min; i8++) {
                if (i8 > 0) {
                    rv4Var2.e0(-1008193276);
                    vqe.m(nae.e, 0, 3, rm1.g(((h27) rv4Var2.j(j27.a)).a, 8.0f), rv4Var2, null);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(-1008030867);
                    rv4Var2.q(false);
                }
                d((rp1) list.get(i8), zbe.A(pna.f(kq7Var, 1.0f), nae.e, 12.0f, 1), rv4Var2, 56);
            }
            hl5.v(rv4Var2, false, true, true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new x90(str, list, nq7Var, vt4Var, i, 17);
        }
    }

    public static final void c(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        boolean z;
        rv4Var.g0(-209928237);
        int i2 = i & 1;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!rv4Var.U(i2, z)) {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ai8(nq7Var, vt4Var, i, 2);
        }
    }

    public static final void d(rp1 rp1Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        long j;
        int i3;
        rp1 rp1Var2 = rp1Var;
        rv4 rv4Var2 = rv4Var;
        rp1Var2.getClass();
        String str = rp1Var2.d;
        rv4Var2.g0(1569820287);
        if (rv4Var2.h(rp1Var2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i4 |= i3;
        }
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i4 & 1, z)) {
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
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            do5.a(rp1Var2.b, null, false, null, jce.E(1643051265, new qo4(rp1Var2, 1), rv4Var2), null, tte.k(pna.n(kq7Var, 24.0f), uu9.a), null, rv4Var2, 196608, 862);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            cvb.c(rp1Var2.a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var, 0, 0, 262142);
            rs8.u(rv4Var, true, kq7Var, 6.0f, rv4Var);
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new mia(18);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            String str2 = rp1Var.c;
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.j;
            if (true & true) {
                j = e4c.c;
            } else {
                j = 0;
            }
            if (!e4c.a(j, e4c.c) && e4c.c(j) < nae.e) {
                mv5.c("lineHeight can't be negative (" + e4c.c(j) + ")");
            }
            uva uvaVar = oybVar.a;
            pl8 pl8Var = oybVar.b;
            pl8Var.getClass();
            tye.b(str2, null, new oyb(uvaVar, ql8.a(pl8Var, 5, 0, j, null, null, null, 0, 0, null)), zl1.b(0.6f, ((h27) rv4Var.j(tzaVar)).a.q), ((Boolean) aw7Var.getValue()).booleanValue(), 5, jce.E(637553550, new sp0(aw7Var, 18), rv4Var), null, rv4Var, 1769472, 130);
            rv4Var2 = rv4Var;
            if (str.length() > 0) {
                s21.w(rv4Var2, 732628597, kq7Var, 8.0f, rv4Var2);
                rp1Var2 = rp1Var;
                cvb.c(str, null, zl1.b(0.6f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var, 0, 0, 131066);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rp1Var2 = rp1Var;
                rv4Var2.e0(732897677);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new gk7(rp1Var2, nq7Var, i, 25);
        }
    }

    public static final void e(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(1811245907);
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
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            kq7 kq7Var = kq7.a;
            dpe.g(pna.p(kq7Var, 100.0f, 30.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
            rv4Var.e0(-191036509);
            for (int i4 = 0; i4 < 3; i4++) {
                f(zbe.A(pna.f(kq7Var, 1.0f), nae.e, 12.0f, 1), rv4Var, 6);
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 25);
        }
    }

    public static final void f(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(-1692893434);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            nq7 f = pna.f(kq7Var, 1.0f);
            gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f);
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
            dpe.f(null, tte.k(pna.n(kq7Var, 24.0f), uu9.a), rv4Var, 0, 1);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            i3 = 6;
            dpe.g(pna.p(kq7Var, 100.0f, 24.0f), null, rv4Var, 6, 2);
            rs8.u(rv4Var, true, kq7Var, 6.0f, rv4Var);
            dpe.g(pna.h(pna.f(kq7Var, 1.0f), 20.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, pna.h(kq7Var, 2.0f));
            dpe.g(pna.p(kq7Var, 100.0f, 20.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, pna.h(kq7Var, 2.0f));
            dpe.g(pna.p(kq7Var, 50.0f, 16.0f), null, rv4Var, 6, 2);
            rv4Var.q(true);
        } else {
            i3 = 6;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sh(nq7Var, i, i3, (byte) 0);
        }
    }

    public static final void g(j62 j62Var, boolean z, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        ps psVar;
        ps psVar2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-638046722);
        if (rv4Var2.h(j62Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1155) != 1154) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i7 & 1, z2)) {
            String str = j62Var.c;
            if (str == null) {
                str = "";
            }
            String A = yqe.A((y3b) k2b.c0.getValue(), rv4Var2);
            fa7 fa7Var = j62Var.f;
            if (fa7Var instanceof da7) {
                rv4Var2.e0(1017435557);
                rv4Var2.q(false);
                psVar2 = ((da7) fa7Var).b;
            } else if (fa7Var instanceof ba7) {
                rv4Var2.e0(1017436788);
                psVar2 = new ps(yqe.A((y3b) f2b.k0.getValue(), rv4Var2));
                rv4Var2.q(false);
            } else if (fa7Var instanceof ca7) {
                rv4Var2.e0(1475950677);
                ca7 ca7Var = (ca7) fa7Var;
                String str2 = ca7Var.b;
                switch (ca7Var.c) {
                    case 100:
                        rv4Var2.e0(1017444467);
                        psVar2 = new ps(yqe.A((y3b) k2b.T.getValue(), rv4Var2));
                        rv4Var2.q(false);
                        break;
                    case 101:
                        rv4Var2.e0(1017448718);
                        psVar2 = new ps(yqe.A((y3b) k2b.Z.getValue(), rv4Var2));
                        rv4Var2.q(false);
                        break;
                    case 102:
                        rv4Var2.e0(1017453012);
                        psVar2 = new ps(yqe.A((y3b) k2b.X.getValue(), rv4Var2));
                        rv4Var2.q(false);
                        break;
                    case Token.ASSIGN_BITAND /* 103 */:
                        rv4Var2.e0(1017457343);
                        rv4Var2.q(false);
                        if (!k4b.j0(str2)) {
                            A = eub.o(A, ": ", str2);
                        }
                        psVar2 = new ps(A);
                        break;
                    default:
                        rv4Var2.e0(1017461041);
                        rv4Var2.q(false);
                        psVar2 = new ps("");
                        break;
                }
                rv4Var2.q(false);
            } else if (fa7Var == null) {
                rv4Var2.e0(1017462545);
                rv4Var2.q(false);
                psVar = new ps("");
                v9b.a(lbe.f(15, vt4Var, nq7Var, null, false), null, zl1.b(nae.e, ((h27) rv4Var2.j(j27.a)).a.p), 0L, nae.e, nae.e, null, jce.E(-445014247, new yd1(j62Var, str, vt4Var, psVar, 0), rv4Var2), rv4Var, 12582912, Token.FUNCTION);
                rv4Var2 = rv4Var;
            } else {
                throw rs8.b(1017433783, rv4Var2, false);
            }
            psVar = psVar2;
            v9b.a(lbe.f(15, vt4Var, nq7Var, null, false), null, zl1.b(nae.e, ((h27) rv4Var2.j(j27.a)).a.p), 0L, nae.e, nae.e, null, jce.E(-445014247, new yd1(j62Var, str, vt4Var, psVar, 0), rv4Var2), rv4Var, 12582912, Token.FUNCTION);
            rv4Var2 = rv4Var;
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rd0(j62Var, z, nq7Var, vt4Var, i, 2);
        }
    }

    public static final void h(int i, vt4 vt4Var, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, rh8 rh8Var) {
        int i2;
        boolean z;
        pb2 pb2Var;
        ee1 ee1Var;
        aw7 aw7Var;
        boolean z2;
        boolean z3;
        boolean z4;
        ee1 ee1Var2;
        kq7 kq7Var;
        aw7 aw7Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(583138870);
        if ((i & 6) == 0) {
            if (rv4Var2.f("")) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            sdd a2 = kv6.a(rv4Var2);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                ee1 ee1Var3 = (ee1) ((fdd) voe.z(cm9.a(ee1.class), a2.i(), null, pb2Var, o96.a(rv4Var2), null));
                un6 un6Var = (un6) rv4Var2.j(nu6.a);
                aw7 z5 = jsc.z(ee1Var3.e, rv4Var2);
                Object[] objArr = new Object[0];
                Object P = rv4Var2.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = new cd1(3);
                    rv4Var2.o0(P);
                }
                aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P, rv4Var2, 48);
                Object[] objArr2 = {((ce1) z5.getValue()).f};
                boolean f = rv4Var2.f(z5);
                Object P2 = rv4Var2.P();
                if (f || P2 == lh9Var) {
                    P2 = new ae1(z5, 0);
                    rv4Var2.o0(P2);
                }
                aw7 j = zpe.j(objArr2, (vt4) P2, rv4Var2, 0);
                xn6 k = un6Var.k();
                boolean h = rv4Var2.h(un6Var) | rv4Var2.f(aw7Var3) | rv4Var2.f(ee1Var3);
                Object P3 = rv4Var2.P();
                if (h || P3 == lh9Var) {
                    P3 = new n0(un6Var, ee1Var3, aw7Var3, null, 20);
                    rv4Var2.o0(P3);
                }
                yte.g((lu4) P3, rv4Var2, k);
                b37 d2 = fu0.d(kh5.a, false);
                int hashCode = Long.hashCode(rv4Var2.T);
                xt8 l = rv4Var2.l();
                nq7 p = lye.p(rv4Var, nq7Var);
                rw1.k.getClass();
                zx1 zx1Var = qw1.b;
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(qw1.f, rv4Var2, d2);
                jce.F(qw1.e, rv4Var2, l);
                jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var2);
                jce.F(qw1.d, rv4Var2, p);
                boolean z6 = ((ce1) z5.getValue()).a;
                kq7 kq7Var2 = kq7.a;
                if (z6) {
                    rv4Var2.e0(-1785778521);
                    i(zbe.x(kq7Var2, rh8Var).a0(pna.c), rv4Var2, 0);
                    rv4Var2.q(false);
                    ee1Var2 = ee1Var3;
                    aw7Var2 = z5;
                    aw7Var = j;
                    kq7Var = kq7Var2;
                } else {
                    if (((ce1) z5.getValue()).b && ((ce1) z5.getValue()).g.isEmpty()) {
                        rv4Var2.e0(-1785486656);
                        ar5 E = owe.E(rv4Var2);
                        String A = yqe.A((y3b) s2b.a.getValue(), rv4Var2);
                        String A2 = yqe.A((y3b) s2b.b.getValue(), rv4Var2);
                        String A3 = yqe.A((y3b) b3b.B.getValue(), rv4Var2);
                        nq7 y = zbe.y(zbe.x(pna.c, rh8Var), 12.0f);
                        boolean f2 = rv4Var2.f(ee1Var3);
                        Object P4 = rv4Var2.P();
                        if (!f2 && P4 != lh9Var) {
                            ee1Var = ee1Var3;
                        } else {
                            ee1Var = ee1Var3;
                            P4 = new v7(0, ee1Var, ee1.class, "reload", "reload()V", 0, 3);
                            rv4Var2.o0(P4);
                        }
                        aw7Var = j;
                        jxe.d(E, A, A2, y, A3, (vt4) ((i76) P4), rv4Var2, 0, 0);
                        rv4Var2.q(false);
                        aw7Var2 = z5;
                        kq7Var = kq7Var2;
                    } else {
                        ee1Var = ee1Var3;
                        aw7Var = j;
                        if (((ce1) z5.getValue()).g.isEmpty() && !k4b.j0(((ce1) z5.getValue()).f)) {
                            rv4Var2.e0(-1784898183);
                            jxe.d(owe.D(rv4Var2), yqe.A((y3b) k2b.i.getValue(), rv4Var2), yqe.A((y3b) k2b.j.getValue(), rv4Var2), zbe.y(zbe.x(pna.c, rh8Var), 12.0f), null, null, rv4Var2, 0, 48);
                            rv4Var2.q(false);
                            aw7Var2 = z5;
                            kq7Var = kq7Var2;
                        } else {
                            rv4Var2.e0(-1784330573);
                            kj6 a3 = mj6.a(0, rv4Var2, 0, 3);
                            boolean f3 = rv4Var2.f(ee1Var);
                            Object P5 = rv4Var2.P();
                            if (f3 || P5 == lh9Var) {
                                P5 = new ve(ee1Var, 22);
                                rv4Var2.o0(P5);
                            }
                            ej6.c(a3, 0, (vt4) P5, rv4Var2, 0, 2);
                            nq7 l2 = q1d.l(pna.c, rv4Var2, 6);
                            bkd r = mwe.r(rh8Var, new th8(16.0f, 68.0f, 16.0f, 92.0f));
                            hz hzVar = new hz(4.0f, true, new vs(2));
                            if ((i2 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((i2 & 7168) == 2048) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z7 = z2 | z3;
                            if ((i2 & 57344) == 16384) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            boolean f4 = z4 | z7 | rv4Var2.f(z5);
                            Object P6 = rv4Var2.P();
                            if (f4 || P6 == lh9Var) {
                                P6 = new r7(11, xt4Var, vt4Var, z5);
                                rv4Var2.o0(P6);
                            }
                            ee1Var2 = ee1Var;
                            kq7Var = kq7Var2;
                            aw7Var2 = z5;
                            jce.d(l2, a3, r, false, hzVar, null, null, false, null, (xt4) P6, rv4Var, 24576, 488);
                            rv4Var2 = rv4Var;
                            rv4Var2.q(false);
                        }
                    }
                    ee1Var2 = ee1Var;
                }
                jub jubVar = (jub) aw7Var.getValue();
                nq7 x = zbe.x(zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 12.0f), rh8Var);
                aw7 aw7Var4 = aw7Var;
                boolean f5 = rv4Var2.f(aw7Var4) | rv4Var2.f(aw7Var2) | rv4Var2.f(ee1Var2);
                Object P7 = rv4Var2.P();
                if (f5 || P7 == lh9Var) {
                    P7 = new r7(12, ee1Var2, aw7Var4, aw7Var2);
                    rv4Var2.o0(P7);
                }
                xt4 xt4Var2 = (xt4) P7;
                boolean f6 = rv4Var2.f(ee1Var2) | rv4Var2.f(aw7Var4);
                Object P8 = rv4Var2.P();
                if (f6 || P8 == lh9Var) {
                    P8 = new t7(17, ee1Var2, aw7Var4);
                    rv4Var2.o0(P8);
                }
                k(jubVar, x, null, xt4Var2, (vt4) P8, rv4Var, 0, 4);
                rv4Var2 = rv4Var;
                rv4Var2.q(true);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new td1(nq7Var, rh8Var, xt4Var, vt4Var, i);
        }
    }

    public static final void i(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(1692774168);
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
            Object P = rv4Var.P();
            Object obj = ax1.a;
            Object obj2 = P;
            if (P == obj) {
                ArrayList arrayList = new ArrayList(8);
                for (int i4 = 0; i4 < 8; i4++) {
                    arrayList.add(Integer.valueOf(i4));
                }
                rv4Var.o0(arrayList);
                obj2 = arrayList;
            }
            List list = (List) obj2;
            bkd r = mwe.r(mwe.g(14, rv4Var), zbe.j(nae.e, 68.0f, nae.e, 92.0f, 5));
            nq7 l = q1d.l(nq7Var, rv4Var, i3 & 14);
            bkd r2 = mwe.r(r, zbe.h(2, 16.0f));
            hz hzVar = new hz(4.0f, true, new vs(2));
            boolean h = rv4Var.h(list);
            Object P2 = rv4Var.P();
            if (h || P2 == obj) {
                P2 = new vd1(0, list);
                rv4Var.o0(P2);
            }
            jce.d(l, null, r2, false, hzVar, null, null, false, null, (xt4) P2, rv4Var, 12607488, 362);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 3);
        }
    }

    public static final void j(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        cz7Var.getClass();
        rv4Var.g0(-1502049473);
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
            fxe.h(yqe.A((y3b) k2b.k.getValue(), rv4Var), null, false, jce.E(-456822205, new p7(cz7Var, 5), rv4Var), null, jce.E(1580253214, new xd1(cz7Var, 0), rv4Var), jce.E(-140478124, new zd1(cz7Var, 0), rv4Var), rv4Var, 1772544, 22);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p7(cz7Var, i, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if ((r23 & 4) != 0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.jub r16, defpackage.nq7 r17, java.lang.String r18, defpackage.xt4 r19, defpackage.vt4 r20, defpackage.rv4 r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbe.k(jub, nq7, java.lang.String, xt4, vt4, rv4, int, int):void");
    }

    public static final void l(String str, boolean z, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        long g;
        int i5;
        rv4Var.g0(-1966426679);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 |= i5;
        }
        if (rv4Var.f(nq7Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            tza tzaVar = j27.a;
            nq7 f = lbe.f(15, vt4Var, tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.d), null, false);
            if (z) {
                rv4Var.e0(1537023650);
                g = zl1.b(0.7f, ((h27) rv4Var.j(tzaVar)).a.h);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1537115658);
                g = rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f);
                rv4Var.q(false);
            }
            v9b.a(f, null, g, 0L, nae.e, nae.e, null, jce.E(-1145811932, new jd1(str, 3), rv4Var), rv4Var, 12582912, Token.FUNCTION);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ta(i, vt4Var, nq7Var, str, z);
        }
    }

    public static final void m(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(2065184499);
        if (rv4Var2.f(str)) {
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
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
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
            tza tzaVar = j27.a;
            cvb.c(str, new we6(1.0f, true), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, i5 & 14, 0, 131064);
            str2 = str;
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.s(kq7.a, 12.0f));
            nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var2, 0), null, null, ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var2, 48, 4);
            rv4Var2.q(true);
        } else {
            str2 = str;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new o7(str2, nq7Var, i, 9);
        }
    }

    public static final void n(final boolean z, final boolean z2, final boolean z3, final boolean z4, final xt4 xt4Var, final xt4 xt4Var2, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c2;
        boolean z5;
        xt4Var.getClass();
        xt4Var2.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        rv4Var.g0(2071567447);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        char c3 = ' ';
        if (rv4Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (rv4Var.g(z3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i14 = i13 | i4;
        if (rv4Var.g(z4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (rv4Var.h(xt4Var2)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i17 = i16 | i7;
        if (rv4Var.h(vt4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if (rv4Var.h(vt4Var2)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i19 = i18 | i9;
        if (rv4Var.h(vt4Var3)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i20 = i19 | i10;
        if (rv4Var.h(vt4Var4)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i21 = i20 | i11;
        if (rv4Var.h(vt4Var5)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (!rv4Var.h(vt4Var6)) {
            c3 = 16;
        }
        int i22 = c2 | c3;
        if ((i21 & 306783379) == 306783378 && (i22 & 19) == 18) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (rv4Var.U(i21 & 1, z5)) {
            nk0 nk0Var = kh5.c;
            nq7 C = zbe.C(mwe.u(pna.x(kq7.a), false, 15), nae.e, 40.0f, 24.0f, nae.e, 9);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new si7(2);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i23 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new si7(3);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i23.a(zt3.x((xt4) P2)), nk0Var, b2, false, false, C, jce.E(-29795531, new mu4() { // from class: dj7
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z6;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((su0) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z6)) {
                        tza tzaVar = j27.a;
                        fbe.o(z2, z3, z4, nmd.v(tte.k(kq7.a, ((h27) rv4Var2.j(tzaVar)).c.e), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 1.0f), lre.g), xt4Var2, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, rv4Var2, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i21 & 14) | 805531008 | ((i21 >> 9) & Token.ASSIGN_MOD), 192);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(z, z2, z3, z4, xt4Var, xt4Var2, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, i) { // from class: ej7
                public final /* synthetic */ vt4 C;
                public final /* synthetic */ vt4 D;
                public final /* synthetic */ vt4 E;
                public final /* synthetic */ vt4 F;
                public final /* synthetic */ vt4 G;
                public final /* synthetic */ vt4 H;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ xt4 e;
                public final /* synthetic */ xt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    fbe.n(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d7, code lost:
        if (r4 == r3) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(boolean r42, boolean r43, boolean r44, defpackage.nq7 r45, defpackage.xt4 r46, defpackage.vt4 r47, defpackage.vt4 r48, defpackage.vt4 r49, defpackage.vt4 r50, defpackage.vt4 r51, defpackage.vt4 r52, defpackage.rv4 r53, int r54) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbe.o(boolean, boolean, boolean, nq7, xt4, vt4, vt4, vt4, vt4, vt4, vt4, rv4, int):void");
    }

    public static final void p(p58 p58Var, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        xt4 xt4Var7 = xt4Var5;
        xt4 xt4Var8 = xt4Var6;
        rv4Var.g0(-1091159371);
        if ((i & 6) == 0) {
            if (rv4Var.f(p58Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var7)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.h(xt4Var8)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            nq7 C = rte.C(nq7Var, rte.u(rv4Var), 14);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
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
            int i12 = i2;
            xbe.i(rv4Var, pna.h(zbe.x(kq7Var, rh8Var), 12.0f));
            cvb.c(yqe.A((y3b) b3b.d0.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, k);
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
            nq7 k2 = tte.k(kq7Var, r0f.z(rv4Var).a);
            long g = rm1.g(r0f.y(rv4Var), 1.0f);
            ba5 ba5Var = lre.g;
            l0e.n(null, yqe.A((y3b) f3b.I.getValue(), rv4Var), yqe.A((y3b) f3b.J.getValue(), rv4Var), zbe.y(nmd.v(k2, g, ba5Var), 16.0f), false, p58Var.a, xt4Var, rv4Var, (i12 << 9) & 3670016, 17);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.n(null, yqe.A((y3b) f3b.L.getValue(), rv4Var), yqe.A((y3b) f3b.M.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), false, p58Var.b, xt4Var2, rv4Var, (i12 << 6) & 3670016, 17);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.n(null, yqe.A((y3b) f3b.N.getValue(), rv4Var), yqe.A((y3b) f3b.O.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), false, p58Var.c, xt4Var3, rv4Var, (i12 << 3) & 3670016, 17);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            cvb.c(yqe.A((y3b) f3b.g0.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k3 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, k3);
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
            nq7 g2 = c16.g(pna.f(kq7Var, 1.0f), null, 3);
            xn1 a5 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, g2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a5);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            l0e.n(null, yqe.A((y3b) f3b.P.getValue(), rv4Var), yqe.A((y3b) f3b.Q.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), false, p58Var.d, xt4Var4, rv4Var, i12 & 3670016, 17);
            xt4Var7 = xt4Var5;
            xt4Var8 = xt4Var6;
            rte.e(p58Var.d, null, null, null, null, jce.E(-1391323738, new ld1(29, p58Var, xt4Var7, xt4Var8), rv4Var), rv4Var, 1572870, 30);
            rv4Var2 = rv4Var;
            hl5.v(rv4Var2, true, true, true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new dr0(p58Var, rh8Var, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var7, xt4Var8, i);
        }
    }

    public static final void q(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-1048507522);
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
                n58 n58Var = (n58) ((fdd) voe.z(cm9.a(n58.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                rv4Var2 = rv4Var;
                fxe.h(yqe.A((y3b) f3b.H.getValue(), rv4Var), pna.c, false, jce.E(-1707527174, new h64(cz7Var, 22), rv4Var), null, null, jce.E(1766360777, new u32(5, n58Var, jsc.z(n58Var.e, rv4Var)), rv4Var), rv4Var2, 1575984, 52);
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
            u.d = new h64(cz7Var, i, 23);
        }
    }

    public static final void r(String str, String str2, String str3, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        pb2 pb2Var;
        str.getClass();
        vt4Var2.getClass();
        rv4Var.g0(1538794895);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var.f(nq7Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(vt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(vt4Var2)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i7;
        boolean z3 = true;
        if ((74899 & i13) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i13 & 1, z)) {
            String o = eub.o(str, "-", str3);
            if ((i13 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i13 & 896) != 256) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z4 || P == obj) {
                P = new m43(str, str3, 3);
                rv4Var.o0(P);
            }
            vt4 vt4Var3 = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(cta.class);
                cta ctaVar = (cta) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", o), pb2Var2, a3, vt4Var3));
                boolean f = rv4Var.f(ctaVar);
                Object P2 = rv4Var.P();
                if (f || P2 == obj) {
                    P2 = new usa(ctaVar, 0);
                    rv4Var.o0(P2);
                }
                tte.d(ctaVar, null, (xt4) P2, rv4Var, 0);
                aw7 z5 = jsc.z(ctaVar.W, rv4Var);
                if (((ysa) z5.getValue()).a) {
                    rv4Var.e0(2053360265);
                    e(pna.f(nq7Var, 1.0f), rv4Var, 0);
                    rv4Var.q(false);
                } else if (((ysa) z5.getValue()).d) {
                    rv4Var.e0(2053469509);
                    c((i13 >> 9) & Token.ASSIGN_MOD, vt4Var, rv4Var, pna.f(nq7Var, 1.0f));
                    rv4Var.q(false);
                } else if (!((ysa) z5.getValue()).c.isEmpty()) {
                    rv4Var.e0(2053660562);
                    b(str2, ((ysa) z5.getValue()).c, pna.f(nq7Var, 1.0f), vt4Var2, rv4Var, ((i13 >> 3) & 14) | ((i13 >> 6) & 7168));
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(2053882739);
                    rv4Var.q(false);
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bn7(str, str2, str3, nq7Var, vt4Var, vt4Var2, i);
        }
    }

    public static final void s(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >> 24) & 255);
        bArr[i + 1] = (byte) ((i2 >> 16) & 255);
        bArr[i + 2] = (byte) ((i2 >> 8) & 255);
        bArr[i + 3] = (byte) (i2 & 255);
    }

    public static final void t(aj2 aj2Var, xt4[] xt4VarArr, xt4 xt4Var) {
        aj2Var.getClass();
        if (aj2Var instanceof e1) {
            e1 e1Var = (e1) aj2Var;
            xt4[] xt4VarArr2 = (xt4[]) Arrays.copyOf(xt4VarArr, xt4VarArr.length);
            jsc.u(1, xt4Var);
            ArrayList arrayList = new ArrayList(xt4VarArr2.length);
            for (xt4 xt4Var2 : xt4VarArr2) {
                e1 h = e1Var.h();
                xt4Var2.invoke(h);
                arrayList.add(new ny1(h.b().a));
            }
            e1 h2 = e1Var.h();
            xt4Var.invoke(h2);
            e1Var.b().a(new tc(new ny1(h2.b().a), arrayList));
            return;
        }
        vs.k("impossible");
    }

    public static final void u(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
        } else if (cls.equals(Integer.TYPE)) {
            sb.append("I");
        } else if (cls.equals(Long.TYPE)) {
            sb.append("J");
        } else if (cls.equals(Short.TYPE)) {
            sb.append("S");
        } else if (cls.equals(Byte.TYPE)) {
            sb.append("B");
        } else if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
        } else if (cls.equals(Character.TYPE)) {
            sb.append("C");
        } else if (cls.equals(Float.TYPE)) {
            sb.append("F");
        } else if (cls.equals(Double.TYPE)) {
            sb.append("D");
        } else {
            sb.append("L");
            String replace = cls.getName().replace('.', '/');
            replace.getClass();
            sb.append((CharSequence) replace);
            sb.append(";");
        }
    }

    public static final void v(jq6 jq6Var, xq4 xq4Var) {
        if (xq4Var instanceof ri0) {
            jq6Var.add(((ri0) xq4Var).a);
        } else if (xq4Var instanceof ny1) {
            for (v38 v38Var : ((ny1) xq4Var).a) {
                v(jq6Var, v38Var);
            }
        } else if (!(xq4Var instanceof f02)) {
            if (xq4Var instanceof gla) {
                v(jq6Var, ((gla) xq4Var).a);
            } else if (xq4Var instanceof tc) {
                tc tcVar = (tc) xq4Var;
                v(jq6Var, tcVar.a);
                ArrayList arrayList = tcVar.b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    v(jq6Var, (xq4) obj);
                }
            } else if (xq4Var instanceof ue8) {
                v(jq6Var, ((ue8) xq4Var).b);
            } else {
                xk5.o();
            }
        }
    }

    public static final void w(aj2 aj2Var, char c2) {
        aj2Var.getClass();
        String valueOf = String.valueOf(c2);
        valueOf.getClass();
        ((e1) aj2Var).b().a(new f02(valueOf));
    }

    public static final v72 x(int i, int i2, rv4 rv4Var) {
        if (i2 <= 1) {
            rv4Var.e0(192977863);
            v72 v72Var = ((h27) rv4Var.j(j27.a)).c.d;
            rv4Var.q(false);
            return v72Var;
        } else if (i == 0) {
            rv4Var.e0(1687402259);
            tza tzaVar = j27.a;
            v72 d2 = v72.d(((h27) rv4Var.j(tzaVar)).c.d, null, null, ((h27) rv4Var.j(tzaVar)).c.a.c, ((h27) rv4Var.j(tzaVar)).c.a.d, 3);
            rv4Var.q(false);
            return d2;
        } else if (i == i2 - 1) {
            rv4Var.e0(192985923);
            tza tzaVar2 = j27.a;
            v72 d3 = v72.d(((h27) rv4Var.j(tzaVar2)).c.d, ((h27) rv4Var.j(tzaVar2)).c.a.a, ((h27) rv4Var.j(tzaVar2)).c.a.b, null, null, 12);
            rv4Var.q(false);
            return d3;
        } else {
            rv4Var.e0(192991052);
            v72 v72Var2 = ((h27) rv4Var.j(j27.a)).c.a;
            rv4Var.q(false);
            return v72Var2;
        }
    }

    public Typeface A(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface B(Context context, Resources resources, int i, String str, int i2) {
        File h0 = hbe.h0(context);
        if (h0 == null) {
            return null;
        }
        try {
            if (!hbe.d0(h0, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(h0.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            h0.delete();
        }
    }

    public abstract Typeface y(Context context, kp4 kp4Var, Resources resources, int i);

    public abstract Typeface z(Context context, fq4[] fq4VarArr, int i);
}
