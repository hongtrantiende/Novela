package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xh8  reason: default package */
/* loaded from: classes.dex */
public final class xh8 {
    public final long a;
    public final int b;
    public final m41 c;
    public final cza d;
    public final jj9 e;
    public final k8c f;

    public xh8(l97 l97Var, jt1 jt1Var, long j, int i) {
        this.a = j;
        this.b = i;
        m41 a = k27.a(nq2.C(rse.b(), ab3.a));
        this.c = a;
        cza a2 = dza.a(cd6.a);
        this.d = a2;
        jj9 K = z1d.K(new sk4(((dt8) l97Var.a).a.d, i, 1), a, uha.b, new zy5(0L));
        this.e = K;
        this.f = new k8c(jt1Var, l97Var, i, K, a2);
    }

    public final float a() {
        long j = this.a;
        if (((int) (j >> 32)) > 0) {
            return ((int) (4294967295L & j)) / ((int) (j >> 32));
        }
        return 1.0f;
    }
}
