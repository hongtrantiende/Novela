package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jrd  reason: default package */
/* loaded from: classes3.dex */
public final class jrd {
    public final float a;

    public jrd(long j, long j2) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j >> 32);
        int i4 = (int) (j & 4294967295L);
        if (i / i2 > i3 / i4) {
            if (i4 >= i2) {
                i2 = i4;
            }
        } else {
            i2 = i3 >= i ? i3 : i;
        }
        this.a = i2 / 50.0f;
    }
}
