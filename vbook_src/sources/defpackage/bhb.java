package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bhb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bhb implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ go3 b;

    public /* synthetic */ bhb(go3 go3Var, int i) {
        this.a = i;
        this.b = go3Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        go3 go3Var = this.b;
        switch (i) {
            case 0:
                go3Var.b("", "", false);
                return pvcVar;
            case 1:
                go3Var.b("", "", false);
                return pvcVar;
            case 2:
                go3Var.a();
                return pvcVar;
            default:
                go3Var.d.setValue(Boolean.valueOf(!((Boolean) go3Var.d.getValue()).booleanValue()));
                return pvcVar;
        }
    }
}
