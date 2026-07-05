package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ik6  reason: default package */
/* loaded from: classes.dex */
public final class ik6 implements wh6 {
    public final int a;
    public final Object b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Object i;
    public final qh6 j;
    public final long k;
    public boolean l = true;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public final long v;
    public long w;

    public ik6(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, qh6 qh6Var, long j) {
        int i7;
        int i8;
        int i9;
        int i10;
        long j2;
        this.a = i;
        this.b = obj;
        this.c = list;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = obj2;
        this.j = qh6Var;
        this.k = j;
        int i11 = 1;
        if (list.isEmpty()) {
            i7 = 0;
        } else {
            mw8 mw8Var = (mw8) list.get(0);
            if (z) {
                i7 = mw8Var.b;
            } else {
                i7 = mw8Var.a;
            }
            int size = list.size() - 1;
            if (1 <= size) {
                int i12 = 1;
                while (true) {
                    mw8 mw8Var2 = (mw8) list.get(i12);
                    if (this.d) {
                        i8 = mw8Var2.b;
                    } else {
                        i8 = mw8Var2.a;
                    }
                    i7 = i8 > i7 ? i8 : i7;
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
        }
        this.m = i7;
        List list2 = this.c;
        if (list2.isEmpty()) {
            i9 = 0;
        } else {
            mw8 mw8Var3 = (mw8) list2.get(0);
            if (this.d) {
                i9 = mw8Var3.a;
            } else {
                i9 = mw8Var3.b;
            }
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                while (true) {
                    mw8 mw8Var4 = (mw8) list2.get(i11);
                    if (this.d) {
                        i10 = mw8Var4.a;
                    } else {
                        i10 = mw8Var4.b;
                    }
                    i9 = i10 > i9 ? i10 : i9;
                    if (i11 == size2) {
                        break;
                    }
                    i11++;
                }
            }
        }
        this.r = Integer.MIN_VALUE;
        boolean z2 = this.d;
        if (z2) {
            this.q = i2;
            this.o = this.m;
            this.n = i9;
            this.p = 0;
        } else {
            this.q = 0;
            this.o = i9;
            this.n = this.m;
            this.p = i2;
        }
        int i13 = this.m;
        if (z2) {
            j2 = (i13 & 4294967295L) | (i9 << 32);
        } else {
            j2 = (i13 << 32) | (i9 & 4294967295L);
        }
        this.v = j2;
        this.w = 0L;
    }

    @Override // defpackage.wh6
    public final int a() {
        return this.p;
    }

    @Override // defpackage.wh6
    public final int b() {
        return this.f;
    }

    @Override // defpackage.wh6
    public final int c() {
        return this.o;
    }

    @Override // defpackage.wh6
    public final long d() {
        return this.k;
    }

    @Override // defpackage.wh6
    public final List e() {
        return this.c;
    }

    @Override // defpackage.wh6
    public final int f() {
        return this.q;
    }

    @Override // defpackage.wh6
    public final long g(int i) {
        return this.w;
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
        return this.e;
    }

    @Override // defpackage.wh6
    public final int i() {
        return this.n;
    }

    @Override // defpackage.wh6
    public final void j() {
        this.u = true;
    }

    @Override // defpackage.wh6
    public final void k(int i, int i2, int i3, int i4) {
        if (this.d) {
            i3 = i4;
        }
        o(i, i2, i3);
    }

    public final int l(long j) {
        long j2;
        if (this.d) {
            j2 = j & 4294967295L;
        } else {
            j2 = j >> 32;
        }
        return (int) j2;
    }

    public final int m() {
        long j;
        long j2 = this.w;
        if (!this.d) {
            j = j2 >> 32;
        } else {
            j = j2 & 4294967295L;
        }
        return (int) j;
    }

    public final int n() {
        int i;
        int i2;
        if (this.d) {
            i = this.o;
            i2 = this.q;
        } else {
            i = this.n;
            i2 = this.p;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void o(int i, int i2, int i3) {
        long j;
        this.r = i3;
        this.s = -this.g;
        this.t = i3 + this.h;
        if (this.d) {
            j = (i2 << 32) | (4294967295L & i);
        } else {
            j = (i2 & 4294967295L) | (i << 32);
        }
        this.w = j;
    }
}
