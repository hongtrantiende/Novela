package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lod  reason: default package */
/* loaded from: classes.dex */
public final class lod implements a5a {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public lod(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.a5a
    public final long a() {
        return this.f;
    }

    @Override // defpackage.a5a
    public final long b(long j) {
        long j2;
        double d;
        long j3 = j - this.a;
        if (c() && j3 > this.b) {
            long[] jArr = this.g;
            jArr.getClass();
            double d2 = (j3 * 256.0d) / this.e;
            int f = a2d.f(jArr, (long) d2, true);
            long j4 = this.c;
            long j5 = (f * j4) / 100;
            long j6 = jArr[f];
            int i = f + 1;
            long j7 = (j4 * i) / 100;
            if (f == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j6 == j2) {
                d = 0.0d;
            } else {
                d = (d2 - j6) / (j2 - j6);
            }
            return Math.round(d * (j7 - j5)) + j5;
        }
        return 0L;
    }

    @Override // defpackage.m4a
    public final boolean c() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.m4a
    public final l4a e(long j) {
        double d;
        double d2;
        boolean c = c();
        int i = this.b;
        long j2 = this.a;
        if (!c) {
            p4a p4aVar = new p4a(0L, j2 + i);
            return new l4a(p4aVar, p4aVar);
        }
        long j3 = a2d.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.e;
        p4a p4aVar2 = new p4a(j3, j2 + a2d.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new l4a(p4aVar2, p4aVar2);
    }

    @Override // defpackage.a5a
    public final int f() {
        return this.d;
    }

    @Override // defpackage.m4a
    public final long g() {
        return this.c;
    }
}
