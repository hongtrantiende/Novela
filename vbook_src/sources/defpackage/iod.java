package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iod  reason: default package */
/* loaded from: classes.dex */
public final class iod implements yl1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final jod e;

    static {
        jod jodVar = kod.a;
    }

    public iod(float f, float f2, float f3, float f4, jod jodVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = jodVar;
    }

    @Override // defpackage.yl1
    public final ig9 b() {
        return c(ng9.a);
    }

    public final ig9 c(lg9 lg9Var) {
        char c;
        char c2;
        iod iodVar;
        char c3;
        lg9Var.getClass();
        jod j = jxe.j(lg9Var.d());
        j.getClass();
        float[] fArr = j02.a;
        float[] fArr2 = j02.b;
        gid gidVar = j.a;
        gid gidVar2 = this.e.a;
        if (c16.i(gidVar, gidVar2)) {
            iodVar = this;
            c3 = 0;
            c = '\b';
            c2 = 7;
        } else {
            fud fudVar = gidVar2.b;
            fArr2.getClass();
            fud fudVar2 = gidVar.b;
            float f = fudVar.a;
            c = '\b';
            float f2 = fudVar.c;
            c2 = 7;
            float[] r = nye.r((f * f2) / fudVar.b, f2, fudVar.a(), fArr);
            float f3 = fudVar2.a;
            float f4 = fudVar2.c;
            float[] r2 = nye.r((f3 * f4) / fudVar2.b, f4, fudVar2.a(), fArr);
            float[] s = nye.s(r2[0] / r[0], r2[1] / r[1], r2[2] / r[2], fArr2);
            float[] fArr3 = {nye.t(0, 0, s, fArr), nye.t(1, 0, s, fArr), nye.t(2, 0, s, fArr), nye.t(0, 1, s, fArr), nye.t(1, 1, s, fArr), nye.t(2, 1, s, fArr), nye.t(0, 2, s, fArr), nye.t(1, 2, s, fArr), nye.t(2, 2, s, fArr)};
            float f5 = fArr3[0];
            float f6 = this.a;
            float f7 = fArr3[1];
            float f8 = this.b;
            float f9 = (f7 * f8) + (f5 * f6);
            float f10 = fArr3[2];
            float f11 = this.c;
            c3 = 0;
            iodVar = new iod((f10 * f11) + f9, (fArr3[5] * f11) + (fArr3[4] * f8) + (fArr3[3] * f6), (fArr3[8] * f11) + (fArr3[7] * f8) + (fArr3[6] * f6), this.d, j);
        }
        kg9 e = lg9Var.e();
        float[] b = lg9Var.b();
        b.getClass();
        float f12 = b[c3];
        float f13 = iodVar.a;
        float f14 = b[1];
        float f15 = iodVar.b;
        float f16 = (f14 * f15) + (f12 * f13);
        float f17 = b[2];
        float f18 = iodVar.c;
        return lg9Var.c(e.h((f17 * f18) + f16), e.h((b[5] * f18) + (b[4] * f15) + (b[3] * f13)), e.h((b[c] * f18) + (b[c2] * f15) + (b[6] * f13)), this.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iod) {
                iod iodVar = (iod) obj;
                if (Float.compare(this.a, iodVar.a) != 0 || Float.compare(this.b, iodVar.b) != 0 || Float.compare(this.c, iodVar.c) != 0 || Float.compare(this.d, iodVar.d) != 0 || !this.e.equals(iodVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.a.hashCode() + nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "XYZ(x=" + this.a + ", y=" + this.b + ", z=" + this.c + ", alpha=" + this.d + ", space=" + this.e + ')';
    }

    @Override // defpackage.yl1
    public final iod a() {
        return this;
    }
}
