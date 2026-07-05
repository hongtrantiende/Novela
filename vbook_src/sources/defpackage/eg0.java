package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eg0  reason: default package */
/* loaded from: classes.dex */
public abstract class eg0 {
    public static ExecutorService a;
    public static final m42[] b = new m42[0];
    public static final tu1 c = new tu1(new wu1(21), false, 1277340654);
    public static final tu1 d = new tu1(new mv1(0), false, 1152858937);
    public static final tu1 e = new tu1(new kv1(28), false, -1554261322);
    public static final tu1 f = new tu1(new kv1(29), false, 1561709139);
    public static final tu1 g = new tu1(new mv1(1), false, 1183190351);
    public static final tu1 h = new tu1(new nv1(0), false, -984436710);
    public static final tu1 i = new tu1(new nv1(1), false, 425654941);
    public static final tu1 j = new tu1(new mv1(2), false, -473090783);

    public static final long A(long j2) {
        return (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static String B() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            String language2 = locale2.getLanguage();
            if (language2 != null) {
                sb.append(language2);
                String country2 = locale2.getCountry();
                if (country2 != null) {
                    sb.append("-");
                    sb.append(country2);
                }
            }
        }
        return sb.toString();
    }

    public static final void a(String str, cz7 cz7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(1034617446);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (rv4Var.f(cz7Var)) {
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
            Object[] objArr = new Object[0];
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new op0(str, 1);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 0);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new mf0(9);
                rv4Var.o0(P2);
            }
            aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
            fxe.h(yqe.B((y3b) b3b.R.getValue(), new Object[]{(String) aw7Var.getValue()}, rv4Var), null, false, jce.E(1809463266, new p7(cz7Var, 4), rv4Var), jce.E(1974936651, new mr3(aw7Var2, 3), rv4Var), null, jce.E(-1034448399, new or0(cz7Var, aw7Var, 0), rv4Var), rv4Var, 1600512, 38);
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            String str2 = (String) aw7Var.getValue();
            String A = yqe.A((y3b) b3b.P.getValue(), rv4Var);
            boolean f2 = rv4Var.f(aw7Var2);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj) {
                P3 = new s7(aw7Var2, 12);
                rv4Var.o0(P3);
            }
            xt4 xt4Var = (xt4) P3;
            boolean f3 = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
            Object P4 = rv4Var.P();
            if (f3 || P4 == obj) {
                P4 = new pr0(aw7Var2, aw7Var, 0);
                rv4Var.o0(P4);
            }
            wq9.f(booleanValue, str2, A, xt4Var, (xt4) P4, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var, i2, 1);
        }
    }

    public static final void b(nq7 nq7Var, long j2, long j3, wea weaVar, List list, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        wea weaVar2;
        List list2;
        wea a2;
        int i5;
        List list3;
        rv4Var.g0(663218740);
        if (rv4Var.e(j2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i2 | i3;
        if (rv4Var.e(j3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4 | 9216;
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i5 = i7 & (-64513);
                a2 = weaVar;
                list3 = list;
            } else {
                float f2 = ms6.a;
                a2 = pfa.a(ch0.m, rv4Var);
                i5 = i7 & (-64513);
                list3 = ms6.c;
            }
            rv4Var.r();
            g(nq7Var, j2, j3, a2, list3, rv4Var, 65534 & i5);
            weaVar2 = a2;
            list2 = list3;
        } else {
            rv4Var.X();
            weaVar2 = weaVar;
            list2 = list;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rb(nq7Var, j2, j3, weaVar2, list2, i2, 1);
        }
    }

    public static final void c(final vt4 vt4Var, final nq7 nq7Var, final long j2, final long j3, wea weaVar, List list, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        final wea weaVar2;
        final List list2;
        wea a2;
        int i7;
        List list3;
        rv4Var.g0(1484812328);
        if (rv4Var.h(vt4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.e(j2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var.e(j3)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6 | 73728;
        if ((74899 & i11) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i7 = i11 & (-516097);
                a2 = weaVar;
                list3 = list;
            } else {
                float f2 = ms6.a;
                a2 = pfa.a(ch0.m, rv4Var);
                i7 = i11 & (-516097);
                list3 = ms6.d;
            }
            rv4Var.r();
            wea weaVar3 = a2;
            h(vt4Var, nq7Var, j2, j3, weaVar3, list3, rv4Var, i7 & 524286);
            weaVar2 = weaVar3;
            list2 = list3;
        } else {
            rv4Var.X();
            weaVar2 = weaVar;
            list2 = list;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(nq7Var, j2, j3, weaVar2, list2, i2) { // from class: ps6
                public final /* synthetic */ nq7 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ wea e;
                public final /* synthetic */ List f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    eg0.c(vt4.this, this.b, this.c, this.d, this.e, this.f, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void d(boolean z, lbd lbdVar, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        nq7 nq7Var2;
        long g2;
        long j2;
        long j3;
        long j4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-257227393);
        if (rv4Var2.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var2.f(lbdVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4 | 384;
        if (rv4Var2.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i8 & 1, z2)) {
            v72 v72Var = r0f.z(rv4Var2).c;
            nq7Var2 = kq7.a;
            nq7 f2 = lbe.f(14, vt4Var, tte.k(nq7Var2, v72Var), null, !z);
            if (z) {
                rv4Var2.e0(-839268262);
                g2 = r0f.y(rv4Var2).a;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-839189212);
                g2 = rm1.g(r0f.y(rv4Var2), 3.0f);
                rv4Var2.q(false);
            }
            nq7 z3 = zbe.z(nmd.v(f2, g2, lre.g), 8.0f, 16.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z3);
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
            if (z) {
                rv4Var2.e0(-982851915);
                if (z) {
                    rv4Var2.e0(-982775748);
                    j4 = r0f.y(rv4Var2).b;
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(-982695396);
                    j4 = r0f.y(rv4Var2).q;
                    rv4Var2.q(false);
                }
                tl1.l(j4, 2.0f, 0, pna.h(nq7Var2, 14.0f), rv4Var2, 3120, 4);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-982529484);
                ar5 c2 = rp5.c((wk3) ok3.N.getValue(), rv4Var2, 0);
                nq7 n = pna.n(nq7Var2, 14.0f);
                if (z) {
                    rv4Var2.e0(-982319428);
                    j2 = r0f.y(rv4Var2).b;
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(-982239076);
                    j2 = r0f.y(rv4Var2).q;
                    rv4Var2.q(false);
                }
                nk5.a(c2, null, n, j2, rv4Var2, 432, 0);
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.s(nq7Var2, 8.0f));
            String str = lbdVar.b;
            if (z) {
                rv4Var2.e0(-982007196);
                j3 = r0f.y(rv4Var2).b;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-981934780);
                j3 = r0f.y(rv4Var2).q;
                rv4Var2.q(false);
            }
            cvb.c(str, null, j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).j, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rd0(z, lbdVar, nq7Var2, vt4Var, i2, 19);
        }
    }

    public static final void e(ar5 ar5Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        kq7 kq7Var;
        int i4;
        int i5;
        rv4Var.g0(1177215240);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(ar5Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 48;
        if ((i2 & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i6 |= i4;
        }
        boolean z2 = true;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            nq7 k = tte.k(zbe.y(pna.n(kq7Var2, 36.0f), 4.0f), uu9.a);
            if ((i6 & 896) != 256) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new a3c(29, vt4Var);
                rv4Var.o0(P);
            }
            nq7 f2 = lbe.f(15, (vt4) P, k, null, false);
            tza tzaVar = j27.a;
            nk5.a(ar5Var, null, zbe.y(nmd.v(f2, zl1.b(0.1f, ((h27) rv4Var.j(tzaVar)).a.q), lre.g), 4.0f), ((h27) rv4Var.j(tzaVar)).a.q, rv4Var, (i6 & 14) | 48, 0);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x0c(ar5Var, kq7Var, vt4Var, i2, 1);
        }
    }

    public static final void f(nq7 nq7Var, long j2, List list, rv4 rv4Var, int i2, int i3) {
        int i4;
        boolean z;
        long j3;
        List list2;
        int i5;
        int i6;
        rv4Var.g0(387862047);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i6 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0 && rv4Var.e(j2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i2 & 384) == 0) {
            i4 |= Token.CASE;
        }
        if ((i4 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
            } else {
                if ((i3 & 2) != 0) {
                    float f2 = ms6.a;
                    j2 = rm1.e(ch0.h, rv4Var);
                    i4 &= -113;
                }
                list = ms6.c;
            }
            int i7 = i4 & (-897);
            long j4 = j2;
            List list3 = list;
            rv4Var.r();
            long j5 = zl1.i;
            float f3 = ms6.a;
            g(nq7Var, j5, j4, pfa.a(ch0.m, rv4Var), list3, rv4Var, (i7 & 14) | 48 | ((i7 << 3) & 896));
            j3 = j4;
            list2 = list3;
        } else {
            rv4Var.X();
            j3 = j2;
            list2 = list;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rh(i2, i3, j3, nq7Var, list2);
        }
    }

    public static final void g(nq7 nq7Var, long j2, final long j3, wea weaVar, List list, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        final lq lqVar;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(-1776169461);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.e(j2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.e(j3)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(weaVar)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(list)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if (list.size() > 1) {
                boolean f2 = rv4Var.f(list);
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (f2 || P == obj) {
                    P = v(list, true);
                    rv4Var.o0(P);
                }
                final List list2 = (List) P;
                boolean f3 = rv4Var.f(list);
                Object P2 = rv4Var.P();
                if (f3 || P2 == obj) {
                    P2 = Float.valueOf(r(list) * ms6.e);
                    rv4Var.o0(P2);
                }
                final float floatValue = ((Number) P2).floatValue();
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = tc4.a(nae.e, 0.01f);
                    rv4Var.o0(P3);
                }
                lq lqVar2 = (lq) P3;
                Object P4 = rv4Var.P();
                if (P4 == obj) {
                    P4 = hl5.g(90.0f, rv4Var);
                }
                final dm8 dm8Var = (dm8) P4;
                Object P5 = rv4Var.P();
                if (P5 == obj) {
                    P5 = tc4.a(nae.e, 0.01f);
                    rv4Var.o0(P5);
                }
                final lq lqVar3 = (lq) P5;
                boolean f4 = rv4Var.f(list);
                Object P6 = rv4Var.P();
                if (f4 || P6 == obj) {
                    P6 = new em8(0);
                    rv4Var.o0(P6);
                }
                final em8 em8Var = (em8) P6;
                boolean h2 = rv4Var.h(lqVar2) | rv4Var.f(em8Var) | rv4Var.h(list2) | rv4Var.h(lqVar3);
                Object P7 = rv4Var.P();
                if (!h2 && P7 != obj) {
                    lqVar = lqVar2;
                } else {
                    P7 = new ss6(lqVar2, list2, em8Var, dm8Var, lqVar3, null);
                    lqVar = lqVar2;
                    rv4Var.o0(P7);
                }
                yte.g((lu4) P7, rv4Var, list);
                Object P8 = rv4Var.P();
                if (P8 == obj) {
                    P8 = dk.a();
                    rv4Var.o0(P8);
                }
                final yj yjVar = (yj) P8;
                Object P9 = rv4Var.P();
                if (P9 == obj) {
                    Object l27Var = new l27(l27.a());
                    rv4Var.o0(l27Var);
                    P9 = l27Var;
                }
                final float[] fArr = ((l27) P9).a;
                nq7 v = nmd.v(tte.k(pna.p(y7a.c(nq7Var, true, new rg8(20)), ms6.a, ms6.b).a0(pna.c), weaVar), j2, lre.g);
                b37 d2 = fu0.d(kh5.e, false);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, v);
                rw1.k.getClass();
                vt4 vt4Var = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, d2);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                nq7 t = jsc.t(1.0f, kq7.a, true);
                boolean h3 = rv4Var.h(lqVar) | rv4Var.h(lqVar3) | rv4Var.h(list2) | rv4Var.f(em8Var) | rv4Var.h(yjVar) | rv4Var.c(floatValue) | rv4Var.h(fArr);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = h3 | z2;
                Object P10 = rv4Var.P();
                if (!z4 && P10 != obj) {
                    z3 = true;
                } else {
                    z3 = true;
                    Object obj2 = new xt4() { // from class: ns6
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj3) {
                            List list3 = list2;
                            yj yjVar2 = yjVar;
                            float f5 = floatValue;
                            float[] fArr2 = fArr;
                            long j4 = j3;
                            em8 em8Var2 = em8Var;
                            qd6 qd6Var = (qd6) obj3;
                            float floatValue2 = ((Number) lq.this.e()).floatValue();
                            float h4 = dm8Var.h();
                            float floatValue3 = ((Number) lqVar3.e()).floatValue() + h4 + (90.0f * floatValue2);
                            long b1 = qd6Var.a.b1();
                            n61 n61Var = qd6Var.a;
                            ij1 ij1Var = n61Var.b;
                            long G = ij1Var.G();
                            ij1Var.w().i();
                            try {
                                ((mu9) ij1Var.b).z(floatValue3, b1);
                                yz1.z((ir7) list3.get(em8Var2.h()), floatValue2, yjVar2);
                                ak3.t1(qd6Var, eg0.x(yjVar2, n61Var.b(), f5, fArr2), j4, nae.e, ye4.a, 52);
                                rs8.r(ij1Var, G);
                                return pvc.a;
                            } catch (Throwable th) {
                                rs8.r(ij1Var, G);
                                throw th;
                            }
                        }
                    };
                    rv4Var.o0(obj2);
                    P10 = obj2;
                }
                xbe.i(rv4Var, ote.t(t, (xt4) P10));
                rv4Var.q(z3);
            } else {
                vs.m("indicatorPolygons should have, at least, two RoundedPolygons");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new os6(nq7Var, j2, j3, weaVar, list, i2);
        }
    }

    public static final void h(final vt4 vt4Var, final nq7 nq7Var, final long j2, final long j3, final wea weaVar, final List list, rv4 rv4Var, final int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(-227757249);
        if ((i2 & 6) == 0) {
            if (rv4Var.h(vt4Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.e(j2)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.e(j3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.f(weaVar)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var.h(list)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if (list.size() > 1) {
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (z2 || P == obj) {
                    P = new ge5(17, vt4Var);
                    rv4Var.o0(P);
                }
                final vt4 vt4Var2 = (vt4) P;
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = dk.a();
                    rv4Var.o0(P2);
                }
                final yj yjVar = (yj) P2;
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    Object l27Var = new l27(l27.a());
                    rv4Var.o0(l27Var);
                    P3 = l27Var;
                }
                final float[] fArr = ((l27) P3).a;
                boolean f2 = rv4Var.f(list);
                Object P4 = rv4Var.P();
                if (f2 || P4 == obj) {
                    Object v = v(list, false);
                    rv4Var.o0(v);
                    P4 = v;
                }
                final List list2 = (List) P4;
                boolean f3 = rv4Var.f(list2);
                Object P5 = rv4Var.P();
                if (f3 || P5 == obj) {
                    P5 = Float.valueOf(r(list) * ms6.e);
                    rv4Var.o0(P5);
                }
                final float floatValue = ((Number) P5).floatValue();
                boolean f4 = rv4Var.f(vt4Var2);
                Object P6 = rv4Var.P();
                if (f4 || P6 == obj) {
                    P6 = new nv(10, vt4Var2);
                    rv4Var.o0(P6);
                }
                nq7 v2 = nmd.v(tte.k(pna.p(y7a.c(nq7Var, true, (xt4) P6), ms6.a, ms6.b).a0(pna.c), weaVar), j2, lre.g);
                b37 d2 = fu0.d(kh5.e, false);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, v2);
                rw1.k.getClass();
                vt4 vt4Var3 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var3);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, d2);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                nq7 t = jsc.t(1.0f, kq7.a, true);
                boolean f5 = rv4Var.f(vt4Var2) | rv4Var.h(list2) | rv4Var.h(yjVar) | rv4Var.c(floatValue) | rv4Var.h(fArr);
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z4 = f5 | z3;
                Object P7 = rv4Var.P();
                if (z4 || P7 == obj) {
                    Object obj2 = new xt4() { // from class: qs6
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj3) {
                            long j4;
                            yj yjVar2 = yjVar;
                            float f6 = floatValue;
                            float[] fArr2 = fArr;
                            long j5 = j3;
                            qd6 qd6Var = (qd6) obj3;
                            float floatValue2 = ((Number) vt4.this.invoke()).floatValue();
                            List list3 = list2;
                            int size = (int) (list3.size() * floatValue2);
                            int size2 = list3.size() - 1;
                            if (size > size2) {
                                size = size2;
                            }
                            float f7 = 1.0f;
                            if (floatValue2 != 1.0f || size != list3.size() - 1) {
                                f7 = (list3.size() * floatValue2) % 1.0f;
                            }
                            float f8 = (-floatValue2) * 180.0f;
                            n61 n61Var = qd6Var.a;
                            n61 n61Var2 = qd6Var.a;
                            long b1 = n61Var.b1();
                            ij1 ij1Var = n61Var2.b;
                            long G = ij1Var.G();
                            ij1Var.w().i();
                            try {
                                ((mu9) ij1Var.b).z(f8, b1);
                                yz1.z((ir7) list3.get(size), f7, yjVar2);
                                yj x = eg0.x(yjVar2, n61Var2.b(), f6, fArr2);
                                j4 = G;
                                try {
                                    ak3.t1(qd6Var, x, j5, nae.e, ye4.a, 52);
                                    rs8.r(ij1Var, j4);
                                    return pvc.a;
                                } catch (Throwable th) {
                                    th = th;
                                    rs8.r(ij1Var, j4);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j4 = G;
                            }
                        }
                    };
                    rv4Var.o0(obj2);
                    P7 = obj2;
                }
                xbe.i(rv4Var, ote.t(t, (xt4) P7));
                rv4Var.q(true);
            } else {
                vs.m("indicatorPolygons should have, at least, two RoundedPolygons");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: rs6
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    eg0.h(vt4.this, nq7Var, j2, j3, weaVar, list, (rv4) obj3, xoe.p(i2 | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(final boolean z, final boolean z2, final String str, final List list, final p6d p6dVar, final xt4 xt4Var, final xt4 xt4Var2, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final xt4 xt4Var3, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        list.getClass();
        p6dVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var2.g0(-2020880195);
        char c2 = 4;
        if (rv4Var2.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        if (rv4Var2.g(z2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        if (rv4Var2.f(str)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i15 = i14 | i5;
        if (rv4Var2.f(list)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (rv4Var2.f(p6dVar)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if (rv4Var2.h(xt4Var)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i18 = i17 | i8;
        if (rv4Var2.h(xt4Var2)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        if (rv4Var2.h(vt4Var)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i20 = i19 | i10;
        if (rv4Var2.h(vt4Var2)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i21 = i20 | i11;
        if (rv4Var2.h(vt4Var3)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i22 = i21 | i12;
        if (!rv4Var2.h(xt4Var3)) {
            c2 = 2;
        }
        if ((306783379 & i22) == 306783378 && (c2 & 3) == 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var2.U(i22 & 1, z3)) {
            if (z2) {
                rv4Var2.e0(-1484868854);
                nmd.f(z, xt4Var, null, false, 0L, 0L, nae.e, 0L, nae.e, jce.E(-405177271, new f07(str, list, p6dVar, xt4Var2, vt4Var, vt4Var2, vt4Var3, xt4Var3, 1), rv4Var2), rv4Var, (i22 & 14) | 805306368 | ((i22 >> 12) & Token.ASSIGN_MOD), 508);
                rv4Var.q(false);
                rv4Var2 = rv4Var;
            } else {
                rv4Var2.e0(-1484225201);
                ze4 ze4Var = pna.c;
                tu1 E = jce.E(1582175031, new y2c(z, xt4Var, str, list, p6dVar, xt4Var2, vt4Var, vt4Var2, vt4Var3, xt4Var3), rv4Var2);
                rv4Var2 = rv4Var2;
                hc2.b(ze4Var, null, E, rv4Var2, 3078, 6);
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(z, z2, str, list, p6dVar, xt4Var, xt4Var2, vt4Var, vt4Var2, vt4Var3, xt4Var3, i2) { // from class: z7d
                public final /* synthetic */ xt4 C;
                public final /* synthetic */ vt4 D;
                public final /* synthetic */ vt4 E;
                public final /* synthetic */ vt4 F;
                public final /* synthetic */ xt4 G;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ String c;
                public final /* synthetic */ List d;
                public final /* synthetic */ p6d e;
                public final /* synthetic */ xt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    eg0.i(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void j(String str, nk0 nk0Var, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        boolean z3;
        rv4Var.g0(104069490);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var.f(nk0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.f(nq7Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i8 = i7 | i5;
        if ((i8 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            WeakHashMap weakHashMap = yjd.w;
            rp rpVar = h88.n(rv4Var).b;
            r13 r13Var = (r13) rv4Var.j(dy1.h);
            if (rpVar.e().b == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            b37 d2 = fu0.d(kh5.a, false);
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
            jce.F(npVar, rv4Var, d2);
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
            nq7 a2 = pu0.a.a(pna.j(pna.f(kq7Var, 1.0f), 20.0f, nae.e, 2), nk0Var);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, a2);
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
            cvb.c(str, new we6(1.0f, true), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r0f.A(rv4Var).n, rv4Var, i8 & 14, 24960, 110584);
            rv4Var2 = rv4Var;
            if (z2) {
                rv4Var2.e0(-48801458);
                Object P = rv4Var2.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    Context context = twe.e;
                    context.getClass();
                    P = new df(context);
                    rv4Var2.o0(P);
                }
                df dfVar = (df) P;
                Object P2 = rv4Var2.P();
                if (P2 == lh9Var) {
                    P2 = yae.z(-1);
                    rv4Var2.o0(P2);
                }
                aw7 aw7Var = (aw7) P2;
                boolean h2 = rv4Var2.h(dfVar);
                Object P3 = rv4Var2.P();
                if (h2 || P3 == lh9Var) {
                    P3 = new qkb(dfVar, aw7Var, (m42) null, 11);
                    rv4Var2.o0(P3);
                }
                yte.g((lu4) P3, rv4Var2, dfVar);
                Object P4 = rv4Var2.P();
                if (P4 == lh9Var) {
                    P4 = yae.z(zj1.f(zj1.n(), "HH:mm"));
                    rv4Var2.o0(P4);
                }
                aw7 aw7Var2 = (aw7) P4;
                Object P5 = rv4Var2.P();
                if (P5 == lh9Var) {
                    P5 = new koa(aw7Var2, null, 26);
                    rv4Var2.o0(P5);
                }
                yte.g((lu4) P5, rv4Var2, pvc.a);
                cvb.c((String) aw7Var2.getValue(), null, r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).n, rv4Var, 0, 0, 131066);
                rv4Var2 = rv4Var;
                if (((Number) aw7Var.getValue()).intValue() >= 0) {
                    rv4Var2.e0(-47789959);
                    cvb.c("|", zbe.A(kq7Var, 4.0f, nae.e, 2), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).n, rv4Var, 54, 0, 131064);
                    cvb.c(((Number) aw7Var.getValue()).intValue() + "%", null, r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).n, rv4Var, 0, 0, 131066);
                    rv4Var2 = rv4Var;
                    z3 = false;
                    rv4Var2.q(false);
                } else {
                    z3 = false;
                    rv4Var2.e0(-47266214);
                    rv4Var2.q(false);
                }
                rv4Var2.q(z3);
            } else {
                rv4Var2.e0(-47252326);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vg7(str, nk0Var, nq7Var, i2, 22);
        }
    }

    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    public static final void k(p6d p6dVar, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        xt4 xt4Var2;
        vt4 vt4Var5;
        vt4 vt4Var6;
        Object obj;
        boolean z2;
        float f2;
        ?? r3;
        vt4 vt4Var7;
        wk3 wk3Var;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        p6d p6dVar2 = p6dVar;
        Object obj2 = vt4Var4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1831659051);
        if ((i2 & 6) == 0) {
            if (rv4Var2.f(p6dVar2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var2.h(obj2)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i3 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            int i11 = i3 >> 3;
            mk0 mk0Var = kh5.F;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 0);
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
            String str = p6dVar2.a;
            String str2 = p6dVar2.b;
            String str3 = p6dVar2.d;
            String str4 = p6dVar2.e;
            u22 u22Var = r0f.d;
            kq7 kq7Var = kq7.a;
            nq7 h2 = pna.h(pna.s(kq7Var, 40.0f), 60.0f);
            boolean z5 = p6dVar2.l;
            int i12 = i3;
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new a3c(28, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 b2 = q1d.b(h2, z5, nae.e, (vt4) P, 2);
            tza tzaVar = j27.a;
            do5.c(str, str2, str3, str4, u22Var, tte.k(b2, ((h27) rv4Var2.j(tzaVar)).c.a), rv4Var2, 24576);
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            we6 we6Var = new we6(f2, true);
            xn1 a3 = wn1.a(lz.e, kh5.I, rv4Var2, 6);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, we6Var);
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
            float f3 = 1.0f;
            cvb.c(p6dVar2.b, pna.f(kq7Var, 1.0f), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 48, 24960, 109560);
            nq7 f4 = pna.f(kq7Var, 1.0f);
            gv9 a4 = ev9.a(dzVar, kh5.G, rv4Var, 48);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f4);
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
            p6dVar2 = p6dVar;
            String str5 = p6dVar2.c;
            long j2 = ((h27) rv4Var.j(tzaVar)).a.q;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.l;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            cvb.c(str5, lpe.m(new we6(f3, true), 0.8f), j2, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, oybVar, rv4Var, 0, 24960, 109560);
            rv4Var2 = rv4Var;
            if (p6dVar2.n) {
                rv4Var2.e0(596228515);
                r3 = 0;
                vt4Var6 = vt4Var2;
                e(rp5.c((wk3) ok3.d0.getValue(), rv4Var2, 0), null, vt4Var6, rv4Var2, i11 & 896);
                rv4Var2.q(false);
            } else {
                vt4Var6 = vt4Var2;
                r3 = 0;
                rv4Var2.e0(596424559);
                rv4Var2.q(false);
            }
            if (!p6dVar2.j) {
                rv4Var2.e0(596474531);
                vt4Var7 = vt4Var4;
                e(rp5.c((wk3) ok3.c0.getValue(), rv4Var2, r3), null, vt4Var7, rv4Var2, (i12 >> 9) & 896);
                rv4Var2.q(r3);
            } else {
                vt4Var7 = vt4Var4;
                rv4Var2.e0(596670575);
                rv4Var2.q(r3);
            }
            if (p6dVar2.i) {
                rv4Var2.e0(596728111);
                if (p6dVar2.k) {
                    wk3Var = (wk3) ok3.S.getValue();
                } else {
                    wk3Var = (wk3) ok3.T.getValue();
                }
                ar5 c2 = rp5.c(wk3Var, rv4Var2, r3);
                if ((i12 & 3670016) == 1048576) {
                    z3 = true;
                } else {
                    z3 = r3;
                }
                if ((i12 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = r3;
                }
                boolean z6 = z4 | z3;
                Object P2 = rv4Var2.P();
                if (!z6 && P2 != lh9Var) {
                    xt4Var2 = xt4Var;
                } else {
                    xt4Var2 = xt4Var;
                    P2 = new a0b(26, xt4Var2, p6dVar2);
                    rv4Var2.o0(P2);
                }
                e(c2, null, (vt4) P2, rv4Var2, r3);
                rv4Var2.q(r3);
            } else {
                xt4Var2 = xt4Var;
                rv4Var2.e0(597189391);
                rv4Var2.q(r3);
            }
            if (p6dVar2.m) {
                rv4Var2.e0(597246555);
                vt4Var5 = vt4Var3;
                e(rp5.c((wk3) jk3.x.getValue(), rv4Var2, r3), null, vt4Var5, rv4Var2, (i12 >> 6) & 896);
                rv4Var2.q(r3);
            } else {
                vt4Var5 = vt4Var3;
                rv4Var2.e0(597450287);
                rv4Var2.q(r3);
            }
            hl5.v(rv4Var2, true, true, true);
            obj = vt4Var7;
        } else {
            xt4Var2 = xt4Var;
            vt4Var5 = vt4Var3;
            vt4Var6 = vt4Var2;
            rv4Var2.X();
            obj = obj2;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i81(p6dVar2, nq7Var, vt4Var, vt4Var6, vt4Var5, obj, xt4Var2, i2, 14);
        }
    }

    public static final void l(String str, List list, p6d p6dVar, xt4 xt4Var, nq7 nq7Var, rh8 rh8Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        th8 th8Var;
        vt4 vt4Var5;
        boolean z2;
        boolean z3;
        vt4 vt4Var6;
        int i11;
        int i12;
        boolean z4;
        boolean z5;
        boolean z6;
        int i13;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        list.getClass();
        p6dVar.getClass();
        xt4Var.getClass();
        rv4Var2.g0(-2084890563);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i14 = i3 | i2;
        if (rv4Var2.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i15 = i14 | i4;
        if (rv4Var2.f(p6dVar)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i16 = i15 | i5;
        if (rv4Var2.h(xt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i17 = i16 | i6;
        if ((i2 & 24576) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i17 |= i13;
        }
        int i18 = i17 | 1769472;
        if (rv4Var2.h(vt4Var2)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i19 = i18 | i7;
        if (rv4Var2.h(vt4Var3)) {
            i8 = 67108864;
        } else {
            i8 = 33554432;
        }
        int i20 = i19 | i8;
        if (rv4Var2.h(vt4Var4)) {
            i9 = 536870912;
        } else {
            i9 = 268435456;
        }
        int i21 = i20 | i9;
        if (rv4Var2.h(xt4Var2)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i22 = i10;
        if ((i21 & 306783379) == 306783378 && (i22 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var2.U(i21 & 1, z)) {
            th8 th8Var2 = new th8(nae.e, nae.e, nae.e, nae.e);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new cd1(15);
                rv4Var2.o0(P);
            }
            vt4 vt4Var7 = (vt4) P;
            int i23 = i21 & Token.ASSIGN_MOD;
            if (i23 != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z7 = z2;
            if ((i21 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z7 | z3;
            Object P2 = rv4Var2.P();
            if (!z8 && P2 != lh9Var) {
                vt4Var6 = vt4Var7;
            } else {
                Iterator it = list.iterator();
                int i24 = 0;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = it;
                        ArrayList arrayList = ((pad) it.next()).b;
                        if (arrayList.isEmpty()) {
                            i12 = i24;
                            vt4Var6 = vt4Var7;
                        } else {
                            i12 = i24;
                            int size = arrayList.size();
                            vt4Var6 = vt4Var7;
                            int i25 = 0;
                            while (i25 < size) {
                                Object obj = arrayList.get(i25);
                                i25++;
                                ArrayList arrayList2 = arrayList;
                                if (c16.i(((lbd) obj).a, str)) {
                                    i11 = i12;
                                    break loop0;
                                }
                                arrayList = arrayList2;
                            }
                            continue;
                        }
                        i24 = i12 + 1;
                        it = it2;
                        vt4Var7 = vt4Var6;
                    } else {
                        vt4Var6 = vt4Var7;
                        i11 = -1;
                        break;
                    }
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                P2 = Integer.valueOf(i11);
                rv4Var2.o0(P2);
            }
            int intValue = ((Number) P2).intValue();
            if (i23 != 32) {
                z4 = false;
            } else {
                z4 = true;
            }
            Object P3 = rv4Var2.P();
            if (z4 || P3 == lh9Var) {
                P3 = new k71(14, list);
                rv4Var2.o0(P3);
            }
            iw2 b2 = uj8.b(intValue, (vt4) P3, rv4Var2, 0, 2);
            int i26 = i21 >> 12;
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
            rv4Var2.e0(1625525920);
            kq7 kq7Var = kq7.a;
            vt4 vt4Var8 = vt4Var6;
            k(p6dVar, zbe.z(zbe.x(pna.f(kq7Var, 1.0f), th8Var2), 16.0f, 12.0f), vt4Var8, vt4Var2, vt4Var3, vt4Var4, xt4Var2, rv4Var2, (i26 & 458752) | ((i21 >> 6) & 14) | 384 | (i26 & 7168) | (57344 & i26) | ((i22 << 18) & 3670016));
            if (list.size() > 1) {
                rv4Var2.e0(1625945938);
                o(b2, list, zbe.z(pna.f(kq7Var, 1.0f), 18.0f, 8.0f), rv4Var2, i23 | 384);
                z5 = false;
                rv4Var2.q(false);
            } else {
                z5 = false;
                rv4Var2.e0(1626189071);
                rv4Var2.q(false);
            }
            if (list.isEmpty()) {
                rv4Var2.q(z5);
                z6 = true;
            } else {
                z6 = true;
                kxe.c(b2, rs8.e(1.0f, pna.f(kq7Var, 1.0f), true), null, null, 0, nae.e, null, null, false, null, null, null, null, jce.E(-1140654668, new cs1(24, str, list, xt4Var), rv4Var2), rv4Var, 0, 24576, 16380);
                rv4Var2 = rv4Var;
                rv4Var2.q(z5);
            }
            rv4Var2.q(z6);
            th8Var = th8Var2;
            vt4Var5 = vt4Var8;
        } else {
            rv4Var2.X();
            th8Var = rh8Var;
            vt4Var5 = vt4Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new hf3(str, list, p6dVar, xt4Var, nq7Var, th8Var, vt4Var5, vt4Var2, vt4Var3, vt4Var4, xt4Var2, i2);
        }
    }

    public static final void m(String str, ArrayList arrayList, xt4 xt4Var, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        String str2;
        xt4 xt4Var2;
        aw7 aw7Var;
        boolean z2;
        lu4 bybVar;
        lh9 lh9Var;
        aw7 aw7Var2;
        char c2;
        boolean z3;
        aw7 aw7Var3;
        ArrayList arrayList2;
        String str3;
        boolean z4;
        Object[] objArr;
        int i6;
        aw7 aw7Var4;
        aw7 aw7Var5;
        qg6 qg6Var;
        aw7 aw7Var6;
        aw7 aw7Var7;
        np npVar;
        np npVar2;
        zx1 zx1Var;
        lh9 lh9Var2;
        int i7;
        th8 th8Var;
        boolean z5;
        np npVar3;
        kq7 kq7Var;
        boolean z6;
        kg kgVar;
        boolean z7;
        boolean z8;
        boolean z9;
        aw7 aw7Var8;
        float f2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1900146157);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var2.f(arrayList)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i10 & 1, z)) {
            Object[] objArr2 = new Object[0];
            Object P = rv4Var2.P();
            lh9 lh9Var3 = ax1.a;
            if (P == lh9Var3) {
                P = new u6d(4);
                rv4Var2.o0(P);
            }
            aw7 j2 = zpe.j(objArr2, (vt4) P, rv4Var2, 384);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var3) {
                P2 = yae.z(Boolean.FALSE);
                rv4Var2.o0(P2);
            }
            aw7 aw7Var9 = (aw7) P2;
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var3) {
                P3 = yae.z(arrayList);
                rv4Var2.o0(P3);
            }
            aw7 aw7Var10 = (aw7) P3;
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var3) {
                P4 = yae.z(-1);
                rv4Var2.o0(P4);
            }
            aw7 aw7Var11 = (aw7) P4;
            qg6 a2 = tg6.a(0, 3, rv4Var2);
            Object P5 = rv4Var2.P();
            if (P5 == lh9Var3) {
                P5 = yte.s(rv4Var2);
                rv4Var2.o0(P5);
            }
            m82 m82Var = (m82) P5;
            Object P6 = rv4Var2.P();
            if (P6 == lh9Var3) {
                P6 = yae.q(new vv0(a2, 5));
                rv4Var2.o0(P6);
            }
            yya yyaVar = (yya) P6;
            Object P7 = rv4Var2.P();
            if (P7 == lh9Var3) {
                P7 = yae.q(new vv0(a2, 6));
                rv4Var2.o0(P7);
            }
            yya yyaVar2 = (yya) P7;
            Object P8 = rv4Var2.P();
            if (P8 == lh9Var3) {
                aw7Var = j2;
                P8 = yae.q(new vh7(j2, aw7Var11, yyaVar2, yyaVar, 2));
                rv4Var2.o0(P8);
            } else {
                aw7Var = j2;
            }
            yya yyaVar3 = (yya) P8;
            Object P9 = rv4Var2.P();
            if (P9 == lh9Var3) {
                P9 = yae.q(new wh7(2, aw7Var, yyaVar));
                rv4Var2.o0(P9);
            }
            yya yyaVar4 = (yya) P9;
            Object P10 = rv4Var2.P();
            if (P10 == lh9Var3) {
                P10 = yae.q(new xh7(aw7Var, aw7Var10, yyaVar2, 2));
                rv4Var2.o0(P10);
            }
            yya yyaVar5 = (yya) P10;
            Object P11 = rv4Var2.P();
            if (P11 == lh9Var3) {
                P11 = yae.q(new cob(aw7Var10, aw7Var11, 3));
                rv4Var2.o0(P11);
            }
            yya yyaVar6 = (yya) P11;
            Boolean bool = (Boolean) aw7Var9.getValue();
            bool.getClass();
            boolean f3 = rv4Var2.f(aw7Var);
            if ((i10 & Token.ASSIGN_MOD) != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z10 = f3 | z2;
            Object P12 = rv4Var2.P();
            if (!z10 && P12 != lh9Var3) {
                aw7Var3 = aw7Var;
                c2 = 3;
                z3 = true;
                lh9Var = lh9Var3;
                arrayList2 = arrayList;
                bybVar = P12;
                aw7Var2 = aw7Var9;
            } else {
                aw7 aw7Var12 = aw7Var;
                lh9Var = lh9Var3;
                aw7Var2 = aw7Var9;
                c2 = 3;
                z3 = true;
                bybVar = new byb(aw7Var12, arrayList, aw7Var2, aw7Var10, (m42) null);
                aw7Var3 = aw7Var12;
                aw7Var10 = aw7Var10;
                arrayList2 = arrayList;
                rv4Var2.o0(bybVar);
            }
            yte.h(bool, arrayList2, bybVar, rv4Var2);
            Integer valueOf = Integer.valueOf(((List) aw7Var10.getValue()).size());
            lbd lbdVar = (lbd) sl1.e0((List) aw7Var10.getValue());
            if (lbdVar != null) {
                str3 = lbdVar.a;
            } else {
                str3 = null;
            }
            Boolean bool2 = (Boolean) aw7Var2.getValue();
            bool2.getClass();
            Object[] objArr3 = {str, valueOf, str3, bool2};
            int i11 = i10 & 14;
            if (i11 == 4) {
                z4 = z3;
            } else {
                z4 = false;
            }
            boolean f4 = z4 | rv4Var2.f(a2);
            Object P13 = rv4Var2.P();
            if (!f4 && P13 != lh9Var) {
                i6 = i11;
                aw7Var4 = aw7Var10;
                qg6Var = a2;
                aw7Var6 = aw7Var11;
                objArr = objArr3;
                aw7Var5 = aw7Var2;
            } else {
                objArr = objArr3;
                i6 = i11;
                aw7Var4 = aw7Var10;
                aw7Var5 = aw7Var2;
                byb bybVar2 = new byb(a2, aw7Var4, str, aw7Var11, (m42) null);
                qg6Var = a2;
                aw7Var6 = aw7Var11;
                rv4Var2.o0(bybVar2);
                P13 = bybVar2;
            }
            yte.j(objArr, (lu4) P13, rv4Var2);
            th8 g2 = mwe.g(8, rv4Var2);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar4 = qw1.f;
            jce.F(npVar4, rv4Var2, a3);
            np npVar5 = qw1.e;
            jce.F(npVar5, rv4Var2, l);
            Integer valueOf2 = Integer.valueOf(hashCode);
            np npVar6 = qw1.g;
            jce.F(npVar6, rv4Var2, valueOf2);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var2);
            np npVar7 = qw1.d;
            jce.F(npVar7, rv4Var2, p);
            int size = arrayList2.size();
            kq7 kq7Var2 = kq7.a;
            if (size > 10) {
                rv4Var2.e0(892544807);
                if (((Boolean) aw7Var5.getValue()).booleanValue()) {
                    f2 = 180.0f;
                } else {
                    f2 = 0.0f;
                }
                aw7Var7 = aw7Var4;
                kq7Var = kq7Var2;
                kgVar = kgVar2;
                yya b2 = nq.b(f2, null, null, rv4Var2, 0, 30);
                jub jubVar = (jub) aw7Var3.getValue();
                String B = yqe.B((y3b) b3b.N.getValue(), new Object[]{Integer.valueOf(arrayList.size())}, rv4Var2);
                long g3 = rm1.g(((h27) rv4Var2.j(j27.a)).a, 6.0f);
                tu1 E = jce.E(2142187590, new yh7(2, aw7Var5, b2), rv4Var2);
                nq7 z11 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 8.0f);
                boolean f5 = rv4Var2.f(aw7Var3);
                Object P14 = rv4Var2.P();
                if (f5 || P14 == lh9Var) {
                    P14 = new ozc(aw7Var3, 16);
                    rv4Var2.o0(P14);
                }
                npVar2 = npVar4;
                npVar = npVar6;
                lh9Var2 = lh9Var;
                i7 = i10;
                z6 = false;
                z5 = z3;
                npVar3 = npVar5;
                zx1Var = zx1Var2;
                th8Var = g2;
                xxe.m(jubVar, B, 0L, g3, E, null, z11, null, (xt4) P14, null, rv4Var2, 1597440, 676);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                aw7Var7 = aw7Var4;
                npVar = npVar6;
                npVar2 = npVar4;
                zx1Var = zx1Var2;
                lh9Var2 = lh9Var;
                i7 = i10;
                th8Var = g2;
                z5 = z3;
                npVar3 = npVar5;
                kq7Var = kq7Var2;
                z6 = false;
                kgVar = kgVar2;
                rv4Var2.e0(893496197);
                rv4Var2.q(false);
            }
            nq7 e2 = rs8.e(1.0f, pna.f(kq7Var, 1.0f), z5);
            b37 d2 = fu0.d(kh5.a, z6);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, e2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar2, rv4Var2, d2);
            jce.F(npVar3, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar, rv4Var2, kgVar);
            jce.F(npVar7, rv4Var2, p2);
            f25 f25Var = new f25(100.0f);
            hz hzVar = new hz(8.0f, z5, new vs(2));
            hz hzVar2 = new hz(8.0f, z5, new vs(2));
            bkd r = mwe.r(mwe.r(new th8(16.0f, 8.0f, 16.0f, 8.0f), th8Var), zbe.j(nae.e, nae.e, nae.e, 24.0f, 7));
            nq7 f6 = pna.f(kq7Var, 1.0f);
            if (i6 == 4) {
                z7 = z5;
            } else {
                z7 = z6;
            }
            if ((i7 & 896) == 256) {
                z8 = z5;
            } else {
                z8 = z6;
            }
            boolean z12 = z8 | z7;
            Object P15 = rv4Var2.P();
            if (!z12 && P15 != lh9Var2) {
                str2 = str;
                z9 = z6;
                aw7Var8 = aw7Var7;
                xt4Var2 = xt4Var;
            } else {
                str2 = str;
                z9 = z6;
                aw7Var8 = aw7Var7;
                xt4Var2 = xt4Var;
                P15 = new r6a(26, aw7Var8, str2, xt4Var2);
                rv4Var2.o0(P15);
            }
            aw7 aw7Var13 = aw7Var8;
            qg6 qg6Var2 = qg6Var;
            kqe.c(f25Var, f6, qg6Var2, r, hzVar, hzVar2, null, false, (xt4) P15, rv4Var, 1769520);
            boolean booleanValue = ((Boolean) yyaVar3.getValue()).booleanValue();
            nk0 nk0Var = kh5.C;
            pu0 pu0Var = pu0.a;
            rte.c(booleanValue, zbe.C(zbe.x(pu0Var.a(kq7Var, nk0Var), th8Var), 16.0f, nae.e, 72.0f, 8.0f, 2), zt3.g(null, 3).a(zt3.k(null, 0.96f, 0L, 5)), zt3.i(null, 3).a(zt3.m(0.96f, 0L, 5)), null, jce.E(-2089107905, new w81(m82Var, qg6Var2, aw7Var6, aw7Var13, yyaVar6), rv4Var), rv4Var, 200064, 16);
            rv4Var2 = rv4Var;
            rte.c((((Boolean) yyaVar4.getValue()).booleanValue() || ((Boolean) yyaVar5.getValue()).booleanValue()) ? true : true, zbe.C(zbe.x(pu0Var.a(kq7Var, kh5.E), th8Var), nae.e, nae.e, 16.0f, 8.0f, 3), zt3.g(null, 3).a(zt3.k(null, 0.96f, 0L, 5)), zt3.i(null, 3).a(zt3.m(0.96f, 0L, 5)), null, jce.E(1396994600, new w81(m82Var, qg6Var2, yyaVar4, aw7Var13, yyaVar5, 11), rv4Var), rv4Var2, 200064, 16);
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            str2 = str;
            xt4Var2 = xt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rj7(str2, arrayList, xt4Var2, nq7Var, i2);
        }
    }

    public static final void n(m82 m82Var, aw7 aw7Var, qg6 qg6Var, int i2) {
        if (i2 >= 0 && i2 < ((List) aw7Var.getValue()).size()) {
            z87.v(m82Var, null, null, new pg6(qg6Var, i2, null), 3);
        }
    }

    public static final void o(rj8 rj8Var, List list, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        nq7 nq7Var2;
        boolean z;
        int i4;
        boolean h2;
        int i5;
        int i6;
        rv4Var.g0(1941250441);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(rj8Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h2 = rv4Var.f(list);
            } else {
                h2 = rv4Var.h(list);
            }
            if (h2) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            nq7Var2 = nq7Var;
            if (rv4Var.f(nq7Var2)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        } else {
            nq7Var2 = nq7Var;
        }
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            d3a.c(rj8Var.k(), nq7Var2, zl1.h, 0L, nae.e, jce.E(-1189787479, new os1(rj8Var, 7), rv4Var), voe.e, jce.E(-1238706519, new vg7(28, list, rj8Var, (m82) P), rv4Var), rv4Var, ((i3 >> 3) & Token.ASSIGN_MOD) | 14377344, 8);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a3a(rj8Var, list, nq7Var, i2, 1);
        }
    }

    public static IOException p(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException q(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return p(file, iOException);
        }
        if (parentFile.exists()) {
            if (parentFile.isFile()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return p(file, iOException);
                    }
                    return p(file, iOException);
                } else if (parentFile.canWrite()) {
                    return p(file, iOException);
                } else {
                    return p(file, iOException);
                }
            } else if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return p(file, iOException);
                }
                return p(file, iOException);
            } else if (parentFile.canWrite()) {
                return p(file, iOException);
            } else {
                return p(file, iOException);
            }
        }
        return p(file, iOException);
    }

    public static final float r(List list) {
        float[] fArr = new float[4];
        int size = list.size();
        float f2 = 1.0f;
        for (int i2 = 0; i2 < size; i2++) {
            xu9 xu9Var = (xu9) list.get(i2);
            char c2 = 2;
            xu9.a(xu9Var, fArr, 2);
            jq6 jq6Var = xu9Var.c;
            long j2 = xu9Var.b;
            int a2 = jq6Var.a();
            float f3 = nae.e;
            int i3 = 0;
            while (i3 < a2) {
                qd2 qd2Var = (qd2) jq6Var.get(i3);
                float i4 = qd2Var.a[0] - nc2.i(j2);
                char c3 = c2;
                float j3 = qd2Var.a[1] - nc2.j(j2);
                float f4 = d2d.b;
                float f5 = (j3 * j3) + (i4 * i4);
                long c4 = qd2Var.c(0.5f);
                float i5 = nc2.i(c4) - nc2.i(j2);
                float j4 = nc2.j(c4) - nc2.j(j2);
                f3 = Math.max(f3, Math.max(f5, (j4 * j4) + (i5 * i5)));
                i3++;
                c2 = c3;
            }
            char c5 = c2;
            float sqrt = (float) Math.sqrt(f3);
            float i6 = nc2.i(j2) - sqrt;
            float j5 = nc2.j(j2) - sqrt;
            float i7 = nc2.i(j2) + sqrt;
            float j6 = nc2.j(j2) + sqrt;
            float[] fArr2 = new float[4];
            fArr2[0] = i6;
            fArr2[1] = j5;
            fArr2[c5] = i7;
            fArr2[3] = j6;
            f2 = Math.min(f2, Math.max((fArr[c5] - fArr[0]) / (fArr2[c5] - fArr2[0]), (fArr[3] - fArr[1]) / (fArr2[3] - fArr2[1])));
        }
        return f2;
    }

    public static synchronized Executor s() {
        ExecutorService executorService;
        synchronized (eg0.class) {
            try {
                if (a == null) {
                    String str = a2d.a;
                    a = Executors.newSingleThreadExecutor(new py1("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static final boolean t(hi2 hi2Var, int i2, int i3) {
        hi2Var.getClass();
        if (i2 > i3 && hi2Var.k) {
            return false;
        }
        Set set = hi2Var.l;
        if (!hi2Var.j || (set != null && set.contains(Integer.valueOf(i2)))) {
            return false;
        }
        return true;
    }

    public static final nea u(nea neaVar, nea neaVar2, float f2) {
        return new nea(b23.o(neaVar.c, neaVar2.c, f2), sve.q(f2, neaVar.a, neaVar2.a), oue.E(f2, neaVar.b, neaVar2.b));
    }

    public static final jq6 v(List list, boolean z) {
        jq6 t = tl1.t();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (i3 < list.size()) {
                t.add(new ir7(((xu9) list.get(i2)).b(), ((xu9) list.get(i3)).b()));
            } else if (z) {
                t.add(new ir7(((xu9) list.get(i2)).b(), ((xu9) list.get(0)).b()));
            }
            i2 = i3;
        }
        return tl1.r(t);
    }

    public static int w(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return i2 | (i3 << 4) | (((i5 << 4) | i4) << 8) | (((((i9 << 4) | i8) << 8) | ((i7 << 4) | i6)) << 16);
    }

    public static final yj x(yj yjVar, long j2, float f2, float[] fArr) {
        l27.f(fArr);
        l27.h(fArr, Float.intBitsToFloat((int) (j2 >> 32)) * f2, Float.intBitsToFloat((int) (4294967295L & j2)) * f2);
        yjVar.o(fArr);
        yjVar.p(y78.i(sxd.j(j2), yjVar.g().f()));
        return yjVar;
    }

    public static final long y(long j2) {
        int round = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (round << 32);
    }

    public static final long z(long j2) {
        return (((int) Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }
}
