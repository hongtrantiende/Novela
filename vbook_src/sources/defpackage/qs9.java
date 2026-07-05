package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qs9  reason: default package */
/* loaded from: classes.dex */
public final class qs9 implements t15 {
    public float C;
    public long D;
    public long E;
    public float F;
    public float G;
    public float H;
    public float I;
    public long J;
    public wea K;
    public boolean L;
    public int M;
    public long N;
    public hc6 O;
    public r13 P;
    public tc6 Q;
    public c3e R;
    public em1 S;
    public int T;
    public kwe U;
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;

    public qs9() {
        long j = u15.a;
        this.D = j;
        this.E = j;
        this.I = 8.0f;
        this.J = ckc.b;
        this.K = lre.g;
        this.M = 0;
        this.N = 9205357640488583168L;
        this.O = hc6.a;
        this.P = fpe.d();
        this.Q = tc6.a;
        this.T = 3;
    }

    @Override // defpackage.t15
    public final void A(float f) {
        if (this.I == f) {
            return;
        }
        this.a |= 2048;
        this.I = f;
    }

    @Override // defpackage.t15
    public final float B() {
        return this.c;
    }

    @Override // defpackage.t15
    public final void C(float f) {
        if (this.F == f) {
            return;
        }
        this.a |= 256;
        this.F = f;
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.P.G0();
    }

    @Override // defpackage.t15
    public final void J0(wea weaVar) {
        if (!c16.i(this.K, weaVar)) {
            this.a |= 8192;
            this.K = weaVar;
        }
    }

    @Override // defpackage.t15
    public final void Z0(long j) {
        if (!ckc.a(this.J, j)) {
            this.a |= 4096;
            this.J = j;
        }
    }

    public final void a() {
        v(1.0f);
        l(1.0f);
        q(1.0f);
        x(nae.e);
        i(nae.e);
        e(nae.e);
        long j = u15.a;
        u(j);
        y(j);
        C(nae.e);
        c(nae.e);
        h(nae.e);
        A(8.0f);
        Z0(ckc.b);
        J0(lre.g);
        w(false);
        r(null);
        s(null);
        k(3);
        k0(0);
        s1(hc6.a);
        this.N = 9205357640488583168L;
        this.U = null;
        this.a = 0;
    }

    @Override // defpackage.t15
    public final long b() {
        return this.N;
    }

    @Override // defpackage.t15
    public final void c(float f) {
        if (this.G == f) {
            return;
        }
        this.a |= 512;
        this.G = f;
    }

    @Override // defpackage.t15
    public final float d() {
        return this.b;
    }

    @Override // defpackage.t15
    public final void e(float f) {
        if (this.C == f) {
            return;
        }
        this.a |= 32;
        this.C = f;
    }

    @Override // defpackage.r13
    public final float f() {
        return this.P.f();
    }

    @Override // defpackage.t15
    public final void h(float f) {
        if (this.H == f) {
            return;
        }
        this.a |= 1024;
        this.H = f;
    }

    @Override // defpackage.t15
    public final void i(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    @Override // defpackage.t15
    public final void k(int i) {
        if (this.T == i) {
            return;
        }
        this.a |= 524288;
        this.T = i;
    }

    @Override // defpackage.t15
    public final void k0(int i) {
        if (this.M == i) {
            return;
        }
        this.a |= 32768;
        this.M = i;
    }

    @Override // defpackage.t15
    public final void l(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    @Override // defpackage.t15
    public final void q(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    @Override // defpackage.t15
    public final void r(c3e c3eVar) {
        if (!c16.i(this.R, c3eVar)) {
            this.a |= 131072;
            this.R = c3eVar;
        }
    }

    @Override // defpackage.t15
    public final void s(em1 em1Var) {
        if (!c16.i(this.S, em1Var)) {
            this.a |= 262144;
            this.S = em1Var;
        }
    }

    @Override // defpackage.t15
    public final void s1(hc6 hc6Var) {
        if (!c16.i(this.O, hc6Var)) {
            this.a |= 1048576;
            this.O = hc6Var;
        }
    }

    @Override // defpackage.t15
    public final void u(long j) {
        if (!zl1.c(this.D, j)) {
            this.a |= 64;
            this.D = j;
        }
    }

    @Override // defpackage.t15
    public final void v(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    @Override // defpackage.t15
    public final void w(boolean z) {
        if (this.L != z) {
            this.a |= 16384;
            this.L = z;
        }
    }

    @Override // defpackage.t15
    public final void x(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    @Override // defpackage.t15
    public final void y(long j) {
        if (!zl1.c(this.E, j)) {
            this.a |= Token.CASE;
            this.E = j;
        }
    }
}
