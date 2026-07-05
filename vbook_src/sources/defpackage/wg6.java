package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wg6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wg6 implements xt4 {
    public final /* synthetic */ yya C;
    public final /* synthetic */ yya D;
    public final /* synthetic */ x2a E;
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ m82 c;
    public final /* synthetic */ yya d;
    public final /* synthetic */ dm8 e;
    public final /* synthetic */ float f;

    public /* synthetic */ wg6(xt4 xt4Var, x2a x2aVar, m82 m82Var, yya yyaVar, dm8 dm8Var, float f, yya yyaVar2, yya yyaVar3, int i) {
        this.a = i;
        this.b = xt4Var;
        this.E = x2aVar;
        this.c = m82Var;
        this.d = yyaVar;
        this.e = dm8Var;
        this.f = f;
        this.C = yyaVar2;
        this.D = yyaVar3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        double d;
        double d2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        yya yyaVar = this.C;
        float f = this.f;
        dm8 dm8Var = this.e;
        yya yyaVar2 = this.d;
        m82 m82Var = this.c;
        x2a x2aVar = this.E;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                qg6 qg6Var = (qg6) x2aVar;
                Float f2 = (Float) obj;
                f2.getClass();
                xt4Var.invoke(f2);
                float h = dm8Var.h() * (qg6Var.j().p / ((Number) yyaVar2.getValue()).intValue());
                if (((Number) yyaVar.getValue()).floatValue() < f) {
                    h = (h * (1.0f - ((Number) yyaVar.getValue()).floatValue())) / (1.0f - f);
                }
                int intValue = ((Number) yyaVar2.getValue()).intValue();
                z87.v(m82Var, null, null, new nf6(qg6Var, intValue * ((int) Math.floor(d)), this.D, h - ((float) Math.floor(h)), null, 1), 3);
                return pvcVar;
            default:
                nk6 nk6Var = (nk6) x2aVar;
                Float f3 = (Float) obj;
                f3.getClass();
                xt4Var.invoke(f3);
                float h2 = dm8Var.h() * (nk6Var.g().l / ((Number) yyaVar2.getValue()).intValue());
                if (((Number) yyaVar.getValue()).floatValue() < f) {
                    h2 = (h2 * (1.0f - ((Number) yyaVar.getValue()).floatValue())) / (1.0f - f);
                }
                int intValue2 = ((Number) yyaVar2.getValue()).intValue();
                z87.v(m82Var, null, null, new nf6(nk6Var, intValue2 * ((int) Math.floor(d2)), this.D, h2 - ((float) Math.floor(h2)), null, 2), 3);
                return pvcVar;
        }
    }
}
