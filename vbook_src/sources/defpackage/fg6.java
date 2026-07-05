package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fg6  reason: default package */
/* loaded from: classes.dex */
public final class fg6 implements wh6 {
    public boolean A;
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final tc6 e;
    public final int f;
    public final int g;
    public final List h;
    public final long i;
    public final Object j;
    public final qh6 k;
    public final long l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public int t = Integer.MIN_VALUE;
    public int u;
    public int v;
    public final long w;
    public long x;
    public int y;
    public int z;

    public fg6(int i, Object obj, boolean z, int i2, int i3, tc6 tc6Var, int i4, int i5, List list, long j, Object obj2, qh6 qh6Var, long j2, int i6, int i7) {
        long j3;
        int i8;
        this.a = i;
        this.b = obj;
        this.c = z;
        this.d = i2;
        this.e = tc6Var;
        this.f = i4;
        this.g = i5;
        this.h = list;
        this.i = j;
        this.j = obj2;
        this.k = qh6Var;
        this.l = j2;
        this.m = i6;
        this.n = i7;
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            mw8 mw8Var = (mw8) list.get(i10);
            if (this.c) {
                i8 = mw8Var.b;
            } else {
                i8 = mw8Var.a;
            }
            i9 = Math.max(i9, i8);
        }
        this.o = i9;
        boolean z2 = this.c;
        if (z2) {
            this.s = i3;
            this.q = i9;
            this.p = this.d;
            this.r = 0;
        } else {
            this.s = 0;
            this.q = this.d;
            this.p = i9;
            this.r = i3;
        }
        int i11 = this.d;
        if (z2) {
            j3 = (i11 << 32) | (i9 & 4294967295L);
        } else {
            j3 = (i11 & 4294967295L) | (i9 << 32);
        }
        this.w = j3;
        this.x = 0L;
        this.y = -1;
        this.z = -1;
    }

    @Override // defpackage.wh6
    public final int a() {
        return this.r;
    }

    @Override // defpackage.wh6
    public final int b() {
        return this.n;
    }

    @Override // defpackage.wh6
    public final int c() {
        return this.q;
    }

    @Override // defpackage.wh6
    public final long d() {
        return this.l;
    }

    @Override // defpackage.wh6
    public final List e() {
        return this.h;
    }

    @Override // defpackage.wh6
    public final int f() {
        return this.s;
    }

    @Override // defpackage.wh6
    public final long g(int i) {
        return this.x;
    }

    @Override // defpackage.wh6
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.wh6
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.wh6
    public final int h() {
        return this.m;
    }

    @Override // defpackage.wh6
    public final int i() {
        return this.p;
    }

    @Override // defpackage.wh6
    public final void j() {
        this.A = true;
    }

    @Override // defpackage.wh6
    public final void k(int i, int i2, int i3, int i4) {
        o(i, i2, i3, i4, -1, -1);
    }

    public final int l(long j) {
        long j2;
        if (this.c) {
            j2 = j & 4294967295L;
        } else {
            j2 = j >> 32;
        }
        return (int) j2;
    }

    public final int m() {
        int i;
        int i2;
        if (this.c) {
            i = this.q;
            i2 = this.s;
        } else {
            i = this.p;
            i2 = this.r;
        }
        return i + i2;
    }

    public final void n(lw8 lw8Var, boolean z) {
        int i;
        p15 p15Var;
        long j;
        if (this.t == Integer.MIN_VALUE) {
            ov5.a("position() should be called first");
        }
        List list = this.h;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mw8 mw8Var = (mw8) list.get(i2);
            int i3 = this.u;
            boolean z2 = this.c;
            if (z2) {
                i = mw8Var.b;
            } else {
                i = mw8Var.a;
            }
            int i4 = i3 - i;
            int i5 = this.v;
            long j2 = this.x;
            mh6 a = this.k.a(i2, this.b);
            if (a != null) {
                if (z) {
                    a.n = j2;
                } else {
                    if (!py5.b(a.n, 9223372034707292159L)) {
                        j = a.n;
                    } else {
                        j = j2;
                    }
                    long d = py5.d(j, ((py5) a.r.getValue()).a);
                    if ((l(j2) <= i4 && l(d) <= i4) || (l(j2) >= i5 && l(d) >= i5)) {
                        a.b();
                    }
                    j2 = d;
                }
                p15Var = a.o;
            } else {
                p15Var = null;
            }
            long d2 = py5.d(j2, this.i);
            if (!z && a != null) {
                a.m = d2;
            }
            if (z2) {
                if (p15Var != null) {
                    lw8Var.getClass();
                    lw8.a(lw8Var, mw8Var);
                    mw8Var.z0(py5.d(d2, mw8Var.e), nae.e, p15Var);
                } else {
                    lw8.M(lw8Var, mw8Var, d2, null, 6);
                }
            } else if (p15Var != null) {
                lw8.H(lw8Var, mw8Var, d2, p15Var);
            } else {
                lw8.F(lw8Var, mw8Var, d2);
            }
        }
    }

    public final void o(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        long j;
        long j2;
        boolean z = this.c;
        if (z) {
            i7 = i4;
        } else {
            i7 = i3;
        }
        this.t = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.e == tc6.b) {
            i2 = (i3 - i2) - this.d;
        }
        if (z) {
            j = i2 << 32;
            j2 = i;
        } else {
            j = i << 32;
            j2 = i2;
        }
        this.x = (j2 & 4294967295L) | j;
        this.y = i5;
        this.z = i6;
        this.u = -this.f;
        this.v = i7 + this.g;
    }
}
