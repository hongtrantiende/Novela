package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mr6  reason: default package */
/* loaded from: classes.dex */
public final class mr6 {
    public final rwa a;
    public final String b;

    public mr6(rwa rwaVar, String str) {
        this.a = rwaVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mr6) {
                mr6 mr6Var = (mr6) obj;
                if (this.a == mr6Var.a && this.b.equals(mr6Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
