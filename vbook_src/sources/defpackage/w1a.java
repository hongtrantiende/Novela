package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w1a  reason: default package */
/* loaded from: classes.dex */
public final class w1a {
    public static final w1a c;
    public final pn3 a;
    public final pn3 b;

    static {
        pn3 pn3Var = pn3.d;
        c = new w1a(pn3Var, pn3Var);
    }

    public w1a(pn3 pn3Var, pn3 pn3Var2) {
        this.a = pn3Var;
        this.b = pn3Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w1a) {
                w1a w1aVar = (w1a) obj;
                if (this.a != w1aVar.a || this.b != w1aVar.b) {
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
        return "ScrollEdge(horizontal=" + this.a + ", vertical=" + this.b + ')';
    }
}
