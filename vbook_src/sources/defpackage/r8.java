package defpackage;

import java.util.Arrays;
import java.util.Collections;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r8  reason: default package */
/* loaded from: classes.dex */
public final class r8 implements fp3 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public fjc h;
    public fjc i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public fjc v;
    public long w;
    public final ea1 b = new ea1(new byte[7], 7);
    public final km8 c = new km8(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public r8(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // defpackage.fp3
    public final void b(km8 km8Var) {
        int i;
        int i2;
        int i3;
        byte b;
        char c;
        ?? r4;
        int i4;
        char c2;
        int i5;
        char c3;
        boolean z;
        int i6;
        this.h.getClass();
        String str = a2d.a;
        while (km8Var.a() > 0) {
            int i7 = this.j;
            char c4 = 65535;
            km8 km8Var2 = this.c;
            int i8 = 3;
            ea1 ea1Var = this.b;
            int i9 = 0;
            int i10 = 4;
            boolean z2 = true;
            int i11 = 1;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                int min = Math.min(km8Var.a(), this.t - this.k);
                                this.v.e(min, km8Var);
                                int i12 = this.k + min;
                                this.k = i12;
                                if (i12 == this.t) {
                                    if (this.u == -9223372036854775807L) {
                                        z2 = false;
                                    }
                                    wq9.D(z2);
                                    this.v.a(this.u, 1, this.t, 0, null);
                                    this.u += this.w;
                                    this.j = 0;
                                    this.k = 0;
                                    this.l = 256;
                                }
                            } else {
                                vm1.d();
                                return;
                            }
                        } else {
                            if (this.m) {
                                i = 7;
                            } else {
                                i = 5;
                            }
                            byte[] bArr = ea1Var.b;
                            int min2 = Math.min(km8Var.a(), i - this.k);
                            km8Var.k(bArr, this.k, min2);
                            int i13 = this.k + min2;
                            this.k = i13;
                            if (i13 == i) {
                                ea1Var.m(0);
                                if (!this.r) {
                                    int g = ea1Var.g(2) + 1;
                                    if (g != 2) {
                                        st0.w("AdtsReader", "Detected audio object type: " + g + ", but assuming AAC LC.");
                                        g = 2;
                                    }
                                    ea1Var.o(5);
                                    int g2 = ea1Var.g(3);
                                    int i14 = this.p;
                                    byte[] bArr2 = {(byte) (((g << 3) & 248) | ((i14 >> 1) & 7)), (byte) (((g2 << 3) & 120) | ((i14 << 7) & Token.CASE))};
                                    w n = pc2.n(new ea1(bArr2, 2), false);
                                    uq4 uq4Var = new uq4();
                                    uq4Var.a = this.g;
                                    uq4Var.m = lc7.p(this.f);
                                    uq4Var.n = lc7.p("audio/mp4a-latm");
                                    uq4Var.j = n.a;
                                    uq4Var.F = n.c;
                                    uq4Var.G = n.b;
                                    uq4Var.q = Collections.singletonList(bArr2);
                                    uq4Var.d = this.d;
                                    uq4Var.f = this.e;
                                    vq4 vq4Var = new vq4(uq4Var);
                                    this.s = 1024000000 / vq4Var.H;
                                    this.h.g(vq4Var);
                                    this.r = true;
                                } else {
                                    ea1Var.o(10);
                                }
                                ea1Var.o(4);
                                int g3 = ea1Var.g(13);
                                int i15 = g3 - 7;
                                if (this.m) {
                                    i15 = g3 - 9;
                                }
                                fjc fjcVar = this.h;
                                long j = this.s;
                                this.j = 4;
                                this.k = 0;
                                this.v = fjcVar;
                                this.w = j;
                                this.t = i15;
                            }
                        }
                    } else {
                        byte[] bArr3 = km8Var2.a;
                        int min3 = Math.min(km8Var.a(), 10 - this.k);
                        km8Var.k(bArr3, this.k, min3);
                        int i16 = this.k + min3;
                        this.k = i16;
                        if (i16 == 10) {
                            this.i.e(10, km8Var2);
                            km8Var2.M(6);
                            fjc fjcVar2 = this.i;
                            this.j = 4;
                            this.k = 10;
                            this.v = fjcVar2;
                            this.w = 0L;
                            this.t = km8Var2.y() + 10;
                        }
                    }
                } else if (km8Var.a() != 0) {
                    ea1Var.b[0] = km8Var.a[km8Var.b];
                    ea1Var.m(2);
                    int g4 = ea1Var.g(4);
                    int i17 = this.p;
                    if (i17 != -1 && g4 != i17) {
                        this.n = false;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    } else {
                        if (!this.n) {
                            this.n = true;
                            this.o = this.q;
                            this.p = g4;
                        }
                        this.j = 3;
                        this.k = 0;
                    }
                }
            } else {
                byte[] bArr4 = km8Var.a;
                int i18 = km8Var.b;
                int i19 = km8Var.c;
                while (true) {
                    if (i18 < i19) {
                        i2 = i18 + 1;
                        i3 = i8;
                        b = bArr4[i18];
                        int i20 = b & 255;
                        if (this.l == 512 && (((65280 | ((((byte) i20) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.n) {
                                break;
                            }
                            int i21 = i18 - 1;
                            km8Var.M(i18);
                            byte[] bArr5 = ea1Var.b;
                            if (km8Var.a() >= i11) {
                                km8Var.k(bArr5, i9, i11);
                                ea1Var.m(i10);
                                int g5 = ea1Var.g(i11);
                                int i22 = this.o;
                                if (i22 != -1 && g5 != i22) {
                                    c = 65535;
                                } else {
                                    if (this.p != -1) {
                                        byte[] bArr6 = ea1Var.b;
                                        if (km8Var.a() < i11) {
                                            break;
                                        }
                                        km8Var.k(bArr6, i9, i11);
                                        ea1Var.m(2);
                                        i6 = 4;
                                        if (ea1Var.g(4) == this.p) {
                                            km8Var.M(i2);
                                        }
                                    } else {
                                        i6 = 4;
                                    }
                                    byte[] bArr7 = ea1Var.b;
                                    if (km8Var.a() >= i6) {
                                        km8Var.k(bArr7, i9, i6);
                                        ea1Var.m(14);
                                        int g6 = ea1Var.g(13);
                                        if (g6 >= 7) {
                                            byte[] bArr8 = km8Var.a;
                                            int i23 = km8Var.c;
                                            int i24 = i21 + g6;
                                            if (i24 < i23) {
                                                byte b2 = bArr8[i24];
                                                c = 65535;
                                                if (b2 == -1) {
                                                    int i25 = i24 + 1;
                                                    if (i25 != i23) {
                                                        byte b3 = bArr8[i25];
                                                        if ((((65280 | ((b3 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b3 & 8) >> 3) == g5) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b2 == 73) {
                                                    int i26 = i24 + 1;
                                                    if (i26 != i23) {
                                                        if (bArr8[i26] == 68) {
                                                            int i27 = i24 + 2;
                                                            if (i27 != i23) {
                                                                if (bArr8[i27] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                r4 = true;
                            }
                            c = 65535;
                            r4 = true;
                        } else {
                            c = c4;
                            r4 = i11;
                        }
                        int i28 = this.l;
                        int i29 = i20 | i28;
                        if (i29 != 329) {
                            if (i29 != 511) {
                                if (i29 != 836) {
                                    if (i29 != 1075) {
                                        c2 = 256;
                                        if (i28 != 256) {
                                            this.l = 256;
                                            i4 = 3;
                                            i5 = 0;
                                            c3 = 2;
                                            i11 = r4;
                                            c4 = c;
                                            i10 = 4;
                                            i9 = i5;
                                            i8 = i4;
                                        } else {
                                            i4 = 3;
                                            i5 = 0;
                                            c3 = 2;
                                        }
                                    } else {
                                        this.j = 2;
                                        this.k = 3;
                                        this.t = 0;
                                        km8Var2.M(0);
                                        km8Var.M(i2);
                                        break;
                                    }
                                } else {
                                    i4 = 3;
                                    c2 = 256;
                                    i5 = 0;
                                    c3 = 2;
                                    this.l = 1024;
                                }
                            } else {
                                i4 = 3;
                                c2 = 256;
                                i5 = 0;
                                c3 = 2;
                                this.l = 512;
                            }
                        } else {
                            i4 = 3;
                            c2 = 256;
                            i5 = 0;
                            c3 = 2;
                            this.l = 768;
                        }
                        i18 = i2;
                        i11 = r4;
                        c4 = c;
                        i10 = 4;
                        i9 = i5;
                        i8 = i4;
                    } else {
                        km8Var.M(i18);
                        break;
                    }
                }
                this.q = (b & 8) >> 3;
                if ((b & 1) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
                if (!this.n) {
                    this.j = 1;
                    this.k = 0;
                } else {
                    this.j = i3;
                    this.k = 0;
                }
                km8Var.M(i2);
            }
        }
    }

    @Override // defpackage.fp3
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.fp3
    public final void e(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.fp3
    public final void f(t94 t94Var, zc7 zc7Var) {
        zc7Var.a();
        zc7Var.b();
        this.g = (String) zc7Var.e;
        zc7Var.b();
        fjc s = t94Var.s(zc7Var.c, 1);
        this.h = s;
        this.v = s;
        if (this.a) {
            zc7Var.a();
            zc7Var.b();
            fjc s2 = t94Var.s(zc7Var.c, 5);
            this.i = s2;
            uq4 uq4Var = new uq4();
            zc7Var.b();
            uq4Var.a = (String) zc7Var.e;
            uq4Var.m = lc7.p(this.f);
            uq4Var.n = lc7.p("application/id3");
            eub.t(uq4Var, s2);
            return;
        }
        this.i = new n73();
    }

    @Override // defpackage.fp3
    public final void d(boolean z) {
    }
}
