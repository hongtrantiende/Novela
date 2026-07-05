package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kt8  reason: default package */
/* loaded from: classes3.dex */
public final class kt8 {
    public final q65 a;
    public final r97 b;

    public kt8(q65 q65Var, r97 r97Var) {
        r97Var.getClass();
        this.a = q65Var;
        this.b = r97Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kt8) {
                kt8 kt8Var = (kt8) obj;
                if (!this.a.equals(kt8Var.a) || !c16.i(this.b, kt8Var.b)) {
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
        return "PendingTextHistoryPush(entry=" + this.a + ", policy=" + this.b + ")";
    }
}
