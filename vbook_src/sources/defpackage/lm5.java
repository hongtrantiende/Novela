package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lm5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm5 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ lm5(aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = aw7Var3;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        aw7 aw7Var2 = this.c;
        aw7 aw7Var3 = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) aw7Var3.getValue()).booleanValue() && !((Boolean) aw7Var2.getValue()).booleanValue() && !((Boolean) aw7Var.getValue()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Boolean bool = Boolean.FALSE;
                aw7Var3.setValue(bool);
                aw7Var2.setValue(Boolean.TRUE);
                aw7Var.setValue(bool);
                return pvcVar;
            default:
                Boolean bool2 = Boolean.FALSE;
                aw7Var3.setValue(bool2);
                aw7Var2.setValue(bool2);
                aw7Var.setValue(null);
                return pvcVar;
        }
    }
}
