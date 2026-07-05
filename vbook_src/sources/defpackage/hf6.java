package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hf6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hf6 implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ yya D;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hf6(xt4 xt4Var, kj6 kj6Var, m82 m82Var, dm8 dm8Var, float f, yya yyaVar, yya yyaVar2) {
        this.c = xt4Var;
        this.d = kj6Var;
        this.e = m82Var;
        this.f = dm8Var;
        this.b = f;
        this.C = yyaVar;
        this.D = yyaVar2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        double d;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.C;
        Object obj3 = this.f;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                kj6 kj6Var = (kj6) obj4;
                m82 m82Var = (m82) this.e;
                yya yyaVar = (yya) obj2;
                Float f = (Float) obj;
                f.getClass();
                this.c.invoke(f);
                float h = ((dm8) obj3).h() * kj6Var.j().n;
                float floatValue = ((Number) yyaVar.getValue()).floatValue();
                float f2 = this.b;
                if (floatValue < f2) {
                    h = (h * (1.0f - ((Number) yyaVar.getValue()).floatValue())) / (1.0f - f2);
                }
                z87.v(m82Var, null, null, new nf6(kj6Var, (int) Math.floor(d), this.D, h - ((float) Math.floor(h)), null, 0), 3);
                return pvcVar;
            default:
                sr srVar = (sr) obj3;
                es esVar = (es) this.D;
                long longValue = ((Long) obj).longValue();
                wr wrVar = new wr(this.e, srVar.c(), (js) obj2, longValue, srVar.g(), longValue, new w9b(1, esVar));
                ote.q(wrVar, longValue, this.b, srVar, esVar, this.c);
                ((zl9) obj4).a = wrVar;
                return pvcVar;
        }
    }

    public /* synthetic */ hf6(zl9 zl9Var, Object obj, sr srVar, js jsVar, es esVar, float f, xt4 xt4Var) {
        this.d = zl9Var;
        this.e = obj;
        this.f = srVar;
        this.C = jsVar;
        this.D = esVar;
        this.b = f;
        this.c = xt4Var;
    }
}
