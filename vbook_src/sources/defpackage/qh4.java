package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qh4  reason: default package */
/* loaded from: classes.dex */
public final class qh4 implements w22 {
    @Override // defpackage.w22
    public final long a(long j, long j2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
        int i = kz9.c;
        return floatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qh4) || Float.compare(1.0f, 1.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
