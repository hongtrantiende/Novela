package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pq1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq1 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytb b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tu1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ pq1(ytb ytbVar, boolean z, tu1 tu1Var, int i, int i2) {
        this.a = i2;
        this.b = ytbVar;
        this.c = z;
        this.d = tu1Var;
        this.e = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        tu1 tu1Var = this.d;
        boolean z = this.c;
        ytb ytbVar = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                qwe.c(ytbVar, z, tu1Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            default:
                q0f.c(ytbVar, z, tu1Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
        }
    }
}
