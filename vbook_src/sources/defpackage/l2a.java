package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l2a  reason: default package */
/* loaded from: classes.dex */
public final class l2a {
    public final int a;

    public l2a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l2a) && this.a == ((l2a) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.l("ScrollToPageRequest(index=", ", animate=false)", this.a);
    }
}
