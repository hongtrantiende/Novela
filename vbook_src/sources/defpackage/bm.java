package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bm implements mu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vt4 c;

    public /* synthetic */ bm(vt4 vt4Var, boolean z) {
        this.c = vt4Var;
        this.b = z;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        lh9 lh9Var = ax1.a;
        boolean z = false;
        final vt4 vt4Var = this.c;
        switch (i) {
            case 0:
                nq7 nq7Var = (nq7) obj;
                rv4 rv4Var = (rv4) obj2;
                ((Integer) obj3).getClass();
                rv4Var.e0(-196777734);
                final long j = ((wxb) rv4Var.j(xxb.a)).a;
                final boolean z2 = this.b;
                boolean e = rv4Var.e(j) | rv4Var.f(vt4Var) | rv4Var.g(z2);
                Object P = rv4Var.P();
                if (e || P == lh9Var) {
                    P = new xt4() { // from class: cm
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj4) {
                            u41 u41Var = (u41) obj4;
                            return u41Var.a(new ul(0, vt4Var, qre.q(u41Var, Float.intBitsToFloat((int) (u41Var.a.b() >> 32)) / 2.0f), new wl0(j, 5), z2));
                        }
                    };
                    rv4Var.o0(P);
                }
                nq7 s = ote.s(nq7Var, (xt4) P);
                rv4Var.q(false);
                return s;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (rv4Var2.U(intValue & 1, z)) {
                    gv9 a = ev9.a(lz.a, kh5.G, rv4Var2, 48);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    kq7 kq7Var = kq7.a;
                    nq7 p = lye.p(rv4Var2, kq7Var);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, a);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    boolean f = rv4Var2.f(vt4Var);
                    Object P2 = rv4Var2.P();
                    if (f || P2 == lh9Var) {
                        P2 = new nv(15, vt4Var);
                        rv4Var2.o0(P2);
                    }
                    ase.b(this.b, (xt4) P2, null, false, null, rv4Var2, 0);
                    rs8.v(kq7Var, 4.0f, rv4Var2, true);
                } else {
                    rv4Var2.X();
                }
                return pvc.a;
        }
    }

    public /* synthetic */ bm(boolean z, vt4 vt4Var) {
        this.b = z;
        this.c = vt4Var;
    }
}
