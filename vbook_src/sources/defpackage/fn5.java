package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fn5  reason: default package */
/* loaded from: classes3.dex */
public final class fn5 implements sn5 {
    public final String a;

    public fn5(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fn5) && c16.i(this.a, ((fn5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("AddBookDownloadExists(bookName=", this.a, ")");
    }
}
