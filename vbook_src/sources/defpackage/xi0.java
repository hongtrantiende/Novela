package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xi0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xi0 implements lu4 {
    public final /* synthetic */ ntb C;
    public final /* synthetic */ mkc D;
    public final /* synthetic */ ytb E;
    public final /* synthetic */ hy0 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ k2a I;
    public final /* synthetic */ ff8 J;
    public final /* synthetic */ sfc K;
    public final /* synthetic */ sx8 L;
    public final /* synthetic */ lu4 M;
    public final /* synthetic */ t86 N;
    public final /* synthetic */ int a;
    public final /* synthetic */ yu7 b;
    public final /* synthetic */ osb c;
    public final /* synthetic */ oyb d;
    public final /* synthetic */ hvb e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ xi0(yu7 yu7Var, osb osbVar, oyb oybVar, hvb hvbVar, boolean z, ntb ntbVar, mkc mkcVar, ytb ytbVar, hy0 hy0Var, boolean z2, boolean z3, k2a k2aVar, ff8 ff8Var, sfc sfcVar, sx8 sx8Var, lu4 lu4Var, t86 t86Var, int i) {
        this.a = i;
        this.b = yu7Var;
        this.c = osbVar;
        this.d = oybVar;
        this.e = hvbVar;
        this.f = z;
        this.C = ntbVar;
        this.D = mkcVar;
        this.E = ytbVar;
        this.F = hy0Var;
        this.G = z2;
        this.H = z3;
        this.I = k2aVar;
        this.J = ff8Var;
        this.K = sfcVar;
        this.L = sx8Var;
        this.M = lu4Var;
        this.N = t86Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        boolean z4 = false;
        switch (i2) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    yu7 yu7Var = this.b;
                    aw7 l = y9e.l(yu7Var, rv4Var, 0);
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (P == lh9Var) {
                        P = yae.z(Boolean.FALSE);
                        rv4Var.o0(P);
                    }
                    aw7 aw7Var = (aw7) P;
                    boolean f = rv4Var.f(yu7Var);
                    Object P2 = rv4Var.P();
                    if (f || P2 == lh9Var) {
                        P2 = new fh3(yu7Var, aw7Var, null, 0);
                        rv4Var.o0(P2);
                    }
                    yte.g((lu4) P2, rv4Var, yu7Var);
                    oid oidVar = (oid) rv4Var.j(dy1.u);
                    boolean f2 = rv4Var.f(yu7Var) | rv4Var.f(oidVar);
                    Object P3 = rv4Var.P();
                    if (f2 || P3 == lh9Var) {
                        P3 = yae.q(new t7(12, oidVar, l));
                        rv4Var.o0(P3);
                    }
                    yya yyaVar = (yya) P3;
                    ((Boolean) l.getValue()).getClass();
                    if (this.c instanceof nsb) {
                        i = Integer.MAX_VALUE;
                    } else {
                        i = 1;
                    }
                    hvb hvbVar = this.e;
                    nq7 f3 = sze.f(kq7.a, new qo4(hvbVar, 3));
                    yqe.D(1, i);
                    oyb oybVar = this.d;
                    boolean z5 = this.f;
                    if (i != Integer.MAX_VALUE && !z5) {
                        f3 = f3.a0(new r55(oybVar, 1, i));
                    }
                    nq7 l2 = tte.l(f3.a0(new aub(oybVar)));
                    boolean booleanValue = ((Boolean) yyaVar.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) aw7Var.getValue()).booleanValue();
                    if (this.C == ntb.b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z6 = this.G;
                    boolean z7 = this.H;
                    if (z6 && !z7) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mkc mkcVar = this.D;
                    ytb ytbVar = this.E;
                    nq7 a0 = l2.a0(new irb(booleanValue, booleanValue2, z2, hvbVar, mkcVar, ytbVar, this.F, z3, this.I, this.J, this.K, this.L));
                    b37 d = fu0.d(kh5.a, true);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l3 = rv4Var.l();
                    nq7 p = lye.p(rv4Var, a0);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d);
                    jce.F(qw1.e, rv4Var, l3);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    fu0.a(new fub(hvbVar, mkcVar, oybVar, z5, this.M, this.N), rv4Var, 0);
                    if (z6 && ((Boolean) yyaVar.getValue()).booleanValue() && ((Boolean) ytbVar.l.getValue()).booleanValue()) {
                        rv4Var.e0(-810654004);
                        hj0.f(ytbVar, rv4Var, 0);
                        if (!z7) {
                            rv4Var.e0(-810526873);
                            hj0.e(ytbVar, rv4Var, 0);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(-810412514);
                            rv4Var.q(false);
                        }
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-810390690);
                        rv4Var.q(false);
                    }
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z4)) {
                    r0f.c.h(jce.E(1969169726, new xi0(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, 0), rv4Var2), rv4Var2, 6);
                    return pvcVar;
                }
                rv4Var2.X();
                return pvcVar;
        }
    }
}
