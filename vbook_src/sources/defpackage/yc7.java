package defpackage;

import android.util.Pair;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yc7  reason: default package */
/* loaded from: classes.dex */
public final class yc7 implements a5a {
    public final long[] a;
    public final long[] b;
    public final long c;

    public yc7(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? a2d.Q(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair h(long j, long[] jArr, long[] jArr2) {
        double d;
        int f = a2d.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // defpackage.a5a
    public final long a() {
        return -1L;
    }

    @Override // defpackage.a5a
    public final long b(long j) {
        return a2d.Q(((Long) h(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.m4a
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m4a
    public final l4a e(long j) {
        Pair h = h(a2d.e0(a2d.j(j, 0L, this.c)), this.b, this.a);
        p4a p4aVar = new p4a(a2d.Q(((Long) h.first).longValue()), ((Long) h.second).longValue());
        return new l4a(p4aVar, p4aVar);
    }

    @Override // defpackage.a5a
    public final int f() {
        return -2147483647;
    }

    @Override // defpackage.m4a
    public final long g() {
        return this.c;
    }
}
