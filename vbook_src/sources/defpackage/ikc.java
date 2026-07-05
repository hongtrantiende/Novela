package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ikc  reason: default package */
/* loaded from: classes.dex */
public final class ikc {
    public final ps a;
    public final j88 b;

    public ikc(ps psVar, j88 j88Var) {
        this.a = psVar;
        this.b = j88Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ikc) {
                ikc ikcVar = (ikc) obj;
                if (!c16.i(this.a, ikcVar.a) || !this.b.equals(ikcVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
