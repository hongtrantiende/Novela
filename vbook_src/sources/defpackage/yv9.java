package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yv9  reason: default package */
/* loaded from: classes3.dex */
public final class yv9 extends j26 {
    @Override // defpackage.cc1
    public final int b(byte[] bArr, int i) {
        int i2;
        bArr.getClass();
        int i3 = bArr[i] & 255;
        if (129 <= i3 && i3 < 160) {
            i2 = i3 - Token.DEFAULT;
        } else if (224 > i3 || i3 >= 240) {
            return -1;
        } else {
            i2 = i3 - 193;
        }
        int i4 = i2 * 188;
        int i5 = bArr[i + 1] & 255;
        int i6 = (i5 - 64) + i4;
        if (i5 >= 128) {
            return i6 - 1;
        }
        return i6;
    }
}
