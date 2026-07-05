package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oi0  reason: default package */
/* loaded from: classes.dex */
public final class oi0 {
    public final float a;

    public /* synthetic */ oi0(float f) {
        this.a = f;
    }

    public static final boolean a(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oi0) {
            if (Float.compare(this.a, ((oi0) obj).a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return a82.k("BaselineShift(multiplier=", this.a, ")");
    }
}
