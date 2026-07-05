package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jj0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kvb b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ jj0(kvb kvbVar, xt4 xt4Var, int i) {
        this.a = i;
        this.b = kvbVar;
        this.c = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        xt4 xt4Var = this.c;
        kvb kvbVar = this.b;
        switch (i) {
            case 0:
                fvb fvbVar = (fvb) obj;
                if (kvbVar != null) {
                    kvbVar.a.setValue(fvbVar);
                }
                if (xt4Var != null) {
                    xt4Var.invoke(fvbVar);
                }
                return pvc.a;
            default:
                ib3 ib3Var = (ib3) obj;
                kvbVar.c.add(xt4Var);
                return new qf0(12, kvbVar, xt4Var);
        }
    }
}
