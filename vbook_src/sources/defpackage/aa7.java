package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aa7  reason: default package */
/* loaded from: classes3.dex */
public final class aa7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public aa7(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa7)) {
            return false;
        }
        aa7 aa7Var = (aa7) obj;
        if (Float.compare(this.a, aa7Var.a) == 0 && Float.compare(this.b, aa7Var.b) == 0 && Float.compare(this.c, aa7Var.c) == 0 && Float.compare(this.d, aa7Var.d) == 0 && Float.compare(this.e, aa7Var.e) == 0 && Float.compare(this.f, aa7Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("MeshNode(baseX=", this.a, ", baseY=", this.b, ", offsetX=");
        s21.D(x, this.c, ", offsetY=", this.d, ", baseDepth=");
        x.append(this.e);
        x.append(", zAmplitude=");
        x.append(this.f);
        x.append(")");
        return x.toString();
    }
}
