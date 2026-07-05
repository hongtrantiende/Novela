package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: dp0  reason: default package */
/* loaded from: classes3.dex */
public final class dp0 implements lz7 {
    public static final cp0 Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ dp0(String str, String str2, int i, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        w92.x(i, 7, bp0.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp0)) {
            return false;
        }
        dp0 dp0Var = (dp0) obj;
        if (c16.i(this.a, dp0Var.a) && c16.i(this.b, dp0Var.b) && c16.i(this.c, dp0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("BookListRoute(extensionId=", this.a, ", name=", this.b, ", data="), this.c, ")");
    }

    public dp0(String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
