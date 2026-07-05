package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kd3  reason: default package */
/* loaded from: classes3.dex */
public final class kd3 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public kd3(String str, boolean z, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static kd3 a(kd3 kd3Var, String str, String str2, boolean z, int i) {
        String str3 = kd3Var.a;
        if ((i & 2) != 0) {
            str = kd3Var.b;
        }
        if ((i & 4) != 0) {
            str2 = kd3Var.c;
        }
        if ((i & 8) != 0) {
            z = kd3Var.d;
        }
        kd3Var.getClass();
        str3.getClass();
        str.getClass();
        str2.getClass();
        return new kd3(str3, z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd3)) {
            return false;
        }
        kd3 kd3Var = (kd3) obj;
        if (c16.i(this.a, kd3Var.a) && c16.i(this.b, kd3Var.b) && c16.i(this.c, kd3Var.c) && this.d == kd3Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DomainOverride(id=", this.a, ", domain=", this.b, ", replace=");
        y.append(this.c);
        y.append(", enabled=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
