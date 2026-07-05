package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nl7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pia b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ nl7(pia piaVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, int i) {
        this.a = i;
        this.b = piaVar;
        this.c = xt4Var;
        this.d = xt4Var2;
        this.e = xt4Var3;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    s9e.f(pna.f(kq7.a, 1.0f), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(-385958264, new nl7(this.b, this.c, this.d, this.e, 1), rv4Var), rv4Var, 1573302);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    String A = yqe.A((y3b) k3b.v0.getValue(), rv4Var2);
                    final pia piaVar = this.b;
                    boolean z3 = piaVar.e;
                    final xt4 xt4Var = this.c;
                    boolean f = rv4Var2.f(xt4Var) | rv4Var2.f(piaVar);
                    Object P = rv4Var2.P();
                    Object obj4 = ax1.a;
                    if (f || P == obj4) {
                        P = new vt4() { // from class: ol7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2 = r3;
                                pvc pvcVar2 = pvc.a;
                                pia piaVar2 = piaVar;
                                xt4 xt4Var2 = xt4Var;
                                switch (i2) {
                                    case 0:
                                        xt4Var2.invoke(Boolean.valueOf(!piaVar2.e));
                                        return pvcVar2;
                                    case 1:
                                        xt4Var2.invoke(Boolean.valueOf(!piaVar2.f));
                                        return pvcVar2;
                                    default:
                                        xt4Var2.invoke(Boolean.valueOf(!piaVar2.g));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(P);
                    }
                    ese.m(0, (vt4) P, rv4Var2, null, null, null, A, z3);
                    String A2 = yqe.A((y3b) k3b.w0.getValue(), rv4Var2);
                    boolean z4 = piaVar.f;
                    final xt4 xt4Var2 = this.d;
                    boolean f2 = rv4Var2.f(xt4Var2) | rv4Var2.f(piaVar);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == obj4) {
                        P2 = new vt4() { // from class: ol7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2 = r3;
                                pvc pvcVar2 = pvc.a;
                                pia piaVar2 = piaVar;
                                xt4 xt4Var22 = xt4Var2;
                                switch (i2) {
                                    case 0:
                                        xt4Var22.invoke(Boolean.valueOf(!piaVar2.e));
                                        return pvcVar2;
                                    case 1:
                                        xt4Var22.invoke(Boolean.valueOf(!piaVar2.f));
                                        return pvcVar2;
                                    default:
                                        xt4Var22.invoke(Boolean.valueOf(!piaVar2.g));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(P2);
                    }
                    ese.m(0, (vt4) P2, rv4Var2, null, null, null, A2, z4);
                    String A3 = yqe.A((y3b) k3b.u0.getValue(), rv4Var2);
                    boolean z5 = piaVar.g;
                    final xt4 xt4Var3 = this.e;
                    boolean f3 = rv4Var2.f(xt4Var3) | rv4Var2.f(piaVar);
                    Object P3 = rv4Var2.P();
                    if (f3 || P3 == obj4) {
                        P3 = new vt4() { // from class: ol7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2 = r3;
                                pvc pvcVar2 = pvc.a;
                                pia piaVar2 = piaVar;
                                xt4 xt4Var22 = xt4Var3;
                                switch (i2) {
                                    case 0:
                                        xt4Var22.invoke(Boolean.valueOf(!piaVar2.e));
                                        return pvcVar2;
                                    case 1:
                                        xt4Var22.invoke(Boolean.valueOf(!piaVar2.f));
                                        return pvcVar2;
                                    default:
                                        xt4Var22.invoke(Boolean.valueOf(!piaVar2.g));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(P3);
                    }
                    ese.m(0, (vt4) P3, rv4Var2, null, null, null, A3, z5);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
