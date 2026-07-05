package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cq1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq1 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo3 b;
    public final /* synthetic */ z86 c;
    public final /* synthetic */ kd4 d;

    public /* synthetic */ cq1(uo3 uo3Var, z86 z86Var, kd4 kd4Var, int i) {
        this.a = i;
        this.b = uo3Var;
        this.c = z86Var;
        this.d = kd4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        int i4 = 16;
        int i5 = 2;
        Object obj5 = ax1.a;
        kd4 kd4Var = this.d;
        final z86 z86Var = this.c;
        boolean z2 = false;
        switch (i3) {
            case 0:
                yya yyaVar = (yya) obj;
                yt2 yt2Var = (yt2) obj2;
                rv4 rv4Var = (rv4) obj3;
                int intValue = ((Integer) obj4).intValue();
                yyaVar.getClass();
                yt2Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(yyaVar)) {
                        i5 = 4;
                    }
                    i = i5 | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    if (rv4Var.f(yt2Var)) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    int i6 = i;
                    boolean e = z86Var.e();
                    boolean f = rv4Var.f(z86Var);
                    final uo3 uo3Var = this.b;
                    boolean f2 = rv4Var.f(uo3Var) | f;
                    Object P = rv4Var.P();
                    if (f2 || P == obj5) {
                        P = new vt4() { // from class: aq1
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i7 = r3;
                                pvc pvcVar2 = pvc.a;
                                uo3 uo3Var2 = uo3Var;
                                z86 z86Var2 = z86Var;
                                switch (i7) {
                                    case 0:
                                        if (z86Var2.e()) {
                                            z87.v(z86Var2.b, null, null, new y86(z86Var2, null, 1), 3);
                                            String str = uo3Var2.e().b;
                                            if (str != null) {
                                                so3 e2 = uo3Var2.e();
                                                e2.getClass();
                                                uo3Var2.j(so3.a(e2, null, null, null, null, null, 29).b());
                                                uo3Var2.c(uo3Var2.e().a);
                                                so3 e3 = uo3Var2.e();
                                                e3.getClass();
                                                uo3Var2.j(so3.a(e3, null, str, rs3.a, null, null, 25).b());
                                                uo3Var2.c(uo3Var2.e().a);
                                            }
                                            bsa bsaVar = z86Var2.c;
                                            if (bsaVar != null) {
                                                ((w03) bsaVar).b();
                                            }
                                        } else {
                                            z86Var2.g();
                                        }
                                        return pvcVar2;
                                    default:
                                        if (z86Var2.e()) {
                                            z87.v(z86Var2.b, null, null, new y86(z86Var2, null, 1), 3);
                                            String str2 = uo3Var2.e().b;
                                            if (str2 != null) {
                                                so3 e4 = uo3Var2.e();
                                                e4.getClass();
                                                uo3Var2.j(so3.a(e4, null, null, null, null, null, 29).b());
                                                uo3Var2.c(uo3Var2.e().a);
                                                so3 e5 = uo3Var2.e();
                                                e5.getClass();
                                                uo3Var2.j(so3.a(e5, null, str2, rs3.a, null, null, 25).b());
                                                uo3Var2.c(uo3Var2.e().a);
                                            }
                                            bsa bsaVar2 = z86Var2.c;
                                            if (bsaVar2 != null) {
                                                ((w03) bsaVar2).b();
                                            }
                                        } else {
                                            z86Var2.g();
                                        }
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var.o0(P);
                    }
                    vt4 vt4Var = (vt4) P;
                    boolean f3 = rv4Var.f(kd4Var);
                    Object P2 = rv4Var.P();
                    if (f3 || P2 == obj5) {
                        P2 = new fe1(kd4Var, 1);
                        rv4Var.o0(P2);
                    }
                    fa3.b(yyaVar, yt2Var, uo3Var, e, vt4Var, (vt4) P2, null, rv4Var, i6 & Token.ELSE);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                yya yyaVar2 = (yya) obj;
                yt2 yt2Var2 = (yt2) obj2;
                rv4 rv4Var2 = (rv4) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                yyaVar2.getClass();
                yt2Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(yyaVar2)) {
                        i5 = 4;
                    }
                    i2 = i5 | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var2.f(yt2Var2)) {
                        i4 = 32;
                    }
                    i2 |= i4;
                }
                if ((i2 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                }
                if (rv4Var2.U(i2 & 1, z2)) {
                    boolean e2 = z86Var.e();
                    boolean f4 = rv4Var2.f(z86Var);
                    final uo3 uo3Var2 = this.b;
                    boolean f5 = rv4Var2.f(uo3Var2) | f4;
                    Object P3 = rv4Var2.P();
                    if (f5 || P3 == obj5) {
                        P3 = new vt4() { // from class: aq1
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i7 = r3;
                                pvc pvcVar2 = pvc.a;
                                uo3 uo3Var22 = uo3Var2;
                                z86 z86Var2 = z86Var;
                                switch (i7) {
                                    case 0:
                                        if (z86Var2.e()) {
                                            z87.v(z86Var2.b, null, null, new y86(z86Var2, null, 1), 3);
                                            String str = uo3Var22.e().b;
                                            if (str != null) {
                                                so3 e22 = uo3Var22.e();
                                                e22.getClass();
                                                uo3Var22.j(so3.a(e22, null, null, null, null, null, 29).b());
                                                uo3Var22.c(uo3Var22.e().a);
                                                so3 e3 = uo3Var22.e();
                                                e3.getClass();
                                                uo3Var22.j(so3.a(e3, null, str, rs3.a, null, null, 25).b());
                                                uo3Var22.c(uo3Var22.e().a);
                                            }
                                            bsa bsaVar = z86Var2.c;
                                            if (bsaVar != null) {
                                                ((w03) bsaVar).b();
                                            }
                                        } else {
                                            z86Var2.g();
                                        }
                                        return pvcVar2;
                                    default:
                                        if (z86Var2.e()) {
                                            z87.v(z86Var2.b, null, null, new y86(z86Var2, null, 1), 3);
                                            String str2 = uo3Var22.e().b;
                                            if (str2 != null) {
                                                so3 e4 = uo3Var22.e();
                                                e4.getClass();
                                                uo3Var22.j(so3.a(e4, null, null, null, null, null, 29).b());
                                                uo3Var22.c(uo3Var22.e().a);
                                                so3 e5 = uo3Var22.e();
                                                e5.getClass();
                                                uo3Var22.j(so3.a(e5, null, str2, rs3.a, null, null, 25).b());
                                                uo3Var22.c(uo3Var22.e().a);
                                            }
                                            bsa bsaVar2 = z86Var2.c;
                                            if (bsaVar2 != null) {
                                                ((w03) bsaVar2).b();
                                            }
                                        } else {
                                            z86Var2.g();
                                        }
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(P3);
                    }
                    vt4 vt4Var2 = (vt4) P3;
                    boolean f6 = rv4Var2.f(kd4Var);
                    Object P4 = rv4Var2.P();
                    if (f6 || P4 == obj5) {
                        P4 = new fe1(kd4Var, 3);
                        rv4Var2.o0(P4);
                    }
                    fa3.b(yyaVar2, yt2Var2, uo3Var2, e2, vt4Var2, (vt4) P4, null, rv4Var2, i2 & Token.ELSE);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
