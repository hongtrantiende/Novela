package defpackage;

import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z97  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class z97 implements xt4 {
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ yya b;
    public final /* synthetic */ rl8 c;
    public final /* synthetic */ lq d;
    public final /* synthetic */ List e;
    public final /* synthetic */ long f;

    public /* synthetic */ z97(rl8 rl8Var, lq lqVar, dm8 dm8Var, List list, long j, long j2, long j3) {
        this.c = rl8Var;
        this.d = lqVar;
        this.b = dm8Var;
        this.e = list;
        this.f = j;
        this.C = j2;
        this.D = j3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        Iterator it;
        long j;
        long j2;
        pvc pvcVar;
        long j3;
        float f2;
        Iterator it2;
        float f3;
        float f4;
        float f5;
        int i = this.a;
        pvc pvcVar2 = pvc.a;
        long j4 = this.D;
        long j5 = this.C;
        long j6 = this.f;
        List list = this.e;
        lq lqVar = this.d;
        rl8 rl8Var = this.c;
        yya yyaVar = this.b;
        switch (i) {
            case 0:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
                float floatValue = ((Number) rl8Var.a.getValue()).floatValue();
                float floatValue2 = ((Number) rl8Var.b.getValue()).floatValue();
                float floatValue3 = ((Number) lqVar.e()).floatValue();
                float floatValue4 = ((Number) yyaVar.getValue()).floatValue() % 40000.0f;
                if (floatValue4 < 20000.0f) {
                    f = (floatValue4 * 3.1415927f) / 20000.0f;
                } else {
                    f = ((40000.0f - floatValue4) * 3.1415927f) / 20000.0f;
                }
                float f6 = f;
                Iterator it3 = list.iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        aa7 aa7Var = (aa7) next;
                        int i4 = i2 / 12;
                        int i5 = i2 % 12;
                        if (i4 >= 11 || i5 >= 11) {
                            it = it3;
                            j = j4;
                        } else {
                            long e = ie2.e(f6, floatValue3, intBitsToFloat, floatValue, intBitsToFloat2, floatValue2, (aa7) list.get(i2));
                            long e2 = ie2.e(f6, floatValue3, intBitsToFloat, floatValue, intBitsToFloat2, floatValue2, (aa7) list.get(i3));
                            it = it3;
                            long e3 = ie2.e(f6, floatValue3, intBitsToFloat, floatValue, intBitsToFloat2, floatValue2, (aa7) list.get(i2 + 12));
                            long e4 = ie2.e(f6, floatValue3, intBitsToFloat, floatValue, intBitsToFloat2, floatValue2, (aa7) list.get(i2 + 13));
                            int i6 = (i4 + i5) % 3;
                            if (i6 != 0) {
                                if (i6 != 1) {
                                    j2 = j4;
                                } else {
                                    j2 = j5;
                                }
                            } else {
                                j2 = j6;
                            }
                            float f7 = (aa7Var.e * 0.05f) + 0.14f;
                            yj a = dk.a();
                            a.i(Float.intBitsToFloat((int) (e >> 32)), Float.intBitsToFloat((int) (e & 4294967295L)));
                            int i7 = (int) (e2 >> 32);
                            int i8 = (int) (e2 & 4294967295L);
                            a.h(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
                            int i9 = (int) (e3 >> 32);
                            int i10 = (int) (e3 & 4294967295L);
                            a.h(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
                            a.e();
                            ak3.t1(ak3Var, a, zl1.b(f7, j2), nae.e, new s4b(3.5f, nae.e, 0, 0, null, 30), 52);
                            yj a2 = dk.a();
                            a2.i(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
                            j = j4;
                            a2.h(Float.intBitsToFloat((int) (e4 >> 32)), Float.intBitsToFloat((int) (e4 & 4294967295L)));
                            a2.h(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
                            a2.e();
                            ak3.t1(ak3Var, a2, zl1.b(f7, j2), nae.e, new s4b(3.5f, nae.e, 0, 0, null, 30), 52);
                        }
                        it3 = it;
                        i2 = i3;
                        j4 = j;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar2;
            default:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                float floatValue5 = ((Number) yyaVar.getValue()).floatValue();
                float floatValue6 = ((Number) rl8Var.a.getValue()).floatValue();
                float floatValue7 = ((Number) rl8Var.b.getValue()).floatValue();
                float floatValue8 = ((Number) lqVar.e()).floatValue();
                int i11 = 0;
                for (Object obj2 : list) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        et9 et9Var = (et9) obj2;
                        float f8 = et9Var.c;
                        float f9 = et9Var.b;
                        float f10 = floatValue5;
                        float f11 = et9Var.a;
                        float f12 = (f8 - f11) / 2.0f;
                        float f13 = (et9Var.d - f9) / 2.0f;
                        float f14 = 6.2831855f * f10;
                        float f15 = floatValue6;
                        float sin = (f12 * ((float) Math.sin(f14 / et9Var.e))) + f11 + f12;
                        float sin2 = (((float) Math.sin(f14 / et9Var.f)) * f13) + f9 + f13;
                        float f16 = et9Var.h * 50.0f;
                        float intBitsToFloat3 = (f15 * f16) + (Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * sin);
                        float intBitsToFloat4 = (floatValue7 * f16) + (Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) * sin2);
                        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
                        int i13 = i11 % 3;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                pvcVar = pvcVar2;
                                j3 = j4;
                            } else {
                                pvcVar = pvcVar2;
                                j3 = j5;
                            }
                        } else {
                            pvcVar = pvcVar2;
                            j3 = j6;
                        }
                        float size = (i11 / (list.size() - 1)) * 0.4f;
                        float f17 = 1.0f;
                        float m = dce.m((floatValue8 - size) / (1.0f - size), nae.e, 1.0f);
                        int i14 = (floatValue8 > nae.e ? 1 : (floatValue8 == nae.e ? 0 : -1));
                        if (i14 > 0) {
                            f2 = (1.8f * m) + 1.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (i14 > 0) {
                            f17 = dce.m(1.0f - m, nae.e, 1.0f);
                        }
                        Iterator it4 = et9Var.g.iterator();
                        int i15 = 0;
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i16 = i15 + 1;
                            if (i15 >= 0) {
                                float floatValue9 = ((Number) next2).floatValue();
                                if (i15 != 0) {
                                    it2 = it4;
                                    if (i15 != 1) {
                                        if (i15 != 2) {
                                            f3 = 0.06f;
                                        } else {
                                            f3 = 0.07f;
                                        }
                                    } else {
                                        f3 = 0.1f;
                                    }
                                } else {
                                    it2 = it4;
                                    f3 = 0.14f;
                                }
                                if (i15 != 0) {
                                    f4 = f3;
                                    if (i15 != 1) {
                                        f5 = 4.0f;
                                    } else {
                                        f5 = 5.0f;
                                    }
                                } else {
                                    f4 = f3;
                                    f5 = 6.0f;
                                }
                                ak3.D0(ak3Var2, zl1.b(f4 * f17, j3), floatValue9 * f2, floatToRawIntBits, nae.e, new s4b(f5, nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
                                it4 = it2;
                                i15 = i16;
                            } else {
                                tl1.M();
                                throw null;
                            }
                        }
                        floatValue5 = f10;
                        pvcVar2 = pvcVar;
                        i11 = i12;
                        floatValue6 = f15;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar2;
        }
    }

    public /* synthetic */ z97(dm8 dm8Var, rl8 rl8Var, lq lqVar, List list, long j, long j2, long j3) {
        this.b = dm8Var;
        this.c = rl8Var;
        this.d = lqVar;
        this.e = list;
        this.f = j;
        this.C = j2;
        this.D = j3;
    }
}
