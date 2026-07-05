package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yw1  reason: default package */
/* loaded from: classes.dex */
public abstract class yw1 {
    public static final mfb a;

    static {
        new mfb(new cd1(16));
        a = new mfb(new cd1(17));
    }

    public static final boolean a(long j) {
        if (((int) (j >> 32)) > 0 && ((int) (j & 4294967295L)) > 0) {
            return false;
        }
        return true;
    }

    public static final String b(long j) {
        float m = jye.m(2, Float.intBitsToFloat((int) (j >> 32)));
        float m2 = jye.m(2, Float.intBitsToFloat((int) (j & 4294967295L)));
        return m + "x" + m2;
    }

    public static final String c(long j) {
        float m = jye.m(2, ckc.b(j));
        float m2 = jye.m(2, ckc.c(j));
        return m + "x" + m2;
    }

    public static final String d(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            float m = jye.m(2, Float.intBitsToFloat((int) (j >> 32)));
            float m2 = jye.m(2, Float.intBitsToFloat((int) (j & 4294967295L)));
            return m + "x" + m2;
        }
        return "Unspecified";
    }

    public static final String e(long j) {
        return ((int) (j >> 32)) + "x" + ((int) (j & 4294967295L));
    }
}
