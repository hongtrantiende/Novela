package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rma  reason: default package */
/* loaded from: classes.dex */
public final class rma implements r94 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public t94 f;
    public fjc g;

    public rma(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            vm1.d();
            return 0;
        }
        fjc fjcVar = this.g;
        fjcVar.getClass();
        int f = fjcVar.f(s94Var, 1024, true);
        if (f == -1) {
            this.e = 2;
            this.g.a(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += f;
        return 0;
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        boolean z;
        int i = this.b;
        int i2 = this.a;
        if (i2 != -1 && i != -1) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        km8 km8Var = new km8(i);
        ((tt2) s94Var).f(km8Var.a, 0, i, false);
        if (km8Var.G() == i2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        if (j != 0 && this.e != 1) {
            return;
        }
        this.e = 1;
        this.d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m4a] */
    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.f = t94Var;
        fjc s = t94Var.s(1024, 4);
        this.g = s;
        uq4 uq4Var = new uq4();
        String str = this.c;
        uq4Var.m = lc7.p(str);
        uq4Var.n = lc7.p(str);
        eub.t(uq4Var, s);
        this.f.m();
        this.f.v(new Object());
        this.e = 1;
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
