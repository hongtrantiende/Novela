package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gj6  reason: default package */
/* loaded from: classes.dex */
public final class gj6 implements wh6 {
    public final int[] A;
    public final int a;
    public final List b;
    public final boolean c;
    public final lk0 d;
    public final mk0 e;
    public final tc6 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final qh6 n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public boolean w;
    public int x = Integer.MIN_VALUE;
    public int y;
    public int z;

    public gj6(int i, List list, boolean z, lk0 lk0Var, mk0 mk0Var, tc6 tc6Var, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, qh6 qh6Var, long j2) {
        int i5;
        int i6;
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = lk0Var;
        this.e = mk0Var;
        this.f = tc6Var;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = qh6Var;
        this.o = j2;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            mw8 mw8Var = (mw8) list.get(i9);
            boolean z3 = this.c;
            if (z3) {
                i5 = mw8Var.b;
            } else {
                i5 = mw8Var.a;
            }
            i7 += i5;
            if (!z3) {
                i6 = mw8Var.b;
            } else {
                i6 = mw8Var.a;
            }
            i8 = Math.max(i8, i6);
        }
        this.q = i7;
        this.v = i8;
        this.A = new int[this.b.size() * 2];
        if (this.c) {
            this.u = this.j;
            this.s = i7;
            this.r = i8;
            this.t = 0;
            return;
        }
        this.u = 0;
        this.s = i8;
        this.r = i7;
        this.t = this.j;
    }

    @Override // defpackage.wh6
    public final int a() {
        return this.t;
    }

    @Override // defpackage.wh6
    public final int b() {
        return 1;
    }

    @Override // defpackage.wh6
    public final int c() {
        return this.s;
    }

    @Override // defpackage.wh6
    public final long d() {
        return this.o;
    }

    @Override // defpackage.wh6
    public final List e() {
        return this.b;
    }

    @Override // defpackage.wh6
    public final int f() {
        return this.u;
    }

    @Override // defpackage.wh6
    public final long g(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.p;
            if (this.c) {
                return i2 & 4294967295L;
            }
            return i2 << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.A;
        int i4 = iArr[i3];
        return (iArr[i3 + 1] & 4294967295L) | (i4 << 32);
    }

    @Override // defpackage.wh6
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.wh6
    public final Object getKey() {
        return this.l;
    }

    @Override // defpackage.wh6
    public final int h() {
        return 0;
    }

    @Override // defpackage.wh6
    public final int i() {
        return this.r;
    }

    @Override // defpackage.wh6
    public final void j() {
        this.w = true;
    }

    @Override // defpackage.wh6
    public final void k(int i, int i2, int i3, int i4) {
        o(i, i3, i4);
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
            i = this.s;
            i2 = this.u;
        } else {
            i = this.r;
            i2 = this.t;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void n(lw8 lw8Var, boolean z) {
        int i;
        p15 p15Var;
        int i2;
        int i3;
        if (this.x == Integer.MIN_VALUE) {
            ov5.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            mw8 mw8Var = (mw8) list.get(i4);
            int i5 = this.y;
            boolean z2 = this.c;
            if (z2) {
                i = mw8Var.b;
            } else {
                i = mw8Var.a;
            }
            int i6 = i5 - i;
            int i7 = this.z;
            long g = g(i4);
            mh6 a = this.n.a(i4, this.l);
            if (a != null) {
                if (z) {
                    a.n = g;
                } else {
                    if (!py5.b(a.n, 9223372034707292159L)) {
                        g = a.n;
                    }
                    long d = py5.d(g, ((py5) a.r.getValue()).a);
                    if ((l(g) <= i6 && l(d) <= i6) || (l(g) >= i7 && l(d) >= i7)) {
                        a.b();
                    }
                    g = d;
                }
                p15Var = a.o;
            } else {
                p15Var = null;
            }
            if (this.g) {
                int i8 = this.x;
                if (z2) {
                    int i9 = (int) (g >> 32);
                    int i10 = i8 - ((int) (g & 4294967295L));
                    if (z2) {
                        i3 = mw8Var.b;
                    } else {
                        i3 = mw8Var.a;
                    }
                    g = (i9 << 32) | ((i10 - i3) & 4294967295L);
                } else {
                    int i11 = i8 - ((int) (g >> 32));
                    if (z2) {
                        i2 = mw8Var.b;
                    } else {
                        i2 = mw8Var.a;
                    }
                    g = ((i11 - i2) << 32) | (((int) (g & 4294967295L)) & 4294967295L);
                }
            }
            long d2 = py5.d(g, this.k);
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

    public final void o(int i, int i2, int i3) {
        int i4;
        int i5;
        this.p = i;
        boolean z = this.c;
        if (z) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.x = i4;
        List list = this.b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            mw8 mw8Var = (mw8) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.A;
            if (z) {
                lk0 lk0Var = this.d;
                if (lk0Var != null) {
                    iArr[i7] = lk0Var.a(mw8Var.a, i2, this.f);
                    iArr[i7 + 1] = i;
                    i5 = mw8Var.b;
                } else {
                    throw hl5.d("null horizontalAlignment when isVertical == true");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                mk0 mk0Var = this.e;
                if (mk0Var != null) {
                    iArr[i8] = mk0Var.a(mw8Var.b, i3);
                    i5 = mw8Var.a;
                } else {
                    throw hl5.d("null verticalAlignment when isVertical == false");
                }
            }
            i += i5;
        }
        this.y = -this.h;
        this.z = this.x + this.i;
    }
}
