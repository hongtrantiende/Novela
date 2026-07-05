package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu4 b;
    public final /* synthetic */ lu4 c;

    public /* synthetic */ qb(lu4 lu4Var, lu4 lu4Var2, int i) {
        this.a = i;
        this.b = lu4Var;
        this.c = lu4Var2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        lu4 lu4Var = this.c;
        lu4 lu4Var2 = this.b;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    xb.c(xb.c, xb.d, jce.E(794666856, new qb(lu4Var2, lu4Var, 1), rv4Var), rv4Var, 438);
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
                    if (lu4Var2 == null) {
                        rv4Var.e0(60612465);
                    } else {
                        rv4Var.e0(-829328752);
                        lu4Var2.invoke(rv4Var, 0);
                    }
                    rv4Var.q(false);
                    if (lu4Var == null) {
                        rv4Var.e0(60660081);
                    } else {
                        rv4Var.e0(-829327216);
                        lu4Var.invoke(rv4Var, 0);
                    }
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
