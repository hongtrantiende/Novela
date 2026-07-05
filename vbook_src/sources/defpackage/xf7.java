package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xf7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xf7 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ho3 b;
    public final /* synthetic */ nu4 c;

    public /* synthetic */ xf7(ho3 ho3Var, nu4 nu4Var) {
        this.b = ho3Var;
        this.c = nu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        nu4 nu4Var = this.c;
        ho3 ho3Var = this.b;
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
                    if (!k4b.j0((String) ho3Var.c.getValue()) && !k4b.j0((String) ho3Var.d.getValue())) {
                        z2 = true;
                    }
                    boolean f = rv4Var.f(nu4Var) | rv4Var.f(ho3Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new mf6(20, nu4Var, ho3Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, z2, null, null, null, jce.E(462120928, new qo4(ho3Var, 28), rv4Var), rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                sxd.a(ho3Var, nu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ xf7(ho3 ho3Var, nu4 nu4Var, int i) {
        this.b = ho3Var;
        this.c = nu4Var;
    }
}
