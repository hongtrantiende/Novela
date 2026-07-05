package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: by4  reason: default package */
/* loaded from: classes3.dex */
public final class by4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public by4(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by4)) {
            return false;
        }
        by4 by4Var = (by4) obj;
        if (this.a == by4Var.a && this.b == by4Var.b && this.c == by4Var.c && this.d == by4Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = rs8.o(this.a, "GetStatisticSummary(totalBooks=", ", totalChapters=");
        o.append(this.b);
        rs8.x(o, ", totalReadTime=", this.c, ", totalListenedTime=");
        return hl5.q(o, this.d, ")");
    }
}
