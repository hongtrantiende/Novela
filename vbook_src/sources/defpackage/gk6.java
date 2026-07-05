package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gk6  reason: default package */
/* loaded from: classes.dex */
public final class gk6 implements c37 {
    public final int[] a;
    public final int[] b;
    public final float c;
    public final c37 d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final lk6 i;
    public final fz4 j;
    public final r13 k;
    public final int l;
    public final List m;
    public final long n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final m82 t;
    public final boolean u;
    public final ff8 v;

    public gk6(int[] iArr, int[] iArr2, float f, c37 c37Var, float f2, boolean z, boolean z2, boolean z3, lk6 lk6Var, fz4 fz4Var, r13 r13Var, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, m82 m82Var, boolean z4) {
        ff8 ff8Var;
        this.a = iArr;
        this.b = iArr2;
        this.c = f;
        this.d = c37Var;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = lk6Var;
        this.j = fz4Var;
        this.k = r13Var;
        this.l = i;
        this.m = list;
        this.n = j;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = m82Var;
        this.u = z4;
        if (z2) {
            ff8Var = ff8.a;
        } else {
            ff8Var = ff8.b;
        }
        this.v = ff8Var;
    }

    @Override // defpackage.c37
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.c37
    public final xt4 b() {
        return this.d.b();
    }

    @Override // defpackage.c37
    public final lu4 c() {
        return this.d.c();
    }

    @Override // defpackage.c37
    public final int d() {
        return this.d.d();
    }

    @Override // defpackage.c37
    public final int e() {
        return this.d.e();
    }

    @Override // defpackage.c37
    public final xt4 f() {
        return this.d.f();
    }

    @Override // defpackage.c37
    public final Map g() {
        return this.d.g();
    }

    public final gk6 h(int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        char c;
        long j;
        long j2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        if (!this.h) {
            List list = this.m;
            if (!list.isEmpty()) {
                int[] iArr = this.a;
                if (iArr.length != 0) {
                    int[] iArr2 = this.b;
                    if (iArr2.length != 0) {
                        int i6 = this.r;
                        int i7 = this.p;
                        int i8 = i7 - i6;
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            ik6 ik6Var = (ik6) list.get(i9);
                            if (!ik6Var.u) {
                                if (ik6Var.m() <= 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (ik6Var.m() + i <= 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z3 == z4) {
                                    int m = ik6Var.m();
                                    int i10 = this.o;
                                    if (m <= i10) {
                                        if (i < 0) {
                                            if ((ik6Var.n() + ik6Var.m()) - i10 <= (-i)) {
                                                return null;
                                            }
                                        } else if (i10 - ik6Var.m() <= i) {
                                            return null;
                                        }
                                    }
                                    if (ik6Var.n() + ik6Var.m() >= i8) {
                                        if (i < 0) {
                                            if ((ik6Var.n() + ik6Var.m()) - i7 <= (-i)) {
                                                return null;
                                            }
                                        } else if (i7 - ik6Var.m() <= i) {
                                            return null;
                                        }
                                    }
                                } else {
                                    return null;
                                }
                            } else {
                                return null;
                            }
                        }
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ik6 ik6Var2 = (ik6) list.get(i11);
                            boolean z5 = ik6Var2.d;
                            if (!ik6Var2.u) {
                                long j3 = ik6Var2.w;
                                char c2 = ' ';
                                if (z5) {
                                    i2 = (int) (j3 >> 32);
                                } else {
                                    i2 = ((int) (j3 >> 32)) + i;
                                }
                                long j4 = 4294967295L;
                                if (z5) {
                                    i3 = ((int) (j3 & 4294967295L)) + i;
                                } else {
                                    i3 = (int) (j3 & 4294967295L);
                                }
                                ik6Var2.w = (i2 << 32) | (i3 & 4294967295L);
                                if (z) {
                                    int size3 = ik6Var2.c.size();
                                    int i12 = 0;
                                    while (i12 < size3) {
                                        mh6 a = ik6Var2.j.a(i12, ik6Var2.b);
                                        if (a != null) {
                                            char c3 = c2;
                                            long j5 = a.l;
                                            if (z5) {
                                                c = c3;
                                                j2 = j5;
                                                i4 = (int) (j2 >> c);
                                            } else {
                                                c = c3;
                                                j2 = j5;
                                                i4 = ((int) (j2 >> c)) + i;
                                            }
                                            if (z5) {
                                                i5 = ((int) (j2 & j4)) + i;
                                            } else {
                                                i5 = (int) (j2 & j4);
                                            }
                                            j = j4;
                                            a.l = (i5 & j) | (i4 << c);
                                        } else {
                                            c = c2;
                                            j = j4;
                                        }
                                        i12++;
                                        c2 = c;
                                        j4 = j;
                                    }
                                }
                            }
                        }
                        int length = iArr2.length;
                        int[] iArr3 = new int[length];
                        for (int i13 = 0; i13 < length; i13++) {
                            iArr3[i13] = iArr2[i13] - i;
                        }
                        float f = i;
                        if (!this.f && i <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        return new gk6(iArr, iArr3, f, this.d, this.e, z2, this.g, this.h, this.i, this.j, this.k, this.l, list, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
