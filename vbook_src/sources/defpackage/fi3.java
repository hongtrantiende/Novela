package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fi3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fi3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu4 b;

    public /* synthetic */ fi3(int i, lu4 lu4Var) {
        this.a = i;
        this.b = lu4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lu4 lu4Var = this.b;
        switch (i) {
            case 0:
                z09 z09Var = (z09) obj;
                lu4Var.invoke(z09Var, new y78(ie2.z(z09Var, false)));
                z09Var.a();
                return pvcVar;
            case 1:
                z09 z09Var2 = (z09) obj;
                lu4Var.invoke(z09Var2, Float.valueOf(Float.intBitsToFloat((int) (ie2.z(z09Var2, false) & 4294967295L))));
                z09Var2.a();
                return pvcVar;
            case 2:
                wr wrVar = (wr) obj;
                lu4Var.invoke(wrVar.e.getValue(), fca.f.b.invoke(wrVar.f));
                return pvcVar;
            default:
                String str = (String) obj;
                str.getClass();
                lu4Var.invoke(str, tl1.A(str));
                return pvcVar;
        }
    }
}
