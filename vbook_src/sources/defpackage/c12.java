package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c12  reason: default package */
/* loaded from: classes.dex */
public final class c12 extends d12 {
    public final int a;

    public c12(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c12) && this.a == ((c12) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.p(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
    }
}
