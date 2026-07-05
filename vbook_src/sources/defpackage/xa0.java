package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xa0  reason: default package */
/* loaded from: classes.dex */
public final class xa0 extends qa2 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final pa2 k;
    public final v92 l;
    public final s92 m;

    public xa0(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, pa2 pa2Var, v92 v92Var, s92 s92Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = pa2Var;
        this.l = v92Var;
        this.m = s92Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wa0, java.lang.Object] */
    public final wa0 a() {
        ?? obj = new Object();
        obj.a = this.b;
        obj.b = this.c;
        obj.c = this.d;
        obj.d = this.e;
        obj.e = this.f;
        obj.f = this.g;
        obj.g = this.h;
        obj.h = this.i;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qa2) {
            xa0 xa0Var = (xa0) ((qa2) obj);
            if (this.b.equals(xa0Var.b) && this.c.equals(xa0Var.c) && this.d == xa0Var.d && this.e.equals(xa0Var.e)) {
                String str = xa0Var.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = xa0Var.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = xa0Var.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(xa0Var.i) && this.j.equals(xa0Var.j)) {
                                pa2 pa2Var = xa0Var.k;
                                pa2 pa2Var2 = this.k;
                                if (pa2Var2 != null ? pa2Var2.equals(pa2Var) : pa2Var == null) {
                                    v92 v92Var = xa0Var.l;
                                    v92 v92Var2 = this.l;
                                    if (v92Var2 != null ? v92Var2.equals(v92Var) : v92Var == null) {
                                        s92 s92Var = xa0Var.m;
                                        s92 s92Var2 = this.m;
                                        if (s92Var2 != null ? s92Var2.equals(s92Var) : s92Var == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = 0;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i3 ^ hashCode3) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        pa2 pa2Var = this.k;
        if (pa2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = pa2Var.hashCode();
        }
        int i4 = (hashCode7 ^ hashCode4) * 1000003;
        v92 v92Var = this.l;
        if (v92Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = v92Var.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        s92 s92Var = this.m;
        if (s92Var != null) {
            i = s92Var.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
