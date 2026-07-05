package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oa5  reason: default package */
/* loaded from: classes.dex */
public final class oa5 {
    public final int a;
    public final String b;

    public oa5(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa5)) {
            return false;
        }
        oa5 oa5Var = (oa5) obj;
        if (this.a == oa5Var.a && c16.i(this.b, oa5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TagMarker(priority=" + this.a + ", html=" + this.b + ")";
    }
}
