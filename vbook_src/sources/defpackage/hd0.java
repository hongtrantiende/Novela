package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hd0  reason: default package */
/* loaded from: classes.dex */
public final class hd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final kw5 f;

    public hd0(String str, String str2, String str3, String str4, int i, kw5 kw5Var) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        this.f = kw5Var;
                        return;
                    }
                    xk5.k("Null installUuid");
                    throw null;
                }
                xk5.k("Null versionName");
                throw null;
            }
            xk5.k("Null versionCode");
            throw null;
        }
        xk5.k("Null appIdentifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hd0) {
            hd0 hd0Var = (hd0) obj;
            if (this.a.equals(hd0Var.a) && this.b.equals(hd0Var.b) && this.c.equals(hd0Var.c) && this.d.equals(hd0Var.d) && this.e == hd0Var.e && this.f == hd0Var.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
