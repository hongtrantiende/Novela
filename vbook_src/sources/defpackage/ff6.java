package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ff6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ff6 implements vt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yya b;
    public final /* synthetic */ yya c;
    public final /* synthetic */ float d;
    public final /* synthetic */ yya e;
    public final /* synthetic */ x2a f;

    public /* synthetic */ ff6(kj6 kj6Var, yya yyaVar, float f, yya yyaVar2, yya yyaVar3) {
        this.f = kj6Var;
        this.b = yyaVar;
        this.d = f;
        this.c = yyaVar2;
        this.e = yyaVar3;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        gj6 gj6Var;
        float f;
        ik6 ik6Var;
        float f2;
        int i = this.a;
        float f3 = nae.e;
        yya yyaVar = this.e;
        float f4 = this.d;
        yya yyaVar2 = this.c;
        yya yyaVar3 = this.b;
        x2a x2aVar = this.f;
        switch (i) {
            case 0:
                kj6 kj6Var = (kj6) x2aVar;
                fj6 j = kj6Var.j();
                if (j.n != 0 && !j.k.isEmpty() && (gj6Var = (gj6) yyaVar3.getValue()) != null) {
                    float f5 = gj6Var.a;
                    int i2 = kj6Var.i();
                    int i3 = gj6Var.q;
                    if (i3 == 0) {
                        f = 0.0f;
                    } else {
                        f = i2 / i3;
                    }
                    float f6 = (f + f5) / j.n;
                    float m = dce.m(1.0f - ((Number) yyaVar2.getValue()).floatValue(), nae.e, 1.0f);
                    if (((Number) yyaVar2.getValue()).floatValue() >= f4) {
                        f3 = ((Boolean) yyaVar.getValue()).booleanValue() ? m - f6 : f6;
                    } else {
                        float f7 = 1.0f - f4;
                        if (((Boolean) yyaVar.getValue()).booleanValue()) {
                            f6 = m - f6;
                        }
                        f3 = (f6 * f7) / m;
                    }
                }
                return Float.valueOf(f3);
            default:
                nk6 nk6Var = (nk6) x2aVar;
                gk6 g = nk6Var.g();
                if (g.l != 0 && !g.m.isEmpty() && (ik6Var = (ik6) yyaVar3.getValue()) != null) {
                    float intValue = ik6Var.a / ((Number) yyaVar2.getValue()).intValue();
                    int h = ((em8) nk6Var.c.f).h();
                    int i4 = (int) (ik6Var.v & 4294967295L);
                    if (i4 == 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = h / i4;
                    }
                    float intValue2 = (f2 + intValue) / (g.l / ((Number) yyaVar2.getValue()).intValue());
                    f3 = ((Number) yyaVar.getValue()).floatValue() >= f4 ? intValue2 : ((1.0f - f4) * intValue2) / dce.m(1.0f - ((Number) yyaVar.getValue()).floatValue(), nae.e, 1.0f);
                }
                return Float.valueOf(f3);
        }
    }

    public /* synthetic */ ff6(nk6 nk6Var, yya yyaVar, yya yyaVar2, float f, yya yyaVar3) {
        this.f = nk6Var;
        this.b = yyaVar;
        this.c = yyaVar2;
        this.d = f;
        this.e = yyaVar3;
    }
}
