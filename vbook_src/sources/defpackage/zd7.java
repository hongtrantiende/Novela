package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zd7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ zd7(int i, xt4 xt4Var, aw7 aw7Var, String str) {
        this.a = i;
        this.b = aw7Var;
        this.c = str;
        this.d = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        xt4 xt4Var = this.d;
        String str = this.c;
        aw7 aw7Var = this.b;
        boolean z2 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(1 & intValue, z)) {
                    boolean f = rv4Var.f(aw7Var) | rv4Var.f(str) | rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new be7(0, xt4Var, aw7Var, str);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, qwe.b, rv4Var, 805306368, 510);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    boolean f2 = rv4Var2.f(aw7Var) | rv4Var2.f(str) | rv4Var2.f(xt4Var);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new be7(2, xt4Var, aw7Var, str);
                        rv4Var2.o0(P2);
                    }
                    nmd.j((vt4) P2, null, false, null, null, null, ie2.j, rv4Var2, 805306368, 510);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var3.U(1 & intValue3, z2)) {
                    boolean f3 = rv4Var3.f(aw7Var) | rv4Var3.f(str) | rv4Var3.f(xt4Var);
                    Object P3 = rv4Var3.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new be7(3, xt4Var, aw7Var, str);
                        rv4Var3.o0(P3);
                    }
                    nmd.j((vt4) P3, null, false, null, null, null, wq9.c, rv4Var3, 805306368, 510);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
