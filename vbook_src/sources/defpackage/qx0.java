package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qx0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tmc b;

    public /* synthetic */ qx0(tmc tmcVar, int i) {
        this.a = i;
        this.b = tmcVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        tmc tmcVar = this.b;
        kq7 kq7Var = kq7.a;
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
                    b16.n(tmcVar.a, tte.k(pna.n(kq7Var, 24.0f), uu9.a), rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                String str = tmcVar.a;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                u22 u22Var = r0f.d;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    if (str.equals("qt")) {
                        rv4Var2.e0(43596755);
                        dxe.i(rp5.a((wk3) ok3.C.getValue(), rv4Var2, 0), null, tte.k(pna.n(kq7Var, 24.0f), uu9.a), rv4Var2, 24624, 232);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(43984100);
                        do5.a(new h54(0L, str, ""), u22Var, false, null, null, null, tte.k(pna.n(kq7Var, 24.0f), uu9.a), null, rv4Var2, 805306416, 380);
                        rv4Var2.q(false);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                String str2 = tmcVar.a;
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                u22 u22Var2 = r0f.d;
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    if (str2.equals("qt")) {
                        rv4Var3.e0(-118049745);
                        dxe.i(rp5.a((wk3) ok3.C.getValue(), rv4Var3, 0), null, tte.k(pna.n(kq7Var, 24.0f), uu9.a), rv4Var3, 24624, 232);
                        rv4Var3.q(false);
                    } else {
                        rv4Var3.e0(-117606848);
                        do5.a(new h54(0L, str2, ""), u22Var2, false, null, null, null, tte.k(pna.n(kq7Var, 24.0f), uu9.a), null, rv4Var3, 805306416, 380);
                        rv4Var3.q(false);
                    }
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
