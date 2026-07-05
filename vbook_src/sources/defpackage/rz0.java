package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rz0  reason: default package */
/* loaded from: classes.dex */
public final class rz0 implements fjc {
    public final int a;
    public final vq4 b;
    public final n73 c = new n73();
    public final sz0 d;
    public vq4 e;
    public fjc f;
    public long g;

    public rz0(int i, int i2, vq4 vq4Var, sz0 sz0Var) {
        this.a = i2;
        this.b = vq4Var;
        this.d = sz0Var;
    }

    @Override // defpackage.fjc
    public final void a(long j, int i, int i2, int i3, ejc ejcVar) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f = this.c;
        }
        fjc fjcVar = this.f;
        String str = a2d.a;
        fjcVar.a(j, i, i2, i3, ejcVar);
    }

    @Override // defpackage.fjc
    public final void b(km8 km8Var, int i, int i2) {
        fjc fjcVar = this.f;
        String str = a2d.a;
        fjcVar.e(i, km8Var);
    }

    @Override // defpackage.fjc
    public final int c(eg2 eg2Var, int i, boolean z) {
        fjc fjcVar = this.f;
        String str = a2d.a;
        return fjcVar.f(eg2Var, i, z);
    }

    @Override // defpackage.fjc
    public final void g(vq4 vq4Var) {
        this.d.getClass();
        vq4 vq4Var2 = this.b;
        if (vq4Var2 != null) {
            vq4Var = vq4Var.d(vq4Var2);
        }
        this.e = vq4Var;
        fjc fjcVar = this.f;
        String str = a2d.a;
        fjcVar.g(vq4Var);
    }
}
