package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ll8  reason: default package */
/* loaded from: classes.dex */
public final class ll8 {
    public final tj a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public ll8(tj tjVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = tjVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final rk9 a(rk9 rk9Var) {
        return rk9Var.o((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(boolean z, long j) {
        if (z) {
            long j2 = fxb.b;
            if (fxb.c(j, j2)) {
                return j2;
            }
        }
        int i = fxb.c;
        int i2 = this.b;
        return sze.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final rk9 c(rk9 rk9Var) {
        return rk9Var.o((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(-this.f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return dce.n(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ll8) {
                ll8 ll8Var = (ll8) obj;
                if (this.a == ll8Var.a && this.b == ll8Var.b && this.c == ll8Var.c && this.d == ll8Var.d && this.e == ll8Var.e && Float.compare(this.f, ll8Var.f) == 0 && Float.compare(this.g, ll8Var.g) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + nk2.d(this.f, hl5.a(this.e, hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        rs8.q(this.c, this.d, ", startLineIndex=", ", endLineIndex=", sb);
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
