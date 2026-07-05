package defpackage;

import android.text.Layout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ss0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ss0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ss0(long j, float[] fArr, xl9 xl9Var, wl9 wl9Var) {
        this.a = 2;
        this.b = j;
        this.c = fArr;
        this.d = xl9Var;
        this.e = wl9Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int g;
        long j;
        boolean z;
        boolean z2;
        int i;
        float a;
        float f;
        boolean z3;
        int i2;
        pvc pvcVar;
        int max;
        int min;
        int i3 = this.a;
        Throwable th = null;
        int i4 = 1;
        pvc pvcVar2 = pvc.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i3) {
            case 0:
                rk9 rk9Var = (rk9) obj4;
                zl9 zl9Var = (zl9) obj3;
                long j2 = this.b;
                em1 em1Var = (em1) obj2;
                qd6 qd6Var = (qd6) obj;
                qd6Var.a();
                float f2 = rk9Var.a;
                float f3 = rk9Var.b;
                n61 n61Var = qd6Var.a;
                ((mu9) n61Var.b.b).D(f2, f3);
                try {
                    ak3.g1(qd6Var, (nl5) zl9Var.a, j2, 0L, 0L, nae.e, em1Var, 0, 890);
                    return pvcVar2;
                } finally {
                    ((mu9) n61Var.b.b).D(-f2, -f3);
                }
            case 1:
                fp1 fp1Var = (fp1) obj3;
                String str = fp1Var.c;
                ii2 ii2Var = fp1Var.g;
                ArrayList arrayList = (ArrayList) obj2;
                ((vjc) obj).getClass();
                int i5 = 0;
                for (Object obj5 : (List) obj4) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        gk2 gk2Var = ii2Var.N;
                        String m = a82.m(str, "_", i5);
                        String str2 = fp1Var.c;
                        String str3 = ((eua) obj5).a;
                        yj1 yj1Var = by5.a;
                        gk2Var.D0(new vo2(m, str2, i5, str3, yj1Var.k().b(), yj1Var.k().b()));
                        i5 = i6;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                gk2 gk2Var2 = ii2Var.C;
                gk2 gk2Var3 = ii2Var.U;
                gk2Var2.f0(str);
                int size = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    long j3 = this.b;
                    if (i8 < size) {
                        Object obj6 = arrayList.get(i8);
                        i8++;
                        int i9 = i7 + 1;
                        if (i7 >= 0) {
                            rsa rsaVar = (rsa) obj6;
                            ii2Var.C.z0(new sm2(a82.m(str, "_", i7), fp1Var.c, ox9.m(rsaVar.b, false), i7, rsaVar.b, 0, false, rsaVar.f, rsaVar.e, 0L, j3, j3));
                            size = size;
                            i7 = i9;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    } else {
                        gk2Var3.j0(str);
                        int size2 = arrayList.size();
                        int i10 = 0;
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj7 = arrayList.get(i11);
                            i11++;
                            int i12 = i10 + 1;
                            if (i10 >= 0) {
                                rsa rsaVar2 = (rsa) obj7;
                                String m2 = a82.m(str, "_", i10);
                                String str4 = fp1Var.c;
                                Map singletonMap = Collections.singletonMap("raw", rsaVar2.a);
                                singletonMap.getClass();
                                String str5 = rsaVar2.b;
                                yj1 yj1Var2 = by5.a;
                                gk2Var3.F0(new tp2(m2, str4, singletonMap, str5, "", i10, yj1Var2.k().b(), yj1Var2.k().b()));
                                i10 = i12;
                            } else {
                                tl1.M();
                                throw null;
                            }
                        }
                        ii2Var.c.L0(arrayList.size(), 0, 0L, j3, fp1Var.c);
                        return pvcVar2;
                    }
                }
            case 2:
                float[] fArr = (float[]) obj4;
                xl9 xl9Var = (xl9) obj3;
                wl9 wl9Var = (wl9) obj2;
                ll8 ll8Var = (ll8) obj;
                int i13 = ll8Var.b;
                tj tjVar = ll8Var.a;
                int i14 = ll8Var.c;
                long j4 = this.b;
                if (i13 > fxb.g(j4)) {
                    g = ll8Var.b;
                } else {
                    g = fxb.g(j4);
                }
                if (i14 >= fxb.f(j4)) {
                    i14 = fxb.f(j4);
                }
                long a2 = sze.a(ll8Var.d(g), ll8Var.d(i14));
                int i15 = xl9Var.a;
                dvb dvbVar = tjVar.d;
                int g2 = fxb.g(a2);
                int f4 = fxb.f(a2);
                Layout layout = dvbVar.f;
                int length = layout.getText().length();
                if (g2 < 0) {
                    mv5.a("startOffset must be > 0");
                }
                if (g2 >= length) {
                    mv5.a("startOffset must be less than text length");
                }
                if (f4 <= g2) {
                    mv5.a("endOffset must be greater than startOffset");
                }
                if (f4 > length) {
                    mv5.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i15 < (f4 - g2) * 4) {
                    mv5.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int g3 = dvbVar.g(g2);
                int g4 = dvbVar.g(f4 - 1);
                s95 s95Var = new s95(dvbVar);
                if (g3 <= g4) {
                    while (true) {
                        int lineStart = layout.getLineStart(g3);
                        int f5 = dvbVar.f(g3);
                        int max2 = Math.max(g2, lineStart);
                        int min2 = Math.min(f4, f5);
                        float i16 = dvbVar.i(g3);
                        float e = dvbVar.e(g3);
                        j = a2;
                        if (layout.getParagraphDirection(g3) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        while (max2 < min2) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max2);
                            if (z && !isRtlCharAt) {
                                z2 = z;
                                float a3 = s95Var.a(max2, false, false, true);
                                a = s95Var.a(max2 + 1, true, true, true);
                                i = i15;
                                f = a3;
                            } else {
                                z2 = z;
                                if (z2 && isRtlCharAt) {
                                    float a4 = s95Var.a(max2, false, false, false);
                                    i = i15;
                                    f = s95Var.a(max2 + 1, true, true, false);
                                    a = a4;
                                } else {
                                    i = i15;
                                    if (!z2 && isRtlCharAt) {
                                        float a5 = s95Var.a(max2, false, false, true);
                                        f = s95Var.a(max2 + 1, true, true, true);
                                        a = a5;
                                    } else {
                                        float a6 = s95Var.a(max2, false, false, false);
                                        a = s95Var.a(max2 + 1, true, true, false);
                                        f = a6;
                                    }
                                }
                            }
                            fArr[i] = f;
                            fArr[i + 1] = i16;
                            fArr[i + 2] = a;
                            fArr[i + 3] = e;
                            i15 = i + 4;
                            max2++;
                            z = z2;
                        }
                        int i17 = i15;
                        if (g3 != g4) {
                            g3++;
                            a2 = j;
                            i15 = i17;
                        }
                    }
                } else {
                    j = a2;
                }
                int e2 = (fxb.e(j) * 4) + xl9Var.a;
                for (int i18 = xl9Var.a; i18 < e2; i18 += 4) {
                    int i19 = i18 + 1;
                    float f6 = fArr[i19];
                    float f7 = wl9Var.a;
                    fArr[i19] = f6 + f7;
                    int i20 = i18 + 3;
                    fArr[i20] = fArr[i20] + f7;
                }
                xl9Var.a = e2;
                wl9Var.a = tjVar.b() + wl9Var.a;
                return pvcVar2;
            case 3:
                fp1 fp1Var2 = (fp1) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ((vjc) obj).getClass();
                ii2 ii2Var2 = fp1Var2.g;
                gk2 gk2Var4 = ii2Var2.N;
                gk2 gk2Var5 = ii2Var2.C;
                String str6 = fp1Var2.c;
                gk2Var4.i0(str6);
                int i21 = 0;
                for (Object obj8 : (List) obj3) {
                    int i22 = i21 + 1;
                    if (i21 >= 0) {
                        gk2 gk2Var6 = ii2Var2.N;
                        String m3 = a82.m(str6, "_", i21);
                        String str7 = fp1Var2.c;
                        String str8 = ((eua) obj8).a;
                        yj1 yj1Var3 = by5.a;
                        gk2Var6.D0(new vo2(m3, str7, i21, str8, yj1Var3.k().b(), yj1Var3.k().b()));
                        i21 = i22;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                gk2 gk2Var7 = ii2Var2.U;
                gk2Var5.f0(str6);
                int size3 = arrayList2.size();
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    long j5 = this.b;
                    if (i24 < size3) {
                        Object obj9 = arrayList2.get(i24);
                        i24++;
                        int i25 = i23 + 1;
                        Throwable th2 = th;
                        if (i23 >= 0) {
                            rsa rsaVar3 = (rsa) obj9;
                            if (rsaVar3.b.length() == 0) {
                                i2 = size3;
                            } else {
                                i2 = size3;
                                gk2Var5.z0(new sm2(a82.m(str6, "_", i23), fp1Var2.c, ox9.m(rsaVar3.b, false), i23, rsaVar3.b, 0, false, rsaVar3.f, rsaVar3.e, 0L, j5, j5));
                            }
                            size3 = i2;
                            i23 = i25;
                            th = th2;
                        } else {
                            tl1.M();
                            throw th2;
                        }
                    } else {
                        Throwable th3 = th;
                        gk2Var7.j0(str6);
                        int size4 = arrayList2.size();
                        String str9 = "";
                        int i26 = 0;
                        int i27 = 0;
                        while (i27 < size4) {
                            Object obj10 = arrayList2.get(i27);
                            i27++;
                            int i28 = i26 + 1;
                            if (i26 >= 0) {
                                rsa rsaVar4 = (rsa) obj10;
                                if (rsaVar4.c == 1) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                String m4 = a82.m(str6, "_", i26);
                                String str10 = fp1Var2.c;
                                Map singletonMap2 = Collections.singletonMap("raw", rsaVar4.a);
                                singletonMap2.getClass();
                                String str11 = rsaVar4.b;
                                yj1 yj1Var4 = by5.a;
                                gk2Var7.F0(new tp2(m4, str10, singletonMap2, str11, str9, i26, yj1Var4.k().b(), yj1Var4.k().b()));
                                if (z3) {
                                    str9 = a82.m(str6, "_", i26);
                                }
                                i26 = i28;
                            } else {
                                tl1.M();
                                throw th3;
                            }
                        }
                        ii2Var2.c.L0(arrayList2.size(), 0, 0L, j5, fp1Var2.c);
                        return pvcVar2;
                    }
                }
            default:
                sxb sxbVar = (sxb) obj3;
                lq lqVar = (lq) obj2;
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                List list = ((jwb) obj4).d;
                int size5 = list.size();
                int i29 = 0;
                while (i29 < size5) {
                    kwb kwbVar = (kwb) list.get(i29);
                    if (kwbVar.h != null && (max = Math.max(sxbVar.b, kwbVar.d)) <= (min = Math.min(sxbVar.c, kwbVar.e - i4))) {
                        int i30 = kwbVar.b;
                        pvcVar = pvcVar2;
                        bce.m(ak3Var, max - i30, min - i30, kwbVar.a, ((Number) lqVar.e()).floatValue(), this.b, kwbVar.h);
                    } else {
                        pvcVar = pvcVar2;
                    }
                    i29++;
                    pvcVar2 = pvcVar;
                    i4 = 1;
                }
                return pvcVar2;
        }
    }

    public /* synthetic */ ss0(rk9 rk9Var, zl9 zl9Var, long j, wl0 wl0Var) {
        this.a = 0;
        this.c = rk9Var;
        this.d = zl9Var;
        this.b = j;
        this.e = wl0Var;
    }

    public /* synthetic */ ss0(Object obj, Object obj2, Object obj3, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
