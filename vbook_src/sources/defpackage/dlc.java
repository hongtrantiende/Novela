package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dlc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dlc implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ vt4 d;

    public /* synthetic */ dlc(String str, xt4 xt4Var, vt4 vt4Var, int i) {
        this.a = i;
        this.b = str;
        this.c = xt4Var;
        this.d = vt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        boolean z = false;
        xt4 xt4Var = this.c;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((su0) obj).getClass();
        int i2 = intValue & 17;
        switch (i) {
            case 0:
                if (i2 != 16) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean f = rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new ngc(3, xt4Var);
                        rv4Var.o0(P);
                    }
                    cae.p("", this.b, (vt4) P, this.d, rv4Var, 384);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                if (i2 != 16) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean f2 = rv4Var.f(xt4Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new ngc(4, xt4Var);
                        rv4Var.o0(P2);
                    }
                    cae.p("", this.b, (vt4) P2, this.d, rv4Var, 384);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
