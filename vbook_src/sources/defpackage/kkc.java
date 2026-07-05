package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kkc  reason: default package */
/* loaded from: classes.dex */
public final class kkc {
    public final grb a;
    public final bz5 b;

    public kkc(grb grbVar, bz5 bz5Var) {
        this.a = grbVar;
        this.b = bz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kkc) {
            kkc kkcVar = (kkc) obj;
            if (this.a.equals(kkcVar.a) && this.b == kkcVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
