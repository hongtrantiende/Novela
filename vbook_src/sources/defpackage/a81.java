package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a81  reason: default package */
/* loaded from: classes3.dex */
public final class a81 implements nu4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ long D;
    public final /* synthetic */ j19 E;
    public final /* synthetic */ List a;
    public final /* synthetic */ so3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rm0 d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ d92 f;

    public a81(List list, so3 so3Var, boolean z, rm0 rm0Var, aw7 aw7Var, d92 d92Var, xt4 xt4Var, long j, j19 j19Var) {
        this.a = list;
        this.b = so3Var;
        this.c = z;
        this.d = rm0Var;
        this.e = aw7Var;
        this.f = d92Var;
        this.C = xt4Var;
        this.D = j;
        this.E = j19Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean equals;
        boolean z2;
        gxa gxaVar;
        nq7 yg6Var;
        nq7 t;
        nq7 A;
        boolean z3;
        cj3 cj3Var;
        int i2;
        int i3;
        xg6 xg6Var = (xg6) obj;
        int intValue = ((Number) obj2).intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (rv4Var.f(xg6Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (rv4Var.d(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            xl0 xl0Var = (xl0) this.a.get(intValue);
            rv4Var.e0(-260942780);
            so3 so3Var = this.b;
            String str = so3Var.b;
            String str2 = xl0Var.a;
            hn0 hn0Var = xl0Var.b;
            if (str == null) {
                equals = false;
            } else {
                equals = str.equals(str2);
            }
            boolean contains = so3Var.c.contains(new pm0(str2));
            if (this.c && (cj3Var = so3Var.d) != null && cj3Var.a.contains(new pm0(str2))) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean d = so3Var.d();
            rm0 rm0Var = this.d;
            rm0Var.getClass();
            hn0Var.getClass();
            tm0 tm0Var = (tm0) rm0Var.b.get(hn0Var.c());
            if (tm0Var == null) {
                tm0Var = null;
            }
            if (((Boolean) this.e.getValue()).booleanValue()) {
                gxaVar = tte.v(nae.e, nae.e, 7, null);
            } else {
                gxaVar = null;
            }
            xg6Var.getClass();
            kq7 kq7Var = kq7.a;
            if (gxaVar == null) {
                yg6Var = kq7Var;
            } else {
                yg6Var = new yg6(null, gxaVar, null);
            }
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, yg6Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            lh9 lh9Var = ax1.a;
            if (tm0Var == null) {
                rv4Var.e0(-117126702);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-280872945);
                String c = hn0Var.c();
                d92 d92Var = d92.a;
                d92 d92Var2 = this.f;
                if (d92Var2 == d92Var) {
                    t = kq7Var;
                } else {
                    xt4 xt4Var = this.C;
                    t = ote.t(sze.f(kq7Var, new ld1(7, d92Var2, xt4Var, c)), new r7(9, d92Var2, xt4Var, c));
                }
                if (contains) {
                    A = nmd.v(zbe.A(kq7Var, nae.e, 2.0f, 1), this.D, b81.a);
                } else {
                    A = zbe.A(kq7Var, nae.e, 2.0f, 1);
                }
                nq7 z4 = zbe.z(t.a0(A), 16.0f, 2.0f);
                boolean g = rv4Var.g(z2);
                Object P = rv4Var.P();
                if (g || P == lh9Var) {
                    P = new z71(z2);
                    rv4Var.o0(P);
                }
                tm0Var.a(xl0Var, contains, equals, axe.k(z4, (xt4) P), this.E, rv4Var, 32768);
                rv4Var.q(false);
            }
            if (d) {
                rv4Var.e0(-115612723);
                nq7 b = pu0.a.b();
                Object P2 = rv4Var.P();
                if (P2 == lh9Var) {
                    P2 = xd0.c;
                    rv4Var.o0(P2);
                }
                z3 = false;
                fu0.a(lbe.f(14, (vt4) P2, b, null, false), rv4Var, 0);
                rv4Var.q(false);
            } else {
                z3 = false;
                rv4Var.e0(-115287905);
                rv4Var.q(false);
            }
            rv4Var.q(true);
            rv4Var.q(z3);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
