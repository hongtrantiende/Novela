package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ck6  reason: default package */
/* loaded from: classes.dex */
public final class ck6 {
    public final nk6 a;
    public final vu7 b;
    public final xj6 c;
    public final lk6 d;
    public final long e;
    public final boolean f;
    public final vh6 g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final m82 m;
    public final boolean n;
    public final List o;
    public final m15 p;
    public final bk6 q;
    public final kj r;
    public final int s;

    public ck6(nk6 nk6Var, vu7 vu7Var, xj6 xj6Var, lk6 lk6Var, long j, boolean z, vh6 vh6Var, int i, long j2, int i2, int i3, int i4, m82 m82Var, boolean z2, List list, m15 m15Var) {
        this.a = nk6Var;
        this.b = vu7Var;
        this.c = xj6Var;
        this.d = lk6Var;
        this.e = j;
        this.f = z;
        this.g = vh6Var;
        this.h = i;
        this.i = j2;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = m82Var;
        this.n = z2;
        this.o = list;
        this.p = m15Var;
        this.q = new bk6(this, z, xj6Var, vh6Var, lk6Var);
        this.r = nk6Var.e;
        this.s = lk6Var.b.length;
    }

    public final long a(xj6 xj6Var, int i, int i2) {
        int i3;
        boolean X = xj6Var.b.h.X(i);
        if (X) {
            i3 = this.s;
        } else {
            i3 = 1;
        }
        if (X) {
            i2 = 0;
        }
        return (i2 << 32) | ((i3 + i2) & 4294967295L);
    }
}
