package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p55  reason: default package */
/* loaded from: classes.dex */
public final class p55 implements r94 {
    public t94 b;
    public s94 c;
    public zg1 d;
    public ws7 e;
    public int g;
    public long h;
    public int i;
    public final km8 a = new km8(16);
    public long j = -1;
    public int f = 0;

    @Override // defpackage.r94
    public final void a() {
        ws7 ws7Var = this.e;
        if (ws7Var != null) {
            ws7Var.getClass();
            this.e = null;
        }
    }

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        while (true) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                return -1;
                            }
                            vm1.d();
                            return 0;
                        }
                        if (this.d == null || s94Var != this.c) {
                            this.c = s94Var;
                            this.d = new zg1(s94Var, this.j);
                        }
                        ws7 ws7Var = this.e;
                        ws7Var.getClass();
                        int b = ws7Var.b(this.d, fr2Var);
                        if (b == 1) {
                            fr2Var.a += this.j;
                        }
                        return b;
                    }
                    if (this.e == null) {
                        this.e = new ws7(m8b.r, 8);
                    }
                    zg1 zg1Var = new zg1(s94Var, this.j);
                    this.d = zg1Var;
                    if (this.e.c(zg1Var)) {
                        ws7 ws7Var2 = this.e;
                        long j = this.j;
                        t94 t94Var = this.b;
                        t94Var.getClass();
                        ws7Var2.f(new zg1(j, t94Var, 4));
                        this.f = 3;
                    } else {
                        t94 t94Var2 = this.b;
                        t94Var2.getClass();
                        t94Var2.m();
                        this.b.v(new ge0(-9223372036854775807L));
                        this.f = 4;
                    }
                } else {
                    s94Var.q((int) (this.h - this.i));
                    this.i = 0;
                    this.f = 0;
                }
            } else {
                int i2 = this.i;
                km8 km8Var = this.a;
                if (i2 == 0) {
                    if (!s94Var.a(km8Var.a, 0, 8, true)) {
                        t94 t94Var3 = this.b;
                        t94Var3.getClass();
                        t94Var3.m();
                        this.b.v(new ge0(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    km8Var.M(0);
                    this.h = km8Var.B();
                    this.g = km8Var.m();
                }
                if (this.h == 1) {
                    s94Var.readFully(km8Var.a, 8, 8);
                    this.i += 8;
                    this.h = km8Var.F();
                }
                if (this.g == 1836086884) {
                    long position = s94Var.getPosition();
                    this.j = position;
                    long j2 = this.i;
                    pr7 pr7Var = new pr7(0L, position - j2, -9223372036854775807L, position, this.h - j2);
                    t94 t94Var4 = this.b;
                    t94Var4.getClass();
                    fjc s = t94Var4.s(1024, 4);
                    uq4 uq4Var = new uq4();
                    uq4Var.m = lc7.p("image/heic");
                    uq4Var.k = new tb7(pr7Var);
                    eub.t(uq4Var, s);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            }
        }
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        return vqe.C((tt2) s94Var, true);
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        if (j == 0) {
            this.f = 0;
            this.i = 0;
            this.j = -1L;
            if (this.e != null) {
                this.e = null;
            }
        } else if (this.f == 3) {
            ws7 ws7Var = this.e;
            ws7Var.getClass();
            ws7Var.d(j, j2);
        }
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.b = t94Var;
    }
}
