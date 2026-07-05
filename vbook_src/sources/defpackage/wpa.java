package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wpa  reason: default package */
/* loaded from: classes.dex */
public final class wpa implements qj3 {
    public final int a;
    public vt4 b;
    public final jk1 c;
    public final dm8 d;
    public xt4 e;
    public final boolean f = true;
    public final float[] g;
    public final em8 h;
    public final em8 i;
    public boolean j;
    public final hm8 k;
    public final em8 l;
    public final em8 m;
    public final ff8 n;
    public final hm8 o;
    public final ak9 p;
    public final dm8 q;
    public final dm8 r;
    public final ne s;
    public final ow7 t;

    public wpa(float f, int i, vt4 vt4Var, jk1 jk1Var) {
        float[] fArr;
        float f2;
        this.a = i;
        this.b = vt4Var;
        this.c = jk1Var;
        this.d = new dm8(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.g = fArr;
        this.h = new em8(0);
        this.i = new em8(0);
        Boolean bool = Boolean.FALSE;
        this.k = yae.z(bool);
        this.l = new em8(0);
        this.m = new em8(0);
        this.n = ff8.b;
        this.o = yae.z(bool);
        this.p = new ak9(this, 18);
        jk1 jk1Var2 = this.c;
        float f3 = jk1Var2.a;
        float f4 = jk1Var2.b - f3;
        if (f4 == nae.e) {
            f2 = 0.0f;
        } else {
            f2 = (f - f3) / f4;
        }
        this.q = new dm8(b23.o(nae.e, nae.e, dce.m(f2, nae.e, 1.0f)));
        this.r = new dm8(nae.e);
        this.s = new ne(this, 2);
        this.t = new ow7();
    }

    @Override // defpackage.qj3
    public final Object a(l lVar, si3 si3Var) {
        Object p = k27.p(new koa(this, lVar, null, 2), si3Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    public final void b(float f) {
        float max;
        float min;
        float f2;
        if (this.n == ff8.a) {
            em8 em8Var = this.m;
            max = Math.max(this.i.h() - (em8Var.h() / 2.0f), (float) nae.e);
            min = Math.min(em8Var.h() / 2.0f, max);
        } else {
            em8 em8Var2 = this.l;
            max = Math.max(this.h.h() - (em8Var2.h() / 2.0f), (float) nae.e);
            min = Math.min(em8Var2.h() / 2.0f, max);
        }
        dm8 dm8Var = this.q;
        float h = dm8Var.h() + f;
        dm8 dm8Var2 = this.r;
        dm8Var.i(dm8Var2.h() + h);
        dm8Var2.i(nae.e);
        float d = vpa.d(dm8Var.h(), min, max, this.g);
        jk1 jk1Var = this.c;
        float f3 = jk1Var.a;
        float f4 = jk1Var.b;
        float f5 = max - min;
        if (f5 == nae.e) {
            f2 = 0.0f;
        } else {
            f2 = (d - min) / f5;
        }
        float o = b23.o(f3, f4, dce.m(f2, nae.e, 1.0f));
        if (o == this.d.h()) {
            return;
        }
        xt4 xt4Var = this.e;
        if (xt4Var != null) {
            xt4Var.invoke(Float.valueOf(o));
        } else {
            d(o);
        }
    }

    public final float c() {
        float f;
        jk1 jk1Var = this.c;
        float f2 = jk1Var.a;
        float f3 = jk1Var.b;
        float m = dce.m(this.d.h(), jk1Var.a, f3);
        float f4 = f3 - f2;
        if (f4 == nae.e) {
            f = 0.0f;
        } else {
            f = (m - f2) / f4;
        }
        return dce.m(f, nae.e, 1.0f);
    }

    public final void d(float f) {
        if (this.f) {
            jk1 jk1Var = this.c;
            float f2 = jk1Var.a;
            float f3 = jk1Var.b;
            f = vpa.d(dce.m(f, f2, f3), jk1Var.a, f3, this.g);
        }
        this.d.i(f);
    }
}
