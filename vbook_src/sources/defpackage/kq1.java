package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: kq1  reason: default package */
/* loaded from: classes3.dex */
public final class kq1 implements lz7 {
    public static final jq1 Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ kq1(String str, String str2, int i, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        w92.x(i, 7, iq1.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq1)) {
            return false;
        }
        kq1 kq1Var = (kq1) obj;
        if (c16.i(this.a, kq1Var.a) && c16.i(this.b, kq1Var.b) && c16.i(this.c, kq1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("CommentRoute(extensionId=", this.a, ", name=", this.b, ", data="), this.c, ")");
    }

    public kq1(String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
