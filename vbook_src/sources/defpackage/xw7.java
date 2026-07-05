package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xw7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw7 implements nu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bx7 b;
    public final /* synthetic */ yya c;

    public /* synthetic */ xw7(aw7 aw7Var, bx7 bx7Var) {
        this.c = aw7Var;
        this.b = bx7Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        rv4 rv4Var;
        int i;
        boolean z2;
        int i2;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        int i4 = 16;
        boolean z3 = true;
        yya yyaVar = this.c;
        bx7 bx7Var = this.b;
        switch (i3) {
            case 0:
                rh8 rh8Var = (rh8) obj2;
                rv4 rv4Var2 = (rv4) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var.getClass();
                if ((intValue & 48) == 0) {
                    if (rv4Var2.f(rh8Var)) {
                        i4 = 32;
                    }
                    intValue |= i4;
                }
                if ((intValue & Token.TARGET) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue & 1, z)) {
                    if (!((zw7) yyaVar.getValue()).a) {
                        rv4Var2.e0(-1317742123);
                        if (((zw7) yyaVar.getValue()).b.isEmpty()) {
                            rv4Var2.e0(-1317729661);
                            jxe.d(owe.G(rv4Var2), yqe.A((y3b) o3b.Y.getValue(), rv4Var2), yqe.A((y3b) o3b.Z.getValue(), rv4Var2), zbe.x(pna.c, rh8Var), null, null, rv4Var2, 0, 48);
                            rv4Var = rv4Var2;
                            rv4Var.q(false);
                        } else {
                            rv4Var = rv4Var2;
                            rv4Var.e0(-1317329203);
                            ze4 ze4Var = pna.c;
                            bkd r = mwe.r(rh8Var, new th8(16.0f, 8.0f, 16.0f, 8.0f));
                            th8 j = zbe.j(nae.e, nae.e, 4.0f, nae.e, 11);
                            boolean f = rv4Var.f(yyaVar) | rv4Var.f(bx7Var);
                            Object P = rv4Var.P();
                            if (f || P == lh9Var) {
                                P = new fl7(7, yyaVar, bx7Var);
                                rv4Var.o0(P);
                            }
                            pc2.c(ze4Var, null, r, null, null, null, false, j, 0L, 0L, nae.e, (xt4) P, rv4Var, 100663302, 0, 3834);
                            rv4Var.q(false);
                        }
                        rv4Var.q(false);
                    } else {
                        rv4Var2.e0(-1316499550);
                        rv4Var2.q(false);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var = (xg6) obj;
                int intValue2 = ((Integer) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                xg6Var.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var3.f(xg6Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    i = i2 | intValue3;
                } else {
                    i = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    if (rv4Var3.d(intValue2)) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var3.U(i & 1, z2)) {
                    qc9 qc9Var = (qc9) ((zw7) yyaVar.getValue()).b.get(intValue2);
                    nq7 A = zbe.A(xg6.a(xg6Var, pna.f(kq7.a, 1.0f)), nae.e, 4.0f, 1);
                    boolean f2 = rv4Var3.f(bx7Var) | rv4Var3.f(yyaVar);
                    if ((i & Token.ASSIGN_MOD) != 32) {
                        z3 = false;
                    }
                    boolean z4 = f2 | z3;
                    Object P2 = rv4Var3.P();
                    if (z4 || P2 == lh9Var) {
                        P2 = new hm(bx7Var, intValue2, yyaVar, 5);
                        rv4Var3.o0(P2);
                    }
                    cae.j(qc9Var, A, (vt4) P2, rv4Var3, 0);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ xw7(bx7 bx7Var, yya yyaVar) {
        this.b = bx7Var;
        this.c = yyaVar;
    }
}
