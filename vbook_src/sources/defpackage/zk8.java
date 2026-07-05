package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zk8  reason: default package */
/* loaded from: classes.dex */
public final class zk8 {
    public final jj a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public rk9 g;

    public zk8(jj jjVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = 16;
        this.d = 12544;
        this.e = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        arrayList2.add(bm1.D);
        this.a = jjVar;
        arrayList.add(vkb.d);
        arrayList.add(vkb.e);
        arrayList.add(vkb.f);
        arrayList.add(vkb.g);
        arrayList.add(vkb.h);
        arrayList.add(vkb.i);
    }

    public final bm1 a() {
        int max;
        double d;
        jj jjVar;
        al8[] al8VarArr;
        ArrayList arrayList;
        bm1 bm1Var;
        Boolean bool;
        int i;
        float f;
        float f2;
        float f3;
        jj jjVar2 = this.a;
        if (jjVar2 != null) {
            Bitmap bitmap = jjVar2.a;
            int i2 = this.d;
            if (i2 > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                if (height > i2) {
                    d = Math.sqrt(i2 / height);
                }
                d = -1.0d;
            } else {
                int i3 = this.e;
                if (i3 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i3) {
                    d = i3 / max;
                }
                d = -1.0d;
            }
            int i4 = 0;
            if (d <= 0.0d) {
                jjVar = jjVar2;
            } else {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(ay5.a(jjVar2), (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
                createScaledBitmap.getClass();
                jjVar = new jj(createScaledBitmap);
            }
            Bitmap bitmap2 = jjVar.a;
            rk9 rk9Var = this.g;
            if (jjVar != jjVar2 && rk9Var != null) {
                float width = bitmap2.getWidth() / bitmap.getWidth();
                this.g = new rk9((float) Math.floor(rk9Var.a * width), (float) Math.floor(rk9Var.b * width), Math.min((float) Math.ceil(rk9Var.c * width), bitmap2.getWidth()), Math.min((float) Math.ceil(rk9Var.d * width), bitmap2.getHeight()));
            }
            int width2 = bitmap2.getWidth();
            int[] iArr = new int[bitmap2.getHeight() * width2];
            int width3 = bitmap2.getWidth();
            jjVar.a(width3, bitmap2.getHeight(), width3, iArr);
            rk9 rk9Var2 = this.g;
            if (rk9Var2 != null) {
                float f4 = rk9Var2.b;
                float f5 = rk9Var2.a;
                float f6 = rk9Var2.c - f5;
                float f7 = rk9Var2.d - f4;
                int[] iArr2 = new int[(int) (f6 * f7)];
                int i5 = (int) f7;
                for (int i6 = 0; i6 < i5; i6++) {
                    float f8 = i6;
                    float f9 = ((f8 + f4) * width2) + f5;
                    b00.V((int) (f8 * f6), (int) f9, (int) (f9 + f6), iArr, iArr2);
                }
                iArr = iArr2;
            }
            ArrayList arrayList2 = this.f;
            if (arrayList2.isEmpty()) {
                al8VarArr = null;
            } else {
                al8VarArr = (al8[]) arrayList2.toArray(new al8[0]);
            }
            ArrayList arrayList3 = this.b;
            bm1 bm1Var2 = new bm1((ArrayList) new bm1(iArr, this.c, al8VarArr).f, arrayList3);
            HashMap hashMap = (HashMap) bm1Var2.e;
            int size = arrayList3.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                vkb vkbVar = (vkb) obj;
                float[] fArr = vkbVar.c;
                float[] fArr2 = vkbVar.a;
                int length = fArr.length;
                float f10 = nae.e;
                float f11 = 0.0f;
                for (int i8 = i4; i8 < length; i8++) {
                    float f12 = fArr[i8];
                    if (f12 > nae.e) {
                        f11 += f12;
                    }
                }
                if (f11 != nae.e) {
                    for (int i9 = i4; i9 < length; i9++) {
                        float f13 = fArr[i9];
                        if (f13 > nae.e) {
                            fArr[i9] = f13 / f11;
                        }
                    }
                }
                HashMap hashMap2 = (HashMap) bm1Var2.d;
                List list = (List) bm1Var2.b;
                int size2 = list.size();
                int i10 = i4;
                float f14 = 0.0f;
                cl8 cl8Var = null;
                while (i10 < size2) {
                    cl8 cl8Var2 = (cl8) list.get(i10);
                    int i11 = i4;
                    float[] fArr3 = cl8Var2.c;
                    float f15 = fArr3[1];
                    float f16 = f10;
                    float[] fArr4 = vkbVar.b;
                    if (f15 >= fArr2[i11] && f15 <= fArr2[2]) {
                        float f17 = fArr3[2];
                        if (f17 >= fArr4[i11] && f17 <= fArr4[2] && ((bool = (Boolean) hashMap.get(Integer.valueOf(cl8Var2.a))) == null || !bool.booleanValue())) {
                            float[] fArr5 = cl8Var2.c;
                            arrayList = arrayList3;
                            cl8 cl8Var3 = (cl8) bm1Var2.f;
                            if (cl8Var3 != null) {
                                i = cl8Var3.b;
                            } else {
                                i = 1;
                            }
                            bm1Var = bm1Var2;
                            float[] fArr6 = vkbVar.c;
                            float f18 = fArr6[i11];
                            if (f18 > f16) {
                                f = (1.0f - Math.abs(fArr5[1] - fArr2[1])) * f18;
                            } else {
                                f = f16;
                            }
                            float f19 = fArr6[1];
                            if (f19 > f16) {
                                f2 = (1.0f - Math.abs(fArr5[2] - fArr4[1])) * f19;
                            } else {
                                f2 = f16;
                            }
                            float f20 = fArr6[2];
                            if (f20 > f16) {
                                f3 = (cl8Var2.b / i) * f20;
                            } else {
                                f3 = f16;
                            }
                            float f21 = f + f2 + f3;
                            if (cl8Var == null || f21 > f14) {
                                cl8Var = cl8Var2;
                                f14 = f21;
                            }
                            i10++;
                            f10 = f16;
                            i4 = i11;
                            arrayList3 = arrayList;
                            bm1Var2 = bm1Var;
                        }
                    }
                    arrayList = arrayList3;
                    bm1Var = bm1Var2;
                    i10++;
                    f10 = f16;
                    i4 = i11;
                    arrayList3 = arrayList;
                    bm1Var2 = bm1Var;
                }
                ArrayList arrayList4 = arrayList3;
                bm1 bm1Var3 = bm1Var2;
                int i12 = i4;
                if (cl8Var != null) {
                    hashMap.put(Integer.valueOf(cl8Var.a), Boolean.TRUE);
                }
                hashMap2.put(vkbVar, cl8Var);
                i4 = i12;
                arrayList3 = arrayList4;
                bm1Var2 = bm1Var3;
            }
            bm1 bm1Var4 = bm1Var2;
            hashMap.clear();
            return bm1Var4;
        }
        cp8.i();
        return null;
    }
}
