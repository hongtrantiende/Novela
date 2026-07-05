package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ht3  reason: default package */
/* loaded from: classes3.dex */
public final class ht3 {
    public static final gt3 Companion = new Object();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht3)) {
            return false;
        }
        ht3 ht3Var = (ht3) obj;
        if (c16.i(this.a, ht3Var.a) && c16.i(this.b, ht3Var.b) && c16.i(this.c, ht3Var.c) && c16.i(this.d, ht3Var.d) && c16.i(this.e, ht3Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        StringBuilder y = nk2.y("Endpoints(tokenEndpoint=", str, ", authorizationEndpoint=", str2, ", userInfoEndpoint=");
        nk2.C(y, str3, ", endSessionEndpoint=", str4, ", revocationEndpoint=");
        return s21.q(y, str5, ")");
    }
}
