package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k12  reason: default package */
/* loaded from: classes.dex */
public final class k12 extends ai0 {
    public final int K;
    public final long L;
    public final tz0 M;
    public long N;
    public volatile boolean O;
    public boolean P;

    public k12(jg2 jg2Var, mg2 mg2Var, vq4 vq4Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, tz0 tz0Var) {
        super(jg2Var, mg2Var, vq4Var, i, obj, j, j2, j3, j4, j5);
        this.K = i2;
        this.L = j6;
        this.M = tz0Var;
    }

    @Override // defpackage.z37
    public final long a() {
        return this.F + this.K;
    }

    @Override // defpackage.gs6
    public final void b() {
        boolean z;
        boolean z2;
        fx9[] fx9VarArr;
        long j;
        kw5 kw5Var = this.I;
        kw5Var.getClass();
        if (this.N == 0) {
            long j2 = this.L;
            for (fx9 fx9Var : (fx9[]) kw5Var.c) {
                if (fx9Var.H != j2) {
                    fx9Var.H = j2;
                    fx9Var.B = true;
                }
            }
            tz0 tz0Var = this.M;
            long j3 = this.G;
            long j4 = -9223372036854775807L;
            if (j3 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j3 - this.L;
            }
            long j5 = this.H;
            if (j5 != -9223372036854775807L) {
                j4 = j5 - this.L;
            }
            tz0Var.b(kw5Var, j, j4);
        }
        try {
            mg2 a = this.b.a(this.N);
            h0b h0bVar = this.E;
            tt2 tt2Var = new tt2(h0bVar, a.e, h0bVar.d(a));
            while (!this.O) {
                int b = this.M.a.b(tt2Var, tz0.G);
                if (b != 1) {
                    z = true;
                } else {
                    z = false;
                }
                wq9.D(z);
                if (b == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
            }
            vq4 vq4Var = this.d;
            String str = vq4Var.n;
            int i = vq4Var.N;
            int i2 = vq4Var.O;
            if (lc7.m(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                fjc E = kw5Var.E(4);
                int i3 = i * i2;
                long j6 = (this.D - this.C) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    E.e(0, new km8());
                    E.a(i4 * j6, 0, 0, 0, null);
                }
            }
            this.N = tt2Var.d - this.b.e;
            yae.k(this.E);
            this.P = !this.O;
        } catch (Throwable th) {
            yae.k(this.E);
            throw th;
        }
    }

    @Override // defpackage.gs6
    public final void c() {
        this.O = true;
    }

    @Override // defpackage.z37
    public final boolean d() {
        return this.P;
    }
}
