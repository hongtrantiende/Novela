package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b51  reason: default package */
/* loaded from: classes.dex */
public final class b51 {
    public static final b51 b = new b51();
    public final y18 a;

    public b51() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b51) {
            if (c16.i(this.a, ((b51) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        y18 y18Var = this.a;
        if (y18Var != null) {
            return y18Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public b51(y18 y18Var) {
        this.a = y18Var;
    }
}
