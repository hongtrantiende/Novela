package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z0a  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0a implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu1 b;

    public /* synthetic */ z0a(tu1 tu1Var, int i) {
        this.a = i;
        this.b = tu1Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.a;
        int i2 = 2;
        pvc pvcVar = pvc.a;
        boolean z5 = true;
        boolean z6 = false;
        tu1 tu1Var = this.b;
        switch (i) {
            case 0:
                rh8 rh8Var = (rh8) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                rh8Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(rh8Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z6 = true;
                }
                if (rv4Var.U(intValue & 1, z6)) {
                    fxe.i(zf0.b((dc6) rv4Var.j(zf0.a), rv4Var).a0(pna.c), jce.E(-2094724865, new em7(5, tu1Var, rh8Var), rv4Var), rv4Var, 48);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    tu1Var.invoke(rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                su0 su0Var = (su0) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var3.f(su0Var)) {
                        i2 = 4;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 19) == 18) {
                    z5 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z5)) {
                    tu1Var.c(su0Var, rv4Var3, Integer.valueOf(intValue3 & 14));
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z2)) {
                    tu1Var.invoke(rv4Var4, 0);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                rv4 rv4Var5 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z6 = true;
                }
                if (rv4Var5.U(intValue5 & 1, z6)) {
                    tu1Var.invoke(rv4Var5, 6);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 5:
                rv4 rv4Var6 = (rv4) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z3)) {
                    tu1Var.invoke(rv4Var6, 0);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var7 = (rv4) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var7.U(intValue7 & 1, z4)) {
                    tu1Var.invoke(rv4Var7, 0);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
        }
    }
}
