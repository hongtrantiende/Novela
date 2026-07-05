package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sse  reason: default package */
/* loaded from: classes.dex */
public final class sse extends xb1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sse(byte[] bArr, int i, int i2) {
        super(bArr, i);
        this.d = i2;
    }

    @Override // defpackage.xb1
    public final int J() {
        switch (this.d) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }

    @Override // defpackage.xb1
    public final int[] O(int i, int[] iArr) {
        switch (this.d) {
            case 0:
                if (iArr.length == 3) {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = mse.a;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                    System.arraycopy((int[]) this.c, 0, iArr2, iArr3.length, 8);
                    iArr2[12] = i;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    return iArr2;
                }
                throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
            default:
                if (iArr.length == 6) {
                    int[] iArr4 = new int[16];
                    int[] e = mse.e((int[]) this.c, iArr);
                    int[] iArr5 = mse.a;
                    System.arraycopy(iArr5, 0, iArr4, 0, iArr5.length);
                    System.arraycopy(e, 0, iArr4, iArr5.length, 8);
                    iArr4[12] = i;
                    iArr4[13] = 0;
                    iArr4[14] = iArr[4];
                    iArr4[15] = iArr[5];
                    return iArr4;
                }
                throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
    }
}
