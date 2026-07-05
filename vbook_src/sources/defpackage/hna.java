package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hna  reason: default package */
/* loaded from: classes.dex */
public final class hna extends x06 {
    public xr L;
    public long M;
    public long N;
    public boolean O;
    public final hm8 P;

    public hna(xr xrVar) {
        super(1);
        this.L = xrVar;
        this.M = -9223372034707292160L;
        this.N = y02.b(0, 0, 0, 0, 15);
        this.P = yae.z(null);
    }

    @Override // defpackage.mq7
    public final void B1() {
        this.P.setValue(null);
    }

    @Override // defpackage.x06, defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        long j2;
        mw8 M;
        long j3;
        char c;
        long j4;
        fna fnaVar;
        long d;
        fna fnaVar2;
        boolean z = true;
        if (e37Var.I0()) {
            this.N = j;
            this.O = true;
            M = w27Var.M(j);
        } else {
            if (this.O) {
                j2 = this.N;
            } else {
                j2 = j;
            }
            M = w27Var.M(j2);
        }
        mw8 mw8Var = M;
        long j5 = (mw8Var.b & 4294967295L) | (mw8Var.a << 32);
        if (e37Var.I0()) {
            this.M = j5;
            c = ' ';
            d = j5;
            j4 = d;
        } else {
            if (c16.q(this.M)) {
                j3 = this.M;
            } else {
                j3 = j5;
            }
            hm8 hm8Var = this.P;
            fna fnaVar3 = (fna) hm8Var.getValue();
            if (fnaVar3 != null) {
                lq lqVar = fnaVar3.a;
                c = ' ';
                j4 = j5;
                z = (zy5.b(j3, ((zy5) lqVar.e()).a) || lqVar.f()) ? false : false;
                if (zy5.b(j3, ((zy5) lqVar.e.getValue()).a) && !z) {
                    fnaVar2 = fnaVar3;
                } else {
                    fnaVar3.b = ((zy5) lqVar.e()).a;
                    fnaVar2 = fnaVar3;
                    z87.v(v1(), null, null, new oj3(fnaVar2, j3, this, (m42) null), 3);
                }
                fnaVar = fnaVar2;
            } else {
                long j6 = j3;
                c = ' ';
                j4 = j5;
                fnaVar = new fna(new lq(new zy5(j6), fca.m, new zy5(4294967297L), 8), j6);
            }
            hm8Var.setValue(fnaVar);
            d = y02.d(j, ((zy5) fnaVar.a.e()).a);
        }
        int i = (int) (d >> c);
        int i2 = (int) (d & 4294967295L);
        return e37Var.q0(i, i2, ls3.a, new gna(this, j4, i, i2, e37Var, mw8Var));
    }

    @Override // defpackage.mq7
    public final void z1() {
        this.M = -9223372034707292160L;
        this.O = false;
    }
}
