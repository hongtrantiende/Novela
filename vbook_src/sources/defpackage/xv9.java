package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xv9  reason: default package */
/* loaded from: classes3.dex */
public abstract class xv9 extends e45 {
    public xv9(int i, int i2) {
        super(i, i2, "SHA" + (i2 * 8));
    }

    public static int h(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | (bArr[i + 3] & 255) | ((bArr[i + 2] & 255) << 8) | ((bArr[i + 1] & 255) << 16);
    }

    @Override // defpackage.e45
    public final byte[] b(long j) {
        long j2 = j % 64;
        long j3 = 64 - j2;
        if (j3 < 9) {
            j3 = 128 - j2;
        }
        int i = (int) j3;
        byte[] bArr = new byte[i];
        bArr[0] = Byte.MIN_VALUE;
        long j4 = j * 8;
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[(i - 1) - i2] = (byte) ((j4 >>> (i2 * 8)) & 255);
        }
        return bArr;
    }
}
