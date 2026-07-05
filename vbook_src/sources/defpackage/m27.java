package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m27  reason: default package */
/* loaded from: classes3.dex */
public abstract class m27 {
    public static final float[] a = l27.a();

    public static final float[] a(float[] fArr) {
        fArr.getClass();
        return (float[]) fArr.clone();
    }

    public static final float[] b(float[] fArr) {
        fArr.getClass();
        float[] fArr2 = (float[]) fArr.clone();
        l27.b(fArr2);
        return fArr2;
    }

    public static final void c(float[] fArr, rk9 rk9Var, rk9 rk9Var2) {
        fArr.getClass();
        rk9Var.getClass();
        float f = rk9Var2.c;
        float f2 = rk9Var2.a;
        float f3 = rk9Var.c;
        float f4 = rk9Var.a;
        float f5 = (f - f2) / (f3 - f4);
        float f6 = f2 - (f4 * f5);
        float f7 = rk9Var2.d;
        float f8 = rk9Var2.b;
        float f9 = rk9Var.d;
        float f10 = rk9Var.b;
        float f11 = (f7 - f8) / (f9 - f10);
        l27.f(fArr);
        fArr[0] = f5;
        fArr[12] = f6;
        fArr[5] = f11;
        fArr[13] = f8 - (f10 * f11);
    }

    public static final float[] d(float[] fArr, float[] fArr2) {
        fArr.getClass();
        fArr2.getClass();
        float[] fArr3 = (float[]) fArr.clone();
        l27.j(fArr3, fArr2);
        return fArr3;
    }
}
