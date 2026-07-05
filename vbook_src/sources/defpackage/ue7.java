package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ue7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ue7 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e13 b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ ue7(e13 e13Var, xt4 xt4Var, int i) {
        this.b = e13Var;
        this.c = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        e13 e13Var = this.b;
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
                    boolean f = rv4Var.f(xt4Var) | rv4Var.f(e13Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new mf6(12, xt4Var, e13Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, nxe.a, rv4Var, 805306368, 510);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                k27.e(e13Var, xt4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ ue7(xt4 xt4Var, e13 e13Var) {
        this.c = xt4Var;
        this.b = e13Var;
    }
}
