package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t17  reason: default package */
/* loaded from: classes.dex */
public final class t17 implements n57, m57 {
    public long C = -9223372036854775807L;
    public final e67 a;
    public final long b;
    public final ij1 c;
    public ci0 d;
    public n57 e;
    public m57 f;

    public t17(e67 e67Var, ij1 ij1Var, long j) {
        this.a = e67Var;
        this.c = ij1Var;
        this.b = j;
    }

    @Override // defpackage.m57
    public final void a(n57 n57Var) {
        m57 m57Var = this.f;
        String str = a2d.a;
        m57Var.a(this);
    }

    public final void b(e67 e67Var) {
        long j = this.C;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        ci0 ci0Var = this.d;
        ci0Var.getClass();
        n57 b = ci0Var.b(e67Var, this.c, j);
        this.e = b;
        if (this.f != null) {
            b.q(this, j);
        }
    }

    @Override // defpackage.e9a
    public final void d(f9a f9aVar) {
        n57 n57Var = (n57) f9aVar;
        m57 m57Var = this.f;
        String str = a2d.a;
        m57Var.d(this);
    }

    @Override // defpackage.n57
    public final long e(c14[] c14VarArr, boolean[] zArr, gx9[] gx9VarArr, boolean[] zArr2, long j) {
        long j2 = this.C;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.C = -9223372036854775807L;
        n57 n57Var = this.e;
        String str = a2d.a;
        return n57Var.e(c14VarArr, zArr, gx9VarArr, zArr2, j);
    }

    @Override // defpackage.f9a
    public final long g() {
        n57 n57Var = this.e;
        String str = a2d.a;
        return n57Var.g();
    }

    @Override // defpackage.n57
    public final long h(long j, o4a o4aVar) {
        n57 n57Var = this.e;
        String str = a2d.a;
        return n57Var.h(j, o4aVar);
    }

    @Override // defpackage.n57
    public final void j() {
        n57 n57Var = this.e;
        if (n57Var != null) {
            n57Var.j();
            return;
        }
        ci0 ci0Var = this.d;
        if (ci0Var != null) {
            ci0Var.j();
        }
    }

    @Override // defpackage.n57
    public final long k(long j) {
        n57 n57Var = this.e;
        String str = a2d.a;
        return n57Var.k(j);
    }

    @Override // defpackage.n57
    public final void l(long j) {
        n57 n57Var = this.e;
        String str = a2d.a;
        n57Var.l(j);
    }

    @Override // defpackage.f9a
    public final boolean n() {
        n57 n57Var = this.e;
        if (n57Var != null && n57Var.n()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.n57
    public final long p() {
        n57 n57Var = this.e;
        String str = a2d.a;
        return n57Var.p();
    }

    @Override // defpackage.n57
    public final void q(m57 m57Var, long j) {
        this.f = m57Var;
        n57 n57Var = this.e;
        if (n57Var != null) {
            long j2 = this.C;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            n57Var.q(this, j2);
        }
    }

    @Override // defpackage.n57
    public final bjc r() {
        n57 n57Var = this.e;
        String str = a2d.a;
        return n57Var.r();
    }

    @Override // defpackage.f9a
    public final boolean t(vs6 vs6Var) {
        n57 n57Var = this.e;
        if (n57Var != null && n57Var.t(vs6Var)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.f9a
    public final long u() {
        n57 n57Var = this.e;
        String str = a2d.a;
        return n57Var.u();
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        n57 n57Var = this.e;
        String str = a2d.a;
        n57Var.x(j);
    }
}
