package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bga  reason: default package */
/* loaded from: classes.dex */
public final class bga extends fb6 implements xt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ mw8 b;
    public final /* synthetic */ cga c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bga(cga cgaVar, mw8 mw8Var) {
        super(1);
        this.c = cgaVar;
        this.b = mw8Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        char c;
        long j;
        long j2;
        long j3;
        rk9 n;
        long j4;
        sc6 j5;
        int i = this.a;
        pvc pvcVar = pvc.a;
        cga cgaVar = this.c;
        mw8 mw8Var = this.b;
        y78 y78Var = null;
        switch (i) {
            case 0:
                lw8 lw8Var = (lw8) obj;
                cgaVar.L = true;
                cgaVar.K = null;
                sha d = cgaVar.M.e().c.d();
                if (!cgaVar.M.h()) {
                    lw8Var.o(mw8Var, 0, 0, nae.e);
                    return pvcVar;
                } else if (!d.d()) {
                    lw8Var.o(mw8Var, 0, 0, nae.e);
                    return pvcVar;
                } else {
                    oaa e = d.e();
                    if (e != null) {
                        rk9 c2 = d.c();
                        if (c2 != null) {
                            long j6 = 0;
                            if (cgaVar.M.e().b.b()) {
                                sc6 j7 = lw8Var.j();
                                if (j7 == null) {
                                    lw8Var.o(mw8Var, 0, 0, nae.e);
                                    return pvcVar;
                                }
                                boolean b = cgaVar.M.e().c.d().b();
                                long e0 = cgaVar.I1().e0(j7, 0L);
                                hc2.l(e);
                                kga kgaVar = cgaVar.M;
                                if (!b) {
                                    c = ' ';
                                    kgaVar.d().a(c2, hc2.l(e), new aga(0));
                                } else {
                                    c = ' ';
                                    kgaVar.d().a(c2, hc2.l(e), null);
                                }
                                rk9 c3 = cgaVar.M.d().c();
                                if (c3 != null) {
                                    j = e0;
                                    y78Var = new y78(y78.j(y78.i(c3.j(), ((y78) ((hm8) e.c).getValue()).a), ((y78) ((hm8) e.e).getValue()).a));
                                } else {
                                    j = e0;
                                }
                                if (!cgaVar.M.d().b() && b) {
                                    if (y78Var != null) {
                                        j4 = y78Var.a;
                                    } else {
                                        j4 = c2.j();
                                    }
                                    j3 = j;
                                } else {
                                    if (y78Var != null) {
                                        j2 = y78Var.a;
                                    } else {
                                        j2 = j;
                                    }
                                    if (y78Var == null) {
                                        j3 = j;
                                        n = npe.n(j3, eg0.A(j7.a()));
                                    } else {
                                        j3 = j;
                                        n = npe.n(y78Var.a, c3.h());
                                    }
                                    cgaVar.M.e().c.d().i(n);
                                    j4 = j2;
                                }
                                long i2 = y78.i(j4, j3);
                                lw8Var.o(mw8Var, Math.round(Float.intBitsToFloat((int) (i2 >> c))), Math.round(Float.intBitsToFloat((int) (i2 & 4294967295L))), nae.e);
                                return pvcVar;
                            } else if (cgaVar.M.d().b()) {
                                lw8Var.o(mw8Var, 0, 0, nae.e);
                                return pvcVar;
                            } else {
                                sc6 j8 = lw8Var.j();
                                if (j8 != null) {
                                    j6 = hif.v(y78.i(c2.j(), cgaVar.I1().e0(j8, 0L)));
                                }
                                lw8Var.o(mw8Var, (int) (j6 >> 32), (int) (j6 & 4294967295L), nae.e);
                                return pvcVar;
                            }
                        }
                        cy7.h(d, "Match State is configured, but current bounds is null. State = ");
                    } else {
                        cy7.h(d, "Match State is configured, but target data is null. State = ");
                    }
                    return null;
                }
            default:
                lw8 lw8Var2 = (lw8) obj;
                lw8Var2.o(mw8Var, 0, 0, nae.e);
                jga e2 = cgaVar.M.e();
                kga kgaVar2 = cgaVar.M;
                kl9 kl9Var = e2.c;
                kl9Var.h();
                if (!c16.i(kl9Var.d(), t28.a) && kgaVar2.h()) {
                    sha d2 = kl9Var.d();
                    if (kgaVar2.d().b() && d2.b() && (j5 = lw8Var2.j()) != null) {
                        long A = eg0.A(j5.a());
                        lha lhaVar = kgaVar2.e().b;
                        sc6 sc6Var = kgaVar2.e().b.f;
                        if (sc6Var != null) {
                            long g = lhaVar.a.g(sc6Var, j5);
                            lha lhaVar2 = kgaVar2.e().b;
                            sc6 sc6Var2 = kgaVar2.e().b.f;
                            if (sc6Var2 != null) {
                                long o = sc6.o(sc6Var2, j5, 2);
                                sha d3 = kl9Var.d();
                                jga jgaVar = (jga) kl9Var.c;
                                cga cgaVar2 = (cga) kl9Var.g;
                                cgaVar2.getClass();
                                ((hm8) kl9Var.d).setValue(d3.a(jgaVar, cgaVar2, A, g, o));
                                return pvcVar;
                            }
                            vs.m("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        } else {
                            vs.m("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        return null;
                    }
                    return pvcVar;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bga(mw8 mw8Var, cga cgaVar) {
        super(1);
        this.b = mw8Var;
        this.c = cgaVar;
    }
}
