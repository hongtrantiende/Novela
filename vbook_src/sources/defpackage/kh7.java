package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh7 implements xt4 {
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a;
    public final /* synthetic */ mw8 b;
    public final /* synthetic */ x02 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ kh7(cyb cybVar, mw8 mw8Var, float f, x02 x02Var, float f2, float f3, float f4, float f5) {
        this.a = 2;
        this.E = cybVar;
        this.b = mw8Var;
        this.d = f;
        this.c = x02Var;
        this.e = f2;
        this.f = f3;
        this.C = f4;
        this.D = f5;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float m;
        float m2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.D;
        float f2 = this.C;
        float f3 = this.f;
        float f4 = this.e;
        x02 x02Var = this.c;
        float f5 = this.d;
        mw8 mw8Var = this.b;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                lw8 lw8Var = (lw8) obj;
                lw8Var.getClass();
                y78 y78Var = (y78) ((aw7) obj2).getValue();
                if (y78Var == null) {
                    lw8.t(lw8Var, mw8Var, 0L);
                } else {
                    long j = y78Var.a;
                    float i2 = (x02.i(x02Var.a) - f5) - mw8Var.a;
                    if (i2 < f4) {
                        i2 = f4;
                    }
                    float h = (x02.h(x02Var.a) - f3) - mw8Var.b;
                    if (h < f2) {
                        h = f2;
                    }
                    float m3 = dce.m(Float.intBitsToFloat((int) (j >> 32)) - (mw8Var.a / 2.0f), f4, i2);
                    int i3 = (int) (j & 4294967295L);
                    float intBitsToFloat = (Float.intBitsToFloat(i3) - mw8Var.b) - f;
                    if (intBitsToFloat < f2) {
                        intBitsToFloat = dce.m(Float.intBitsToFloat(i3) + f, f2, h);
                    }
                    int A = k27.A(m3);
                    lw8.t(lw8Var, mw8Var, (k27.A(intBitsToFloat) & 4294967295L) | (A << 32));
                }
                return pvcVar;
            case 1:
                lw8 lw8Var2 = (lw8) obj;
                lw8Var2.getClass();
                yp8 yp8Var = (yp8) ((aw7) obj2).getValue();
                if (yp8Var == null) {
                    lw8.t(lw8Var2, mw8Var, 0L);
                } else {
                    long j2 = yp8Var.a;
                    float i4 = (x02.i(x02Var.a) - f5) - mw8Var.a;
                    if (i4 < f4) {
                        i4 = f4;
                    }
                    float h2 = (x02.h(x02Var.a) - f3) - mw8Var.b;
                    if (h2 < f2) {
                        h2 = f2;
                    }
                    float m4 = dce.m(Float.intBitsToFloat((int) (j2 >> 32)) - (mw8Var.a / 2.0f), f4, i4);
                    if (yp8Var.b == xq8.b) {
                        m = dce.m(Float.intBitsToFloat((int) (j2 & 4294967295L)) + f, f2, h2);
                    } else {
                        m = dce.m((Float.intBitsToFloat((int) (j2 & 4294967295L)) - mw8Var.b) - f, f2, h2);
                    }
                    lw8.t(lw8Var2, mw8Var, (k27.A(m4) << 32) | (k27.A(m) & 4294967295L));
                }
                return pvcVar;
            default:
                cyb cybVar = (cyb) obj2;
                lw8 lw8Var3 = (lw8) obj;
                lw8Var3.getClass();
                hm8 hm8Var = cybVar.d;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (((y78) hm8Var.getValue()).a >> 32)) - (mw8Var.a / 2.0f);
                long j3 = x02Var.a;
                float m5 = dce.m(intBitsToFloat2, f5, (x02.i(j3) - f4) - mw8Var.a);
                if (((i6a) cybVar.e.getValue()) == i6a.b) {
                    m2 = dce.m(Float.intBitsToFloat((int) (((y78) hm8Var.getValue()).a & 4294967295L)) + f3, f2, (x02.h(j3) - f) - mw8Var.b);
                } else {
                    m2 = dce.m((Float.intBitsToFloat((int) (((y78) hm8Var.getValue()).a & 4294967295L)) - mw8Var.b) - f3, f2, (x02.h(j3) - f) - mw8Var.b);
                }
                lw8.t(lw8Var3, mw8Var, (k27.A(m5) << 32) | (k27.A(m2) & 4294967295L));
                return pvcVar;
        }
    }

    public /* synthetic */ kh7(mw8 mw8Var, x02 x02Var, float f, float f2, float f3, float f4, float f5, aw7 aw7Var, int i) {
        this.a = i;
        this.b = mw8Var;
        this.c = x02Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.C = f4;
        this.D = f5;
        this.E = aw7Var;
    }
}
