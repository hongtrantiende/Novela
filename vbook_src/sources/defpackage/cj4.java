package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cj4  reason: default package */
/* loaded from: classes.dex */
public final class cj4 implements ri4 {
    public final int a;
    public final mn3 b;
    public final long c;
    public final long d;

    public cj4(int i, int i2, mn3 mn3Var) {
        this.a = i;
        this.b = mn3Var;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.ri4
    public final float b(long j, float f, float f2, float f3) {
        long j2;
        long j3 = j - this.d;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.c;
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 == 0) {
            return f3;
        }
        return (e(j2, f, f2, f3) - e(j2 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.ri4
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // defpackage.ri4
    public final float e(long j, float f, float f2, float f3) {
        float f4;
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        if (this.a == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) j2) / ((float) j3);
        }
        float f5 = this.b.f(f4);
        return (f2 * f5) + ((1.0f - f5) * f);
    }
}
