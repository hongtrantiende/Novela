package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yh7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yya b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ yh7(int i, aw7 aw7Var, yya yyaVar) {
        this.a = i;
        this.b = yyaVar;
        this.c = aw7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        aw7 aw7Var = this.c;
        yya yyaVar = this.b;
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
                    nq7 t = tte.t(tte.k(pna.n(kq7Var, 44.0f), uu9.a), ((Number) yyaVar.getValue()).floatValue());
                    Object P = rv4Var.P();
                    if (P == lh9Var) {
                        P = new nd7(aw7Var, 13);
                        rv4Var.o0(P);
                    }
                    nk5.a(rp5.c((wk3) rk3.e.getValue(), rv4Var, 0), null, zbe.y(lbe.f(15, (vt4) P, t, null, false), 12.0f), 0L, rv4Var, 48, 8);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(1 & intValue2, z2)) {
                    nq7 t2 = tte.t(tte.k(pna.n(kq7Var, 44.0f), uu9.a), ((Number) yyaVar.getValue()).floatValue());
                    Object P2 = rv4Var2.P();
                    if (P2 == lh9Var) {
                        P2 = new ao7(aw7Var, 0);
                        rv4Var2.o0(P2);
                    }
                    nk5.a(rp5.c((wk3) rk3.e.getValue(), rv4Var2, 0), null, zbe.y(lbe.f(15, (vt4) P2, t2, null, false), 12.0f), 0L, rv4Var2, 48, 8);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(1 & intValue3, z3)) {
                    nq7 t3 = tte.t(tte.k(pna.n(kq7Var, 44.0f), uu9.a), ((Number) yyaVar.getValue()).floatValue());
                    Object P3 = rv4Var3.P();
                    if (P3 == lh9Var) {
                        P3 = new clc(aw7Var, 16);
                        rv4Var3.o0(P3);
                    }
                    nk5.a(rp5.c((wk3) rk3.e.getValue(), rv4Var3, 0), null, zbe.y(lbe.f(15, (vt4) P3, t3, null, false), 12.0f), 0L, rv4Var3, 48, 8);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
