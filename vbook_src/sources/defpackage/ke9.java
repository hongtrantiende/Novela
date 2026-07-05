package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ke9  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke9 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ ke9(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        boolean z3 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (rv4Var.U(intValue & 1, z3)) {
                    cvb.c(yqe.A((y3b) o3b.q0.getValue(), rv4Var), null, this.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.k, rv4Var, 0, 0, 131066);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    nk5.a(rp5.c((wk3) jk3.H.getValue(), rv4Var2, 0), null, pna.n(kq7Var, 20.0f), this.b, rv4Var2, 432, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z2)) {
                    nk5.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var3, 0), null, zbe.y(tte.k(pna.n(kq7Var, 44.0f), uu9.a), 12.0f), this.b, rv4Var3, 48, 0);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
