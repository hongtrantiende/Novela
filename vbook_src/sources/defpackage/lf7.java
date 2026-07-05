package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lf7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf7 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ do3 b;
    public final /* synthetic */ mu4 c;

    public /* synthetic */ lf7(do3 do3Var, mu4 mu4Var) {
        this.b = do3Var;
        this.c = mu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        mu4 mu4Var = this.c;
        do3 do3Var = this.b;
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
                    if (!k4b.j0((String) do3Var.c.getValue()) && !k4b.j0((String) do3Var.d.getValue())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean f = rv4Var.f(mu4Var) | rv4Var.f(do3Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new mf6(17, mu4Var, do3Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, z2, null, null, null, jce.E(-91895250, new fz6(do3Var, 1), rv4Var), rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                z1d.i(do3Var, mu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ lf7(do3 do3Var, mu4 mu4Var, int i) {
        this.b = do3Var;
        this.c = mu4Var;
    }
}
