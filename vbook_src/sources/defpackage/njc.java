package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: njc  reason: default package */
/* loaded from: classes3.dex */
public final class njc {
    public final long a;
    public final long b;

    public njc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njc)) {
            return false;
        }
        njc njcVar = (njc) obj;
        if (this.a == njcVar.a && this.b == njcVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.q(rs8.o(this.a, "TrackTimeSkip(fromTime=", ", toTime="), this.b, ")");
    }
}
