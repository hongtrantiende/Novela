package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rk0  reason: default package */
/* loaded from: classes3.dex */
public final class rk0 extends cc1 {
    public static final mfb e = new mfb(new mf0(4));

    @Override // defpackage.cc1
    public final int b(byte[] bArr, int i) {
        bArr.getClass();
        int i2 = bArr[i] & 255;
        if (i2 >= 164) {
            int i3 = bArr[i + 1] & 255;
            if (i3 >= 161) {
                return (((i2 - Token.TO_DOUBLE) * Token.DOTDOT) + i3) - 98;
            }
            return (((i2 - Token.TO_DOUBLE) * Token.DOTDOT) + i3) - 64;
        }
        return -1;
    }
}
