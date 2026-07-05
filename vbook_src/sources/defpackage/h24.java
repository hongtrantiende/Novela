package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h24  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class h24 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ h24(xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var) {
        this.a = 1;
        this.b = xt4Var;
        this.c = xt4Var2;
        this.d = aw7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        boolean z = false;
        xt4 xt4Var = this.c;
        aw7 aw7Var = this.d;
        xt4 xt4Var2 = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean f = rv4Var.f(xt4Var2) | rv4Var.f(aw7Var) | rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new j24(1, xt4Var2, xt4Var, aw7Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, tte.a, rv4Var, 805306368, 510);
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
                    boolean z2 = !k4b.j0((String) aw7Var.getValue());
                    boolean f2 = rv4Var2.f(xt4Var2) | rv4Var2.f(xt4Var) | rv4Var2.f(aw7Var);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new j24(2, xt4Var2, xt4Var, aw7Var);
                        rv4Var2.o0(P2);
                    }
                    nmd.j((vt4) P2, null, z2, null, null, null, bue.b, rv4Var2, 805306368, 506);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                if (rv4Var3.U(intValue3 & 1, z)) {
                    boolean z3 = !k4b.j0((String) aw7Var.getValue());
                    boolean f3 = rv4Var3.f(xt4Var2) | rv4Var3.f(aw7Var) | rv4Var3.f(xt4Var);
                    Object P3 = rv4Var3.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new j24(3, xt4Var2, xt4Var, aw7Var);
                        rv4Var3.o0(P3);
                    }
                    nmd.j((vt4) P3, null, z3, null, null, null, uwe.a, rv4Var3, 805306368, 506);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z = true;
                }
                if (rv4Var4.U(intValue4 & 1, z)) {
                    boolean z4 = !k4b.j0((String) aw7Var.getValue());
                    boolean f4 = rv4Var4.f(xt4Var2) | rv4Var4.f(aw7Var) | rv4Var4.f(xt4Var);
                    Object P4 = rv4Var4.P();
                    if (f4 || P4 == lh9Var) {
                        P4 = new j24(4, xt4Var2, xt4Var, aw7Var);
                        rv4Var4.o0(P4);
                    }
                    nmd.j((vt4) P4, null, z4, null, null, null, aye.a, rv4Var4, 805306368, 506);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var5 = (rv4) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z = true;
                }
                if (rv4Var5.U(intValue5 & 1, z)) {
                    boolean z5 = !k4b.j0((String) aw7Var.getValue());
                    boolean f5 = rv4Var5.f(xt4Var2) | rv4Var5.f(aw7Var) | rv4Var5.f(xt4Var);
                    Object P5 = rv4Var5.P();
                    if (f5 || P5 == lh9Var) {
                        P5 = new j24(6, xt4Var2, xt4Var, aw7Var);
                        rv4Var5.o0(P5);
                    }
                    nmd.j((vt4) P5, null, z5, null, null, null, aze.a, rv4Var5, 805306368, 506);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ h24(int i, xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var) {
        this.a = i;
        this.b = xt4Var;
        this.d = aw7Var;
        this.c = xt4Var2;
    }
}
