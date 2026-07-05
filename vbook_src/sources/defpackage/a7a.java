package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a7a  reason: default package */
/* loaded from: classes.dex */
public abstract class a7a {
    public static final k8a a = new k8a("SelectionHandleInfo");

    public static final long a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
