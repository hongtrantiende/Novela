package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ef2  reason: default package */
/* loaded from: classes3.dex */
public final class ef2 {
    public final m82 a;
    public final jk1 b;
    public final float c;
    public final lu4 d;
    public final xt4 e;
    public final mu4 f;
    public final gxa g;
    public final gxa h;
    public final gxa i;
    public final gxa j;
    public final gxa k;
    public final lq l;
    public final lq m;
    public final lq n;
    public final lq o;
    public final lq p;
    public final ow7 q;
    public final c5d r;
    public final nq7 s;

    public ef2(m82 m82Var, float f, jk1 jk1Var, float f2, lu4 lu4Var, xt4 xt4Var, mu4 mu4Var) {
        Float valueOf = Float.valueOf(0.001f);
        m82Var.getClass();
        this.a = m82Var;
        this.b = jk1Var;
        this.c = f2;
        this.d = lu4Var;
        this.e = xt4Var;
        this.f = mu4Var;
        this.g = new gxa(1.0f, 1000.0f, valueOf);
        this.h = new gxa(0.5f, 300.0f, Float.valueOf(0.010000001f));
        this.i = new gxa(1.0f, 1000.0f, valueOf);
        this.j = new gxa(0.6f, 250.0f, valueOf);
        this.k = new gxa(0.7f, 250.0f, valueOf);
        this.l = tc4.a(f, 0.001f);
        this.m = tc4.a(nae.e, 5.0f);
        this.n = tc4.a(nae.e, 0.001f);
        this.o = tc4.a(1.0f, 0.001f);
        this.p = tc4.a(1.0f, 0.001f);
        this.q = new ow7();
        this.r = new c5d();
        this.s = dab.b(kq7.a, pvc.a, new vi(this, 2));
    }

    public final float a() {
        return ((Number) this.n.e()).floatValue();
    }

    public final float b() {
        return ((Number) this.l.e.getValue()).floatValue();
    }

    public final float c() {
        return ((Number) this.l.e()).floatValue();
    }

    public final void d(float f) {
        z87.v(this.a, null, null, new u42(this, ((Number) dce.p(Float.valueOf(f), this.b)).floatValue(), (m42) null, 1), 3);
    }
}
