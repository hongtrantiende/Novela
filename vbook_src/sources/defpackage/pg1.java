package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pg1  reason: default package */
/* loaded from: classes.dex */
public final class pg1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    public pg1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public static lf4 a(rbc rbcVar, rv4 rv4Var) {
        if (rbcVar == rbc.b) {
            rv4Var.e0(1539238463);
            lf4 y = kqe.y(ur7.d, rv4Var);
            rv4Var.q(false);
            return y;
        }
        rv4Var.e0(1539331773);
        lf4 y2 = kqe.y(ur7.c, rv4Var);
        rv4Var.q(false);
        return y2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pg1)) {
            return false;
        }
        pg1 pg1Var = (pg1) obj;
        if (zl1.c(this.a, pg1Var.a) && zl1.c(this.b, pg1Var.b) && zl1.c(this.m, pg1Var.m) && zl1.c(this.c, pg1Var.c) && zl1.c(this.d, pg1Var.d) && zl1.c(this.e, pg1Var.e) && zl1.c(this.f, pg1Var.f) && zl1.c(this.g, pg1Var.g) && zl1.c(this.h, pg1Var.h) && zl1.c(this.i, pg1Var.i) && zl1.c(this.j, pg1Var.j) && zl1.c(this.k, pg1Var.k) && zl1.c(this.l, pg1Var.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.l) + hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.m, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31);
    }
}
