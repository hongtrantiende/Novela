package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: go0  reason: default package */
/* loaded from: classes3.dex */
public final class go0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public go0(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static go0 a(go0 go0Var, String str, String str2) {
        String str3 = go0Var.b;
        String str4 = go0Var.c;
        String str5 = go0Var.e;
        go0Var.getClass();
        str3.getClass();
        str4.getClass();
        str2.getClass();
        return new go0(str, str3, str4, str2, str5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof go0) {
                go0 go0Var = (go0) obj;
                if (!this.a.equals(go0Var.a) || !c16.i(this.b, go0Var.b) || !c16.i(this.c, go0Var.c) || !this.d.equals(go0Var.d) || !this.e.equals(go0Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Book(name=", this.a, ", cover=", this.b, ", path=");
        nk2.C(y, this.c, ", description=", this.d, ", tag=");
        return s21.q(y, this.e, ")");
    }
}
