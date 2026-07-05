package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ct0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ct0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef2 b;

    public /* synthetic */ ct0(ef2 ef2Var, long j) {
        this.a = 1;
        this.b = ef2Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        ef2 ef2Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(b23.o(1.0f, 1.2f, ef2Var.a()));
            case 1:
                float o = b23.o(0.85f, 1.0f, ef2Var.a());
                l65.a.getClass();
                return new c65(0.5f, 0.5f, o, i65.b);
            case 2:
                float a = ef2Var.a();
                return new mea(b23.o(6.0f, 24.0f, a), zl1.b(b23.o(0.05f, 0.1f, a), zl1.b), 26);
            case 3:
                float a2 = ef2Var.a();
                return new yv5(b23.o(2.0f, 8.0f, a2), b23.o(0.2f, 1.0f, a2), 22);
            case 4:
                ef2Var.e.invoke(ef2Var);
                z87.v(ef2Var.a, null, null, new cv0(ef2Var, null, 24), 3);
                return pvc.a;
            case 5:
                return Float.valueOf(((Number) ef2Var.l.e()).floatValue());
            case 6:
                float a3 = ef2Var.a();
                c65 c65Var = c65.f;
                l65 l65Var = c65Var.d;
                l65Var.getClass();
                return new c65(c65Var.a / 1.5f, c65Var.b / 1.5f, a3, l65Var);
            default:
                float a4 = ef2Var.a();
                return new yv5(4.0f * a4, a4, 22);
        }
    }

    public /* synthetic */ ct0(ef2 ef2Var, int i) {
        this.a = i;
        this.b = ef2Var;
    }
}
