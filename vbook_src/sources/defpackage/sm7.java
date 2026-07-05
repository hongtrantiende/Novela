package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sm7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ sm7(int i, xt4 xt4Var, aw7 aw7Var) {
        this.a = 1;
        this.b = i;
        this.c = xt4Var;
        this.d = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        int i2 = this.b;
        xt4 xt4Var = this.c;
        switch (i) {
            case 0:
                aw7Var.setValue(Boolean.FALSE);
                xt4Var.invoke(Integer.valueOf(i2));
                return pvcVar;
            case 1:
                int i3 = i2 + 1;
                String valueOf = String.valueOf(i3);
                int length = String.valueOf(i3).length();
                aw7Var.setValue(new jub(valueOf, sze.a(length, length), 4));
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            case 2:
                aw7Var.setValue(Boolean.FALSE);
                xt4Var.invoke(Integer.valueOf(i2));
                return pvcVar;
            case 3:
                aw7Var.setValue(Boolean.FALSE);
                xt4Var.invoke(Integer.valueOf(i2));
                return pvcVar;
            default:
                aw7Var.setValue(Boolean.FALSE);
                xt4Var.invoke(Integer.valueOf(i2));
                return pvcVar;
        }
    }

    public /* synthetic */ sm7(xt4 xt4Var, int i, aw7 aw7Var, int i2) {
        this.a = i2;
        this.c = xt4Var;
        this.b = i;
        this.d = aw7Var;
    }
}
