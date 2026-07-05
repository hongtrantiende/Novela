package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zs7  reason: default package */
/* loaded from: classes.dex */
public final class zs7 implements fp3 {
    public final km8 a;
    public final at7 b;
    public final String c;
    public final int d;
    public final String e;
    public fjc f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    /* JADX WARN: Type inference failed for: r0v1, types: [at7, java.lang.Object] */
    public zs7(String str, String str2, int i) {
        km8 km8Var = new km8(4);
        this.a = km8Var;
        km8Var.a[0] = -1;
        this.b = new Object();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.fp3
    public final void b(km8 km8Var) {
        boolean z;
        boolean z2;
        this.f.getClass();
        while (km8Var.a() > 0) {
            int i = this.h;
            km8 km8Var2 = this.a;
            boolean z3 = true;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(km8Var.a(), this.m - this.i);
                        this.f.e(min, km8Var);
                        int i2 = this.i + min;
                        this.i = i2;
                        if (i2 >= this.m) {
                            if (this.n == -9223372036854775807L) {
                                z3 = false;
                            }
                            wq9.D(z3);
                            this.f.a(this.n, 1, this.m, 0, null);
                            this.n += this.l;
                            this.i = 0;
                            this.h = 0;
                        }
                    } else {
                        vm1.d();
                        return;
                    }
                } else {
                    int min2 = Math.min(km8Var.a(), 4 - this.i);
                    km8Var.k(km8Var2.a, this.i, min2);
                    int i3 = this.i + min2;
                    this.i = i3;
                    if (i3 >= 4) {
                        km8Var2.M(0);
                        int m = km8Var2.m();
                        at7 at7Var = this.b;
                        if (!at7Var.a(m)) {
                            this.i = 0;
                            this.h = 1;
                        } else {
                            this.m = at7Var.b;
                            if (!this.j) {
                                this.l = (at7Var.f * 1000000) / at7Var.c;
                                uq4 uq4Var = new uq4();
                                uq4Var.a = this.g;
                                uq4Var.m = lc7.p(this.e);
                                uq4Var.n = lc7.p((String) at7Var.g);
                                uq4Var.o = 4096;
                                uq4Var.F = at7Var.d;
                                uq4Var.G = at7Var.c;
                                uq4Var.d = this.c;
                                uq4Var.f = this.d;
                                this.f.g(new vq4(uq4Var));
                                this.j = true;
                            }
                            km8Var2.M(0);
                            this.f.e(4, km8Var2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = km8Var.a;
                int i4 = km8Var.b;
                int i5 = km8Var.c;
                while (true) {
                    if (i4 < i5) {
                        byte b = bArr[i4];
                        if ((b & 255) == 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.k && (b & 224) == 224) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.k = z;
                        if (z2) {
                            km8Var.M(i4 + 1);
                            this.k = false;
                            km8Var2.a[1] = bArr[i4];
                            this.i = 2;
                            this.h = 1;
                            break;
                        }
                        i4++;
                    } else {
                        km8Var.M(i5);
                        break;
                    }
                }
            }
        }
    }

    @Override // defpackage.fp3
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.fp3
    public final void e(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.fp3
    public final void f(t94 t94Var, zc7 zc7Var) {
        zc7Var.a();
        zc7Var.b();
        this.g = (String) zc7Var.e;
        zc7Var.b();
        this.f = t94Var.s(zc7Var.c, 1);
    }

    @Override // defpackage.fp3
    public final void d(boolean z) {
    }
}
