package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ph4  reason: default package */
/* loaded from: classes.dex */
public final class ph4 implements y22 {
    @Override // defpackage.y22
    public final long e(long j, long j2) {
        return mz9.a(1.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ph4) || Float.compare(1.0f, 1.0f) != 0) {
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
