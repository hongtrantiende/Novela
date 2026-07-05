package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pr2  reason: default package */
/* loaded from: classes3.dex */
public final class pr2 implements xr2 {
    public final wo a;

    public pr2(wo woVar) {
        this.a = woVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pr2) && this.a == ((pr2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImportFile(file=" + this.a + ")";
    }
}
