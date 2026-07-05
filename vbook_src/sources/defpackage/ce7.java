package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ce7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ aw7 e;

    public /* synthetic */ ce7(xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var, String str) {
        this.a = 1;
        this.b = xt4Var;
        this.c = xt4Var2;
        this.d = str;
        this.e = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.e;
        xt4 xt4Var = this.c;
        String str = this.d;
        xt4 xt4Var2 = this.b;
        switch (i) {
            case 0:
                xt4Var2.invoke(((jub) aw7Var.getValue()).a.b);
                aw7Var.setValue(new jub(str, 0L, 6));
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            case 1:
                xt4Var2.invoke(Boolean.FALSE);
                xt4Var.invoke(((jub) aw7Var.getValue()).a.b);
                aw7Var.setValue(new jub(str, 0L, 6));
                return pvcVar;
            default:
                xt4Var2.invoke(((jub) aw7Var.getValue()).a.b);
                aw7Var.setValue(new jub(str, 0L, 6));
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
        }
    }

    public /* synthetic */ ce7(int i, xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var, String str) {
        this.a = i;
        this.b = xt4Var;
        this.d = str;
        this.c = xt4Var2;
        this.e = aw7Var;
    }
}
