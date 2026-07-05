package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: az6  reason: default package */
/* loaded from: classes.dex */
public final class az6 extends fb6 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az6(int i, int i2, tu1 tu1Var) {
        super(2);
        this.a = i2;
        this.b = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        tu1 tu1Var = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                fxe.g(tu1Var, rv4Var, xoe.p(7));
                return pvcVar;
            default:
                pha.b(tu1Var, rv4Var, xoe.p(7));
                return pvcVar;
        }
    }
}
