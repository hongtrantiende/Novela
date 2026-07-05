package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xp0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xp0 implements mu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ cz7 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ xp0(aw7 aw7Var, cz7 cz7Var) {
        this.c = aw7Var;
        this.b = cz7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        rv4 rv4Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        aw7 aw7Var = this.c;
        switch (i) {
            case 0:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((su0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue & 1, z)) {
                    o59 o59Var = (o59) aw7Var.getValue();
                    if (o59Var == null) {
                        rv4Var2.e0(2072799378);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(2072799379);
                        nq7 v = nmd.v(pna.c, ((h27) rv4Var2.j(j27.a)).a.p, lre.g);
                        b37 d = fu0.d(kh5.a, false);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p = lye.p(rv4Var2, v);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(qw1.f, rv4Var2, d);
                        jce.F(qw1.e, rv4Var2, l);
                        jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var2);
                        jce.F(qw1.d, rv4Var2, p);
                        String str = o59Var.a;
                        String str2 = o59Var.b;
                        Object P = rv4Var2.P();
                        if (P == lh9Var) {
                            P = new en(aw7Var, 10);
                            rv4Var2.o0(P);
                        }
                        nqe.h(str, str2, this.b, true, (vt4) P, rv4Var2, 27648, 0);
                        rv4Var2.q(true);
                        rv4Var2.q(false);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((rh8) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var3.U(intValue2 & 1, z2)) {
                    ze4 ze4Var = pna.c;
                    b37 d2 = fu0.d(kh5.a, false);
                    int hashCode2 = Long.hashCode(rv4Var3.T);
                    xt8 l2 = rv4Var3.l();
                    nq7 p2 = lye.p(rv4Var3, ze4Var);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var2);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, d2);
                    jce.F(qw1.e, rv4Var3, l2);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p2);
                    if (((u99) aw7Var.getValue()).e) {
                        rv4Var3.e0(-689410321);
                        ec6 ec6Var = ((dc6) rv4Var3.j(zf0.a)).a;
                        nq7 y = zbe.y(mwe.u(pu0.a.a(kq7.a, kh5.E), false, 12), 16.0f);
                        long j = ((h27) rv4Var3.j(j27.a)).a.h;
                        dj4 dj4Var = new dj4(2.0f, sve.m, sve.k, sve.l);
                        cz7 cz7Var = this.b;
                        boolean f = rv4Var3.f(cz7Var);
                        Object P2 = rv4Var3.P();
                        if (f || P2 == lh9Var) {
                            yw7 yw7Var = new yw7(0, cz7Var, zr1.class, "navigateToCreateGroupConversation", "navigateToCreateGroupConversation(Lcom/core/navigation/NavBackStack;)V", 1, 3);
                            rv4Var3.o0(yw7Var);
                            P2 = yw7Var;
                        }
                        wq9.c((vt4) ((i76) P2), y, null, ec6Var, j, 0L, dj4Var, oc2.d, rv4Var3, 100663296, Token.TO_DOUBLE);
                        rv4Var = rv4Var3;
                        rv4Var.q(false);
                    } else {
                        rv4Var = rv4Var3;
                        rv4Var.e0(-688572732);
                        rv4Var.q(false);
                    }
                    rv4Var.q(true);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ xp0(cz7 cz7Var, aw7 aw7Var) {
        this.b = cz7Var;
        this.c = aw7Var;
    }
}
