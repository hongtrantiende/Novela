package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zi0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zi0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytb b;

    public /* synthetic */ zi0(ytb ytbVar, int i, int i2) {
        this.a = i2;
        this.b = ytbVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ytb ytbVar = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                hj0.f(ytbVar, rv4Var, xoe.p(1));
                return pvcVar;
            default:
                hj0.e(ytbVar, rv4Var, xoe.p(1));
                return pvcVar;
        }
    }
}
