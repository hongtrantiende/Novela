package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pu9  reason: default package */
/* loaded from: classes.dex */
public final class pu9 implements wc2 {
    @Override // defpackage.wc2
    public final yj a(rk9 rk9Var) {
        rk9Var.getClass();
        float g = (rk9Var.g() * 15.0f) / 100.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(g) << 32) | (Float.floatToRawIntBits(g) & 4294967295L);
        yj a = dk.a();
        float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        float f = rk9Var.a;
        float f2 = rk9Var.b;
        float f3 = rk9Var.c;
        float f4 = rk9Var.d;
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        yj.d(a, new ou9(f, f2, f3, f4, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2));
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof pu9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(15);
    }

    public final String toString() {
        return "RoundRectCropShape(cornersPercent=15)";
    }
}
