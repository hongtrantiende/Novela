package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zja  reason: default package */
/* loaded from: classes.dex */
public final class zja {
    public final float a;
    public rk9 c;
    public float e;
    public rk9 g;
    public rk9 h;
    public final float b = (((-Math.abs(-75.0f)) + 90.0f) / 180.0f) * 3.1415927f;
    public long d = 0;
    public long f = 9205357640488583168L;

    public zja(float f) {
        this.a = f;
        rk9 rk9Var = rk9.e;
        this.g = rk9Var;
        this.h = rk9Var;
    }

    public final void a() {
        if (!this.h.l()) {
            rk9 rk9Var = this.c;
            if (rk9Var == null) {
                rk9Var = this.h;
            }
            this.g = rk9Var;
            this.f = y78.j(this.h.j() ^ (-9223372034707292160L), this.g.f());
            long h = this.g.h();
            if (!dna.a(this.d, h)) {
                this.d = h;
                float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32)) / 2.0f;
                float sqrt = (float) Math.sqrt(((float) Math.pow(intBitsToFloat, 2.0d)) + ((float) Math.pow(Float.intBitsToFloat((int) (this.d & 4294967295L)) / 2.0f, 2.0d)));
                this.e = (((float) Math.cos(((float) Math.acos(intBitsToFloat / sqrt)) - this.b)) * sqrt * 2.0f) + this.a;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zja.class == obj.getClass()) {
            zja zjaVar = (zja) obj;
            if (this.a == zjaVar.a && this.b == zjaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
