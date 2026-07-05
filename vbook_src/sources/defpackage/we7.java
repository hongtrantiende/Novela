package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: we7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class we7 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ l13 b;
    public final /* synthetic */ vt4 c;

    public /* synthetic */ we7(l13 l13Var, vt4 vt4Var, int i) {
        this.b = l13Var;
        this.c = vt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        vt4 vt4Var = this.c;
        l13 l13Var = this.b;
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
                    boolean f = rv4Var.f(vt4Var) | rv4Var.f(l13Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new mf6(13, vt4Var, l13Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, p17.a, rv4Var, 805306368, 510);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                z87.f(l13Var, vt4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ we7(vt4 vt4Var, l13 l13Var) {
        this.c = vt4Var;
        this.b = l13Var;
    }
}
