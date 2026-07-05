package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qu0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qu0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qu0(ar5 ar5Var, nq7 nq7Var, vt4 vt4Var, int i, int i2) {
        this.a = 1;
        this.e = ar5Var;
        this.b = nq7Var;
        this.f = vt4Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.b;
        pvc pvcVar = pvc.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hc2.b((nq7) obj3, (dc) obj5, (tu1) obj4, (rv4) obj, xoe.p(i2 | 1), this.d);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                pc2.a((ar5) obj5, (nq7) obj3, (vt4) obj4, (rv4) obj, xoe.p(i2 | 1), this.d);
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                qwe.h((rj8) obj5, this.c, this.d, (nq7) obj3, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                zpe.a(this.b, this.c, (bi6) obj5, (tu1) obj4, (rv4) obj, xoe.p(this.d | 1));
                return pvcVar;
            case 4:
                ((Integer) obj2).getClass();
                jsc.g((nq7) obj3, (ar5) obj5, (String) obj4, (rv4) obj, xoe.p(i2 | 1), this.d);
                return pvcVar;
            case 5:
                xt4 xt4Var = (xt4) obj3;
                xt4 xt4Var2 = (xt4) obj5;
                aw7 aw7Var = (aw7) obj4;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean z2 = !k4b.j0(((jub) aw7Var.getValue()).a.b);
                    boolean f = rv4Var.f(xt4Var) | rv4Var.f(xt4Var2) | rv4Var.f(aw7Var);
                    int i3 = this.c;
                    int i4 = this.d;
                    boolean d = f | rv4Var.d(i3) | rv4Var.d(i4);
                    Object P = rv4Var.P();
                    if (d || P == ax1.a) {
                        cn7 cn7Var = new cn7(xt4Var, xt4Var2, i3, i4, aw7Var);
                        rv4Var.o0(cn7Var);
                        P = cn7Var;
                    }
                    nmd.j((vt4) P, null, z2, null, null, null, zr1.a, rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p = xoe.p(1);
                int i5 = this.c;
                int i6 = this.d;
                jce.c(i5, i6, p, (lu4) obj4, (rv4) obj, (nq7) obj3, (String) obj5);
                return pvcVar;
        }
    }

    public /* synthetic */ qu0(Object obj, int i, int i2, nq7 nq7Var, hu4 hu4Var, int i3, int i4) {
        this.a = i4;
        this.e = obj;
        this.c = i;
        this.d = i2;
        this.b = nq7Var;
        this.f = hu4Var;
    }

    public /* synthetic */ qu0(Object obj, int i, bi6 bi6Var, tu1 tu1Var, int i2) {
        this.a = 3;
        this.b = obj;
        this.c = i;
        this.e = bi6Var;
        this.f = tu1Var;
        this.d = i2;
    }

    public /* synthetic */ qu0(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
        this.d = i2;
    }
}
