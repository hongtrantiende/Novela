package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ou9  reason: default package */
/* loaded from: classes.dex */
public final class ou9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        float intBitsToFloat = Float.intBitsToFloat(0);
        float intBitsToFloat2 = Float.intBitsToFloat(0);
        Float.floatToRawIntBits(intBitsToFloat);
        Float.floatToRawIntBits(intBitsToFloat2);
    }

    public ou9(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ou9) {
                ou9 ou9Var = (ou9) obj;
                if (Float.compare(this.a, ou9Var.a) != 0 || Float.compare(this.b, ou9Var.b) != 0 || Float.compare(this.c, ou9Var.c) != 0 || Float.compare(this.d, ou9Var.d) != 0 || !w92.s(this.e, ou9Var.e) || !w92.s(this.f, ou9Var.f) || !w92.s(this.g, ou9Var.g) || !w92.s(this.h, ou9Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + hl5.c(hl5.c(hl5.c(nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        String E = dce.E(this.a);
        String E2 = dce.E(this.b);
        String E3 = dce.E(this.c);
        String E4 = dce.E(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(E);
        sb.append(", ");
        sb.append(E2);
        sb.append(", ");
        sb.append(E3);
        String q = s21.q(sb, ", ", E4);
        long j = this.e;
        long j2 = this.f;
        boolean s = w92.s(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (s && w92.s(j2, j3) && w92.s(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return hl5.o("RoundRect(rect=", q, ", radius=", dce.E(Float.intBitsToFloat(i)), ")");
            }
            String E5 = dce.E(Float.intBitsToFloat(i));
            return s21.q(nk2.y("RoundRect(rect=", q, ", x=", E5, ", y="), dce.E(Float.intBitsToFloat(i2)), ")");
        }
        String y = w92.y(j);
        String y2 = w92.y(j2);
        String y3 = w92.y(j3);
        String y4 = w92.y(j4);
        StringBuilder y5 = nk2.y("RoundRect(rect=", q, ", topLeft=", y, ", topRight=");
        nk2.C(y5, y2, ", bottomRight=", y3, ", bottomLeft=");
        return s21.q(y5, y4, ")");
    }
}
