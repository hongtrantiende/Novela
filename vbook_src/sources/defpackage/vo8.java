package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vo8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo8 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ dm8 d;
    public final /* synthetic */ aw7 e;

    public /* synthetic */ vo8(int i, xt4 xt4Var, aw7 aw7Var, dm8 dm8Var) {
        this.a = 2;
        this.b = i;
        this.c = xt4Var;
        this.e = aw7Var;
        this.d = dm8Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.e;
        dm8 dm8Var = this.d;
        xt4 xt4Var = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                int h = (int) (dm8Var.h() - 1.0f);
                if (h != i2) {
                    xt4Var.invoke(Integer.valueOf(h));
                } else {
                    aw7Var.setValue(Boolean.FALSE);
                }
                return pvcVar;
            case 1:
                int h2 = (int) (dm8Var.h() - 1.0f);
                if (h2 != i2) {
                    xt4Var.invoke(Integer.valueOf(h2));
                } else {
                    aw7Var.setValue(Boolean.FALSE);
                }
                return pvcVar;
            case 2:
                aw7Var.setValue(Boolean.FALSE);
                int h3 = (int) (dm8Var.h() - 1.0f);
                if (h3 != i2) {
                    xt4Var.invoke(Integer.valueOf(h3));
                }
                return pvcVar;
            default:
                int h4 = (int) (dm8Var.h() - 1.0f);
                if (h4 != i2) {
                    xt4Var.invoke(Integer.valueOf(h4));
                } else {
                    aw7Var.setValue(Boolean.FALSE);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ vo8(int i, xt4 xt4Var, dm8 dm8Var, aw7 aw7Var, int i2) {
        this.a = i2;
        this.b = i;
        this.c = xt4Var;
        this.d = dm8Var;
        this.e = aw7Var;
    }
}
