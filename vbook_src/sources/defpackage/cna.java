package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cna  reason: default package */
/* loaded from: classes.dex */
public final class cna {
    public static final cna c;
    public final z63 a;
    public final z63 b;

    static {
        x63 x63Var = x63.a;
        c = new cna(x63Var, x63Var);
    }

    public cna(z63 z63Var, z63 z63Var2) {
        this.a = z63Var;
        this.b = z63Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cna) {
                cna cnaVar = (cna) obj;
                if (!this.a.equals(cnaVar.a) || !this.b.equals(cnaVar.b)) {
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
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
