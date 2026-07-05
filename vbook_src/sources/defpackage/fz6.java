package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fz6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz6 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ do3 b;

    public /* synthetic */ fz6(do3 do3Var, int i) {
        this.a = i;
        this.b = do3Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        y3b y3bVar;
        int i = this.a;
        pvc pvcVar = pvc.a;
        do3 do3Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                rs8.w(str, str2, str3);
                do3Var.b(str, str2, str3);
                return pvcVar;
            case 1:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    if (((Boolean) do3Var.e.getValue()).booleanValue()) {
                        y3bVar = (y3b) v1b.f.getValue();
                    } else {
                        y3bVar = (y3b) o2b.a0.getValue();
                    }
                    cvb.c(yqe.A(y3bVar, rv4Var), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var, 0, 0, 262142);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                rs8.w(str4, str5, str6);
                do3Var.b(str4, str5, str6);
                return pvcVar;
        }
    }
}
