package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oz7  reason: default package */
/* loaded from: classes.dex */
public final class oz7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public oz7(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
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
        if (obj == null || !(obj instanceof oz7)) {
            return false;
        }
        oz7 oz7Var = (oz7) obj;
        if (zl1.c(this.a, oz7Var.a) && zl1.c(this.d, oz7Var.d) && zl1.c(this.b, oz7Var.b) && zl1.c(this.e, oz7Var.e) && zl1.c(this.c, oz7Var.c) && zl1.c(this.f, oz7Var.f) && zl1.c(this.g, oz7Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.g) + hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.d, 31), this.b, 31), this.e, 31), this.c, 31), this.f, 31);
    }
}
