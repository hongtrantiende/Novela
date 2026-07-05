package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v90  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class v90 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ v90(int i, xt4 xt4Var, aw7 aw7Var) {
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
                xt4Var.invoke(Float.valueOf(((Number) aw7Var.getValue()).floatValue()));
                return pvcVar;
            case 1:
                String str = (String) aw7Var.getValue();
                if (str != null) {
                    xt4Var.invoke(str);
                }
                aw7Var.setValue(null);
                return pvcVar;
            case 2:
                xt4Var.invoke((String) aw7Var.getValue());
                aw7Var.setValue("");
                return pvcVar;
            case 3:
                xt4Var.invoke(Float.valueOf(((Number) aw7Var.getValue()).floatValue()));
                return pvcVar;
            case 4:
                xt4Var.invoke(Float.valueOf(((Number) aw7Var.getValue()).floatValue()));
                return pvcVar;
            case 5:
                xt4Var.invoke((String) aw7Var.getValue());
                return pvcVar;
            case 6:
                xt4Var.invoke((cs9) aw7Var.getValue());
                return pvcVar;
            case 7:
                xt4Var.invoke((cs9) aw7Var.getValue());
                return pvcVar;
            case 8:
                Boolean bool = (Boolean) aw7Var.getValue();
                bool.booleanValue();
                xt4Var.invoke(bool);
                return pvcVar;
            case 9:
                xt4Var.invoke((List) aw7Var.getValue());
                return pvcVar;
            case 10:
                xt4Var.invoke(Integer.valueOf((int) ((Number) aw7Var.getValue()).floatValue()));
                return pvcVar;
            case 11:
                xt4Var.invoke(Float.valueOf(((Number) aw7Var.getValue()).floatValue()));
                return pvcVar;
            case 12:
                aw7Var.setValue(Boolean.FALSE);
                xt4Var.invoke(Boolean.TRUE);
                return pvcVar;
            case 13:
                Boolean bool2 = Boolean.FALSE;
                aw7Var.setValue(bool2);
                xt4Var.invoke(bool2);
                return pvcVar;
            default:
                xt4Var.invoke(((jub) aw7Var.getValue()).a.b);
                return pvcVar;
        }
    }
}
