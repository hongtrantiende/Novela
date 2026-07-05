package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uf7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo3 b;

    public /* synthetic */ uf7(fo3 fo3Var, int i) {
        this.a = i;
        this.b = fo3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        fo3 fo3Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                fo3Var.a.setValue(Boolean.FALSE);
                fo3Var.b.setValue("");
                fo3Var.c.setValue("");
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                fo3Var.getClass();
                fo3Var.b.setValue(str);
                return pvcVar;
            default:
                String str2 = (String) obj;
                str2.getClass();
                fo3Var.getClass();
                fo3Var.c.setValue(str2);
                return pvcVar;
        }
    }
}
