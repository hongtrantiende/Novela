package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yb6  reason: default package */
/* loaded from: classes3.dex */
public final class yb6 extends ad1 {
    public static final byte[] e = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 1, 7, 1, 1, 1, 1, 1, 1, 5, 1, 5, 0, 5, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 0, 7, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 7, 7, 7};
    public static final byte[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 1, 1, 3, 3, 0, 3, 3, 3, 1, 2, 1, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 1, 3, 1, 1, 1, 3, 0, 3, 1, 3, 1, 1, 3, 3};
    public zc1 b = zc1.a;
    public byte c = 1;
    public final int[] d = new int[4];

    public yb6() {
        d();
    }

    @Override // defpackage.ad1
    public final String a() {
        return "WINDOWS-1252";
    }

    @Override // defpackage.ad1
    public final float b() {
        int[] iArr;
        if (this.b == zc1.c) {
            return 0.01f;
        }
        int i = 0;
        for (int i2 : this.d) {
            i += i2;
        }
        float f2 = nae.e;
        if (i <= 0) {
            return nae.e;
        }
        float f3 = i;
        float f4 = ((iArr[3] * 1.0f) / f3) - ((iArr[1] * 20.0f) / f3);
        if (f4 >= nae.e) {
            f2 = f4;
        }
        return f2 * 0.5f;
    }

    @Override // defpackage.ad1
    public final zc1 c(byte[] bArr, int i) {
        int i2;
        ArrayList arrayList = new ArrayList(i);
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        while (i4 < i) {
            byte b = bArr[i4];
            if (b == 62) {
                z = false;
            } else if (b == 60) {
                z = true;
            }
            if ((b & 128) == 0 && ((i2 = b & 255) < 65 || ((i2 > 90 && i2 < 97) || i2 > 122))) {
                if (i4 > i5 && !z) {
                    while (i5 < i4) {
                        arrayList.add(Byte.valueOf(bArr[i5]));
                        i5++;
                    }
                    arrayList.add((byte) 32);
                }
                i5 = i4 + 1;
            }
            i4++;
        }
        if (!z && i4 > i5) {
            while (i5 < i4) {
                arrayList.add(Byte.valueOf(bArr[i5]));
                i5++;
            }
        }
        byte[] x0 = sl1.x0(arrayList);
        int length = x0.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            byte b2 = e[x0[i3] & 255];
            byte b3 = f[(this.c * 8) + b2];
            if (b3 == 0) {
                this.b = zc1.c;
                break;
            }
            int[] iArr = this.d;
            iArr[b3] = iArr[b3] + 1;
            this.c = b2;
            i3++;
        }
        return this.b;
    }

    @Override // defpackage.ad1
    public final void d() {
        this.b = zc1.a;
        this.c = (byte) 1;
        b00.h0(0, 0, 6, this.d);
    }
}
