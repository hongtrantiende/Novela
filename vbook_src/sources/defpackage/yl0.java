package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yl0  reason: default package */
/* loaded from: classes3.dex */
public final class yl0 {
    public static final yl0 b = new yl0(0);
    public final int a;

    public yl0(int i) {
        this.a = i;
        if (i >= 0 && i < 6) {
            return;
        }
        p1a.k(a82.j(i, "Block indentation level must be between 0 and 5, got "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yl0) && this.a == ((yl0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.l("BlockAttributes(indentationLevel=", ")", this.a);
    }
}
