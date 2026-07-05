package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dg7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dg7 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ io3 b;
    public final /* synthetic */ nu4 c;

    public /* synthetic */ dg7(io3 io3Var, nu4 nu4Var) {
        this.b = io3Var;
        this.c = nu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        nu4 nu4Var = this.c;
        io3 io3Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z2 = false;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    if (((String) io3Var.b.getValue()).length() > 0) {
                        z2 = true;
                    }
                    boolean f = rv4Var.f(nu4Var) | rv4Var.f(io3Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new mf6(21, nu4Var, io3Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, z2, null, null, null, jce.E(1666714053, new qo4(io3Var, 29), rv4Var), rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                l0e.c(io3Var, nu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ dg7(io3 io3Var, nu4 nu4Var, int i) {
        this.b = io3Var;
        this.c = nu4Var;
    }
}
