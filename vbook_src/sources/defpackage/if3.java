package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: if3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class if3 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz7 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ if3(aw7 aw7Var, cz7 cz7Var) {
        this.a = 9;
        this.c = aw7Var;
        this.b = cz7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        cz7 cz7Var = this.b;
        aw7 aw7Var = this.c;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                aw7Var.setValue(Boolean.FALSE);
                lpe.t(cz7Var, str, str2);
                return pvcVar;
            case 1:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                aw7Var.setValue(Boolean.FALSE);
                lpe.t(cz7Var, str3, str4);
                return pvcVar;
            case 2:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                str5.getClass();
                str6.getClass();
                aw7Var.setValue(Boolean.FALSE);
                lpe.t(cz7Var, str5, str6);
                return pvcVar;
            case 3:
                String str7 = (String) obj;
                String str8 = (String) obj2;
                str7.getClass();
                str8.getClass();
                aw7Var.setValue(Boolean.FALSE);
                lpe.t(cz7Var, str7, str8);
                return pvcVar;
            case 4:
                String str9 = (String) obj;
                String str10 = (String) obj2;
                str9.getClass();
                str10.getClass();
                aw7Var.setValue(Boolean.FALSE);
                lpe.t(cz7Var, str9, str10);
                return pvcVar;
            case 5:
                String str11 = (String) obj;
                String str12 = (String) obj2;
                str11.getClass();
                str12.getClass();
                aw7Var.setValue(Boolean.FALSE);
                lpe.t(cz7Var, str11, str12);
                return pvcVar;
            case 6:
                String str13 = (String) obj;
                String str14 = (String) obj2;
                str13.getClass();
                str14.getClass();
                aw7Var.setValue(Boolean.FALSE);
                lpe.t(cz7Var, str13, str14);
                return pvcVar;
            case 7:
                String str15 = (String) obj;
                String str16 = (String) obj2;
                str15.getClass();
                str16.getClass();
                aw7Var.setValue(Boolean.FALSE);
                lpe.t(cz7Var, str15, str16);
                return pvcVar;
            case 8:
                String str17 = (String) obj;
                String str18 = (String) obj2;
                str17.getClass();
                str18.getClass();
                aw7Var.setValue(Boolean.FALSE);
                lpe.t(cz7Var, str17, str18);
                return pvcVar;
            default:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean f = rv4Var.f(aw7Var) | rv4Var.f(cz7Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new rp0(cz7Var, aw7Var, 24);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, bbe.a, rv4Var, 805306368, 510);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ if3(cz7 cz7Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = cz7Var;
        this.c = aw7Var;
    }
}
