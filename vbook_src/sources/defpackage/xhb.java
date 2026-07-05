package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xhb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xhb implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ aib b;
    public final /* synthetic */ whb c;
    public final /* synthetic */ long d;

    public /* synthetic */ xhb(aib aibVar, whb whbVar, long j) {
        this.b = aibVar;
        this.c = whbVar;
        this.d = j;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    this.b.a(this.c, this.d, rv4Var, 512);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                this.b.a(this.c, this.d, (rv4) obj, xoe.p(513));
                return pvcVar;
        }
    }

    public /* synthetic */ xhb(aib aibVar, whb whbVar, long j, int i) {
        this.b = aibVar;
        this.c = whbVar;
        this.d = j;
    }
}
