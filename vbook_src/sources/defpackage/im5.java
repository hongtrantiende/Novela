package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: im5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class im5 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ im5(cz7 cz7Var, aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = cz7Var;
        this.c = aw7Var;
        this.d = aw7Var2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        aw7 aw7Var2 = this.c;
        cz7 cz7Var = this.b;
        switch (i) {
            case 0:
                aw7Var2.setValue(Boolean.FALSE);
                lpe.t(cz7Var, ((rl5) aw7Var.getValue()).e, ((rl5) aw7Var.getValue()).a);
                return pvcVar;
            case 1:
                aw7Var2.setValue(Boolean.FALSE);
                eh.s(cz7Var, ((rl5) aw7Var.getValue()).a);
                return pvcVar;
            case 2:
                aw7Var2.setValue(Boolean.FALSE);
                lpe.t(cz7Var, ((omb) aw7Var.getValue()).e, ((omb) aw7Var.getValue()).h);
                return pvcVar;
            default:
                aw7Var2.setValue(Boolean.FALSE);
                eh.s(cz7Var, ((omb) aw7Var.getValue()).a);
                return pvcVar;
        }
    }
}
