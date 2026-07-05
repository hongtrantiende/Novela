package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fm5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm5 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur5 b;

    public /* synthetic */ fm5(ur5 ur5Var, int i) {
        this.a = i;
        this.b = ur5Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ur5 ur5Var = this.b;
        switch (i) {
            case 0:
                List list = (List) ur5Var.K.getValue();
                if (list == null) {
                    list = ks3.a;
                }
                if (ur5Var.S < list.size() - 1) {
                    ur5Var.t(ur5Var.S + 1, nae.e);
                }
                return pvcVar;
            case 1:
                int i2 = ur5Var.S;
                if (i2 > 0) {
                    ur5Var.t(i2 - 1, nae.e);
                }
                return pvcVar;
            case 2:
                ur5Var.getClass();
                hk1 a = jdd.a(ur5Var);
                sw2 sw2Var = ab3.a;
                ur5Var.f(a, ru2.c, new c95(ur5Var, null, 4));
                return pvcVar;
            case 3:
                ur5Var.getClass();
                hk1 a2 = jdd.a(ur5Var);
                sw2 sw2Var2 = ab3.a;
                ur5Var.f(a2, ru2.c, new c95(ur5Var, null, 4));
                return pvcVar;
            default:
                int i3 = ur5Var.S;
                hk1 a3 = jdd.a(ur5Var);
                sw2 sw2Var3 = ab3.a;
                ur5Var.f(a3, ru2.c, new mo(i3, null, ur5Var));
                return pvcVar;
        }
    }
}
