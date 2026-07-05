package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e8d  reason: default package */
/* loaded from: classes3.dex */
public final class e8d implements n8d {
    public final String a;

    public e8d(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e8d) && c16.i(this.a, ((e8d) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("AddBookDownloadFailed(bookName=", this.a, ")");
    }
}
