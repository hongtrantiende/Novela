package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: me7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class me7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ me7(boolean z, xt4 xt4Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = z;
        this.c = xt4Var;
        this.d = aw7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        aw7 aw7Var = this.d;
        xt4 xt4Var = this.c;
        boolean z2 = this.b;
        boolean z3 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (rv4Var.U(intValue & 1, z3)) {
                    boolean g = rv4Var.g(z2) | rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (g || P == lh9Var) {
                        P = new oe7(z2, xt4Var, aw7Var, 1);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, fxe.a, rv4Var, 805306368, 510);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(1 & intValue2, z)) {
                    boolean g2 = rv4Var2.g(z2) | rv4Var2.f(xt4Var);
                    Object P2 = rv4Var2.P();
                    if (g2 || P2 == lh9Var) {
                        P2 = new oe7(z2, xt4Var, aw7Var, 0);
                        rv4Var2.o0(P2);
                    }
                    nmd.j((vt4) P2, null, false, null, null, null, hxe.a, rv4Var2, 805306368, 510);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
