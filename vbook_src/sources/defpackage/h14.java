package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h14  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class h14 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t14 b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ h14(t14 t14Var, xt4 xt4Var, int i) {
        this.a = 4;
        this.b = t14Var;
        this.c = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = false;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        t14 t14Var = this.b;
        rv4 rv4Var = (rv4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    iue.b(t14Var, null, xt4Var, rv4Var, 8);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue2 & 1, z)) {
                    iue.s(t14Var, null, xt4Var, rv4Var, 8);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 2:
                int intValue3 = num.intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue3 & 1, z)) {
                    iue.A(t14Var, null, xt4Var, rv4Var, 8);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 3:
                int intValue4 = num.intValue();
                if ((intValue4 & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue4 & 1, z)) {
                    iue.c(t14Var, null, xt4Var, rv4Var, 8);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                num.getClass();
                iue.b(t14Var, kq7.a, xt4Var, rv4Var, xoe.p(9));
                return pvcVar;
        }
    }

    public /* synthetic */ h14(t14 t14Var, xt4 xt4Var, int i, byte b) {
        this.a = i;
        this.b = t14Var;
        this.c = xt4Var;
    }
}
