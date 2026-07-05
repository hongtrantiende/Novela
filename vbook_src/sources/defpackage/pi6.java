package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pi6  reason: default package */
/* loaded from: classes3.dex */
public final class pi6 implements fh6 {
    public final kj6 a;

    public pi6(kj6 kj6Var) {
        this.a = kj6Var;
    }

    @Override // defpackage.fh6
    public final int a() {
        return this.a.j().n;
    }

    @Override // defpackage.fh6
    public final int b() {
        return Math.min(a() - 1, ((gj6) sl1.j0(this.a.j().k)).a);
    }

    @Override // defpackage.fh6
    public final int c() {
        long i;
        int i2;
        kj6 kj6Var = this.a;
        if (kj6Var.j().k.isEmpty()) {
            return 0;
        }
        fj6 j = kj6Var.j();
        if (j.p == ff8.a) {
            i = j.i() & 4294967295L;
        } else {
            i = j.i() >> 32;
        }
        int i3 = (int) i;
        int r = rqe.r(kj6Var.j());
        if (r == 0 || (i2 = i3 / r) < 1) {
            return 1;
        }
        return i2;
    }

    @Override // defpackage.fh6
    public final boolean d() {
        return !this.a.j().k.isEmpty();
    }

    @Override // defpackage.fh6
    public final int e() {
        return Math.max(0, this.a.h());
    }
}
