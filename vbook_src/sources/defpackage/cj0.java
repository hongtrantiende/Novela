package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cj0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytb b;

    public /* synthetic */ cj0(ytb ytbVar, int i) {
        this.a = i;
        this.b = ytbVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ytb ytbVar = this.b;
        switch (i) {
            case 0:
                ib3 ib3Var = (ib3) obj;
                return new r6(ytbVar, 5);
            case 1:
                y78 y78Var = (y78) obj;
                x2c x2cVar = (x2c) ytbVar.t.getValue();
                x2c x2cVar2 = x2c.b;
                if (x2cVar == x2cVar2) {
                    x2cVar2 = x2c.a;
                }
                ytbVar.w(x2cVar2);
                return pvcVar;
            default:
                Throwable th = (Throwable) obj;
                ytbVar.d();
                return pvcVar;
        }
    }
}
