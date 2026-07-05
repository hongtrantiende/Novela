package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jk6  reason: default package */
/* loaded from: classes.dex */
public final class jk6 implements ii6 {
    public final /* synthetic */ nk6 a;

    public jk6(nk6 nk6Var) {
        this.a = nk6Var;
    }

    @Override // defpackage.ii6
    public final int a() {
        long j;
        nk6 nk6Var = this.a;
        if (nk6Var.g().v == ff8.a) {
            j = nk6Var.g().n & 4294967295L;
        } else {
            j = nk6Var.g().n >> 32;
        }
        return (int) j;
    }

    @Override // defpackage.ii6
    public final float b() {
        nk6 nk6Var = this.a;
        return (((em8) nk6Var.c.d).h() * 500) + ((em8) nk6Var.c.f).h();
    }

    @Override // defpackage.ii6
    public final Object c(int i, rr0 rr0Var) {
        yy9 yy9Var = nk6.x;
        Object i2 = this.a.i(i, 0, rr0Var);
        if (i2 == n82.a) {
            return i2;
        }
        return pvc.a;
    }

    @Override // defpackage.ii6
    public final int d() {
        nk6 nk6Var = this.a;
        return nk6Var.g().q + nk6Var.g().r;
    }

    @Override // defpackage.ii6
    public final float e() {
        nk6 nk6Var = this.a;
        int h = ((em8) nk6Var.c.d).h();
        int h2 = ((em8) nk6Var.c.f).h();
        if (nk6Var.c()) {
            return (h * 500) + h2 + 100.0f;
        }
        return (h * 500) + h2;
    }

    @Override // defpackage.ii6
    public final pl1 f() {
        return new pl1(-1, -1);
    }
}
