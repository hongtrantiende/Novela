package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fu0  reason: default package */
/* loaded from: classes.dex */
public abstract class fu0 {
    public static final tv7 a = c(true);
    public static final tv7 b = c(false);
    public static final ci c = ci.g;

    public static final void a(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        rv4Var.g0(-211209833);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            int hashCode = Long.hashCode(rv4Var.T);
            nq7 p = lye.p(rv4Var, nq7Var);
            xt8 l = rv4Var.l();
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, c);
            jce.F(qw1.e, rv4Var, l);
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sh(nq7Var, i, 2, (byte) 0);
        }
    }

    public static final void b(lw8 lw8Var, mw8 mw8Var, w27 w27Var, tc6 tc6Var, int i, int i2, dc dcVar) {
        bu0 bu0Var;
        dc dcVar2;
        dc dcVar3;
        Object S = w27Var.S();
        if (S instanceof bu0) {
            bu0Var = (bu0) S;
        } else {
            bu0Var = null;
        }
        if (bu0Var != null && (dcVar3 = bu0Var.K) != null) {
            dcVar2 = dcVar3;
        } else {
            dcVar2 = dcVar;
        }
        lw8.t(lw8Var, mw8Var, dcVar2.a((mw8Var.a << 32) | (mw8Var.b & 4294967295L), (i << 32) | (i2 & 4294967295L), tc6Var));
    }

    public static final tv7 c(boolean z) {
        tv7 tv7Var = new tv7(9);
        nk0 nk0Var = kh5.a;
        tv7Var.n(nk0Var, new hu0(nk0Var, z));
        nk0 nk0Var2 = kh5.b;
        tv7Var.n(nk0Var2, new hu0(nk0Var2, z));
        nk0 nk0Var3 = kh5.c;
        tv7Var.n(nk0Var3, new hu0(nk0Var3, z));
        nk0 nk0Var4 = kh5.d;
        tv7Var.n(nk0Var4, new hu0(nk0Var4, z));
        nk0 nk0Var5 = kh5.e;
        tv7Var.n(nk0Var5, new hu0(nk0Var5, z));
        nk0 nk0Var6 = kh5.f;
        tv7Var.n(nk0Var6, new hu0(nk0Var6, z));
        nk0 nk0Var7 = kh5.C;
        tv7Var.n(nk0Var7, new hu0(nk0Var7, z));
        nk0 nk0Var8 = kh5.D;
        tv7Var.n(nk0Var8, new hu0(nk0Var8, z));
        nk0 nk0Var9 = kh5.E;
        tv7Var.n(nk0Var9, new hu0(nk0Var9, z));
        return tv7Var;
    }

    public static final b37 d(dc dcVar, boolean z) {
        tv7 tv7Var;
        if (z) {
            tv7Var = a;
        } else {
            tv7Var = b;
        }
        b37 b37Var = (b37) tv7Var.g(dcVar);
        if (b37Var == null) {
            return new hu0(dcVar, z);
        }
        return b37Var;
    }
}
