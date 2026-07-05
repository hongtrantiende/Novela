package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dce  reason: default package */
/* loaded from: classes.dex */
public abstract class dce {
    public static final tu1 a = new tu1(new tv1(7), false, 1427693212);
    public static final tu1 b = new tu1(new tv1(8), false, -666730981);
    public static final tu1 c = new tu1(new tv1(9), false, 1277240924);
    public static final tu1 d = new tu1(new tv1(10), false, -1073754467);
    public static ar5 e;
    public static Method f;
    public static Method g;
    public static boolean h;

    public static final void A(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(sve.x(j)), i, i2, 33);
        }
    }

    public static final void B(Spannable spannable, long j, r13 r13Var, int i, int i2) {
        long b2 = e4c.b(j);
        if (f4c.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(k27.A(r13Var.k1(j)), false), i, i2, 33);
        } else if (f4c.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(e4c.c(j)), i, i2, 33);
        }
    }

    public static final void C(Spannable spannable, ov6 ov6Var, int i, int i2) {
        if (ov6Var != null) {
            ArrayList arrayList = new ArrayList(tl1.s(ov6Var, 10));
            for (nv6 nv6Var : ov6Var.a) {
                arrayList.add(nv6Var.a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static ry5 D(ty5 ty5Var, int i) {
        boolean z;
        ty5Var.getClass();
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            int i2 = ty5Var.a;
            int i3 = ty5Var.b;
            if (ty5Var.c <= 0) {
                i = -i;
            }
            return new ry5(i2, i3, i);
        }
        cp8.n(valueOf, "Step must be positive, was: ");
        return null;
    }

    public static final String E(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            if (f2 < nae.e) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f3 = f2 * pow;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        float f4 = i / pow;
        if (max > 0) {
            return String.valueOf(f4);
        }
        return String.valueOf((int) f4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ty5, ry5] */
    public static ty5 F(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            ty5 ty5Var = ty5.d;
            return ty5.d;
        }
        return new ry5(i, i2 - 1, 1);
    }

    public static final void G(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        sid sidVar = new sid(level, exc, str, objArr, 7);
        int i = khf.a;
        executor.execute(new gp9(15, new Object(), kff.a(), sidVar, false));
    }

    public static final void a(boolean z, rj8 rj8Var, cz7 cz7Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        rv4Var.g0(-1144571014);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.f(rj8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.f(cz7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var.f(rh8Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (rv4Var.f(bkdVar)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.f(nq7Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i13 & 1, z2)) {
            kxe.c(rj8Var, nq7Var, null, null, 0, nae.e, null, null, z, null, null, null, null, jce.E(-2043252293, new cs1(0, cz7Var, rh8Var, bkdVar), rv4Var), rv4Var, ((i13 >> 3) & 14) | ((i13 >> 12) & Token.ASSIGN_MOD) | ((i13 << 24) & 234881024), 24576, 16124);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ds1(z, rj8Var, cz7Var, rh8Var, bkdVar, nq7Var, i, 0);
        }
    }

    public static final void b(cz7 cz7Var, rj8 rj8Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rj8 rj8Var2;
        cz7 cz7Var2;
        pb2 pb2Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        cz7Var.getClass();
        rj8Var.getClass();
        rv4Var.g0(1230211352);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(rj8Var)) {
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
        if (rv4Var.U(i5 & 1, z)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            m82 m82Var = (m82) P;
            boolean a2 = ikd.a(rv4Var);
            sdd sddVar = (sdd) rv4Var.j(idd.b);
            if (sddVar == null) {
                rv4Var.e0(1368428688);
                sddVar = kv6.a(rv4Var);
            } else {
                rv4Var.e0(1368426673);
            }
            rv4Var.q(false);
            if (sddVar != null) {
                if (sddVar instanceof y35) {
                    pb2Var = ((y35) sddVar).f();
                } else {
                    pb2Var = ob2.b;
                }
                d1d d1dVar = (d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z11 = jsc.z(d1dVar.f, rv4Var);
                Object[] objArr = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new cd1(13);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
                Object[] objArr2 = new Object[0];
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new cd1(14);
                    rv4Var.o0(P3);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P3, rv4Var, 48);
                boolean f2 = rv4Var.f(d1dVar);
                Object P4 = rv4Var.P();
                if (f2 || P4 == obj) {
                    P4 = new es1(d1dVar, 0);
                    rv4Var.o0(P4);
                }
                tte.d(d1dVar, null, (xt4) P4, rv4Var, 0);
                cz7Var2 = cz7Var;
                fxe.i(jue.J(pna.c), jce.E(1490362678, new fs1(a2, rj8Var, cz7Var, aw7Var2, m82Var, aw7Var, z11), rv4Var), rv4Var, 48);
                boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                String A = yqe.A((y3b) b3b.J.getValue(), rv4Var);
                boolean f3 = rv4Var.f(aw7Var2);
                Object P5 = rv4Var.P();
                if (f3 || P5 == obj) {
                    P5 = new as1(aw7Var2, 1);
                    rv4Var.o0(P5);
                }
                xt4 xt4Var = (xt4) P5;
                boolean f4 = rv4Var.f(aw7Var2);
                if ((i5 & Token.ASSIGN_MOD) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z12 = f4 | z2;
                int i6 = i5 & 14;
                if (i6 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z13 = z12 | z3;
                Object P6 = rv4Var.P();
                if (z13 || P6 == obj) {
                    P6 = new r7(rj8Var, cz7Var2, aw7Var2);
                    rv4Var.o0(P6);
                }
                wq9.f(booleanValue, "", A, xt4Var, (xt4) P6, rv4Var, 48);
                boolean booleanValue2 = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean f5 = rv4Var.f(aw7Var);
                Object P7 = rv4Var.P();
                if (f5 || P7 == obj) {
                    P7 = new as1(aw7Var, 0);
                    rv4Var.o0(P7);
                }
                xt4 xt4Var2 = (xt4) P7;
                boolean f6 = rv4Var.f(aw7Var);
                if (i6 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z14 = f6 | z4;
                Object P8 = rv4Var.P();
                if (!z14 && P8 != obj) {
                    z5 = true;
                } else {
                    z5 = true;
                    P8 = new rp0(cz7Var2, aw7Var, 1);
                    rv4Var.o0(P8);
                }
                vt4 vt4Var = (vt4) P8;
                boolean f7 = rv4Var.f(aw7Var);
                if (i6 == 4) {
                    z6 = z5;
                } else {
                    z6 = false;
                }
                boolean z15 = f7 | z6;
                Object P9 = rv4Var.P();
                if (z15 || P9 == obj) {
                    P9 = new rp0(cz7Var2, aw7Var, 2);
                    rv4Var.o0(P9);
                }
                vt4 vt4Var2 = (vt4) P9;
                boolean f8 = rv4Var.f(aw7Var);
                if (i6 == 4) {
                    z7 = z5;
                } else {
                    z7 = false;
                }
                boolean z16 = f8 | z7;
                Object P10 = rv4Var.P();
                if (z16 || P10 == obj) {
                    P10 = new rp0(cz7Var2, aw7Var, 3);
                    rv4Var.o0(P10);
                }
                vt4 vt4Var3 = (vt4) P10;
                boolean f9 = rv4Var.f(aw7Var);
                if (i6 == 4) {
                    z8 = z5;
                } else {
                    z8 = false;
                }
                boolean z17 = f9 | z8;
                Object P11 = rv4Var.P();
                if (z17 || P11 == obj) {
                    P11 = new rp0(cz7Var2, aw7Var, 4);
                    rv4Var.o0(P11);
                }
                vt4 vt4Var4 = (vt4) P11;
                boolean f10 = rv4Var.f(aw7Var);
                if (i6 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z18 = f10 | z9;
                Object P12 = rv4Var.P();
                if (z18 || P12 == obj) {
                    P12 = new rp0(cz7Var2, aw7Var, 5);
                    rv4Var.o0(P12);
                }
                vt4 vt4Var5 = (vt4) P12;
                boolean f11 = rv4Var.f(aw7Var);
                if (i6 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z19 = f11 | z10;
                Object P13 = rv4Var.P();
                if (z19 || P13 == obj) {
                    P13 = new rp0(cz7Var2, aw7Var, 6);
                    rv4Var.o0(P13);
                }
                rj8Var2 = rj8Var;
                wq9.i(booleanValue2, xt4Var2, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, (vt4) P13, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
        } else {
            rj8Var2 = rj8Var;
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(cz7Var2, rj8Var2, i, 15);
        }
    }

    public static final void c(aw7 aw7Var, boolean z) {
        aw7Var.setValue(Boolean.valueOf(z));
    }

    public static final void d(boolean z, tvb tvbVar, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        tvbVar.getClass();
        xt4Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-1849559396);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(tvbVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new y4(7);
                rv4Var.o0(P);
            }
            eu3 a2 = g2.a(zt3.t((xt4) P));
            lz3 i10 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new y4(7);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i10.a(zt3.x((xt4) P2)), kh5.D, zl1.b(0.1f, zl1.b), false, false, null, jce.E(492684410, new ld1(1, tvbVar, xt4Var, vt4Var), rv4Var), rv4Var, (i9 & 14) | 805531008 | ((i9 >> 3) & Token.ASSIGN_MOD), 448);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(z, tvbVar, xt4Var, vt4Var, i, 14);
        }
    }

    public static final void e(int i, h2a h2aVar, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        rv4Var.g0(-2017195452);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (rv4Var.f(h2aVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    rv4Var.e0(913811102);
                                    rv4Var.q(false);
                                } else {
                                    rv4Var.e0(913599093);
                                    rse.a(h2aVar, nq7Var, rv4Var, (i6 >> 3) & Token.ELSE);
                                    rv4Var.q(false);
                                }
                            } else {
                                rv4Var.e0(913417836);
                                cma.a(h2aVar, nq7Var, rv4Var, (i6 >> 3) & Token.ELSE);
                                rv4Var.q(false);
                            }
                        } else {
                            rv4Var.e0(913229356);
                            z1d.n(h2aVar, nq7Var, rv4Var, (i6 >> 3) & Token.ELSE);
                            rv4Var.q(false);
                        }
                    } else {
                        rv4Var.e0(913046642);
                        a92.a(h2aVar, nq7Var, rv4Var, (i6 >> 3) & Token.ELSE);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.e0(912870066);
                    cae.l(h2aVar, nq7Var, rv4Var, (i6 >> 3) & Token.ELSE);
                    rv4Var.q(false);
                }
            } else {
                rv4Var.e0(913772476);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z82(i, h2aVar, nq7Var, i2);
        }
    }

    public static final void f(su0 su0Var, int i, wh8 wh8Var, h2a h2aVar, e6c e6cVar, cyb cybVar, j2c j2cVar, sxb sxbVar, ymb ymbVar, cnb cnbVar, ix5 ix5Var, rh8 rh8Var, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i2, int i3) {
        su0 su0Var2;
        int i4;
        int i5;
        boolean z;
        rh8 rh8Var2;
        wh8 wh8Var2;
        ix5 ix5Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        nk0 nk0Var;
        kq7 kq7Var;
        nq7 h2;
        int i6;
        int i7;
        nq7 h3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        nk0 nk0Var2 = kh5.D;
        nk0 nk0Var3 = kh5.b;
        nk0 nk0Var4 = kh5.e;
        rv4Var.g0(2042130417);
        if ((i2 & 6) == 0) {
            su0Var2 = su0Var;
            if (rv4Var.f(su0Var2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i4 = i2 | i17;
        } else {
            su0Var2 = su0Var;
            i4 = i2;
        }
        int i18 = 16;
        if ((i2 & 48) == 0) {
            if (rv4Var.d(i)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i4 |= i16;
        }
        int i19 = i2 & 384;
        int i20 = Token.CASE;
        if (i19 == 0) {
            if (rv4Var.f(wh8Var)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i4 |= i15;
        }
        int i21 = 1024;
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(h2aVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i4 |= i14;
        }
        int i22 = 8192;
        if ((i2 & 24576) == 0) {
            if (rv4Var.f(e6cVar)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i4 |= i13;
        }
        int i23 = 196608 & i2;
        int i24 = Parser.ARGC_LIMIT;
        if (i23 == 0) {
            if (rv4Var.f(cybVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i4 |= i12;
        }
        if ((i2 & 1572864) == 0) {
            if (rv4Var.f(j2cVar)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        if ((i2 & 12582912) == 0) {
            if (rv4Var.f(sxbVar)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        if ((i2 & 100663296) == 0) {
            if (rv4Var.f(ymbVar)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i4 |= i9;
        }
        if ((i2 & 805306368) == 0) {
            if (rv4Var.f(cnbVar)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i4 |= i8;
        }
        int i25 = i4;
        if (rv4Var.f(ix5Var)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i26 = i3 | i5;
        if (rv4Var.f(rh8Var)) {
            i18 = 32;
        }
        int i27 = i26 | i18;
        if ((i3 & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i20 = 256;
            }
            i27 |= i20;
        }
        if (rv4Var.h(vt4Var)) {
            i21 = 2048;
        }
        int i28 = i27 | i21;
        if (rv4Var.h(xt4Var)) {
            i22 = 16384;
        }
        int i29 = i28 | i22;
        if (rv4Var.h(xt4Var2)) {
            i24 = 131072;
        }
        int i30 = i29 | i24;
        if ((i25 & 306783379) == 306783378 && (i30 & 74899) == 74898) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i25 & 1, z)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = new Object();
                rv4Var.o0(P);
            }
            t61 t61Var = (t61) P;
            Integer valueOf = Integer.valueOf(i);
            Long l = (Long) h2aVar.l.getValue();
            if ((i25 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z8 = z2;
            if ((i25 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f2 = z8 | z3 | rv4Var.f(t61Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == obj) {
                P2 = new hk8(h2aVar, i, t61Var, (m42) null);
                rv4Var.o0(P2);
            }
            yte.i(valueOf, wh8Var, l, (lu4) P2, rv4Var);
            nq7 p = pna.p(nq7Var, su0Var2.d(), su0Var2.c());
            p.getClass();
            t61Var.getClass();
            nq7 j = lye.j(p, new qo4(t61Var, 7));
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, j);
            rw1.k.getClass();
            vt4 vt4Var2 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var2);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l2);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p2);
            long j2 = e6cVar.d;
            String str = e6cVar.e;
            ze4 ze4Var = pna.c;
            fca.c(384, j2, rv4Var, ze4Var, str);
            int i31 = i30 & Token.ASSIGN_MOD;
            if (i31 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P3 = rv4Var.P();
            if (z4 || P3 == obj) {
                P3 = zbe.j(nae.e, rh8Var.d(), nae.e, rh8Var.a(), 5);
                rv4Var.o0(P3);
            }
            long j3 = e6cVar.c;
            nq7 x = zbe.x(ze4Var, mwe.r(mwe.r((rh8) P3, ix5Var), zbe.h(1, nae.e)));
            int i32 = i25 >> 9;
            int i33 = ((i25 >> 6) & 14) | (i32 & 896) | (i32 & 7168) | (57344 & i32) | (i32 & 458752);
            int i34 = i30 << 12;
            rh8Var2 = rh8Var;
            g(wh8Var, j3, cybVar, j2cVar, sxbVar, ymbVar, x, vt4Var, xt4Var, xt4Var2, rv4Var, i33 | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192));
            wh8Var2 = wh8Var;
            tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
            if (i31 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean d3 = rv4Var.d(tc6Var.ordinal()) | z5;
            Object P4 = rv4Var.P();
            if (d3 || P4 == obj) {
                P4 = zbe.j(zbe.o(rh8Var2, tc6Var), nae.e, zbe.n(rh8Var2, tc6Var), nae.e, 10);
                rv4Var.o0(P4);
            }
            rh8 rh8Var3 = (rh8) P4;
            if (i31 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object P5 = rv4Var.P();
            if (z6 || P5 == obj) {
                Object rg3Var = new rg3(rh8Var2.d());
                rv4Var.o0(rg3Var);
                P5 = rg3Var;
            }
            float f3 = ((rg3) P5).a;
            if (i31 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object P6 = rv4Var.P();
            if (z7 || P6 == obj) {
                Object rg3Var2 = new rg3(rh8Var2.a());
                rv4Var.o0(rg3Var2);
                P6 = rg3Var2;
            }
            float f4 = ((rg3) P6).a;
            String str2 = wh8Var2.c;
            if (rg3.a(f3, 20.0f) <= 0) {
                nk0Var = nk0Var4;
            } else {
                nk0Var = nk0Var3;
            }
            kq7 kq7Var2 = kq7.a;
            ix5Var2 = ix5Var;
            nq7 x2 = zbe.x(zbe.x(pna.f(kq7Var2, 1.0f), ix5Var2), rh8Var3);
            pu0 pu0Var = pu0.a;
            nq7 a2 = pu0Var.a(x2, nk0Var3);
            if (rg3.a(f3, 20.0f) <= 0) {
                kq7Var = kq7Var2;
                h2 = pna.h(kq7Var2, 20.0f + f3);
            } else {
                kq7Var = kq7Var2;
                h2 = pna.h(zbe.C(kq7Var2, nae.e, 10.0f, nae.e, nae.e, 13), 10.0f + f3);
            }
            eg0.j(str2, nk0Var, a2.a0(h2), rv4Var, 0);
            int i35 = wh8Var2.b;
            int i36 = cnbVar.c;
            boolean z9 = wh8Var2 instanceof gwb;
            if (z9) {
                i6 = ((gwb) wh8Var2).g.a;
            } else {
                i6 = -1;
            }
            if (z9) {
                i7 = ((gwb) wh8Var2).f;
            } else {
                i7 = 0;
            }
            if (rg3.a(f3, 20.0f) > 0) {
                nk0Var4 = nk0Var2;
            }
            nq7 a3 = pu0Var.a(zbe.x(zbe.x(pna.f(kq7Var, 1.0f), ix5Var2), rh8Var3), nk0Var2);
            if (rg3.a(f4, 20.0f) <= 0) {
                h3 = pna.h(kq7Var, 20.0f + f4);
            } else {
                h3 = pna.h(zbe.C(kq7Var, nae.e, nae.e, nae.e, 10.0f, 7), 10.0f + f4);
            }
            iwe.a(i35, i36, i6, i7, nk0Var4, a3.a0(h3), rv4Var, 0);
            rv4Var.q(true);
        } else {
            rh8Var2 = rh8Var;
            wh8Var2 = wh8Var;
            ix5Var2 = ix5Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ak8(su0Var, i, wh8Var2, h2aVar, e6cVar, cybVar, j2cVar, sxbVar, ymbVar, cnbVar, ix5Var2, rh8Var2, nq7Var, vt4Var, xt4Var, xt4Var2, i2, i3);
        }
    }

    public static final void g(wh8 wh8Var, final long j, final cyb cybVar, final j2c j2cVar, final sxb sxbVar, final ymb ymbVar, final nq7 nq7Var, final vt4 vt4Var, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, final int i) {
        int i2;
        boolean z;
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
        final wh8 wh8Var2 = wh8Var;
        rv4Var.g0(-1512015948);
        if ((i & 6) == 0) {
            if (rv4Var.f(wh8Var2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.e(j)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(cybVar)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(j2cVar)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(sxbVar)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(ymbVar)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        }
        if ((i & 1572864) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((805306368 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        if ((306783379 & i2) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            int i13 = i2 >> 18;
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
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            wh8Var2 = wh8Var;
            if (wh8Var2 instanceof gwb) {
                rv4Var.e0(-1730198334);
                h((gwb) wh8Var2, j, cybVar, j2cVar, sxbVar, ymbVar, pna.f(kq7.a, 1.0f), rv4Var, (i2 & 14) | 1572864 | (i2 & Token.ASSIGN_MOD) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (i2 & 458752));
                rv4Var.q(false);
            } else if (wh8Var2 instanceof j0b) {
                rv4Var.e0(-1729753701);
                bce.g((j0b) wh8Var2, pna.c, xt4Var, xt4Var2, rv4Var, (i2 & 14) | 48 | (i13 & 896) | (i13 & 7168));
                rv4Var.q(false);
            } else if (wh8Var2 instanceof dt3) {
                rv4Var.e0(-1729462084);
                bce.f((i13 & Token.ASSIGN_MOD) | 6, vt4Var, rv4Var, pna.c);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1729286872);
                rv4Var.q(false);
            }
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: ck8
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dce.g(wh8.this, j, cybVar, j2cVar, sxbVar, ymbVar, nq7Var, vt4Var, xt4Var, xt4Var2, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void h(final gwb gwbVar, final long j, final cyb cybVar, final j2c j2cVar, final sxb sxbVar, final ymb ymbVar, final nq7 nq7Var, rv4 rv4Var, final int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        int i3;
        rv4 rv4Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4 rv4Var4 = rv4Var;
        rv4Var4.g0(-421870284);
        if ((i & 6) == 0) {
            if (rv4Var4.f(gwbVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var4.e(j)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        cyb cybVar2 = cybVar;
        if ((i & 384) == 0) {
            if (rv4Var4.f(cybVar2)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        j2c j2cVar2 = j2cVar;
        if ((i & 3072) == 0) {
            if (rv4Var4.f(j2cVar2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        Object obj = sxbVar;
        if ((i & 24576) == 0) {
            if (rv4Var4.f(obj)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        Object obj2 = ymbVar;
        if ((196608 & i) == 0) {
            if (rv4Var4.f(obj2)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var4.f(nq7Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var4.U(i2 & 1, z)) {
            iwb iwbVar = gwbVar.g;
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var4, 0);
            int hashCode = Long.hashCode(rv4Var4.T);
            xt8 l = rv4Var4.l();
            nq7 p = lye.p(rv4Var4, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            jce.F(qw1.f, rv4Var4, a2);
            jce.F(qw1.e, rv4Var4, l);
            jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var4);
            jce.F(qw1.d, rv4Var4, p);
            rv4Var4.e0(1383291956);
            int i11 = iwbVar.d;
            int i12 = 0;
            while (i12 < i11) {
                jwb jwbVar = (jwb) sl1.f0(i12, iwbVar.f);
                if (jwbVar == null) {
                    rv4Var4.e0(795827530);
                    rv4Var4.q(false);
                    int i13 = i12;
                    rv4Var3 = rv4Var4;
                    i3 = i13;
                } else {
                    rv4Var4.e0(795827531);
                    int i14 = i12;
                    int i15 = i2 << 3;
                    i3 = i14;
                    bce.e(gwbVar.d, j, jwbVar, cybVar2, j2cVar2, obj, obj2, new we6(1.0f, true), rv4Var, (i15 & 7168) | (i2 & Token.ASSIGN_MOD) | 512 | (57344 & i15) | (458752 & i15) | (i15 & 3670016));
                    rv4Var3 = rv4Var;
                    rv4Var3.q(false);
                }
                rv4 rv4Var5 = rv4Var3;
                i12 = i3 + 1;
                rv4Var4 = rv4Var5;
                cybVar2 = cybVar;
                j2cVar2 = j2cVar;
                obj = sxbVar;
                obj2 = ymbVar;
            }
            rv4Var2 = rv4Var4;
            rv4Var2.q(false);
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var4;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: dk8
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    dce.h(gwb.this, j, cybVar, j2cVar, sxbVar, ymbVar, nq7Var, (rv4) obj3, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(final int i, final cnb cnbVar, final kob kobVar, final qxb qxbVar, final h2a h2aVar, final e6c e6cVar, final cyb cybVar, final j2c j2cVar, final sxb sxbVar, final ymb ymbVar, final rh8 rh8Var, final nq7 nq7Var, final vt4 vt4Var, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        Object obj;
        Object obj2;
        Object obj3;
        int i5;
        int i6;
        Object obj4;
        Object obj5;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        cnbVar.getClass();
        kobVar.getClass();
        qxbVar.getClass();
        e6cVar.getClass();
        j2cVar.getClass();
        sxbVar.getClass();
        ymbVar.getClass();
        rh8Var.getClass();
        vt4Var.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(111700579);
        if ((i2 & 6) == 0) {
            if (rv4Var.d(i)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i4 = i20 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            obj = cnbVar;
            if (rv4Var.f(obj)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i4 |= i19;
        } else {
            obj = cnbVar;
        }
        if ((i2 & 384) == 0) {
            obj2 = kobVar;
            if (rv4Var.f(obj2)) {
                i18 = 256;
            } else {
                i18 = Token.CASE;
            }
            i4 |= i18;
        } else {
            obj2 = kobVar;
        }
        if ((i2 & 24576) == 0) {
            obj3 = h2aVar;
            if (rv4Var.f(obj3)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i4 |= i17;
        } else {
            obj3 = h2aVar;
        }
        if ((i2 & 196608) == 0) {
            if (rv4Var.f(e6cVar)) {
                i16 = 131072;
            } else {
                i16 = Parser.ARGC_LIMIT;
            }
            i4 |= i16;
        }
        if ((i2 & 1572864) == 0) {
            if (rv4Var.f(cybVar)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i4 |= i15;
        }
        if ((i2 & 12582912) == 0) {
            if (rv4Var.f(j2cVar)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i4 |= i14;
        }
        if ((i2 & 100663296) == 0) {
            if (rv4Var.f(sxbVar)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        if ((i2 & 805306368) == 0) {
            if (rv4Var.f(ymbVar)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        if ((i3 & 6) == 0) {
            if (rv4Var.f(rh8Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i3 | i11;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 = i4;
            if (rv4Var.f(nq7Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        } else {
            i6 = i4;
        }
        if ((i3 & 384) == 0) {
            obj4 = vt4Var;
            if (rv4Var.h(obj4)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i5 |= i9;
        } else {
            obj4 = vt4Var;
        }
        if ((i3 & 3072) == 0) {
            obj5 = xt4Var;
            if (rv4Var.h(obj5)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i5 |= i8;
        } else {
            obj5 = xt4Var;
        }
        if ((i3 & 24576) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i5 |= i7;
        }
        int i21 = i5;
        if ((i6 & 306782355) == 306782354 && (i21 & 9363) == 9362) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i6 & 1, z)) {
            WeakHashMap weakHashMap = yjd.w;
            final ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
            final cnb cnbVar2 = obj;
            final vt4 vt4Var2 = obj4;
            final xt4 xt4Var3 = obj5;
            final kob kobVar2 = obj2;
            final h2a h2aVar2 = obj3;
            hc2.b(nq7Var, null, jce.E(-1018384583, new mu4() { // from class: vj8
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v10 */
                /* JADX WARN: Type inference failed for: r3v12 */
                /* JADX WARN: Type inference failed for: r3v8 */
                @Override // defpackage.mu4
                public final Object c(Object obj6, Object obj7, Object obj8) {
                    boolean z2;
                    boolean z3;
                    xt4 xt4Var4;
                    lh9 lh9Var;
                    boolean z4;
                    ze4 ze4Var;
                    final su0 su0Var;
                    kq7 kq7Var;
                    ix5 ix5Var;
                    boolean z5;
                    kq7 kq7Var2;
                    boolean z6;
                    int i22;
                    su0 su0Var2 = (su0) obj6;
                    rv4 rv4Var2 = (rv4) obj7;
                    int intValue = ((Integer) obj8).intValue();
                    su0Var2.getClass();
                    if ((intValue & 6) == 0) {
                        if (rv4Var2.f(su0Var2)) {
                            i22 = 4;
                        } else {
                            i22 = 2;
                        }
                        intValue |= i22;
                    }
                    if ((intValue & 19) != 18) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z2)) {
                        int i23 = intValue;
                        ze4 ze4Var2 = pna.c;
                        h2a h2aVar3 = h2a.this;
                        kj6 i24 = h2aVar3.i();
                        kob kobVar3 = kobVar2;
                        boolean f2 = rv4Var2.f(kobVar3);
                        int i25 = i23 & 14;
                        if (i25 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z7 = f2 | z3;
                        Object P = rv4Var2.P();
                        lh9 lh9Var2 = ax1.a;
                        if (z7 || P == lh9Var2) {
                            P = new fl7(19, kobVar3, su0Var2);
                            rv4Var2.o0(P);
                        }
                        int i26 = i25;
                        vqe.o(ze4Var2, i24, null, false, null, null, null, false, (xt4) P, rv4Var2, 12582918, Token.IMPORT);
                        Object P2 = rv4Var2.P();
                        if (P2 == lh9Var2) {
                            P2 = yae.z(null);
                            rv4Var2.o0(P2);
                        }
                        aw7 aw7Var = P2;
                        Object P3 = rv4Var2.P();
                        if (P3 == lh9Var2) {
                            P3 = yae.z(null);
                            rv4Var2.o0(P3);
                        }
                        aw7 aw7Var2 = P3;
                        Object P4 = rv4Var2.P();
                        if (P4 == lh9Var2) {
                            P4 = yae.z(null);
                            rv4Var2.o0(P4);
                        }
                        aw7 aw7Var3 = P4;
                        kj6 i27 = h2aVar3.i();
                        boolean f3 = rv4Var2.f(h2aVar3) | rv4Var2.f(kobVar3);
                        Object P5 = rv4Var2.P();
                        if (f3 || P5 == lh9Var2) {
                            P5 = new r9(h2aVar3, kobVar3, aw7Var, aw7Var2, aw7Var3, null, 25);
                            rv4Var2.o0(P5);
                        }
                        yte.h(i27, kobVar3, (lu4) P5, rv4Var2);
                        wh8 wh8Var = (wh8) aw7Var.getValue();
                        e6c e6cVar2 = e6cVar;
                        cyb cybVar2 = cybVar;
                        j2c j2cVar2 = j2cVar;
                        sxb sxbVar2 = sxbVar;
                        ymb ymbVar2 = ymbVar;
                        cnb cnbVar3 = cnbVar2;
                        ix5 ix5Var2 = o;
                        rh8 rh8Var2 = rh8Var;
                        vt4 vt4Var3 = vt4Var2;
                        xt4 xt4Var5 = xt4Var3;
                        xt4 xt4Var6 = xt4Var2;
                        kq7 kq7Var3 = kq7.a;
                        if (wh8Var == null) {
                            rv4Var2.e0(955057223);
                            rv4Var2.q(false);
                            ze4Var = ze4Var2;
                            z4 = false;
                            kq7Var = kq7Var3;
                            lh9Var = lh9Var2;
                            ix5Var = ix5Var2;
                            xt4Var4 = xt4Var6;
                            su0Var = su0Var2;
                        } else {
                            rv4Var2.e0(955057224);
                            xt4Var4 = xt4Var6;
                            lh9Var = lh9Var2;
                            z4 = false;
                            ze4Var = ze4Var2;
                            su0Var = su0Var2;
                            dce.f(su0Var, 0, wh8Var, h2aVar3, e6cVar2, cybVar2, j2cVar2, sxbVar2, ymbVar2, cnbVar3, ix5Var2, rh8Var2, kq7Var3, vt4Var3, xt4Var5, xt4Var4, rv4Var2, i26 | 48, 384);
                            kq7Var = kq7Var3;
                            ix5Var = ix5Var2;
                            rv4Var2 = rv4Var2;
                            rv4Var2.q(false);
                        }
                        wh8 wh8Var2 = (wh8) aw7Var3.getValue();
                        if (wh8Var2 == null) {
                            rv4Var2.e0(955842515);
                            rv4Var2.q(z4);
                            kq7Var2 = kq7Var;
                        } else {
                            rv4Var2.e0(955842516);
                            if (i26 == 4) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            Object P6 = rv4Var2.P();
                            i26 = i26;
                            lh9 lh9Var3 = lh9Var;
                            if (!z5 && P6 != lh9Var3) {
                                lh9Var = lh9Var3;
                                z4 = false;
                            } else {
                                lh9Var = lh9Var3;
                                z4 = false;
                                P6 = new xt4() { // from class: zj8
                                    @Override // defpackage.xt4
                                    public final Object invoke(Object obj9) {
                                        int i28 = r2;
                                        su0 su0Var3 = su0Var;
                                        r13 r13Var = (r13) obj9;
                                        r13Var.getClass();
                                        switch (i28) {
                                            case 0:
                                                return new py5((-r13Var.X0(su0Var3.d())) << 32);
                                            default:
                                                return new py5(r13Var.X0(su0Var3.d()) << 32);
                                        }
                                    }
                                };
                                rv4Var2.o0(P6);
                            }
                            kq7Var2 = kq7Var;
                            rv4 rv4Var3 = rv4Var2;
                            ix5 ix5Var3 = ix5Var;
                            dce.f(su0Var, -1, wh8Var2, h2aVar3, e6cVar2, cybVar2, j2cVar2, sxbVar2, ymbVar2, cnbVar3, ix5Var3, rh8Var2, lbe.p(kq7Var, (xt4) P6), vt4Var3, xt4Var5, xt4Var4, rv4Var3, i26 | 48, 0);
                            ix5Var = ix5Var3;
                            rv4Var2 = rv4Var3;
                            rv4Var2.q(z4);
                        }
                        wh8 wh8Var3 = (wh8) aw7Var2.getValue();
                        if (wh8Var3 == null) {
                            rv4Var2.e0(956708469);
                            rv4Var2.q(z4);
                        } else {
                            rv4Var2.e0(956708470);
                            int i28 = i26;
                            if (i28 == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            Object P7 = rv4Var2.P();
                            if (z6 || P7 == lh9Var) {
                                P7 = new xt4() { // from class: zj8
                                    @Override // defpackage.xt4
                                    public final Object invoke(Object obj9) {
                                        int i282 = r2;
                                        su0 su0Var3 = su0Var;
                                        r13 r13Var = (r13) obj9;
                                        r13Var.getClass();
                                        switch (i282) {
                                            case 0:
                                                return new py5((-r13Var.X0(su0Var3.d())) << 32);
                                            default:
                                                return new py5(r13Var.X0(su0Var3.d()) << 32);
                                        }
                                    }
                                };
                                rv4Var2.o0(P7);
                            }
                            rv4 rv4Var4 = rv4Var2;
                            dce.f(su0Var, 1, wh8Var3, h2aVar3, e6cVar2, cybVar2, j2cVar2, sxbVar2, ymbVar2, cnbVar3, ix5Var, rh8Var2, lbe.p(kq7Var2, (xt4) P7), vt4Var3, xt4Var5, xt4Var4, rv4Var4, i28 | 48, 0);
                            rv4Var2 = rv4Var4;
                            rv4Var2.q(false);
                        }
                        dce.e(i, h2aVar3, ze4Var, rv4Var2, 384);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, ((i21 >> 3) & 14) | 3072, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: wj8
                @Override // defpackage.lu4
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int p = xoe.p(i2 | 1);
                    int p2 = xoe.p(i3);
                    dce.i(i, cnbVar, kobVar, qxbVar, h2aVar, e6cVar, cybVar, j2cVar, sxbVar, ymbVar, rh8Var, nq7Var, vt4Var, xt4Var, xt4Var2, (rv4) obj6, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static byte j(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.q("out of range: %s", j, z);
        return (byte) j;
    }

    public static int k(int i, int i2) {
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public static double l(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            if (d2 > d4) {
                return d4;
            }
            return d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float m(float f2, float f3, float f4) {
        if (f3 <= f4) {
            if (f2 < f3) {
                return f3;
            }
            if (f2 > f4) {
                return f4;
            }
            return f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int n(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long o(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        StringBuilder o = rs8.o(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        o.append(j2);
        o.append('.');
        throw new IllegalArgumentException(o.toString());
    }

    public static Comparable p(Comparable comparable, jk1 jk1Var) {
        jk1Var.getClass();
        float f2 = jk1Var.b;
        float f3 = jk1Var.a;
        if (f3 <= f2) {
            if (jk1.c(comparable, Float.valueOf(f3)) && !jk1.c(Float.valueOf(f3), comparable)) {
                return Float.valueOf(f3);
            }
            if (jk1.c(Float.valueOf(f2), comparable) && !jk1.c(comparable, Float.valueOf(f2))) {
                return Float.valueOf(f2);
            }
            return comparable;
        }
        cp8.n(jk1Var, "Cannot coerce value to an empty range: ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [hq7] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ep4, yp3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ep4 q(android.content.Context r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            qt2 r0 = new qt2
            r0.<init>()
            goto L11
        Lc:
            hq7 r0 = new hq7
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            defpackage.jsc.w(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r6 = r5
            goto L7c
        L4b:
            java.lang.String r7 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.lang.String r8 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            android.content.pm.Signature[] r0 = r0.m(r1, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            int r2 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
        L59:
            if (r3 >= r2) goto L67
            r4 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            byte[] r4 = r4.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r1.add(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r10 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            cp4 r6 = new cp4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.lang.String r9 = "emojicompat-emoji-font"
            r11 = 0
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            goto L7c
        L75:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7c:
            if (r6 != 0) goto L7f
            goto L89
        L7f:
            ep4 r5 = new ep4
            dp4 r0 = new dp4
            r0.<init>(r13, r6)
            r5.<init>(r0)
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dce.q(android.content.Context):ep4");
    }

    public static ry5 r(int i, int i2) {
        return new ry5(i, i2, -1);
    }

    public static void s(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            ff.m(canvas, z);
            return;
        }
        if (!h) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    g = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    g = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = g;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            h = true;
        }
        if (z) {
            try {
                Method method4 = f;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = g) != null) {
            method.invoke(canvas, null);
        }
    }

    public static ArrayList t(bf6 bf6Var, rl1 rl1Var) {
        rl1Var.getClass();
        r1a i = bf6Var.i(rl1Var);
        float f2 = i.a;
        float f3 = i.b;
        int ordinal = bf6Var.o().ordinal();
        int i2 = 0;
        if (ordinal != 0) {
            if (ordinal == 1) {
                ArrayList D = bf6Var.D();
                ArrayList arrayList = new ArrayList();
                int size = D.size();
                while (i2 < size) {
                    Object obj = D.get(i2);
                    i2++;
                    af6 af6Var = (af6) obj;
                    if (((int) (af6Var.b() >> 32)) >= f2 && ((int) (af6Var.b() >> 32)) + ((int) (af6Var.a() >> 32)) <= f3) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            xk5.o();
            return null;
        }
        ArrayList D2 = bf6Var.D();
        ArrayList arrayList2 = new ArrayList();
        int size2 = D2.size();
        while (i2 < size2) {
            Object obj2 = D2.get(i2);
            i2++;
            af6 af6Var2 = (af6) obj2;
            if (((int) (af6Var2.b() & 4294967295L)) >= f2 && ((int) (af6Var2.b() & 4294967295L)) + ((int) (af6Var2.a() & 4294967295L)) <= f3) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static List u(bf6 bf6Var, d0 d0Var) {
        rl1 rl1Var;
        d0Var.getClass();
        ff8 o = bf6Var.o();
        boolean e2 = bf6Var.e();
        o.getClass();
        int ordinal = o.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                rl1Var = new rl1(d0Var.a, d0Var.b);
            } else {
                xk5.o();
                return null;
            }
        } else {
            rl1Var = new rl1(d0Var.c, d0Var.d);
        }
        if (e2) {
            rl1Var = new rl1(rl1Var.b, rl1Var.a);
        } else if (e2) {
            xk5.o();
            return null;
        }
        return bf6Var.q(rl1Var);
    }

    public static int v(bf6 bf6Var) {
        int ordinal = bf6Var.o().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return (int) (bf6Var.j() >> 32);
            }
            xk5.o();
            return 0;
        }
        return (int) (bf6Var.j() & 4294967295L);
    }

    public static r1a w(bf6 bf6Var, d0 d0Var) {
        rl1 rl1Var;
        d0Var.getClass();
        ff8 o = bf6Var.o();
        boolean e2 = bf6Var.e();
        o.getClass();
        int ordinal = o.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                rl1Var = new rl1(d0Var.a, d0Var.b);
            } else {
                xk5.o();
                return null;
            }
        } else {
            rl1Var = new rl1(d0Var.c, d0Var.d);
        }
        if (e2) {
            rl1Var = new rl1(rl1Var.b, rl1Var.a);
        } else if (e2) {
            xk5.o();
            return null;
        }
        return bf6Var.i(rl1Var);
    }

    public static r1a x(bf6 bf6Var, rl1 rl1Var) {
        long j;
        rl1Var.getClass();
        float f2 = rl1Var.a;
        float f3 = rl1Var.b;
        int ordinal = bf6Var.o().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                j = bf6Var.j() >> 32;
            } else {
                xk5.o();
                return null;
            }
        } else {
            j = bf6Var.j() & 4294967295L;
        }
        return new r1a(f2, ((int) j) - f3);
    }

    public static final float y(long j, float f2, r13 r13Var) {
        float c2;
        long b2 = e4c.b(j);
        if (f4c.a(b2, 4294967296L)) {
            if (r13Var.G0() > 1.05d) {
                c2 = e4c.c(j) / e4c.c(r13Var.r0(f2));
            } else {
                return r13Var.k1(j);
            }
        } else if (f4c.a(b2, 8589934592L)) {
            c2 = e4c.c(j);
        } else {
            return Float.NaN;
        }
        return c2 * f2;
    }

    public static ry5 z(ty5 ty5Var) {
        ty5Var.getClass();
        return new ry5(ty5Var.b, ty5Var.a, -ty5Var.c);
    }
}
