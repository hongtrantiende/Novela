package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ys7  reason: default package */
/* loaded from: classes.dex */
public final class ys7 implements rb7 {
    public final long a;
    public final long b;
    public final long c;

    public ys7(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys7)) {
            return false;
        }
        ys7 ys7Var = (ys7) obj;
        if (this.a == ys7Var.a && this.b == ys7Var.b && this.c == ys7Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int m = axe.m(this.b);
        return axe.m(this.c) + ((m + ((axe.m(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
