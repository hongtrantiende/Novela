package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: en  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class en implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;

    public /* synthetic */ en(aw7 aw7Var, int i) {
        this.a = i;
        this.b = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                sc6 sc6Var = (sc6) aw7Var.getValue();
                if (sc6Var != null) {
                    return sc6Var;
                }
                ov5.d("Required value was null.");
                ls2.c();
                return null;
            case 1:
                aw7Var.setValue(Boolean.valueOf(!((Boolean) aw7Var.getValue()).booleanValue()));
                return pvcVar;
            case 2:
                aw7Var.setValue(Boolean.valueOf(!((Boolean) aw7Var.getValue()).booleanValue()));
                return pvcVar;
            case 3:
                aw7Var.setValue(Boolean.valueOf(!((Boolean) aw7Var.getValue()).booleanValue()));
                return pvcVar;
            case 4:
                aw7Var.setValue(Boolean.valueOf(!((Boolean) aw7Var.getValue()).booleanValue()));
                return pvcVar;
            case 5:
                ((vt4) aw7Var.getValue()).invoke();
                return pvcVar;
            case 6:
                sc6 sc6Var2 = (sc6) aw7Var.getValue();
                if (sc6Var2 != null) {
                    return sc6Var2;
                }
                ov5.d("Required value was null.");
                ls2.c();
                return null;
            case 7:
                if (aw7Var == null) {
                    return null;
                }
                return (List) aw7Var.getValue();
            case 8:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 9:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 10:
                aw7Var.setValue(null);
                return pvcVar;
            case 11:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 12:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 13:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 14:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 15:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 16:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 17:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 18:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 19:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 20:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 21:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 22:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 23:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 24:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 25:
                return (vi3) aw7Var.getValue();
            case 26:
                Boolean bool = (Boolean) aw7Var.getValue();
                bool.getClass();
                return bool;
            case 27:
                return (vi3) aw7Var.getValue();
            case 28:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            default:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
        }
    }
}
