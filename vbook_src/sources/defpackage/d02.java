package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d02  reason: default package */
/* loaded from: classes.dex */
public final class d02 implements a5a, m4a {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public d02(long j, long j2, int i, int i2, boolean z, boolean z2) {
        int i3;
        this.a = j;
        this.b = j2;
        if (i2 == -1) {
            i3 = 1;
        } else {
            i3 = i2;
        }
        this.c = i3;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / i;
        }
        this.i = j2;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = j == -1 ? -1L : j;
    }

    @Override // defpackage.a5a
    public final long a() {
        return this.m;
    }

    @Override // defpackage.a5a
    public final long b(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // defpackage.m4a
    public final boolean c() {
        if (this.d == -1 && !this.g) {
            return false;
        }
        return true;
    }

    @Override // defpackage.m4a
    public final boolean d() {
        return this.h;
    }

    @Override // defpackage.m4a
    public final l4a e(long j) {
        long j2 = this.d;
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        long j3 = this.b;
        if (i == 0 && !this.g) {
            p4a p4aVar = new p4a(0L, j3);
            return new l4a(p4aVar, p4aVar);
        }
        int i2 = this.e;
        long j4 = this.c;
        long j5 = (((i2 * j) / 8000000) / j4) * j4;
        if (i != 0) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i2;
        p4a p4aVar2 = new p4a(max2, max);
        if (i != 0 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new l4a(p4aVar2, new p4a((Math.max(0L, j6 - j3) * 8000000) / i2, j6));
            }
        }
        return new l4a(p4aVar2, p4aVar2);
    }

    @Override // defpackage.a5a
    public final int f() {
        return this.j;
    }

    @Override // defpackage.m4a
    public final long g() {
        return this.f;
    }
}
