package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gn3  reason: default package */
/* loaded from: classes3.dex */
public final class gn3 extends cc1 {
    public static final mfb e = new mfb(new qk3(16));

    @Override // defpackage.cc1
    public final int b(byte[] bArr, int i) {
        bArr.getClass();
        int i2 = bArr[i] & 255;
        if (i2 >= 176) {
            return (((i2 - Token.GENEXPR) * 94) + (bArr[i + 1] & 255)) - 161;
        }
        return -1;
    }
}
