package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mh6  reason: default package */
/* loaded from: classes.dex */
public final class mh6 {
    public final m82 a;
    public final m15 b;
    public final u76 c;
    public lf4 d;
    public lf4 e;
    public lf4 f;
    public boolean g;
    public final hm8 h;
    public final hm8 i;
    public final hm8 j;
    public final hm8 k;
    public long l;
    public long m;
    public long n;
    public p15 o;
    public final lq p;
    public final lq q;
    public final hm8 r;

    public mh6(m82 m82Var, m15 m15Var, u76 u76Var) {
        p15 p15Var;
        this.a = m82Var;
        this.b = m15Var;
        this.c = u76Var;
        Boolean bool = Boolean.FALSE;
        this.h = yae.z(bool);
        this.i = yae.z(bool);
        this.j = yae.z(bool);
        this.k = yae.z(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        this.n = 9223372034707292159L;
        if (m15Var != null) {
            p15Var = m15Var.c();
        } else {
            p15Var = null;
        }
        this.o = p15Var;
        this.p = new lq(new py5(0L), fca.l, null, 12);
        this.q = new lq(Float.valueOf(1.0f), fca.f, null, 12);
        this.r = yae.z(new py5(0L));
    }

    public final void a() {
        p15 p15Var = this.o;
        lf4 lf4Var = this.d;
        boolean booleanValue = ((Boolean) this.i.getValue()).booleanValue();
        m82 m82Var = this.a;
        if (!booleanValue && lf4Var != null && p15Var != null) {
            e(true);
            boolean c = c();
            boolean z = !c;
            if (!c) {
                p15Var.g(nae.e);
            }
            z87.v(m82Var, null, null, new pz2(z, this, lf4Var, p15Var, (m42) null), 3);
        } else if (c()) {
            if (p15Var != null) {
                p15Var.g(1.0f);
            }
            z87.v(m82Var, null, null, new jh6(this, null, 0), 3);
        }
    }

    public final void b() {
        if (((Boolean) this.h.getValue()).booleanValue()) {
            z87.v(this.a, null, null, new jh6(this, null, 1), 3);
        }
    }

    public final boolean c() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void d() {
        m15 m15Var;
        boolean booleanValue = ((Boolean) this.h.getValue()).booleanValue();
        m82 m82Var = this.a;
        if (booleanValue) {
            g(false);
            z87.v(m82Var, null, null, new jh6(this, null, 2), 3);
        }
        if (((Boolean) this.i.getValue()).booleanValue()) {
            e(false);
            z87.v(m82Var, null, null, new jh6(this, null, 3), 3);
        }
        if (c()) {
            f(false);
            z87.v(m82Var, null, null, new jh6(this, null, 4), 3);
        }
        this.g = false;
        h(0L);
        this.l = 9223372034707292159L;
        p15 p15Var = this.o;
        if (p15Var != null && (m15Var = this.b) != null) {
            m15Var.a(p15Var);
        }
        this.o = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void e(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public final void g(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void h(long j) {
        this.r.setValue(new py5(j));
    }
}
