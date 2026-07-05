package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lk5  reason: default package */
/* loaded from: classes3.dex */
public final class lk5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public lk5(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final lk5 a(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        long j8;
        if (j != 16) {
            j5 = j;
        } else {
            j5 = this.a;
        }
        if (j2 != 16) {
            j6 = j2;
        } else {
            j6 = this.b;
        }
        if (j3 != 16) {
            j7 = j3;
        } else {
            j7 = this.c;
        }
        if (j4 != 16) {
            j8 = j4;
        } else {
            j8 = this.d;
        }
        return new lk5(j5, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lk5)) {
            return false;
        }
        lk5 lk5Var = (lk5) obj;
        if (zl1.c(this.a, lk5Var.a) && zl1.c(this.b, lk5Var.b) && zl1.c(this.c, lk5Var.c) && zl1.c(this.d, lk5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.d) + hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
