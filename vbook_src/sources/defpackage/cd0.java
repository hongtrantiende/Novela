package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cd0  reason: default package */
/* loaded from: classes.dex */
public final class cd0 extends yt9 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public cd0(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.d = str3;
                if (str4 != null) {
                    this.e = str4;
                    this.f = j;
                    return;
                }
                xk5.k("Null variantId");
                throw null;
            }
            xk5.k("Null parameterKey");
            throw null;
        }
        xk5.k("Null rolloutId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof yt9) {
                cd0 cd0Var = (cd0) ((yt9) obj);
                if (this.b.equals(cd0Var.b) && this.c.equals(cd0Var.c) && this.d.equals(cd0Var.d) && this.e.equals(cd0Var.e) && this.f == cd0Var.f) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return hl5.q(sb, this.f, "}");
    }
}
