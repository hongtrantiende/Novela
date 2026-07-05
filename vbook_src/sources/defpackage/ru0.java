package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ru0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu1 b;
    public final /* synthetic */ su0 c;

    public /* synthetic */ ru0(tu1 tu1Var, su0 su0Var, int i) {
        this.a = i;
        this.b = tu1Var;
        this.c = su0Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        su0 su0Var = this.c;
        tu1 tu1Var = this.b;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    tu1Var.c(su0Var, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    tu1Var.c(su0Var, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
