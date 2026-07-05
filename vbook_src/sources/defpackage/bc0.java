package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bc0  reason: default package */
/* loaded from: classes.dex */
public final class bc0 extends ka2 {
    public final ja2 a;
    public final String b;
    public final String c;
    public final long d;

    public bc0(cc0 cc0Var, String str, String str2, long j) {
        this.a = cc0Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ka2) {
            bc0 bc0Var = (bc0) ((ka2) obj);
            if (this.a.equals(bc0Var.a) && this.b.equals(bc0Var.b) && this.c.equals(bc0Var.c) && this.d == bc0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return hl5.q(sb, this.d, "}");
    }
}
