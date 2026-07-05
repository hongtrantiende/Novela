package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cwe  reason: default package */
/* loaded from: classes.dex */
public abstract class cwe {
    public static final tu1 a = new tu1(new dv1(21), false, 1356723171);
    public static final tu1 b = new tu1(new dv1(22), false, 1563984668);
    public static final tu1 c = new tu1(new wu1(18), false, 892579533);
    public static final qm1 d;
    public static final qm1 e;
    public static final qm1 f;
    public static final float g;
    public static final qm1 h;
    public static final int[] i;
    public static ar5 j;

    static {
        new tu1(new wu1(19), false, 1754373537);
        d = qm1.I;
        qm1 qm1Var = qm1.e;
        e = qm1Var;
        f = qm1Var;
        g = 1.0f;
        h = qm1.d;
        i = new int[]{1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    }

    public static sm1 a(sm1 sm1Var) {
        hid hidVar = dye.f;
        if (vve.d(sm1Var.b, 12884901888L)) {
            zs9 zs9Var = (zs9) sm1Var;
            hid hidVar2 = zs9Var.d;
            if (!f(hidVar2, hidVar)) {
                return new zs9(zs9Var.a, zs9Var.h, hidVar, p(e(f7.c.b, hidVar2.a(), hidVar.a()), zs9Var.i), zs9Var.k, zs9Var.n, zs9Var.e, zs9Var.f, zs9Var.g, -1);
            }
        }
        return sm1Var;
    }

    public static final void b(uo3 uo3Var, String str, cm0 cm0Var, lo3 lo3Var, ym0 ym0Var, wm0 wm0Var) {
        Object obj;
        uo3Var.getClass();
        cm0Var.getClass();
        String str2 = cm0Var.a;
        lo3Var.getClass();
        ym0Var.getClass();
        wm0Var.getClass();
        so3 e2 = uo3Var.e();
        ArrayList l = iwe.l(e2.a, str, cm0Var);
        so3 a2 = so3.a(e2, l, lo3Var.a, gwe.s(lo3Var, l), null, null, 24);
        uo3Var.g(a2, false);
        cm0 cm0Var2 = null;
        if (ym0Var.b(str) == null) {
            ym0.c(ym0Var, str, str2);
        } else {
            ym0Var.h(str, str2, null);
        }
        yya f2 = wm0Var.f(str);
        List list = cm0Var.b;
        if (f2 == null) {
            wm0Var.g(str2.length(), str, list);
        } else {
            wm0Var.l(str2.length(), str, list);
        }
        String str3 = lo3Var.a;
        if (str3 != null && ym0Var.b(str3) == null) {
            xl0 c2 = a2.c(str3);
            if (c2 != null) {
                obj = c2.c;
            } else {
                obj = null;
            }
            if (obj instanceof cm0) {
                cm0Var2 = (cm0) obj;
            }
            if (cm0Var2 != null) {
                ym0.c(ym0Var, str3, cm0Var2.a);
            }
        }
        kwe.M(lo3Var, a2, ym0Var, wm0Var);
    }

    public static final q65 c(no3 no3Var, no3 no3Var2) {
        no3Var.getClass();
        gwe.t(no3Var);
        gwe.t(no3Var2);
        gwe.t(no3Var);
        gwe.t(no3Var2);
        List list = no3Var.a;
        List list2 = no3Var2.a;
        xm0 xm0Var = null;
        if (list.size() == list2.size()) {
            Iterator it = tl1.w(list).iterator();
            String str = null;
            cm0 cm0Var = null;
            cm0 cm0Var2 = null;
            while (true) {
                sy5 sy5Var = (sy5) it;
                if (sy5Var.c) {
                    int nextInt = sy5Var.nextInt();
                    xl0 xl0Var = (xl0) list.get(nextInt);
                    xl0 xl0Var2 = (xl0) list2.get(nextInt);
                    String str2 = xl0Var.a;
                    dm0 dm0Var = xl0Var.c;
                    String str3 = xl0Var2.a;
                    dm0 dm0Var2 = xl0Var2.c;
                    if (!c16.i(str2, str3) || !c16.i(xl0Var.b, xl0Var2.b)) {
                        break;
                    } else if (!c16.i(dm0Var, dm0Var2)) {
                        if (str != null) {
                            break;
                        }
                        if (dm0Var instanceof cm0) {
                            cm0Var = (cm0) dm0Var;
                        } else {
                            cm0Var = null;
                        }
                        if (cm0Var == null) {
                            break;
                        }
                        if (dm0Var2 instanceof cm0) {
                            cm0Var2 = (cm0) dm0Var2;
                        } else {
                            cm0Var2 = null;
                        }
                        if (cm0Var2 == null) {
                            break;
                        }
                        str = xl0Var.a;
                    }
                } else if (str != null) {
                    if (cm0Var != null) {
                        if (cm0Var2 != null) {
                            xm0Var = new xm0(str, cm0Var, cm0Var2, no3Var.b, no3Var2.b);
                        } else {
                            vs.m("Required value was null.");
                            return null;
                        }
                    } else {
                        vs.m("Required value was null.");
                        return null;
                    }
                }
            }
        }
        if (xm0Var != null) {
            return xm0Var;
        }
        return new t4b(no3Var, no3Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [my0, java.lang.Object, osa] */
    /* JADX WARN: Type inference failed for: r4v9, types: [my0, java.lang.Object, osa] */
    public static void d(long j2, my0 my0Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 < i4) {
            for (int i9 = i3; i9 < i4; i9++) {
                if (((e31) arrayList4.get(i9)).e() < i8) {
                    vs.m("Failed requirement.");
                    return;
                }
            }
            e31 e31Var = (e31) arrayList.get(i3);
            e31 e31Var2 = (e31) arrayList4.get(i4 - 1);
            if (i8 == e31Var.e()) {
                int intValue = ((Number) arrayList5.get(i3)).intValue();
                int i10 = i3 + 1;
                e31 e31Var3 = (e31) arrayList4.get(i10);
                i5 = i10;
                i6 = intValue;
                e31Var = e31Var3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            if (e31Var.j(i8) != e31Var2.j(i8)) {
                int i11 = 1;
                for (int i12 = i5 + 1; i12 < i4; i12++) {
                    if (((e31) arrayList4.get(i12 - 1)).j(i8) != ((e31) arrayList4.get(i12)).j(i8)) {
                        i11++;
                    }
                }
                long j4 = (my0Var.b / 4) + j2 + 2 + (i11 * 2);
                my0Var.m9writeInt(i11);
                my0Var.m9writeInt(i6);
                for (int i13 = i5; i13 < i4; i13++) {
                    byte j5 = ((e31) arrayList4.get(i13)).j(i8);
                    if (i13 == i5 || j5 != ((e31) arrayList4.get(i13 - 1)).j(i8)) {
                        my0Var.m9writeInt(j5 & 255);
                    }
                }
                ?? obj = new Object();
                int i14 = i5;
                while (i14 < i4) {
                    byte j6 = ((e31) arrayList4.get(i14)).j(i8);
                    int i15 = i14 + 1;
                    int i16 = i15;
                    while (true) {
                        if (i16 < i4) {
                            if (j6 != ((e31) arrayList4.get(i16)).j(i8)) {
                                break;
                            }
                            i16++;
                        } else {
                            i16 = i4;
                            break;
                        }
                    }
                    if (i15 == i16 && i8 + 1 == ((e31) arrayList4.get(i14)).e()) {
                        my0Var.m9writeInt(((Number) arrayList5.get(i14)).intValue());
                        arrayList3 = arrayList5;
                        j3 = j4;
                        i7 = i16;
                    } else {
                        my0Var.m9writeInt(((int) ((obj.b / 4) + j4)) * (-1));
                        arrayList3 = arrayList5;
                        j3 = j4;
                        i7 = i16;
                        d(j3, obj, i8 + 1, arrayList, i14, i7, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j4 = j3;
                    i14 = i7;
                    arrayList5 = arrayList3;
                }
                my0Var.J(obj);
                return;
            }
            int min = Math.min(e31Var.e(), e31Var2.e());
            int i17 = 0;
            for (int i18 = i8; i18 < min && e31Var.j(i18) == e31Var2.j(i18); i18++) {
                i17++;
            }
            long j7 = (my0Var.b / 4) + j2 + 2 + i17 + 1;
            my0Var.m9writeInt(-i17);
            my0Var.m9writeInt(i6);
            int i19 = i8 + i17;
            while (i8 < i19) {
                my0Var.m9writeInt(e31Var.j(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i19 == ((e31) arrayList4.get(i5)).e()) {
                    my0Var.m9writeInt(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    vs.k("Check failed.");
                    return;
                }
            }
            ?? obj2 = new Object();
            my0Var.m9writeInt(((int) ((obj2.b / 4) + j7)) * (-1));
            d(j7, obj2, i19, arrayList4, i5, i4, arrayList5);
            my0Var.J(obj2);
            return;
        }
        vs.m("Failed requirement.");
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        q(fArr, fArr2);
        q(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] l = l(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return p(l, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean f(hid hidVar, hid hidVar2) {
        if (hidVar == hidVar2) {
            return true;
        }
        if (Math.abs(hidVar.a - hidVar2.a) < 0.001f && Math.abs(hidVar.b - hidVar2.b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final b02 g(sm1 sm1Var, sm1 sm1Var2) {
        if (sm1Var == sm1Var2) {
            return new b02(sm1Var, sm1Var, 1);
        }
        if (vve.d(sm1Var.b, 12884901888L) && vve.d(sm1Var2.b, 12884901888L)) {
            return new a02((zs9) sm1Var, (zs9) sm1Var2);
        }
        return new b02(sm1Var, sm1Var2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r9 == r5) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.u10 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.v10
            if (r0 == 0) goto L13
            r0 = r9
            v10 r0 = (defpackage.v10) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            v10 r0 = new v10
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            long r0 = r0.b
            defpackage.hre.r(r9)
            goto L5b
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L33:
            u10 r8 = r0.a
            defpackage.hre.r(r9)
            goto L47
        L39:
            defpackage.hre.r(r9)
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r8.e(r0)
            if (r9 != r5) goto L47
            goto L59
        L47:
            java.lang.Number r9 = (java.lang.Number) r9
            long r6 = r9.longValue()
            r0.a = r2
            r0.b = r6
            r0.d = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r5) goto L5a
        L59:
            return r5
        L5a:
            r0 = r6
        L5b:
            java.lang.Number r9 = (java.lang.Number) r9
            long r8 = r9.longValue()
            long r0 = r0 - r8
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwe.h(u10, n42):java.lang.Object");
    }

    public static final int i(String str, Bundle bundle) {
        str.getClass();
        int i2 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i2 == Integer.MIN_VALUE && bundle.getInt(str, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            gwe.l(str);
            throw null;
        }
        return i2;
    }

    public static final Bundle j(String str, Bundle bundle) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        gwe.l(str);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.hl0 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.w10
            if (r0 == 0) goto L13
            r0 = r5
            w10 r0 = (defpackage.w10) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            w10 r0 = new w10
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.b = r2
            java.lang.Object r5 = h(r4, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            java.lang.Number r5 = (java.lang.Number) r5
            long r4 = r5.longValue()
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwe.k(hl0, n42):java.lang.Object");
    }

    public static final float[] l(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static ow6 m(String str) {
        ow6 ow6Var;
        String str2;
        synchronized (ow6.c) {
            try {
                String replace = str.replace('.', '_');
                replace.getClass();
                String replace2 = replace.replace('/', '_');
                replace2.getClass();
                Locale locale = Locale.ROOT;
                String upperCase = replace2.toUpperCase(locale);
                upperCase.getClass();
                HashMap hashMap = ow6.d;
                if (hashMap.get(upperCase) == null) {
                    ow6 ow6Var2 = new ow6(str);
                    String str3 = (String) ((LinkedHashMap) iwe.f()).get("LOG_".concat(upperCase));
                    if (str3 != null) {
                        lw6.b.getClass();
                        LinkedHashMap linkedHashMap = lw6.c;
                        String upperCase2 = str3.toUpperCase(locale);
                        upperCase2.getClass();
                        lw6 lw6Var = (lw6) linkedHashMap.get(upperCase2);
                        if (lw6Var == null) {
                            lw6Var = lw6.NONE;
                        }
                        ow6Var2.b = lw6Var;
                    }
                    if (hashMap.isEmpty() && (str2 = (String) ((LinkedHashMap) iwe.f()).get("LOG_LEVEL")) != null) {
                        lw6.b.getClass();
                        LinkedHashMap linkedHashMap2 = lw6.c;
                        String upperCase3 = str2.toUpperCase(locale);
                        upperCase3.getClass();
                        lw6 lw6Var2 = (lw6) linkedHashMap2.get(upperCase3);
                        if (lw6Var2 == null) {
                            lw6Var2 = lw6.NONE;
                        }
                        ow6.e = lw6Var2;
                    }
                    hashMap.put(upperCase, ow6Var2);
                }
                Object obj = hashMap.get(upperCase);
                obj.getClass();
                ow6Var = (ow6) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ow6Var;
    }

    public static boolean n(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        for (int i3 = 0; i3 < 29; i3++) {
            if (i[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o(pmb pmbVar, int i2, int i3) {
        pmbVar.getClass();
        if (pmbVar.j >= i2 && i3 >= pmbVar.i) {
            return true;
        }
        return false;
    }

    public static final float[] p(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        float f6 = f4 * f5;
        fArr3[0] = f6 + (f2 * f3) + (fArr[0] * fArr2[0]);
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f5;
        fArr3[1] = f11 + (f3 * f9) + (f7 * f8);
        float f12 = fArr[5];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13 + (fArr[2] * f8);
        float f15 = fArr[0];
        float f16 = fArr2[4];
        float f17 = (f2 * f16) + (fArr2[3] * f15);
        float f18 = fArr2[5];
        fArr3[3] = (f4 * f18) + f17;
        float f19 = fArr[1];
        float f20 = fArr2[3];
        float f21 = f9 * f16;
        fArr3[4] = (f10 * f18) + f21 + (f19 * f20);
        float f22 = fArr[2];
        float f23 = f18 * f14;
        fArr3[5] = f23 + (f12 * fArr2[4]) + (f20 * f22);
        float f24 = f15 * fArr2[6];
        float f25 = fArr[3];
        float f26 = fArr2[7];
        float f27 = (f25 * f26) + f24;
        float f28 = fArr2[8];
        fArr3[6] = (f4 * f28) + f27;
        float f29 = fArr2[6];
        float f30 = f10 * f28;
        fArr3[7] = f30 + (fArr[4] * f26) + (f19 * f29);
        float f31 = f14 * f28;
        fArr3[8] = f31 + (fArr[5] * fArr2[7]) + (f22 * f29);
        return fArr3;
    }

    public static final float[] q(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f5 = fArr[5] * f3;
        fArr2[2] = (fArr[8] * f4) + f5 + (fArr[2] * f2);
        return fArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [my0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.we8 r(defpackage.e31... r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwe.r(e31[]):we8");
    }

    public static void s(Window window, boolean z) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            qka.u(window, z);
        } else if (i3 >= 30) {
            qka.t(window, z);
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i2 = systemUiVisibility & (-1793);
            } else {
                i2 = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ura t(s94 s94Var, boolean z, boolean z2) {
        ura uraVar;
        int i2;
        long j2;
        int i3;
        long j3;
        int i4;
        int i5;
        long j4;
        int i6;
        boolean z3;
        int[] iArr;
        long length = s94Var.getLength();
        long j5 = -1;
        int i7 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j6 = 4096;
        if (i7 != 0 && length <= 4096) {
            j6 = length;
        }
        int i8 = (int) j6;
        km8 km8Var = new km8(64);
        int i9 = 0;
        int i10 = 0;
        boolean z4 = false;
        while (i10 < i8) {
            km8Var.J(8);
            if (!s94Var.f(km8Var.a, i9, 8, true)) {
                break;
            }
            long B = km8Var.B();
            int m = km8Var.m();
            if (B == 1) {
                j2 = j5;
                s94Var.x(km8Var.a, 8, 8);
                i5 = 16;
                km8Var.L(16);
                i3 = i10;
                j3 = km8Var.t();
                i4 = i7;
            } else {
                j2 = j5;
                if (B == 0) {
                    long length2 = s94Var.getLength();
                    if (length2 != j2) {
                        B = (length2 - s94Var.h()) + 8;
                    }
                }
                long j7 = B;
                i3 = i10;
                j3 = j7;
                i4 = i7;
                i5 = 8;
            }
            long j8 = i5;
            if (j3 < j8) {
                uraVar = null;
                if (m == 1718773093 && i5 == 8) {
                    j3 = j8;
                } else {
                    return new x30(m, j3, i5);
                }
            } else {
                uraVar = null;
            }
            int i11 = i3 + i5;
            if (m == 1836019574 || m == 1970628964) {
                i8 += (int) j3;
                if (i4 != 0 && i8 > length) {
                    i8 = (int) length;
                }
                if (m == 1836019574) {
                    i10 = i11;
                    i7 = i4;
                    j5 = j2;
                    i9 = 0;
                }
            }
            if (m == 1953653099 || m == 1835297121 || m == 1835626086) {
                j4 = length;
                i6 = 0;
                i10 = i11;
            } else if (m != 1836019558 && m != 1836475768) {
                if (m == 1835295092) {
                    z4 = true;
                }
                if (m != 1937007212 || j3 <= 1000000) {
                    j4 = length;
                    if ((i11 + j3) - j8 < i8) {
                        int i12 = (int) (j3 - j8);
                        i10 = i11 + i12;
                        if (m == 1718909296) {
                            if (i12 < 8) {
                                return new x30(m, i12, 8);
                            }
                            km8Var.J(i12);
                            i6 = 0;
                            s94Var.x(km8Var.a, 0, i12);
                            int m2 = km8Var.m();
                            if (n(m2, z2)) {
                                z4 = true;
                            }
                            km8Var.N(4);
                            int a2 = km8Var.a() / 4;
                            if (!z4 && a2 > 0) {
                                int[] iArr2 = new int[a2];
                                int i13 = 0;
                                while (true) {
                                    if (i13 < a2) {
                                        int m3 = km8Var.m();
                                        iArr2[i13] = m3;
                                        if (n(m3, z2)) {
                                            z3 = true;
                                            iArr = iArr2;
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        z3 = z4;
                                        iArr = iArr2;
                                        break;
                                    }
                                }
                            } else {
                                z3 = z4;
                                iArr = uraVar;
                            }
                            if (!z3) {
                                return new jt1(m2, iArr);
                            }
                            z4 = z3;
                        } else {
                            i6 = 0;
                            if (i12 != 0) {
                                s94Var.i(i12);
                            }
                        }
                    }
                }
                i2 = 0;
                break;
            } else {
                i2 = 1;
                break;
            }
            i9 = i6;
            i7 = i4;
            j5 = j2;
            length = j4;
        }
        uraVar = null;
        i2 = i9;
        if (!z4) {
            return abf.E;
        }
        if (z != i2) {
            if (i2 != 0) {
                return nt5.c;
            }
            return nt5.d;
        }
        return uraVar;
    }
}
