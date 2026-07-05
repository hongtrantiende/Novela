package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ky5  reason: default package */
/* loaded from: classes.dex */
public final class ky5 {
    public final kv7 a;
    public final bv7 b;
    public int c;
    public int d;
    public final int e;
    public int f;
    public vu7 g;

    public ky5(ky5 ky5Var) {
        int i;
        if (ky5Var != null) {
            kv7 kv7Var = new kv7(ky5Var.a.b);
            kv7Var.b(ky5Var.a);
            this.a = kv7Var;
            bv7 bv7Var = new bv7(ky5Var.b.b);
            bv7 bv7Var2 = ky5Var.b;
            int i2 = bv7Var.b;
            bv7Var2.getClass();
            if (i2 >= 0 && i2 <= (i = bv7Var.b)) {
                int i3 = bv7Var2.b;
                if (i3 != 0) {
                    bv7Var.b(i + i3);
                    long[] jArr = bv7Var.a;
                    int i4 = bv7Var.b;
                    if (i2 != i4) {
                        b00.Y(jArr, jArr, bv7Var2.b + i2, i2, i4);
                    }
                    b00.Y(bv7Var2.a, jArr, i2, 0, bv7Var2.b);
                    bv7Var.b += bv7Var2.b;
                }
                this.b = bv7Var;
                this.e = ky5Var.e;
                this.d = ky5Var.d;
                this.c = ky5Var.c;
                this.f = ky5Var.f;
                return;
            }
            cy7.k("");
            throw null;
        }
        this.a = new kv7();
        this.b = new bv7();
        int a = a(null, zr1.y(Integer.MAX_VALUE, Integer.MIN_VALUE, false, false), 0, 1);
        this.e = a;
        this.d = a;
        this.c = 0;
        this.f = 1;
    }

    public static final void b(ky5 ky5Var, int i) {
        int l;
        int i2;
        int l2;
        int g = ky5Var.g(i);
        int i3 = ky5Var.i(i);
        int i4 = ky5Var.e;
        if (i3 == i4) {
            i2 = ky5Var.m(i);
            l = ky5Var.l(i);
            ky5Var.y(i, ky5Var.m(i));
            ky5Var.z(l);
            ky5Var.z(i4);
        } else if (ky5Var.m(i) == i4) {
            i2 = ky5Var.i(i);
            l = ky5Var.l(i);
            ky5Var.y(i, ky5Var.i(i));
            ky5Var.z(l);
            ky5Var.z(i4);
        } else {
            int m = ky5Var.m(i);
            while (ky5Var.i(m) != i4) {
                m = ky5Var.i(m);
            }
            int g2 = ky5Var.g(m);
            int m2 = ky5Var.m(m);
            if (ky5Var.l(m) == i) {
                l = m;
            } else {
                l = ky5Var.l(m);
                ky5Var.y(m, ky5Var.m(m));
                ky5Var.x(m, ky5Var.m(i));
                ky5Var.w(ky5Var.m(m), m);
            }
            ky5Var.u(m, ky5Var.i(i));
            ky5Var.w(ky5Var.i(m), m);
            ky5Var.t(m, ky5Var.g(i));
            ky5Var.v(m, ky5Var.b.c(i + 3));
            ky5Var.y(i, m);
            ky5Var.z(l);
            ky5Var.z(m);
            g = g2;
            i2 = m2;
        }
        if (g == 1) {
            while (i2 != ky5Var.d && ky5Var.g(i2) == 1) {
                if (i2 == ky5Var.i(l)) {
                    int m3 = ky5Var.m(l);
                    if (ky5Var.g(m3) == 0) {
                        ky5Var.t(m3, 1);
                        ky5Var.t(l, 0);
                        ky5Var.r(l);
                        m3 = ky5Var.m(l);
                    }
                    if (ky5Var.g(ky5Var.i(m3)) == 1 && ky5Var.g(ky5Var.m(m3)) == 1) {
                        ky5Var.t(m3, 0);
                        l2 = ky5Var.l(l);
                        i2 = l;
                        l = l2;
                    } else {
                        if (ky5Var.g(ky5Var.m(m3)) == 1) {
                            ky5Var.t(ky5Var.i(m3), 1);
                            ky5Var.t(m3, 0);
                            ky5Var.s(m3);
                            m3 = ky5Var.m(l);
                        }
                        ky5Var.t(m3, ky5Var.g(l));
                        ky5Var.t(l, 1);
                        ky5Var.t(ky5Var.m(m3), 1);
                        ky5Var.r(l);
                        i2 = ky5Var.d;
                    }
                } else {
                    int i5 = ky5Var.i(l);
                    if (ky5Var.g(i5) == 0) {
                        ky5Var.t(i5, 1);
                        ky5Var.t(l, 0);
                        ky5Var.s(l);
                        i5 = ky5Var.i(l);
                    }
                    if (ky5Var.g(ky5Var.m(i5)) == 1 && ky5Var.g(ky5Var.i(i5)) == 1) {
                        ky5Var.t(i5, 0);
                        l2 = ky5Var.l(l);
                        i2 = l;
                        l = l2;
                    } else {
                        if (ky5Var.g(ky5Var.i(i5)) == 1) {
                            ky5Var.t(ky5Var.m(i5), 1);
                            ky5Var.t(i5, 0);
                            ky5Var.r(i5);
                            i5 = ky5Var.i(l);
                        }
                        ky5Var.t(i5, ky5Var.g(l));
                        ky5Var.t(l, 1);
                        ky5Var.t(ky5Var.i(i5), 1);
                        ky5Var.s(l);
                        i2 = ky5Var.d;
                    }
                }
            }
            ky5Var.t(i2, 1);
        }
    }

    public static final void c(ky5 ky5Var, int i) {
        bv7 bv7Var = ky5Var.b;
        bv7Var.e(i, bv7Var.c(i) | 2147483648L);
        ky5Var.c++;
    }

    public final int a(uva uvaVar, long j, int i, int i2) {
        boolean z;
        bv7 bv7Var = this.b;
        int i3 = bv7Var.b;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        bv7Var.a(zr1.y(i, 0, z, false));
        bv7Var.a(0L);
        bv7Var.a(j);
        bv7Var.a(j);
        this.a.a(uvaVar);
        return i3;
    }

    public final void d(int i) {
        int m;
        int i2 = this.d;
        int i3 = this.e;
        int i4 = i3;
        while (i2 != i3) {
            if (n(i) <= n(i2)) {
                m = i(i2);
            } else {
                m = m(i2);
            }
            int i5 = m;
            i4 = i2;
            i2 = i5;
        }
        w(i, i4);
        if (i4 == i3) {
            this.d = i;
        } else if (n(i) <= n(i4)) {
            u(i4, i);
        } else {
            x(i4, i);
        }
        z(i4);
        while (i != this.d && g(l(i)) == 0) {
            int l = l(l(i));
            if (l(i) == i(l)) {
                int m2 = m(l);
                if (g(m2) == 0) {
                    t(m2, 1);
                    t(l(i), 1);
                    t(l, 0);
                    i = l;
                } else {
                    if (i == m(l(i))) {
                        i = l(i);
                        r(i);
                    }
                    t(l(i), 1);
                    t(l, 0);
                    s(l);
                }
            } else {
                int i6 = i(l);
                if (g(i6) == 0) {
                    t(i6, 1);
                    t(l(i), 1);
                    t(l, 0);
                    i = l;
                } else {
                    if (i == i(l(i))) {
                        i = l(i);
                        s(i);
                    }
                    t(l(i), 1);
                    t(l, 0);
                    r(l);
                }
            }
        }
        t(this.d, 1);
    }

    public final void e() {
        bv7 bv7Var;
        if (this.c == 0) {
            return;
        }
        vu7 p = p();
        p.b(q());
        int q = q();
        int i = 0;
        int i2 = 0;
        while (true) {
            bv7Var = this.b;
            if (i >= q) {
                break;
            }
            if (zr1.E(bv7Var.c(i * 4))) {
                i2++;
            }
            p.a((i - i2) * 4);
            i++;
        }
        this.d = p.c(this.d / 4);
        int i3 = 4;
        int i4 = 4;
        while (true) {
            int i5 = bv7Var.b;
            kv7 kv7Var = this.a;
            if (i3 < i5) {
                long c = bv7Var.c(i3);
                if (zr1.E(c)) {
                    i3 += 4;
                } else {
                    if (i4 != i3) {
                        bv7Var.e(i4, (c & (-2147483648L)) | p.c(((int) (2147483647L & c)) / 4));
                        long c2 = bv7Var.c(i3 + 1);
                        bv7Var.e(i4 + 1, (p.c(((int) (c2 >> 32)) / 4) << 32) | (p.c(((int) (c2 & 4294967295L)) / 4) & 4294967295L));
                        bv7Var.e(i4 + 2, bv7Var.c(i3 + 2));
                        bv7Var.e(i4 + 3, bv7Var.c(i3 + 3));
                        kv7Var.n(i4 / 4, kv7Var.f(i3 / 4));
                    } else {
                        bv7Var.e(i4, (c & (-2147483648L)) | p.c(((int) (2147483647L & c)) / 4));
                        long c3 = bv7Var.c(i3 + 1);
                        bv7Var.e(i4 + 1, (p.c(((int) (c3 >> 32)) / 4) << 32) | (p.c(((int) (c3 & 4294967295L)) / 4) & 4294967295L));
                    }
                    i3 += 4;
                    i4 += 4;
                }
            } else {
                bv7Var.d(i4, i5);
                int i6 = kv7Var.b;
                kv7Var.l(i6 - this.c, i6);
                this.c = 0;
                p.b = 0;
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky5)) {
            return false;
        }
        bv7 bv7Var = this.b;
        long c = bv7Var.c(this.d + 3);
        ky5 ky5Var = (ky5) obj;
        bv7 bv7Var2 = ky5Var.b;
        if (c != bv7Var2.c(ky5Var.d + 3) || q() - this.c != ky5Var.q() - ky5Var.c) {
            return false;
        }
        int i = 4;
        int i2 = 4;
        while (i < bv7Var.b && i2 < bv7Var2.b) {
            if (zr1.E(bv7Var.c(i))) {
                i += 4;
            } else {
                if (!zr1.E(bv7Var2.c(i2))) {
                    if (bv7Var.c(i + 2) != bv7Var2.c(i2 + 2)) {
                        return false;
                    }
                    if (!c16.i(this.a.f(i / 4), ky5Var.a.f(i2 / 4))) {
                        return false;
                    }
                    i += 4;
                }
                i2 += 4;
            }
        }
        return true;
    }

    public final void f() {
        if (q() > 64 && this.c >= q() / 2) {
            e();
        }
    }

    public final int g(int i) {
        return !zr1.D(this.b.c(i)) ? 1 : 0;
    }

    public final int h(int i) {
        return (int) (o(i) & 2147483647L);
    }

    public final int hashCode() {
        int i;
        int i2 = 4;
        int i3 = 0;
        while (true) {
            bv7 bv7Var = this.b;
            if (i2 < bv7Var.b) {
                if (!zr1.E(bv7Var.c(i2))) {
                    int h = (h(i2) + ((n(i2) + (i3 * 31)) * 31)) * 31;
                    Object f = this.a.f(i2 / 4);
                    if (f != null) {
                        i = f.hashCode();
                    } else {
                        i = 0;
                    }
                    i3 = h + i;
                }
                i2 += 4;
            } else {
                return i3;
            }
        }
    }

    public final int i(int i) {
        return (int) (this.b.c(i + 1) >> 32);
    }

    public final int j(int i) {
        return (int) (this.b.c(i + 3) & 2147483647L);
    }

    public final int k(int i) {
        return zr1.F(this.b.c(i + 3));
    }

    public final int l(int i) {
        return (int) (this.b.c(i) & 2147483647L);
    }

    public final int m(int i) {
        return (int) (this.b.c(i + 1) & 4294967295L);
    }

    public final int n(int i) {
        return zr1.F(o(i));
    }

    public final long o(int i) {
        return this.b.c(i + 2);
    }

    public final vu7 p() {
        vu7 vu7Var = this.g;
        if (vu7Var == null) {
            vu7 vu7Var2 = new vu7();
            this.g = vu7Var2;
            return vu7Var2;
        }
        return vu7Var;
    }

    public final int q() {
        return this.b.b / 4;
    }

    public final void r(int i) {
        int m = m(i);
        x(i, i(m));
        int i2 = i(m);
        int i3 = this.e;
        if (i2 != i3) {
            w(i(m), i);
        }
        w(m, l(i));
        if (l(i) == i3) {
            this.d = m;
        } else if (i(l(i)) == i) {
            u(l(i), m);
        } else {
            x(l(i), m);
        }
        u(m, i);
        w(i, m);
        z(i);
        z(l(i));
    }

    public final void s(int i) {
        int i2 = i(i);
        u(i, m(i2));
        int m = m(i2);
        int i3 = this.e;
        if (m != i3) {
            w(m(i2), i);
        }
        w(i2, l(i));
        if (l(i) == i3) {
            this.d = i2;
        } else if (m(l(i)) == i) {
            x(l(i), i2);
        } else {
            u(l(i), i2);
        }
        x(i2, i);
        w(i, i2);
        z(i);
        z(l(i));
    }

    public final void t(int i, int i2) {
        long j;
        bv7 bv7Var = this.b;
        long c = bv7Var.c(i);
        if (i2 == 0) {
            j = c | Long.MIN_VALUE;
        } else {
            j = c & Long.MAX_VALUE;
        }
        bv7Var.e(i, j);
    }

    public final void u(int i, int i2) {
        int i3 = i + 1;
        bv7 bv7Var = this.b;
        bv7Var.e(i3, (((int) (bv7Var.c(i3) & 4294967295L)) & 4294967295L) | (i2 << 32));
    }

    public final void v(int i, long j) {
        this.b.e(i + 3, j);
    }

    public final void w(int i, int i2) {
        bv7 bv7Var = this.b;
        bv7Var.e(i, (bv7Var.c(i) & (-2147483648L)) | i2);
    }

    public final void x(int i, int i2) {
        int i3 = i + 1;
        bv7 bv7Var = this.b;
        bv7Var.e(i3, (((int) (bv7Var.c(i3) >> 32)) << 32) | (i2 & 4294967295L));
    }

    public final void y(int i, int i2) {
        if (i == i2) {
            return;
        }
        int l = l(i);
        int i3 = this.e;
        if (l == i3) {
            this.d = i2;
        } else if (i == i(l(i))) {
            u(l(i), i2);
        } else {
            x(l(i), i2);
        }
        if (i2 == i3) {
            return;
        }
        w(i2, l(i));
    }

    public final void z(int i) {
        while (i != this.e) {
            long c = this.b.c(i + 3);
            int min = Math.min(n(i), Math.min(k(i(i)), k(m(i))));
            int max = Math.max(h(i), Math.max(j(i(i)), j(m(i))));
            if (zr1.F(c) == min && ((int) (c & 2147483647L)) == max) {
                return;
            }
            v(i, zr1.y(min, max, false, false));
            i = l(i);
        }
    }
}
