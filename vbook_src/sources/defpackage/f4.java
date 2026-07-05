package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: f4  reason: default package */
/* loaded from: classes3.dex */
public final class f4 {
    public static final e4 Companion = new Object();
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final String f;
    public final String g;
    public final long h;

    public f4(int i, String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, long j) {
        if (1 == (i & 1)) {
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = num2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str4;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str5;
            }
            if ((i & Token.CASE) == 0) {
                this.h = by5.a.k().a;
                return;
            } else {
                this.h = j;
                return;
            }
        }
        w92.x(i, 1, d4.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        if (c16.i(this.a, f4Var.a) && c16.i(this.b, f4Var.b) && c16.i(this.c, f4Var.c) && c16.i(this.d, f4Var.d) && c16.i(this.e, f4Var.e) && c16.i(this.f, f4Var.f) && c16.i(this.g, f4Var.g) && this.h == f4Var.h) {
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
        int hashCode6 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num2 = this.e;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str3 = this.f;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return Long.hashCode(this.h) + ((i6 + i) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("AccessTokenResponse(access_token=", this.a, ", token_type=", this.b, ", expires_in=");
        y.append(this.c);
        y.append(", refresh_token=");
        y.append(this.d);
        y.append(", refresh_token_expires_in=");
        y.append(this.e);
        y.append(", id_token=");
        y.append(this.f);
        y.append(", scope=");
        y.append(this.g);
        y.append(", received_at=");
        y.append(this.h);
        y.append(")");
        return y.toString();
    }
}
