package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p1d  reason: default package */
/* loaded from: classes.dex */
public final class p1d {
    public static final tu1 b = new tu1(new c8(20, (byte) 0), false, -440239641);
    public static final tu1 c = new tu1(new tx0(12), false, 604558751);
    public static final tu1 d = new tu1(new c8(21, (byte) 0), false, -1311240969);
    public static final int[] e = {8364, 0, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 0, 381, 0, 0, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 0, 382, 376};
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public static Boolean g;
    public static Boolean h;
    public static Boolean i;
    public static Boolean j;
    public final /* synthetic */ int a;

    public /* synthetic */ p1d(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
        if (r2 == defpackage.ax1.a) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r24, java.util.List r25, defpackage.rv4 r26, int r27) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1d.a(java.lang.String, java.util.List, rv4, int):void");
    }

    public static final void b(String str, String str2, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        String str3;
        int i4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1465741260);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if ((i2 & 48) == 0) {
            if (rv4Var2.f(str2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        int i6 = i5;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            tza tzaVar = j27.a;
            cvb.c(str, null, ((h27) rv4Var2.j(tzaVar)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.n, rv4Var, i6 & 14, 0, 131066);
            rv4Var2 = rv4Var;
            if (str2.length() > 0) {
                rv4Var2.e0(1034865465);
                kq7 kq7Var = kq7.a;
                xbe.i(rv4Var2, pna.h(kq7Var, 2.0f));
                str3 = str2;
                cvb.c(str3, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, ((i6 >> 3) & 14) | 48, 24576, 113660);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                str3 = str2;
                rv4Var2.e0(1035131662);
                rv4Var2.q(false);
            }
        } else {
            str3 = str2;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new gk7(str, str3, i2, 19);
        }
    }

    public static final void c(wzc wzcVar, boolean z, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        aw7 aw7Var;
        List list;
        List list2;
        boolean z6;
        wzc wzcVar2 = wzcVar;
        xt4 xt4Var4 = xt4Var;
        Object obj = xt4Var2;
        rv4 rv4Var2 = rv4Var;
        xt4Var4.getClass();
        obj.getClass();
        xt4Var3.getClass();
        rv4Var2.g0(1245577022);
        if (rv4Var2.h(wzcVar2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(xt4Var4)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var2.h(obj)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        Object obj2 = xt4Var3;
        if (rv4Var2.h(obj2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i12 & 1, z2)) {
            Object[] objArr = {wzcVar2.a};
            int i13 = i12 & 14;
            if (i13 != 4 && !rv4Var2.h(wzcVar2)) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z3 || P == lh9Var) {
                P = new u76(wzcVar2, 17);
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P, rv4Var2, 0);
            Boolean valueOf = Boolean.valueOf(z);
            List list3 = wzcVar2.h;
            if ((i12 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean f2 = z4 | rv4Var2.f(aw7Var2);
            if (i13 != 4 && !rv4Var2.h(wzcVar2)) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z7 = z5 | f2;
            Object P2 = rv4Var2.P();
            if (z7 || P2 == lh9Var) {
                aw7Var = aw7Var2;
                er0 er0Var = new er0(5, (m42) null, wzcVar, aw7Var, z);
                wzcVar2 = wzcVar;
                rv4Var2.o0(er0Var);
                P2 = er0Var;
            } else {
                aw7Var = aw7Var2;
            }
            int i14 = i12 >> 3;
            int i15 = i14 & 14;
            yte.h(valueOf, list3, (lu4) P2, rv4Var2);
            boolean f3 = rv4Var2.f((String) aw7Var.getValue());
            Object P3 = rv4Var2.P();
            if (f3 || P3 == lh9Var) {
                String obj3 = k4b.N0((String) aw7Var.getValue()).toString();
                Pattern compile = Pattern.compile("\\s+");
                compile.getClass();
                obj3.getClass();
                k4b.w0(0);
                Matcher matcher = compile.matcher(obj3);
                if (!matcher.find()) {
                    list = tl1.A(obj3.toString());
                } else {
                    ArrayList arrayList = new ArrayList(10);
                    int i16 = 0;
                    while (true) {
                        arrayList.add(obj3.subSequence(i16, matcher.start()).toString());
                        i16 = matcher.end();
                        if (!matcher.find()) {
                            break;
                        }
                        wzcVar2 = wzcVar;
                        xt4Var4 = xt4Var;
                        obj = xt4Var2;
                        obj2 = xt4Var3;
                        rv4Var2 = rv4Var;
                    }
                    arrayList.add(obj3.subSequence(i16, obj3.length()).toString());
                    list = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (!k4b.j0((String) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj5 = arrayList2.get(i17);
                    i17++;
                    String str = (String) obj5;
                    ArrayList arrayList4 = arrayList2;
                    Pattern compile2 = Pattern.compile("^#(?:[0-9a-fA-F]{3}|[0-9a-fA-F]{6}|[0-9a-fA-F]{8})$");
                    compile2.getClass();
                    str.getClass();
                    if (compile2.matcher(str).matches()) {
                        arrayList3.add(obj5);
                    }
                    arrayList2 = arrayList4;
                }
                rv4Var2.o0(arrayList3);
                P3 = arrayList3;
            }
            List list4 = (List) P3;
            boolean f4 = rv4Var2.f((String) aw7Var.getValue()) | rv4Var2.f(list4);
            Object P4 = rv4Var2.P();
            if (!f4 && P4 != lh9Var) {
                list2 = list4;
            } else {
                if (!k4b.j0((String) aw7Var.getValue())) {
                    list2 = list4;
                    String i0 = sl1.i0(list2, " ", null, null, null, 62);
                    String obj6 = k4b.N0((String) aw7Var.getValue()).toString();
                    Pattern compile3 = Pattern.compile("\\s+");
                    compile3.getClass();
                    obj6.getClass();
                    String replaceAll = compile3.matcher(obj6).replaceAll(" ");
                    replaceAll.getClass();
                    if (!i0.equals(replaceAll)) {
                        z6 = true;
                        P4 = Boolean.valueOf(z6);
                        rv4Var2.o0(P4);
                    }
                } else {
                    list2 = list4;
                }
                z6 = false;
                P4 = Boolean.valueOf(z6);
                rv4Var2.o0(P4);
            }
            xb.d(z, xt4Var, jce.E(-2121905774, new sv4(27, obj, wzcVar2), rv4Var2), null, null, jce.E(47965525, new id1(xt4Var4, 26, (byte) 0), rv4Var2), c16.b, null, 0L, 0L, nae.e, false, false, jce.E(1220442090, new b62(wzcVar2, list2, ((Boolean) P4).booleanValue(), aw7Var, obj2), rv4Var2), rv4Var, 1769856 | i15 | (i14 & Token.ASSIGN_MOD), 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new b62(wzcVar, z, xt4Var, xt4Var2, xt4Var3, i2);
        }
    }

    public static final void d(th6 th6Var, Object obj, int i2, Object obj2, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        rv4Var.g0(1439843069);
        if (rv4Var.f(th6Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i3;
        if (rv4Var.f(obj)) {
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
        if (rv4Var.f(obj2)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i11 = i10 | i7;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            ((sx9) obj).b(obj2, jce.E(980966366, new gk7(th6Var, i2, obj2, 13), rv4Var), rv4Var, 48);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(th6Var, obj, i2, obj2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x014e, code lost:
        if (r7 == defpackage.ax1.a) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.wzc r36, java.lang.String r37, java.util.List r38, boolean r39, defpackage.xt4 r40, defpackage.vt4 r41, defpackage.nq7 r42, defpackage.rv4 r43, int r44) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1d.e(wzc, java.lang.String, java.util.List, boolean, xt4, vt4, nq7, rv4, int):void");
    }

    public static final b27 f(Matcher matcher, int i2, CharSequence charSequence) {
        if (!matcher.find(i2)) {
            return null;
        }
        return new b27(matcher, charSequence);
    }

    public static void g(long j2, km8 km8Var, fjc[] fjcVarArr) {
        int i2;
        int i3;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (km8Var.a() > 1) {
                int i4 = 0;
                while (true) {
                    if (km8Var.a() == 0) {
                        i2 = -1;
                        break;
                    }
                    int z3 = km8Var.z();
                    i4 += z3;
                    if (z3 != 255) {
                        i2 = i4;
                        break;
                    }
                }
                int i5 = 0;
                while (true) {
                    if (km8Var.a() == 0) {
                        i5 = -1;
                        break;
                    }
                    int z4 = km8Var.z();
                    i5 += z4;
                    if (z4 != 255) {
                        break;
                    }
                }
                int i6 = km8Var.b + i5;
                if (i5 != -1 && i5 <= km8Var.a()) {
                    if (i2 == 4 && i5 >= 8) {
                        int z5 = km8Var.z();
                        int G = km8Var.G();
                        if (G == 49) {
                            i3 = km8Var.m();
                        } else {
                            i3 = 0;
                        }
                        int z6 = km8Var.z();
                        if (G == 47) {
                            km8Var.N(1);
                        }
                        if (z5 == 181 && ((G == 49 || G == 47) && z6 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (G == 49) {
                            if (i3 != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            h(j2, km8Var, fjcVarArr);
                        }
                    }
                } else {
                    st0.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i6 = km8Var.c;
                }
                km8Var.M(i6);
            } else {
                return;
            }
        }
    }

    public static void h(long j2, km8 km8Var, fjc[] fjcVarArr) {
        boolean z;
        int z2 = km8Var.z();
        if ((z2 & 64) != 0) {
            km8Var.N(1);
            int i2 = (z2 & 31) * 3;
            int i3 = km8Var.b;
            for (fjc fjcVar : fjcVarArr) {
                km8Var.M(i3);
                fjcVar.e(i2, km8Var);
                if (j2 != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                wq9.D(z);
                fjcVar.a(j2, 1, i2, 0, null);
            }
        }
    }

    public static StaticLayout i(CharSequence charSequence, TextPaint textPaint, int i2, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, boolean z, int i7, int i8, int i9, int i10) {
        if (i3 < 0) {
            mv5.a("invalid start value");
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            mv5.a("invalid end value");
        }
        if (i4 < 0) {
            mv5.a("invalid maxLines value");
        }
        if (i2 < 0) {
            mv5.a("invalid width value");
        }
        if (i5 < 0) {
            mv5.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i3, textPaint, i2);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i4);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i5);
        obtain.setLineSpacing(nae.e, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i7);
        obtain.setHyphenationFrequency(i10);
        obtain.setIndents(null, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            h50.z(obtain, i6);
        }
        if (i11 >= 28) {
            ru.O(obtain);
        }
        if (i11 >= 33) {
            r4.z(obtain, i8, i9);
        }
        if (i11 >= 35) {
            oo3.a(obtain);
        }
        return obtain.build();
    }

    public static final gd j(zc6 zc6Var) {
        float abs;
        zc6Var.getClass();
        mi8 mi8Var = (mi8) sl1.e0((List) zc6Var.o.getValue());
        if (mi8Var == null) {
            return null;
        }
        int i2 = mi8Var.a;
        float f2 = mi8Var.b;
        float abs2 = Math.abs(mi8Var.c) - Math.abs(f2);
        if (abs2 == nae.e) {
            return new gd(i2, nae.e);
        }
        if (zc6Var.j()) {
            abs = Math.abs(zc6Var.g());
        } else {
            abs = Math.abs(zc6Var.f());
        }
        return new gd(i2, (abs - Math.abs(f2)) / abs2);
    }

    public static final String k(byte[] bArr, int i2, int i3) {
        char c2;
        StringBuilder sb = new StringBuilder(i3);
        int min = Math.min(i3 + i2, bArr.length);
        while (i2 < min) {
            int i4 = bArr[i2] & 255;
            if (128 <= i4 && i4 < 160) {
                int i5 = e[i4 - 128];
                if (i5 != 0) {
                    c2 = (char) i5;
                    sb.append(c2);
                    i2++;
                }
            }
            c2 = (char) i4;
            sb.append(c2);
            i2++;
        }
        return sb.toString();
    }

    public static boolean n(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (g == null) {
            g = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        g.booleanValue();
        if (h == null) {
            h = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (h.booleanValue()) {
            if (!yz1.o() || Build.VERSION.SDK_INT >= 30) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final lu4 o(e25 e25Var, gz gzVar, rv4 rv4Var) {
        boolean f2 = rv4Var.f(e25Var);
        Object P = rv4Var.P();
        if (f2 || P == ax1.a) {
            P = new sv4(2, e25Var, gzVar);
            rv4Var.o0(P);
        }
        return (lu4) P;
    }

    public static final b37 p(lu4 lu4Var, boolean z, gz gzVar, jz jzVar, rv4 rv4Var, int i2) {
        boolean z2;
        lu4Var.getClass();
        boolean f2 = rv4Var.f(lu4Var) | rv4Var.g(z);
        if ((((i2 & 7168) ^ 3072) > 2048 && rv4Var.f(jzVar)) || (i2 & 3072) == 2048) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = z2 | f2;
        Object P = rv4Var.P();
        if (z3 || P == ax1.a) {
            o25 o25Var = new o25(lu4Var, z, new j25(jzVar, 0), jzVar.b(), new j25(gzVar, 1), gzVar.b());
            rv4Var.o0(o25Var);
            P = o25Var;
        }
        return (b37) P;
    }

    public static final File q(Uri uri) {
        if (uri.getScheme().equals("file")) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getAuthority())) {
                    return new File(uri.getPath());
                }
                throw new IOException("Did not expect uri to have authority");
            }
            throw new IOException("Did not expect uri to have query");
        }
        throw new IOException("Scheme must be 'file'");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l(byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1d.l(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(java.lang.String r25, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1d.m(java.lang.String, byte[], int, int):int");
    }
}
