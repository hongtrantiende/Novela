package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h10  reason: default package */
/* loaded from: classes.dex */
public final class h10 {
    public final io5 a;
    public final jp5 b;
    public final g10 c;

    public h10(io5 io5Var, jp5 jp5Var, g10 g10Var) {
        this.a = io5Var;
        this.b = jp5Var;
        this.c = g10Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h10) {
                h10 h10Var = (h10) obj;
                if (c16.i(this.a, h10Var.a)) {
                    g10 g10Var = h10Var.c;
                    g10 g10Var2 = this.c;
                    if (c16.i(g10Var2, g10Var) && g10Var2.a(this.b, h10Var.b)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        g10 g10Var = this.c;
        int hashCode = g10Var.hashCode();
        return g10Var.b(this.b) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
