package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ yya d;
    public final /* synthetic */ yya e;

    public /* synthetic */ vh7(aw7 aw7Var, aw7 aw7Var2, yya yyaVar, yya yyaVar2, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = yyaVar;
        this.e = yyaVar2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        yya yyaVar = this.e;
        yya yyaVar2 = this.d;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        switch (i) {
            case 0:
                if (((jub) aw7Var2.getValue()).a.b.length() == 0 && ((Number) aw7Var.getValue()).intValue() >= 0 && ((Number) yyaVar2.getValue()).intValue() >= 0) {
                    int intValue = ((Number) yyaVar.getValue()).intValue();
                    int intValue2 = ((Number) yyaVar2.getValue()).intValue();
                    int intValue3 = ((Number) aw7Var.getValue()).intValue();
                    if (intValue > intValue3 || intValue3 > intValue2) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                if (((jub) aw7Var2.getValue()).a.b.length() == 0 && ((Number) aw7Var.getValue()).intValue() >= 0 && ((Number) yyaVar2.getValue()).intValue() >= 0) {
                    int intValue4 = ((Number) yyaVar.getValue()).intValue();
                    int intValue5 = ((Number) yyaVar2.getValue()).intValue();
                    int intValue6 = ((Number) aw7Var.getValue()).intValue();
                    if (intValue4 > intValue6 || intValue6 > intValue5) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                if (((jub) aw7Var2.getValue()).a.b.length() == 0 && ((Number) aw7Var.getValue()).intValue() >= 0 && ((Number) yyaVar2.getValue()).intValue() >= 0) {
                    int intValue7 = ((Number) yyaVar.getValue()).intValue();
                    int intValue8 = ((Number) yyaVar2.getValue()).intValue();
                    int intValue9 = ((Number) aw7Var.getValue()).intValue();
                    if (intValue7 > intValue9 || intValue9 > intValue8) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
