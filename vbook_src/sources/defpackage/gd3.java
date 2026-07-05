package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gd3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gd3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt8 b;

    public /* synthetic */ gd3(dt8 dt8Var, int i) {
        this.a = i;
        this.b = dt8Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        dt8 dt8Var = this.b;
        switch (i) {
            case 0:
                ((ib3) obj).getClass();
                return new r6(dt8Var, 8);
            default:
                Throwable th = (Throwable) obj;
                op8 op8Var = dt8Var.b;
                if (op8Var != null) {
                    op8Var.a();
                }
                dt8Var.b = null;
                k27.n(dt8Var.d, null);
                return pvc.a;
        }
    }
}
