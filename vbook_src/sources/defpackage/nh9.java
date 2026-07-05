package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nh9  reason: default package */
/* loaded from: classes3.dex */
public final class nh9 {
    public final long a;
    public final long b;
    public final long c;

    public nh9(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh9)) {
            return false;
        }
        nh9 nh9Var = (nh9) obj;
        if (this.a == nh9Var.a && this.b == nh9Var.b && this.c == nh9Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + hl5.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = rs8.o(this.a, "ReadHistoryStatistic(readTime=", ", listenTime=");
        o.append(this.b);
        return a82.n(o, ", createAt=", this.c, ")");
    }
}
