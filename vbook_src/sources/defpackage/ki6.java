package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ki6  reason: default package */
/* loaded from: classes.dex */
public final class ki6 implements ii6 {
    public final h23 a;
    public final /* synthetic */ kj6 b;
    public final /* synthetic */ boolean c;

    public ki6(kj6 kj6Var, boolean z) {
        this.b = kj6Var;
        this.c = z;
        this.a = yae.q(new ne1(kj6Var, 5));
    }

    @Override // defpackage.ii6
    public final int a() {
        long i;
        kj6 kj6Var = this.b;
        if (kj6Var.j().p == ff8.a) {
            i = kj6Var.j().i() & 4294967295L;
        } else {
            i = kj6Var.j().i() >> 32;
        }
        return (int) i;
    }

    @Override // defpackage.ii6
    public final float b() {
        kj6 kj6Var = this.b;
        return (kj6Var.h() * 500) + kj6Var.i();
    }

    @Override // defpackage.ii6
    public final Object c(int i, rr0 rr0Var) {
        yy9 yy9Var = kj6.y;
        Object l = this.b.l(i, 0, rr0Var);
        if (l == n82.a) {
            return l;
        }
        return pvc.a;
    }

    @Override // defpackage.ii6
    public final int d() {
        kj6 kj6Var = this.b;
        return (-kj6Var.j().l) + kj6Var.j().q;
    }

    @Override // defpackage.ii6
    public final float e() {
        kj6 kj6Var = this.b;
        int h = kj6Var.h();
        int i = kj6Var.i();
        if (kj6Var.c()) {
            return (h * 500) + i + 100.0f;
        }
        return (h * 500) + i;
    }

    @Override // defpackage.ii6
    public final pl1 f() {
        boolean z = this.c;
        h23 h23Var = this.a;
        if (z) {
            return new pl1(((Number) h23Var.getValue()).intValue(), 1);
        }
        return new pl1(1, ((Number) h23Var.getValue()).intValue());
    }
}
