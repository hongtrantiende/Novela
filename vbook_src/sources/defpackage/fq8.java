package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fq8  reason: default package */
/* loaded from: classes3.dex */
public final class fq8 implements jq8 {
    public final double a;

    public fq8(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fq8) && Double.compare(this.a, ((fq8) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "Number(value=" + this.a + ")";
    }
}
