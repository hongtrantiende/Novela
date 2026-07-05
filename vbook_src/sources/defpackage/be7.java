package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: be7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class be7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ be7(xt4 xt4Var, String str, aw7 aw7Var) {
        this.a = 1;
        this.b = xt4Var;
        this.c = str;
        this.d = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        xt4 xt4Var = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                int length = str.length();
                aw7Var.setValue(new jub(str, sze.a(length, length), 4));
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            case 1:
                xt4Var.invoke(str);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 2:
                int length2 = str.length();
                aw7Var.setValue(new jub(str, sze.a(length2, length2), 4));
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            default:
                int length3 = str.length();
                aw7Var.setValue(new jub(str, sze.a(length3, length3), 4));
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
        }
    }

    public /* synthetic */ be7(int i, xt4 xt4Var, aw7 aw7Var, String str) {
        this.a = i;
        this.c = str;
        this.b = xt4Var;
        this.d = aw7Var;
    }
}
