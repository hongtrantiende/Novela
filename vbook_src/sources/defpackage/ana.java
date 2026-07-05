package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ana  reason: default package */
/* loaded from: classes.dex */
public abstract class ana {
    public static final byte[] a;

    static {
        int i;
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            if (i2 < 10) {
                i = 48;
            } else {
                i = 87;
            }
            bArr[i2] = (byte) (i + i2);
        }
        a = bArr;
    }
}
