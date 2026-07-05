package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p7c  reason: default package */
/* loaded from: classes.dex */
public final class p7c implements rb7 {
    public final long a;

    public p7c(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p7c.class == obj.getClass() && this.a == ((p7c) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return axe.m(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
