package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dg2  reason: default package */
/* loaded from: classes.dex */
public final class dg2 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg2)) {
            return false;
        }
        dg2 dg2Var = (dg2) obj;
        if (this.a == dg2Var.a && Float.compare(this.b, dg2Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        long j = this.a;
        float f = this.b;
        return "DataPointAtTime(time=" + j + ", dataPoint=" + f + ")";
    }
}
