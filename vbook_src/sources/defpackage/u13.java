package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u13  reason: default package */
/* loaded from: classes.dex */
public final class u13 implements r13 {
    public final float a;
    public final float b;

    public u13(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u13)) {
            return false;
        }
        u13 u13Var = (u13) obj;
        if (Float.compare(this.a, u13Var.a) == 0 && Float.compare(this.b, u13Var.b) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.r13
    public final float f() {
        return this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a82.l("DensityImpl(density=", this.a, ", fontScale=", this.b, ")");
    }
}
