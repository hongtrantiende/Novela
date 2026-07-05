package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kya  reason: default package */
/* loaded from: classes3.dex */
public final class kya {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;

    public kya(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kya)) {
            return false;
        }
        kya kyaVar = (kya) obj;
        if (Float.compare(this.a, kyaVar.a) == 0 && Float.compare(this.b, kyaVar.b) == 0 && Float.compare(this.c, kyaVar.c) == 0 && Float.compare(this.d, kyaVar.d) == 0 && Float.compare(this.e, kyaVar.e) == 0 && Float.compare(this.f, kyaVar.f) == 0 && Float.compare(this.g, kyaVar.g) == 0 && this.h == kyaVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + nk2.d(this.g, nk2.d(this.f, nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("StarData(x=", this.a, ", y=", this.b, ", size=");
        s21.D(x, this.c, ", baseAlpha=", this.d, ", depth=");
        s21.D(x, this.e, ", speed=", this.f, ", initialOffset=");
        x.append(this.g);
        x.append(", lastRegen=");
        x.append(this.h);
        x.append(")");
        return x.toString();
    }
}
