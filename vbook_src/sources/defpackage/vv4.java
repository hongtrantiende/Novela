package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vv4  reason: default package */
/* loaded from: classes.dex */
public final class vv4 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final wu7 e;
    public final mfb f;

    public vv4(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            e39.a("Invalid start index");
        }
        this.d = new ArrayList();
        wu7 wu7Var = new wu7();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j86 j86Var = (j86) this.a.get(i3);
            int i4 = j86Var.c;
            int i5 = j86Var.d;
            wu7Var.i(i4, new r25(i3, i2, i5));
            i2 += i5;
        }
        this.e = wu7Var;
        this.f = new mfb(new vm(this, 2));
    }

    public final boolean a(int i, int i2) {
        r25 r25Var;
        int i3;
        int i4;
        wu7 wu7Var = this.e;
        r25 r25Var2 = (r25) wu7Var.b(i);
        if (r25Var2 == null) {
            return false;
        }
        int i5 = r25Var2.b;
        int i6 = i2 - r25Var2.c;
        r25Var2.c = i2;
        if (i6 != 0) {
            Object[] objArr = wu7Var.c;
            long[] jArr = wu7Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j) < 128 && (i3 = (r25Var = (r25) objArr[(i7 << 3) + i9]).b) >= i5 && r25Var != r25Var2 && (i4 = i3 + i6) >= 0) {
                                r25Var.b = i4;
                            }
                            j >>= 8;
                        }
                        if (i8 != 8) {
                            return true;
                        }
                    }
                    if (i7 != length) {
                        i7++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
