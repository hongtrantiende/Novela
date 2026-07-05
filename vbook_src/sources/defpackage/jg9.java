package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jg9  reason: default package */
/* loaded from: classes.dex */
public final class jg9 implements kg9 {
    public final double a;

    public jg9(double d) {
        this.a = d;
    }

    @Override // defpackage.kg9
    public final float c(float f) {
        return (float) ch0.t(f, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jg9) && Double.compare(this.a, ((jg9) obj).a) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kg9
    public final float h(float f) {
        return (float) ch0.t(f, 1.0d / this.a);
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "GammaTransferFunctions(gamma=" + this.a + ')';
    }
}
