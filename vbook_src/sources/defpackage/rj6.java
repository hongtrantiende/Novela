package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rj6  reason: default package */
/* loaded from: classes.dex */
public final class rj6 implements ii6 {
    public final /* synthetic */ qg6 a;

    public rj6(qg6 qg6Var) {
        this.a = qg6Var;
    }

    @Override // defpackage.ii6
    public final int a() {
        long i;
        qg6 qg6Var = this.a;
        if (qg6Var.j().q == ff8.a) {
            i = qg6Var.j().i() & 4294967295L;
        } else {
            i = qg6Var.j().i() >> 32;
        }
        return (int) i;
    }

    @Override // defpackage.ii6
    public final float b() {
        qg6 qg6Var = this.a;
        return (qg6Var.h() * 500) + qg6Var.i();
    }

    @Override // defpackage.ii6
    public final Object c(int i, rr0 rr0Var) {
        yy9 yy9Var = qg6.w;
        Object l = this.a.l(i, 0, rr0Var);
        if (l == n82.a) {
            return l;
        }
        return pvc.a;
    }

    @Override // defpackage.ii6
    public final int d() {
        qg6 qg6Var = this.a;
        return (-qg6Var.j().n) + qg6Var.j().r;
    }

    @Override // defpackage.ii6
    public final float e() {
        qg6 qg6Var = this.a;
        int h = qg6Var.h();
        int i = qg6Var.i();
        if (qg6Var.c()) {
            return (h * 500) + i + 100.0f;
        }
        return (h * 500) + i;
    }

    @Override // defpackage.ii6
    public final pl1 f() {
        return new pl1(-1, -1);
    }
}
