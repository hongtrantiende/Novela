package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v55  reason: default package */
/* loaded from: classes.dex */
public final class v55 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final oaa o;

    public v55(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, oaa oaaVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = oaaVar;
    }

    public static v55 a(km8 km8Var, boolean z, oaa oaaVar) {
        String str;
        boolean z2;
        List singletonList;
        r95 x;
        int i;
        int i2 = 4;
        try {
            if (z) {
                km8Var.N(4);
            } else {
                km8Var.N(21);
            }
            int z3 = km8Var.z() & 3;
            int z4 = km8Var.z();
            int i3 = km8Var.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= z4) {
                    break;
                }
                km8Var.N(1);
                int G = km8Var.G();
                for (int i7 = 0; i7 < G; i7++) {
                    int G2 = km8Var.G();
                    i6 += G2 + 4;
                    km8Var.N(G2);
                }
                i5++;
            }
            km8Var.M(i3);
            byte[] bArr = new byte[i6];
            oaa oaaVar2 = oaaVar;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String str2 = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < z4) {
                int z5 = km8Var.z() & 63;
                int G3 = km8Var.G();
                int i20 = i4;
                oaa oaaVar3 = oaaVar2;
                while (i20 < G3) {
                    boolean z6 = z2;
                    int G4 = km8Var.G();
                    int i21 = z3;
                    System.arraycopy(dae.i, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(km8Var.a, km8Var.b, bArr, i22, G4);
                    if (z5 == 32 && i20 == 0) {
                        oaaVar3 = dae.z(bArr, i22, i22 + G4);
                    } else {
                        if (z5 == 33 && i20 == 0) {
                            kx7 y = dae.y(bArr, i22, i22 + G4, oaaVar3);
                            i8 = y.a + 1;
                            i9 = y.g;
                            int i23 = y.h;
                            i11 = y.c + 8;
                            i12 = y.d + 8;
                            int i24 = y.k;
                            i10 = i23;
                            int i25 = y.l;
                            int i26 = y.m;
                            float f2 = y.i;
                            int i27 = y.j;
                            hx7 hx7Var = y.b;
                            if (hx7Var != null) {
                                i = i27;
                                str2 = vk1.a(hx7Var.a, hx7Var.b, hx7Var.c, hx7Var.d, hx7Var.e, hx7Var.f);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (z5 == 39 && i20 == 0 && (x = dae.x(bArr, i22, i22 + G4)) != null && oaaVar3 != null) {
                            i4 = 0;
                            if (x.b == ((gx7) ((qs5) oaaVar3.b).get(0)).b) {
                                i16 = 4;
                            } else {
                                i16 = 5;
                            }
                        }
                        i4 = 0;
                    }
                    i19 = i22 + G4;
                    km8Var.N(G4);
                    i20++;
                    z2 = z6;
                    z3 = i21;
                    i2 = 4;
                }
                i18++;
                oaaVar2 = oaaVar3;
                i2 = 4;
            }
            int i28 = z3;
            if (i6 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new v55(singletonList, i28 + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, str2, oaaVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (z) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw xm8.a(e, "Error parsing".concat(str));
        }
    }
}
