package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e27  reason: default package */
/* loaded from: classes.dex */
public final class e27 {
    public final long a;
    public final x72 b;

    public e27(long j, x72 x72Var) {
        this.a = j;
        this.b = x72Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e27) {
                e27 e27Var = (e27) obj;
                if (!y78.d(this.a, e27Var.a) || !c16.i(this.b, e27Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String l = y78.l(this.a);
        return "PointNRound(o=" + l + ", r=" + this.b + ")";
    }
}
