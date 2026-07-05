package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mea  reason: default package */
/* loaded from: classes.dex */
public final class mea {
    public static final mea f = new mea(nae.e, 0, 31);
    public final float a;
    public final long b;
    public final long c;
    public final float d;
    public final int e;

    public mea(float f2, long j, int i) {
        f2 = (i & 1) != 0 ? 24.0f : f2;
        long floatToRawIntBits = (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(f2 / 6.0f) & 4294967295L);
        j = (i & 4) != 0 ? zl1.b(0.1f, zl1.b) : j;
        this.a = f2;
        this.b = floatToRawIntBits;
        this.c = j;
        this.d = 1.0f;
        this.e = 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mea) {
                mea meaVar = (mea) obj;
                if (rg3.b(this.a, meaVar.a) && this.b == meaVar.b && zl1.c(this.c, meaVar.c) && Float.compare(this.d, meaVar.d) == 0 && this.e == meaVar.e) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = hl5.c(Float.hashCode(this.a) * 31, this.b, 31);
        int i = zl1.j;
        return Integer.hashCode(this.e) + nk2.d(this.d, hl5.c(c, this.c, 31), 31);
    }

    public final String toString() {
        String c = rg3.c(this.a);
        String c2 = tg3.c(this.b);
        String i = zl1.i(this.c);
        String a = vl0.a(this.e);
        StringBuilder y = nk2.y("Shadow(radius=", c, ", offset=", c2, ", color=");
        y.append(i);
        y.append(", alpha=");
        y.append(this.d);
        y.append(", blendMode=");
        return s21.q(y, a, ")");
    }
}
