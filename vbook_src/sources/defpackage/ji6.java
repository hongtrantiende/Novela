package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ji6  reason: default package */
/* loaded from: classes.dex */
public final class ji6 implements ii6 {
    public final /* synthetic */ rj8 a;
    public final /* synthetic */ boolean b;

    public ji6(rj8 rj8Var, boolean z) {
        this.a = rj8Var;
        this.b = z;
    }

    @Override // defpackage.ii6
    public final int a() {
        long i;
        rj8 rj8Var = this.a;
        if (rj8Var.m().e == ff8.a) {
            i = rj8Var.m().i() & 4294967295L;
        } else {
            i = rj8Var.m().i() >> 32;
        }
        return (int) i;
    }

    @Override // defpackage.ii6
    public final float b() {
        return (float) xxe.q(this.a);
    }

    @Override // defpackage.ii6
    public final Object c(int i, rr0 rr0Var) {
        Object u = rj8.u(this.a, i, rr0Var);
        if (u == n82.a) {
            return u;
        }
        return pvc.a;
    }

    @Override // defpackage.ii6
    public final int d() {
        rj8 rj8Var = this.a;
        return (-rj8Var.m().f) + rj8Var.m().d;
    }

    @Override // defpackage.ii6
    public final float e() {
        rj8 rj8Var = this.a;
        return (float) uj8.a(rj8Var.m(), rj8Var.n());
    }

    @Override // defpackage.ii6
    public final pl1 f() {
        boolean z = this.b;
        rj8 rj8Var = this.a;
        if (z) {
            return new pl1(rj8Var.n(), 1);
        }
        return new pl1(1, rj8Var.n());
    }
}
