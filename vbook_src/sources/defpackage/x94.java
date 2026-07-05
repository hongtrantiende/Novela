package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x94  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x94 implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x94(long j, vt4 vt4Var, e3a e3aVar, mw8 mw8Var, mw8 mw8Var2, mw8 mw8Var3, yya yyaVar) {
        this.a = 4;
        this.e = j;
        this.C = vt4Var;
        this.D = e3aVar;
        this.c = mw8Var;
        this.f = mw8Var2;
        this.d = mw8Var3;
        this.b = yyaVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String str;
        String str2;
        pvc pvcVar;
        Float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        String str3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.a;
        String str4 = "";
        pvc pvcVar2 = pvc.a;
        Object obj2 = this.f;
        Object obj3 = this.D;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.C;
        switch (i5) {
            case 0:
                ia4 ia4Var = (ia4) obj3;
                List<sm2> list = (List) obj5;
                hk2 hk2Var = (hk2) obj4;
                List<tp2> list2 = (List) obj2;
                String str5 = (String) obj6;
                ((vjc) obj).getClass();
                ii2 ii2Var = (ii2) ((bm1) obj7).c;
                gk2 gk2Var = ii2Var.c;
                Map singletonMap = Collections.singletonMap("raw", (String) ia4Var.a.b);
                singletonMap.getClass();
                oaa oaaVar = ia4Var.a;
                ga4 ga4Var = (ga4) oaaVar.c;
                Map singletonMap2 = Collections.singletonMap("raw", ga4Var.a + " " + ga4Var.c);
                singletonMap2.getClass();
                String str6 = (String) oaaVar.e;
                if (str6.length() == 0) {
                    if (str5 != null) {
                        str4 = str5;
                    }
                    str = str4;
                } else {
                    str = str6;
                }
                int size = list.size();
                ks3 ks3Var = ks3.a;
                ls3 ls3Var = ls3.a;
                long j = this.e;
                gk2Var.x0(hk2.a(hk2Var, singletonMap, singletonMap2, null, 0, 0, ks3Var, str, null, "FB2", null, 0, 0, null, false, size, false, false, false, ls3Var, j, j, -537920711, 1));
                for (sm2 sm2Var : list) {
                    ii2Var.C.z0(sm2Var);
                }
                for (tp2 tp2Var : list2) {
                    ii2Var.U.F0(tp2Var);
                }
                return pvcVar2;
            case 1:
                hd7 hd7Var = (hd7) obj3;
                String str7 = (String) obj6;
                List<sm2> list3 = (List) obj5;
                hk2 hk2Var2 = (hk2) obj4;
                List<tp2> list4 = (List) obj2;
                ((vjc) obj).getClass();
                ii2 ii2Var2 = (ii2) ((bm1) obj7).c;
                gk2 gk2Var2 = ii2Var2.c;
                Map singletonMap3 = Collections.singletonMap("raw", hd7Var.b);
                singletonMap3.getClass();
                Map singletonMap4 = Collections.singletonMap("raw", sl1.i0(hd7Var.c, " ", null, null, null, 62));
                singletonMap4.getClass();
                if (str7 == null) {
                    str2 = "";
                } else {
                    str2 = str7;
                }
                int size2 = list3.size();
                ks3 ks3Var2 = ks3.a;
                ls3 ls3Var2 = ls3.a;
                long j2 = this.e;
                gk2Var2.x0(hk2.a(hk2Var2, singletonMap3, singletonMap4, null, 0, 0, ks3Var2, str2, null, "MOBI", null, 0, 0, null, false, size2, false, false, false, ls3Var2, j2, j2, -537920711, 1));
                for (sm2 sm2Var2 : list3) {
                    ii2Var2.C.z0(sm2Var2);
                }
                for (tp2 tp2Var2 : list4) {
                    ii2Var2.U.F0(tp2Var2);
                }
                return pvcVar2;
            case 2:
                rl8 rl8Var = (rl8) obj7;
                dm8 dm8Var = (dm8) obj2;
                aw7 aw7Var = (aw7) obj4;
                lq lqVar = (lq) obj6;
                ak3 ak3Var = (ak3) obj;
                Float valueOf = Float.valueOf((float) nae.e);
                float f11 = 1.0f;
                Float valueOf2 = Float.valueOf(1.0f);
                ak3Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
                float f12 = intBitsToFloat / 2.0f;
                float f13 = intBitsToFloat2 / 2.0f;
                float floatValue = ((Number) rl8Var.a.getValue()).floatValue();
                float floatValue2 = ((Number) rl8Var.b.getValue()).floatValue();
                float floatValue3 = ((Number) ((lq) obj3).e()).floatValue();
                ListIterator listIterator = ((ora) obj5).listIterator();
                while (true) {
                    y65 y65Var = (y65) listIterator;
                    boolean hasNext = y65Var.hasNext();
                    Float f14 = valueOf2;
                    long j3 = this.e;
                    if (hasNext) {
                        kya kyaVar = (kya) y65Var.next();
                        float h = f11 - (((dm8Var.h() * kyaVar.f) + kyaVar.g) % f11);
                        if (h < 0.01f) {
                            h = 0.01f;
                        }
                        if (h < 0.05f || h > 1.5f) {
                            pvcVar = pvcVar2;
                        } else {
                            float f15 = f11 / h;
                            float f16 = kyaVar.a * intBitsToFloat * 0.5f * f15;
                            float f17 = kyaVar.b * intBitsToFloat2 * 0.5f * f15;
                            pvcVar = pvcVar2;
                            float m = (1.0f - dce.m(h, nae.e, 1.0f)) * kyaVar.e * 150.0f;
                            float f18 = (floatValue * m) + f12 + f16;
                            float f19 = (m * floatValue2) + f13 + f17;
                            if (f18 >= -150.0f && f18 <= intBitsToFloat + 150.0f && f19 >= -150.0f && f19 <= intBitsToFloat2 + 150.0f) {
                                float f20 = h;
                                float f21 = kyaVar.c * f15 * 0.45f;
                                if (f20 > 1.3f) {
                                    f2 = f21;
                                    f3 = f19;
                                    f4 = f18;
                                    f5 = 1.0f;
                                    f6 = nae.e;
                                    f7 = dce.m((1.5f - f20) / 0.2f, nae.e, 1.0f);
                                } else {
                                    f2 = f21;
                                    f3 = f19;
                                    f4 = f18;
                                    f5 = 1.0f;
                                    f6 = nae.e;
                                    f7 = 1.0f;
                                }
                                float f22 = f7;
                                if (f20 < 0.15f) {
                                    f8 = dce.m(f20 / 0.15f, f6, f5);
                                } else {
                                    f8 = f5;
                                }
                                if (f20 > 0.6f) {
                                    f9 = f8;
                                    f10 = dce.m((f5 - f20) / 0.4f, f6, f5);
                                } else {
                                    f9 = f8;
                                    if (f20 < 0.3f) {
                                        f10 = dce.m(f20 / 0.3f, f6, f5);
                                    } else {
                                        f10 = f5;
                                    }
                                }
                                float m2 = dce.m(kyaVar.d * f10 * f22 * f9, f6, f5);
                                float f23 = m2 * 0.2f;
                                f = f14;
                                ak3.D0(ak3Var, j3, f2 * 1.8f, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), f23, null, Token.ASSIGN_MOD);
                                ak3.D0(ak3Var, j3, f2 * 1.1f, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), m2, null, Token.ASSIGN_MOD);
                                valueOf2 = f;
                                pvcVar2 = pvcVar;
                                f11 = 1.0f;
                            }
                        }
                        f = f14;
                        valueOf2 = f;
                        pvcVar2 = pvcVar;
                        f11 = 1.0f;
                    } else {
                        pvc pvcVar3 = pvcVar2;
                        ac7 ac7Var = (ac7) aw7Var.getValue();
                        if (ac7Var != null) {
                            float floatValue4 = ((Number) lqVar.e()).floatValue();
                            float f24 = ac7Var.e;
                            float f25 = 2.0f * intBitsToFloat * floatValue4;
                            double d = ac7Var.c * 0.017453292f;
                            float cos = (float) Math.cos(d);
                            float sin = (float) Math.sin(d);
                            float f26 = (f25 * cos) + (ac7Var.a * intBitsToFloat) + (floatValue * f24 * 120.0f);
                            float f27 = (f25 * sin) + (ac7Var.b * intBitsToFloat2) + (floatValue2 * f24 * 120.0f);
                            float f28 = ac7Var.d;
                            float f29 = f26 - (cos * f28);
                            float f30 = f27 - (f28 * sin);
                            yk8 yk8Var = new yk8(valueOf, new zl1(zl1.b(0.3f, j3)));
                            yk8 yk8Var2 = new yk8(Float.valueOf(0.6f), new zl1(zl1.b(0.15f, j3)));
                            long j4 = zl1.h;
                            ak3Var = ak3Var;
                            ak3.u1(ak3Var, ox9.w(new yk8[]{yk8Var, yk8Var2, new yk8(f14, new zl1(j4))}, (Float.floatToRawIntBits(f27) & 4294967295L) | (Float.floatToRawIntBits(f26) << 32), (Float.floatToRawIntBits(f30) & 4294967295L) | (Float.floatToRawIntBits(f29) << 32)), (Float.floatToRawIntBits(f26) << 32) | (Float.floatToRawIntBits(f27) & 4294967295L), (Float.floatToRawIntBits(f30) & 4294967295L) | (Float.floatToRawIntBits(f29) << 32), 16.0f, nae.e, 480);
                            ak3.u1(ak3Var, ox9.w(new yk8[]{new yk8(valueOf, new zl1(zl1.b(0.95f, j3))), new yk8(Float.valueOf(0.5f), new zl1(zl1.b(0.6f, j3))), new yk8(f14, new zl1(j4))}, (Float.floatToRawIntBits(f26) << 32) | (Float.floatToRawIntBits(f27) & 4294967295L), (Float.floatToRawIntBits(f29) << 32) | (Float.floatToRawIntBits(f30) & 4294967295L)), (Float.floatToRawIntBits(f26) << 32) | (Float.floatToRawIntBits(f27) & 4294967295L), (Float.floatToRawIntBits(f29) << 32) | (Float.floatToRawIntBits(f30) & 4294967295L), 4.0f, nae.e, 480);
                        }
                        if (floatValue3 > nae.e) {
                            ak3.R0(ak3Var, zl1.b(floatValue3, zl1.e), 0L, ak3Var.b(), nae.e, null, 0, Token.FUNCTION);
                        }
                        return pvcVar3;
                    }
                }
                break;
            case 3:
                uuc uucVar = (uuc) obj3;
                String str8 = (String) obj6;
                List<sm2> list5 = (List) obj5;
                hk2 hk2Var3 = (hk2) obj4;
                List<tp2> list6 = (List) obj2;
                ((vjc) obj).getClass();
                ii2 ii2Var3 = (ii2) ((bm1) obj7).c;
                gk2 gk2Var3 = ii2Var3.c;
                Map singletonMap5 = Collections.singletonMap("raw", uucVar.b.b);
                singletonMap5.getClass();
                Map singletonMap6 = Collections.singletonMap("raw", uucVar.b.c);
                singletonMap6.getClass();
                if (str8 == null) {
                    str3 = "";
                } else {
                    str3 = str8;
                }
                int size3 = list5.size();
                ks3 ks3Var3 = ks3.a;
                ls3 ls3Var3 = ls3.a;
                long j5 = this.e;
                gk2Var3.x0(hk2.a(hk2Var3, singletonMap5, singletonMap6, null, 0, 0, ks3Var3, str3, null, "UMD", null, 0, 0, null, false, size3, false, false, false, ls3Var3, j5, j5, -537920711, 1));
                gk2 gk2Var4 = ii2Var3.C;
                for (sm2 sm2Var3 : list5) {
                    gk2Var4.z0(sm2Var3);
                }
                gk2 gk2Var5 = ii2Var3.U;
                for (tp2 tp2Var3 : list6) {
                    gk2Var5.F0(tp2Var3);
                }
                return pvcVar2;
            case 4:
                mw8 mw8Var = (mw8) obj5;
                mw8 mw8Var2 = (mw8) obj2;
                mw8 mw8Var3 = (mw8) obj4;
                yya yyaVar = (yya) obj6;
                lw8 lw8Var = (lw8) obj;
                lw8Var.getClass();
                long j6 = this.e;
                int floatValue5 = (int) (((Number) ((vt4) obj7).invoke()).floatValue() * x02.h(j6));
                f3a f3aVar = ((e3a) obj3).f;
                int ordinal = f3aVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = lw8Var.X0(((rg3) yyaVar.getValue()).a);
                    } else {
                        xk5.o();
                        return null;
                    }
                } else {
                    i = -lw8Var.X0(((rg3) yyaVar.getValue()).a);
                }
                int ordinal2 = f3aVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        i2 = x02.i(j6) - mw8Var.a;
                    } else {
                        xk5.o();
                        return null;
                    }
                } else {
                    i2 = 0;
                }
                lw8.z(lw8Var, mw8Var, i2 + i, floatValue5);
                int ordinal3 = f3aVar.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        i3 = (x02.i(j6) - mw8Var.a) - mw8Var2.a;
                    } else {
                        xk5.o();
                        return null;
                    }
                } else {
                    i3 = mw8Var.a;
                }
                lw8.z(lw8Var, mw8Var2, i3 + i, ((mw8Var.b / 2) + floatValue5) - (mw8Var2.b / 2));
                int ordinal4 = f3aVar.ordinal();
                if (ordinal4 != 0) {
                    if (ordinal4 == 1) {
                        i4 = x02.i(j6) - mw8Var3.a;
                    } else {
                        xk5.o();
                        return null;
                    }
                } else {
                    i4 = 0;
                }
                lw8.z(lw8Var, mw8Var3, i4, 0);
                return pvcVar2;
            default:
                List<sm2> list7 = (List) obj5;
                hk2 hk2Var4 = (hk2) obj4;
                String str9 = (String) obj3;
                List<tp2> list8 = (List) obj2;
                ((vjc) obj).getClass();
                ii2 ii2Var4 = (ii2) ((bm1) obj7).c;
                gk2 gk2Var6 = ii2Var4.c;
                Map singletonMap7 = Collections.singletonMap("raw", (String) obj6);
                singletonMap7.getClass();
                int size4 = list7.size();
                Map map = hk2Var4.D;
                long j7 = this.e;
                gk2Var6.x0(hk2.a(hk2Var4, singletonMap7, null, null, 0, 0, null, str9, null, "ZIP", null, 0, 0, null, false, size4, false, false, false, map, j7, j7, -537920643, 1));
                for (sm2 sm2Var4 : list7) {
                    ii2Var4.C.z0(sm2Var4);
                }
                for (tp2 tp2Var4 : list8) {
                    ii2Var4.U.F0(tp2Var4);
                }
                return pvcVar2;
        }
    }

    public /* synthetic */ x94(bm1 bm1Var, ia4 ia4Var, List list, hk2 hk2Var, long j, List list2, String str) {
        this.a = 0;
        this.C = bm1Var;
        this.D = ia4Var;
        this.c = list;
        this.d = hk2Var;
        this.e = j;
        this.f = list2;
        this.b = str;
    }

    public /* synthetic */ x94(bm1 bm1Var, String str, List list, hk2 hk2Var, String str2, long j, List list2) {
        this.a = 5;
        this.C = bm1Var;
        this.b = str;
        this.c = list;
        this.d = hk2Var;
        this.D = str2;
        this.e = j;
        this.f = list2;
    }

    public /* synthetic */ x94(zc4 zc4Var, Object obj, String str, List list, hk2 hk2Var, long j, List list2, int i) {
        this.a = i;
        this.C = zc4Var;
        this.D = obj;
        this.b = str;
        this.c = list;
        this.d = hk2Var;
        this.e = j;
        this.f = list2;
    }

    public /* synthetic */ x94(rl8 rl8Var, lq lqVar, ora oraVar, long j, dm8 dm8Var, aw7 aw7Var, lq lqVar2) {
        this.a = 2;
        this.C = rl8Var;
        this.D = lqVar;
        this.c = oraVar;
        this.e = j;
        this.f = dm8Var;
        this.d = aw7Var;
        this.b = lqVar2;
    }
}
