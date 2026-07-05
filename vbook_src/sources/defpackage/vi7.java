package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vi7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vi7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ vi7(int i, int i2, xt4 xt4Var, boolean z) {
        this.a = i2;
        this.b = z;
        this.c = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        lh9 lh9Var = ax1.a;
        boolean z = false;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean z3 = !z2;
                    boolean f = rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new hg7(8, xt4Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, z3, null, null, null, bze.b, rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    boolean z4 = !z2;
                    boolean f2 = rv4Var2.f(xt4Var);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new hg7(9, xt4Var);
                        rv4Var2.o0(P2);
                    }
                    nmd.j((vt4) P2, null, z4, null, null, null, eze.c, rv4Var2, 805306368, 506);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                xbe.a(z2, xt4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                xbe.c(z2, xt4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                xbe.b(z2, xt4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ vi7(int i, xt4 xt4Var, boolean z) {
        this.a = i;
        this.b = z;
        this.c = xt4Var;
    }
}
