package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pe7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ pe7(int i, xt4 xt4Var, String str) {
        this.a = i;
        this.b = str;
        this.c = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        xt4 xt4Var = this.c;
        String str = this.b;
        zn1 zn1Var = (zn1) obj;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                zn1Var.getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq2.d(0, xt4Var, rv4Var, zbe.x(pna.f(kq7Var, 1.0f), mwe.f(14, rv4Var, false)), str);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                zn1Var.getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    tc4.d(0, xt4Var, rv4Var, mwe.x(pna.f(kq7Var, 1.0f), 14), str);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
