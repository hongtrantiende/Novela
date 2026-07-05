package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x16  reason: default package */
/* loaded from: classes.dex */
public final class x16 implements t15 {
    public float[] C;
    public long a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    @Override // defpackage.t15
    public final float B() {
        return this.e;
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.c;
    }

    @Override // defpackage.t15
    public final void J0(wea weaVar) {
        weaVar.getClass();
    }

    public final void a(mu9 mu9Var, r13 r13Var, xt4 xt4Var) {
        r13Var.getClass();
        xt4Var.getClass();
        ij1 ij1Var = (ij1) mu9Var.a;
        this.a = ij1Var.G();
        this.b = r13Var.f();
        this.c = r13Var.G0();
        xt4Var.invoke(this);
        float f = this.f;
        float f2 = this.d;
        float f3 = this.e;
        if (f == nae.e) {
            if (f2 != nae.e && f3 != nae.e) {
                mu9Var.A(1.0f / f2, 1.0f / f3, 0L);
                return;
            }
            return;
        }
        float[] fArr = this.C;
        if (fArr == null) {
            fArr = l27.a();
            this.C = fArr;
        }
        if (fArr.length >= 16) {
            double d = f * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f4 = cos * f2;
            float f5 = sin * f3;
            float f6 = (-sin) * f2;
            float f7 = cos * f3;
            float f8 = (f4 * f7) - (f5 * f6);
            if (f8 == nae.e) {
                return;
            }
            float f9 = 1.0f / f8;
            fArr[0] = f7 * f9;
            fArr[1] = (-f5) * f9;
            fArr[4] = (-f6) * f9;
            fArr[5] = f4 * f9;
            ij1Var.w().k(fArr);
        }
    }

    @Override // defpackage.t15
    public final long b() {
        return this.a;
    }

    @Override // defpackage.t15
    public final float d() {
        return this.d;
    }

    @Override // defpackage.r13
    public final float f() {
        return this.b;
    }

    @Override // defpackage.t15
    public final void h(float f) {
        this.f = f;
    }

    @Override // defpackage.t15
    public final void l(float f) {
        this.e = f;
    }

    @Override // defpackage.t15
    public final void v(float f) {
        this.d = f;
    }

    @Override // defpackage.t15
    public final void A(float f) {
    }

    @Override // defpackage.t15
    public final void C(float f) {
    }

    @Override // defpackage.t15
    public final void Z0(long j) {
    }

    @Override // defpackage.t15
    public final void c(float f) {
    }

    @Override // defpackage.t15
    public final void e(float f) {
    }

    @Override // defpackage.t15
    public final void i(float f) {
    }

    @Override // defpackage.t15
    public final void k(int i) {
    }

    @Override // defpackage.t15
    public final void k0(int i) {
    }

    @Override // defpackage.t15
    public final void q(float f) {
    }

    @Override // defpackage.t15
    public final void r(c3e c3eVar) {
    }

    @Override // defpackage.t15
    public final void s(em1 em1Var) {
    }

    @Override // defpackage.t15
    public final void u(long j) {
    }

    @Override // defpackage.t15
    public final void w(boolean z) {
    }

    @Override // defpackage.t15
    public final void x(float f) {
    }

    @Override // defpackage.t15
    public final void y(long j) {
    }
}
