package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xjb  reason: default package */
/* loaded from: classes3.dex */
public final class xjb implements bkb {
    public final xl0 a;

    public xjb(xl0 xl0Var) {
        this.a = xl0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof xjb) || !this.a.equals(((xjb) obj).a)) {
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
        return "AsBlock(block=" + this.a + ")";
    }
}
