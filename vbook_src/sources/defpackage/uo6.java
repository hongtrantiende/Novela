package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uo6  reason: default package */
/* loaded from: classes.dex */
public final class uo6 implements np4 {
    public final float a;

    public uo6(float f) {
        this.a = f;
    }

    @Override // defpackage.np4
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.np4
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof uo6) && Float.compare(this.a, ((uo6) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return a82.k("LinearFontScaleConverter(fontScale=", this.a, ")");
    }
}
