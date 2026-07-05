package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lw8 */
/* loaded from: classes.dex */
public abstract class lw8 implements r13 {
    public boolean a;

    public static void E(lw8 lw8Var, mw8 mw8Var, int i, int i2, xt4 xt4Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = nw8.b;
            xt4Var = vt3.X;
        }
        long j = (i << 32) | (i2 & 4294967295L);
        if (lw8Var.m() != tc6.a && lw8Var.n() != 0) {
            a(lw8Var, mw8Var);
            mw8Var.x0(py5.d((((lw8Var.n() - mw8Var.a) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), mw8Var.e), nae.e, xt4Var);
            return;
        }
        a(lw8Var, mw8Var);
        mw8Var.x0(py5.d(j, mw8Var.e), nae.e, xt4Var);
    }

    public static void F(lw8 lw8Var, mw8 mw8Var, long j) {
        int i = nw8.b;
        vt3 vt3Var = vt3.X;
        if (lw8Var.m() != tc6.a && lw8Var.n() != 0) {
            a(lw8Var, mw8Var);
            mw8Var.x0(py5.d((((int) (j & 4294967295L)) & 4294967295L) | (((lw8Var.n() - mw8Var.a) - ((int) (j >> 32))) << 32), mw8Var.e), nae.e, vt3Var);
            return;
        }
        a(lw8Var, mw8Var);
        mw8Var.x0(py5.d(j, mw8Var.e), nae.e, vt3Var);
    }

    public static void H(lw8 lw8Var, mw8 mw8Var, long j, p15 p15Var) {
        if (lw8Var.m() != tc6.a && lw8Var.n() != 0) {
            a(lw8Var, mw8Var);
            mw8Var.z0(py5.d((((int) (j & 4294967295L)) & 4294967295L) | (((lw8Var.n() - mw8Var.a) - ((int) (j >> 32))) << 32), mw8Var.e), nae.e, p15Var);
            return;
        }
        a(lw8Var, mw8Var);
        mw8Var.z0(py5.d(j, mw8Var.e), nae.e, p15Var);
    }

    public static /* synthetic */ void L(lw8 lw8Var, mw8 mw8Var, int i, int i2, xt4 xt4Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = nw8.b;
            xt4Var = vt3.X;
        }
        lw8Var.J(mw8Var, i, i2, nae.e, xt4Var);
    }

    public static void M(lw8 lw8Var, mw8 mw8Var, long j, sj3 sj3Var, int i) {
        vt3 vt3Var = sj3Var;
        if ((i & 4) != 0) {
            int i2 = nw8.b;
            vt3Var = vt3.X;
        }
        lw8Var.getClass();
        a(lw8Var, mw8Var);
        mw8Var.x0(py5.d(j, mw8Var.e), nae.e, vt3Var);
    }

    public static final void a(lw8 lw8Var, mw8 mw8Var) {
        lw8Var.getClass();
        if (mw8Var instanceof qr7) {
            ((qr7) mw8Var).b0(lw8Var.a);
        }
    }

    public static /* synthetic */ void p(lw8 lw8Var, mw8 mw8Var, int i, int i2) {
        lw8Var.o(mw8Var, i, i2, nae.e);
    }

    public static void t(lw8 lw8Var, mw8 mw8Var, long j) {
        lw8Var.getClass();
        a(lw8Var, mw8Var);
        mw8Var.x0(py5.d(j, mw8Var.e), nae.e, null);
    }

    public static void z(lw8 lw8Var, mw8 mw8Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (lw8Var.m() != tc6.a && lw8Var.n() != 0) {
            a(lw8Var, mw8Var);
            mw8Var.x0(py5.d((((lw8Var.n() - mw8Var.a) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), mw8Var.e), nae.e, null);
            return;
        }
        a(lw8Var, mw8Var);
        mw8Var.x0(py5.d(j, mw8Var.e), nae.e, null);
    }

    public final void J(mw8 mw8Var, int i, int i2, float f, xt4 xt4Var) {
        a(this, mw8Var);
        mw8Var.x0(py5.d((i2 & 4294967295L) | (i << 32), mw8Var.e), f, xt4Var);
    }

    public sc6 j() {
        return null;
    }

    public abstract tc6 m();

    public abstract int n();

    public final void o(mw8 mw8Var, int i, int i2, float f) {
        a(this, mw8Var);
        mw8Var.x0(py5.d((i2 & 4294967295L) | (i << 32), mw8Var.e), f, null);
    }

    public float g(u95 u95Var, float f) {
        return f;
    }
}
