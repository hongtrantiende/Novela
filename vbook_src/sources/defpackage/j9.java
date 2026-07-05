package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j9  reason: default package */
/* loaded from: classes3.dex */
public final class j9 implements l9 {
    public final long a;
    public final long b;

    public j9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final float a() {
        long j = this.b;
        if (j > 0) {
            return ((float) this.a) / ((float) j);
        }
        return nae.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9)) {
            return false;
        }
        j9 j9Var = (j9) obj;
        if (this.a == j9Var.a && this.b == j9Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.q(rs8.o(this.a, "InProgress(downloaded=", ", total="), this.b, ")");
    }
}
