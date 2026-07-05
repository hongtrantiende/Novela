package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s9c  reason: default package */
/* loaded from: classes.dex */
public final class s9c implements n57, m57 {
    public final n57 a;
    public final long b;
    public m57 c;

    public s9c(n57 n57Var, long j) {
        this.a = n57Var;
        this.b = j;
    }

    @Override // defpackage.m57
    public final void a(n57 n57Var) {
        m57 m57Var = this.c;
        m57Var.getClass();
        m57Var.a(this);
    }

    @Override // defpackage.e9a
    public final void d(f9a f9aVar) {
        n57 n57Var = (n57) f9aVar;
        m57 m57Var = this.c;
        m57Var.getClass();
        m57Var.d(this);
    }

    @Override // defpackage.n57
    public final long e(c14[] c14VarArr, boolean[] zArr, gx9[] gx9VarArr, boolean[] zArr2, long j) {
        gx9[] gx9VarArr2 = new gx9[gx9VarArr.length];
        int i = 0;
        while (true) {
            gx9 gx9Var = null;
            if (i >= gx9VarArr.length) {
                break;
            }
            r9c r9cVar = (r9c) gx9VarArr[i];
            if (r9cVar != null) {
                gx9Var = r9cVar.a;
            }
            gx9VarArr2[i] = gx9Var;
            i++;
        }
        n57 n57Var = this.a;
        long j2 = this.b;
        long e = n57Var.e(c14VarArr, zArr, gx9VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < gx9VarArr.length; i2++) {
            gx9 gx9Var2 = gx9VarArr2[i2];
            if (gx9Var2 == null) {
                gx9VarArr[i2] = null;
            } else {
                gx9 gx9Var3 = gx9VarArr[i2];
                if (gx9Var3 == null || ((r9c) gx9Var3).a != gx9Var2) {
                    gx9VarArr[i2] = new r9c(gx9Var2, j2);
                }
            }
        }
        return e + j2;
    }

    @Override // defpackage.f9a
    public final long g() {
        long g = this.a.g();
        if (g == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return g + this.b;
    }

    @Override // defpackage.n57
    public final long h(long j, o4a o4aVar) {
        long j2 = this.b;
        return this.a.h(j - j2, o4aVar) + j2;
    }

    @Override // defpackage.n57
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.n57
    public final long k(long j) {
        long j2 = this.b;
        return this.a.k(j - j2) + j2;
    }

    @Override // defpackage.n57
    public final void l(long j) {
        this.a.l(j - this.b);
    }

    @Override // defpackage.f9a
    public final boolean n() {
        return this.a.n();
    }

    @Override // defpackage.n57
    public final long p() {
        long p = this.a.p();
        if (p == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return p + this.b;
    }

    @Override // defpackage.n57
    public final void q(m57 m57Var, long j) {
        this.c = m57Var;
        this.a.q(this, j - this.b);
    }

    @Override // defpackage.n57
    public final bjc r() {
        return this.a.r();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [us6, java.lang.Object] */
    @Override // defpackage.f9a
    public final boolean t(vs6 vs6Var) {
        ?? obj = new Object();
        long j = vs6Var.a;
        obj.b = vs6Var.b;
        obj.c = vs6Var.c;
        obj.a = j - this.b;
        return this.a.t(new vs6(obj));
    }

    @Override // defpackage.f9a
    public final long u() {
        long u = this.a.u();
        if (u == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return u + this.b;
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        this.a.x(j - this.b);
    }
}
