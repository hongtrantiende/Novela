package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bl7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl7 implements vt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ bl7(xt4 xt4Var, String str, vt4 vt4Var) {
        this.d = xt4Var;
        this.b = str;
        this.c = vt4Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.d;
        vt4 vt4Var = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                xt4Var.invoke(str);
                vt4Var.invoke();
                return pvcVar;
            default:
                if (c16.i(str, "ai")) {
                    vt4Var.invoke();
                } else {
                    xt4Var.invoke(str);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ bl7(String str, vt4 vt4Var, xt4 xt4Var) {
        this.b = str;
        this.c = vt4Var;
        this.d = xt4Var;
    }
}
