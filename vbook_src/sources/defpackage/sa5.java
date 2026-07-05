package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sa5  reason: default package */
/* loaded from: classes3.dex */
public final class sa5 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public sa5(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sa5) {
                sa5 sa5Var = (sa5) obj;
                if (!this.a.equals(sa5Var.a) || !c16.i(this.b, sa5Var.b) || this.c != sa5Var.c || this.d != sa5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.d) + hl5.a(this.c, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        return hl5.j(this.c, this.d, ", sourceEndExclusive=", ")", nk2.y("HtmlAttribute(name=", this.a, ", value=", this.b, ", sourceStart="));
    }
}
