package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sd1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd1 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sd1(m82 m82Var, aw7 aw7Var, aw7 aw7Var2, yya yyaVar, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5, boolean z, aw7 aw7Var6) {
        this.c = m82Var;
        this.d = aw7Var;
        this.e = aw7Var2;
        this.f = yyaVar;
        this.C = aw7Var3;
        this.D = aw7Var4;
        this.E = aw7Var5;
        this.b = z;
        this.F = aw7Var6;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.d;
        Object obj4 = this.F;
        Object obj5 = this.E;
        Object obj6 = this.D;
        Object obj7 = this.C;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(819686401);
                hma.a(this.b, (cg1) obj10, kq7.a, (xt4) obj3, (vt4) obj7, (vt4) obj6, (vt4) obj5, (vt4) obj4, (xt4) obj9, (xt4) obj8, (rv4) obj, p);
                return pvcVar;
            case 1:
                m82 m82Var = (m82) obj10;
                aw7 aw7Var = (aw7) obj3;
                aw7 aw7Var2 = (aw7) obj9;
                yya yyaVar = (yya) obj8;
                aw7 aw7Var3 = (aw7) obj7;
                aw7 aw7Var4 = (aw7) obj6;
                aw7 aw7Var5 = (aw7) obj5;
                aw7 aw7Var6 = (aw7) obj4;
                y78 y78Var = (y78) obj;
                ((vh8) obj2).getClass();
                if (((po5) aw7Var.getValue()) != null) {
                    aw7Var.setValue(null);
                    aw7Var2.setValue(null);
                    return pvcVar;
                } else if (((Boolean) yyaVar.getValue()).booleanValue()) {
                    jye.d(aw7Var3, false);
                    return pvcVar;
                } else {
                    ikb A = ctd.A(Float.intBitsToFloat((int) (y78Var.a >> 32)), Float.intBitsToFloat((int) (y78Var.a & 4294967295L)), (int) (((zy5) aw7Var4.getValue()).a >> 32), (int) (((zy5) aw7Var4.getValue()).a & 4294967295L), ((dm5) aw7Var5.getValue()).l);
                    int i2 = ((dm5) aw7Var5.getValue()).k;
                    if (i2 == 1 ? ((dm5) aw7Var5.getValue()).b == 0 : !(i2 == 2 ? ((dm5) aw7Var5.getValue()).b == 0 : i2 != 3)) {
                        int ordinal = A.ordinal();
                        boolean z = this.b;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        xk5.o();
                                        return null;
                                    }
                                    return pvcVar;
                                }
                                jye.d(aw7Var3, true);
                                return pvcVar;
                            }
                            z87.v(m82Var, null, null, new rm5(z, aw7Var6, aw7Var5, null, 1), 3);
                            return pvcVar;
                        }
                        z87.v(m82Var, null, null, new rm5(z, aw7Var6, aw7Var5, null, 0), 3);
                        return pvcVar;
                    }
                    jye.d(aw7Var3, true);
                    return pvcVar;
                }
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(1769521);
                kqe.c((f25) obj10, (nq7) obj9, (qg6) obj8, (rh8) obj7, (jz) obj6, (fz) obj5, (li4) obj4, this.b, (xt4) obj3, (rv4) obj, p2);
                return pvcVar;
        }
    }

    public /* synthetic */ sd1(f25 f25Var, nq7 nq7Var, qg6 qg6Var, rh8 rh8Var, jz jzVar, fz fzVar, li4 li4Var, boolean z, xt4 xt4Var, int i) {
        this.c = f25Var;
        this.e = nq7Var;
        this.f = qg6Var;
        this.C = rh8Var;
        this.D = jzVar;
        this.E = fzVar;
        this.F = li4Var;
        this.b = z;
        this.d = xt4Var;
    }

    public /* synthetic */ sd1(boolean z, cg1 cg1Var, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var2, xt4 xt4Var3, int i) {
        this.b = z;
        this.c = cg1Var;
        this.d = xt4Var;
        this.C = vt4Var;
        this.D = vt4Var2;
        this.E = vt4Var3;
        this.F = vt4Var4;
        this.e = xt4Var2;
        this.f = xt4Var3;
    }
}
