package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xg9  reason: default package */
/* loaded from: classes.dex */
public final class xg9 {
    public static final xg9 c;
    public final wg9 a;
    public final wg9 b;

    static {
        wg9 wg9Var = new wg9(-1, -1, -1);
        c = new xg9(wg9Var, wg9Var);
    }

    public xg9(wg9 wg9Var, wg9 wg9Var2) {
        this.a = wg9Var;
        this.b = wg9Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xg9) {
                xg9 xg9Var = (xg9) obj;
                if (!this.a.equals(xg9Var.a) || !this.b.equals(xg9Var.b)) {
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
        return this.a + "-" + this.b;
    }
}
