package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pg7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz4 b;

    public /* synthetic */ pg7(rz4 rz4Var, int i) {
        this.a = 2;
        this.b = rz4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        lh9 lh9Var = ax1.a;
        boolean z = false;
        pvc pvcVar = pvc.a;
        rz4 rz4Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean f = rv4Var.f(rz4Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new u76(rz4Var, 10);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, ak0.b, rv4Var, 805306368, 510);
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
                    String str = (String) rz4Var.b.getValue();
                    nq7 A = zbe.A(kq7.a, 12.0f, nae.e, 2);
                    boolean f2 = rv4Var2.f(rz4Var);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new og7(rz4Var, 1);
                        rv4Var2.o0(P2);
                    }
                    cae.c(432, (xt4) P2, rv4Var2, A, str);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                cae.f(rz4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ pg7(rz4 rz4Var, int i, byte b) {
        this.a = i;
        this.b = rz4Var;
    }
}
