package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k08  reason: default package */
/* loaded from: classes3.dex */
public final class k08 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public k08(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k08)) {
            return false;
        }
        k08 k08Var = (k08) obj;
        if (zl1.c(this.a, k08Var.a) && zl1.c(this.d, k08Var.d) && zl1.c(this.b, k08Var.b) && zl1.c(this.e, k08Var.e) && zl1.c(this.c, k08Var.c) && zl1.c(this.f, k08Var.f) && zl1.c(this.g, k08Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.g) + hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.d, 31), this.b, 31), this.e, 31), this.c, 31), this.f, 31);
    }
}
