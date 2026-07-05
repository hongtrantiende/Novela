package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xo2  reason: default package */
/* loaded from: classes3.dex */
public final class xo2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;

    public xo2(String str, String str2, String str3, String str4, long j, long j2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo2)) {
            return false;
        }
        xo2 xo2Var = (xo2) obj;
        if (c16.i(this.a, xo2Var.a) && c16.i(this.b, xo2Var.b) && c16.i(this.c, xo2Var.c) && c16.i(this.d, xo2Var.d) && this.e == xo2Var.e && this.f == xo2Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (j + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Long.hashCode(this.f) + hl5.c((i2 + i) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbQtDictionary(id=", this.a, ", name=", this.b, ", nameDictionary=");
        nk2.C(y, this.c, ", vpDictionary=", this.d, ", createAt=");
        y.append(this.e);
        return a82.n(y, ", updateAt=", this.f, ")");
    }
}
