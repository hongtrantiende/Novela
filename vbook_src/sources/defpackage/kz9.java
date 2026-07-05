package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kz9  reason: default package */
/* loaded from: classes.dex */
public final class kz9 {
    public static final long b = (Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof kz9) {
            if (this.a != ((kz9) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return a82.l("ScaleFactor(", Float.intBitsToFloat((int) (j >> 32)), ", ", Float.intBitsToFloat((int) (j & 4294967295L)), ")");
    }
}
