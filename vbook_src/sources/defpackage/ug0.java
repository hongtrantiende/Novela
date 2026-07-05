package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ug0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mu4 b;

    public /* synthetic */ ug0(mu4 mu4Var, int i) {
        this.a = i;
        this.b = mu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        mu4 mu4Var = this.b;
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
                    mu4Var.c(jv9.a, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                mu4Var.c(num, num2, "");
                return pvcVar;
        }
    }
}
