package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mj7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ mj7(aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = aw7Var3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        aw7 aw7Var = this.d;
        aw7 aw7Var2 = this.c;
        aw7 aw7Var3 = this.b;
        switch (i) {
            case 0:
                pc9 pc9Var = (pc9) obj;
                boolean z = true;
                if ((!((Boolean) aw7Var3.getValue()).booleanValue() || pc9Var.b != 0) && ((!((Boolean) aw7Var2.getValue()).booleanValue() || pc9Var.b != 1) && (!((Boolean) aw7Var.getValue()).booleanValue() || pc9Var.b != 2))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                sc6 sc6Var = (sc6) obj;
                sc6Var.getClass();
                aw7Var3.setValue(new y78(sc6Var.m(0L)));
                sc6 Z = sc6Var.Z();
                if (Z != null) {
                    aw7Var2.setValue(Float.valueOf((int) (Z.a() & 4294967295L)));
                    aw7Var.setValue(Float.valueOf((int) (Z.a() >> 32)));
                }
                return pvc.a;
        }
    }
}
