package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zjc  reason: default package */
/* loaded from: classes.dex */
public final class zjc {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
        int i = kz9.c;
        int i2 = ckc.c;
        mfb mfbVar = yw1.a;
        new zjc(floatToRawIntBits, 0L, nae.e, ((ckc) mfbVar.getValue()).a, ((ckc) mfbVar.getValue()).a);
    }

    public zjc(long j, long j2, float f, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
        if (j != kz9.b && (9223372034707292159L & j2) != 9205357640488583168L) {
            return;
        }
        vs.m("ScaleFactorCompat and OffsetCompat must be specified at the same time");
        throw null;
    }

    public final float a() {
        return Float.intBitsToFloat((int) (this.a >> 32));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zjc) {
                zjc zjcVar = (zjc) obj;
                long j = zjcVar.a;
                int i = kz9.c;
                if (this.a == j && y78.d(this.b, zjcVar.b) && Float.compare(this.c, zjcVar.c) == 0 && ckc.a(this.d, zjcVar.d) && ckc.a(this.e, zjcVar.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = kz9.c;
        int d = nk2.d(this.c, hl5.c(Long.hashCode(this.a) * 31, this.b, 31), 31);
        int i2 = ckc.c;
        return Long.hashCode(this.e) + hl5.c(d, this.d, 31);
    }

    public final String toString() {
        String b = yw1.b(this.a);
        String d = yw1.d(this.b);
        String c = yw1.c(this.d);
        String c2 = yw1.c(this.e);
        StringBuilder y = nk2.y("Transform(scale=", b, ", offset=", d, ", rotation=");
        y.append(this.c);
        y.append(", scaleOrigin=");
        y.append(c);
        y.append(", rotationOrigin=");
        return s21.q(y, c2, ")");
    }
}
