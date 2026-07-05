package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jf7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf7 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ co3 b;
    public final /* synthetic */ lu4 c;

    public /* synthetic */ jf7(co3 co3Var, lu4 lu4Var) {
        this.b = co3Var;
        this.c = lu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lu4 lu4Var = this.c;
        co3 co3Var = this.b;
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
                    if (!k4b.j0((String) co3Var.b.getValue()) && !k4b.j0((String) co3Var.c.getValue())) {
                        z2 = true;
                    }
                    boolean f = rv4Var.f(lu4Var) | rv4Var.f(co3Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new mf6(16, lu4Var, co3Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, z2, null, null, null, jce.E(-36197915, new qo4(co3Var, 25), rv4Var), rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                jsc.e(co3Var, lu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ jf7(co3 co3Var, lu4 lu4Var, int i) {
        this.b = co3Var;
        this.c = lu4Var;
    }
}
