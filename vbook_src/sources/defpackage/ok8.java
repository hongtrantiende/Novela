package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ok8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ok8 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qi8 b;

    public /* synthetic */ ok8(qi8 qi8Var, int i) {
        this.a = i;
        this.b = qi8Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        qi8 qi8Var = this.b;
        switch (i) {
            case 0:
                qi8Var.c(((Number) ((lq) obj).e()).floatValue());
                return pvcVar;
            case 1:
                qi8Var.d(((Number) ((lq) obj).e()).floatValue());
                return pvcVar;
            default:
                qi8Var.g.setValue(new zy5(((zy5) obj).a));
                return pvcVar;
        }
    }
}
