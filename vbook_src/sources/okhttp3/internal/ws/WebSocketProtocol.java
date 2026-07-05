package okhttp3.internal.ws;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class WebSocketProtocol {
    public static String a(int i) {
        if (i >= 1000 && i < 5000) {
            if ((1004 <= i && i < 1007) || (1015 <= i && i < 3000)) {
                return hl5.l("Code ", " is reserved and may not be used.", i);
            }
            return null;
        }
        return a82.j(i, "Code must be in range [1000,5000): ");
    }

    public static void b(ky0 ky0Var, byte[] bArr) {
        ky0Var.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = ky0Var.e;
            int i2 = ky0Var.f;
            int i3 = ky0Var.C;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (ky0Var.q() != -1);
    }
}
