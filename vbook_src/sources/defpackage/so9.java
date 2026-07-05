package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: so9  reason: default package */
/* loaded from: classes.dex */
public final class so9 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so9(vo9 vo9Var, int i) {
        super(1);
        this.a = i;
        this.b = vo9Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        vo9 vo9Var = this.b;
        switch (i) {
            case 0:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                t15Var.i(y78.h(vo9Var.e()));
                return pvcVar;
            case 1:
                t15 t15Var2 = (t15) obj;
                t15Var2.getClass();
                t15Var2.x(y78.g(vo9Var.e()));
                return pvcVar;
            case 2:
                t15 t15Var3 = (t15) obj;
                t15Var3.getClass();
                t15Var3.i(y78.h(((y78) vo9Var.t.e()).a));
                return pvcVar;
            default:
                t15 t15Var4 = (t15) obj;
                t15Var4.getClass();
                t15Var4.x(y78.g(((y78) vo9Var.t.e()).a));
                return pvcVar;
        }
    }
}
