package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ee7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mu4 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;

    public /* synthetic */ ee7(mu4 mu4Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, int i) {
        this.a = i;
        this.b = mu4Var;
        this.c = aw7Var;
        this.d = aw7Var2;
        this.e = aw7Var3;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.e;
        aw7 aw7Var2 = this.d;
        aw7 aw7Var3 = this.c;
        mu4 mu4Var = this.b;
        switch (i) {
            case 0:
                mu4Var.c(kve.A(((zl1) aw7Var3.getValue()).a, true, false), kve.A(((zl1) aw7Var2.getValue()).a, true, false), (f76) aw7Var.getValue());
                return pvcVar;
            case 1:
                mu4Var.c((String) aw7Var3.getValue(), (String) aw7Var2.getValue(), (String) aw7Var.getValue());
                return pvcVar;
            default:
                Boolean bool = (Boolean) aw7Var2.getValue();
                bool.booleanValue();
                Boolean bool2 = (Boolean) aw7Var.getValue();
                bool2.booleanValue();
                mu4Var.c((String) aw7Var3.getValue(), bool, bool2);
                return pvcVar;
        }
    }
}
