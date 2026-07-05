package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bu3  reason: default package */
/* loaded from: classes.dex */
public final class bu3 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x06 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu3(x06 x06Var, long j, int i) {
        super(1);
        this.a = i;
        this.b = x06Var;
        this.c = j;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long j;
        long j2;
        xt4 xt4Var;
        xt4 xt4Var2;
        int ordinal;
        int i = this.a;
        long j3 = 0;
        long j4 = this.c;
        x06 x06Var = this.b;
        switch (i) {
            case 0:
                du3 du3Var = (du3) x06Var;
                int ordinal2 = ((st3) obj).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            qa1 qa1Var = du3Var.Q.a.c;
                            if (qa1Var != null) {
                                j4 = ((zy5) qa1Var.b.invoke(new zy5(j4))).a;
                            }
                        } else {
                            xk5.o();
                            return null;
                        }
                    }
                } else {
                    qa1 qa1Var2 = du3Var.P.a.c;
                    if (qa1Var2 != null) {
                        j4 = ((zy5) qa1Var2.b.invoke(new zy5(j4))).a;
                    }
                }
                return new zy5(j4);
            case 1:
                st3 st3Var = (st3) obj;
                du3 du3Var2 = (du3) x06Var;
                if (st3Var == st3.c && du3Var2.Q.a.b == null) {
                    j3 = du3Var2.R.i;
                } else {
                    dpa dpaVar = du3Var2.P.a.b;
                    if (dpaVar != null && (xt4Var2 = dpaVar.a) != null) {
                        j = ((py5) xt4Var2.invoke(new zy5(j4))).a;
                    } else {
                        j = 0;
                    }
                    dpa dpaVar2 = du3Var2.Q.a.b;
                    if (dpaVar2 != null && (xt4Var = dpaVar2.a) != null) {
                        j2 = ((py5) xt4Var.invoke(new zy5(j4))).a;
                    } else {
                        j2 = 0;
                    }
                    int ordinal3 = st3Var.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            if (ordinal3 == 2) {
                                j3 = j2;
                            } else {
                                xk5.o();
                                return null;
                            }
                        }
                    } else {
                        j3 = j;
                    }
                }
                return new py5(j3);
            case 2:
                st3 st3Var2 = (st3) obj;
                du3 du3Var3 = (du3) x06Var;
                if (du3Var3.V != null && du3Var3.J1() != null && !c16.i(du3Var3.V, du3Var3.J1()) && (ordinal = st3Var2.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        qa1 qa1Var3 = du3Var3.Q.a.c;
                        if (qa1Var3 != null) {
                            xt4 xt4Var3 = qa1Var3.b;
                            long j5 = this.c;
                            long j6 = ((zy5) xt4Var3.invoke(new zy5(j5))).a;
                            dc J1 = du3Var3.J1();
                            J1.getClass();
                            tc6 tc6Var = tc6.a;
                            long a = ((nk0) J1).a(j5, j6, tc6Var);
                            dc dcVar = du3Var3.V;
                            dcVar.getClass();
                            j3 = py5.c(a, dcVar.a(j5, j6, tc6Var));
                        }
                    } else {
                        xk5.o();
                        return null;
                    }
                }
                return new py5(j3);
            default:
                br brVar = (br) x06Var;
                if (c16.i(obj, brVar.N.d())) {
                    if (zy5.b(brVar.O, -9223372034707292160L)) {
                        j3 = j4;
                    } else {
                        j3 = brVar.O;
                    }
                } else {
                    yya yyaVar = (yya) brVar.N.e.g(obj);
                    if (yyaVar != null) {
                        j3 = ((zy5) yyaVar.getValue()).a;
                    }
                }
                return new zy5(j3);
        }
    }
}
