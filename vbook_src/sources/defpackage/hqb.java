package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hqb  reason: default package */
/* loaded from: classes3.dex */
public final class hqb implements erb {
    public final int a;

    public hqb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hqb) && this.a == ((hqb) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.l("AddBookDownloadLimit(limit=", ")", this.a);
    }
}
