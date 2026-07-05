package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m7a  reason: default package */
/* loaded from: classes.dex */
public final class m7a {
    public final mkc a;
    public final fvb b;
    public final boolean c;
    public final float d;
    public final vsb e;
    public final grb f;
    public final r7a g;
    public long h;
    public eid i;
    public final String j;

    public m7a(mkc mkcVar, fvb fvbVar, boolean z, float f, vsb vsbVar) {
        xt4 xt4Var;
        this.a = mkcVar;
        this.b = fvbVar;
        this.c = z;
        this.d = f;
        this.e = vsbVar;
        zqa f2 = pae.f();
        if (f2 != null) {
            xt4Var = f2.e();
        } else {
            xt4Var = null;
        }
        zqa h = pae.h(f2);
        try {
            grb f3 = mkcVar.f();
            this.f = f3;
            this.g = mkcVar.e();
            pae.n(f2, h, xt4Var);
            this.h = f3.e;
            this.j = f3.d.toString();
        } catch (Throwable th) {
            pae.n(f2, h, xt4Var);
            throw th;
        }
    }

    public final void a() {
        if (this.j.length() > 0) {
            grb grbVar = this.f;
            boolean d = fxb.d(grbVar.e);
            mkc mkcVar = this.a;
            if (!d) {
                mkcVar.c();
            } else {
                mkc.l(mkcVar, "", sze.a((int) (grbVar.e >> 32), (int) (this.h & 4294967295L)), !this.c, 4);
            }
            this.h = this.a.f().e;
            this.i = eid.a;
        }
    }

    public final boolean b() {
        fvb fvbVar = this.b;
        if (fvbVar != null) {
            long j = this.h;
            int i = fxb.c;
            if (fvbVar.b.h((int) (j & 4294967295L)) != oq9.a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int c(fvb fvbVar, int i) {
        long j = this.h;
        int i2 = fxb.c;
        int i3 = (int) (j & 4294967295L);
        vsb vsbVar = this.e;
        if (Float.isNaN(vsbVar.a)) {
            vsbVar.a = fvbVar.c(i3).a;
        }
        it7 it7Var = fvbVar.b;
        int d = it7Var.d(i3) + i;
        if (d < 0) {
            return Integer.MIN_VALUE;
        }
        if (d >= it7Var.f) {
            return Integer.MAX_VALUE;
        }
        float b = it7Var.b(d) - 1.0f;
        float f = vsbVar.a;
        if ((b() && f >= fvbVar.h(d)) || (!b() && f <= fvbVar.g(d))) {
            return it7Var.c(d, true);
        }
        return it7Var.g((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(b) & 4294967295L));
    }

    public final int d(int i) {
        long j = this.f.e;
        int i2 = fxb.c;
        int i3 = (int) (j & 4294967295L);
        fvb fvbVar = this.b;
        if (fvbVar != null) {
            it7 it7Var = fvbVar.b;
            float f = this.d;
            if (!Float.isNaN(f)) {
                rk9 n = fvbVar.c(i3).n(nae.e, f * i);
                float f2 = n.b;
                float b = it7Var.b(it7Var.e(f2));
                if (Math.abs(f2 - b) > Math.abs(n.d - b)) {
                    return it7Var.g(n.j());
                }
                return it7Var.g(n.d());
            }
        }
        return i3;
    }

    public final void e() {
        int i;
        fvb fvbVar = this.b;
        if (fvbVar != null) {
            i = c(fvbVar, 1);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i == Integer.MAX_VALUE) {
            this.e.a = Float.NaN;
        }
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i2 = fxb.c;
            int i3 = (int) (j & 4294967295L);
            int length = str.length();
            if (i > length) {
                i = length;
            }
            long e = eze.e(i, i3, this.a);
            int i4 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i4 != i3 || !fxb.d(this.h)) {
                this.h = sze.a(i4, i4);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void f() {
        if (this.j.length() > 0) {
            long j = this.h;
            int i = fxb.c;
            int i2 = (int) (j & 4294967295L);
            long e = eze.e(d(1), i2, this.a);
            int i3 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i3 != i2 || !fxb.d(this.h)) {
                this.h = sze.a(i3, i3);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void g() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = fxb.c;
            int i2 = (int) (j & 4294967295L);
            long e = eze.e(kqe.j(i2, str), i2, this.a);
            int i3 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i3 != i2 || !fxb.d(this.h)) {
                this.h = sze.a(i3, i3);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void h() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = (int) (4294967295L & j);
            int l = jqe.l(str, fxb.f(j));
            if (l == fxb.f(this.h) && l != str.length()) {
                l = jqe.l(str, l + 1);
            }
            long e = eze.e(l, i, this.a);
            int i2 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i2 != i || !fxb.d(this.h)) {
                this.h = sze.a(i2, i2);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void i() {
        int length;
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = fxb.c;
            int i2 = (int) (j & 4294967295L);
            fvb fvbVar = this.b;
            if (fvbVar != null) {
                int i3 = i2;
                while (true) {
                    grb grbVar = this.f;
                    if (i3 >= grbVar.d.length()) {
                        length = grbVar.d.length();
                        break;
                    }
                    int length2 = str.length() - 1;
                    if (i3 <= length2) {
                        length2 = i3;
                    }
                    long k = fvbVar.k(length2);
                    int i4 = fxb.c;
                    int i5 = (int) (k & 4294967295L);
                    if (i5 <= i3) {
                        i3++;
                    } else {
                        length = i5;
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long e = eze.e(length, i2, this.a);
            int i6 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i6 != i2 || !fxb.d(this.h)) {
                this.h = sze.a(i6, i6);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void j() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = fxb.c;
            int i2 = (int) (j & 4294967295L);
            long e = eze.e(kqe.k(i2, str), i2, this.a);
            int i3 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i3 != i2 || !fxb.d(this.h)) {
                this.h = sze.a(i3, i3);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void k() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = (int) (4294967295L & j);
            int m = jqe.m(str, fxb.g(j));
            if (m == fxb.g(this.h) && m != 0) {
                m = jqe.m(str, m - 1);
            }
            long e = eze.e(m, i, this.a);
            int i2 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i2 != i || !fxb.d(this.h)) {
                this.h = sze.a(i2, i2);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void l() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = fxb.c;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            fvb fvbVar = this.b;
            if (fvbVar != null) {
                int i4 = i2;
                while (true) {
                    if (i4 <= 0) {
                        break;
                    }
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long k = fvbVar.k(length);
                    int i5 = fxb.c;
                    int i6 = (int) (k >> 32);
                    if (i6 >= i4) {
                        i4--;
                    } else {
                        i3 = i6;
                        break;
                    }
                }
            }
            long e = eze.e(i3, i2, this.a);
            int i7 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i7 != i2 || !fxb.d(this.h)) {
                this.h = sze.a(i7, i7);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void m() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = fxb.c;
            int i2 = (int) (j & 4294967295L);
            long e = eze.e(str.length(), i2, this.a);
            int i3 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i3 != i2 || !fxb.d(this.h)) {
                this.h = sze.a(i3, i3);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void n() {
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            long j = this.h;
            int i = fxb.c;
            int i2 = (int) (j & 4294967295L);
            long e = eze.e(0, i2, this.a);
            int i3 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i3 != i2 || !fxb.d(this.h)) {
                this.h = sze.a(i3, i3);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void o() {
        int length;
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = fxb.c;
            int i2 = (int) (4294967295L & j);
            fvb fvbVar = this.b;
            if (fvbVar != null) {
                it7 it7Var = fvbVar.b;
                length = it7Var.c(it7Var.d(fxb.f(j)), true);
            } else {
                length = str.length();
            }
            long e = eze.e(length, i2, this.a);
            int i3 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i3 != i2 || !fxb.d(this.h)) {
                this.h = sze.a(i3, i3);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void p() {
        int i;
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            long j = this.h;
            int i2 = fxb.c;
            int i3 = (int) (4294967295L & j);
            fvb fvbVar = this.b;
            if (fvbVar != null) {
                i = fvbVar.i(fvbVar.b.d(fxb.g(j)));
            } else {
                i = 0;
            }
            long e = eze.e(i, i3, this.a);
            int i4 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i4 != i3 || !fxb.d(this.h)) {
                this.h = sze.a(i4, i4);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void q() {
        int i;
        fvb fvbVar = this.b;
        if (fvbVar != null) {
            i = c(fvbVar, -1);
        } else {
            i = Integer.MIN_VALUE;
        }
        if (i == Integer.MIN_VALUE) {
            this.e.a = Float.NaN;
        }
        if (this.j.length() > 0) {
            long j = this.h;
            int i2 = fxb.c;
            int i3 = (int) (j & 4294967295L);
            if (i < 0) {
                i = 0;
            }
            long e = eze.e(i, i3, this.a);
            int i4 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i4 != i3 || !fxb.d(this.h)) {
                this.h = sze.a(i4, i4);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void r() {
        if (this.j.length() > 0) {
            long j = this.h;
            int i = fxb.c;
            int i2 = (int) (j & 4294967295L);
            long e = eze.e(d(-1), i2, this.a);
            int i3 = (int) (e >> 32);
            eid r = cae.r(e);
            if (i3 != i2 || !fxb.d(this.h)) {
                this.h = sze.a(i3, i3);
            }
            if (r != null) {
                this.i = r;
            }
        }
    }

    public final void s() {
        if (this.j.length() > 0) {
            long j = this.f.e;
            int i = fxb.c;
            this.h = sze.a((int) (j >> 32), (int) (this.h & 4294967295L));
        }
    }
}
