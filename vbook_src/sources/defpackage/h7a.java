package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h7a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h7a implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ vt4 c;

    public /* synthetic */ h7a(vt4 vt4Var, vt4 vt4Var2, int i) {
        this.a = i;
        this.b = vt4Var;
        this.c = vt4Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = true;
        vt4 vt4Var = this.c;
        vt4 vt4Var2 = this.b;
        apb apbVar = (apb) obj;
        switch (i) {
            case 0:
                vt4Var2.invoke();
                if (vt4Var != null) {
                    z = ((Boolean) vt4Var.invoke()).booleanValue();
                }
                if (z) {
                    apbVar.close();
                }
                return pvcVar;
            default:
                vt4Var2.invoke();
                if (vt4Var != null) {
                    z = ((Boolean) vt4Var.invoke()).booleanValue();
                }
                if (z) {
                    apbVar.close();
                }
                return pvcVar;
        }
    }
}
