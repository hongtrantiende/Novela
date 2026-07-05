package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ok0  reason: default package */
/* loaded from: classes.dex */
public final class ok0 {
    public final float a;
    public final float b;

    public ok0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final long a(long j, long j2, boolean z) {
        int i = az5.c;
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        float f3 = this.a;
        if (!z) {
            f3 *= -1.0f;
        }
        return uaf.e(k27.A((f3 + 1.0f) * f), k27.A((1.0f + this.b) * f2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok0)) {
            return false;
        }
        ok0 ok0Var = (ok0) obj;
        if (Float.compare(this.a, ok0Var.a) == 0 && Float.compare(this.b, ok0Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignmentCompat(horizontalBias=" + this.a + ", verticalBias=" + this.b + ')';
    }
}
