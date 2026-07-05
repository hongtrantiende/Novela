package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j5a  reason: default package */
/* loaded from: classes.dex */
public final class j5a {
    public final long a;
    public final long b;

    public j5a(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j5a.class == obj.getClass()) {
            j5a j5aVar = (j5a) obj;
            if (this.a == j5aVar.a && this.b == j5aVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
