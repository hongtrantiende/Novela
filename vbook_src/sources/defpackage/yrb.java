package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yrb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yrb implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ lu4 c;

    public /* synthetic */ yrb(long j, lu4 lu4Var, int i) {
        this.a = 2;
        this.b = j;
        this.c = lu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lu4 lu4Var = this.c;
        long j = this.b;
        rv4 rv4Var = (rv4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    dxe.d(j, lu4Var, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var.U(intValue2 & 1, z2)) {
                    dxe.d(j, lu4Var, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                num.getClass();
                dxe.d(j, lu4Var, rv4Var, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ yrb(long j, lu4 lu4Var, int i, byte b) {
        this.a = i;
        this.b = j;
        this.c = lu4Var;
    }
}
