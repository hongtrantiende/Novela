package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ko7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko7 implements vt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ ko7(vt4 vt4Var, xt4 xt4Var, aw7 aw7Var) {
        this.c = vt4Var;
        this.b = xt4Var;
        this.d = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        vt4 vt4Var = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                if (((nzb) aw7Var.getValue()).c.equals("ai")) {
                    vt4Var.invoke();
                } else {
                    xt4Var.invoke(((nzb) aw7Var.getValue()).c);
                }
                return pvcVar;
            default:
                xt4Var.invoke(Long.valueOf(((Number) aw7Var.getValue()).floatValue()));
                vt4Var.invoke();
                return pvcVar;
        }
    }

    public /* synthetic */ ko7(xt4 xt4Var, vt4 vt4Var, aw7 aw7Var) {
        this.b = xt4Var;
        this.c = vt4Var;
        this.d = aw7Var;
    }
}
