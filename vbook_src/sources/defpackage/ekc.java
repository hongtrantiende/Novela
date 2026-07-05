package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ekc  reason: default package */
/* loaded from: classes.dex */
public abstract class ekc {
    public static final mfb a = new mfb(new a1c(14));

    public static final long a(float f, float f2) {
        long floatToIntBits = (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = dkc.b;
        return floatToIntBits;
    }

    public static final long b() {
        int i = dkc.b;
        return ((dkc) a.getValue()).a;
    }

    public static final String c(long j) {
        StringBuilder sb = new StringBuilder();
        int i = dkc.b;
        sb.append(yz1.k(2, Float.intBitsToFloat((int) (j >> 32))));
        sb.append('x');
        sb.append(yz1.k(2, Float.intBitsToFloat((int) (j & 4294967295L))));
        return sb.toString();
    }
}
