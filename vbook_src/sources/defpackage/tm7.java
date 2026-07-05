package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tm7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ vt4 f;

    public /* synthetic */ tm7(xt4 xt4Var, float f, float f2, float f3, vt4 vt4Var, int i) {
        this.a = i;
        this.b = xt4Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = vt4Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        vt4 vt4Var = this.f;
        float f = this.e;
        float f2 = this.d;
        float f3 = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                xt4Var.invoke(Float.valueOf(Math.max(f3 - f2, f)));
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
                return pvcVar;
            case 1:
                xt4Var.invoke(Float.valueOf(Math.min(f3 + f2, f)));
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
                return pvcVar;
            case 2:
                xt4Var.invoke(Float.valueOf(Math.max(f3 - f2, f)));
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
                return pvcVar;
            default:
                xt4Var.invoke(Float.valueOf(Math.min(f3 + f2, f)));
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
                return pvcVar;
        }
    }
}
