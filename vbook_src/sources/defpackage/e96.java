package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e96  reason: default package */
/* loaded from: classes.dex */
public final class e96 implements xl3 {
    public final d96 a;

    public e96(d96 d96Var) {
        this.a = d96Var;
    }

    @Override // defpackage.xl3, defpackage.xr
    /* renamed from: f */
    public final t4d a(drc drcVar) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        d96 d96Var = this.a;
        wu7 wu7Var = d96Var.b;
        vu7 vu7Var = new vu7(wu7Var.e + 2);
        wu7 wu7Var2 = new wu7(wu7Var.e);
        int[] iArr3 = wu7Var.b;
        Object[] objArr3 = wu7Var.c;
        long[] jArr = wu7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            c96 c96Var = (c96) objArr3[i6];
                            vu7Var.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            wu7Var2.i(i7, new s4d((js) drcVar.a.invoke(c96Var.a), c96Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!wu7Var.a(0)) {
            int i8 = vu7Var.b;
            if (i8 >= 0) {
                vu7Var.b(i8 + 1);
                int[] iArr4 = vu7Var.a;
                int i9 = vu7Var.b;
                if (i9 != 0) {
                    b00.V(1, 0, i9, iArr4, iArr4);
                }
                iArr4[0] = 0;
                vu7Var.b++;
            } else {
                cy7.k("Index must be between 0 and size");
                return null;
            }
        }
        if (!wu7Var.a(d96Var.a)) {
            vu7Var.a(d96Var.a);
        }
        int i10 = vu7Var.b;
        if (i10 != 0) {
            int[] iArr5 = vu7Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new t4d(vu7Var, wu7Var2, d96Var.a, on3.d);
    }
}
