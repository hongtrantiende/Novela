package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q55  reason: default package */
/* loaded from: classes.dex */
public final class q55 implements r94 {
    public final r94 a;
    public final boolean b;

    public q55(int i) {
        boolean z = (i & 1) != 0;
        this.b = z;
        if (z) {
            this.a = new rma(-1, -1, "image/heif");
        } else {
            this.a = new p55();
        }
    }

    @Override // defpackage.r94
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        return this.a.b(s94Var, fr2Var);
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        if (this.b) {
            return vqe.C((tt2) s94Var, false);
        }
        return this.a.c(s94Var);
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        this.a.d(j, j2);
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.a.f(t94Var);
    }
}
