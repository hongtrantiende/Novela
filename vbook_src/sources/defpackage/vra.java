package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vra  reason: default package */
/* loaded from: classes3.dex */
public final class vra {
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;
    public final float i;
    public final float j;
    public final int k;

    public vra(float f, float f2, int i, float f3, float f4, float f5, int i2, float f6, float f7, float f8, int i3) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = i2;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vra)) {
            return false;
        }
        vra vraVar = (vra) obj;
        if (Float.compare(this.a, vraVar.a) == 0 && Float.compare(this.b, vraVar.b) == 0 && this.c == vraVar.c && Float.compare(this.d, vraVar.d) == 0 && Float.compare(this.e, vraVar.e) == 0 && Float.compare(this.f, vraVar.f) == 0 && this.g == vraVar.g && Float.compare(this.h, vraVar.h) == 0 && Float.compare(this.i, vraVar.i) == 0 && Float.compare(this.j, vraVar.j) == 0 && this.k == vraVar.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + nk2.d(this.j, nk2.d(this.i, nk2.d(this.h, hl5.a(this.g, nk2.d(this.f, nk2.d(this.e, nk2.d(this.d, hl5.a(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("SnowflakeData(x=", this.a, ", initialProgress=", this.b, ", fallSpeed=");
        x.append(this.c);
        x.append(", swayAmplitude=");
        x.append(this.d);
        x.append(", swayFrequency=");
        s21.D(x, this.e, ", size=", this.f, ", rotationSpeed=");
        x.append(this.g);
        x.append(", initialRotation=");
        x.append(this.h);
        x.append(", swayPhaseOffset=");
        s21.D(x, this.i, ", depth=", this.j, ", layer=");
        return rs8.g(this.k, ")", x);
    }
}
