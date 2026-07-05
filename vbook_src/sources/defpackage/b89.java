package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b89  reason: default package */
/* loaded from: classes.dex */
public final class b89 implements n57, t94, es6, hs6, ex9 {
    public static final Map n0;
    public static final vq4 o0;
    public final f89 C;
    public final ij1 D;
    public final long E;
    public final vq4 F;
    public final long G;
    public final ij1 H;
    public final ij1 I;
    public final vy1 J;
    public final u79 K;
    public final u79 L;
    public final Handler M;
    public m57 N;
    public rk5 O;
    public x79[] P;
    public fx9[] Q;
    public a89[] R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public oaa W;
    public m4a X;
    public long Y;
    public boolean Z;
    public final Uri a;
    public int a0;
    public final jg2 b;
    public final long b0 = Long.MIN_VALUE;
    public final fl3 c;
    public boolean c0;
    public final ox9 d;
    public boolean d0;
    public final cl3 e;
    public boolean e0;
    public final cl3 f;
    public int f0;
    public boolean g0;
    public long h0;
    public long i0;
    public boolean j0;
    public int k0;
    public boolean l0;
    public boolean m0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        n0 = Collections.unmodifiableMap(hashMap);
        uq4 uq4Var = new uq4();
        uq4Var.a = "icy";
        uq4Var.n = lc7.p("application/x-icy");
        o0 = new vq4(uq4Var);
    }

    public b89(Uri uri, jg2 jg2Var, ij1 ij1Var, fl3 fl3Var, cl3 cl3Var, ox9 ox9Var, cl3 cl3Var2, f89 f89Var, ij1 ij1Var2, int i, vq4 vq4Var, long j, dr7 dr7Var) {
        ij1 ij1Var3;
        this.a = uri;
        this.b = jg2Var;
        this.c = fl3Var;
        this.f = cl3Var;
        this.d = ox9Var;
        this.e = cl3Var2;
        this.C = f89Var;
        this.D = ij1Var2;
        this.E = i;
        this.F = vq4Var;
        if (dr7Var != null) {
            ij1Var3 = new ij1(dr7Var, 4);
        } else {
            ij1Var3 = new ij1("ProgressiveMediaPeriod");
        }
        this.H = ij1Var3;
        this.I = ij1Var;
        this.G = j;
        this.J = new vy1();
        this.K = new u79(this, 1);
        this.L = new u79(this, 2);
        this.M = a2d.p(null);
        this.R = new a89[0];
        this.Q = new fx9[0];
        this.P = new x79[0];
        this.i0 = -9223372036854775807L;
        this.a0 = 1;
    }

    public final void A() {
        boolean z;
        boolean z2;
        tb7 a;
        char c;
        long j = this.G;
        if (!this.m0 && !this.T && this.S && this.X != null) {
            boolean z3 = false;
            for (fx9 fx9Var : this.Q) {
                if (fx9Var.x() == null) {
                    return;
                }
            }
            vy1 vy1Var = this.J;
            synchronized (vy1Var) {
                vy1Var.b = false;
            }
            int length = this.Q.length;
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                char c2 = 1;
                if (i2 >= length) {
                    break;
                }
                vq4 x = this.Q[i2].x();
                x.getClass();
                int i4 = lc7.i(x.o);
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                c = 0;
                            } else {
                                c = 2;
                            }
                        } else {
                            c = 1;
                        }
                    } else {
                        c = 4;
                    }
                } else {
                    c = 3;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                c2 = 0;
                            } else {
                                c2 = 2;
                            }
                        }
                    } else {
                        c2 = 4;
                    }
                } else {
                    c2 = 3;
                }
                if (c > c2) {
                    i3 = i2;
                    i = i4;
                }
                i2++;
            }
            ajc[] ajcVarArr = new ajc[length];
            boolean[] zArr = new boolean[length];
            int i5 = 0;
            while (i5 < length) {
                vq4 x2 = this.Q[i5].x();
                x2.getClass();
                String str = x2.o;
                boolean k = lc7.k(str);
                if (!k && !lc7.o(str)) {
                    z = z3;
                } else {
                    z = true;
                }
                zArr[i5] = z;
                boolean z4 = z3;
                this.U |= z;
                boolean m = lc7.m(str);
                if (j != -9223372036854775807L && length == 1 && m) {
                    z2 = true;
                } else {
                    z2 = z4 ? 1 : 0;
                }
                this.V = z2;
                rk5 rk5Var = this.O;
                if (rk5Var != null) {
                    int i6 = rk5Var.a;
                    if (k || this.R[i5].b) {
                        tb7 tb7Var = x2.l;
                        if (tb7Var == null) {
                            rb7[] rb7VarArr = new rb7[1];
                            rb7VarArr[z4 ? 1 : 0] = rk5Var;
                            a = new tb7(rb7VarArr);
                        } else {
                            rb7[] rb7VarArr2 = new rb7[1];
                            rb7VarArr2[z4 ? 1 : 0] = rk5Var;
                            a = tb7Var.a(rb7VarArr2);
                        }
                        uq4 a2 = x2.a();
                        a2.k = a;
                        x2 = new vq4(a2);
                    }
                    if (k && x2.h == -1 && x2.i == -1 && i6 != -1) {
                        uq4 a3 = x2.a();
                        a3.h = i6;
                        x2 = new vq4(a3);
                    }
                }
                int m2 = this.c.m(x2);
                uq4 a4 = x2.a();
                a4.O = m2;
                vq4 vq4Var = new vq4(a4);
                if (i5 != i3) {
                    uq4 a5 = vq4Var.a();
                    a5.l = Integer.toString(i3);
                    vq4Var = new vq4(a5);
                }
                ajcVarArr[i5] = new ajc(Integer.toString(i5), vq4Var);
                this.e0 = vq4Var.u | this.e0;
                this.Q[i5].I(this.b0);
                i5++;
                z3 = z4 ? 1 : 0;
            }
            this.W = new oaa(new bjc(ajcVarArr), zArr);
            if (this.V && this.Y == -9223372036854775807L) {
                this.Y = j;
                this.X = new v79(this, this.X);
            }
            this.C.u(this.Y, this.X, this.Z);
            this.T = true;
            m57 m57Var = this.N;
            m57Var.getClass();
            m57Var.a(this);
        }
    }

    public final void B(int i) {
        b();
        oaa oaaVar = this.W;
        boolean[] zArr = (boolean[]) oaaVar.e;
        if (!zArr[i]) {
            vq4 vq4Var = ((bjc) oaaVar.b).a(i).d[0];
            this.e.b(lc7.i(vq4Var.o), vq4Var, 0, null, this.h0);
            zArr[i] = true;
        }
    }

    public final void C(int i) {
        b();
        if (this.j0) {
            if ((!this.U || ((boolean[]) this.W.c)[i]) && !this.Q[i].z(false)) {
                this.i0 = 0L;
                this.j0 = false;
                this.d0 = true;
                this.h0 = 0L;
                this.k0 = 0;
                for (fx9 fx9Var : this.Q) {
                    fx9Var.F(false);
                }
                m57 m57Var = this.N;
                m57Var.getClass();
                m57Var.d(this);
            }
        }
    }

    public final fjc D(a89 a89Var) {
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            if (a89Var.equals(this.R[i])) {
                return this.Q[i];
            }
        }
        if (this.S) {
            st0.w("ProgressiveMediaPeriod", "Extractor added new track (id=" + a89Var.a + ") after finishing tracks.");
            return new n73();
        }
        fl3 fl3Var = this.c;
        fl3Var.getClass();
        fx9 fx9Var = new fx9(this.D, fl3Var, this.f);
        x79 x79Var = new x79(fx9Var);
        fx9Var.f = this;
        int i2 = length + 1;
        a89[] a89VarArr = (a89[]) Arrays.copyOf(this.R, i2);
        a89VarArr[length] = a89Var;
        this.R = a89VarArr;
        fx9[] fx9VarArr = (fx9[]) Arrays.copyOf(this.Q, i2);
        fx9VarArr[length] = fx9Var;
        this.Q = fx9VarArr;
        x79[] x79VarArr = (x79[]) Arrays.copyOf(this.P, i2);
        x79VarArr[length] = x79Var;
        this.P = x79VarArr;
        return x79Var;
    }

    public final void E(m4a m4aVar) {
        m4a ge0Var;
        boolean z;
        if (this.O == null) {
            ge0Var = m4aVar;
        } else {
            ge0Var = new ge0(-9223372036854775807L);
        }
        this.X = ge0Var;
        this.Y = m4aVar.g();
        int i = 1;
        if (!this.g0 && m4aVar.g() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        this.Z = z;
        if (z) {
            i = 7;
        }
        this.a0 = i;
        if (this.T) {
            this.C.u(this.Y, m4aVar, z);
        } else {
            A();
        }
    }

    public final void F() {
        y79 y79Var = new y79(this, this.a, this.b, this.I, this, this.J);
        if (this.T) {
            wq9.D(z());
            long j = this.b0;
            if (j == Long.MIN_VALUE) {
                j = this.Y;
            }
            if (j != -9223372036854775807L && this.i0 > j) {
                this.l0 = true;
                this.i0 = -9223372036854775807L;
                return;
            }
            m4a m4aVar = this.X;
            m4aVar.getClass();
            long j2 = m4aVar.e(this.i0).a.b;
            long j3 = this.i0;
            y79Var.f.a = j2;
            y79Var.E = j3;
            y79Var.D = true;
            y79Var.H = false;
            for (fx9 fx9Var : this.Q) {
                fx9Var.t = this.i0;
            }
            this.i0 = -9223372036854775807L;
        }
        this.k0 = c();
        this.H.Z(y79Var, this, this.d.r(this.a0));
    }

    public final boolean G() {
        if (!this.d0 && !z()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ex9
    public final void a() {
        this.M.post(this.K);
    }

    public final void b() {
        wq9.D(this.T);
        this.W.getClass();
        this.X.getClass();
    }

    public final int c() {
        fx9[] fx9VarArr;
        int i = 0;
        for (fx9 fx9Var : this.Q) {
            i += fx9Var.q + fx9Var.p;
        }
        return i;
    }

    @Override // defpackage.hs6
    public final void d() {
        fx9[] fx9VarArr;
        for (fx9 fx9Var : this.Q) {
            fx9Var.F(true);
            mu9 mu9Var = fx9Var.h;
            if (mu9Var != null) {
                mu9Var.y(fx9Var.e);
                fx9Var.h = null;
                fx9Var.g = null;
            }
        }
        ij1 ij1Var = this.I;
        r94 r94Var = (r94) ij1Var.c;
        if (r94Var != null) {
            r94Var.a();
            ij1Var.c = null;
        }
        ij1Var.d = null;
    }

    @Override // defpackage.n57
    public final long e(c14[] c14VarArr, boolean[] zArr, gx9[] gx9VarArr, boolean[] zArr2, long j) {
        boolean z;
        c14 c14Var;
        boolean z2;
        boolean z3;
        b();
        oaa oaaVar = this.W;
        bjc bjcVar = (bjc) oaaVar.b;
        boolean[] zArr3 = (boolean[]) oaaVar.d;
        int i = this.f0;
        int i2 = 0;
        for (int i3 = 0; i3 < c14VarArr.length; i3++) {
            gx9 gx9Var = gx9VarArr[i3];
            if (gx9Var != null && (c14VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((z79) gx9Var).a;
                wq9.D(zArr3[i4]);
                this.f0--;
                zArr3[i4] = false;
                gx9VarArr[i3] = null;
            }
        }
        if (!this.c0 ? !(j == 0 || this.V) : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < c14VarArr.length; i5++) {
            if (gx9VarArr[i5] == null && (c14Var = c14VarArr[i5]) != null) {
                if (c14Var.length() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                wq9.D(z2);
                if (c14Var.j(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                wq9.D(z3);
                int b = bjcVar.b(c14Var.c());
                wq9.D(!zArr3[b]);
                this.f0++;
                zArr3[b] = true;
                this.e0 = c14Var.n().u | this.e0;
                gx9VarArr[i5] = new z79(this, b);
                zArr2[i5] = true;
                if (!z) {
                    fx9 fx9Var = this.Q[b];
                    if (fx9Var.u() != 0 && !fx9Var.H(true, j)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.f0 == 0) {
            this.j0 = false;
            this.d0 = false;
            this.e0 = false;
            ij1 ij1Var = this.H;
            if (ij1Var.O()) {
                fx9[] fx9VarArr = this.Q;
                int length = fx9VarArr.length;
                while (i2 < length) {
                    fx9VarArr[i2].k();
                    i2++;
                }
                ij1Var.m();
            } else {
                this.l0 = false;
                for (fx9 fx9Var2 : this.Q) {
                    fx9Var2.F(false);
                }
            }
        } else if (z) {
            j = k(j);
            while (i2 < gx9VarArr.length) {
                if (gx9VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.c0 = true;
        return j;
    }

    @Override // defpackage.es6
    public final void f(gs6 gs6Var, long j, long j2, boolean z) {
        y79 y79Var = (y79) gs6Var;
        h0b h0bVar = y79Var.b;
        cs6 cs6Var = new cs6(y79Var.F, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        this.d.getClass();
        this.e.c(cs6Var, 1, -1, null, 0, null, y79Var.E, this.Y);
        if (!z) {
            for (fx9 fx9Var : this.Q) {
                fx9Var.F(false);
            }
            if (this.f0 > 0) {
                m57 m57Var = this.N;
                m57Var.getClass();
                m57Var.d(this);
            }
        }
    }

    @Override // defpackage.f9a
    public final long g() {
        return u();
    }

    @Override // defpackage.n57
    public final long h(long j, o4a o4aVar) {
        b();
        if (!this.X.c()) {
            return 0L;
        }
        l4a e = this.X.e(j);
        return o4aVar.a(j, e.a.a, e.b.a);
    }

    @Override // defpackage.es6
    public final void i(gs6 gs6Var, long j, long j2) {
        long j3;
        y79 y79Var = (y79) gs6Var;
        if (this.Y == -9223372036854775807L && this.X != null) {
            long y = y(true);
            if (y == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = y + 10000;
            }
            this.Y = j3;
            this.C.u(j3, this.X, this.Z);
        }
        h0b h0bVar = y79Var.b;
        cs6 cs6Var = new cs6(y79Var.F, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        this.d.getClass();
        this.e.d(cs6Var, 1, -1, null, 0, null, y79Var.E, this.Y);
        this.l0 = true;
        m57 m57Var = this.N;
        m57Var.getClass();
        m57Var.d(this);
    }

    @Override // defpackage.n57
    public final void j() {
        int r = this.d.r(this.a0);
        ij1 ij1Var = this.H;
        IOException iOException = (IOException) ij1Var.d;
        if (iOException == null) {
            fs6 fs6Var = (fs6) ij1Var.c;
            if (fs6Var != null) {
                if (r == Integer.MIN_VALUE) {
                    r = fs6Var.a;
                }
                IOException iOException2 = fs6Var.e;
                if (iOException2 != null && fs6Var.f > r) {
                    throw iOException2;
                }
            }
            if (this.l0 && !this.T) {
                throw xm8.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override // defpackage.n57
    public final long k(long j) {
        boolean z;
        boolean H;
        b();
        boolean[] zArr = (boolean[]) this.W.c;
        if (!this.X.c()) {
            j = 0;
        }
        this.d0 = false;
        if (this.h0 == j) {
            z = true;
        } else {
            z = false;
        }
        this.h0 = j;
        if (z()) {
            this.i0 = j;
            return j;
        }
        int i = this.a0;
        ij1 ij1Var = this.H;
        if (i != 7 && (this.l0 || ij1Var.O())) {
            int length = this.Q.length;
            for (int i2 = 0; i2 < length; i2++) {
                fx9 fx9Var = this.Q[i2];
                if (this.P[i2].d.get() == w79.a && (fx9Var.u() != 0 || !z)) {
                    if (this.V) {
                        H = fx9Var.G(fx9Var.q);
                    } else {
                        H = fx9Var.H(this.l0, j);
                    }
                    if (H) {
                        continue;
                    } else if (!zArr[i2] && this.U) {
                    }
                }
            }
            return j;
        }
        this.j0 = false;
        this.i0 = j;
        this.l0 = false;
        this.e0 = false;
        if (ij1Var.O()) {
            for (fx9 fx9Var2 : this.Q) {
                fx9Var2.k();
            }
            ij1Var.m();
            return j;
        }
        ij1Var.d = null;
        for (fx9 fx9Var3 : this.Q) {
            fx9Var3.F(false);
        }
        return j;
    }

    @Override // defpackage.n57
    public final void l(long j) {
        if (!this.V) {
            b();
            if (!z()) {
                boolean[] zArr = (boolean[]) this.W.d;
                int length = this.Q.length;
                for (int i = 0; i < length; i++) {
                    this.Q[i].j(zArr[i], j);
                }
            }
        }
    }

    @Override // defpackage.t94
    public final void m() {
        this.S = true;
        this.M.post(this.K);
    }

    @Override // defpackage.f9a
    public final boolean n() {
        boolean z;
        if (!this.l0 && this.H.O()) {
            vy1 vy1Var = this.J;
            synchronized (vy1Var) {
                z = vy1Var.b;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.es6
    public final void o(gs6 gs6Var, long j, long j2, int i) {
        cs6 cs6Var;
        y79 y79Var = (y79) gs6Var;
        h0b h0bVar = y79Var.b;
        if (i == 0) {
            cs6Var = new cs6(y79Var.F, j);
        } else {
            cs6Var = new cs6(y79Var.F, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        }
        this.e.g(cs6Var, 1, -1, null, 0, null, y79Var.E, this.Y, i);
    }

    @Override // defpackage.n57
    public final long p() {
        if (this.e0) {
            this.e0 = false;
            return this.h0;
        } else if (this.d0) {
            if (this.l0 || c() > this.k0) {
                this.d0 = false;
                return this.h0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override // defpackage.n57
    public final void q(m57 m57Var, long j) {
        this.N = m57Var;
        vq4 vq4Var = this.F;
        if (vq4Var != null) {
            s(0, 3).g(vq4Var);
            E(new yt5(-9223372036854775807L, new long[]{0}, new long[]{0}));
            m();
            this.i0 = j;
            return;
        }
        this.J.c();
        F();
    }

    @Override // defpackage.n57
    public final bjc r() {
        b();
        return (bjc) this.W.b;
    }

    @Override // defpackage.t94
    public final fjc s(int i, int i2) {
        return D(new a89(i, false));
    }

    @Override // defpackage.f9a
    public final boolean t(vs6 vs6Var) {
        if (!this.l0) {
            ij1 ij1Var = this.H;
            if (!ij1Var.K() && !this.j0) {
                if ((!this.T && this.F == null) || this.f0 != 0) {
                    boolean c = this.J.c();
                    if (!ij1Var.O()) {
                        F();
                        return true;
                    }
                    return c;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.f9a
    public final long u() {
        long j;
        boolean z;
        b();
        if (this.l0 || this.f0 == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.i0;
        }
        if (this.U) {
            int length = this.Q.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                oaa oaaVar = this.W;
                if (((boolean[]) oaaVar.c)[i] && ((boolean[]) oaaVar.d)[i]) {
                    fx9 fx9Var = this.Q[i];
                    synchronized (fx9Var) {
                        z = fx9Var.y;
                    }
                    if (!z) {
                        j = Math.min(j, this.Q[i].r());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = y(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.h0;
        }
        return j;
    }

    @Override // defpackage.t94
    public final void v(m4a m4aVar) {
        this.M.post(new ex2(22, this, m4aVar));
    }

    @Override // defpackage.es6
    public final cy5 w(gs6 gs6Var, long j, long j2, IOException iOException, int i) {
        long min;
        int i2;
        cy5 cy5Var;
        m4a m4aVar;
        y79 y79Var = (y79) gs6Var;
        h0b h0bVar = y79Var.b;
        cs6 cs6Var = new cs6(y79Var.F, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        String str = a2d.a;
        this.d.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof xm8) || (th instanceof FileNotFoundException) || (th instanceof mf5) || (th instanceof is6) || ((th instanceof kg2) && ((kg2) th).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            cy5Var = ij1.H;
        } else {
            int c = c();
            if (c > this.k0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!this.g0 && ((m4aVar = this.X) == null || m4aVar.g() == -9223372036854775807L)) {
                if (this.T && !G()) {
                    this.j0 = true;
                    cy5Var = ij1.G;
                } else {
                    this.d0 = this.T;
                    this.h0 = 0L;
                    this.k0 = 0;
                    for (fx9 fx9Var : this.Q) {
                        fx9Var.F(false);
                    }
                    y79Var.f.a = 0L;
                    y79Var.E = 0L;
                    y79Var.D = true;
                    y79Var.H = false;
                }
            } else {
                this.k0 = c;
            }
            cy5Var = new cy5(min, i2, false);
        }
        this.e.e(cs6Var, 1, -1, null, 0, null, y79Var.E, this.Y, iOException, !cy5Var.a());
        return cy5Var;
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        if (this.f0 > 0 && !z()) {
            int i = 0;
            if (this.b0 != Long.MIN_VALUE) {
                b();
                int i2 = 1;
                while (true) {
                    fx9[] fx9VarArr = this.Q;
                    if (i >= fx9VarArr.length) {
                        break;
                    }
                    oaa oaaVar = this.W;
                    if (((boolean[]) oaaVar.d)[i] && (((boolean[]) oaaVar.c)[i] || !this.U)) {
                        i2 &= fx9VarArr[i].y();
                    }
                    i++;
                }
                i = i2;
            }
            if (i != 0) {
                this.l0 = true;
            }
        }
    }

    public final long y(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.Q.length; i++) {
            if (!z) {
                oaa oaaVar = this.W;
                oaaVar.getClass();
                if (!((boolean[]) oaaVar.d)[i]) {
                }
            }
            j = Math.max(j, this.Q[i].r());
        }
        return j;
    }

    public final boolean z() {
        if (this.i0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }
}
