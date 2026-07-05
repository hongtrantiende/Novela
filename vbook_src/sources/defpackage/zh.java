package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zh  reason: default package */
/* loaded from: classes.dex */
public final class zh extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z53 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh(z53 z53Var, int i) {
        super(1);
        this.a = i;
        this.b = z53Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        z53 z53Var = this.b;
        switch (i) {
            case 0:
                ib3 ib3Var = (ib3) obj;
                z53Var.show();
                return new r6(z53Var, 1);
            default:
                if0 if0Var = (if0) obj;
                if (z53Var.f.a) {
                    z53Var.e.invoke();
                }
                return pvc.a;
        }
    }
}
