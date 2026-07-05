package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mw8  reason: default package */
/* loaded from: classes.dex */
public abstract class mw8 {
    public int a;
    public int b;
    public long c = 0;
    public long d = nw8.a;
    public long e = 0;

    public final void A0(long j) {
        if (!zy5.b(this.c, j)) {
            this.c = j;
            w0();
        }
    }

    public final void E0(long j) {
        if (!x02.c(this.d, j)) {
            this.d = j;
            w0();
        }
    }

    public Object S() {
        return null;
    }

    public abstract int o0(ec ecVar);

    public int u0() {
        return (int) (this.c & 4294967295L);
    }

    public int v0() {
        return (int) (this.c >> 32);
    }

    public final void w0() {
        this.a = dce.n((int) (this.c >> 32), x02.k(this.d), x02.i(this.d));
        int n = dce.n((int) (this.c & 4294967295L), x02.j(this.d), x02.h(this.d));
        this.b = n;
        int i = this.a;
        long j = this.c;
        this.e = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((n - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void x0(long j, float f, xt4 xt4Var);

    public void z0(long j, float f, p15 p15Var) {
        x0(j, f, null);
    }
}
