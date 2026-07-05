package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u14  reason: default package */
/* loaded from: classes3.dex */
public final class u14 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final s14 d;

    public u14(boolean z, boolean z2, String str, s14 s14Var) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = s14Var;
    }

    public static u14 a(u14 u14Var, boolean z, boolean z2, String str, s14 s14Var, int i) {
        if ((i & 4) != 0) {
            str = u14Var.c;
        }
        if ((i & 8) != 0) {
            s14Var = u14Var.d;
        }
        u14Var.getClass();
        s14Var.getClass();
        return new u14(z, z2, str, s14Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u14) {
                u14 u14Var = (u14) obj;
                if (this.a != u14Var.a || this.b != u14Var.b || !this.c.equals(u14Var.c) || !this.d.equals(u14Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.a.hashCode() + eub.j(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder p = rs8.p("ExploreState(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        p.append(this.c);
        p.append(", page=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
