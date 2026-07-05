package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vv9  reason: default package */
/* loaded from: classes3.dex */
public final class vv9 extends xv9 {
    public static final pz6 j = new l4(new zt9(4), "SHA256", 2);
    public static final int[] k = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    public static final int[] l = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public final int[] g;
    public final int[] h;
    public final int[] i;

    public vv9() {
        super(64, 32);
        this.g = new int[8];
        this.h = new int[8];
        this.i = new int[64];
        c();
    }

    @Override // defpackage.e45
    public final void a(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (this.g[i / 4] >>> (24 - ((i % 4) * 8)));
        }
    }

    @Override // defpackage.e45
    public final void c() {
        int[] iArr = k;
        iArr.getClass();
        int[] iArr2 = this.g;
        iArr2.getClass();
        b00.V(0, 0, 8, iArr, iArr2);
    }

    @Override // defpackage.e45
    public final void d(byte[] bArr) {
        int i;
        int[] iArr;
        int i2;
        int[] iArr2 = this.g;
        iArr2.getClass();
        int[] iArr3 = this.h;
        iArr3.getClass();
        b00.V(0, 0, 8, iArr2, iArr3);
        int i3 = 0;
        while (true) {
            i = 16;
            iArr = this.i;
            if (i3 >= 16) {
                break;
            }
            iArr[i3] = xv9.h(bArr, i3 * 4);
            i3++;
        }
        while (true) {
            if (i >= 64) {
                break;
            }
            int i4 = i - 15;
            int i5 = i - 2;
            iArr[i] = iArr[i - 16] + ((iArr[i4] >>> 3) ^ (Integer.rotateRight(iArr[i4], 7) ^ Integer.rotateRight(iArr[i4], 18))) + iArr[i - 7] + ((iArr[i5] >>> 10) ^ (Integer.rotateRight(iArr[i5], 17) ^ Integer.rotateRight(iArr[i5], 19)));
            i++;
        }
        int i6 = 0;
        for (i2 = 64; i6 < i2; i2 = 64) {
            int rotateRight = (Integer.rotateRight(iArr3[4], 6) ^ Integer.rotateRight(iArr3[4], 11)) ^ Integer.rotateRight(iArr3[4], 25);
            int i7 = iArr3[4];
            int i8 = iArr3[7] + rotateRight + (((~i7) & iArr3[6]) ^ (iArr3[5] & i7)) + l[i6] + iArr[i6];
            int rotateRight2 = (Integer.rotateRight(iArr3[0], 13) ^ Integer.rotateRight(iArr3[0], 2)) ^ Integer.rotateRight(iArr3[0], 22);
            int i9 = iArr3[0];
            int i10 = iArr3[1];
            int i11 = iArr3[2];
            iArr3[7] = iArr3[6];
            iArr3[6] = iArr3[5];
            iArr3[5] = iArr3[4];
            iArr3[4] = iArr3[3] + i8;
            iArr3[3] = i11;
            iArr3[2] = i10;
            iArr3[1] = i9;
            iArr3[0] = i8 + rotateRight2 + (((i9 & i10) ^ (i9 & i11)) ^ (i10 & i11));
            i6++;
        }
        for (int i12 = 0; i12 < 8; i12++) {
            iArr2[i12] = iArr2[i12] + iArr3[i12];
        }
    }
}
