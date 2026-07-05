package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: sw3  reason: default package */
/* loaded from: classes3.dex */
public final class sw3 {
    public static final pw3 Companion = new Object();
    public static final ye6[] e = {ipe.x(sk6.b, new qk3(24)), null, null, null};
    public final rw3 a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ sw3(int i, rw3 rw3Var, String str, String str2, String str3) {
        if (15 == (i & 15)) {
            this.a = rw3Var;
            this.b = str;
            this.c = str2;
            this.d = str3;
            return;
        }
        w92.x(i, 15, ow3.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw3)) {
            return false;
        }
        sw3 sw3Var = (sw3) obj;
        if (this.a == sw3Var.a && c16.i(this.b, sw3Var.b) && c16.i(this.c, sw3Var.c) && c16.i(this.d, sw3Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorResponse(error=");
        sb.append(this.a);
        sb.append(", error_description=");
        sb.append(this.b);
        sb.append(", error_uri=");
        return nk2.w(sb, this.c, ", state=", this.d, ")");
    }
}
