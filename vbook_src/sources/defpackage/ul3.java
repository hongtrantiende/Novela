package defpackage;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ul3  reason: default package */
/* loaded from: classes.dex */
public final class ul3 implements fp3 {
    public final km8 a;
    public final String c;
    public final int d;
    public String f;
    public fjc g;
    public int i;
    public int j;
    public long k;
    public vq4 l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public ul3(String str, int i, int i2) {
        this.a = new km8(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    public final boolean a(km8 km8Var, byte[] bArr, int i) {
        int min = Math.min(km8Var.a(), i - this.i);
        km8Var.k(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fp3
    public final void b(km8 km8Var) {
        boolean z;
        int i;
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j;
        long j2;
        int i13;
        int i14;
        long j3;
        int i15;
        int i16;
        long j4;
        int i17;
        int i18;
        int i19;
        this.g.getClass();
        while (km8Var.a() > 0) {
            int i20 = this.h;
            km8 km8Var2 = this.a;
            switch (i20) {
                case 0:
                    while (true) {
                        if (km8Var.a() > 0) {
                            int i21 = this.j << 8;
                            this.j = i21;
                            int z2 = i21 | km8Var.z();
                            this.j = z2;
                            int n = tte.n(z2);
                            this.n = n;
                            if (n != 0) {
                                byte[] bArr = km8Var2.a;
                                int i22 = this.j;
                                bArr[0] = (byte) ((i22 >> 24) & 255);
                                bArr[1] = (byte) ((i22 >> 16) & 255);
                                bArr[2] = (byte) ((i22 >> 8) & 255);
                                bArr[3] = (byte) (i22 & 255);
                                this.i = 4;
                                this.j = 0;
                                if (n != 3 && n != 4) {
                                    if (n == 1) {
                                        this.h = 1;
                                        break;
                                    } else {
                                        this.h = 2;
                                        break;
                                    }
                                } else {
                                    this.h = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!a(km8Var, km8Var2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = km8Var2.a;
                        if (this.l == null) {
                            String str = this.f;
                            ea1 o = tte.o(bArr2);
                            o.o(60);
                            int i23 = tte.c[o.g(6)];
                            int i24 = tte.d[o.g(4)];
                            int g = o.g(5);
                            int[] iArr = tte.e;
                            if (g >= 29) {
                                i4 = -1;
                            } else {
                                i4 = (iArr[g] * 1000) / 2;
                            }
                            o.o(10);
                            if (o.g(2) > 0) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                            int i25 = i23 + i5;
                            uq4 uq4Var = new uq4();
                            uq4Var.a = str;
                            uq4Var.m = lc7.p(this.e);
                            uq4Var.n = lc7.p("audio/vnd.dts");
                            uq4Var.h = i4;
                            uq4Var.F = i25;
                            uq4Var.G = i24;
                            uq4Var.r = null;
                            uq4Var.d = this.c;
                            uq4Var.f = this.d;
                            vq4 vq4Var = new vq4(uq4Var);
                            this.l = vq4Var;
                            this.g.g(vq4Var);
                        }
                        this.m = tte.m(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 != -1) {
                                if (b3 != 31) {
                                    i2 = (bArr2[4] & 1) << 6;
                                    b = bArr2[5];
                                } else {
                                    i2 = (bArr2[5] & 7) << 4;
                                    b2 = bArr2[6];
                                }
                            } else {
                                i2 = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            }
                            i3 = b2 & 60;
                            this.k = hc2.g(a2d.W(this.l.H, (((i3 >> 2) | i2) + 1) * 32));
                            km8Var2.M(0);
                            this.g.e(18, km8Var2);
                            this.h = 6;
                            break;
                        } else {
                            i2 = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i3 = b & 252;
                        this.k = hc2.g(a2d.W(this.l.H, (((i3 >> 2) | i2) + 1) * 32));
                        km8Var2.M(0);
                        this.g.e(18, km8Var2);
                        this.h = 6;
                    }
                case 2:
                    if (a(km8Var, km8Var2.a, 7)) {
                        ea1 o2 = tte.o(km8Var2.a);
                        o2.o(42);
                        if (o2.f()) {
                            i6 = 12;
                        } else {
                            i6 = 8;
                        }
                        this.o = o2.g(i6) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i26 = 8;
                    if (a(km8Var, km8Var2.a, this.o)) {
                        ea1 o3 = tte.o(km8Var2.a);
                        o3.o(40);
                        int g2 = o3.g(2);
                        if (!o3.f()) {
                            i7 = 16;
                            i8 = 8;
                        } else {
                            i7 = 20;
                            i8 = 12;
                        }
                        o3.o(i8);
                        int g3 = o3.g(i7) + 1;
                        boolean f = o3.f();
                        if (f) {
                            i9 = o3.g(2);
                            i10 = (o3.g(3) + 1) * 512;
                            if (o3.f()) {
                                o3.o(36);
                            }
                            int g4 = o3.g(3) + 1;
                            int g5 = o3.g(3) + 1;
                            if (g4 == 1 && g5 == 1) {
                                int i27 = g2 + 1;
                                int g6 = o3.g(i27);
                                int i28 = 0;
                                while (i28 < i27) {
                                    if (((g6 >> i28) & 1) == 1) {
                                        o3.o(i26);
                                    }
                                    i28++;
                                    i26 = 8;
                                }
                                if (o3.f()) {
                                    o3.o(2);
                                    int g7 = (o3.g(2) + 1) << 2;
                                    int g8 = o3.g(2) + 1;
                                    for (int i29 = 0; i29 < g8; i29++) {
                                        o3.o(g7);
                                    }
                                }
                            } else {
                                throw xm8.c("Multiple audio presentations or assets not supported");
                            }
                        } else {
                            i9 = -1;
                            i10 = 0;
                        }
                        o3.o(i7);
                        o3.o(12);
                        if (f) {
                            if (o3.f()) {
                                o3.o(4);
                            }
                            if (o3.f()) {
                                o3.o(24);
                            }
                            if (o3.f()) {
                                o3.p(o3.g(10) + 1);
                            }
                            o3.o(5);
                            i12 = tte.f[o3.g(4)];
                            i11 = o3.g(8) + 1;
                        } else {
                            i11 = -1;
                            i12 = -2147483647;
                        }
                        if (f) {
                            if (i9 != 0) {
                                if (i9 != 1) {
                                    if (i9 == 2) {
                                        i13 = 48000;
                                    } else {
                                        throw xm8.a(null, "Unsupported reference clock code in DTS HD header: " + i9);
                                    }
                                } else {
                                    i13 = 44100;
                                }
                            } else {
                                i13 = 32000;
                            }
                            String str2 = a2d.a;
                            j = a2d.Y(i10, 1000000L, i13, RoundingMode.DOWN);
                        } else {
                            j = -9223372036854775807L;
                        }
                        g(new w("audio/vnd.dts.hd;profile=lbr", i11, i12, g3, j));
                        this.m = g3;
                        if (j == -9223372036854775807L) {
                            j2 = 0;
                        } else {
                            j2 = j;
                        }
                        this.k = j2;
                        km8Var2.M(0);
                        this.g.e(this.o, km8Var2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (a(km8Var, km8Var2.a, 6)) {
                        ea1 o4 = tte.o(km8Var2.a);
                        o4.o(32);
                        int s = tte.s(o4, tte.k) + 1;
                        this.p = s;
                        int i30 = this.i;
                        if (i30 > s) {
                            int i31 = i30 - s;
                            this.i = i30 - i31;
                            km8Var.M(km8Var.b - i31);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(km8Var, km8Var2.a, this.p)) {
                        byte[] bArr3 = km8Var2.a;
                        ea1 o5 = tte.o(bArr3);
                        if (o5.g(32) == 1078008818) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        int s2 = tte.s(o5, tte.g);
                        int i32 = s2 + 1;
                        if (i14 != 0) {
                            if (o5.f()) {
                                int i33 = s2 - 1;
                                int i34 = ((bArr3[i33] << 8) & 65535) | (bArr3[s2] & 255);
                                String str3 = a2d.a;
                                int i35 = 65535;
                                for (int i36 = 0; i36 < i33; i36++) {
                                    byte b4 = bArr3[i36];
                                    int[] iArr2 = a2d.k;
                                    int i37 = (iArr2[(((b4 & 255) >> 4) ^ ((i35 >> 12) & 255)) & 255] ^ ((i35 << 4) & 65535)) & 65535;
                                    i35 = (iArr2[((b4 & 15) ^ ((i37 >> 12) & 255)) & 255] ^ ((i37 << 4) & 65535)) & 65535;
                                }
                                if (i34 == i35) {
                                    int g9 = o5.g(2);
                                    if (g9 != 0) {
                                        if (g9 != 1) {
                                            if (g9 == 2) {
                                                i18 = 384;
                                            } else {
                                                throw xm8.a(null, "Unsupported base duration index in DTS UHD header: " + g9);
                                            }
                                        } else {
                                            i18 = 480;
                                        }
                                        i17 = 3;
                                    } else {
                                        i17 = 3;
                                        i18 = 512;
                                    }
                                    int g10 = (o5.g(i17) + 1) * i18;
                                    int g11 = o5.g(2);
                                    if (g11 != 0) {
                                        if (g11 != 1) {
                                            if (g11 == 2) {
                                                i19 = 48000;
                                            } else {
                                                throw xm8.a(null, "Unsupported clock rate index in DTS UHD header: " + g11);
                                            }
                                        } else {
                                            i19 = 44100;
                                        }
                                    } else {
                                        i19 = 32000;
                                    }
                                    if (o5.f()) {
                                        o5.o(36);
                                    }
                                    int g12 = i19 * (1 << o5.g(2));
                                    j3 = a2d.Y(g10, 1000000L, i19, RoundingMode.DOWN);
                                    i15 = g12;
                                } else {
                                    throw xm8.a(null, "CRC check failed");
                                }
                            } else {
                                throw xm8.c("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            j3 = -9223372036854775807L;
                            i15 = -2147483647;
                        }
                        int i38 = 0;
                        for (int i39 = 0; i39 < i14; i39++) {
                            i38 += tte.s(o5, tte.h);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i14 != 0) {
                            atomicInteger.set(tte.s(o5, tte.i));
                        }
                        if (atomicInteger.get() != 0) {
                            i16 = tte.s(o5, tte.j);
                        } else {
                            i16 = 0;
                        }
                        int i40 = i38 + i16 + i32;
                        w wVar = new w("audio/vnd.dts.uhd;profile=p2", 2, i15, i40, j3);
                        if (this.n == 3) {
                            g(wVar);
                        }
                        this.m = i40;
                        if (j3 == -9223372036854775807L) {
                            j4 = 0;
                        } else {
                            j4 = j3;
                        }
                        this.k = j4;
                        km8Var2.M(0);
                        this.g.e(this.p, km8Var2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(km8Var.a(), this.m - this.i);
                    this.g.e(min, km8Var);
                    int i41 = this.i + min;
                    this.i = i41;
                    if (i41 != this.m) {
                        break;
                    } else {
                        if (this.q != -9223372036854775807L) {
                            z = true;
                        } else {
                            z = false;
                        }
                        wq9.D(z);
                        fjc fjcVar = this.g;
                        long j5 = this.q;
                        if (this.n == 4) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        fjcVar.a(j5, i, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                        break;
                    }
                default:
                    vm1.d();
                    return;
            }
        }
    }

    @Override // defpackage.fp3
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.fp3
    public final void e(int i, long j) {
        this.q = j;
    }

    @Override // defpackage.fp3
    public final void f(t94 t94Var, zc7 zc7Var) {
        zc7Var.a();
        zc7Var.b();
        this.f = (String) zc7Var.e;
        zc7Var.b();
        this.g = t94Var.s(zc7Var.c, 1);
    }

    public final void g(w wVar) {
        uq4 a;
        int i = wVar.b;
        String str = wVar.a;
        int i2 = wVar.c;
        if (i != -2147483647 && i2 != -1) {
            vq4 vq4Var = this.l;
            if (vq4Var == null || i2 != vq4Var.G || i != vq4Var.H || !str.equals(vq4Var.o)) {
                vq4 vq4Var2 = this.l;
                if (vq4Var2 == null) {
                    a = new uq4();
                } else {
                    a = vq4Var2.a();
                }
                a.a = this.f;
                a.m = lc7.p(this.e);
                a.n = lc7.p(str);
                a.F = i2;
                a.G = i;
                a.d = this.c;
                a.f = this.d;
                vq4 vq4Var3 = new vq4(a);
                this.l = vq4Var3;
                this.g.g(vq4Var3);
            }
        }
    }

    @Override // defpackage.fp3
    public final void d(boolean z) {
    }
}
