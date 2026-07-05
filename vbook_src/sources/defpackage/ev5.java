package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ev5  reason: default package */
/* loaded from: classes.dex */
public final class ev5 extends hh1 {
    public final tz0 F;
    public kw5 G;
    public long H;
    public volatile boolean I;

    public ev5(jg2 jg2Var, mg2 mg2Var, vq4 vq4Var, int i, Object obj, tz0 tz0Var) {
        super(jg2Var, mg2Var, 2, vq4Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.F = tz0Var;
    }

    @Override // defpackage.gs6
    public final void b() {
        boolean z;
        if (this.H == 0) {
            this.F.b(this.G, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            mg2 a = this.b.a(this.H);
            h0b h0bVar = this.E;
            tt2 tt2Var = new tt2(h0bVar, a.e, h0bVar.d(a));
            while (!this.I) {
                int b = this.F.a.b(tt2Var, tz0.G);
                boolean z2 = false;
                if (b != 1) {
                    z = true;
                } else {
                    z = false;
                }
                wq9.D(z);
                if (b == 0) {
                    z2 = true;
                    continue;
                }
                if (!z2) {
                    break;
                }
            }
            this.H = tt2Var.d - this.b.e;
            this.F.a();
        } finally {
            yae.k(this.E);
        }
    }

    @Override // defpackage.gs6
    public final void c() {
        this.I = true;
    }
}
