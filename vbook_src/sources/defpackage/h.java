package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h  reason: default package */
/* loaded from: classes3.dex */
public final class h {
    public static final int[] g = new int[256];
    public static final int[] h = new int[256];
    public static final int[] i = new int[256];
    public static final int[] j = new int[256];
    public static final int[] k = new int[256];
    public static final int[] l = new int[256];
    public static final int[] m = new int[256];
    public static final int[] n = new int[256];
    public static final int[] o = new int[256];
    public static final int[] p = new int[256];
    public static final int[] q = {0, 1, 2, 4, 8, 16, 32, 64, Token.CASE, 27, 54};
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    static {
        int i2;
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            if (i3 >= 128) {
                i2 = (i3 << 1) ^ 283;
            } else {
                i2 = i3 << 1;
            }
            iArr[i3] = i2;
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 256; i6++) {
            int i7 = ((((i4 << 1) ^ i4) ^ (i4 << 2)) ^ (i4 << 3)) ^ (i4 << 4);
            int i8 = ((i7 & 255) ^ (i7 >>> 8)) ^ 99;
            g[i5] = i8;
            h[i8] = i5;
            int i9 = iArr[i5];
            int i10 = iArr[i9];
            int i11 = iArr[i10];
            int i12 = (iArr[i8] * 257) ^ (i8 * 16843008);
            i[i5] = (i12 << 24) | (i12 >>> 8);
            j[i5] = (i12 << 16) | (i12 >>> 16);
            k[i5] = (i12 << 8) | (i12 >>> 24);
            l[i5] = i12;
            int i13 = (((i10 * 65537) ^ (16843009 * i11)) ^ (i9 * 257)) ^ (16843008 * i5);
            m[i8] = (i13 << 24) | (i13 >>> 8);
            n[i8] = (i13 << 16) | (i13 >>> 16);
            o[i8] = (i13 << 8) | (i13 >>> 24);
            p[i8] = i13;
            if (i5 == 0) {
                i4 = 1;
                i5 = 1;
            } else {
                i5 = iArr[iArr[iArr[i11 ^ i9]]] ^ i9;
                i4 ^= iArr[iArr[i4]];
            }
        }
    }

    public h(byte[] bArr) {
        int[] iArr;
        int i2;
        int i3;
        bArr.getClass();
        int length = bArr.length / 4;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = fbe.D(bArr, i4 * 4);
        }
        this.a = iArr2;
        this.b = length;
        this.c = length + 6;
        int i5 = (length + 7) * 4;
        this.d = i5;
        int[] iArr3 = new int[i5];
        int i6 = 0;
        while (true) {
            iArr = g;
            if (i6 >= i5) {
                break;
            }
            int i7 = this.b;
            if (i6 < i7) {
                i3 = this.a[i6];
            } else {
                int i8 = iArr3[i6 - 1];
                int i9 = i6 % i7;
                if (i9 == 0) {
                    int i10 = (i8 >>> 24) | (i8 << 8);
                    i8 = (q[i6 / i7] << 24) ^ (iArr[i10 & 255] | (((iArr[(i10 >>> 24) & 255] << 24) | (iArr[(i10 >>> 16) & 255] << 16)) | (iArr[(i10 >>> 8) & 255] << 8)));
                } else if (i7 > 6 && i9 == 4) {
                    i8 = (iArr[(i8 >>> 24) & 255] << 24) | (iArr[(i8 >>> 16) & 255] << 16) | (iArr[(i8 >>> 8) & 255] << 8) | iArr[i8 & 255];
                }
                i3 = iArr3[i6 - i7] ^ i8;
            }
            iArr3[i6] = i3;
            i6++;
        }
        this.e = iArr3;
        int i11 = this.d;
        int[] iArr4 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.d - i12;
            int i14 = i12 % 4;
            int[] iArr5 = this.e;
            if (i14 != 0) {
                i2 = iArr5[i13];
            } else {
                i2 = iArr5[i13 - 4];
            }
            if (i12 >= 4 && i13 > 4) {
                i2 = p[iArr[i2 & 255]] ^ ((m[iArr[(i2 >>> 24) & 255]] ^ n[iArr[(i2 >>> 16) & 255]]) ^ o[iArr[(i2 >>> 8) & 255]]);
            }
            iArr4[i12] = i2;
        }
        this.f = iArr4;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        ry5 D = dce.D(dce.F(0, i3), 16);
        int i4 = D.a;
        int i5 = D.b;
        int i6 = D.c;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return;
        }
        while (true) {
            h hVar = this;
            byte[] bArr2 = bArr;
            hVar.b(bArr2, i2 + i4, this.f, m, n, o, p, h, true);
            if (i4 != i5) {
                i4 += i6;
                this = hVar;
                bArr = bArr2;
            } else {
                return;
            }
        }
    }

    public final void b(byte[] bArr, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, boolean z) {
        int i3;
        int i4;
        char c = 3;
        int i5 = 1;
        if (!z) {
            i3 = 1;
        } else {
            i3 = 3;
        }
        if (!z) {
            i4 = 3;
        } else {
            i4 = 1;
        }
        int D = fbe.D(bArr, i2) ^ iArr[0];
        int i6 = 4;
        int i7 = (i3 * 4) + i2;
        int D2 = fbe.D(bArr, i7) ^ iArr[1];
        int i8 = i2 + 8;
        int D3 = fbe.D(bArr, i8) ^ iArr[2];
        int i9 = (i4 * 4) + i2;
        int D4 = fbe.D(bArr, i9) ^ iArr[3];
        while (i5 < this.c) {
            int i10 = (((iArr2[(D >>> 24) & 255] ^ iArr3[(D2 >>> 16) & 255]) ^ iArr4[(D3 >>> 8) & 255]) ^ iArr5[D4 & 255]) ^ iArr[i6];
            char c2 = c;
            int i11 = (((iArr3[(D3 >>> 16) & 255] ^ iArr2[(D2 >>> 24) & 255]) ^ iArr4[(D4 >>> 8) & 255]) ^ iArr5[D & 255]) ^ iArr[i6 + 1];
            int i12 = ((iArr3[(D4 >>> 16) & 255] ^ iArr2[(D3 >>> 24) & 255]) ^ iArr4[(D >>> 8) & 255]) ^ iArr5[D2 & 255];
            int i13 = i6 + 3;
            i6 += 4;
            D4 = (((iArr3[(D >>> 16) & 255] ^ iArr2[(D4 >>> 24) & 255]) ^ iArr4[(D2 >>> 8) & 255]) ^ iArr5[D3 & 255]) ^ iArr[i13];
            i5++;
            D2 = i11;
            D3 = i12 ^ iArr[i6 + 2];
            D = i10;
            c = c2;
        }
        int i14 = ((((iArr6[(D >>> 24) & 255] << 24) | (iArr6[(D2 >>> 16) & 255] << 16)) | (iArr6[(D3 >>> 8) & 255] << 8)) | iArr6[D4 & 255]) ^ iArr[i6];
        int i15 = iArr[i6 + 1] ^ ((((iArr6[(D2 >>> 24) & 255] << 24) | (iArr6[(D3 >>> 16) & 255] << 16)) | (iArr6[(D4 >>> 8) & 255] << 8)) | iArr6[D & 255]);
        int i16 = iArr6[(D >>> 16) & 255] << 16;
        fbe.s(bArr, i2, i14);
        fbe.s(bArr, i7, i15);
        fbe.s(bArr, i8, ((((iArr6[(D3 >>> 24) & 255] << 24) | (iArr6[(D4 >>> 16) & 255] << 16)) | (iArr6[(D >>> 8) & 255] << 8)) | iArr6[D2 & 255]) ^ iArr[i6 + 2]);
        fbe.s(bArr, i9, (((i16 | (iArr6[(D4 >>> 24) & 255] << 24)) | (iArr6[(D2 >>> 8) & 255] << 8)) | iArr6[D3 & 255]) ^ iArr[i6 + 3]);
    }

    public final void c(byte[] bArr, int i2, int i3) {
        ry5 D = dce.D(dce.F(0, i3), 16);
        int i4 = D.a;
        int i5 = D.b;
        int i6 = D.c;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return;
        }
        while (true) {
            h hVar = this;
            byte[] bArr2 = bArr;
            hVar.b(bArr2, i2 + i4, this.e, i, j, k, l, g, false);
            if (i4 != i5) {
                i4 += i6;
                this = hVar;
                bArr = bArr2;
            } else {
                return;
            }
        }
    }
}
