package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gf6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yya b;
    public final /* synthetic */ dm8 c;

    public /* synthetic */ gf6(yya yyaVar, dm8 dm8Var, int i) {
        this.a = i;
        this.b = yyaVar;
        this.c = dm8Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        dm8 dm8Var = this.c;
        yya yyaVar = this.b;
        float floatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                float floatValue2 = 1.0f - ((Number) yyaVar.getValue()).floatValue();
                if (floatValue2 < nae.e) {
                    floatValue2 = 0.0f;
                }
                dm8Var.i(dce.m(floatValue, nae.e, floatValue2));
                return pvcVar;
            case 1:
                float floatValue3 = 1.0f - ((Number) yyaVar.getValue()).floatValue();
                if (floatValue3 < nae.e) {
                    floatValue3 = 0.0f;
                }
                dm8Var.i(dce.m(floatValue, nae.e, floatValue3));
                return pvcVar;
            default:
                float floatValue4 = 1.0f - ((Number) yyaVar.getValue()).floatValue();
                if (floatValue4 < nae.e) {
                    floatValue4 = 0.0f;
                }
                dm8Var.i(dce.m(floatValue, nae.e, floatValue4));
                return pvcVar;
        }
    }
}
