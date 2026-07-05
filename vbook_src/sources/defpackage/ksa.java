package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ksa  reason: default package */
/* loaded from: classes.dex */
public final class ksa {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final jsa i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public ksa(int i, int i2, float f, float f2, int i3, boolean z) {
        jsa teaVar;
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 * 2;
        if (z) {
            teaVar = new isa(this);
        } else {
            teaVar = new tea(this);
        }
        this.i = teaVar;
    }

    public final void a(int i, int i2) {
        jsa jsaVar = this.i;
        jsaVar.j(i2);
        Object g = jsaVar.g();
        int i3 = this.b;
        System.arraycopy(g, i * i3, jsaVar.h(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        int i;
        float f;
        int i2;
        int i3;
        double d;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j;
        long j2;
        boolean z;
        int i11 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i12 = (d2 > 1.0000100135803223d ? 1 : (d2 == 1.0000100135803223d ? 0 : -1));
        int i13 = this.a;
        int i14 = 1;
        jsa jsaVar = this.i;
        int i15 = this.b;
        if (i12 <= 0 && d2 >= 0.9999899864196777d) {
            a(0, this.j);
            this.j = 0;
        } else {
            int i16 = this.j;
            int i17 = this.h;
            if (i16 >= i17) {
                int i18 = 0;
                while (true) {
                    int i19 = this.o;
                    if (i19 > 0) {
                        int min = Math.min(i17, i19);
                        a(i18, min);
                        this.o -= min;
                        i18 += min;
                        f = f4;
                        d = d2;
                        i6 = i14;
                        i4 = i17;
                    } else {
                        if (i13 > 4000) {
                            i = i13 / 4000;
                        } else {
                            i = i14;
                        }
                        int i20 = this.g;
                        int i21 = this.f;
                        if (i15 == i14 && i == i14) {
                            i2 = jsaVar.e(i18, i21, i20);
                            f = f4;
                        } else {
                            jsaVar.d(i18, i);
                            f = f4;
                            int q = jsaVar.q(i21 / i, i20 / i);
                            if (i != i14) {
                                int i22 = q * i;
                                int i23 = i * 4;
                                int i24 = i22 - i23;
                                int i25 = i22 + i23;
                                if (i24 >= i21) {
                                    i21 = i24;
                                }
                                if (i25 <= i20) {
                                    i20 = i25;
                                }
                                if (i15 == i14) {
                                    i2 = jsaVar.e(i18, i21, i20);
                                } else {
                                    jsaVar.d(i18, i14);
                                    i2 = jsaVar.q(i21, i20);
                                }
                            } else {
                                i2 = q;
                            }
                        }
                        if (jsaVar.k()) {
                            i3 = this.p;
                        } else {
                            i3 = i2;
                        }
                        jsaVar.f();
                        this.p = i2;
                        int i26 = (d2 > 1.0d ? 1 : (d2 == 1.0d ? 0 : -1));
                        double d3 = this.q;
                        if (i26 > 0) {
                            if (d2 >= 2.0d) {
                                i7 = i14;
                                double d4 = (i3 / (d2 - 1.0d)) + d3;
                                i8 = (int) Math.round(d4);
                                d = d2;
                                this.q = d4 - i8;
                                jsaVar = jsaVar;
                            } else {
                                d = d2;
                                i7 = i14;
                                double d5 = (((2.0d - d) * i3) / (d - 1.0d)) + d3;
                                int round = (int) Math.round(d5);
                                this.o = round;
                                this.q = d5 - round;
                                i8 = i3;
                            }
                            jsaVar.j(i8);
                            int i27 = i17;
                            int i28 = i8;
                            jsaVar.m(i28, this.b, this.k, i18, i18 + i3);
                            this.k += i28;
                            i18 = i3 + i28 + i18;
                            i4 = i27;
                            i6 = i7;
                        } else {
                            d = d2;
                            int i29 = i14;
                            int i30 = i17;
                            if (d < 0.5d) {
                                i4 = i30;
                                double d6 = ((i3 * d) / (1.0d - d)) + d3;
                                i5 = (int) Math.round(d6);
                                this.q = d6 - i5;
                            } else {
                                i4 = i30;
                                double d7 = ((((2.0d * d) - 1.0d) * i3) / (1.0d - d)) + d3;
                                int round2 = (int) Math.round(d7);
                                this.o = round2;
                                this.q = d7 - round2;
                                i5 = i3;
                            }
                            int i31 = i3 + i5;
                            jsaVar.j(i31);
                            i6 = i29;
                            System.arraycopy(jsaVar.g(), i18 * i15, jsaVar.h(), this.k * i15, i3 * i15);
                            int i32 = i18;
                            jsaVar.m(i5, this.b, this.k + i3, i3 + i18, i32);
                            this.k += i31;
                            i18 = i32 + i5;
                        }
                    }
                    if (i18 + i4 > i16) {
                        break;
                    }
                    i17 = i4;
                    f4 = f;
                    i14 = i6;
                    d2 = d;
                }
                int i33 = this.j - i18;
                System.arraycopy(jsaVar.g(), i18 * i15, jsaVar.g(), 0, i33 * i15);
                this.j = i33;
                if (f == 1.0f && this.k != i11) {
                    long j3 = i13 / f;
                    long j4 = i13;
                    while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                        j3 /= 2;
                        j4 /= 2;
                    }
                    int i34 = this.k - i11;
                    jsaVar.n(i34);
                    System.arraycopy(jsaVar.h(), i11 * i15, jsaVar.l(), this.l * i15, i34 * i15);
                    this.k = i11;
                    this.l += i34;
                    int i35 = 0;
                    while (true) {
                        i9 = this.l - 1;
                        if (i35 >= i9) {
                            break;
                        }
                        while (true) {
                            i10 = this.m + 1;
                            j = i10;
                            j2 = this.n;
                            if (j * j3 <= j2 * j4) {
                                break;
                            }
                            int i36 = i6;
                            jsaVar.j(i36);
                            jsaVar.i(j4, j3, i35);
                            this.n += i36;
                            this.k += i36;
                        }
                        int i37 = i6;
                        this.m = i10;
                        if (j == j4) {
                            this.m = 0;
                            if (j2 == j3) {
                                z = i37;
                            } else {
                                z = 0;
                            }
                            wq9.D(z);
                            this.n = 0;
                        }
                        i35++;
                        i6 = i37;
                    }
                    if (i9 != 0) {
                        System.arraycopy(jsaVar.l(), i9 * i15, jsaVar.l(), 0, (this.l - i9) * i15);
                        this.l -= i9;
                        return;
                    }
                    return;
                }
            }
        }
        f = f4;
        i6 = 1;
        if (f == 1.0f) {
        }
    }
}
