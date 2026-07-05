package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ss  reason: default package */
/* loaded from: classes.dex */
public abstract class ss {
    public static final yk8 a;

    static {
        ks3 ks3Var = ks3.a;
        a = new yk8(ks3Var, ks3Var);
    }

    public static final void a(ps psVar, List list, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(-1794596951);
        if ((i & 6) == 0) {
            if (rv4Var.f(psVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(list)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                os osVar = (os) list.get(i5);
                mu4 mu4Var = (mu4) osVar.a;
                int i6 = osVar.b;
                int i7 = osVar.c;
                Object P = rv4Var.P();
                if (P == ax1.a) {
                    P = ci.d;
                    rv4Var.o0(P);
                }
                b37 b37Var = (b37) P;
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, kq7.a);
                rw1.k.getClass();
                zx1 zx1Var = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, b37Var);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                mu4Var.c(psVar.subSequence(i6, i7).b, rv4Var, 0);
                rv4Var.q(true);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(i, 2, (Object) psVar, (Object) list, false);
        }
    }
}
