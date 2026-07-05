package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lea  reason: default package */
/* loaded from: classes.dex */
public final class lea {
    public final float a;
    public final float b;
    public final long c;
    public final int d;
    public final long e;
    public final hy0 f;
    public final float g;

    public lea(float f, float f2, long j, long j2, hy0 hy0Var, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
        if (hy0Var instanceof esa) {
            this.e = ((esa) hy0Var).a;
            this.f = null;
        } else {
            this.e = j2;
            this.f = hy0Var;
        }
        this.g = dce.m(f3, nae.e, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lea) {
                lea leaVar = (lea) obj;
                if (rg3.b(this.a, leaVar.a) && rg3.b(this.b, leaVar.b) && this.c == leaVar.c && this.g == leaVar.g && this.d == leaVar.d && zl1.c(this.e, leaVar.e) && c16.i(this.f, leaVar.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int a = hl5.a(this.d, nk2.d(this.g, hl5.c(nk2.d(this.b, Float.hashCode(this.a) * 31, 31), this.c, 31), 31), 31);
        int i2 = zl1.j;
        int c = hl5.c(a, this.e, 31);
        hy0 hy0Var = this.f;
        if (hy0Var != null) {
            i = hy0Var.hashCode();
        } else {
            i = 0;
        }
        return c + i;
    }

    public final String toString() {
        String c = rg3.c(this.a);
        String c2 = rg3.c(this.b);
        String c3 = tg3.c(this.c);
        String a = vl0.a(this.d);
        String i = zl1.i(this.e);
        StringBuilder y = nk2.y("Shadow(radius=", c, ", spread=", c2, ", offset=");
        y.append(c3);
        y.append(", alpha=");
        y.append(this.g);
        y.append(", blendMode=");
        nk2.C(y, a, ", color=", i, ", brush=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }

    public lea(float f, long j, float f2, long j2, float f3, int i) {
        this(f, f2, j2, j == 16 ? zl1.b : j, null, f3, i);
    }

    public lea(long j, long j2) {
        this(12.0f, j, nae.e, j2, 1.0f, 3);
    }
}
