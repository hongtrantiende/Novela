package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x53  reason: default package */
/* loaded from: classes.dex */
public final class x53 {
    public final boolean a;
    public final boolean b;
    public final boolean d;
    public final i4a c = i4a.a;
    public final boolean e = true;
    public final String f = "";
    public final int g = 2;

    public x53(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x53) {
                x53 x53Var = (x53) obj;
                if (this.a != x53Var.a || this.b != x53Var.b || this.c != x53Var.c || this.d != x53Var.d || this.e != x53Var.e || this.g != x53Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (eub.k(eub.k((this.c.hashCode() + eub.k(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }
}
