package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: th1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class th1 implements xt4 {
    public final /* synthetic */ long C;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ rl8 c;
    public final /* synthetic */ lq d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ th1(rl8 rl8Var, lq lqVar, ora oraVar, long j, long j2, long j3) {
        this.a = 2;
        this.c = rl8Var;
        this.d = lqVar;
        this.b = oraVar;
        this.e = j;
        this.f = j2;
        this.C = j3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        long j;
        float f9;
        long j2;
        int i;
        int i2;
        int i3;
        long j3;
        float f10;
        float f11;
        long floatToRawIntBits;
        int i4 = this.a;
        long j4 = this.C;
        long j5 = this.f;
        long j6 = this.e;
        pvc pvcVar = pvc.a;
        int i5 = 0;
        float f12 = 0.55f;
        Object obj2 = this.b;
        float f13 = 0.5f;
        lq lqVar = this.d;
        rl8 rl8Var = this.c;
        switch (i4) {
            case 0:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                float floatValue = ((Number) ((yya) obj2).getValue()).floatValue();
                float floatValue2 = ((Number) rl8Var.a.getValue()).floatValue();
                float floatValue3 = ((Number) rl8Var.b.getValue()).floatValue();
                float floatValue4 = ((Number) lqVar.e()).floatValue();
                float f14 = floatValue * 6.2831855f;
                long j7 = this.e;
                rh1 rh1Var = new rh1((((float) Math.sin(f14 / 8000.0f)) * 0.05f) + 0.2f, (((float) Math.sin(f14 / 7000.0f)) * 0.025f) + 0.225f, 400.0f, j7, 0.05f, 0.8f);
                long j8 = this.f;
                rh1 rh1Var2 = new rh1((((float) Math.sin(f14 / 9000.0f)) * 0.03f) + 0.85f, (((float) Math.sin(f14 / 6500.0f)) * 0.035f) + 0.185f, 280.0f, j8, 0.035f, 0.6f);
                rh1 rh1Var3 = new rh1((((float) Math.sin(f14 / 7500.0f)) * 0.035f) + 0.715f, (((float) Math.sin(f14 / 8500.0f)) * 0.04f) + 0.44f, 200.0f, j8, 0.04f, 0.4f);
                long j9 = this.C;
                List B = tl1.B(rh1Var, rh1Var2, rh1Var3, new rh1((((float) Math.sin(f14 / 9500.0f)) * 0.035f) + 0.815f, (((float) Math.sin(f14 / 7200.0f)) * 0.035f) + 0.785f, 320.0f, j9, 0.035f, 0.7f), new rh1((((float) Math.sin(f14 / 8200.0f)) * 0.04f) + 0.24f, (((float) Math.sin(f14 / 6800.0f)) * 0.035f) + 0.765f, 180.0f, j7, 0.04f, 0.5f), new rh1((((float) Math.sin(f14 / 8800.0f)) * 0.025f) + 0.525f, (((float) Math.sin(f14 / 7800.0f)) * 0.025f) + 0.895f, 220.0f, j9, 0.04f, 0.6f));
                Iterator it = B.iterator();
                while (true) {
                    int i6 = i5;
                    if (it.hasNext()) {
                        Object next = it.next();
                        i5 = i6 + 1;
                        if (i6 >= 0) {
                            rh1 rh1Var4 = (rh1) next;
                            float f15 = rh1Var4.f;
                            long j10 = rh1Var4.d;
                            float f16 = rh1Var4.c;
                            float f17 = f15 * 50.0f;
                            List list = B;
                            Iterator it2 = it;
                            long floatToRawIntBits2 = (Float.floatToRawIntBits((floatValue2 * f17) + (Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * rh1Var4.a)) << 32) | (Float.floatToRawIntBits((f17 * floatValue3) + (Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * rh1Var4.b)) & 4294967295L);
                            float size = (i6 / (list.size() - 1)) * 0.35f;
                            float m = dce.m((floatValue4 - size) / (1.0f - size), nae.e, 1.0f);
                            int i7 = (floatValue4 > nae.e ? 1 : (floatValue4 == nae.e ? 0 : -1));
                            if (i7 > 0) {
                                f = (2.2f * m) + 1.0f;
                            } else {
                                f = 1.0f;
                            }
                            if (i7 > 0) {
                                f2 = dce.m(1.0f - m, nae.e, 1.0f);
                            } else {
                                f2 = 1.0f;
                            }
                            ak3.D0(ak3Var, zl1.b(rh1Var4.e * f2, j10), f16 * f, floatToRawIntBits2, nae.e, null, 120);
                            if (i7 > 0 && m > nae.e) {
                                ak3.D0(ak3Var, zl1.b(dce.m((1.0f - m) * 0.5f, nae.e, 1.0f), j10), a82.B(m, 3.5f, 1.0f, f16), floatToRawIntBits2, nae.e, new s4b(4.0f, nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
                            }
                            B = list;
                            it = it2;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    } else {
                        return pvcVar;
                    }
                }
                break;
            case 1:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                float floatValue5 = ((Number) ((yya) obj2).getValue()).floatValue();
                float floatValue6 = ((Number) rl8Var.a.getValue()).floatValue();
                float floatValue7 = ((Number) rl8Var.b.getValue()).floatValue();
                float floatValue8 = ((Number) lqVar.e()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) / 10.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) / 19.0f;
                float sqrt = ((float) Math.sqrt((Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) * Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L))) + (Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * Float.intBitsToFloat((int) (ak3Var2.b() >> 32))))) * 0.5f;
                float f18 = floatValue8 * sqrt * 1.2f;
                float f19 = 0.25f * sqrt;
                int i8 = 0;
                while (i8 < 20) {
                    int i9 = 0;
                    while (i9 < 11) {
                        int i10 = i9;
                        float intBitsToFloat3 = ((floatValue6 * 12.0f) + (i9 * intBitsToFloat)) - (Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * f13);
                        float f20 = floatValue5;
                        float f21 = floatValue6;
                        float intBitsToFloat4 = ((12.0f * floatValue7) + (i8 * intBitsToFloat2)) - (Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) * f13);
                        float sqrt2 = (float) Math.sqrt((intBitsToFloat4 * intBitsToFloat4) + (intBitsToFloat3 * intBitsToFloat3));
                        float sin = (float) Math.sin(((6.2831855f * f20) / 3800.0f) - (0.012f * sqrt2));
                        float f22 = (2.5f * sin) + 5.0f;
                        float abs = Math.abs(sqrt2 - f18);
                        int i11 = (floatValue8 > nae.e ? 1 : (floatValue8 == nae.e ? 0 : -1));
                        if (i11 > 0 && abs < f19) {
                            f5 = sin;
                            float f23 = 1.0f - (abs / f19);
                            f6 = f22;
                            f7 = nk2.c(floatValue8, f13, 1.0f, f23 * f23 * 6.0f);
                        } else {
                            f5 = sin;
                            f6 = f22;
                            f7 = nae.e;
                        }
                        float f24 = f6 + f7;
                        if (f24 < 0.8f) {
                            f24 = 0.8f;
                        }
                        int i12 = (i10 + i8) % 3;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                f8 = f24;
                                j = j4;
                            } else {
                                f8 = f24;
                                j = j5;
                            }
                        } else {
                            f8 = f24;
                            j = j6;
                        }
                        float f25 = floatValue7;
                        float f26 = floatValue8;
                        float m2 = dce.m(1.0f - (sqrt2 / sqrt), f12, 1.0f);
                        float f27 = (f5 * 0.1f) + 0.3f;
                        if (i11 > 0 && abs < f19) {
                            f9 = (1.0f - (abs / f19)) * 0.18f;
                        } else {
                            f9 = nae.e;
                        }
                        ak3.D0(ak3Var2, zl1.b(dce.m((f27 + f9) * m2, nae.e, 0.5f), j), f8, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), nae.e, null, 120);
                        floatValue8 = f26;
                        floatValue6 = f21;
                        floatValue7 = f25;
                        f12 = 0.55f;
                        f13 = 0.5f;
                        i9 = i10 + 1;
                        floatValue5 = f20;
                    }
                    i8++;
                    f12 = 0.55f;
                    f13 = 0.5f;
                }
                return pvcVar;
            default:
                ora oraVar = (ora) obj2;
                ak3 ak3Var3 = (ak3) obj;
                ak3Var3.getClass();
                float floatValue9 = ((Number) rl8Var.a.getValue()).floatValue();
                float floatValue10 = ((Number) rl8Var.b.getValue()).floatValue();
                float floatValue11 = ((Number) lqVar.e()).floatValue();
                float intBitsToFloat5 = Float.intBitsToFloat((int) (ak3Var3.b() >> 32)) * 0.5f;
                float intBitsToFloat6 = Float.intBitsToFloat((int) (ak3Var3.b() & 4294967295L)) * 0.5f;
                float f28 = 1.0f;
                float intBitsToFloat7 = Float.intBitsToFloat((int) (ak3Var3.b() >> 32)) * 0.22f;
                float f29 = intBitsToFloat7 * intBitsToFloat7;
                ArrayList arrayList = new ArrayList(tl1.s(oraVar, 10));
                ListIterator listIterator = oraVar.listIterator();
                while (true) {
                    y65 y65Var = (y65) listIterator;
                    if (y65Var.hasNext()) {
                        cn8 cn8Var = (cn8) y65Var.next();
                        float intBitsToFloat8 = (floatValue9 * 25.0f) + (Float.intBitsToFloat((int) (ak3Var3.b() >> 32)) * cn8Var.a);
                        float f30 = intBitsToFloat6;
                        float intBitsToFloat9 = (floatValue10 * 25.0f) + (Float.intBitsToFloat((int) (ak3Var3.b() & 4294967295L)) * cn8Var.b);
                        if (floatValue11 > nae.e) {
                            float f31 = floatValue11 * floatValue11;
                            floatToRawIntBits = (Float.floatToRawIntBits((((intBitsToFloat8 - intBitsToFloat5) * f31) * 1.2f) + intBitsToFloat8) << 32) | (Float.floatToRawIntBits(((intBitsToFloat9 - f30) * f31 * 1.2f) + intBitsToFloat9) & 4294967295L);
                            f10 = floatValue9;
                            f11 = floatValue10;
                        } else {
                            f10 = floatValue9;
                            f11 = floatValue10;
                            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat8) << 32) | (Float.floatToRawIntBits(intBitsToFloat9) & 4294967295L);
                        }
                        arrayList.add(new y78(floatToRawIntBits));
                        floatValue9 = f10;
                        floatValue10 = f11;
                        intBitsToFloat6 = f30;
                    } else {
                        float f32 = nae.e;
                        int size2 = oraVar.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            int i14 = i13 + 1;
                            int size3 = oraVar.size();
                            int i15 = i14;
                            while (i15 < size3) {
                                float intBitsToFloat10 = Float.intBitsToFloat((int) (((y78) arrayList.get(i13)).a >> 32)) - Float.intBitsToFloat((int) (((y78) arrayList.get(i15)).a >> 32));
                                float intBitsToFloat11 = Float.intBitsToFloat((int) (((y78) arrayList.get(i13)).a & 4294967295L)) - Float.intBitsToFloat((int) (((y78) arrayList.get(i15)).a & 4294967295L));
                                float f33 = (intBitsToFloat11 * intBitsToFloat11) + (intBitsToFloat10 * intBitsToFloat10);
                                if (f33 < f29) {
                                    float sqrt3 = 1.0f - (((float) Math.sqrt(f33)) / intBitsToFloat7);
                                    float f34 = (floatValue11 * 0.05f * sqrt3) + (sqrt3 * sqrt3 * 0.1f);
                                    int i16 = (((cn8) oraVar.get(i13)).f + ((cn8) oraVar.get(i15)).f) % 3;
                                    if (i16 != 0) {
                                        if (i16 != 1) {
                                            i = size2;
                                            i2 = i14;
                                            j3 = j4;
                                        } else {
                                            i = size2;
                                            i2 = i14;
                                            j3 = j5;
                                        }
                                    } else {
                                        i = size2;
                                        i2 = i14;
                                        j3 = j6;
                                    }
                                    i3 = i13;
                                    ak3.Y0(ak3Var3, zl1.b(dce.m(f34, f32, 0.18f), j3), ((y78) arrayList.get(i13)).a, ((y78) arrayList.get(i15)).a, 1.2f, 0, nae.e, 496);
                                } else {
                                    i = size2;
                                    i2 = i14;
                                    i3 = i13;
                                }
                                i15++;
                                size2 = i;
                                i13 = i3;
                                i14 = i2;
                                f32 = nae.e;
                            }
                            i13 = i14;
                            f32 = nae.e;
                        }
                        ListIterator listIterator2 = oraVar.listIterator();
                        while (true) {
                            int i17 = i5;
                            y65 y65Var2 = (y65) listIterator2;
                            if (y65Var2.hasNext()) {
                                Object next2 = y65Var2.next();
                                i5 = i17 + 1;
                                if (i17 >= 0) {
                                    cn8 cn8Var2 = (cn8) next2;
                                    long j11 = ((y78) arrayList.get(i17)).a;
                                    int i18 = cn8Var2.f;
                                    if (i18 != 0) {
                                        if (i18 != 1) {
                                            j2 = j4;
                                        } else {
                                            j2 = j5;
                                        }
                                    } else {
                                        j2 = j6;
                                    }
                                    float f35 = (floatValue11 * 0.3f) + 0.55f;
                                    float B2 = a82.B(floatValue11, 0.8f, f28, cn8Var2.e);
                                    ak3.D0(ak3Var3, zl1.b(0.2f * f35, j2), B2 * 2.0f, j11, nae.e, null, 120);
                                    ak3.D0(ak3Var3, zl1.b(f35, j2), B2, j11, nae.e, null, 120);
                                    f28 = 1.0f;
                                } else {
                                    tl1.M();
                                    throw null;
                                }
                            } else {
                                return pvcVar;
                            }
                        }
                    }
                }
        }
    }

    public /* synthetic */ th1(dm8 dm8Var, rl8 rl8Var, lq lqVar, long j, long j2, long j3, int i) {
        this.a = i;
        this.b = dm8Var;
        this.c = rl8Var;
        this.d = lqVar;
        this.e = j;
        this.f = j2;
        this.C = j3;
    }
}
