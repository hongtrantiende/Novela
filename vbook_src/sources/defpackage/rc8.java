package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: rc8  reason: default package */
/* loaded from: classes3.dex */
public final class rc8 {
    public static final qc8 Companion = new Object();
    public static final ye6[] j = {null, null, null, null, null, ipe.x(sk6.b, new rh7(29)), null, null, null};
    public final String a;
    public ht3 b;
    public String c;
    public String d;
    public String e;
    public qk1 f;
    public String g;
    public final String h;
    public final boolean i;

    public /* synthetic */ rc8(int i, String str, ht3 ht3Var, String str2, String str3, String str4, qk1 qk1Var, String str5, String str6, boolean z) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ht3Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = qk1.S256;
        } else {
            this.f = qk1Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & Token.CASE) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ht3, java.lang.Object] */
    public final void a(vc8 vc8Var) {
        vc8Var.getClass();
        ht3 ht3Var = this.b;
        String str = null;
        ht3 ht3Var2 = ht3Var;
        if (ht3Var == null) {
            ?? obj = new Object();
            obj.a = null;
            obj.b = null;
            obj.c = null;
            obj.d = null;
            obj.e = null;
            ht3Var2 = obj;
        }
        String str2 = ht3Var2.b;
        if (str2 == null) {
            str2 = vc8Var.a;
        }
        ht3Var2.b = str2;
        String str3 = ht3Var2.a;
        if (str3 == null) {
            str3 = vc8Var.b;
        }
        ht3Var2.a = str3;
        String str4 = ht3Var2.d;
        if (str4 == null) {
            str4 = vc8Var.e;
        }
        ht3Var2.d = str4;
        String str5 = ht3Var2.c;
        if (str5 == null) {
            str5 = vc8Var.d;
        }
        ht3Var2.c = str5;
        String str6 = ht3Var2.e;
        if (str6 == null) {
            str6 = vc8Var.g;
        }
        ht3Var2.e = str6;
        this.b = ht3Var2;
        String str7 = this.e;
        if (str7 == null) {
            List list = vc8Var.m;
            if (list != null) {
                str = sl1.i0(list, " ", null, null, null, 62);
            }
        } else {
            str = str7;
        }
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc8)) {
            return false;
        }
        rc8 rc8Var = (rc8) obj;
        if (c16.i(this.a, rc8Var.a) && c16.i(this.b, rc8Var.b) && c16.i(this.c, rc8Var.c) && c16.i(this.d, rc8Var.d) && c16.i(this.e, rc8Var.e) && this.f == rc8Var.f && c16.i(this.g, rc8Var.g) && c16.i(this.h, rc8Var.h) && this.i == rc8Var.i) {
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
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        ht3 ht3Var = this.b;
        if (ht3Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ht3Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int hashCode7 = (this.f.hashCode() + ((i5 + hashCode5) * 31)) * 31;
        String str5 = this.g;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i6 = (hashCode7 + hashCode6) * 31;
        String str6 = this.h;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return Boolean.hashCode(this.i) + ((i6 + i) * 31);
    }

    public final String toString() {
        ht3 ht3Var = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        qk1 qk1Var = this.f;
        String str4 = this.g;
        StringBuilder sb = new StringBuilder("OpenIdConnectClientConfig(discoveryUri=");
        sb.append(this.a);
        sb.append(", endpoints=");
        sb.append(ht3Var);
        sb.append(", clientId=");
        nk2.C(sb, str, ", clientSecret=", str2, ", scope=");
        sb.append(str3);
        sb.append(", codeChallengeMethod=");
        sb.append(qk1Var);
        sb.append(", redirectUri=");
        nk2.C(sb, str4, ", postLogoutRedirectUri=", this.h, ", disableNonce=");
        return rs8.m(")", sb, this.i);
    }

    public rc8() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = qk1.S256;
        this.g = null;
        this.h = null;
        this.i = false;
    }
}
