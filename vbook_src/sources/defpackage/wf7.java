package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wf7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wf7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho3 b;

    public /* synthetic */ wf7(ho3 ho3Var, int i) {
        this.a = i;
        this.b = ho3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ho3 ho3Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                ho3Var.a(false);
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                ho3Var.getClass();
                ho3Var.c.setValue(str);
                return pvcVar;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                ho3Var.getClass();
                ho3Var.d.setValue(str2);
                return pvcVar;
            default:
                String str3 = (String) obj;
                str3.getClass();
                ho3Var.getClass();
                ho3Var.e.setValue(str3);
                return pvcVar;
        }
    }
}
