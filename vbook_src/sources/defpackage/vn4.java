package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vn4  reason: default package */
/* loaded from: classes3.dex */
public final class vn4 implements wn4 {
    public final String a;

    public vn4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof vn4) || !this.a.equals(((vn4) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("BookRemoveFollow(name=", this.a, ")");
    }
}
