package defpackage;

import android.os.SystemClock;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ly8  reason: default package */
/* loaded from: classes.dex */
public final class ly8 {
    public static final e67 u = new e67(new Object());
    public final aac a;
    public final e67 b;
    public final long c;
    public final long d;
    public final int e;
    public final pz3 f;
    public final boolean g;
    public final bjc h;
    public final ljc i;
    public final List j;
    public final e67 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final my8 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public ly8(aac aacVar, e67 e67Var, long j, long j2, int i, pz3 pz3Var, boolean z, bjc bjcVar, ljc ljcVar, List list, e67 e67Var2, boolean z2, int i2, int i3, my8 my8Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = aacVar;
        this.b = e67Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = pz3Var;
        this.g = z;
        this.h = bjcVar;
        this.i = ljcVar;
        this.j = list;
        this.k = e67Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = my8Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static ly8 k(ljc ljcVar) {
        x9c x9cVar = aac.a;
        bjc bjcVar = bjc.d;
        mm9 mm9Var = mm9.e;
        my8 my8Var = my8.d;
        e67 e67Var = u;
        return new ly8(x9cVar, e67Var, -9223372036854775807L, 0L, 1, null, false, bjcVar, ljcVar, mm9Var, e67Var, false, 1, 0, my8Var, 0L, 0L, 0L, 0L, false);
    }

    public final ly8 a() {
        return new ly8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final ly8 b(boolean z) {
        return new ly8(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ly8 c(e67 e67Var) {
        return new ly8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, e67Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ly8 d(e67 e67Var, long j, long j2, long j3, long j4, bjc bjcVar, ljc ljcVar, List list) {
        return new ly8(this.a, e67Var, j2, j3, this.e, this.f, this.g, bjcVar, ljcVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final ly8 e(int i, int i2, boolean z) {
        return new ly8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ly8 f(pz3 pz3Var) {
        return new ly8(this.a, this.b, this.c, this.d, this.e, pz3Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ly8 g(my8 my8Var) {
        return new ly8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, my8Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final ly8 h(int i) {
        return new ly8(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ly8 i(boolean z) {
        return new ly8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final ly8 j(aac aacVar) {
        return new ly8(aacVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return a2d.Q(a2d.e0(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.o.a));
    }

    public final boolean m() {
        if (this.e == 3 && this.l && this.n == 0) {
            return true;
        }
        return false;
    }
}
