package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zr2  reason: default package */
/* loaded from: classes3.dex */
public final class zr2 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;

    public /* synthetic */ zr2(aw7 aw7Var, int i) {
        this.a = i;
        this.b = aw7Var;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                ((xt4) aw7Var.getValue()).invoke((mr2) obj);
                return pvcVar;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    jye.d(aw7Var, false);
                }
                return pvcVar;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    int i2 = ej6.a;
                    ((vt4) aw7Var.getValue()).invoke();
                }
                return pvcVar;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    int i3 = ej6.a;
                    ((vt4) aw7Var.getValue()).invoke();
                }
                return pvcVar;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    int i4 = ej6.a;
                    ((vt4) aw7Var.getValue()).invoke();
                }
                return pvcVar;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    ((vt4) aw7Var.getValue()).invoke();
                }
                return pvcVar;
            case 6:
                aw7Var.setValue(Float.valueOf(((Number) obj).floatValue()));
                return pvcVar;
            default:
                if (((Boolean) obj).booleanValue()) {
                    aw7Var.setValue(Boolean.FALSE);
                }
                return pvcVar;
        }
    }
}
