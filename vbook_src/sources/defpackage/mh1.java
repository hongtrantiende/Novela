package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mh1  reason: default package */
/* loaded from: classes.dex */
public final class mh1 implements gx9, f9a, es6, hs6 {
    public final cl3 C;
    public final ox9 D;
    public final ij1 E;
    public final ih1 F;
    public final ArrayList G;
    public final List H;
    public final fx9 I;
    public final fx9[] J;
    public final kw5 K;
    public hh1 L;
    public vq4 M;
    public jf2 N;
    public long O;
    public long P;
    public int Q;
    public ai0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final int a;
    public final int[] b;
    public final vq4[] c;
    public final boolean[] d;
    public final ft2 e;
    public final jf2 f;

    public mh1(int i, int[] iArr, vq4[] vq4VarArr, ft2 ft2Var, jf2 jf2Var, ij1 ij1Var, long j, fl3 fl3Var, cl3 cl3Var, ox9 ox9Var, cl3 cl3Var2, boolean z, long j2, dr7 dr7Var) {
        ij1 ij1Var2;
        this.a = i;
        this.b = iArr;
        this.c = vq4VarArr;
        this.e = ft2Var;
        this.f = jf2Var;
        this.C = cl3Var2;
        this.D = ox9Var;
        if (dr7Var != null) {
            ij1Var2 = new ij1(dr7Var, 4);
        } else {
            ij1Var2 = new ij1("ChunkSampleStream");
        }
        this.E = ij1Var2;
        this.F = new ih1(0);
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.J = new fx9[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        fx9[] fx9VarArr = new fx9[i2];
        fl3Var.getClass();
        fx9 fx9Var = new fx9(ij1Var, fl3Var, cl3Var);
        this.I = fx9Var;
        iArr2[0] = i;
        fx9VarArr[0] = fx9Var;
        int i3 = 0;
        while (i3 < length) {
            fx9 fx9Var2 = new fx9(ij1Var, null, null);
            this.J[i3] = fx9Var2;
            int i4 = i3 + 1;
            fx9VarArr[i4] = fx9Var2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.K = new kw5(6, iArr2, fx9VarArr);
        this.O = j;
        this.P = j;
        this.S = z;
        if (z && j2 != -9223372036854775807L) {
            this.S = false;
            this.T = j2 < j;
        }
    }

    public final boolean A() {
        if ((this.S || this.T) && !this.V && !this.E.K()) {
            return true;
        }
        return false;
    }

    public final void B() {
        int C = C(this.I.u(), this.Q - 1);
        while (true) {
            int i = this.Q;
            if (i <= C) {
                this.Q = i + 1;
                ai0 ai0Var = (ai0) this.G.get(i);
                vq4 vq4Var = ai0Var.d;
                if (!vq4Var.equals(this.M)) {
                    this.C.b(this.a, vq4Var, ai0Var.e, ai0Var.f, ai0Var.C);
                }
                this.M = vq4Var;
            } else {
                return;
            }
        }
    }

    public final int C(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.G;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((ai0) arrayList.get(i2)).e(0) <= i);
        return i2 - 1;
    }

    public final void D(jf2 jf2Var) {
        fx9[] fx9VarArr;
        this.N = jf2Var;
        fx9 fx9Var = this.I;
        fx9Var.k();
        mu9 mu9Var = fx9Var.h;
        if (mu9Var != null) {
            mu9Var.y(fx9Var.e);
            fx9Var.h = null;
            fx9Var.g = null;
        }
        for (fx9 fx9Var2 : this.J) {
            fx9Var2.k();
            mu9 mu9Var2 = fx9Var2.h;
            if (mu9Var2 != null) {
                mu9Var2.y(fx9Var2.e);
                fx9Var2.h = null;
                fx9Var2.g = null;
            }
        }
        this.E.S(this);
    }

    @Override // defpackage.gx9
    public final boolean a() {
        if (!z() && this.I.z(this.V)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gx9
    public final void b() {
        ij1 ij1Var = this.E;
        ij1Var.b();
        this.I.B();
        if (!ij1Var.O()) {
            ft2 ft2Var = this.e;
            hk0 hk0Var = ft2Var.m;
            if (hk0Var == null) {
                ft2Var.a.b();
                return;
            }
            throw hk0Var;
        }
    }

    @Override // defpackage.gx9
    public final int c(s6f s6fVar, cr2 cr2Var, int i) {
        if (!z() && !A() && !this.U) {
            ai0 ai0Var = this.R;
            fx9 fx9Var = this.I;
            if (ai0Var == null || ai0Var.e(0) > fx9Var.u()) {
                B();
                return fx9Var.E(s6fVar, cr2Var, i, this.V);
            }
            return -3;
        }
        return -3;
    }

    @Override // defpackage.hs6
    public final void d() {
        fx9[] fx9VarArr;
        fx9 fx9Var = this.I;
        fx9Var.F(true);
        mu9 mu9Var = fx9Var.h;
        if (mu9Var != null) {
            mu9Var.y(fx9Var.e);
            fx9Var.h = null;
            fx9Var.g = null;
        }
        for (fx9 fx9Var2 : this.J) {
            fx9Var2.F(true);
            mu9 mu9Var2 = fx9Var2.h;
            if (mu9Var2 != null) {
                mu9Var2.y(fx9Var2.e);
                fx9Var2.h = null;
                fx9Var2.g = null;
            }
        }
        for (dt2 dt2Var : this.e.i) {
            tz0 tz0Var = dt2Var.a;
            if (tz0Var != null) {
                tz0Var.a.a();
            }
        }
        jf2 jf2Var = this.N;
        if (jf2Var != null) {
            synchronized (jf2Var) {
                xz8 xz8Var = (xz8) jf2Var.J.remove(this);
                if (xz8Var != null) {
                    fx9 fx9Var3 = xz8Var.a;
                    fx9Var3.F(true);
                    mu9 mu9Var3 = fx9Var3.h;
                    if (mu9Var3 != null) {
                        mu9Var3.y(fx9Var3.e);
                        fx9Var3.h = null;
                        fx9Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.es6
    public final void f(gs6 gs6Var, long j, long j2, boolean z) {
        hh1 hh1Var = (hh1) gs6Var;
        this.L = null;
        this.R = null;
        long j3 = hh1Var.a;
        mg2 mg2Var = hh1Var.b;
        h0b h0bVar = hh1Var.E;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        this.D.getClass();
        this.C.c(cs6Var, hh1Var.c, this.a, hh1Var.d, hh1Var.e, hh1Var.f, hh1Var.C, hh1Var.D);
        if (!z) {
            if (z()) {
                this.I.F(false);
                for (fx9 fx9Var : this.J) {
                    fx9Var.F(false);
                }
            } else if (hh1Var instanceof ai0) {
                ArrayList arrayList = this.G;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.O = this.P;
                }
            }
            this.f.d(this);
        }
    }

    @Override // defpackage.f9a
    public final long g() {
        if (z()) {
            return this.O;
        }
        if (this.V) {
            return Long.MIN_VALUE;
        }
        return v().D;
    }

    @Override // defpackage.es6
    public final void i(gs6 gs6Var, long j, long j2) {
        hh1 hh1Var = (hh1) gs6Var;
        this.L = null;
        ft2 ft2Var = this.e;
        dt2[] dt2VarArr = ft2Var.i;
        if (hh1Var instanceof ev5) {
            int e = ft2Var.j.e(((ev5) hh1Var).d);
            dt2 dt2Var = dt2VarArr[e];
            if (dt2Var.d == null) {
                tz0 tz0Var = dt2Var.a;
                tz0Var.getClass();
                jh1 a = tz0Var.a();
                if (a != null) {
                    tp9 tp9Var = dt2Var.b;
                    dt2VarArr[e] = new dt2(dt2Var.e, tp9Var, dt2Var.c, dt2Var.a, dt2Var.f, new zg1(a, tp9Var.c, 1));
                }
            }
        }
        xz8 xz8Var = ft2Var.h;
        if (xz8Var != null) {
            long j3 = xz8Var.d;
            if (j3 == -9223372036854775807L || hh1Var.D > j3) {
                xz8Var.d = hh1Var.D;
            }
            xz8Var.e.C = true;
        }
        long j4 = hh1Var.a;
        mg2 mg2Var = hh1Var.b;
        h0b h0bVar = hh1Var.E;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        this.D.getClass();
        this.C.d(cs6Var, hh1Var.c, this.a, hh1Var.d, hh1Var.e, hh1Var.f, hh1Var.C, hh1Var.D);
        this.f.d(this);
    }

    @Override // defpackage.gx9
    public final int m(long j) {
        if (z() || A() || this.U) {
            return 0;
        }
        boolean z = this.V;
        fx9 fx9Var = this.I;
        int w = fx9Var.w(z, j);
        ai0 ai0Var = this.R;
        if (ai0Var != null) {
            w = Math.min(w, ai0Var.e(0) - fx9Var.u());
        }
        fx9Var.J(w);
        B();
        return w;
    }

    @Override // defpackage.f9a
    public final boolean n() {
        return this.E.O();
    }

    @Override // defpackage.es6
    public final void o(gs6 gs6Var, long j, long j2, int i) {
        cs6 cs6Var;
        hh1 hh1Var = (hh1) gs6Var;
        if (i == 0) {
            long j3 = hh1Var.a;
            cs6Var = new cs6(hh1Var.b, j);
        } else {
            long j4 = hh1Var.a;
            mg2 mg2Var = hh1Var.b;
            h0b h0bVar = hh1Var.E;
            cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        }
        this.C.g(cs6Var, hh1Var.c, this.a, hh1Var.d, hh1Var.e, hh1Var.f, hh1Var.C, hh1Var.D, i);
    }

    public final ai0 s(int i) {
        ArrayList arrayList = this.G;
        ai0 ai0Var = (ai0) arrayList.get(i);
        a2d.V(arrayList, i, arrayList.size());
        this.Q = Math.max(this.Q, arrayList.size());
        int i2 = 0;
        this.I.n(ai0Var.e(0));
        while (true) {
            fx9[] fx9VarArr = this.J;
            if (i2 < fx9VarArr.length) {
                fx9 fx9Var = fx9VarArr[i2];
                i2++;
                fx9Var.n(ai0Var.e(i2));
            } else {
                return ai0Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
        if (r3 != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x040a  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.IOException, hk0] */
    @Override // defpackage.f9a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(defpackage.vs6 r60) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh1.t(vs6):boolean");
    }

    @Override // defpackage.f9a
    public final long u() {
        if (this.V) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.O;
        }
        long j = this.P;
        ai0 v = v();
        if (!v.d()) {
            ArrayList arrayList = this.G;
            if (arrayList.size() > 1) {
                v = (ai0) nk2.n(2, arrayList);
            } else {
                v = null;
            }
        }
        if (v != null) {
            j = Math.max(j, v.D);
        }
        return Math.max(j, this.I.r());
    }

    public final ai0 v() {
        return (ai0) nk2.n(1, this.G);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0236  */
    @Override // defpackage.es6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cy5 w(defpackage.gs6 r28, long r29, long r31, java.io.IOException r33, int r34) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh1.w(gs6, long, long, java.io.IOException, int):cy5");
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        int size;
        ij1 ij1Var = this.E;
        if (!ij1Var.K() && !z()) {
            boolean O = ij1Var.O();
            boolean z = false;
            List list = this.H;
            ft2 ft2Var = this.e;
            ArrayList arrayList = this.G;
            if (O) {
                hh1 hh1Var = this.L;
                hh1Var.getClass();
                boolean z2 = hh1Var instanceof ai0;
                if (!z2 || !y(arrayList.size() - 1)) {
                    if (ft2Var.m == null) {
                        z = ft2Var.j.f(j, hh1Var, list);
                    }
                    if (z) {
                        ij1Var.m();
                        if (z2) {
                            this.R = (ai0) hh1Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (ft2Var.m == null && ft2Var.j.length() >= 2) {
                size = ft2Var.j.k(j, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                wq9.D(!ij1Var.O());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!y(size)) {
                            break;
                        }
                        size++;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j2 = v().D;
                    ai0 s = s(size);
                    if (arrayList.isEmpty()) {
                        this.O = this.P;
                    }
                    this.V = false;
                    this.C.h(s.C, j2, this.a);
                }
            }
            if (this.I.y()) {
                this.V = true;
            }
        }
    }

    public final boolean y(int i) {
        int u;
        ai0 ai0Var = (ai0) this.G.get(i);
        if (this.I.u() > ai0Var.e(0)) {
            return true;
        }
        int i2 = 0;
        do {
            fx9[] fx9VarArr = this.J;
            if (i2 >= fx9VarArr.length) {
                return false;
            }
            u = fx9VarArr[i2].u();
            i2++;
        } while (u <= ai0Var.e(i2));
        return true;
    }

    public final boolean z() {
        if (this.O != -9223372036854775807L) {
            return true;
        }
        return false;
    }
}
