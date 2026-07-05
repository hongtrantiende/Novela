package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pv5  reason: default package */
/* loaded from: classes.dex */
public abstract class pv5 {
    public static final long a = a(Float.NaN, Float.NaN);
    public static final /* synthetic */ int b = 0;

    public static long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String b(long j) {
        return a82.l("InlineDensity(density=", Float.intBitsToFloat((int) (j >> 32)), ", fontScale=", Float.intBitsToFloat((int) (j & 4294967295L)), ")");
    }
}
