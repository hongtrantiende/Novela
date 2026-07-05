package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: as8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class as8 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lzb b;
    public final /* synthetic */ pm1 c;

    public /* synthetic */ as8(lzb lzbVar, pm1 pm1Var, int i) {
        this.a = i;
        this.b = lzbVar;
        this.c = pm1Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pm1 pm1Var = this.c;
        lzb lzbVar = this.b;
        ib3 ib3Var = (ib3) obj;
        switch (i) {
            case 0:
                ib3Var.getClass();
                lzbVar.a.setValue(pm1Var);
                return new bs8(lzbVar, 0);
            default:
                ib3Var.getClass();
                lzbVar.a.setValue(pm1Var);
                return new bs8(lzbVar, 1);
        }
    }
}
