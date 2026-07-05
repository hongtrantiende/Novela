package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nf7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo3 b;

    public /* synthetic */ nf7(eo3 eo3Var, int i) {
        this.a = i;
        this.b = eo3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        eo3 eo3Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                eo3Var.e();
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                eo3Var.getClass();
                eo3Var.b.setValue(str);
                return pvcVar;
            case 2:
                ac9 ac9Var = (ac9) obj;
                ac9Var.getClass();
                eo3.g(eo3Var, ac9Var.a, ac9Var.b, 12);
                return pvcVar;
            default:
                af9 af9Var = (af9) obj;
                af9Var.getClass();
                eo3.g(eo3Var, af9Var.c, af9Var.d, 12);
                return pvcVar;
        }
    }
}
