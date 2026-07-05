package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xk6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yya b;

    public /* synthetic */ xk6(yya yyaVar, int i) {
        this.a = i;
        this.b = yyaVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        float f;
        float f2;
        float f3;
        int i = this.a;
        boolean z = false;
        float f4 = nae.e;
        yya yyaVar = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 1:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 2:
                return (sp6) yyaVar.getValue();
            case 3:
                Boolean bool = (Boolean) yyaVar.getValue();
                bool.getClass();
                return bool;
            case 4:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 5:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 6:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 7:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 8:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 9:
                return new y78(((y78) yyaVar.getValue()).a);
            case 10:
                gs gsVar = d7a.a;
                return new y78(((y78) yyaVar.getValue()).a);
            case 11:
                if (yyaVar != null) {
                    f = ((Number) yyaVar.getValue()).floatValue();
                } else {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 12:
                if (yyaVar != null) {
                    f4 = ((Number) yyaVar.getValue()).floatValue();
                }
                return Float.valueOf(f4);
            case 13:
                if (yyaVar != null) {
                    f4 = ((Number) yyaVar.getValue()).floatValue();
                }
                return Float.valueOf(f4);
            case 14:
                if (yyaVar != null) {
                    f2 = ((Number) yyaVar.getValue()).floatValue();
                } else {
                    f2 = 0.0f;
                }
                if (f2 > nae.e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                if (yyaVar != null) {
                    f3 = ((Number) yyaVar.getValue()).floatValue();
                } else {
                    f3 = 0.0f;
                }
                if (f3 > nae.e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (((n1c) yyaVar.getValue()).g && ((n1c) yyaVar.getValue()).h) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
