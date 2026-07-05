package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ys9  reason: default package */
/* loaded from: classes.dex */
public final class ys9 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys9(zs9 zs9Var, int i) {
        super(1);
        this.a = i;
        this.b = zs9Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        zs9 zs9Var = this.b;
        switch (i) {
            case 0:
                return Double.valueOf(zs9Var.n.c(dce.l(((Number) obj).doubleValue(), zs9Var.e, zs9Var.f)));
            default:
                return Double.valueOf(dce.l(zs9Var.k.c(((Number) obj).doubleValue()), zs9Var.e, zs9Var.f));
        }
    }
}
