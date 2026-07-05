package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lp2  reason: default package */
/* loaded from: classes3.dex */
public final class lp2 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public lp2(String str, long j, long j2, long j3) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp2)) {
            return false;
        }
        lp2 lp2Var = (lp2) obj;
        if (c16.i(this.a, lp2Var.a) && this.b == lp2Var.b && this.c == lp2Var.c && this.d == lp2Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(hl5.c(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbReadHistory(id=");
        sb.append(this.a);
        sb.append(", readTime=");
        sb.append(this.b);
        rs8.x(sb, ", listenTime=", this.c, ", createAt=");
        return hl5.q(sb, this.d, ")");
    }
}
