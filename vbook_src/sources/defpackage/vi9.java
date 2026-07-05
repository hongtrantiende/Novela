package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vi9  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi9 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hu4 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vi9(int i, int i2, hu4 hu4Var, Object obj) {
        this.a = i2;
        this.b = i;
        this.c = hu4Var;
        this.d = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        Object obj4 = this.d;
        hu4 hu4Var = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                xt4 xt4Var = (xt4) hu4Var;
                aw7 aw7Var = (aw7) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    for (Number number : xi9.a) {
                        int intValue2 = number.intValue();
                        String d = xi9.d(intValue2, rv4Var);
                        if (intValue2 == i2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z2);
                        boolean f2 = rv4Var.f(xt4Var) | rv4Var.d(intValue2);
                        Object P = rv4Var.P();
                        if (f2 || P == lh9Var) {
                            P = new sm7(xt4Var, intValue2, aw7Var, 4);
                            rv4Var.o0(P);
                        }
                        iue.g(d, null, null, valueOf, null, (vt4) P, rv4Var, 0, 22);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                vt4 vt4Var = (vt4) hu4Var;
                t7d t7dVar = (t7d) obj4;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var2.U(intValue3 & 1, z3)) {
                    ar5 c = rp5.c((wk3) ok3.k0.getValue(), rv4Var2, 0);
                    if (i2 != 0) {
                        if (i2 != 1) {
                            f = -45.0f;
                        } else {
                            f = -135.0f;
                        }
                    } else {
                        f = nae.e;
                    }
                    float f3 = f;
                    nq7 C = zbe.C(mwe.u(kq7.a, false, 2), 16.0f, nae.e, nae.e, nae.e, 14);
                    boolean f4 = rv4Var2.f(vt4Var) | rv4Var2.h(t7dVar);
                    Object P2 = rv4Var2.P();
                    if (f4 || P2 == lh9Var) {
                        P2 = new f7d(vt4Var, t7dVar, 0);
                        rv4Var2.o0(P2);
                    }
                    ote.b(f3, 0, 8, (vt4) P2, rv4Var2, c, C, false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
