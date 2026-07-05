package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n65  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class n65 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ n65(boolean z, vt4 vt4Var, xt4 xt4Var) {
        this.a = 1;
        this.b = z;
        this.c = vt4Var;
        this.d = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        vt4 vt4Var = this.c;
        xt4 xt4Var = this.d;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kxe.f(z2, xt4Var, vt4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 1:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean z3 = !z2;
                    boolean f = rv4Var.f(vt4Var) | rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new o65(1, vt4Var, xt4Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, z3, null, null, null, jxe.a, rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                yqe.h(z2, xt4Var, vt4Var, (rv4) obj, xoe.p(49));
                return pvcVar;
        }
    }

    public /* synthetic */ n65(boolean z, xt4 xt4Var, vt4 vt4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = xt4Var;
        this.c = vt4Var;
    }
}
