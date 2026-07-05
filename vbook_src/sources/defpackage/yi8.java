package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yi8  reason: default package */
/* loaded from: classes.dex */
public final class yi8 {
    public final pj8 a;
    public final wu7 b;
    public final xu7 c;
    public final uu7 d;
    public final wu7 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final ei6 n;
    public final zg4 o;

    public yi8(pj8 pj8Var, ei6 ei6Var, yh6 yh6Var) {
        this.a = pj8Var;
        wu7 wu7Var = oy5.a;
        this.b = new wu7();
        this.c = new xu7();
        int i = iy5.a;
        this.d = new uu7();
        this.e = new wu7();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = ei6Var;
        this.o = new zg4(yh6Var);
    }

    public final int a(zg4 zg4Var, int i, boolean z) {
        List list;
        List list2;
        wu7 wu7Var = this.e;
        if (wu7Var.a(i)) {
            Object b = wu7Var.b(i);
            b.getClass();
            return ((g51) b).b;
        }
        wu7 wu7Var2 = this.b;
        int i2 = 0;
        if (wu7Var2.a(i)) {
            if (z && (list2 = (List) wu7Var2.b(i)) != null) {
                int size = list2.size();
                while (i2 < size) {
                    ((di6) list2.get(i2)).a();
                    i2++;
                }
                return -1;
            }
            return -1;
        }
        e51 e51Var = new e51(this, zg4Var, 0);
        long j = zg4Var.S().u;
        ei6 ei6Var = (ei6) zg4Var.d;
        if (ei6Var != null) {
            wu7Var2.i(i, tl1.A(ei6Var.a(i, j, true, new fl7(17, e51Var, zg4Var))));
            if (z && (list = (List) wu7Var2.b(i)) != null) {
                int size2 = list.size();
                while (i2 < size2) {
                    ((di6) list.get(i2)).a();
                    i2++;
                }
                return -1;
            }
            return -1;
        }
        c16.w("state");
        throw null;
    }

    public final boolean b() {
        if (this.h != Integer.MAX_VALUE && this.i != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [g51, java.lang.Object] */
    public final void c(zg4 zg4Var, int i, int i2) {
        g51 g51Var;
        int i3;
        int i4;
        wu7 wu7Var = this.e;
        g51 g51Var2 = (g51) wu7Var.b(i);
        kh5 kh5Var = g51.c;
        if (g51Var2 != null) {
            g51Var2.b = i2;
            g51Var2.a = kh5Var;
            g51Var = g51Var2;
        } else {
            ?? obj = new Object();
            obj.a = kh5Var;
            obj.b = i2;
            g51Var = obj;
        }
        wu7Var.i(i, g51Var);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= nae.e) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > nae.e && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0) {
            zg4Var.getClass();
            if (i4 != -1 && i4 < this.m) {
                e51 e51Var = new e51(this, zg4Var, 1);
                long j = zg4Var.S().u;
                ei6 ei6Var = (ei6) zg4Var.d;
                if (ei6Var != null) {
                    this.b.i(i4, tl1.A(ei6Var.a(i4, j, true, new fl7(17, e51Var, zg4Var))));
                } else {
                    c16.w("state");
                    throw null;
                }
            }
        }
        h();
    }

    public final void d(zg4 zg4Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        if (Math.signum(f) == Math.signum(this.f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2 && !this.l) {
                int A = k27.A(Math.abs(f)) + this.k;
                int i8 = i3 - i4;
                if (A > i8) {
                    A = i8;
                }
                this.k = A;
            } else {
                this.k = i3 - i4;
                this.i = i2;
            }
            while (this.k > 0) {
                int i9 = this.i;
                zg4Var.getClass();
                if (i9 != -1 && (i7 = this.i) < this.m - 1) {
                    if (i7 + 1 == i2 + 1 && f != nae.e && Math.abs(f) >= i4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int a = a(zg4Var, this.i + 1, z4);
                    if (a != -1) {
                        this.i++;
                        this.k -= a;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            return;
        }
        if (z2 && !this.l) {
            int A2 = k27.A(Math.abs(f)) + this.j;
            int i10 = i3 - i5;
            if (A2 > i10) {
                A2 = i10;
            }
            this.j = A2;
        } else {
            this.j = i3 - i5;
            this.h = i;
        }
        while (this.j > 0 && (i6 = this.h) > 0) {
            if (i6 - 1 == i - 1 && f != nae.e && Math.abs(f) >= i5) {
                z3 = true;
            } else {
                z3 = false;
            }
            int a2 = a(zg4Var, this.h - 1, z3);
            if (a2 != -1) {
                this.h--;
                this.j -= a2;
            } else {
                return;
            }
        }
    }

    public final void e(float f, ij8 ij8Var) {
        yi8 yi8Var;
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        zg4 zg4Var = this.o;
        zg4Var.c = ij8Var;
        zg4Var.d = this.n;
        float f2 = -f;
        h();
        if (zg4Var.Q()) {
            nxe.w(zg4Var.S());
            zg4Var.S();
            this.m = zg4Var.W();
            int P = zg4Var.P();
            int R = zg4Var.R();
            int W = zg4Var.W();
            int U = zg4Var.U();
            int T = zg4Var.T();
            int i4 = (f2 > nae.e ? 1 : (f2 == nae.e ? 0 : -1));
            wu7 wu7Var = this.e;
            if (i4 <= 0) {
                this.j = 0 - U;
                this.h = P;
                while (this.j > 0 && (i3 = this.h) > 0 && wu7Var.a(i3 - 1)) {
                    Object b = wu7Var.b(this.h - 1);
                    b.getClass();
                    this.h--;
                    this.j -= ((g51) b).b;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - T;
                this.i = R;
                while (this.k > 0 && (i2 = this.i) < W - 1 && wu7Var.a(i2 + 1)) {
                    Object b2 = wu7Var.b(this.i + 1);
                    b2.getClass();
                    int i5 = ((g51) b2).b;
                    this.i++;
                    this.k -= i5;
                }
                f(this.i + 1, W - 1);
            }
        }
        if (zg4Var.Q()) {
            nxe.w(zg4Var.S());
            if (zg4Var.S().t != null) {
                i = this.a.a.o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            int P2 = zg4Var.P();
            int R2 = zg4Var.R();
            int U2 = zg4Var.U();
            int T2 = zg4Var.T();
            if (f2 <= nae.e) {
                z2 = true;
            } else {
                z2 = z;
            }
            yi8Var = this;
            yi8Var.d(zg4Var, P2, R2, i, T2, U2, f2, z2);
        } else {
            yi8Var = this;
        }
        yi8Var.f = f2;
        yi8Var.h();
    }

    public final void f(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i3;
        char c3;
        int i4;
        xu7 xu7Var = this.c;
        xu7Var.b();
        wu7 wu7Var = this.b;
        int[] iArr3 = wu7Var.b;
        long[] jArr3 = wu7Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr3[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr3[(i5 << 3) + i7]) && i4 <= i2) {
                            xu7Var.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        uu7 uu7Var = this.d;
        int[] iArr4 = uu7Var.b;
        long[] jArr4 = uu7Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr4[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr4[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                xu7Var.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        wu7 wu7Var2 = this.e;
        int[] iArr5 = wu7Var2.b;
        long[] jArr5 = wu7Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr5[i12];
                if ((((~j6) << c2) & j6 & j3) != j3) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr5[(i12 << 3) + i14]) && i3 <= i2) {
                            xu7Var.a(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length3) {
                    break;
                }
                i12++;
            }
        }
        int[] iArr6 = xu7Var.b;
        long[] jArr6 = xu7Var.a;
        int length4 = jArr6.length - 2;
        if (length4 >= 0) {
            int i15 = 0;
            while (true) {
                long j7 = jArr6[i15];
                if ((((~j7) << c2) & j7 & j3) != j3) {
                    int i16 = 8 - ((~(i15 - length4)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j7 & j2) < j) {
                            int i18 = iArr6[(i15 << 3) + i17];
                            List list = (List) wu7Var.g(i18);
                            if (list != null) {
                                int size = list.size();
                                for (int i19 = 0; i19 < size; i19++) {
                                    ((di6) list.get(i19)).cancel();
                                }
                            }
                            int c4 = uu7Var.c(i18);
                            if (c4 >= 0) {
                                uu7Var.e--;
                                long[] jArr7 = uu7Var.a;
                                int i20 = uu7Var.d;
                                int i21 = c4 >> 3;
                                int i22 = (c4 & 7) << 3;
                                iArr2 = iArr6;
                                jArr2 = jArr6;
                                long j8 = (jArr7[i21] & (~(j2 << i22))) | (254 << i22);
                                jArr7[i21] = j8;
                                jArr7[(((c4 - 7) & i20) + (i20 & 7)) >> 3] = j8;
                            } else {
                                iArr2 = iArr6;
                                jArr2 = jArr6;
                            }
                            wu7Var2.g(i18);
                        } else {
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                        }
                        j7 >>= 8;
                        i17++;
                        iArr6 = iArr2;
                        jArr6 = jArr2;
                    }
                    iArr = iArr6;
                    jArr = jArr6;
                    if (i16 != 8) {
                        return;
                    }
                } else {
                    iArr = iArr6;
                    jArr = jArr6;
                }
                if (i15 != length4) {
                    i15++;
                    iArr6 = iArr;
                    jArr6 = jArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void g() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        wu7 wu7Var = this.b;
        long[] jArr = wu7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = wu7Var.b[i4];
                            List list = (List) wu7Var.c[i4];
                            int size = list.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ((di6) list.get(i6)).cancel();
                            }
                            wu7Var.h(i4);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h() {
        ff.G(this.j, "prefetchWindowStartExtraSpace");
        ff.G(this.k, "prefetchWindowEndExtraSpace");
        ff.G(this.h, "prefetchWindowStartIndex");
        ff.G(this.i, "prefetchWindowEndIndex");
    }
}
