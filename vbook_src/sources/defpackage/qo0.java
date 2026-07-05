package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qo0  reason: default package */
/* loaded from: classes3.dex */
public final class qo0 implements ro0 {
    public final String a;

    public qo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qo0) || !this.a.equals(((qo0) obj).a)) {
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
