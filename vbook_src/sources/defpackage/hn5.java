package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hn5  reason: default package */
/* loaded from: classes3.dex */
public final class hn5 implements sn5 {
    public final int a;

    public hn5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hn5) && this.a == ((hn5) obj).a) {
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
