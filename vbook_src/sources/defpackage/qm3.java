package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qm3  reason: default package */
/* loaded from: classes.dex */
public final class qm3 implements sz9 {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qm3) || Float.compare(3.0f, 3.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(3.0f);
    }

    @Override // defpackage.sz9
    public final rz9 j(long j, long j2, long j3, y22 y22Var, float f, float f2) {
        return twe.f(this, j, j2, j3, y22Var, f, f2);
    }

    @Override // defpackage.sz9
    public final rz9 n(long j, long j2, long j3, y22 y22Var, float f, float f2) {
        float f3;
        float max;
        y22Var.getClass();
        float f4 = f * 3.0f;
        if (y22Var.equals(x22.g)) {
            max = 3.0f * f4;
        } else {
            if (eh.r(j3)) {
                int i = az5.c;
                f3 = Math.max(((int) (j3 >> 32)) / ((int) (j2 >> 32)), ((int) (j3 & 4294967295L)) / ((int) (j2 & 4294967295L)));
            } else {
                f3 = 1.0f;
            }
            if (f2 <= f) {
                int i2 = az5.c;
                f2 = Math.max(f4, Math.max(Math.max(((int) (j >> 32)) / ((int) (j2 >> 32)), ((int) (j & 4294967295L)) / ((int) (j2 & 4294967295L))), f3));
            }
            max = Math.max(3.0f * f2, f3);
            f4 = f2;
        }
        return new rz9(f, f4, max);
    }

    public final String toString() {
        return "DynamicScalesCalculator(multiple=" + yz1.k(2, 3.0f) + ')';
    }
}
