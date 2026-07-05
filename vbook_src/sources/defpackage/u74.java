package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u74  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class u74 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e13 b;

    public /* synthetic */ u74(e13 e13Var, int i) {
        this.a = i;
        this.b = e13Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        e13 e13Var = this.b;
        switch (i) {
            case 0:
                l54 l54Var = (l54) obj;
                l54Var.getClass();
                String str = l54Var.a;
                String str2 = l54Var.b;
                e13Var.getClass();
                str.getClass();
                str2.getClass();
                e13Var.b.setValue(str);
                e13Var.c.setValue(str2);
                e13Var.a(true);
                return pvcVar;
            default:
                ((Boolean) obj).booleanValue();
                e13Var.a(false);
                return pvcVar;
        }
    }
}
