package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t22  reason: default package */
/* loaded from: classes.dex */
public final class t22 extends mq7 implements zj3, fd6, z7a {
    public dc K;
    public w22 L;
    public float M = 1.0f;
    public boolean N = true;
    public a12 O;
    public final n10 P;

    public t22(n10 n10Var, dc dcVar, w22 w22Var, a12 a12Var) {
        this.K = dcVar;
        this.L = w22Var;
        this.O = a12Var;
        this.P = n10Var;
    }

    @Override // defpackage.mq7
    public final void A1() {
        this.P.b();
    }

    @Override // defpackage.mq7
    public final void B1() {
        this.P.n(null);
    }

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        long b = y02.b(0, i, 0, 0, 13);
        a12 a12Var = this.O;
        if (a12Var != null) {
            a12Var.c(b);
        }
        if (this.P.h() != 9205357640488583168L) {
            long I1 = I1(b);
            return Math.max(x02.j(I1), w27Var.j(i));
        }
        return w27Var.j(i);
    }

    public final long H1(long j) {
        if (dna.d(j)) {
            return 0L;
        }
        long h = this.P.h();
        if (h != 9205357640488583168L) {
            float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
            if (Math.abs(intBitsToFloat) > Float.MAX_VALUE) {
                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
            if (Math.abs(intBitsToFloat2) > Float.MAX_VALUE) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            long a = this.L.a(floatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (a >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & a))) <= Float.MAX_VALUE) {
                return owe.Q(floatToRawIntBits, a);
            }
        }
        return j;
    }

    public final long I1(long j) {
        boolean z;
        float k;
        int j2;
        float m;
        boolean g = x02.g(j);
        boolean f = x02.f(j);
        if (!g || !f) {
            if (x02.e(j) && x02.d(j)) {
                z = true;
            } else {
                z = false;
            }
            n10 n10Var = this.P;
            long h = n10Var.h();
            if (h == 9205357640488583168L) {
                if (z && ((m10) n10Var.Q.a.getValue()).a() != null) {
                    return x02.b(j, x02.i(j), 0, x02.h(j), 0, 10);
                }
            } else {
                if (z && (g || f)) {
                    k = x02.i(j);
                    j2 = x02.h(j);
                } else {
                    float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
                    if (Math.abs(intBitsToFloat) <= Float.MAX_VALUE) {
                        int i = j2d.b;
                        k = dce.m(intBitsToFloat, x02.k(j), x02.i(j));
                    } else {
                        k = x02.k(j);
                    }
                    if (Math.abs(intBitsToFloat2) <= Float.MAX_VALUE) {
                        int i2 = j2d.b;
                        m = dce.m(intBitsToFloat2, x02.j(j), x02.h(j));
                        long H1 = H1((Float.floatToRawIntBits(m) & 4294967295L) | (Float.floatToRawIntBits(k) << 32));
                        return x02.b(j, y02.g(k27.A(Float.intBitsToFloat((int) (H1 >> 32))), j), 0, y02.f(k27.A(Float.intBitsToFloat((int) (H1 & 4294967295L))), j), 0, 10);
                    }
                    j2 = x02.j(j);
                }
                m = j2;
                long H12 = H1((Float.floatToRawIntBits(m) & 4294967295L) | (Float.floatToRawIntBits(k) << 32));
                return x02.b(j, y02.g(k27.A(Float.intBitsToFloat((int) (H12 >> 32))), j), 0, y02.f(k27.A(Float.intBitsToFloat((int) (H12 & 4294967295L))), j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        long b = y02.b(0, i, 0, 0, 13);
        a12 a12Var = this.O;
        if (a12Var != null) {
            a12Var.c(b);
        }
        if (this.P.h() != 9205357640488583168L) {
            long I1 = I1(b);
            return Math.max(x02.j(I1), w27Var.n0(i));
        }
        return w27Var.n0(i);
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        n61 n61Var = qd6Var.a;
        long H1 = H1(n61Var.b());
        long a = this.K.a(j2d.d(H1), j2d.d(n61Var.b()), qd6Var.getLayoutDirection());
        int i = (int) (a >> 32);
        int i2 = (int) (a & 4294967295L);
        ij1 ij1Var = n61Var.b;
        long G = ij1Var.G();
        ij1Var.w().i();
        try {
            mu9 mu9Var = (mu9) ij1Var.b;
            if (this.N) {
                ij1 ij1Var2 = (ij1) mu9Var.a;
                mu9Var.n(nae.e, nae.e, Float.intBitsToFloat((int) (ij1Var2.G() >> 32)), Float.intBitsToFloat((int) (4294967295L & ij1Var2.G())), 1);
            }
            mu9Var.D(i, i2);
            this.P.g(qd6Var, H1, this.M, null);
            ij1Var.w().q();
            ij1Var.Y(G);
            qd6Var.a();
        } catch (Throwable th) {
            rs8.r(ij1Var, G);
            throw th;
        }
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        long b = y02.b(0, 0, 0, i, 7);
        a12 a12Var = this.O;
        if (a12Var != null) {
            a12Var.c(b);
        }
        if (this.P.h() != 9205357640488583168L) {
            long I1 = I1(b);
            return Math.max(x02.k(I1), w27Var.F(i));
        }
        return w27Var.F(i);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        a12 a12Var = this.O;
        if (a12Var != null) {
            a12Var.c(j);
        }
        mw8 M = w27Var.M(I1(j));
        return e37Var.q0(M.a, M.b, ls3.a, new a1(M, 0));
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        long b = y02.b(0, 0, 0, i, 7);
        a12 a12Var = this.O;
        if (a12Var != null) {
            a12Var.c(b);
        }
        if (this.P.h() != 9205357640488583168L) {
            long I1 = I1(b);
            return Math.max(x02.k(I1), w27Var.J(i));
        }
        return w27Var.J(i);
    }

    @Override // defpackage.mq7
    public final void z1() {
        m82 v1 = v1();
        n10 n10Var = this.P;
        n10Var.H = v1;
        n10Var.c();
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
    }
}
