package defpackage;

import android.util.SparseArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p99  reason: default package */
/* loaded from: classes.dex */
public final class p99 implements r94 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public yh4 i;
    public t94 j;
    public boolean k;
    public final lac a = new lac(0);
    public final km8 c = new km8(4096);
    public final SparseArray b = new SparseArray();
    public final n99 d = new n99(0);

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        char c;
        int i;
        int i2;
        long j;
        long j2;
        fp3 fp3Var;
        long j3;
        this.j.getClass();
        long length = s94Var.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j4 = -9223372036854775807L;
        n99 n99Var = this.d;
        if (i3 != 0) {
            c = 3;
            if (!n99Var.d) {
                lac lacVar = n99Var.b;
                km8 km8Var = n99Var.c;
                if (!n99Var.f) {
                    long length2 = s94Var.getLength();
                    int min = (int) Math.min(20000L, length2);
                    long j5 = length2 - min;
                    if (s94Var.getPosition() != j5) {
                        fr2Var.a = j5;
                        return 1;
                    }
                    km8Var.J(min);
                    s94Var.p();
                    s94Var.x(km8Var.a, 0, min);
                    int i4 = km8Var.b;
                    int i5 = km8Var.c - 4;
                    while (true) {
                        if (i5 < i4) {
                            break;
                        }
                        if (n99.b(km8Var.a, i5) == 442) {
                            km8Var.M(i5 + 4);
                            long c2 = n99.c(km8Var);
                            if (c2 != -9223372036854775807L) {
                                j4 = c2;
                                break;
                            }
                        }
                        i5--;
                    }
                    n99Var.h = j4;
                    n99Var.f = true;
                    return 0;
                } else if (n99Var.h == -9223372036854775807L) {
                    n99Var.a(s94Var);
                    return 0;
                } else if (!n99Var.e) {
                    int min2 = (int) Math.min(20000L, s94Var.getLength());
                    if (s94Var.getPosition() != 0) {
                        fr2Var.a = 0L;
                        return 1;
                    }
                    km8Var.J(min2);
                    s94Var.p();
                    s94Var.x(km8Var.a, 0, min2);
                    int i6 = km8Var.b;
                    int i7 = km8Var.c;
                    while (true) {
                        if (i6 < i7 - 3) {
                            if (n99.b(km8Var.a, i6) == 442) {
                                km8Var.M(i6 + 4);
                                long c3 = n99.c(km8Var);
                                if (c3 != -9223372036854775807L) {
                                    j3 = c3;
                                    break;
                                }
                            }
                            i6++;
                        } else {
                            j3 = -9223372036854775807L;
                            break;
                        }
                    }
                    n99Var.g = j3;
                    n99Var.e = true;
                    return 0;
                } else {
                    long j6 = n99Var.g;
                    if (j6 == -9223372036854775807L) {
                        n99Var.a(s94Var);
                        return 0;
                    }
                    n99Var.i = lacVar.c(n99Var.h) - lacVar.b(j6);
                    n99Var.a(s94Var);
                    return 0;
                }
            }
        } else {
            c = 3;
        }
        if (!this.k) {
            this.k = true;
            long j7 = n99Var.i;
            if (j7 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                yh4 yh4Var = new yh4(new lh9(17), new s26(n99Var.b), j7, j7 + 1, 0L, length, 188L, 1000);
                this.i = yh4Var;
                this.j.v(yh4Var.a);
            } else {
                i = i3;
                i2 = 4;
                this.j.v(new ge0(j7));
            }
        } else {
            i = i3;
            i2 = 4;
        }
        yh4 yh4Var2 = this.i;
        if (yh4Var2 != null && yh4Var2.c != null) {
            return yh4Var2.b(s94Var, fr2Var);
        }
        s94Var.p();
        if (i != 0) {
            j = length - s94Var.h();
        } else {
            j = -1;
        }
        if (j == -1 || j >= 4) {
            km8 km8Var2 = this.c;
            if (s94Var.f(km8Var2.a, 0, i2, true)) {
                km8Var2.M(0);
                int m = km8Var2.m();
                if (m == 441) {
                    return -1;
                }
                if (m == 442) {
                    s94Var.x(km8Var2.a, 0, 10);
                    km8Var2.M(9);
                    s94Var.q((km8Var2.z() & 7) + 14);
                    return 0;
                } else if (m == 443) {
                    s94Var.x(km8Var2.a, 0, 2);
                    km8Var2.M(0);
                    s94Var.q(km8Var2.G() + 6);
                    return 0;
                } else if (((m & (-256)) >> 8) != 1) {
                    s94Var.q(1);
                    return 0;
                } else {
                    int i8 = m & 255;
                    SparseArray sparseArray = this.b;
                    o99 o99Var = (o99) sparseArray.get(i8);
                    if (!this.e) {
                        if (o99Var == null) {
                            if (i8 == 189) {
                                fp3Var = new z3("video/mp2p");
                                this.f = true;
                                this.h = s94Var.getPosition();
                            } else if ((m & 224) == 192) {
                                fp3Var = new zs7(null, "video/mp2p", 0);
                                this.f = true;
                                this.h = s94Var.getPosition();
                            } else if ((m & 240) == 224) {
                                fp3Var = new x25(null, "video/mp2p");
                                this.g = true;
                                this.h = s94Var.getPosition();
                            } else {
                                fp3Var = null;
                            }
                            if (fp3Var != null) {
                                fp3Var.f(this.j, new zc7(i8, 256));
                                o99Var = new o99(fp3Var, this.a);
                                sparseArray.put(i8, o99Var);
                            }
                        }
                        if (this.f && this.g) {
                            j2 = this.h + 8192;
                        } else {
                            j2 = 1048576;
                        }
                        if (s94Var.getPosition() > j2) {
                            this.e = true;
                            this.j.m();
                        }
                    }
                    s94Var.x(km8Var2.a, 0, 2);
                    km8Var2.M(0);
                    int G = km8Var2.G() + 6;
                    if (o99Var == null) {
                        s94Var.q(G);
                        return 0;
                    }
                    km8Var2.J(G);
                    s94Var.readFully(km8Var2.a, 0, G);
                    km8Var2.M(6);
                    fp3 fp3Var2 = o99Var.a;
                    ea1 ea1Var = o99Var.c;
                    km8Var2.k(ea1Var.b, 0, 3);
                    ea1Var.m(0);
                    ea1Var.o(8);
                    o99Var.d = ea1Var.f();
                    o99Var.e = ea1Var.f();
                    ea1Var.o(6);
                    km8Var2.k(ea1Var.b, 0, ea1Var.g(8));
                    ea1Var.m(0);
                    lac lacVar2 = o99Var.b;
                    o99Var.g = 0L;
                    if (o99Var.d) {
                        ea1Var.o(4);
                        ea1Var.o(1);
                        ea1Var.o(1);
                        long g = (ea1Var.g(3) << 30) | (ea1Var.g(15) << 15) | ea1Var.g(15);
                        ea1Var.o(1);
                        if (!o99Var.f && o99Var.e) {
                            ea1Var.o(4);
                            ea1Var.o(1);
                            ea1Var.o(1);
                            ea1Var.o(1);
                            lacVar2.b((ea1Var.g(3) << 30) | (ea1Var.g(15) << 15) | ea1Var.g(15));
                            o99Var.f = true;
                        }
                        o99Var.g = lacVar2.b(g);
                    }
                    fp3Var2.e(4, o99Var.g);
                    fp3Var2.b(km8Var2);
                    fp3Var2.d(false);
                    km8Var2.L(km8Var2.a.length);
                    return 0;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        byte[] bArr = new byte[14];
        tt2 tt2Var = (tt2) s94Var;
        tt2Var.f(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            tt2Var.b(bArr[13] & 7, false);
            tt2Var.f(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        long j3;
        boolean z;
        SparseArray sparseArray = this.b;
        lac lacVar = this.a;
        synchronized (lacVar) {
            j3 = lacVar.b;
        }
        boolean z2 = true;
        if (j3 == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long d = lacVar.d();
            z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : false;
        }
        if (z) {
            lacVar.f(j2);
        }
        yh4 yh4Var = this.i;
        if (yh4Var != null) {
            yh4Var.d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            o99 o99Var = (o99) sparseArray.valueAt(i);
            o99Var.f = false;
            o99Var.a.c();
        }
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.j = t94Var;
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
