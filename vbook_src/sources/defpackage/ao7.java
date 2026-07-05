package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ao7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;

    public /* synthetic */ ao7(aw7 aw7Var, int i) {
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
                aw7Var.setValue(Boolean.valueOf(!((Boolean) aw7Var.getValue()).booleanValue()));
                return pvcVar;
            case 1:
                return ((jub) aw7Var.getValue()).a.b;
            case 2:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 3:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 4:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 5:
                aw7Var.setValue(Boolean.valueOf(!((Boolean) aw7Var.getValue()).booleanValue()));
                return pvcVar;
            case 6:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 7:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 8:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 9:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 10:
                ((xt4) aw7Var.getValue()).invoke(Boolean.FALSE);
                return pvcVar;
            case 11:
                ((xt4) aw7Var.getValue()).invoke(Boolean.FALSE);
                return pvcVar;
            case 12:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 13:
                int i2 = ct8.c;
                return Integer.valueOf(((uqc) aw7Var.getValue()).a);
            case 14:
                sc6 sc6Var = (sc6) aw7Var.getValue();
                if (sc6Var == null) {
                    ov5.d("Required value was null.");
                    ls2.c();
                    return null;
                }
                return sc6Var;
            case 15:
                ok5 ok5Var = (ok5) aw7Var.getValue();
                long j = ok5Var.a;
                float f = ok5Var.b;
                af0 af0Var = ok5Var.c;
                af0Var.getClass();
                aw7Var.setValue(new ok5(j, f, af0Var, false));
                return pvcVar;
            case 16:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 17:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 18:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 19:
                return yae.z(new jub(((u99) aw7Var.getValue()).c, 0L, 6));
            case 20:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 21:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 22:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 23:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 24:
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 25:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 26:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 27:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 28:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            default:
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
        }
    }
}
