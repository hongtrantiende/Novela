package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uv3  reason: default package */
/* loaded from: classes.dex */
public final class uv3 {
    public final String a;
    public final String b;
    public final String c;

    public uv3(String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv3)) {
            return false;
        }
        uv3 uv3Var = (uv3) obj;
        if (c16.i(this.a, uv3Var.a) && c16.i(this.b, uv3Var.b) && c16.i(this.c, uv3Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("EpubItemRef(id=", this.a, ", href=", this.b, ", mediaType="), this.c, ")");
    }
}
