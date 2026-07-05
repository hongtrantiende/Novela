package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tf0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz7 b;

    public /* synthetic */ tf0(jz7 jz7Var, int i) {
        this.a = i;
        this.b = jz7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.a;
        pvc pvcVar = pvc.a;
        jz7 jz7Var = this.b;
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
                    jz7Var.a(0, rv4Var);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    jz7Var.a(0, rv4Var);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 2:
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var.U(intValue & 1, z3)) {
                    jz7Var.a(0, rv4Var);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                if ((intValue & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var.U(intValue & 1, z4)) {
                    jz7Var.a(0, rv4Var);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
