package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t41  reason: default package */
/* loaded from: classes.dex */
public final class t41 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t41(int i, xt4 xt4Var) {
        super(1);
        this.a = i;
        this.b = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                qd6 qd6Var = (qd6) obj;
                xt4Var.invoke(qd6Var);
                qd6Var.a();
                return pvc.a;
            case 1:
                return new py5(((Number) xt4Var.invoke(Integer.valueOf((int) (((zy5) obj).a >> 32)))).intValue() << 32);
            case 2:
                return new py5(((Number) xt4Var.invoke(Integer.valueOf((int) (((zy5) obj).a & 4294967295L)))).intValue() & 4294967295L);
            case 3:
                return new py5(((Number) xt4Var.invoke(Integer.valueOf((int) (((zy5) obj).a >> 32)))).intValue() << 32);
            default:
                return new py5(((Number) xt4Var.invoke(Integer.valueOf((int) (((zy5) obj).a & 4294967295L)))).intValue() & 4294967295L);
        }
    }
}
