package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cs5  reason: default package */
/* loaded from: classes3.dex */
public final class cs5 {
    public static final cs5 d = new cs5((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L), (Float.floatToRawIntBits(0.5f) & 4294967295L) | (Float.floatToRawIntBits(0.5f) << 32), 0);
    public final int a;
    public final long b;
    public final long c;

    public cs5(long j, long j2, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public static cs5 a(cs5 cs5Var, int i, long j, int i2) {
        if ((i2 & 1) != 0) {
            i = cs5Var.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            j = cs5Var.b;
        }
        long j2 = cs5Var.c;
        cs5Var.getClass();
        return new cs5(j, j2, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cs5) {
                cs5 cs5Var = (cs5) obj;
                if (this.a != cs5Var.a || !y78.d(this.b, cs5Var.b) || !y78.d(this.c, cs5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + hl5.c(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String l = y78.l(this.b);
        return s21.q(s21.r("ImgTransform(angleDeg=", this.a, ", scale=", l, ", pivotRel="), y78.l(this.c), ")");
    }
}
