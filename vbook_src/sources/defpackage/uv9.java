package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uv9  reason: default package */
/* loaded from: classes3.dex */
public final class uv9 extends xv9 {
    public static final pz6 i = new l4(new zt9(3), "SHA1", 2);
    public static final int[] j = {1732584193, -271733879, -1732584194, 271733878, -1009589776};
    public final int[] g;
    public final int[] h;

    public uv9() {
        super(64, 20, "SHA1");
        this.g = new int[80];
        this.h = new int[5];
        c();
    }

    @Override // defpackage.e45
    public final void a(byte[] bArr) {
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (this.h[i2 / 4] >>> (24 - ((i2 % 4) * 8)));
        }
    }

    @Override // defpackage.e45
    public final void c() {
        int[] iArr = j;
        iArr.getClass();
        int[] iArr2 = this.h;
        iArr2.getClass();
        b00.V(0, 0, 5, iArr, iArr2);
    }

    @Override // defpackage.e45
    public final void d(byte[] bArr) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (true) {
            iArr = this.g;
            if (i5 >= 16) {
                break;
            }
            iArr[i5] = xv9.h(bArr, i5 * 4);
            i5++;
        }
        for (i2 = 16; i2 < 80; i2++) {
            iArr[i2] = Integer.rotateLeft(((iArr[i2 - 3] ^ iArr[i2 - 8]) ^ iArr[i2 - 14]) ^ iArr[i2 - 16], 1);
        }
        int[] iArr2 = this.h;
        int i6 = iArr2[0];
        int i7 = iArr2[1];
        int i8 = iArr2[2];
        int i9 = iArr2[3];
        int i10 = iArr2[4];
        int i11 = 0;
        while (i11 < 80) {
            int rotateLeft = Integer.rotateLeft(i6, 5) + i10 + iArr[i11];
            int i12 = i11 / 20;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        i3 = (i7 ^ i8) ^ i9;
                        i4 = -899497514;
                    } else {
                        i3 = ((i7 & i8) ^ (i7 & i9)) ^ (i8 & i9);
                        i4 = -1894007588;
                    }
                } else {
                    i3 = (i7 ^ i8) ^ i9;
                    i4 = 1859775393;
                }
            } else {
                i3 = (i7 & i8) | ((~i7) & i9);
                i4 = 1518500249;
            }
            int rotateLeft2 = Integer.rotateLeft(i7, 30);
            i11++;
            i7 = i6;
            i6 = i3 + i4 + rotateLeft;
            i10 = i9;
            i9 = i8;
            i8 = rotateLeft2;
        }
        iArr2[0] = iArr2[0] + i6;
        iArr2[1] = iArr2[1] + i7;
        iArr2[2] = iArr2[2] + i8;
        iArr2[3] = iArr2[3] + i9;
        iArr2[4] = iArr2[4] + i10;
    }
}
