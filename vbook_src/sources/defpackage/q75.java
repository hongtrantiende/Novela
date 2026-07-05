package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q75  reason: default package */
/* loaded from: classes.dex */
public final class q75 extends v75 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final zk3 q;
    public final qs5 r;
    public final qs5 s;
    public final rm9 t;
    public final long u;
    public final p75 v;
    public final qs5 w;
    public final n75 x;

    public q75(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, zk3 zk3Var, List list2, List list3, p75 p75Var, Map map, List list4, n75 n75Var) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = zk3Var;
        this.r = qs5.l(list2);
        this.s = qs5.l(list3);
        this.t = rm9.b(map);
        this.w = qs5.l(list4);
        this.x = n75Var;
        if (!list3.isEmpty()) {
            l75 l75Var = (l75) yf2.t(list3);
            this.u = l75Var.e + l75Var.c;
        } else if (!list2.isEmpty()) {
            n75 n75Var2 = (n75) yf2.t(list2);
            this.u = n75Var2.e + n75Var2.c;
        } else {
            this.u = 0L;
        }
        long j6 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            long j7 = this.u;
            if (i4 >= 0) {
                j6 = Math.min(j7, j);
            } else {
                j6 = Math.max(0L, j7 + j);
            }
        }
        this.e = j6;
        this.f = j >= 0;
        this.v = p75Var;
    }

    @Override // defpackage.df4
    public final Object a(List list) {
        return this;
    }
}
