package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fj3  reason: default package */
/* loaded from: classes3.dex */
public final class fj3 extends mq7 implements fd6 {
    public pe K;
    public lu4 L;
    public ff8 M;
    public boolean N;

    @Override // defpackage.mq7
    public final void A1() {
        this.N = false;
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        boolean z;
        w27Var.getClass();
        mw8 M = w27Var.M(j);
        if (!e37Var.I0() || !this.N) {
            int i = M.a;
            yk8 yk8Var = (yk8) this.L.invoke(new zy5((M.b & 4294967295L) | (i << 32)), new x02(j));
            pe peVar = this.K;
            t07 t07Var = (t07) yk8Var.a;
            Object obj = yk8Var.b;
            peVar.getClass();
            hm8 hm8Var = peVar.l;
            t07Var.getClass();
            if (!c16.i(peVar.d(), t07Var)) {
                peVar.m.setValue(t07Var);
                sw7 sw7Var = peVar.e.b;
                boolean f = sw7Var.f();
                if (f) {
                    try {
                        ke keVar = peVar.n;
                        float d = peVar.d().d(obj);
                        if (!Float.isNaN(d)) {
                            pe peVar2 = keVar.a;
                            peVar2.j.i(d);
                            peVar2.k.i(nae.e);
                            hm8Var.setValue(null);
                        }
                        peVar.g(obj);
                        sw7Var.q(null);
                    } catch (Throwable th) {
                        sw7Var.q(null);
                        throw th;
                    }
                }
                if (!f) {
                    hm8Var.setValue(obj);
                }
            }
        }
        if (!e37Var.I0() && !this.N) {
            z = false;
        } else {
            z = true;
        }
        this.N = z;
        return e37Var.q0(M.a, M.b, ls3.a, new r7(28, e37Var, this, M));
    }
}
