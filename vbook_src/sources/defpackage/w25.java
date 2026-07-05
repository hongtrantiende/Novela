package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w25  reason: default package */
/* loaded from: classes.dex */
public final class w25 {
    public static final byte[] e = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public byte[] d;

    public final void a(byte[] bArr, int i, int i2) {
        if (!this.a) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i4 = this.b + i3;
        if (length < i4) {
            this.d = Arrays.copyOf(bArr2, i4 * 2);
        }
        System.arraycopy(bArr, i, this.d, this.b, i3);
        this.b += i3;
    }
}
