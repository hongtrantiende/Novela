package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mt7  reason: default package */
/* loaded from: classes.dex */
public abstract class mt7 {
    public static final long a = zr1.q(14);

    public static final long a(long j, long j2) {
        if (e4c.d(j2)) {
            if (!e4c.d(j)) {
                long j3 = j & 1095216660480L;
                if (j3 == 0) {
                    float c = e4c.c(j2);
                    long j4 = a;
                    zr1.k(j4);
                    return zr1.x(e4c.c(j4) * c, 1095216660480L & j4);
                }
                float c2 = e4c.c(j2);
                zr1.k(j);
                return zr1.x(e4c.c(j) * c2, j3);
            }
            vs.k(hl5.n("Cannot convert Em to Px when style.fontSize is Em (", e4c.e(j2), "). Please declare the style.fontSize with Sp units instead."));
            return 0L;
        }
        vs.m(hl5.n("The multiplier must be in em, but was ", e4c.e(j2), "."));
        return 0L;
    }
}
