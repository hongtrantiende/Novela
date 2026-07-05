package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xm2  reason: default package */
/* loaded from: classes3.dex */
public final class xm2 {
    public final String a;
    public final String b;
    public final int c;
    public final Map d;
    public final long e;
    public final long f;

    public xm2(String str, String str2, int i, Map map, long j, long j2) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = map;
        this.e = j;
        this.f = j2;
    }

    public static xm2 a(xm2 xm2Var, Map map) {
        String str = xm2Var.a;
        String str2 = xm2Var.b;
        int i = xm2Var.c;
        long j = xm2Var.e;
        long j2 = xm2Var.f;
        str.getClass();
        str2.getClass();
        return new xm2(str, str2, i, map, j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm2)) {
            return false;
        }
        xm2 xm2Var = (xm2) obj;
        if (c16.i(this.a, xm2Var.a) && c16.i(this.b, xm2Var.b) && this.c == xm2Var.c && c16.i(this.d, xm2Var.d) && this.e == xm2Var.e && this.f == xm2Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + hl5.c(rs8.a(hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbContent(id=", this.a, ", bookId=", this.b, ", position=");
        y.append(this.c);
        y.append(", content=");
        y.append(this.d);
        y.append(", createAt=");
        y.append(this.e);
        return a82.n(y, ", updateAt=", this.f, ")");
    }
}
