package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qd6  reason: default package */
/* loaded from: classes.dex */
public final class qd6 implements ak3 {
    public final n61 a = new n61();
    public zj3 b;

    @Override // defpackage.r13
    public final float B0(float f) {
        return f / this.a.f();
    }

    @Override // defpackage.ak3
    public final void D(yj yjVar, long j, float f, bk3 bk3Var) {
        this.a.D(yjVar, j, f, bk3Var);
    }

    @Override // defpackage.ak3
    public final void F0(nl5 nl5Var, long j, long j2, long j3, long j4, float f, em1 em1Var, int i) {
        this.a.F0(nl5Var, j, j2, j3, j4, f, em1Var, i);
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.a.G0();
    }

    @Override // defpackage.ak3
    public final void I(long j, float f, long j2, float f2, bk3 bk3Var) {
        this.a.I(j, f, j2, f2, bk3Var);
    }

    @Override // defpackage.ak3
    public final void K(nl5 nl5Var, long j, float f, em1 em1Var, int i) {
        this.a.K(nl5Var, j, f, em1Var, i);
    }

    @Override // defpackage.ak3
    public final void K0(long j, long j2, long j3, long j4, bk3 bk3Var, float f) {
        this.a.K0(j, j2, j3, j4, bk3Var, f);
    }

    @Override // defpackage.r13
    public final float L0(float f) {
        return this.a.f() * f;
    }

    @Override // defpackage.r13
    public final long P(float f) {
        return this.a.P(f);
    }

    @Override // defpackage.r13
    public final long Q(long j) {
        return this.a.Q(j);
    }

    @Override // defpackage.ak3
    public final ij1 Q0() {
        return this.a.b;
    }

    @Override // defpackage.ak3
    public final void R(long j, xt4 xt4Var, p15 p15Var) {
        p15Var.f(this, getLayoutDirection(), j, new gp(6, this, this.b, xt4Var));
    }

    @Override // defpackage.ak3
    public final void U(yj yjVar, hy0 hy0Var, float f, bk3 bk3Var, em1 em1Var, int i) {
        this.a.U(yjVar, hy0Var, f, bk3Var, em1Var, i);
    }

    @Override // defpackage.ak3
    public final void V(long j, float f, float f2, boolean z, long j2, long j3, float f3, bk3 bk3Var) {
        this.a.V(j, f, f2, z, j2, j3, f3, bk3Var);
    }

    @Override // defpackage.ak3
    public final void X(long j, long j2, long j3, float f, bk3 bk3Var, int i) {
        this.a.X(j, j2, j3, f, bk3Var, i);
    }

    @Override // defpackage.r13
    public final int X0(float f) {
        return this.a.X0(f);
    }

    public final void a() {
        n61 n61Var = this.a;
        k61 w = n61Var.b.w();
        zj3 zj3Var = this.b;
        if (zj3Var != null) {
            mq7 mq7Var = (mq7) zj3Var;
            m03 m03Var = mq7Var.a.f;
            if (m03Var != null && (m03Var.d & 4) != 0) {
                while (m03Var != null) {
                    int i = m03Var.c;
                    if ((i & 2) != 0) {
                        break;
                    } else if ((i & 4) != 0) {
                        break;
                    } else {
                        m03Var = m03Var.f;
                    }
                }
            }
            m03Var = null;
            if (m03Var != null) {
                gw7 gw7Var = null;
                while (m03Var != null) {
                    if (m03Var instanceof zj3) {
                        zj3 zj3Var2 = (zj3) m03Var;
                        p15 p15Var = (p15) n61Var.b.c;
                        i38 s = voe.s(zj3Var2, 4);
                        long A = eg0.A(s.c);
                        od6 od6Var = s.O;
                        od6Var.getClass();
                        ((rg) rd6.a(od6Var)).getSharedDrawScope().g(w, A, s, zj3Var2, p15Var);
                    } else if ((m03Var.c & 4) != 0 && (m03Var instanceof m03)) {
                        int i2 = 0;
                        for (mq7 mq7Var2 = m03Var.L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                            if ((mq7Var2.c & 4) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    m03Var = mq7Var2;
                                } else {
                                    if (gw7Var == null) {
                                        gw7Var = new gw7(new mq7[16], 0);
                                    }
                                    if (m03Var != null) {
                                        gw7Var.b(m03Var);
                                        m03Var = null;
                                    }
                                    gw7Var.b(mq7Var2);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    m03Var = voe.h(gw7Var);
                }
                return;
            }
            i38 s2 = voe.s(zj3Var, 4);
            if (s2.E1() == mq7Var.a) {
                s2 = s2.R;
                s2.getClass();
            }
            s2.T1(w, (p15) n61Var.b.c);
            return;
        }
        throw a82.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    @Override // defpackage.ak3
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.ak3
    public final long b1() {
        return this.a.b1();
    }

    @Override // defpackage.r13
    public final float c0(long j) {
        return this.a.c0(j);
    }

    @Override // defpackage.ak3
    public final void e1(hy0 hy0Var, long j, long j2, long j3, float f, bk3 bk3Var, em1 em1Var, int i) {
        this.a.e1(hy0Var, j, j2, j3, f, bk3Var, em1Var, i);
    }

    @Override // defpackage.r13
    public final float f() {
        return this.a.f();
    }

    @Override // defpackage.r13
    public final long f1(long j) {
        return this.a.f1(j);
    }

    public final void g(k61 k61Var, long j, i38 i38Var, zj3 zj3Var, p15 p15Var) {
        zj3 zj3Var2 = this.b;
        this.b = zj3Var;
        tc6 tc6Var = i38Var.O.W;
        n61 n61Var = this.a;
        r13 B = n61Var.b.B();
        ij1 ij1Var = n61Var.b;
        tc6 D = ij1Var.D();
        k61 w = ij1Var.w();
        long G = ij1Var.G();
        p15 p15Var2 = (p15) ij1Var.c;
        ij1Var.W(i38Var);
        ij1Var.X(tc6Var);
        ij1Var.V(k61Var);
        ij1Var.Y(j);
        ij1Var.c = p15Var;
        k61Var.i();
        try {
            zj3Var.V0(this);
            k61Var.q();
            ij1Var.W(B);
            ij1Var.X(D);
            ij1Var.V(w);
            ij1Var.Y(G);
            ij1Var.c = p15Var2;
            this.b = zj3Var2;
        } catch (Throwable th) {
            k61Var.q();
            ij1Var.W(B);
            ij1Var.X(D);
            ij1Var.V(w);
            ij1Var.Y(G);
            ij1Var.c = p15Var2;
            throw th;
        }
    }

    @Override // defpackage.ak3
    public final tc6 getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.r13
    public final float k1(long j) {
        return this.a.k1(j);
    }

    @Override // defpackage.ak3
    public final void n1(long j, long j2, long j3, float f, int i, float f2) {
        this.a.n1(j, j2, j3, f, i, f2);
    }

    @Override // defpackage.r13
    public final long p0(int i) {
        return this.a.p0(i);
    }

    @Override // defpackage.r13
    public final long r0(float f) {
        return this.a.r0(f);
    }

    @Override // defpackage.ak3
    public final void r1(hy0 hy0Var, long j, long j2, float f, bk3 bk3Var, em1 em1Var, int i) {
        this.a.r1(hy0Var, j, j2, f, bk3Var, em1Var, i);
    }

    @Override // defpackage.ak3
    public final void s0(hy0 hy0Var, long j, long j2, float f, int i, float f2) {
        this.a.s0(hy0Var, j, j2, f, i, f2);
    }

    @Override // defpackage.r13
    public final float y0(int i) {
        return this.a.y0(i);
    }
}
