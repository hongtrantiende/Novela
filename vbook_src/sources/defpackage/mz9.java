package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mz9  reason: default package */
/* loaded from: classes.dex */
public abstract class mz9 {
    public static final mfb a = new mfb(new zt9(14));

    public static final long a(float f, float f2) {
        long floatToIntBits = (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = lz9.c;
        return floatToIntBits;
    }

    public static final long b() {
        int i = lz9.c;
        return ((lz9) a.getValue()).a;
    }

    public static final long c(long j, long j2) {
        return ctd.p(lz9.b(j2) * mna.b(j), lz9.c(j2) * mna.a(j));
    }

    public static final String d(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(yz1.k(2, lz9.b(j)));
        sb.append('x');
        sb.append(yz1.k(2, lz9.c(j)));
        return sb.toString();
    }
}
