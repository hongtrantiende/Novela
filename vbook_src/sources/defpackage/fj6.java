package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fj6  reason: default package */
/* loaded from: classes.dex */
public final class fj6 implements c37 {
    public final gj6 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final c37 e;
    public final float f;
    public final boolean g;
    public final m82 h;
    public final r13 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final ff8 p;
    public final int q;
    public final int r;

    public fj6(gj6 gj6Var, int i, boolean z, float f, c37 c37Var, float f2, boolean z2, m82 m82Var, r13 r13Var, long j, List list, int i2, int i3, int i4, boolean z3, ff8 ff8Var, int i5, int i6) {
        this.a = gj6Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = c37Var;
        this.f = f2;
        this.g = z2;
        this.h = m82Var;
        this.i = r13Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z3;
        this.p = ff8Var;
        this.q = i5;
        this.r = i6;
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

    public final fj6 h(int i, boolean z) {
        gj6 gj6Var;
        boolean z2;
        int i2;
        int i3;
        int i4;
        if (!this.g) {
            List list = this.k;
            if (!list.isEmpty() && (gj6Var = this.a) != null) {
                int m = gj6Var.m();
                int i5 = this.b - i;
                if (i5 >= 0 && i5 < m) {
                    gj6 gj6Var2 = (gj6) sl1.c0(list);
                    gj6 gj6Var3 = (gj6) sl1.j0(list);
                    if (!gj6Var2.w && !gj6Var3.w) {
                        int i6 = gj6Var2.p;
                        int i7 = this.m;
                        int i8 = this.l;
                        if (i < 0) {
                            if (Math.min((gj6Var2.m() + i6) - i8, (gj6Var3.m() + gj6Var3.p) - i7) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i8 - i6, i7 - gj6Var3.p) <= i) {
                            return null;
                        }
                        int size = list.size();
                        int i9 = 0;
                        while (i9 < size) {
                            gj6 gj6Var4 = (gj6) list.get(i9);
                            boolean z3 = gj6Var4.c;
                            int[] iArr = gj6Var4.A;
                            if (!gj6Var4.w) {
                                gj6Var4.p += i;
                                int length = iArr.length;
                                for (int i10 = 0; i10 < length; i10++) {
                                    int i11 = i10 & 1;
                                    if ((z3 && i11 != 0) || (!z3 && i11 == 0)) {
                                        iArr[i10] = iArr[i10] + i;
                                    }
                                }
                                if (z) {
                                    int size2 = gj6Var4.b.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        mh6 a = gj6Var4.n.a(i12, gj6Var4.l);
                                        if (a != null) {
                                            long j = a.l;
                                            if (z3) {
                                                i2 = i9;
                                                i3 = (int) (j >> 32);
                                                i4 = ((int) (j & 4294967295L)) + i;
                                            } else {
                                                i2 = i9;
                                                i3 = ((int) (j >> 32)) + i;
                                                i4 = (int) (j & 4294967295L);
                                            }
                                            a.l = (i4 & 4294967295L) | (i3 << 32);
                                        } else {
                                            i2 = i9;
                                        }
                                        i12++;
                                        i9 = i2;
                                    }
                                }
                            }
                            i9++;
                        }
                        if (!this.c && i <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        return new fj6(this.a, i5, z2, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
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
