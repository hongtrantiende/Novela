package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ebd  reason: default package */
/* loaded from: classes3.dex */
public final class ebd {
    public final long a;
    public final long b;

    public ebd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebd)) {
            return false;
        }
        ebd ebdVar = (ebd) obj;
        if (this.a == ebdVar.a && this.b == ebdVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.q(rs8.o(this.a, "VideoSourceTrackTimeSkip(fromTime=", ", toTime="), this.b, ")");
    }
}
