package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eg6  reason: default package */
/* loaded from: classes.dex */
public final class eg6 implements c37 {
    public final gg6 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final c37 e;
    public final float f;
    public final boolean g;
    public final m82 h;
    public final r13 i;
    public final int j;
    public final xt4 k;
    public final xt4 l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final ff8 q;
    public final int r;
    public final int s;

    public eg6(gg6 gg6Var, int i, boolean z, float f, c37 c37Var, float f2, boolean z2, m82 m82Var, r13 r13Var, int i2, xt4 xt4Var, xt4 xt4Var2, List list, int i3, int i4, int i5, ff8 ff8Var, int i6, int i7) {
        this.a = gg6Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = c37Var;
        this.f = f2;
        this.g = z2;
        this.h = m82Var;
        this.i = r13Var;
        this.j = i2;
        this.k = xt4Var;
        this.l = xt4Var2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = ff8Var;
        this.r = i6;
        this.s = i7;
    }

    @Override // defpackage.c37
    public final void a() {
        this.e.a();
    }

    @Override // defpackage.c37
    public final xt4 b() {
        return this.e.b();
    }

    @Override // defpackage.c37
    public final lu4 c() {
        return this.e.c();
    }

    @Override // defpackage.c37
    public final int d() {
        return this.e.d();
    }

    @Override // defpackage.c37
    public final int e() {
        return this.e.e();
    }

    @Override // defpackage.c37
    public final xt4 f() {
        return this.e.f();
    }

    @Override // defpackage.c37
    public final Map g() {
        return this.e.g();
    }

    public final eg6 h(int i, boolean z) {
        gg6 gg6Var;
        boolean z2;
        int i2;
        int i3;
        int i4;
        List list;
        int i5;
        int i6;
        long j;
        List list2;
        int i7;
        int i8;
        if (!this.g) {
            List list3 = this.m;
            if (!list3.isEmpty() && (gg6Var = this.a) != null) {
                int i9 = gg6Var.h;
                int i10 = this.b - i;
                if (i10 >= 0 && i10 < i9) {
                    fg6 fg6Var = (fg6) sl1.c0(list3);
                    fg6 fg6Var2 = (fg6) sl1.j0(list3);
                    if (!fg6Var.A && !fg6Var2.A) {
                        int i11 = this.o;
                        int i12 = this.n;
                        ff8 ff8Var = this.q;
                        if (i < 0) {
                            if (Math.min((fg6Var.m() + ape.r(fg6Var, ff8Var)) - i12, (fg6Var2.m() + ape.r(fg6Var2, ff8Var)) - i11) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i12 - ape.r(fg6Var, ff8Var), i11 - ape.r(fg6Var2, ff8Var)) <= i) {
                            return null;
                        }
                        int size = list3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            fg6 fg6Var3 = (fg6) list3.get(i13);
                            boolean z3 = fg6Var3.c;
                            if (fg6Var3.A) {
                                list = list3;
                                i5 = size;
                                i4 = i10;
                            } else {
                                long j2 = fg6Var3.x;
                                if (z3) {
                                    i2 = (int) (j2 >> 32);
                                } else {
                                    i2 = ((int) (j2 >> 32)) + i;
                                }
                                long j3 = 4294967295L;
                                if (z3) {
                                    i3 = ((int) (j2 & 4294967295L)) + i;
                                } else {
                                    i3 = (int) (j2 & 4294967295L);
                                }
                                i4 = i10;
                                fg6Var3.x = (i2 << 32) | (i3 & 4294967295L);
                                if (z) {
                                    int size2 = fg6Var3.h.size();
                                    int i14 = 0;
                                    while (i14 < size2) {
                                        mh6 a = fg6Var3.k.a(i14, fg6Var3.b);
                                        if (a != null) {
                                            long j4 = a.l;
                                            if (z3) {
                                                j = j3;
                                                i7 = (int) (j4 >> 32);
                                            } else {
                                                j = j3;
                                                i7 = ((int) (j4 >> 32)) + i;
                                            }
                                            if (z3) {
                                                i8 = ((int) (j4 & j)) + i;
                                            } else {
                                                i8 = (int) (j4 & j);
                                            }
                                            list2 = list3;
                                            i6 = size;
                                            a.l = (i8 & j) | (i7 << 32);
                                        } else {
                                            i6 = size;
                                            j = j3;
                                            list2 = list3;
                                        }
                                        i14++;
                                        list3 = list2;
                                        j3 = j;
                                        size = i6;
                                    }
                                }
                                list = list3;
                                i5 = size;
                            }
                            i13++;
                            i10 = i4;
                            list3 = list;
                            size = i5;
                        }
                        List list4 = list3;
                        int i15 = i10;
                        if (!this.c && i <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        return new eg6(this.a, i15, z2, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, list4, this.n, this.o, this.p, ff8Var, this.r, this.s);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long i() {
        c37 c37Var = this.e;
        return (c37Var.e() << 32) | (c37Var.d() & 4294967295L);
    }
}
