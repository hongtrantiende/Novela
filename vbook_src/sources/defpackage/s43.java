package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s43  reason: default package */
/* loaded from: classes3.dex */
public final class s43 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ us9 b;

    public /* synthetic */ s43(us9 us9Var, int i) {
        this.a = i;
        this.b = us9Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        us9 us9Var = this.b;
        boolean z = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Number) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nqe.p(us9Var, pna.f(kq7Var, 1.0f), rv4Var, 48);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    nqe.p(us9Var, pna.f(kq7Var, 1.0f), rv4Var2, 48);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
