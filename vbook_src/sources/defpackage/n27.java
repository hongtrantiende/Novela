package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n27  reason: default package */
/* loaded from: classes.dex */
public final class n27 {
    public final String a;
    public final String b;
    public final boolean c;

    public n27(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n27) {
                n27 n27Var = (n27) obj;
                if (!this.a.equals(n27Var.a) || !this.b.equals(n27Var.b) || this.c != n27Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("MatrixMapping(begin=", this.a, ", end=", this.b, ", removeOuterBrackets="), this.c);
    }
}
