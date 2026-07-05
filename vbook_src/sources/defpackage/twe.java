package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import java.math.RoundingMode;
import java.util.List;
import java.util.Locale;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: twe  reason: default package */
/* loaded from: classes.dex */
public abstract class twe {
    public static final tu1 a = new tu1(new iv1(5), false, 771215476);
    public static final tu1 b = new tu1(new ev1(24), false, -1088884368);
    public static final tu1 c = new tu1(new ev1(25), false, 692378934);
    public static final sk8 d = new sk8(null, null, null, null, null, null, null, null);
    public static Context e;

    /* JADX WARN: Code restructure failed: missing block: B:76:0x028f, code lost:
        if (r5 == r4) goto L238;
     */
    /* JADX WARN: Type inference failed for: r7v12, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r8v29, types: [my0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r45, java.lang.String r46, defpackage.pc4 r47, boolean r48, boolean r49, defpackage.ng3 r50, defpackage.nq7 r51, defpackage.vt4 r52, defpackage.vt4 r53, defpackage.rv4 r54, int r55) {
        /*
            Method dump skipped, instructions count: 2355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twe.a(java.lang.String, java.lang.String, pc4, boolean, boolean, ng3, nq7, vt4, vt4, rv4, int):void");
    }

    public static final void b(String str, List list, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        list.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        rv4Var.g0(1081774570);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(rh8Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            obj = xt4Var;
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
            obj2 = xt4Var3;
            if (rv4Var.h(obj2)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        } else {
            obj2 = xt4Var3;
        }
        int i10 = i2;
        boolean z6 = false;
        if ((i10 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i10 & 1, z)) {
            q0a a2 = o96.a(rv4Var);
            boolean f = rv4Var.f(null) | rv4Var.f(a2);
            Object P = rv4Var.P();
            Object obj3 = ax1.a;
            if (f || P == obj3) {
                P = a2.e(cm9.a(pc4.class), null, null);
                rv4Var.o0(P);
            }
            Object obj4 = (pc4) P;
            bkd r = mwe.r(rh8Var, zbe.j(16.0f, nae.e, 16.0f, nae.e, 10));
            bkd r2 = mwe.r(rh8Var, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            hz hzVar = new hz(4.0f, true, new vs(2));
            if ((i10 & Token.ASSIGN_MOD) != 32 && ((i10 & 64) == 0 || !rv4Var.h(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean h2 = z2 | rv4Var.h(obj4);
            if ((i10 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = h2 | z3;
            if ((i10 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            if ((i10 & 458752) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            if ((i10 & 3670016) == 1048576) {
                z6 = true;
            }
            boolean z10 = z9 | z6;
            Object P2 = rv4Var.P();
            if (z10 || P2 == obj3) {
                Object hm0Var = new hm0(list, obj4, str, obj, xt4Var2, obj2, 8);
                rv4Var.o0(hm0Var);
                P2 = hm0Var;
            }
            pc2.c(nq7Var, null, r, hzVar, null, null, false, r2, 0L, 0L, nae.e, (xt4) P2, rv4Var, ((i10 >> 9) & 14) | 24576, 0, 3818);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i81((Object) str, (Object) list, (Object) rh8Var, (Object) nq7Var, xt4Var, (hu4) xt4Var2, (hu4) xt4Var3, i, 3);
        }
    }

    public static final void c(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-766922622);
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
                uo4 uo4Var = (uo4) ((fdd) voe.z(cm9.a(uo4.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(uo4Var.d, rv4Var);
                kb kbVar = (kb) rv4Var.j(yb.a);
                zu8 zu8Var = new zu8(tl1.B("otf", "ttf"));
                boolean f = rv4Var.f(uo4Var);
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (f || P == obj) {
                    P = new po4(uo4Var, 0);
                    rv4Var.o0(P);
                }
                kd4 u = w92.u(zu8Var, (xt4) P, rv4Var, 8);
                s02 s02Var = uo4Var.e;
                boolean f2 = rv4Var.f(kbVar);
                Object P2 = rv4Var.P();
                if (f2 || P2 == obj) {
                    P2 = new wa(12, kbVar, (m42) null);
                    rv4Var.o0(P2);
                }
                jye.b(s02Var, null, (mu4) P2, rv4Var, 0);
                fxe.h(yqe.A((y3b) f3b.q.getValue(), rv4Var), pna.c, false, jce.E(1546778246, new h64(cz7Var, 2), rv4Var), null, jce.E(-4430431, new qo4(u, 0), rv4Var), jce.E(770638167, new u32(12, uo4Var, z2), rv4Var), rv4Var, 1772592, 20);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new h64(cz7Var, i, 3);
        }
    }

    public static jj d(int i, int i2, int i3, int i4) {
        Bitmap createBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        zs9 zs9Var = wm1.e;
        Bitmap.Config F = ay5.F(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = h50.h(i, i2, i3, zs9Var);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, F);
            createBitmap.setHasAlpha(true);
        }
        return new jj(createBitmap);
    }

    public static final void e(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str, String str2, String str3) {
        int i2;
        int i3;
        int i4;
        boolean z;
        String str4;
        String str5;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        str2.getClass();
        vt4Var.getClass();
        rv4Var2.g0(397977434);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4 | 24576;
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
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
            tu1 tu1Var = null;
            if ("".length() > 0) {
                str5 = "";
            } else {
                str5 = null;
            }
            if (str5 == null) {
                rv4Var2.e0(1019732050);
            } else {
                rv4Var2.e0(1019732051);
                tu1Var = jce.E(713336545, new jd1(str5, 26), rv4Var2);
            }
            rv4Var2.q(false);
            tza tzaVar = j27.a;
            v72 v72Var = ((h27) rv4Var2.j(tzaVar)).c.b;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            long j2 = ((h27) rv4Var2.j(tzaVar)).a.A;
            long j3 = ((h27) rv4Var2.j(tzaVar)).a.s;
            long j4 = ((h27) rv4Var2.j(tzaVar)).a.s;
            long j5 = ((h27) rv4Var2.j(tzaVar)).a.s;
            long j6 = zl1.i;
            hrb a2 = j55.w(((h27) rv4Var2.j(tzaVar)).a, rv4Var2).a(j6, j6, j, j6, j6, j6, j6, j6, j6, j6, null, j6, j6, j2, j6, j6, j6, j6, j6, j6, j6, j4, j6, j6, j6, j3, j6, j6, j6, j5, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6);
            nq7 f = pna.f(kq7.a, 1.0f);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new bo7(28);
                rv4Var2.o0(P);
            }
            uwe.h(str, (xt4) P, f, false, true, null, jce.E(-2086155846, new jd1(str2, 27), rv4Var2), tu1Var, null, o28.g, false, null, null, null, true, 0, 0, v72Var, a2, rv4Var2, (i7 & 14) | 806907312, 12582912, 1965344);
            rv4Var2 = rv4Var2;
            nq7 b2 = pu0.a.b();
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = s21.g(rv4Var2);
            }
            fu0.a(lbe.e(b2, (yu7) P2, null, false, null, vt4Var, 28), rv4Var2, 0);
            rv4Var2.q(true);
            str4 = "";
        } else {
            rv4Var2.X();
            str4 = str3;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new he7(str, str2, vt4Var, nq7Var, str4, i);
        }
    }

    public static rz9 f(sz9 sz9Var, long j, long j2, long j3, y22 y22Var, float f, float f2) {
        y22Var.getClass();
        int i = (f2 > nae.e ? 1 : (f2 == nae.e ? 0 : -1));
        if ((i > 0 && f2 < f) || (i > 0 && f2 > f && f2 / f < 1.5f && Math.abs(f2 - f) < 1.5f)) {
            f = f2;
        }
        rz9 n = sz9Var.n(j, j2, j3, y22Var, f, f2);
        return new rz9(f, n.b, n.c);
    }

    public static long g(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        boolean z2 = false;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j3;
        }
        throw new ArithmeticException(hl5.q(rs8.o(j, "overflow: checkedAdd(", ", "), j2, ")"));
    }

    public static final String h(String str) {
        int length = str.length();
        int f0 = k4b.f0(str, (char) 0, 0, 6);
        if (f0 >= 0) {
            length = f0;
        }
        String obj = k4b.N0(str.substring(0, length)).toString();
        if (obj.length() == 0) {
            return null;
        }
        return obj;
    }

    public static long i(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        int i = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        if (i == 0) {
            return j3;
        }
        boolean z = true;
        int i2 = ((int) ((j ^ j2) >> 63)) | 1;
        switch (yx6.a[roundingMode.ordinal()]) {
            case 1:
                if (i != 0) {
                    z = false;
                }
                dye.j(z);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i2 >= 0) {
                    return j3;
                }
                return j3 + i2;
            case 4:
                return j3 + i2;
            case 5:
                if (i2 <= 0) {
                    return j3;
                }
                return j3 + i2;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                int i3 = ((abs - (Math.abs(j2) - abs)) > 0L ? 1 : ((abs - (Math.abs(j2) - abs)) == 0L ? 0 : -1));
                if (i3 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (i3 <= 0) {
                    return j3;
                }
                return j3 + i2;
            default:
                cp8.i();
                return 0L;
        }
    }

    public static long j(long j, long j2) {
        dye.i(j, "a");
        dye.i(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String k(java.lang.String r3, defpackage.rc3 r4) {
        /*
            r3.getClass()
            r4.getClass()
            int r4 = r4.ordinal()
            r0 = 0
            java.lang.String r1 = "_"
            if (r4 == 0) goto L29
            r2 = 1
            if (r4 != r2) goto L25
            boolean r4 = o(r3)
            if (r4 != 0) goto L3d
            gm9 r4 = defpackage.g40.e
            java.lang.String r3 = r4.i(r3, r1)
            boolean r4 = o(r3)
            if (r4 == 0) goto L3c
            return r3
        L25:
            defpackage.xk5.o()
            return r0
        L29:
            boolean r4 = n(r3)
            if (r4 != 0) goto L3d
            gm9 r4 = defpackage.g40.f
            java.lang.String r3 = r4.i(r3, r1)
            boolean r4 = n(r3)
            if (r4 == 0) goto L3c
            return r3
        L3c:
            return r0
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twe.k(java.lang.String, rc3):java.lang.String");
    }

    public static void l(String str, String str2, bp3 bp3Var, sc3 sc3Var) {
        int i;
        bp3Var.getClass();
        bp3Var.c(str);
        if (sc3Var.g == rc3.a) {
            if (str2 != null) {
                if (str2.length() == 0 || str2.equalsIgnoreCase(str)) {
                    String[] strArr = g40.d;
                    int i2 = 0;
                    int i3 = 29;
                    while (true) {
                        if (i2 <= i3) {
                            i = (i2 + i3) >>> 1;
                            String str3 = strArr[i];
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            int compareTo = str3.compareTo(lowerCase);
                            if (compareTo < 0) {
                                i2 = i + 1;
                            } else if (compareTo <= 0) {
                                break;
                            } else {
                                i3 = i - 1;
                            }
                        } else {
                            i = -(i2 + 1);
                            break;
                        }
                    }
                    if (i >= 0) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        bp3Var.c("=\"");
        char[] cArr = hu3.a;
        if (str2 == null) {
            str2 = "";
        }
        hu3.c(bp3Var, str2, sc3Var, 2);
        bp3Var.b('\"');
    }

    public static boolean m(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static boolean n(String str) {
        int length = str.length();
        if (length != 0) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt > 31 && ((127 > charAt || charAt >= 160) && charAt != ' ' && charAt != '\"' && charAt != '\'' && charAt != '/' && charAt != '=')) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean o(String str) {
        char charAt;
        int length = str.length();
        if (length != 0 && (('a' <= (charAt = str.charAt(0)) && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == '_' || charAt == ':'))) {
            for (int i = 1; i < length; i++) {
                char charAt2 = str.charAt(i);
                if (('a' <= charAt2 && charAt2 < '{') || (('A' <= charAt2 && charAt2 < '[') || (('0' <= charAt2 && charAt2 < ':') || charAt2 == '-' || charAt2 == '_' || charAt2 == ':' || charAt2 == '.'))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final long p(float f, long j) {
        if (!Float.isNaN(f) && f < 1.0f) {
            return zl1.b(zl1.d(j) * f, j);
        }
        return j;
    }

    public static final String q(int i) {
        if (i < 10) {
            return a82.j(i, "0");
        }
        return String.valueOf(i);
    }

    public static final sk8 r(byte[] bArr) {
        long j;
        int i;
        Integer valueOf;
        int length = bArr.length;
        if (length >= 28) {
            int i2 = 0;
            if (yae.I(bArr, 0) == 65534 && yae.J(bArr, 24) >= 1 && length >= 48) {
                long J = yae.J(bArr, 44);
                long j2 = 0;
                if (J >= 0 && J + 8 <= length) {
                    int i3 = (int) J;
                    long J2 = yae.J(bArr, i3);
                    long J3 = yae.J(bArr, i3 + 4);
                    if (J3 >= 0 && J3 <= 65535) {
                        int i4 = i3 + 8;
                        int i5 = (int) J3;
                        if ((i5 * 8) + i4 <= length) {
                            String str = null;
                            String str2 = null;
                            String str3 = null;
                            String str4 = null;
                            String str5 = null;
                            String str6 = null;
                            String str7 = null;
                            Integer num = null;
                            while (i2 < i5) {
                                int i6 = (i2 * 8) + i4;
                                long J4 = yae.J(bArr, i6);
                                int i7 = i3;
                                long J5 = yae.J(bArr, i6 + 4);
                                i2++;
                                int i8 = i7 + ((int) J5);
                                if (J5 >= j2 && (i = i8 + 4) <= length) {
                                    if (J4 == 2) {
                                        str = t(bArr, i8, length);
                                    } else if (J4 == 3) {
                                        t(bArr, i8, length);
                                    } else if (J4 == 4) {
                                        str2 = t(bArr, i8, length);
                                    } else if (J4 == 5) {
                                        str3 = t(bArr, i8, length);
                                    } else if (J4 == 6) {
                                        str4 = t(bArr, i8, length);
                                    } else if (J4 == 8) {
                                        str5 = t(bArr, i8, length);
                                    } else if (J4 == 12) {
                                        str6 = s(bArr, i8, length);
                                    } else if (J4 == 13) {
                                        str7 = s(bArr, i8, length);
                                    } else if (J4 == 14) {
                                        int I = yae.I(bArr, i8);
                                        j = j2;
                                        if (I != 2) {
                                            if (I == 3 && i8 + 8 <= length) {
                                                valueOf = Integer.valueOf(yae.v(bArr, i));
                                                num = valueOf;
                                            }
                                            num = null;
                                        } else {
                                            if (i8 + 6 <= length) {
                                                int I2 = yae.I(bArr, i);
                                                if (I2 >= 32768) {
                                                    I2 -= Parser.ARGC_LIMIT;
                                                }
                                                valueOf = Integer.valueOf(I2);
                                                num = valueOf;
                                            }
                                            num = null;
                                        }
                                        j2 = j;
                                    }
                                    i3 = i7;
                                }
                                j = j2;
                                j2 = j;
                                i3 = i7;
                            }
                            if (J2 < j2) {
                                return null;
                            }
                            return new sk8(str, str2, str3, str4, str5, str6, str7, num);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final String s(byte[] bArr, int i, int i2) {
        long j;
        long j2;
        String valueOf;
        if (yae.I(bArr, i) == 64) {
            int i3 = i + 4;
            if (i + 12 <= i2) {
                long J = yae.J(bArr, i3);
                long J2 = yae.J(bArr, i + 8);
                if (J != 0 || J2 != 0) {
                    long j3 = (J2 << 32) | (J & 4294967295L);
                    if (j3 > 0) {
                        long j4 = (j3 / 10000000) - 11644473600L;
                        if (j4 < 0) {
                            return null;
                        }
                        long j5 = j4 / 86400;
                        long j6 = j4 % 86400;
                        int i4 = (int) (j6 / 3600);
                        long j7 = j6 % 3600;
                        int i5 = (int) (j7 / 60);
                        int i6 = (int) (j7 % 60);
                        long j8 = 719468 + j5;
                        if (j8 >= 0) {
                            j = j8;
                        } else {
                            j = j5 + 573372;
                        }
                        long j9 = j / 146097;
                        long j10 = j8 - (146097 * j9);
                        long j11 = (((j10 / 36524) + (j10 - (j10 / 1460))) - (j10 / 146096)) / 365;
                        long j12 = (j9 * 400) + j11;
                        long j13 = j10 - (((j11 / 4) + (365 * j11)) - (j11 / 100));
                        long j14 = ((j13 * 5) + 2) / 153;
                        int i7 = (int) ((j13 - (((153 * j14) + 2) / 5)) + 1);
                        if (j14 < 10) {
                            j2 = j14 + 3;
                        } else {
                            j2 = j14 - 9;
                        }
                        int i8 = (int) j2;
                        if (i8 <= 2) {
                            j12++;
                        }
                        int i9 = (int) j12;
                        StringBuilder sb = new StringBuilder();
                        if (i9 < 0) {
                            valueOf = String.valueOf(i9);
                        } else if (i9 < 10) {
                            valueOf = a82.j(i9, "000");
                        } else if (i9 < 100) {
                            valueOf = a82.j(i9, "00");
                        } else if (i9 < 1000) {
                            valueOf = a82.j(i9, "0");
                        } else {
                            valueOf = String.valueOf(i9);
                        }
                        sb.append(valueOf);
                        sb.append('-');
                        sb.append(q(i8));
                        sb.append('-');
                        sb.append(q(i7));
                        sb.append('T');
                        sb.append(q(i4));
                        sb.append(':');
                        sb.append(q(i5));
                        sb.append(':');
                        sb.append(q(i6));
                        sb.append('Z');
                        return sb.toString();
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final String t(byte[] bArr, int i, int i2) {
        int i3;
        int I = yae.I(bArr, i);
        int i4 = i + 4;
        if (I != 30) {
            if (I == 31 && (i3 = i + 8) <= i2) {
                long J = yae.J(bArr, i4);
                if (J >= 0) {
                    int i5 = ((int) J) * 2;
                    if (i3 + i5 <= i2) {
                        return h(yae.o(bArr, i3, i5));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        int i6 = i + 8;
        if (i6 <= i2) {
            long J2 = yae.J(bArr, i4);
            if (J2 >= 0) {
                int i7 = (int) J2;
                if (i6 + i7 > i2) {
                    return null;
                }
                return h(p1d.k(bArr, i6, i7));
            }
            return null;
        }
        return null;
    }

    public static long u(long j, long j2) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        boolean z3 = false;
        if (numberOfLeadingZeros < 64) {
            z = true;
        } else {
            z = false;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 == Long.MIN_VALUE) {
            z3 = true;
        }
        if (!(z | (z3 & z2))) {
            long j4 = j * j2;
            if (i == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static so3 v(List list) {
        list.getClass();
        return new so3(list, null, rs3.a, null, null);
    }
}
