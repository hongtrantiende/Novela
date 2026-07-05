package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jbe  reason: default package */
/* loaded from: classes3.dex */
public abstract class jbe {
    public static final tu1 b = new tu1(new sv1(2), false, 112151054);
    public static final String[] c = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    public static final String[] d = {"", "십", "백", "천", "만"};
    public static final String[] e = {"", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    public static final String[] f = {"", "十", "百", "千", "萬"};
    public final /* synthetic */ int a;

    public /* synthetic */ jbe(int i) {
        this.a = i;
    }

    public static final String L(int i, String[] strArr, String[] strArr2, String str) {
        String str2;
        if (i == 0) {
            return str;
        }
        if (i >= 0 && i <= 99999) {
            int i2 = 0;
            String str3 = "";
            while (i > 0) {
                int i3 = i % 10;
                if (i3 > 0) {
                    if (i3 == 1 && i2 > 0) {
                        str2 = "";
                    } else {
                        str2 = strArr[i3];
                    }
                    str3 = eub.o(str2, strArr2[i2], str3);
                }
                i /= 10;
                i2++;
            }
            return str3;
        }
        return String.valueOf(i);
    }

    public static final String M(int i, boolean z) {
        int i2;
        String str = "";
        if (i <= 0) {
            return "";
        }
        while (i > 0) {
            int i3 = i - 1;
            if (z) {
                i2 = 65;
            } else {
                i2 = 97;
            }
            str = ((char) ((i3 % 26) + i2)) + str;
            i = i3 / 26;
        }
        return str;
    }

    public static final String N(int i, v68 v68Var) {
        switch (v68Var.ordinal()) {
            case 0:
                return String.valueOf(i);
            case 1:
                return P(i, "①②③④⑤⑥⑦⑧⑨⑩⑪⑫⑬⑭⑮⑯⑰⑱⑲⑳");
            case 2:
                return O(i, true);
            case 3:
                return O(i, false);
            case 4:
                String M = M(i, true);
                if (M.length() == 0) {
                    return String.valueOf(i);
                }
                return M;
            case 5:
                String M2 = M(i, false);
                if (M2.length() == 0) {
                    return String.valueOf(i);
                }
                return M2;
            case 6:
                return P(i, "가나다라마바사아자차카타파하");
            case 7:
                return P(i, "㉮㉯㉰㉱㉲㉳㉴㉵㉶㉷㉸㉹㉺㉻");
            case 8:
                return P(i, "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ");
            case 9:
                return P(i, "㉠㉡㉢㉣㉤㉥㉦㉧㉨㉩㉪㉫㉬㉭");
            case 10:
                return L(i, c, d, "영");
            case 11:
                return L(i, e, f, "零");
            default:
                xk5.o();
                return null;
        }
    }

    public static final String O(int i, boolean z) {
        int i2 = i;
        if (i2 > 0 && i2 <= 3999) {
            int[] iArr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] strArr = z ? new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"} : new String[]{"m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i"};
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < 13; i3++) {
                while (i2 >= iArr[i3]) {
                    sb.append(strArr[i3]);
                    i2 -= iArr[i3];
                }
            }
            return sb.toString();
        }
        return String.valueOf(i2);
    }

    public static final String P(int i, String str) {
        if (i >= 1 && i <= str.length()) {
            return String.valueOf(str.charAt(i - 1));
        }
        return String.valueOf(i);
    }

    public static final String Q(xtc xtcVar) {
        xtcVar.getClass();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = xtcVar.e;
        String str2 = xtcVar.f;
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
        sb.append(sb2.toString());
        sb.append(xtcVar.a);
        int i = xtcVar.c;
        if (i != 0 && i != xtcVar.d().b) {
            sb.append(":");
            sb.append(String.valueOf(xtcVar.c));
        }
        return sb.toString();
    }

    public static final String R(xtc xtcVar) {
        List list = xtcVar.h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            if (((CharSequence) sl1.c0(list)).length() == 0) {
                return "/";
            }
            return (String) sl1.c0(list);
        }
        return sl1.i0(list, "/", null, null, null, 62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p51] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kq9, java.lang.Object] */
    public static s51 S(q51 q51Var) {
        ?? obj = new Object();
        obj.c = new Object();
        s51 s51Var = new s51(obj);
        obj.b = s51Var;
        obj.a = q51Var.getClass();
        try {
            Object d2 = q51Var.d(obj);
            if (d2 != null) {
                obj.a = d2;
                return s51Var;
            }
            return s51Var;
        } catch (Exception e2) {
            s51Var.b.k(e2);
            return s51Var;
        }
    }

    public static final void U(xtc xtcVar, String str) {
        List arrayList;
        xtcVar.getClass();
        str.getClass();
        if (k4b.j0(str)) {
            arrayList = ks3.a;
        } else if (str.equals("/")) {
            arrayList = ytc.a;
        } else {
            arrayList = new ArrayList(k4b.y0(str, new char[]{'/'}, 0, 6));
        }
        arrayList.getClass();
        xtcVar.h = arrayList;
    }

    public static final void W(int i) {
        throw new IllegalArgumentException(a82.j(i, "An unknown field for index "));
    }

    public static long X(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static void Y(int i, long j, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static byte[] Z(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long X = X(bArr, 0) & 67108863;
            int i = 3;
            long X2 = (X(bArr, 3) >> 2) & 67108611;
            long X3 = (X(bArr, 6) >> 4) & 67092735;
            long X4 = (X(bArr, 9) >> 6) & 66076671;
            long X5 = (X(bArr, 12) >> 8) & 1048575;
            long j = X2 * 5;
            long j2 = X3 * 5;
            long j3 = X4 * 5;
            long j4 = X5 * 5;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            int i2 = 0;
            while (i2 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i2);
                System.arraycopy(bArr2, i2, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, 17, (byte) 0);
                }
                long X6 = j9 + (X(bArr3, 0) & 67108863);
                long X7 = j5 + ((X(bArr3, i) >> 2) & 67108863);
                long X8 = j6 + ((X(bArr3, 6) >> 4) & 67108863);
                long X9 = j7 + ((X(bArr3, 9) >> 6) & 67108863);
                long j10 = X2;
                long X10 = j8 + (((X(bArr3, 12) >> 8) & 67108863) | (bArr3[16] << 24));
                long j11 = (X10 * j) + (X9 * j2) + (X8 * j3) + (X7 * j4) + (X6 * X);
                long j12 = (X10 * j2) + (X9 * j3) + (X8 * j4) + (X7 * X) + (X6 * j10);
                long j13 = (X10 * j3) + (X9 * j4) + (X8 * X) + (X7 * j10) + (X6 * X3);
                long j14 = (X9 * X) + (X8 * j10) + (X7 * X3) + (X6 * X4);
                long j15 = X9 * j10;
                long j16 = X10 * X;
                long j17 = j12 + (j11 >> 26);
                long j18 = j13 + (j17 >> 26);
                long j19 = (X10 * j4) + j14 + (j18 >> 26);
                long j20 = j16 + j15 + (X8 * X3) + (X7 * X4) + (X6 * X5) + (j19 >> 26);
                long j21 = j20 >> 26;
                j8 = j20 & 67108863;
                long j22 = (j21 * 5) + (j11 & 67108863);
                i2 += 16;
                j6 = j18 & 67108863;
                j7 = j19 & 67108863;
                j9 = j22 & 67108863;
                j5 = (j17 & 67108863) + (j22 >> 26);
                X2 = j10;
                i = 3;
            }
            long j23 = j6 + (j5 >> 26);
            long j24 = j23 & 67108863;
            long j25 = j7 + (j23 >> 26);
            long j26 = j25 & 67108863;
            long j27 = j8 + (j25 >> 26);
            long j28 = j27 & 67108863;
            long j29 = ((j27 >> 26) * 5) + j9;
            long j30 = j29 >> 26;
            long j31 = j29 & 67108863;
            long j32 = (j5 & 67108863) + j30;
            long j33 = j31 + 5;
            long j34 = j33 & 67108863;
            long j35 = j32 + (j33 >> 26);
            long j36 = j24 + (j35 >> 26);
            long j37 = j26 + (j36 >> 26);
            long j38 = j37 & 67108863;
            long j39 = (j28 + (j37 >> 26)) - 67108864;
            long j40 = j39 >> 63;
            long j41 = j31 & j40;
            long j42 = j32 & j40;
            long j43 = j24 & j40;
            long j44 = j26 & j40;
            long j45 = j28 & j40;
            long j46 = ~j40;
            long j47 = j42 | (j35 & 67108863 & j46);
            long j48 = j43 | (j36 & 67108863 & j46);
            long j49 = j44 | (j38 & j46);
            long X11 = X(bArr, 16) + ((j41 | (j34 & j46) | (j47 << 26)) & 4294967295L);
            long j50 = X11 & 4294967295L;
            long X12 = X(bArr, 20) + (((j47 >> 6) | (j48 << 20)) & 4294967295L) + (X11 >> 32);
            long X13 = X(bArr, 24) + (((j48 >> 12) | (j49 << 14)) & 4294967295L) + (X12 >> 32);
            long X14 = X(bArr, 28);
            byte[] bArr4 = new byte[16];
            Y(0, j50, bArr4);
            Y(4, X12 & 4294967295L, bArr4);
            Y(8, X13 & 4294967295L, bArr4);
            Y(12, (X14 + (((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L) + (X13 >> 32)) & 4294967295L, bArr4);
            return bArr4;
        }
        vs.m("The key length in bytes must be 32.");
        return null;
    }

    public static final void b(String str, int i, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1659166011);
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i4 = i2 | i3;
        if ((i4 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i4 & 1, z)) {
            tza tzaVar = j27.a;
            v72 v72Var = ((h27) rv4Var2.j(tzaVar)).c.b;
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(kq7Var, v72Var);
            if ((i4 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new hi7(19, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 A = zbe.A(lbe.f(15, (vt4) P, k, null, false), 4.0f, nae.e, 2);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, A);
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
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.k;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            nk0 nk0Var = kh5.e;
            pu0 pu0Var = pu0.a;
            cvb.c(str, zbe.y(pu0Var.a(kq7Var, nk0Var), 4.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var2, 6, 0, 131064);
            if (i > 0) {
                rv4Var2.e0(664993539);
                cvb.c(String.valueOf(i), pu0Var.a(kq7Var, kh5.c), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.o, rv4Var2, 0, 0, 131064);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var2;
                rv4Var2.e0(665237943);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new fg7(str, i, vt4Var, i2, 1);
        }
    }

    public static final void c(nq7 nq7Var, boolean z, float f2, boolean z2, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        float f3;
        int i3;
        int i4;
        rv4Var.g0(1069331665);
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
        int i5 = i2 | 432;
        if ((i & 3072) == 0) {
            if (rv4Var.g(z2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i5 |= i3;
        }
        if ((i5 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i5 & 1, z3)) {
            f99 f99Var = j27.a;
            long j = ((h27) rv4Var.j(f99Var)).a.a;
            long j2 = ((h27) rv4Var.j(f99Var)).a.f;
            long j3 = ((h27) rv4Var.j(f99Var)).a.j;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            m82 m82Var = (m82) P;
            rl8 p = vte.p(((i5 >> 3) & 14) | 48, rv4Var, true);
            dm8 o = vte.o(1.0f, z2, rv4Var, (i5 >> 6) & Token.ELSE);
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = tc4.a(nae.e, 0.01f);
                rv4Var.o0(P2);
            }
            lq lqVar = (lq) P2;
            boolean h = rv4Var.h(m82Var) | rv4Var.h(lqVar);
            Object P3 = rv4Var.P();
            if (h || P3 == obj) {
                P3 = new sh1(m82Var, lqVar, 0);
                rv4Var.o0(P3);
            }
            vte.b((vt4) P3, rv4Var, 6);
            nq7 a0 = nq7Var.a0(pna.c);
            boolean f4 = rv4Var.f(o) | rv4Var.h(p) | rv4Var.h(lqVar) | rv4Var.e(j) | rv4Var.e(j3) | rv4Var.e(j2);
            Object P4 = rv4Var.P();
            if (f4 || P4 == obj) {
                Object th1Var = new th1(o, p, lqVar, j, j3, j2, 0);
                rv4Var.o0(th1Var);
                P4 = th1Var;
            }
            bce.a(a0, (xt4) P4, rv4Var, 0);
            z4 = true;
            f3 = 1.0f;
        } else {
            rv4Var.X();
            z4 = z;
            f3 = f2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new uh1(nq7Var, z4, f3, z2, i, 0);
        }
    }

    public static final void d(boolean z, pc9 pc9Var, List list, xt4 xt4Var, nu4 nu4Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        boolean z4;
        aw7 aw7Var;
        aw7 aw7Var2;
        list.getClass();
        xt4Var.getClass();
        nu4Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(-1968827609);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.h(pc9Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.f(list)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.f(nu4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i11 = i10 | i6;
        if ((74899 & i11) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            m82 m82Var = (m82) P;
            if (pc9Var != null) {
                str = pc9Var.a;
            } else {
                str = null;
            }
            Object[] objArr = {str};
            int i12 = i11 & Token.ASSIGN_MOD;
            if (i12 != 32 && !rv4Var.h(pc9Var)) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == lh9Var) {
                P2 = new u76(pc9Var, 14);
                rv4Var.o0(P2);
            }
            aw7 j = zpe.j(objArr, (vt4) P2, rv4Var, 0);
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = yae.z(null);
                rv4Var.o0(P3);
            }
            aw7 aw7Var3 = (aw7) P3;
            if (pc9Var != null) {
                str2 = pc9Var.a;
            } else {
                str2 = null;
            }
            boolean f2 = rv4Var.f(j);
            if (i12 != 32 && !rv4Var.h(pc9Var)) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean z5 = f2 | z4;
            Object P4 = rv4Var.P();
            if (z5 || P4 == lh9Var) {
                aw7Var = j;
                aw7Var2 = aw7Var3;
                ol olVar = new ol(pc9Var, aw7Var, aw7Var2, (m42) null, 17);
                rv4Var.o0(olVar);
                P4 = olVar;
            } else {
                aw7Var = j;
                aw7Var2 = aw7Var3;
            }
            yte.g((lu4) P4, rv4Var, str2);
            aw7 aw7Var4 = aw7Var2;
            xb.d(z, xt4Var, jce.E(1225788795, new wp0(pc9Var, aw7Var, lu4Var, xt4Var, aw7Var4, 16), rv4Var), null, null, jce.E(-1332880066, new id1(xt4Var, 19, (byte) 0), rv4Var), jce.E(-754113921, new sj(pc9Var, 29), rv4Var), null, 0L, 0L, nae.e, false, false, jce.E(909695955, new bn7(aw7Var, list, pc9Var, m82Var, nu4Var, aw7Var4, 8), rv4Var), rv4Var, (i11 & 14) | 1769904, 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ds1(z, pc9Var, list, xt4Var, nu4Var, lu4Var, i, 6);
        }
    }

    public static final void e(j62 j62Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        ps psVar;
        ps psVar2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-144842998);
        if (rv4Var2.h(j62Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(nq7Var)) {
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
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            String str = j62Var.c;
            if (str == null) {
                str = "";
            }
            String A = yqe.A((y3b) k2b.c0.getValue(), rv4Var2);
            fa7 fa7Var = j62Var.f;
            if (fa7Var instanceof da7) {
                rv4Var2.e0(-1755156143);
                rv4Var2.q(false);
                psVar2 = ((da7) fa7Var).b;
            } else if (fa7Var instanceof ba7) {
                rv4Var2.e0(-1755154912);
                psVar2 = new ps(yqe.A((y3b) f2b.k0.getValue(), rv4Var2));
                rv4Var2.q(false);
            } else if (fa7Var instanceof ca7) {
                rv4Var2.e0(1424957803);
                ca7 ca7Var = (ca7) fa7Var;
                String str2 = ca7Var.b;
                switch (ca7Var.c) {
                    case 100:
                        rv4Var2.e0(-1755147233);
                        psVar2 = new ps(yqe.A((y3b) k2b.T.getValue(), rv4Var2));
                        rv4Var2.q(false);
                        break;
                    case 101:
                        rv4Var2.e0(-1755138950);
                        psVar2 = new ps(yqe.A((y3b) k2b.Z.getValue(), rv4Var2));
                        rv4Var2.q(false);
                        break;
                    case 102:
                        rv4Var2.e0(-1755134656);
                        psVar2 = new ps(yqe.A((y3b) k2b.X.getValue(), rv4Var2));
                        rv4Var2.q(false);
                        break;
                    case Token.ASSIGN_BITAND /* 103 */:
                        rv4Var2.e0(-1755130325);
                        rv4Var2.q(false);
                        if (!k4b.j0(str2)) {
                            A = eub.o(A, ": ", str2);
                        }
                        psVar2 = new ps(A);
                        break;
                    case Token.ASSIGN_LOGICAL_AND /* 104 */:
                        rv4Var2.e0(-1755143015);
                        psVar2 = new ps(yqe.A((y3b) k2b.V.getValue(), rv4Var2));
                        rv4Var2.q(false);
                        break;
                    default:
                        rv4Var2.e0(-1755126627);
                        rv4Var2.q(false);
                        psVar2 = new ps("");
                        break;
                }
                rv4Var2.q(false);
            } else if (fa7Var == null) {
                rv4Var2.e0(-1755125123);
                rv4Var2.q(false);
                psVar = new ps("");
                v9b.a(lbe.f(15, vt4Var, nq7Var, null, false), null, zl1.b(nae.e, ((h27) rv4Var2.j(j27.a)).a.p), 0L, nae.e, nae.e, null, jce.E(-1808053595, new yd1(j62Var, str, vt4Var, psVar, 1), rv4Var2), rv4Var, 12582912, Token.FUNCTION);
                rv4Var2 = rv4Var;
            } else {
                throw rs8.b(-1755157791, rv4Var2, false);
            }
            psVar = psVar2;
            v9b.a(lbe.f(15, vt4Var, nq7Var, null, false), null, zl1.b(nae.e, ((h27) rv4Var2.j(j27.a)).a.p), 0L, nae.e, nae.e, null, jce.E(-1808053595, new yd1(j62Var, str, vt4Var, psVar, 1), rv4Var2), rv4Var, 12582912, Token.FUNCTION);
            rv4Var2 = rv4Var;
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vg7(j62Var, nq7Var, vt4Var, i, 10);
        }
    }

    public static final void f(int i, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        int i3;
        boolean z2;
        float f2;
        rv4Var.g0(2138786852);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            Object obj2 = P;
            if (P == obj) {
                ArrayList arrayList = new ArrayList(8);
                for (int i6 = 0; i6 < 8; i6++) {
                    arrayList.add(Integer.valueOf(i6));
                }
                rv4Var.o0(arrayList);
                obj2 = arrayList;
            }
            List list = (List) obj2;
            th8 g = mwe.g(14, rv4Var);
            if (z) {
                f2 = 92.0f;
            } else {
                f2 = 12.0f;
            }
            bkd r = mwe.r(g, zbe.j(nae.e, 68.0f, nae.e, f2, 5));
            nq7 l = q1d.l(nq7Var, rv4Var, i5 & 14);
            bkd r2 = mwe.r(r, zbe.h(2, 16.0f));
            hz hzVar = new hz(4.0f, true, new vs(2));
            boolean h = rv4Var.h(list);
            Object P2 = rv4Var.P();
            if (h || P2 == obj) {
                P2 = new vd1(2, list);
                rv4Var.o0(P2);
            }
            jce.d(l, null, r2, false, hzVar, null, null, false, null, (xt4) P2, rv4Var, 12607488, 362);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new uq0(nq7Var, z, i);
        }
    }

    public static final void g(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        cz7 cz7Var2;
        pb2 pb2Var;
        boolean z2;
        cz7Var.getClass();
        rv4Var.g0(1087656409);
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
            sdd a = kv6.a(rv4Var);
            if (a != null) {
                if (a instanceof y35) {
                    pb2Var = ((y35) a).f();
                } else {
                    pb2Var = ob2.b;
                }
                v99 v99Var = (v99) ((fdd) voe.z(cm9.a(v99.class), a.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(v99Var.e, rv4Var);
                Object[] objArr = {((u99) z3.getValue()).c};
                boolean f2 = rv4Var.f(z3);
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (f2 || P == obj) {
                    P = new ao7(z3, 19);
                    rv4Var.o0(P);
                }
                aw7 j = zpe.j(objArr, (vt4) P, rv4Var, 0);
                s02 s02Var = v99Var.f;
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P2 = rv4Var.P();
                if (z2 || P2 == obj) {
                    P2 = new ao0(cz7Var, null, 1);
                    rv4Var.o0(P2);
                }
                jye.b(s02Var, null, (mu4) P2, rv4Var, 0);
                cz7Var2 = cz7Var;
                fxe.h(yqe.A((y3b) k2b.K.getValue(), rv4Var), null, false, jce.E(1644876509, new h64(cz7Var, 24), rv4Var), null, jce.E(-2046742472, new xp0(cz7Var, z3), rv4Var), jce.E(1883687022, new q7((fdd) v99Var, z3, (Object) cz7Var, j, 4), rv4Var), rv4Var, 1772544, 22);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h64(cz7Var2, i, 25);
        }
    }

    public static final void h(List list, String str, lu4 lu4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        lh9 lh9Var;
        boolean z2;
        xt4 xt4Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        dz dzVar;
        kq7 kq7Var;
        boolean z9;
        int i6;
        nk0 nk0Var;
        nk0 nk0Var2;
        Object obj = str;
        lu4 lu4Var2 = lu4Var;
        rv4 rv4Var2 = rv4Var;
        nk0 nk0Var3 = kh5.c;
        mk0 mk0Var = kh5.F;
        nk0 nk0Var4 = kh5.e;
        rv4Var2.g0(253220473);
        if (rv4Var2.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var2.f(obj)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var2.h(lu4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i10 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            nq7 f2 = pna.f(kq7Var2, 1.0f);
            gv9 a = ev9.a(new hz(8.0f, true, new vs(2)), kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            nk0 nk0Var5 = nk0Var3;
            nq7 q = rte.q(l(rv4Var2, s21.f(rv4Var2, p, npVar4, 1.0f, true)), rte.u(rv4Var2), 14);
            dz dzVar2 = lz.a;
            nk0 nk0Var6 = nk0Var4;
            gv9 a2 = ev9.a(dzVar2, mk0Var, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, q);
            rv4Var2.i0();
            dz dzVar3 = dzVar2;
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            rv4Var2.e0(1534638715);
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                lh9Var = ax1.a;
                if (!hasNext) {
                    break;
                }
                n3c n3cVar = (n3c) it.next();
                String str2 = n3cVar.a;
                String str3 = n3cVar.c;
                boolean i11 = c16.i(obj, str2 + "-" + str3);
                nq7 h = pna.h(tte.k(kq7Var2, r0f.z(rv4Var2).b), 30.0f);
                if ((i10 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean h2 = z7 | rv4Var2.h(n3cVar);
                Object P = rv4Var2.P();
                if (!h2 && P != lh9Var) {
                    z8 = false;
                } else {
                    z8 = false;
                    P = new qj7(lu4Var2, n3cVar, 0);
                    rv4Var2.o0(P);
                }
                nq7 f3 = lbe.f(15, (vt4) P, h, null, z8);
                nk0 nk0Var7 = kh5.a;
                b37 d2 = fu0.d(nk0Var7, z8);
                int hashCode3 = Long.hashCode(rv4Var2.T);
                xt8 l3 = rv4Var2.l();
                nq7 p3 = lye.p(rv4Var2, f3);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var2.i0();
                Iterator it2 = it;
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var2);
                } else {
                    rv4Var2.r0();
                }
                np npVar5 = qw1.f;
                jce.F(npVar5, rv4Var2, d2);
                np npVar6 = qw1.e;
                jce.F(npVar6, rv4Var2, l3);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                np npVar7 = qw1.g;
                jce.F(npVar7, rv4Var2, valueOf2);
                kg kgVar2 = qw1.h;
                jce.C(kgVar2, rv4Var2);
                np npVar8 = qw1.d;
                jce.F(npVar8, rv4Var2, p3);
                pu0 pu0Var = pu0.a;
                if (i11) {
                    rv4Var2.e0(445243315);
                    nk0 nk0Var8 = nk0Var6;
                    ts6.a(nae.e, 0, 2, ((zl1) rv4Var2.j(r12.a)).a, rv4Var2, pna.n(pu0Var.a(kq7Var2, nk0Var8), 14.0f));
                    rv4Var2.q(false);
                    nk0Var2 = nk0Var8;
                    kq7Var = kq7Var2;
                    i6 = i10;
                    z9 = true;
                    dzVar = dzVar3;
                    nk0Var = nk0Var5;
                } else {
                    kq7 kq7Var3 = kq7Var2;
                    dzVar = dzVar3;
                    int i12 = i10;
                    nk0 nk0Var9 = nk0Var6;
                    if (str2.length() > 0 && !str2.equals("qt")) {
                        rv4Var2.e0(445621329);
                        nq7 p4 = pna.p(zbe.A(kq7Var3, 4.0f, nae.e, 2), 40.0f, 30.0f);
                        b37 d3 = fu0.d(nk0Var7, false);
                        int hashCode4 = Long.hashCode(rv4Var2.T);
                        xt8 l4 = rv4Var2.l();
                        nq7 p5 = lye.p(rv4Var2, p4);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var2);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar5, rv4Var2, d3);
                        jce.F(npVar6, rv4Var2, l4);
                        s21.t(hashCode4, rv4Var2, npVar7, rv4Var2, kgVar2);
                        jce.F(npVar8, rv4Var2, p5);
                        nk0Var2 = nk0Var9;
                        kq7Var = kq7Var3;
                        do5.a(new h54(n3cVar.a), r0f.d, false, null, null, null, tte.k(pna.n(pu0Var.a(kq7Var3, nk0Var9), 20.0f), uu9.a), null, rv4Var, 805306416, 380);
                        cvb.c(n3cVar.c, pu0Var.a(kq7Var, nk0Var5), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).o, rv4Var, 0, 0, 131064);
                        rv4Var2 = rv4Var;
                        rv4Var2.q(true);
                        rv4Var2.q(false);
                        z9 = true;
                        nk0Var = nk0Var5;
                        i6 = i12;
                    } else {
                        kq7Var = kq7Var3;
                        if (n3cVar.b.length() > 0) {
                            rv4Var2.e0(446863127);
                            nq7 A = zbe.A(pna.h(kq7Var, 30.0f), 4.0f, nae.e, 2);
                            b37 d4 = fu0.d(nk0Var7, false);
                            int hashCode5 = Long.hashCode(rv4Var2.T);
                            xt8 l5 = rv4Var2.l();
                            nq7 p6 = lye.p(rv4Var2, A);
                            rv4Var2.i0();
                            if (rv4Var2.S) {
                                rv4Var2.k(zx1Var2);
                            } else {
                                rv4Var2.r0();
                            }
                            jce.F(npVar5, rv4Var2, d4);
                            jce.F(npVar6, rv4Var2, l5);
                            s21.t(hashCode5, rv4Var2, npVar7, rv4Var2, kgVar2);
                            jce.F(npVar8, rv4Var2, p6);
                            nk0Var2 = nk0Var9;
                            nk0Var = nk0Var5;
                            z9 = true;
                            i6 = i12;
                            cvb.c(n3cVar.b, zbe.A(pu0Var.a(kq7Var, nk0Var9), 4.0f, nae.e, 2), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).k, rv4Var, 0, 0, 131064);
                            cvb.c(n3cVar.c, pu0Var.a(kq7Var, nk0Var), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).o, rv4Var, 0, 0, 131064);
                            rv4Var2 = rv4Var;
                            rv4Var2.q(true);
                            rv4Var2.q(false);
                        } else {
                            z9 = true;
                            i6 = i12;
                            nk0Var = nk0Var5;
                            rv4Var2.e0(447967223);
                            String upperCase = str3.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            nk0Var2 = nk0Var9;
                            cvb.c(upperCase, zbe.A(pu0Var.a(kq7Var, nk0Var9), 8.0f, nae.e, 2), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).k, rv4Var, 0, 0, 130040);
                            rv4Var2 = rv4Var;
                            rv4Var2.q(false);
                            rv4Var2.q(z9);
                            obj = str;
                            nk0Var5 = nk0Var;
                            kq7Var2 = kq7Var;
                            it = it2;
                            dzVar3 = dzVar;
                            nk0Var6 = nk0Var2;
                            i10 = i6;
                            lu4Var2 = lu4Var;
                        }
                    }
                }
                rv4Var2.q(z9);
                obj = str;
                nk0Var5 = nk0Var;
                kq7Var2 = kq7Var;
                it = it2;
                dzVar3 = dzVar;
                nk0Var6 = nk0Var2;
                i10 = i6;
                lu4Var2 = lu4Var;
            }
            int i13 = i10;
            rv4Var2.q(false);
            rv4Var2.q(true);
            nq7 q2 = rte.q(l(rv4Var2, kq7Var2), rte.u(rv4Var2), 14);
            gv9 a3 = ev9.a(dzVar3, mk0Var, rv4Var2, 0);
            int hashCode6 = Long.hashCode(rv4Var2.T);
            xt8 l6 = rv4Var2.l();
            nq7 p7 = lye.p(rv4Var2, q2);
            rw1.k.getClass();
            zx1 zx1Var3 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var3);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a3);
            jce.F(qw1.e, rv4Var2, l6);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode6));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p7);
            int i14 = i13 & 7168;
            if (i14 == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var2.P();
            if (!z2 && P2 != lh9Var) {
                xt4Var2 = xt4Var;
            } else {
                xt4Var2 = xt4Var;
                P2 = new hg7(13, xt4Var2);
                rv4Var2.o0(P2);
            }
            b("aa", 0, (vt4) P2, rv4Var2, 54);
            if (i14 == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P3 = rv4Var2.P();
            if (z3 || P3 == lh9Var) {
                P3 = new hg7(14, xt4Var2);
                rv4Var2.o0(P3);
            }
            b("Aa", 1, (vt4) P3, rv4Var2, 54);
            if (i14 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P4 = rv4Var2.P();
            if (z4 || P4 == lh9Var) {
                P4 = new hg7(15, xt4Var2);
                rv4Var2.o0(P4);
            }
            b("Aa", 2, (vt4) P4, rv4Var2, 54);
            if (i14 == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P5 = rv4Var2.P();
            if (z5 || P5 == lh9Var) {
                P5 = new hg7(16, xt4Var2);
                rv4Var2.o0(P5);
            }
            b("Aa", 0, (vt4) P5, rv4Var2, 54);
            if (i14 == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object P6 = rv4Var2.P();
            if (z6 || P6 == lh9Var) {
                P6 = new hg7(17, xt4Var2);
                rv4Var2.o0(P6);
            }
            b("AA", 0, (vt4) P6, rv4Var2, 54);
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rj7(list, str, lu4Var, xt4Var, i, 0);
        }
    }

    public static final void i(xtc xtcVar, StringBuilder sb) {
        List list;
        sb.append(xtcVar.d().a);
        String str = xtcVar.d().a;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = xtcVar.e;
                    String str3 = xtcVar.f;
                    if (str2 != null) {
                        sb2.append(str2);
                        if (str3 != null) {
                            sb2.append(':');
                            sb2.append(str3);
                        }
                        sb2.append("@");
                    }
                    CharSequence sb3 = sb2.toString();
                    CharSequence charSequence = xtcVar.a;
                    sb.append(":");
                    sb.append(sb3);
                    sb.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = xtcVar.a;
                    sb.append(":");
                    sb.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    CharSequence charSequence3 = xtcVar.a;
                    sb.append(":");
                    sb.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    CharSequence charSequence4 = xtcVar.a;
                    String R = R(xtcVar);
                    sb.append("://");
                    sb.append(charSequence4);
                    if (!k4b.B0(R, '/')) {
                        sb.append('/');
                    }
                    sb.append((CharSequence) R);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = xtcVar.a;
                    sb.append(":");
                    sb.append(charSequence5);
                    return;
                }
                break;
        }
        sb.append("://");
        sb.append(Q(xtcVar));
        String R2 = R(xtcVar);
        vl8 vl8Var = xtcVar.i;
        boolean z = xtcVar.b;
        R2.getClass();
        vl8Var.getClass();
        if (!k4b.j0(R2) && !r4b.Q(R2, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) R2);
        if (!((Map) vl8Var.a).isEmpty() || z) {
            sb.append("?");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : vl8Var.a()) {
            String str4 = (String) entry.getKey();
            List<String> list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = tl1.A(new yk8(str4, null));
            } else {
                ArrayList arrayList2 = new ArrayList(tl1.s(list2, 10));
                for (String str5 : list2) {
                    arrayList2.add(new yk8(str4, str5));
                }
                list = arrayList2;
            }
            xl1.P(arrayList, list);
        }
        sl1.h0(arrayList, sb, "&", new txb(28), 60);
        if (xtcVar.g.length() > 0) {
            sb.append('#');
            sb.append(xtcVar.g);
        }
    }

    public static final Bitmap j(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = sve.x(sve.c(i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    public static final nq7 l(rv4 rv4Var, nq7 nq7Var) {
        nq7 h = pna.h(nq7Var, 34.0f);
        tza tzaVar = j27.a;
        return zbe.z(st0.d(nmd.v(tte.k(h, ((h27) rv4Var.j(tzaVar)).c.b), zl1.b(0.32f, ((h27) rv4Var.j(tzaVar)).a.r), lre.g), 1.0f, zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.B), ((h27) rv4Var.j(tzaVar)).c.b), 2.0f, 2.0f);
    }

    public abstract void A(long j);

    public void B(o9a o9aVar, int i, long j) {
        o9aVar.getClass();
        s(o9aVar, i);
        A(j);
    }

    public abstract void D();

    public void E(o9a o9aVar, int i, s76 s76Var, Object obj) {
        o9aVar.getClass();
        s76Var.getClass();
        s(o9aVar, i);
        if (s76Var.e().c()) {
            G(s76Var, obj);
        } else if (obj == null) {
            D();
        } else {
            G(s76Var, obj);
        }
    }

    public void F(o9a o9aVar, int i, s76 s76Var, Object obj) {
        o9aVar.getClass();
        s76Var.getClass();
        s(o9aVar, i);
        G(s76Var, obj);
    }

    public abstract void G(s76 s76Var, Object obj);

    public abstract void H(short s);

    public abstract void I(String str);

    public void J(o9a o9aVar, int i, String str) {
        o9aVar.getClass();
        str.getClass();
        s(o9aVar, i);
        I(str);
    }

    public void K(o9a o9aVar) {
        o9aVar.getClass();
    }

    public abstract wf2 T();

    public abstract boolean V(o9a o9aVar);

    public abstract jbe k(o9a o9aVar);

    public abstract Object m();

    public abstract void n(boolean z);

    public void o(o9a o9aVar, int i, boolean z) {
        o9aVar.getClass();
        s(o9aVar, i);
        n(z);
    }

    public abstract void p(byte b2);

    public abstract void q(char c2);

    public abstract void r(double d2);

    public abstract void s(o9a o9aVar, int i);

    public abstract void t(o9a o9aVar, int i);

    public String toString() {
        switch (this.a) {
            case 7:
                return m().toString();
            default:
                return super.toString();
        }
    }

    public abstract void u(float f2);

    public void v(o9a o9aVar, int i, float f2) {
        o9aVar.getClass();
        s(o9aVar, i);
        u(f2);
    }

    public jbe w(o9a o9aVar) {
        o9aVar.getClass();
        return this;
    }

    public jbe x(u59 u59Var, int i) {
        u59Var.getClass();
        s(u59Var, i);
        return w(u59Var.i(i));
    }

    public abstract void y(int i);

    public void z(int i, int i2, o9a o9aVar) {
        o9aVar.getClass();
        s(o9aVar, i);
        y(i2);
    }
}
