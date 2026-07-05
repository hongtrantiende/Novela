package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cnc  reason: default package */
/* loaded from: classes.dex */
public final class cnc extends yv7 {
    public final yv7 o;
    public final boolean p;
    public final boolean q;
    public xt4 r;
    public xt4 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cnc(defpackage.yv7 r8, defpackage.xt4 r9, defpackage.xt4 r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            eja r0 = defpackage.dra.a
            if (r8 == 0) goto La
            xt4 r0 = r8.e()
            if (r0 != 0) goto Le
        La:
            lz4 r0 = defpackage.dra.j
            xt4 r0 = r0.e
        Le:
            xt4 r5 = defpackage.dra.k(r9, r0, r11)
            if (r8 == 0) goto L1a
            xt4 r9 = r8.i()
            if (r9 != 0) goto L1e
        L1a:
            lz4 r9 = defpackage.dra.j
            xt4 r9 = r9.f
        L1e:
            xt4 r6 = defpackage.dra.l(r10, r9)
            r2 = 0
            cra r4 = defpackage.cra.e
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.o = r8
            r1.p = r11
            r1.q = r12
            xt4 r7 = r1.e
            r1.r = r7
            xt4 r7 = r1.f
            r1.s = r7
            long r7 = defpackage.hc2.i()
            r1.t = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnc.<init>(yv7, xt4, xt4, boolean, boolean):void");
    }

    @Override // defpackage.yv7
    public final void B(uv7 uv7Var) {
        vve.o();
        throw null;
    }

    @Override // defpackage.yv7
    public final yv7 C(xt4 xt4Var, xt4 xt4Var2) {
        xt4 k = dra.k(xt4Var, this.r, true);
        xt4 l = dra.l(xt4Var2, this.s);
        if (!this.p) {
            return new cnc(D().C(null, l), k, l, false, true);
        }
        return D().C(k, l);
    }

    public final yv7 D() {
        yv7 yv7Var = this.o;
        if (yv7Var == null) {
            return dra.j;
        }
        return yv7Var;
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final void c() {
        yv7 yv7Var;
        this.c = true;
        if (this.q && (yv7Var = this.o) != null) {
            yv7Var.c();
        }
    }

    @Override // defpackage.zqa
    public final cra d() {
        return D().d();
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final xt4 e() {
        return this.r;
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.zqa
    public final long g() {
        return D().g();
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final int h() {
        return D().h();
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final xt4 i() {
        return this.s;
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final void k() {
        vve.o();
        throw null;
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final void l() {
        vve.o();
        throw null;
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final void m() {
        D().m();
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final void n(iza izaVar) {
        D().n(izaVar);
    }

    @Override // defpackage.zqa
    public final void r(cra craVar) {
        vve.o();
        throw null;
    }

    @Override // defpackage.zqa
    public final void s(long j) {
        vve.o();
        throw null;
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final zqa u(xt4 xt4Var) {
        xt4 k = dra.k(xt4Var, this.r, true);
        if (!this.p) {
            return dra.g(D().u(null), k, true);
        }
        return D().u(k);
    }

    @Override // defpackage.yv7
    public final rae w() {
        return D().w();
    }

    @Override // defpackage.yv7
    public final uv7 x() {
        return D().x();
    }

    @Override // defpackage.yv7
    public final xt4 y() {
        return this.r;
    }
}
