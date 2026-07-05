package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i27  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i27 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ etc b;
    public final /* synthetic */ tu1 c;

    public /* synthetic */ i27(etc etcVar, tu1 tu1Var, int i) {
        this.a = i;
        this.b = etcVar;
        this.c = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        tu1 tu1Var = this.c;
        etc etcVar = this.b;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    b39.a(jce.E(-241536773, new i27(etcVar, tu1Var, 1), rv4Var), rv4Var, 6);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    cvb.a(etcVar.j, tu1Var, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
