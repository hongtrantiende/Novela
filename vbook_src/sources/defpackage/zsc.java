package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zsc  reason: default package */
/* loaded from: classes.dex */
public final class zsc {
    public final eo4 a;
    public final dq4 b;
    public final int c;
    public final int d;
    public final Object e;

    public zsc(eo4 eo4Var, dq4 dq4Var, int i, int i2, Object obj) {
        this.a = eo4Var;
        this.b = dq4Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsc)) {
            return false;
        }
        zsc zscVar = (zsc) obj;
        if (c16.i(this.a, zscVar.a) && c16.i(this.b, zscVar.b) && this.c == zscVar.c && this.d == zscVar.d && c16.i(this.e, zscVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        eo4 eo4Var = this.a;
        if (eo4Var == null) {
            hashCode = 0;
        } else {
            hashCode = eo4Var.hashCode();
        }
        int a = hl5.a(this.d, hl5.a(this.c, ((hashCode * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else if (i != 1) {
            str = "Invalid";
        } else {
            str = "Italic";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        nk2.C(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
