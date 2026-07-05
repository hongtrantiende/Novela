package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z23  reason: default package */
/* loaded from: classes3.dex */
public final class z23 implements b33 {
    public final String a;

    public z23(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof z23) || !this.a.equals(((z23) obj).a)) {
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
        return hl5.n("AddBookSuccess(bookName=", this.a, ")");
    }
}
