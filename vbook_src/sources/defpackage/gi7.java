package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gi7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yya b;

    public /* synthetic */ gi7(yya yyaVar, int i) {
        this.a = i;
        this.b = yyaVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        float f;
        int i = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        boolean z2 = false;
        yya yyaVar = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    tza tzaVar = j27.a;
                    cvb.c((String) yyaVar.getValue(), zbe.z(kq7Var, 16.0f, 10.0f), ((h27) rv4Var.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.m, rv4Var, 48, 24960, 110584);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    String str = (String) yyaVar.getValue();
                    tza tzaVar2 = j27.a;
                    cvb.c(str, zbe.z(kq7Var, 16.0f, 10.0f), ((h27) rv4Var2.j(tzaVar2)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar2)).b.m, rv4Var2, 48, 24960, 110584);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var3.U(intValue3 & 1, z)) {
                    ar5 c = rp5.c((wk3) jk3.d.getValue(), rv4Var3, 0);
                    nq7 n = pna.n(kq7Var, 24.0f);
                    if (((Number) yyaVar.getValue()).intValue() > 0) {
                        f = -90.0f;
                    } else {
                        f = 90.0f;
                    }
                    nk5.a(c, null, tte.t(n, f), 0L, rv4Var3, 48, 8);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var4.U(intValue4 & 1, z2)) {
                    String str2 = (String) yyaVar.getValue();
                    tza tzaVar3 = j27.a;
                    cvb.c(str2, zbe.z(kq7Var, 16.0f, 10.0f), ((h27) rv4Var4.j(tzaVar3)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var4.j(tzaVar3)).b.m, rv4Var4, 48, 24960, 110584);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
