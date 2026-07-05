package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qv2  reason: default package */
/* loaded from: classes.dex */
public final class qv2 implements xr7 {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qv2) || Float.compare(1.2f, 1.2f) != 0 || Float.compare(0.3f, 0.3f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(0.3f) + (Float.hashCode(1.2f) * 31);
    }

    public final String toString() {
        return "DefaultMouseWheelScaleCalculator(stepScrollDelta=1.2, stepScaleFactor=0.3)";
    }
}
