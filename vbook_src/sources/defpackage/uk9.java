package defpackage;

import android.graphics.Rect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uk9  reason: default package */
/* loaded from: classes.dex */
public abstract class uk9 extends mq7 implements hz4 {
    public xt4 K;
    public Rect L;

    @Override // defpackage.mq7
    public final void A1() {
        gw7 H1 = H1();
        Rect rect = this.L;
        if (rect != null) {
            H1.j(rect);
        }
        I1(H1);
        this.L = null;
    }

    public abstract gw7 H1();

    public abstract void I1(gw7 gw7Var);

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        Rect rect;
        xt4 xt4Var = this.K;
        if (xt4Var == null) {
            rk9 g0 = obe.t(i38Var).g0(i38Var, true);
            rect = new Rect(k27.A(g0.a), k27.A(g0.b), k27.A(g0.c), k27.A(g0.d));
        } else {
            rk9 rk9Var = (rk9) xt4Var.invoke(i38Var);
            sc6 t = obe.t(i38Var);
            long e0 = t.e0(i38Var, rk9Var.j());
            float f = rk9Var.c;
            long e02 = t.e0(i38Var, (Float.floatToRawIntBits(rk9Var.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            long e03 = t.e0(i38Var, rk9Var.d());
            long e04 = t.e0(i38Var, rk9Var.e());
            int i = (int) (e0 >> 32);
            int i2 = (int) (e02 >> 32);
            int i3 = (int) (e03 >> 32);
            int i4 = (int) (e04 >> 32);
            float t2 = hxe.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
            int i5 = (int) (e0 & 4294967295L);
            int i6 = (int) (e02 & 4294967295L);
            int i7 = (int) (e03 & 4294967295L);
            int i8 = (int) (e04 & 4294967295L);
            float t3 = hxe.t(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
            float intBitsToFloat = Float.intBitsToFloat(i);
            float[] fArr = {Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)};
            for (int i9 = 0; i9 < 3; i9++) {
                intBitsToFloat = Math.max(intBitsToFloat, fArr[i9]);
            }
            float intBitsToFloat2 = Float.intBitsToFloat(i5);
            float[] fArr2 = {Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)};
            for (int i10 = 0; i10 < 3; i10++) {
                intBitsToFloat2 = Math.max(intBitsToFloat2, fArr2[i10]);
            }
            rect = new Rect(k27.A(t2), k27.A(t3), k27.A(intBitsToFloat), k27.A(intBitsToFloat2));
        }
        gw7 H1 = H1();
        Object obj = this.L;
        if (obj != null) {
            H1.j(obj);
        }
        if (!rect.isEmpty()) {
            H1.b(rect);
        }
        I1(H1);
        this.L = rect;
    }
}
