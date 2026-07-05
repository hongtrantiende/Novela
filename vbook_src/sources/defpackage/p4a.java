package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p4a  reason: default package */
/* loaded from: classes.dex */
public final class p4a {
    public static final p4a c = new p4a(0, 0);
    public final long a;
    public final long b;

    public p4a(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p4a.class == obj.getClass()) {
            p4a p4aVar = (p4a) obj;
            if (this.a == p4aVar.a && this.b == p4aVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return hl5.q(sb, this.b, "]");
    }
}
