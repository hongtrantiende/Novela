package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ol8  reason: default package */
/* loaded from: classes.dex */
public final class ol8 {
    public String a;
    public oyb b;
    public do4 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public r13 i;
    public tj j;
    public boolean k;
    public nc7 m;
    public nl8 n;
    public tc6 o;
    public long s;
    public long h = pv5.a;
    public long l = 0;
    public long p = y02.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public ol8(String str, oyb oybVar, do4 do4Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = oybVar;
        this.c = do4Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long f(ol8 ol8Var, long j, tc6 tc6Var) {
        oyb oybVar = ol8Var.b;
        nc7 nc7Var = ol8Var.m;
        r13 r13Var = ol8Var.i;
        r13Var.getClass();
        nc7 j2 = st0.j(nc7Var, tc6Var, oybVar, r13Var, ol8Var.c);
        ol8Var.m = j2;
        return j2.a(ol8Var.g, j);
    }

    public final int a(int i, tc6 tc6Var) {
        int i2;
        int i3 = this.q;
        int i4 = this.r;
        if (i == i3 && i3 != -1) {
            return i4;
        }
        long a = y02.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            a = f(this, a, tc6Var);
        }
        nl8 e = e(tc6Var);
        long n = bce.n(a, this.e, this.d, e.l());
        boolean z = this.e;
        int i5 = this.d;
        int i6 = this.f;
        if ((!z && (i5 == 2 || i5 == 4 || i5 == 5)) || i6 < 1) {
            i2 = 1;
        } else {
            i2 = i6;
        }
        int l = qwe.l(new tj((wj) e, i2, i5, n).b());
        int j = x02.j(a);
        if (l < j) {
            l = j;
        }
        this.q = i;
        this.r = l;
        return l;
    }

    public final boolean b(long j, tc6 tc6Var) {
        long j2;
        int i;
        long d;
        nl8 nl8Var;
        long d2;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            j2 = f(this, j, tc6Var);
        } else {
            j2 = j;
        }
        tj tjVar = this.j;
        boolean z2 = false;
        if (tjVar != null && (nl8Var = this.n) != null && !nl8Var.b() && tc6Var == this.o && (x02.c(j2, this.p) || (x02.i(j2) == x02.i(this.p) && x02.k(j2) == x02.k(this.p) && x02.h(j2) >= tjVar.b() && !tjVar.d.d))) {
            if (!x02.c(j2, this.p)) {
                tj tjVar2 = this.j;
                tjVar2.getClass();
                this.l = y02.d(j2, (qwe.l(Math.min(tjVar2.a.E.c(), tjVar2.d())) << 32) | (qwe.l(tjVar2.b()) & 4294967295L));
                if (this.d == 3 || (((int) (d2 >> 32)) >= tjVar2.d() && ((int) (4294967295L & d2)) >= tjVar2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = j2;
            }
            return false;
        }
        nl8 e = e(tc6Var);
        long n = bce.n(j2, this.e, this.d, e.l());
        boolean z3 = this.e;
        int i2 = this.d;
        int i3 = this.f;
        if ((!z3 && (i2 == 2 || i2 == 4 || i2 == 5)) || i3 < 1) {
            i = 1;
        } else {
            i = i3;
        }
        tj tjVar3 = new tj((wj) e, i, i2, n);
        this.p = j2;
        this.l = y02.d(j2, (qwe.l(tjVar3.b()) & 4294967295L) | (qwe.l(tjVar3.d()) << 32));
        if (this.d != 3 && (((int) (d >> 32)) < tjVar3.d() || ((int) (d & 4294967295L)) < tjVar3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = tjVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = y02.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(r13 r13Var) {
        long j;
        r13 r13Var2 = this.i;
        if (r13Var != null) {
            int i = pv5.b;
            j = pv5.a(r13Var.f(), r13Var.G0());
        } else {
            j = pv5.a;
        }
        if (r13Var2 == null) {
            this.i = r13Var;
            this.h = j;
        } else if (r13Var != null && this.h == j) {
        } else {
            this.i = r13Var;
            this.h = j;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final nl8 e(tc6 tc6Var) {
        nl8 nl8Var = this.n;
        if (nl8Var == null || tc6Var != this.o || nl8Var.b()) {
            this.o = tc6Var;
            String str = this.a;
            oyb z = uaf.z(this.b, tc6Var);
            r13 r13Var = this.i;
            r13Var.getClass();
            do4 do4Var = this.c;
            ks3 ks3Var = ks3.a;
            nl8Var = new wj(str, z, ks3Var, ks3Var, do4Var, r13Var);
        }
        this.n = nl8Var;
        return nl8Var;
    }

    public final String toString() {
        String str;
        if (this.j != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        String b = pv5.b(this.h);
        return hl5.q(nk2.y("ParagraphLayoutCache(paragraph=", str, ", lastDensity=", b, ", history="), this.s, ", constraints=$)");
    }
}
