package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lt7  reason: default package */
/* loaded from: classes.dex */
public final class lt7 {
    public ps a;
    public do4 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public qa0 h;
    public nc7 i;
    public r13 k;
    public oyb l;
    public bm1 m;
    public tc6 n;
    public fvb o;
    public kt7 r;
    public long s;
    public long j = pv5.a;
    public int p = -1;
    public int q = -1;

    public lt7(ps psVar, oyb oybVar, do4 do4Var, int i, boolean z, int i2, int i3, List list, qa0 qa0Var) {
        this.a = psVar;
        this.b = do4Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = qa0Var;
        this.l = oybVar;
    }

    public final int a(int i, tc6 tc6Var) {
        int i2 = this.p;
        int i3 = this.q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = y02.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            a = h(a, tc6Var);
        }
        int l = qwe.l(b(a, tc6Var).e);
        int j = x02.j(a);
        if (l < j) {
            l = j;
        }
        this.p = i;
        this.q = l;
        return l;
    }

    public final it7 b(long j, tc6 tc6Var) {
        int i;
        bm1 e = e(tc6Var);
        long n = bce.n(j, this.d, this.c, e.l());
        boolean z = this.d;
        int i2 = this.c;
        int i3 = this.e;
        if ((!z && (i2 == 2 || i2 == 4 || i2 == 5)) || i3 < 1) {
            i = 1;
        } else {
            i = i3;
        }
        return new it7(e, n, i, i2);
    }

    public final boolean c(long j, tc6 tc6Var) {
        long j2;
        this.s = (this.s << 2) | 3;
        if (this.f > 1) {
            j2 = h(j, tc6Var);
        } else {
            j2 = j;
        }
        fvb fvbVar = this.o;
        if (fvbVar != null) {
            it7 it7Var = fvbVar.b;
            evb evbVar = fvbVar.a;
            if (!it7Var.a.b()) {
                tc6 tc6Var2 = evbVar.h;
                long j3 = evbVar.j;
                if (tc6Var == tc6Var2 && (x02.c(j2, j3) || (x02.i(j2) == x02.i(j3) && x02.k(j2) == x02.k(j3) && x02.h(j2) >= it7Var.e && !it7Var.c))) {
                    fvb fvbVar2 = this.o;
                    fvbVar2.getClass();
                    if (x02.c(j2, fvbVar2.a.j)) {
                        return false;
                    }
                    fvb fvbVar3 = this.o;
                    fvbVar3.getClass();
                    this.o = g(tc6Var, j2, fvbVar3.b);
                    return true;
                }
            }
        }
        qa0 qa0Var = this.h;
        if (qa0Var != null) {
            this.n = tc6Var;
            long j4 = this.l.a.b;
            if (this.r == null) {
                this.r = new kt7(this);
            }
            kt7 kt7Var = this.r;
            kt7Var.getClass();
            float k1 = kt7Var.k1(qa0Var.c);
            float k12 = kt7Var.k1(qa0Var.a);
            float k13 = kt7Var.k1(qa0Var.b);
            float f = 2.0f;
            float f2 = (k12 + k13) / 2.0f;
            float f3 = k13;
            float f4 = k12;
            while (f3 - f4 >= k1) {
                float f5 = f;
                float f6 = f3;
                if (qa0.a(kt7Var.a(j, kt7Var.r0(f2)))) {
                    f3 = f2;
                } else {
                    f4 = f2;
                    f3 = f6;
                }
                f2 = (f4 + f3) / f5;
                f = f5;
            }
            float floor = (((float) Math.floor((f4 - k12) / k1)) * k1) + k12;
            float f7 = k1 + floor;
            if (f7 <= k13 && !qa0.a(kt7Var.a(j, kt7Var.r0(f7)))) {
                floor = f7;
            }
            long r0 = kt7Var.r0(floor);
            if (e4c.d(r0)) {
                r0 = mt7.a(j4, r0);
            }
            long j5 = r0;
            if (this.r == null) {
                this.r = new kt7(this);
            }
            kt7 kt7Var2 = this.r;
            kt7Var2.getClass();
            fvb fvbVar4 = kt7Var2.a;
            if (fvbVar4 != null) {
                evb evbVar2 = fvbVar4.a;
                if (e4c.a(j5, evbVar2.b.a.b) && evbVar2.f == this.c) {
                    this.o = fvbVar4;
                    return true;
                }
            }
            f(oyb.a(this.l, 0L, j5, null, null, null, 0L, null, 0, 0L, null, 16777213));
        }
        this.o = g(tc6Var, j2, b(j2, tc6Var));
        return true;
    }

    public final void d(r13 r13Var) {
        long j;
        r13 r13Var2 = this.k;
        if (r13Var != null) {
            int i = pv5.b;
            j = pv5.a(r13Var.f(), r13Var.G0());
        } else {
            j = pv5.a;
        }
        if (r13Var2 == null) {
            this.k = r13Var;
            this.j = j;
        } else if (r13Var != null && this.j == j) {
        } else {
            this.k = r13Var;
            this.j = j;
            this.s = (this.s << 2) | 1;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.p = -1;
            this.r = null;
        }
    }

    public final bm1 e(tc6 tc6Var) {
        bm1 bm1Var = this.m;
        if (bm1Var == null || tc6Var != this.n || bm1Var.b()) {
            this.n = tc6Var;
            ps psVar = this.a;
            oyb z = uaf.z(this.l, tc6Var);
            r13 r13Var = this.k;
            r13Var.getClass();
            do4 do4Var = this.b;
            List list = this.g;
            if (list == null) {
                list = ks3.a;
            }
            bm1Var = new bm1(psVar, z, list, r13Var, do4Var);
        }
        this.m = bm1Var;
        return bm1Var;
    }

    public final void f(oyb oybVar) {
        boolean d = oybVar.d(this.l);
        this.l = oybVar;
        if (!d) {
            this.s <<= 2;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.p = -1;
        }
    }

    public final fvb g(tc6 tc6Var, long j, it7 it7Var) {
        float min = Math.min(it7Var.a.l(), it7Var.d);
        ps psVar = this.a;
        oyb oybVar = this.l;
        List list = this.g;
        if (list == null) {
            list = ks3.a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        r13 r13Var = this.k;
        r13Var.getClass();
        return new fvb(new evb(psVar, oybVar, list, i, z, i2, r13Var, tc6Var, this.b, j), it7Var, y02.d(j, (qwe.l(min) << 32) | (qwe.l(it7Var.e) & 4294967295L)));
    }

    public final long h(long j, tc6 tc6Var) {
        nc7 nc7Var = this.i;
        oyb oybVar = this.l;
        r13 r13Var = this.k;
        r13Var.getClass();
        nc7 j2 = st0.j(nc7Var, tc6Var, oybVar, r13Var, this.b);
        this.i = j2;
        return j2.a(this.f, j);
    }

    public final String toString() {
        String str;
        Object obj = "null";
        if (this.o == null) {
            str = "null";
        } else {
            str = "<TextLayoutResult>";
        }
        String b = pv5.b(this.j);
        long j = this.s;
        fvb fvbVar = this.o;
        if (fvbVar != null) {
            obj = new x02(fvbVar.a.j);
        }
        StringBuilder y = nk2.y("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", b, ", history=");
        y.append(j);
        y.append(", constraints=");
        y.append(obj);
        y.append(")");
        return y.toString();
    }
}
