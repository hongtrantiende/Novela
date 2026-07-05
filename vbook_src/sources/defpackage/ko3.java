package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ko3  reason: default package */
/* loaded from: classes3.dex */
public final class ko3 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public ko3(String str, String str2, String str3, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko3)) {
            return false;
        }
        ko3 ko3Var = (ko3) obj;
        if (c16.i(this.a, ko3Var.a) && c16.i(this.b, ko3Var.b) && c16.i(this.c, ko3Var.c) && this.d == ko3Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.d) + ((j + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("EditableTopic(title=", this.a, ", content=", this.b, ", tag=");
        y.append(this.c);
        y.append(", category=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
