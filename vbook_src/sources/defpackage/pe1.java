package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pe1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe1 implements vt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ vt4 d;

    public /* synthetic */ pe1(vt4 vt4Var, aw7 aw7Var, aw7 aw7Var2) {
        this.d = vt4Var;
        this.b = aw7Var;
        this.c = aw7Var2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        vt4 vt4Var = this.d;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = Boolean.FALSE;
                aw7Var2.setValue(bool);
                aw7Var.setValue(bool);
                vt4Var.invoke();
                return pvc.a;
            default:
                return new fj8((nu4) aw7Var2.getValue(), (xt4) aw7Var.getValue(), ((Number) vt4Var.invoke()).intValue());
        }
    }

    public /* synthetic */ pe1(aw7 aw7Var, aw7 aw7Var2, vt4 vt4Var) {
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = vt4Var;
    }
}
