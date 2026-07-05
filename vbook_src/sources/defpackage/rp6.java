package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rp6  reason: default package */
/* loaded from: classes3.dex */
public final class rp6 {
    public final String a;
    public final String b;
    public final String c;
    public final zp6 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public rp6(String str, String str2, String str3, zp6 zp6Var, String str4, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zp6Var;
        this.e = str4;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp6)) {
            return false;
        }
        rp6 rp6Var = (rp6) obj;
        if (c16.i(this.a, rp6Var.a) && c16.i(this.b, rp6Var.b) && c16.i(this.c, rp6Var.c) && this.d == rp6Var.d && c16.i(this.e, rp6Var.e) && this.f == rp6Var.f && this.g == rp6Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (j + hashCode) * 31;
        zp6 zp6Var = this.d;
        if (zp6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = zp6Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Boolean.hashCode(this.g) + eub.k((i3 + i) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder y = nk2.y("LinkPopupState(title=", this.a, ", url=", this.b, ", normalizedUrl=");
        y.append(this.c);
        y.append(", validationError=");
        y.append(this.d);
        y.append(", existingUrl=");
        rs8.y(y, this.e, ", canApply=", this.f, ", canRemove=");
        return rs8.m(")", y, this.g);
    }
}
