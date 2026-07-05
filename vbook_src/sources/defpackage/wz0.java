package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wz0  reason: default package */
/* loaded from: classes.dex */
public final class wz0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public wz0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final wz0 a(long j, long j2, long j3, long j4) {
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
        return new wz0(j5, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wz0)) {
            return false;
        }
        wz0 wz0Var = (wz0) obj;
        if (zl1.c(this.a, wz0Var.a) && zl1.c(this.b, wz0Var.b) && zl1.c(this.c, wz0Var.c) && zl1.c(this.d, wz0Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.d) + hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
