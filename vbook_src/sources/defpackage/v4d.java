package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v4d  reason: default package */
/* loaded from: classes.dex */
public final class v4d {
    public final long a;
    public final long b;
    public final arc c;

    public v4d(long j, long j2, arc arcVar) {
        this.a = j;
        this.b = j2;
        this.c = arcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v4d) {
            v4d v4dVar = (v4d) obj;
            if (zl1.c(this.a, v4dVar.a) && zl1.c(this.b, v4dVar.b) && this.c.equals(v4dVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        int c = hl5.c(Long.hashCode(this.a) * 31, this.b, 31);
        return Boolean.hashCode(false) + ((this.c.hashCode() + c) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Veil(initialColor=", zl1.i(this.a), ", targetColor=", zl1.i(this.b), ", animationSpec=");
        y.append(this.c);
        y.append(", matchParentSize=false)");
        return y.toString();
    }
}
