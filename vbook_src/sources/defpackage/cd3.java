package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cd3  reason: default package */
/* loaded from: classes.dex */
public final class cd3 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw2 b;
    public final /* synthetic */ yya c;

    public /* synthetic */ cd3(iw2 iw2Var, yya yyaVar, int i) {
        this.a = i;
        this.b = iw2Var;
        this.c = yyaVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        iw2 iw2Var = this.b;
        yya yyaVar = this.c;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                if (intValue >= 0 && intValue < ((List) yyaVar.getValue()).size() && intValue != iw2Var.k()) {
                    rj8.s(iw2Var, intValue);
                }
                return pvcVar;
            default:
                int size = ((List) yyaVar.getValue()).size();
                int i2 = ((l2a) obj).a;
                if (i2 >= 0 && i2 < size) {
                    rj8.s(iw2Var, i2);
                }
                return pvcVar;
        }
    }
}
