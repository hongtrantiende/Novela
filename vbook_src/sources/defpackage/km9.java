package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: km9  reason: default package */
/* loaded from: classes3.dex */
public final class km9 implements of9 {
    public final String a;

    public km9(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && km9.class == obj.getClass()) {
            return c16.i(this.a, ((km9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("RegionQualifier(region='", this.a, "')");
    }
}
