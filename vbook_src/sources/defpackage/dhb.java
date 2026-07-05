package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dhb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dhb implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ go3 b;

    public /* synthetic */ dhb(go3 go3Var, int i) {
        this.a = i;
        this.b = go3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        go3 go3Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                go3Var.a();
                return pvcVar;
            case 1:
                doa doaVar = (doa) obj;
                doaVar.getClass();
                go3Var.b(doaVar.b, doaVar.c, doaVar.d);
                return pvcVar;
            case 2:
                String str = (String) obj;
                str.getClass();
                go3Var.getClass();
                go3Var.b.setValue(str);
                return pvcVar;
            default:
                String str2 = (String) obj;
                str2.getClass();
                go3Var.getClass();
                go3Var.c.setValue(str2);
                return pvcVar;
        }
    }
}
