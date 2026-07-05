package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uj1  reason: default package */
/* loaded from: classes.dex */
public final class uj1 extends kr4 {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public uj1(aac aacVar, long j, long j2) {
        super(aacVar);
        long max;
        int i = (j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1));
        if (i != 0 && j2 < j) {
            throw new vj1(j, j2, 2);
        }
        boolean z = false;
        if (aacVar.h() == 1) {
            z9c m = aacVar.m(0, new z9c(), 0L);
            long max2 = Math.max(0L, j);
            if (!m.j && max2 != 0 && !m.g) {
                throw new vj1(1);
            }
            if (i == 0) {
                max = m.l;
            } else {
                max = Math.max(0L, j2);
            }
            long j3 = m.l;
            int i2 = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
            if (i2 != 0) {
                max = max > j3 ? j3 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.c = max2;
            this.d = max;
            int i3 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            this.e = i3 != 0 ? max - max2 : -9223372036854775807L;
            if (m.h && (i3 == 0 || (i2 != 0 && max == j3))) {
                z = true;
            }
            this.f = z;
            return;
        }
        throw new vj1(0);
    }

    @Override // defpackage.kr4, defpackage.aac
    public final y9c f(int i, y9c y9cVar, boolean z) {
        this.b.f(0, y9cVar, z);
        long j = y9cVar.e - this.c;
        long j2 = this.e;
        long j3 = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j3 = j2 - j;
        }
        y9cVar.h(y9cVar.a, y9cVar.b, 0, j3, j, c7.c, false);
        return y9cVar;
    }

    @Override // defpackage.kr4, defpackage.aac
    public final z9c m(int i, z9c z9cVar, long j) {
        this.b.m(0, z9cVar, 0L);
        long j2 = z9cVar.o;
        long j3 = this.c;
        z9cVar.o = j2 + j3;
        z9cVar.l = this.e;
        z9cVar.h = this.f;
        long j4 = z9cVar.k;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            z9cVar.k = max;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            z9cVar.k = max - j3;
        }
        long e0 = a2d.e0(j3);
        long j6 = z9cVar.d;
        if (j6 != -9223372036854775807L) {
            z9cVar.d = j6 + e0;
        }
        long j7 = z9cVar.e;
        if (j7 != -9223372036854775807L) {
            z9cVar.e = j7 + e0;
        }
        return z9cVar;
    }
}
