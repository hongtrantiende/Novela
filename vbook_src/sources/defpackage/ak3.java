package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ak3 */
/* loaded from: classes.dex */
public interface ak3 extends r13 {
    static long C0(long j, long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L);
    }

    static /* synthetic */ void D0(ak3 ak3Var, long j, float f, long j2, float f2, bk3 bk3Var, int i) {
        float f3;
        ye4 ye4Var;
        if ((i & 4) != 0) {
            j2 = ak3Var.b1();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        if ((i & 16) != 0) {
            ye4Var = ye4.a;
        } else {
            ye4Var = bk3Var;
        }
        ak3Var.I(j, f, j3, f3, ye4Var);
    }

    static /* synthetic */ void G(ak3 ak3Var, long j, float f, float f2, boolean z, long j2, long j3, float f3, s4b s4bVar, int i) {
        long j4;
        long j5;
        float f4;
        ye4 ye4Var;
        if ((i & 16) != 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
        if ((i & 32) != 0) {
            j5 = C0(ak3Var.b(), j4);
        } else {
            j5 = j3;
        }
        if ((i & 64) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f3;
        }
        if ((i & Token.CASE) != 0) {
            ye4Var = ye4.a;
        } else {
            ye4Var = s4bVar;
        }
        ak3Var.V(j, f, f2, z, j4, j5, f4, ye4Var);
    }

    static /* synthetic */ void N(ak3 ak3Var, yj yjVar, hy0 hy0Var, float f, bk3 bk3Var, em1 em1Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            bk3Var = ye4.a;
        }
        bk3 bk3Var2 = bk3Var;
        if ((i2 & 16) != 0) {
            em1Var = null;
        }
        em1 em1Var2 = em1Var;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        ak3Var.U(yjVar, hy0Var, f2, bk3Var2, em1Var2, i);
    }

    static /* synthetic */ void R0(ak3 ak3Var, long j, long j2, long j3, float f, s4b s4bVar, int i, int i2) {
        long j4;
        long j5;
        float f2;
        ye4 ye4Var;
        int i3;
        if ((i2 & 2) != 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            j5 = C0(ak3Var.b(), j4);
        } else {
            j5 = j3;
        }
        if ((i2 & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 16) != 0) {
            ye4Var = ye4.a;
        } else {
            ye4Var = s4bVar;
        }
        if ((i2 & 64) != 0) {
            i3 = 3;
        } else {
            i3 = i;
        }
        ak3Var.X(j, j4, j5, f2, ye4Var, i3);
    }

    static /* synthetic */ void W(ak3 ak3Var, nl5 nl5Var, long j, float f, em1 em1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        ak3Var.K(nl5Var, j2, f2, em1Var, i);
    }

    static /* synthetic */ void Y(ak3 ak3Var, long j, long j2, long j3, long j4, bk3 bk3Var, float f, int i) {
        long j5;
        long j6;
        ye4 ye4Var;
        float f2;
        if ((i & 2) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i & 4) != 0) {
            j6 = C0(ak3Var.b(), j5);
        } else {
            j6 = j3;
        }
        if ((i & 16) != 0) {
            ye4Var = ye4.a;
        } else {
            ye4Var = bk3Var;
        }
        if ((i & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        ak3Var.K0(j, j5, j6, j4, ye4Var, f2);
    }

    static /* synthetic */ void Y0(ak3 ak3Var, long j, long j2, long j3, float f, int i, float f2, int i2) {
        int i3;
        float f3;
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        ak3Var.n1(j, j2, j3, f, i3, f3);
    }

    static void c1(qd6 qd6Var, p15 p15Var, xt4 xt4Var) {
        qd6Var.R(eg0.z(qd6Var.a.b()), xt4Var, p15Var);
    }

    static void g1(ak3 ak3Var, nl5 nl5Var, long j, long j2, long j3, float f, em1 em1Var, int i, int i2) {
        long j4;
        long j5;
        long j6;
        float f2;
        em1 em1Var2;
        int i3;
        if ((i2 & 4) != 0) {
            j4 = (((jj) nl5Var).a.getHeight() & 4294967295L) | (((jj) nl5Var).a.getWidth() << 32);
        } else {
            j4 = j;
        }
        if ((i2 & 8) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i2 & 16) != 0) {
            j6 = j4;
        } else {
            j6 = j3;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & Token.CASE) != 0) {
            em1Var2 = null;
        } else {
            em1Var2 = em1Var;
        }
        if ((i2 & 512) != 0) {
            i3 = 1;
        } else {
            i3 = i;
        }
        ak3Var.F0(nl5Var, 0L, j4, j5, j6, f2, em1Var2, i3);
    }

    static /* synthetic */ void h1(ak3 ak3Var, hy0 hy0Var, long j, long j2, float f, bk3 bk3Var, em1 em1Var, int i, int i2) {
        long j3;
        float f2;
        ye4 ye4Var;
        em1 em1Var2;
        int i3;
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        if ((i2 & 4) != 0) {
            j3 = C0(ak3Var.b(), j4);
        } else {
            j3 = j2;
        }
        if ((i2 & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 16) != 0) {
            ye4Var = ye4.a;
        } else {
            ye4Var = bk3Var;
        }
        if ((i2 & 32) != 0) {
            em1Var2 = null;
        } else {
            em1Var2 = em1Var;
        }
        if ((i2 & 64) != 0) {
            i3 = 3;
        } else {
            i3 = i;
        }
        ak3Var.r1(hy0Var, j4, j3, f2, ye4Var, em1Var2, i3);
    }

    static /* synthetic */ void t0(ak3 ak3Var, hy0 hy0Var, long j, long j2, long j3, float f, bk3 bk3Var, em1 em1Var, int i, int i2) {
        long j4;
        long j5;
        float f2;
        ye4 ye4Var;
        em1 em1Var2;
        int i3;
        if ((i2 & 2) != 0) {
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i2 & 4) != 0) {
            j5 = C0(ak3Var.b(), j4);
        } else {
            j5 = j2;
        }
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 32) != 0) {
            ye4Var = ye4.a;
        } else {
            ye4Var = bk3Var;
        }
        if ((i2 & 64) != 0) {
            em1Var2 = null;
        } else {
            em1Var2 = em1Var;
        }
        if ((i2 & Token.CASE) != 0) {
            i3 = 3;
        } else {
            i3 = i;
        }
        ak3Var.e1(hy0Var, j4, j5, j3, f2, ye4Var, em1Var2, i3);
    }

    static /* synthetic */ void t1(ak3 ak3Var, yj yjVar, long j, float f, bk3 bk3Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            bk3Var = ye4.a;
        }
        ak3Var.D(yjVar, j, f2, bk3Var);
    }

    static /* synthetic */ void u1(ak3 ak3Var, hy0 hy0Var, long j, long j2, float f, float f2, int i) {
        int i2;
        if ((i & 16) != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if ((i & 64) != 0) {
            f2 = 1.0f;
        }
        ak3Var.s0(hy0Var, j, j2, f, i2, f2);
    }

    void D(yj yjVar, long j, float f, bk3 bk3Var);

    void F0(nl5 nl5Var, long j, long j2, long j3, long j4, float f, em1 em1Var, int i);

    void I(long j, float f, long j2, float f2, bk3 bk3Var);

    void K(nl5 nl5Var, long j, float f, em1 em1Var, int i);

    void K0(long j, long j2, long j3, long j4, bk3 bk3Var, float f);

    ij1 Q0();

    default void R(long j, xt4 xt4Var, p15 p15Var) {
        p15Var.f(this, getLayoutDirection(), j, new jk(10, this, xt4Var));
    }

    void U(yj yjVar, hy0 hy0Var, float f, bk3 bk3Var, em1 em1Var, int i);

    void V(long j, float f, float f2, boolean z, long j2, long j3, float f3, bk3 bk3Var);

    void X(long j, long j2, long j3, float f, bk3 bk3Var, int i);

    default long b() {
        return Q0().G();
    }

    default long b1() {
        return sxd.j(Q0().G());
    }

    void e1(hy0 hy0Var, long j, long j2, long j3, float f, bk3 bk3Var, em1 em1Var, int i);

    tc6 getLayoutDirection();

    void n1(long j, long j2, long j3, float f, int i, float f2);

    void r1(hy0 hy0Var, long j, long j2, float f, bk3 bk3Var, em1 em1Var, int i);

    void s0(hy0 hy0Var, long j, long j2, float f, int i, float f2);
}
