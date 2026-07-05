package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: if7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class if7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ co3 b;

    public /* synthetic */ if7(co3 co3Var, int i) {
        this.a = i;
        this.b = co3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        co3 co3Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                co3Var.a(false);
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                co3Var.getClass();
                co3Var.b.setValue(str);
                return pvcVar;
            default:
                String str2 = (String) obj;
                str2.getClass();
                co3Var.getClass();
                co3Var.c.setValue(str2);
                return pvcVar;
        }
    }
}
