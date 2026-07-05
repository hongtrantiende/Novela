package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ yya d;

    public /* synthetic */ xh7(aw7 aw7Var, aw7 aw7Var2, yya yyaVar, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = yyaVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        yya yyaVar = this.d;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        switch (i) {
            case 0:
                if (((jub) aw7Var2.getValue()).a.b.length() == 0 && !((List) aw7Var.getValue()).isEmpty()) {
                    int x = tl1.x((List) aw7Var.getValue());
                    int intValue = ((Number) yyaVar.getValue()).intValue();
                    if (intValue >= 0 && intValue < x) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                if (((jub) aw7Var2.getValue()).a.b.length() == 0 && !((List) aw7Var.getValue()).isEmpty()) {
                    int x2 = tl1.x((List) aw7Var.getValue());
                    int intValue2 = ((Number) yyaVar.getValue()).intValue();
                    if (intValue2 >= 0 && intValue2 < x2) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                if (((jub) aw7Var2.getValue()).a.b.length() == 0 && !((List) aw7Var.getValue()).isEmpty()) {
                    int x3 = tl1.x((List) aw7Var.getValue());
                    int intValue3 = ((Number) yyaVar.getValue()).intValue();
                    if (intValue3 >= 0 && intValue3 < x3) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
