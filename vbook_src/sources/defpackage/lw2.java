package defpackage;

import android.util.Base64;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lw2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lw2 implements c9b {
    public final /* synthetic */ int a;

    @Override // defpackage.c9b
    public final Object get() {
        switch (this.a) {
            case 0:
                byte[] bArr = new byte[12];
                nw2.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 1:
                return new jv2();
            case 2:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    p1a.n(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
