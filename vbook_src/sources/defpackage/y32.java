package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y32  reason: default package */
/* loaded from: classes3.dex */
public final class y32 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ y32(int i, xt4 xt4Var, aw7 aw7Var) {
        this.a = i;
        this.b = xt4Var;
        this.c = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                xt4Var.invoke((List) aw7Var.getValue());
                return pvcVar;
            case 1:
                xt4Var.invoke((List) aw7Var.getValue());
                return pvcVar;
            case 2:
                List<wp3> list = (List) aw7Var.getValue();
                ArrayList arrayList = new ArrayList(tl1.s(list, 10));
                for (wp3 wp3Var : list) {
                    arrayList.add(wp3Var.a);
                }
                xt4Var.invoke(arrayList);
                return pvcVar;
            case 3:
                xt4Var.invoke((List) aw7Var.getValue());
                return pvcVar;
            case 4:
                xt4Var.invoke((List) aw7Var.getValue());
                return pvcVar;
            case 5:
                xt4Var.invoke((List) aw7Var.getValue());
                return pvcVar;
            default:
                xt4Var.invoke((List) aw7Var.getValue());
                return pvcVar;
        }
    }
}
