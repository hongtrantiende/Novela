package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nk0  reason: default package */
/* loaded from: classes.dex */
public final class nk0 implements dc {
    public final float a;
    public final float b;

    public nk0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.dc
    public final long a(long j, long j2, tc6 tc6Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        tc6 tc6Var2 = tc6.a;
        float f3 = this.a;
        if (tc6Var != tc6Var2) {
            f3 *= -1.0f;
        }
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round((1.0f + this.b) * f2) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk0)) {
            return false;
        }
        nk0 nk0Var = (nk0) obj;
        if (Float.compare(this.a, nk0Var.a) == 0 && Float.compare(this.b, nk0Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a82.l("BiasAlignment(horizontalBias=", this.a, ", verticalBias=", this.b, ")");
    }
}
