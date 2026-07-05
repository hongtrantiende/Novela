package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z27  reason: default package */
/* loaded from: classes.dex */
public final class z27 extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a37 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z27(a37 a37Var, int i) {
        super(0);
        this.a = i;
        this.b = a37Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        lw8 placementScope;
        int i = this.a;
        pvc pvcVar = pvc.a;
        a37 a37Var = this.b;
        switch (i) {
            case 0:
                sd6 sd6Var = a37Var.f;
                sd6Var.i = 0;
                gw7 z = sd6Var.a.z();
                Object[] objArr = z.a;
                int i2 = z.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    a37 a37Var2 = ((od6) objArr[i3]).d0.p;
                    a37Var2.D = a37Var2.E;
                    a37Var2.E = Integer.MAX_VALUE;
                    a37Var2.Q = false;
                    if (a37Var2.H == md6.b) {
                        a37Var2.H = md6.c;
                    }
                }
                od6 od6Var = sd6Var.a;
                od6 od6Var2 = sd6Var.a;
                gw7 z2 = od6Var.z();
                Object[] objArr2 = z2.a;
                int i4 = z2.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((od6) objArr2[i5]).d0.p.U.d = false;
                }
                if (a37Var.n().K) {
                    iv7 iv7Var = (iv7) od6Var2.o();
                    int i6 = ((gw7) iv7Var.b).c;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((i38) ((od6) iv7Var.get(i7)).c0.e).K = true;
                    }
                }
                a37Var.n().V0().a();
                if (a37Var.n().K) {
                    iv7 iv7Var2 = (iv7) od6Var2.o();
                    int i8 = ((gw7) iv7Var2.b).c;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((i38) ((od6) iv7Var2.get(i9)).c0.e).K = false;
                    }
                }
                gw7 z3 = od6Var2.z();
                Object[] objArr3 = z3.a;
                int i10 = z3.c;
                for (int i11 = 0; i11 < i10; i11++) {
                    od6 od6Var3 = (od6) objArr3[i11];
                    sd6 sd6Var2 = od6Var3.d0;
                    if (sd6Var2.p.D != od6Var3.w()) {
                        od6Var2.Q();
                        od6Var2.D();
                        if (od6Var3.w() == Integer.MAX_VALUE) {
                            if (sd6Var2.c || xbe.F(od6Var3)) {
                                xy6 xy6Var = sd6Var2.q;
                                xy6Var.getClass();
                                xy6Var.M0(false);
                            }
                            sd6Var2.p.N0();
                        }
                    }
                }
                gw7 z4 = od6Var2.z();
                Object[] objArr4 = z4.a;
                int i12 = z4.c;
                for (int i13 = 0; i13 < i12; i13++) {
                    pd6 pd6Var = ((od6) objArr4[i13]).d0.p.U;
                    pd6Var.e = pd6Var.d;
                }
                return pvcVar;
            case 1:
                a37Var.f.a().M(a37Var.Y);
                return pvcVar;
            default:
                sd6 sd6Var3 = a37Var.f;
                i38 i38Var = sd6Var3.a().S;
                if (i38Var == null || (placementScope = i38Var.L) == null) {
                    placementScope = ((rg) rd6.a(sd6Var3.a)).getPlacementScope();
                }
                xt4 xt4Var = a37Var.d0;
                p15 p15Var = a37Var.e0;
                if (p15Var != null) {
                    i38 a = sd6Var3.a();
                    long j = a37Var.f0;
                    float f = a37Var.g0;
                    placementScope.getClass();
                    lw8.a(placementScope, a);
                    a.z0(py5.d(j, a.e), f, p15Var);
                } else if (xt4Var == null) {
                    i38 a2 = sd6Var3.a();
                    long j2 = a37Var.f0;
                    float f2 = a37Var.g0;
                    placementScope.getClass();
                    lw8.a(placementScope, a2);
                    a2.x0(py5.d(j2, a2.e), f2, null);
                } else {
                    i38 a3 = sd6Var3.a();
                    long j3 = a37Var.f0;
                    float f3 = a37Var.g0;
                    placementScope.getClass();
                    lw8.a(placementScope, a3);
                    a3.x0(py5.d(j3, a3.e), f3, xt4Var);
                }
                return pvcVar;
        }
    }
}
