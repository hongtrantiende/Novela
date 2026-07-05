package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sma  reason: default package */
/* loaded from: classes.dex */
public final class sma extends ai0 {
    public final int K;
    public final vq4 L;
    public long M;
    public boolean N;

    public sma(jg2 jg2Var, mg2 mg2Var, vq4 vq4Var, int i, Object obj, long j, long j2, long j3, int i2, vq4 vq4Var2) {
        super(jg2Var, mg2Var, vq4Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.K = i2;
        this.L = vq4Var2;
    }

    @Override // defpackage.gs6
    public final void b() {
        fx9[] fx9VarArr;
        h0b h0bVar = this.E;
        kw5 kw5Var = this.I;
        kw5Var.getClass();
        int i = 0;
        for (fx9 fx9Var : (fx9[]) kw5Var.c) {
            if (fx9Var.H != 0) {
                fx9Var.H = 0L;
                fx9Var.B = true;
            }
        }
        fjc E = kw5Var.E(this.K);
        E.g(this.L);
        try {
            long d = h0bVar.d(this.b.a(this.M));
            if (d != -1) {
                d += this.M;
            }
            tt2 tt2Var = new tt2(this.E, this.M, d);
            while (true) {
                long j = this.M;
                if (i != -1) {
                    this.M = j + i;
                    i = E.f(tt2Var, Integer.MAX_VALUE, true);
                } else {
                    E.a(this.C, 1, (int) j, 0, null);
                    yae.k(h0bVar);
                    this.N = true;
                    return;
                }
            }
        } catch (Throwable th) {
            yae.k(h0bVar);
            throw th;
        }
    }

    @Override // defpackage.z37
    public final boolean d() {
        return this.N;
    }

    @Override // defpackage.gs6
    public final void c() {
    }
}
