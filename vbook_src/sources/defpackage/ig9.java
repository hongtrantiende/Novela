package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ig9  reason: default package */
/* loaded from: classes.dex */
public final class ig9 implements yl1 {
    public static final hg9 f = new hg9();
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final lg9 e;

    public ig9(float f2, float f3, float f4, float f5, lg9 lg9Var) {
        lg9Var.getClass();
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = lg9Var;
    }

    @Override // defpackage.yl1
    public final iod a() {
        lg9 lg9Var = this.e;
        kg9 e = lg9Var.e();
        float[] a = lg9Var.a();
        a.getClass();
        float c = e.c(this.a);
        float c2 = e.c(this.b);
        float c3 = e.c(this.c);
        float f2 = (a[2] * c3) + (a[1] * c2) + (a[0] * c);
        float f3 = (a[5] * c3) + (a[4] * c2) + (a[3] * c);
        float f4 = a[6] * c;
        float f5 = a[8] * c3;
        jod j = jxe.j(lg9Var.d());
        j.getClass();
        return new iod(f2, f3, f5 + (a[7] * c2) + f4, this.d, j);
    }

    @Override // defpackage.yl1
    public final ig9 b() {
        return c(ng9.a);
    }

    public final ig9 c(lg9 lg9Var) {
        lg9Var.getClass();
        jw9 jw9Var = jw9.b;
        kg9 kg9Var = jw9Var.a.c;
        lg9 lg9Var2 = this.e;
        if (c16.i(lg9Var2, lg9Var)) {
            return this;
        }
        boolean i = c16.i(lg9Var2, jw9Var);
        float f2 = this.d;
        float f3 = this.c;
        float f4 = this.b;
        float f5 = this.a;
        if (i && lg9Var.equals(ng9.b)) {
            return lg9Var.c(kg9Var.c(f5), kg9Var.c(f4), kg9Var.c(f3), f2);
        }
        if (c16.i(lg9Var2, ng9.b) && lg9Var.equals(jw9Var)) {
            return lg9Var.c(kg9Var.h(f5), kg9Var.h(f4), kg9Var.h(f3), f2);
        }
        return a().c(lg9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig9)) {
            return false;
        }
        ig9 ig9Var = (ig9) obj;
        if (Float.compare(this.a, ig9Var.a) == 0 && Float.compare(this.b, ig9Var.b) == 0 && Float.compare(this.c, ig9Var.c) == 0 && Float.compare(this.d, ig9Var.d) == 0 && c16.i(this.e, ig9Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RGB(r=" + this.a + ", g=" + this.b + ", b=" + this.c + ", alpha=" + this.d + ", space=" + this.e + ')';
    }
}
