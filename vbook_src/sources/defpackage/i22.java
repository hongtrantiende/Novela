package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i22  reason: default package */
/* loaded from: classes.dex */
public final class i22 extends mq7 implements wx1, i37 {
    public ff8 K;
    public final t3a L;
    public boolean M;
    public hv0 N;
    public final u2a O;
    public boolean Q;
    public boolean S;
    public final fz4 P = new fz4(6);
    public long R = -1;

    public i22(ff8 ff8Var, t3a t3aVar, boolean z, hv0 hv0Var, u2a u2aVar) {
        this.K = ff8Var;
        this.L = t3aVar;
        this.M = z;
        this.N = hv0Var;
        this.O = u2aVar;
    }

    public static final float H1(i22 i22Var, hv0 hv0Var, long j) {
        float f;
        rk9 rk9Var;
        int compare;
        long j2 = i22Var.R;
        gw7 gw7Var = (gw7) i22Var.P.a;
        int i = gw7Var.c - 1;
        Object[] objArr = gw7Var.a;
        rk9 rk9Var2 = null;
        if (i < objArr.length) {
            rk9Var = null;
            while (true) {
                if (i >= 0) {
                    rk9 rk9Var3 = (rk9) ((h22) objArr[i]).a.invoke();
                    if (rk9Var3 != null) {
                        long h = rk9Var3.h();
                        long A = eg0.A(i22Var.I1());
                        f = nae.e;
                        int ordinal = i22Var.K.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                compare = Float.compare(Float.intBitsToFloat((int) (h >> 32)), Float.intBitsToFloat((int) (A >> 32)));
                            } else {
                                xk5.o();
                                return nae.e;
                            }
                        } else {
                            compare = Float.compare(Float.intBitsToFloat((int) (h & 4294967295L)), Float.intBitsToFloat((int) (A & 4294967295L)));
                        }
                        if (compare <= 0) {
                            rk9Var = rk9Var3;
                        } else if (rk9Var == null) {
                            rk9Var = rk9Var3;
                        }
                    }
                    i--;
                } else {
                    f = nae.e;
                    break;
                }
            }
        } else {
            f = nae.e;
            rk9Var = null;
        }
        if (rk9Var == null) {
            if (i22Var.Q) {
                rk9Var2 = (rk9) i22Var.O.invoke();
            }
            if (rk9Var2 == null) {
                return f;
            }
            rk9Var = rk9Var2;
        }
        long A2 = eg0.A(j2);
        int ordinal2 = i22Var.K.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                float f2 = rk9Var.a;
                return hv0Var.a(f2 - ((int) (j >> 32)), rk9Var.c - f2, Float.intBitsToFloat((int) (A2 >> 32)));
            }
            xk5.o();
            return f;
        }
        float f3 = rk9Var.b;
        return hv0Var.a(f3 - ((int) (j & 4294967295L)), rk9Var.d - f3, Float.intBitsToFloat((int) (A2 & 4294967295L)));
    }

    public static boolean J1(i22 i22Var, rk9 rk9Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = i22Var.I1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long L1 = i22Var.L1(j3, j2, rk9Var);
        if (Math.abs(Float.intBitsToFloat((int) (L1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (L1 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    public final long I1() {
        long j = this.R;
        if (zy5.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void K1(long j) {
        hv0 hv0Var = this.N;
        if (hv0Var == null) {
            hv0Var = (hv0) nye.q(this, jv0.a);
        }
        hv0 hv0Var2 = hv0Var;
        if (this.S) {
            ov5.c("launchAnimation called when previous animation was running");
        }
        hv0 hv0Var3 = this.N;
        if (hv0Var3 == null) {
            hv0Var3 = (hv0) nye.q(this, jv0.a);
        }
        hv0Var3.getClass();
        hv0.a.getClass();
        rxc rxcVar = new rxc(gv0.b);
        z87.v(v1(), null, p82.d, new hg1(this, rxcVar, hv0Var2, j, (m42) null), 1);
    }

    public final long L1(long j, long j2, rk9 rk9Var) {
        long A = eg0.A(j);
        int ordinal = this.K.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                hv0 hv0Var = this.N;
                if (hv0Var == null) {
                    hv0Var = (hv0) nye.q(this, jv0.a);
                }
                float f = rk9Var.a;
                return (Float.floatToRawIntBits(hv0Var.a(f - ((int) (j2 >> 32)), rk9Var.c - f, Float.intBitsToFloat((int) (A >> 32)))) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L);
            }
            xk5.o();
            return 0L;
        }
        hv0 hv0Var2 = this.N;
        if (hv0Var2 == null) {
            hv0Var2 = (hv0) nye.q(this, jv0.a);
        }
        float f2 = rk9Var.b;
        return (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(hv0Var2.a(f2 - ((int) (j2 & 4294967295L)), rk9Var.d - f2, Float.intBitsToFloat((int) (A & 4294967295L)))) & 4294967295L);
    }

    @Override // defpackage.i37
    public final void g(long j) {
        int l;
        long j2;
        long I1 = I1();
        this.R = j;
        int ordinal = this.K.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                l = c16.l((int) (j >> 32), (int) (I1 >> 32));
            } else {
                xk5.o();
                return;
            }
        } else {
            l = c16.l((int) (j & 4294967295L), (int) (I1 & 4294967295L));
        }
        if (l < 0) {
            if (!this.M) {
                if (this.K == ff8.a) {
                    j2 = (((int) (I1 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L;
                } else {
                    j2 = (((int) (I1 >> 32)) - ((int) (j >> 32))) << 32;
                }
            } else {
                j2 = 0;
            }
            long j3 = j2;
            rk9 rk9Var = (rk9) this.O.invoke();
            if (rk9Var != null && !this.S && !this.Q && J1(this, rk9Var, I1, 0L, 2) && !J1(this, rk9Var, 0L, j3, 1)) {
                this.Q = true;
                K1(j3);
            }
        }
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }
}
