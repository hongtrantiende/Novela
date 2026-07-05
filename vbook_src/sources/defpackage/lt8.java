package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lt8  reason: default package */
/* loaded from: classes.dex */
public final class lt8 implements z72, kx5 {
    public final float a;

    public lt8(float f) {
        this.a = f;
        if (f >= nae.e && f <= 100.0f) {
            return;
        }
        ov5.a("The percent should be in the range of [0, 100]");
    }

    @Override // defpackage.z72
    public final float a(long j, r13 r13Var) {
        return (this.a / 100.0f) * dna.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lt8) && Float.compare(this.a, ((lt8) obj).a) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kx5
    public final Object g() {
        return this.a + "%";
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return a82.k("CornerSize(size = ", this.a, "%)");
    }
}
