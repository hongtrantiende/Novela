package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rf6  reason: default package */
/* loaded from: classes.dex */
public final class rf6 implements fh6 {
    public final qg6 a;

    public rf6(qg6 qg6Var) {
        this.a = qg6Var;
    }

    @Override // defpackage.fh6
    public final int a() {
        return this.a.j().p;
    }

    @Override // defpackage.fh6
    public final int b() {
        return ((fg6) sl1.j0(this.a.j().m)).a;
    }

    @Override // defpackage.fh6
    public final int c() {
        long i;
        int i2;
        qg6 qg6Var = this.a;
        if (qg6Var.j().m.isEmpty()) {
            return 0;
        }
        eg6 j = qg6Var.j();
        if (j.q == ff8.a) {
            i = j.i() & 4294967295L;
        } else {
            i = j.i() >> 32;
        }
        int i3 = (int) i;
        int q = xoe.q(qg6Var.j());
        if (q == 0 || (i2 = i3 / q) < 1) {
            return 1;
        }
        return i2;
    }

    @Override // defpackage.fh6
    public final boolean d() {
        return !this.a.j().m.isEmpty();
    }

    @Override // defpackage.fh6
    public final int e() {
        return this.a.h();
    }
}
