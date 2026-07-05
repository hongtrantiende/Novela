package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rp7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;

    public /* synthetic */ rp7(xt4 xt4Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, int i) {
        this.a = i;
        this.b = xt4Var;
        this.c = aw7Var;
        this.d = aw7Var2;
        this.e = aw7Var3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.e;
        aw7 aw7Var2 = this.d;
        aw7 aw7Var3 = this.c;
        xt4 xt4Var = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                if (((Boolean) aw7Var3.getValue()).booleanValue()) {
                    xt4Var.invoke(str);
                } else {
                    ((xt4) aw7Var2.getValue()).invoke(str);
                }
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            default:
                str.getClass();
                if (((Boolean) aw7Var3.getValue()).booleanValue()) {
                    xt4Var.invoke(str);
                } else {
                    ((xt4) aw7Var2.getValue()).invoke(str);
                }
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
        }
    }
}
