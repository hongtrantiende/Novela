package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: vc8  reason: default package */
/* loaded from: classes3.dex */
public final class vc8 {
    public static final uc8 Companion = new Object();
    public static final ye6[] s;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final List k;
    public final Boolean l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uc8] */
    static {
        sc8 sc8Var = new sc8(0);
        sk6 sk6Var = sk6.b;
        s = new ye6[]{null, null, null, null, null, null, null, null, null, ipe.x(sk6Var, sc8Var), ipe.x(sk6Var, new sc8(1)), null, ipe.x(sk6Var, new sc8(2)), ipe.x(sk6Var, new sc8(3)), ipe.x(sk6Var, new sc8(4)), ipe.x(sk6Var, new sc8(5)), ipe.x(sk6Var, new sc8(6)), ipe.x(sk6Var, new sc8(7))};
    }

    public /* synthetic */ vc8(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, Boolean bool, List list3, List list4, List list5, List list6, List list7, List list8) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & Token.CASE) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list5;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = list6;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = list7;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = list8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc8)) {
            return false;
        }
        vc8 vc8Var = (vc8) obj;
        if (c16.i(this.a, vc8Var.a) && c16.i(this.b, vc8Var.b) && c16.i(this.c, vc8Var.c) && c16.i(this.d, vc8Var.d) && c16.i(this.e, vc8Var.e) && c16.i(this.f, vc8Var.f) && c16.i(this.g, vc8Var.g) && c16.i(this.h, vc8Var.h) && c16.i(this.i, vc8Var.i) && c16.i(this.j, vc8Var.j) && c16.i(this.k, vc8Var.k) && c16.i(this.l, vc8Var.l) && c16.i(this.m, vc8Var.m) && c16.i(this.n, vc8Var.n) && c16.i(this.o, vc8Var.o) && c16.i(this.p, vc8Var.p) && c16.i(this.q, vc8Var.q) && c16.i(this.r, vc8Var.r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int i = 0;
        String str = this.a;
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
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.h;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str9 = this.i;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        List list = this.j;
        if (list == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        List list2 = this.k;
        if (list2 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list2.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Boolean bool = this.l;
        if (bool == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        List list3 = this.m;
        if (list3 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = list3.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        List list4 = this.n;
        if (list4 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = list4.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        List list5 = this.o;
        if (list5 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = list5.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        List list6 = this.p;
        if (list6 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = list6.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        List list7 = this.q;
        if (list7 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = list7.hashCode();
        }
        int i18 = (i17 + hashCode17) * 31;
        List list8 = this.r;
        if (list8 != null) {
            i = list8.hashCode();
        }
        return i18 + i;
    }

    public final String toString() {
        StringBuilder y = nk2.y("OpenIdConnectConfiguration(authorization_endpoint=", this.a, ", token_endpoint=", this.b, ", device_authorization_endpoint=");
        nk2.C(y, this.c, ", userinfo_endpoint=", this.d, ", end_session_endpoint=");
        nk2.C(y, this.e, ", introspection_endpoint=", this.f, ", revocation_endpoint=");
        nk2.C(y, this.g, ", issuer=", this.h, ", jwks_uri=");
        y.append(this.i);
        y.append(", response_types_supported=");
        y.append(this.j);
        y.append(", id_token_signing_alg_values_supported=");
        y.append(this.k);
        y.append(", frontchannel_logout_supported=");
        y.append(this.l);
        y.append(", scopes_supported=");
        y.append(this.m);
        y.append(", claims_supported=");
        y.append(this.n);
        y.append(", subject_types_supported=");
        y.append(this.o);
        y.append(", token_endpoint_auth_methods_supported=");
        y.append(this.p);
        y.append(", grant_types_supported=");
        y.append(this.q);
        y.append(", introspection_endpoint_auth_methods_supported=");
        y.append(this.r);
        y.append(")");
        return y.toString();
    }
}
