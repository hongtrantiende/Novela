package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ou8  reason: default package */
/* loaded from: classes.dex */
public final class ou8 implements voc {
    public final fp3 a;
    public final ea1 b = new ea1(new byte[10], 10);
    public int c = 0;
    public int d;
    public lac e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public ou8(fp3 fp3Var) {
        this.a = fp3Var;
    }

    @Override // defpackage.voc
    public final void a(int i, km8 km8Var) {
        int i2;
        int i3;
        int i4;
        boolean z;
        this.e.getClass();
        int i5 = i & 1;
        int i6 = -1;
        int i7 = 2;
        fp3 fp3Var = this.a;
        if (i5 != 0) {
            int i8 = this.c;
            if (i8 != 0 && i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        if (this.j != -1) {
                            st0.w("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                        }
                        if (km8Var.c == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        fp3Var.d(z);
                    } else {
                        vm1.d();
                        return;
                    }
                } else {
                    st0.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i9 = i;
        while (km8Var.a() > 0) {
            int i10 = this.c;
            if (i10 != 0) {
                ea1 ea1Var = this.b;
                if (i10 != 1) {
                    if (i10 != i7) {
                        if (i10 == 3) {
                            int a = km8Var.a();
                            int i11 = this.j;
                            if (i11 == i6) {
                                i4 = 0;
                            } else {
                                i4 = a - i11;
                            }
                            if (i4 > 0) {
                                a -= i4;
                                km8Var.L(km8Var.b + a);
                            }
                            fp3Var.b(km8Var);
                            int i12 = this.j;
                            if (i12 != i6) {
                                int i13 = i12 - a;
                                this.j = i13;
                                if (i13 == 0) {
                                    fp3Var.d(false);
                                    this.c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            vm1.d();
                            return;
                        }
                    } else {
                        if (b(km8Var, ea1Var.b, Math.min(10, this.i)) && b(km8Var, null, this.i)) {
                            ea1Var.m(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                ea1Var.o(4);
                                ea1Var.o(1);
                                long g = ea1Var.g(15) << 15;
                                ea1Var.o(1);
                                long g2 = g | (ea1Var.g(3) << 30) | ea1Var.g(15);
                                ea1Var.o(1);
                                if (!this.h && this.g) {
                                    ea1Var.o(4);
                                    ea1Var.o(1);
                                    ea1Var.o(1);
                                    ea1Var.o(1);
                                    this.e.b((ea1Var.g(3) << 30) | (ea1Var.g(15) << 15) | ea1Var.g(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(g2);
                            }
                            if (this.k) {
                                i3 = 4;
                            } else {
                                i3 = 0;
                            }
                            i9 |= i3;
                            fp3Var.e(i9, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    }
                } else if (b(km8Var, ea1Var.b, 9)) {
                    if (e()) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    this.c = i2;
                    this.d = 0;
                }
            } else {
                km8Var.N(km8Var.a());
            }
            i6 = -1;
            i7 = 2;
        }
    }

    public final boolean b(km8 km8Var, byte[] bArr, int i) {
        int min = Math.min(km8Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            km8Var.N(min);
        } else {
            km8Var.k(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.voc
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    @Override // defpackage.voc
    public final void d(lac lacVar, t94 t94Var, zc7 zc7Var) {
        this.e = lacVar;
        this.a.f(t94Var, zc7Var);
    }

    public final boolean e() {
        ea1 ea1Var = this.b;
        ea1Var.m(0);
        int g = ea1Var.g(24);
        if (g != 1) {
            a82.y("Unexpected start code prefix: ", "PesReader", g);
            this.j = -1;
            return false;
        }
        ea1Var.o(8);
        int g2 = ea1Var.g(16);
        ea1Var.o(5);
        this.k = ea1Var.f();
        ea1Var.o(2);
        this.f = ea1Var.f();
        this.g = ea1Var.f();
        ea1Var.o(6);
        int g3 = ea1Var.g(8);
        this.i = g3;
        if (g2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (g2 - 3) - g3;
        this.j = i;
        if (i < 0) {
            st0.w("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
