package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ra7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ra7 implements xt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ra7(float f, jk1 jk1Var, int i) {
        this.b = f;
        this.d = jk1Var;
        this.c = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.c;
        Object obj2 = this.d;
        float f = this.b;
        switch (i) {
            case 0:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                float m = dce.m((((Number) ((lq) obj2).e()).floatValue() * i2) / f, nae.e, 1.0f);
                t15Var.q(m);
                float f2 = (m * 0.25f) + 0.75f;
                t15Var.v(f2);
                t15Var.l(f2);
                return pvcVar;
            default:
                jk1 jk1Var = (jk1) obj2;
                j8a.h((l8a) obj, new g79(((Number) dce.p(Float.valueOf(f), jk1Var)).floatValue(), jk1Var, i2));
                return pvcVar;
        }
    }

    public /* synthetic */ ra7(lq lqVar, int i, float f) {
        this.d = lqVar;
        this.c = i;
        this.b = f;
    }
}
