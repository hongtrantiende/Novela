package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q18  reason: default package */
/* loaded from: classes3.dex */
public final class q18 {
    public final String a;
    public final String b;
    public final String c;

    public q18(String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q18) {
            q18 q18Var = (q18) obj;
            if (c16.i(this.a, q18Var.a) && c16.i(this.b, q18Var.b) && c16.i(this.c, q18Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(100L) + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return s21.q(nk2.y("NetworkFont(name=", this.a, ", path=", this.b, ", preview="), this.c, ", size=100)");
    }
}
