package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ho0  reason: default package */
/* loaded from: classes3.dex */
public final class ho0 {
    public final String a;
    public final String b;
    public final String c;

    public ho0(String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho0)) {
            return false;
        }
        ho0 ho0Var = (ho0) obj;
        if (c16.i(this.a, ho0Var.a) && c16.i(this.b, ho0Var.b) && c16.i(this.c, ho0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("BookCover(bookId=", this.a, ", cover=", this.b, ", source="), this.c, ")");
    }
}
