package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a02  reason: default package */
/* loaded from: classes.dex */
public final class a02 extends b02 {
    public final zs9 e;
    public final zs9 f;
    public final float[] g;

    public a02(zs9 zs9Var, zs9 zs9Var2) {
        super(zs9Var2, zs9Var, zs9Var2, null);
        float[] p;
        this.e = zs9Var;
        this.f = zs9Var2;
        float[] fArr = f7.c.b;
        hid hidVar = zs9Var.d;
        float[] fArr2 = zs9Var.i;
        hid hidVar2 = zs9Var2.d;
        float[] fArr3 = zs9Var2.j;
        if (cwe.f(hidVar, hidVar2)) {
            p = cwe.p(fArr3, fArr2);
        } else {
            float[] a = hidVar.a();
            float[] a2 = hidVar2.a();
            hid hidVar3 = dye.f;
            p = cwe.p(cwe.f(hidVar2, hidVar3) ? fArr3 : cwe.l(cwe.p(cwe.e(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), zs9Var2.i)), cwe.f(hidVar, hidVar3) ? fArr2 : cwe.p(cwe.e(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = p;
    }

    @Override // defpackage.b02
    public final long a(long j) {
        float h = zl1.h(j);
        float g = zl1.g(j);
        float e = zl1.e(j);
        float d = zl1.d(j);
        vs9 vs9Var = this.e.p;
        float c = (float) vs9Var.c(h);
        float c2 = (float) vs9Var.c(g);
        float c3 = (float) vs9Var.c(e);
        float[] fArr = this.g;
        float f = (fArr[6] * c3) + (fArr[3] * c2) + (fArr[0] * c);
        float f2 = (fArr[7] * c3) + (fArr[4] * c2) + (fArr[1] * c);
        float f3 = fArr[2] * c;
        float f4 = (fArr[8] * c3) + (fArr[5] * c2) + f3;
        zs9 zs9Var = this.f;
        vs9 vs9Var2 = zs9Var.m;
        return sve.a((float) zs9Var.m.c(f), (float) vs9Var2.c(f2), (float) vs9Var2.c(f4), d, zs9Var);
    }
}
