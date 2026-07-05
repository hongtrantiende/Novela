package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kk0  reason: default package */
/* loaded from: classes3.dex */
public final class kk0 implements dc {
    public final float a;

    public kk0(float f) {
        this.a = f;
    }

    @Override // defpackage.dc
    public final long a(long j, long j2, tc6 tc6Var) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = 1.0f + this.a;
        float f2 = (((int) (j3 & 4294967295L)) / 2.0f) * nae.e;
        int round = Math.round(f * (((int) (j3 >> 32)) / 2.0f));
        return (Math.round(f2) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof kk0) || Float.compare(this.a, ((kk0) obj).a) != 0 || Float.compare(-1.0f, -1.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a82.k("BiasAbsoluteAlignment(horizontalBias=", this.a, ", verticalBias=-1.0)");
    }
}
