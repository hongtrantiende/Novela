package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: de0  reason: default package */
/* loaded from: classes.dex */
public final class de0 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public de0(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static de0 a(km8 km8Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            km8Var.N(4);
            int z = (km8Var.z() & 3) + 1;
            if (z != 3) {
                ArrayList arrayList = new ArrayList();
                int z2 = km8Var.z() & 31;
                for (int i9 = 0; i9 < z2; i9++) {
                    int G = km8Var.G();
                    int i10 = km8Var.b;
                    km8Var.N(G);
                    byte[] bArr = km8Var.a;
                    byte[] bArr2 = new byte[G + 4];
                    System.arraycopy(vk1.a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i10, bArr2, 4, G);
                    arrayList.add(bArr2);
                }
                int z3 = km8Var.z();
                for (int i11 = 0; i11 < z3; i11++) {
                    int G2 = km8Var.G();
                    int i12 = km8Var.b;
                    km8Var.N(G2);
                    byte[] bArr3 = km8Var.a;
                    byte[] bArr4 = new byte[G2 + 4];
                    System.arraycopy(vk1.a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i12, bArr4, 4, G2);
                    arrayList.add(bArr4);
                }
                if (z2 > 0) {
                    nx7 A = dae.A((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                    int i13 = A.e;
                    int i14 = A.f;
                    int i15 = A.p;
                    int i16 = A.q;
                    int i17 = A.r;
                    int i18 = A.s;
                    float f2 = A.g;
                    int i19 = A.a;
                    int i20 = A.b;
                    int i21 = A.c;
                    byte[] bArr5 = vk1.a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i19), Integer.valueOf(i20), Integer.valueOf(i21));
                    i4 = i16;
                    i5 = i17;
                    i6 = i18;
                    f = f2;
                    i2 = i14;
                    i3 = A.h + 8;
                    i7 = A.i + 8;
                    i8 = i15;
                    i = i13;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = 16;
                    f = 1.0f;
                    i7 = -1;
                    i8 = -1;
                }
                return new de0(arrayList, z, i, i2, i3, i7, i8, i4, i5, i6, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw xm8.a(e, "Error parsing AVC config");
        }
    }
}
