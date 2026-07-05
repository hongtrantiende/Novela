package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qu9  reason: default package */
/* loaded from: classes.dex */
public final class qu9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final float h;
    public long i;

    public qu9(long j, long j2, long j3, x72 x72Var) {
        float f;
        this.a = j;
        this.b = j2;
        this.c = j3;
        long l = nc2.l(j, j2);
        long l2 = nc2.l(j3, j2);
        float h = nc2.h(l);
        float h2 = nc2.h(l2);
        if (h > nae.e && h2 > nae.e) {
            long e = nc2.e(h, l);
            this.d = e;
            long e2 = nc2.e(h2, l2);
            this.e = e2;
            float f2 = x72Var.a;
            this.f = f2;
            this.g = x72Var.b;
            float f3 = nc2.f(e, e2);
            float f4 = d2d.b;
            float sqrt = (float) Math.sqrt(1.0f - (f3 * f3));
            if (sqrt > 0.001d) {
                f = ((f3 + 1.0f) * f2) / sqrt;
            } else {
                f = 0.0f;
            }
            this.h = f;
        } else {
            this.d = wi4.a(nae.e, nae.e);
            this.e = wi4.a(nae.e, nae.e);
            this.f = nae.e;
            this.g = nae.e;
            this.h = nae.e;
        }
        this.i = wi4.a(nae.e, nae.e);
    }

    public static qd2 b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        long j6;
        long l = nc2.l(j2, j);
        float h = nc2.h(l);
        wi4 wi4Var = null;
        if (h > nae.e) {
            long e = nc2.e(h, l);
            long m = nc2.m(j, nc2.p(1.0f + f2, nc2.p(f, e)));
            long e2 = nc2.e(2.0f, nc2.m(j3, j4));
            long a = wi4.a(d2d.b(nc2.i(j3), nc2.i(e2), f2), d2d.b(nc2.j(j3), nc2.j(e2), f2));
            long m2 = nc2.m(j5, nc2.p(f3, d2d.a(nc2.i(a) - nc2.i(j5), nc2.j(a) - nc2.j(j5))));
            long l2 = nc2.l(m2, j5);
            long a2 = wi4.a(-nc2.j(l2), nc2.i(l2));
            long a3 = wi4.a(-nc2.j(a2), nc2.i(a2));
            float f4 = nc2.f(e, a3);
            if (Math.abs(f4) >= 1.0E-4f) {
                float f5 = nc2.f(nc2.l(m2, j2), a3);
                if (Math.abs(f4) >= Math.abs(f5) * 1.0E-4f) {
                    wi4Var = new wi4(nc2.m(j2, nc2.p(f5 / f4, e)));
                }
            }
            if (wi4Var != null) {
                j6 = wi4Var.a;
            } else {
                j6 = j3;
            }
            long e3 = nc2.e(3.0f, nc2.m(m, nc2.p(2.0f, j6)));
            return new qd2(new float[]{nc2.i(m), nc2.j(m), nc2.i(e3), nc2.j(e3), nc2.i(j6), nc2.j(j6), nc2.i(m2), nc2.j(m2)});
        }
        vs.m("Can't get the direction of a 0-length vector");
        return null;
    }

    public final float a(float f) {
        int i = (f > c() ? 1 : (f == c() ? 0 : -1));
        float f2 = this.g;
        if (i > 0) {
            return f2;
        }
        float f3 = this.h;
        if (f > f3) {
            return ((f - f3) * f2) / (c() - f3);
        }
        return nae.e;
    }

    public final float c() {
        return (1.0f + this.g) * this.h;
    }
}
