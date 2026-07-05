package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wyc  reason: default package */
/* loaded from: classes.dex */
public final class wyc implements ls {
    public final String a;

    public wyc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wyc) {
                if (!this.a.equals(((wyc) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("UrlAnnotation(url=", this.a, ")");
    }
}
