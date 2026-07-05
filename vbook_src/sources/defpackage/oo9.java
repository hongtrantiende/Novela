package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oo9  reason: default package */
/* loaded from: classes.dex */
public final class oo9 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo9(qo9 qo9Var, int i) {
        super(1);
        this.a = i;
        this.b = qo9Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        qo9 qo9Var = this.b;
        switch (i) {
            case 0:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                t15Var.i(y78.h(qo9Var.e()));
                t15Var.x(y78.g(qo9Var.e()));
                return pvcVar;
            default:
                t15 t15Var2 = (t15) obj;
                t15Var2.getClass();
                t15Var2.i(y78.h(((y78) qo9Var.t.e()).a));
                t15Var2.x(y78.g(((y78) qo9Var.t.e()).a));
                return pvcVar;
        }
    }
}
