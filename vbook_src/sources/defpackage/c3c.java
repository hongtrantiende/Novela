package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c3c  reason: default package */
/* loaded from: classes3.dex */
public final class c3c {
    public static float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static long c(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
