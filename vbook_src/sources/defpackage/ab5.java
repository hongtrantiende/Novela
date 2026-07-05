package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ab5  reason: default package */
/* loaded from: classes3.dex */
public final class ab5 extends ote {
    public final String c;
    public final String d;
    public final int e;

    public ab5(String str, String str2, int i) {
        str.getClass();
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ab5) {
                ab5 ab5Var = (ab5) obj;
                if (!c16.i(this.c, ab5Var.c) || !this.d.equals(ab5Var.d) || this.e != ab5Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + eub.j(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        return rs8.g(this.e, ")", nk2.y("MismatchedNesting(expected=", this.c, ", found=", this.d, ", charOffset="));
    }
}
