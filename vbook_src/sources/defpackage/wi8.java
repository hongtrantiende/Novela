package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wi8  reason: default package */
/* loaded from: classes.dex */
public final class wi8 implements fh6 {
    public final rj8 a;
    public final int b;

    public wi8(rj8 rj8Var, int i) {
        this.a = rj8Var;
        this.b = i;
    }

    @Override // defpackage.fh6
    public final int a() {
        return this.a.n();
    }

    @Override // defpackage.fh6
    public final int b() {
        rj8 rj8Var = this.a;
        return Math.min(rj8Var.n() - 1, ((f37) sl1.j0(rj8Var.m().a)).a + this.b);
    }

    @Override // defpackage.fh6
    public final int c() {
        int i;
        rj8 rj8Var = this.a;
        if (rj8Var.m().a.size() == 0) {
            return 0;
        }
        int w = nxe.w(rj8Var.m());
        int i2 = rj8Var.m().b + rj8Var.m().c;
        if (i2 == 0 || (i = w / i2) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.fh6
    public final boolean d() {
        return !this.a.m().a.isEmpty();
    }

    @Override // defpackage.fh6
    public final int e() {
        return Math.max(0, this.a.e - this.b);
    }
}
