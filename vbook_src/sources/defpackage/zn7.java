package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zn7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vxb b;

    public /* synthetic */ zn7(vxb vxbVar, int i) {
        this.a = i;
        this.b = vxbVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        vxb vxbVar = this.b;
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
                    if (vxbVar.a) {
                        rv4Var.e0(-284238729);
                        ts6.a(2.0f, 48, 1, 0L, rv4Var, zbe.y(tte.k(pna.n(kq7Var, 44.0f), uu9.a), 12.0f));
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-283952506);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    if (vxbVar.a) {
                        rv4Var2.e0(-1948193605);
                        ts6.a(2.0f, 48, 1, 0L, rv4Var2, zbe.y(tte.k(pna.n(kq7Var, 44.0f), uu9.a), 12.0f));
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(-1947886519);
                        nk5.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var2, 0), null, zbe.y(tte.k(pna.n(kq7Var, 44.0f), uu9.a), 12.0f), ((h27) rv4Var2.j(j27.a)).a.q, rv4Var2, 48, 0);
                        rv4Var2.q(false);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
