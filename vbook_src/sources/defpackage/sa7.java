package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sa7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq b;

    public /* synthetic */ sa7(lq lqVar, int i) {
        this.a = i;
        this.b = lqVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lq lqVar = this.b;
        t15 t15Var = (t15) obj;
        switch (i) {
            case 0:
                t15Var.getClass();
                t15Var.x(((Number) lqVar.e()).floatValue());
                return pvcVar;
            case 1:
                t15Var.getClass();
                float floatValue = ((Number) lqVar.e()).floatValue();
                t15Var.v(floatValue);
                t15Var.l(floatValue);
                return pvcVar;
            default:
                t15Var.getClass();
                t15Var.v(((Number) lqVar.e()).floatValue());
                t15Var.l(((Number) lqVar.e()).floatValue());
                return pvcVar;
        }
    }
}
