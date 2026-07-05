package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v67  reason: default package */
/* loaded from: classes.dex */
public final class v67 {
    public static final v67 b = new v67("text/*");
    public static final v67 c = new v67("*/*");
    public final String a;

    public v67(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v67)) {
            return false;
        }
        return this.a.equals(((v67) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("MediaType(representation='", this.a, "')");
    }
}
