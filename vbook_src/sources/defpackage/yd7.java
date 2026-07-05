package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yd7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ String e;

    public /* synthetic */ yd7(xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var, String str) {
        this.a = 1;
        this.b = xt4Var;
        this.c = xt4Var2;
        this.d = aw7Var;
        this.e = str;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = ax1.a;
        boolean z = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    aw7 aw7Var = this.d;
                    boolean z2 = !k4b.j0(((jub) aw7Var.getValue()).a.b);
                    xt4 xt4Var = this.b;
                    String str = this.e;
                    xt4 xt4Var2 = this.c;
                    boolean f = rv4Var.f(xt4Var2) | rv4Var.f(xt4Var) | rv4Var.f(aw7Var) | rv4Var.f(str);
                    Object P = rv4Var.P();
                    if (f || P == obj3) {
                        Object ce7Var = new ce7(0, xt4Var, xt4Var2, aw7Var, str);
                        rv4Var.o0(ce7Var);
                        P = ce7Var;
                    }
                    nmd.j((vt4) P, null, z2, null, null, null, qwe.a, rv4Var, 805306368, 506);
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
                    aw7 aw7Var2 = this.d;
                    boolean z3 = !k4b.j0(((jub) aw7Var2.getValue()).a.b);
                    xt4 xt4Var3 = this.b;
                    boolean f2 = rv4Var2.f(xt4Var3);
                    xt4 xt4Var4 = this.c;
                    String str2 = this.e;
                    boolean f3 = f2 | rv4Var2.f(xt4Var4) | rv4Var2.f(aw7Var2) | rv4Var2.f(str2);
                    Object P2 = rv4Var2.P();
                    if (f3 || P2 == obj3) {
                        P2 = new ce7(xt4Var3, xt4Var4, aw7Var2, str2);
                        rv4Var2.o0(P2);
                    }
                    nmd.j((vt4) P2, null, z3, null, null, null, ie2.i, rv4Var2, 805306368, 506);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                if (rv4Var3.U(intValue3 & 1, z)) {
                    aw7 aw7Var3 = this.d;
                    boolean z4 = !k4b.j0(((jub) aw7Var3.getValue()).a.b);
                    xt4 xt4Var5 = this.b;
                    String str3 = this.e;
                    xt4 xt4Var6 = this.c;
                    boolean f4 = rv4Var3.f(xt4Var6) | rv4Var3.f(xt4Var5) | rv4Var3.f(aw7Var3) | rv4Var3.f(str3);
                    Object P3 = rv4Var3.P();
                    if (f4 || P3 == obj3) {
                        Object ce7Var2 = new ce7(2, xt4Var5, xt4Var6, aw7Var3, str3);
                        rv4Var3.o0(ce7Var2);
                        P3 = ce7Var2;
                    }
                    nmd.j((vt4) P3, null, z4, null, null, null, wq9.b, rv4Var3, 805306368, 506);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ yd7(int i, xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var, String str) {
        this.a = i;
        this.b = xt4Var;
        this.d = aw7Var;
        this.e = str;
        this.c = xt4Var2;
    }
}
