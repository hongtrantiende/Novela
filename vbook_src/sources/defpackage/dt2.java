package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dt2  reason: default package */
/* loaded from: classes.dex */
public final class dt2 {
    public final tz0 a;
    public final tp9 b;
    public final mi0 c;
    public final pf2 d;
    public final long e;
    public final long f;

    public dt2(long j, tp9 tp9Var, mi0 mi0Var, tz0 tz0Var, long j2, pf2 pf2Var) {
        this.e = j;
        this.b = tp9Var;
        this.c = mi0Var;
        this.f = j2;
        this.a = tz0Var;
        this.d = pf2Var;
    }

    public final dt2 a(long j, tp9 tp9Var) {
        long r;
        long r2;
        pf2 d = this.b.d();
        pf2 d2 = tp9Var.d();
        if (d == null) {
            return new dt2(j, tp9Var, this.c, this.a, this.f, d);
        } else if (!d.w()) {
            return new dt2(j, tp9Var, this.c, this.a, this.f, d2);
        } else {
            long B = d.B(j);
            if (B == 0) {
                return new dt2(j, tp9Var, this.c, this.a, this.f, d2);
            }
            d2.getClass();
            long z = d.z();
            long b = d.b(z);
            long j2 = B + z;
            long j3 = j2 - 1;
            long c = d.c(j3, j) + d.b(j3);
            long z2 = d2.z();
            long b2 = d2.b(z2);
            int i = (c > b2 ? 1 : (c == b2 ? 0 : -1));
            long j4 = this.f;
            if (i == 0) {
                r = j2 - z2;
            } else if (i >= 0) {
                if (b2 < b) {
                    r2 = j4 - (d2.r(b, j) - z);
                    return new dt2(j, tp9Var, this.c, this.a, r2, d2);
                }
                r = d.r(b2, j) - z2;
            } else {
                throw new IOException();
            }
            r2 = r + j4;
            return new dt2(j, tp9Var, this.c, this.a, r2, d2);
        }
    }

    public final long b(long j) {
        pf2 pf2Var = this.d;
        pf2Var.getClass();
        long j2 = this.e;
        pf2Var.getClass();
        return (pf2Var.C(j2, j) + (pf2Var.g(j2, j) + this.f)) - 1;
    }

    public final long c() {
        pf2 pf2Var = this.d;
        pf2Var.getClass();
        return pf2Var.B(this.e);
    }

    public final long d(long j) {
        long e = e(j);
        pf2 pf2Var = this.d;
        pf2Var.getClass();
        return pf2Var.c(j - this.f, this.e) + e;
    }

    public final long e(long j) {
        pf2 pf2Var = this.d;
        pf2Var.getClass();
        return pf2Var.b(j - this.f);
    }

    public final boolean f(long j, long j2) {
        pf2 pf2Var = this.d;
        pf2Var.getClass();
        if (!pf2Var.w() && j2 != -9223372036854775807L && d(j) > j2) {
            return false;
        }
        return true;
    }
}
