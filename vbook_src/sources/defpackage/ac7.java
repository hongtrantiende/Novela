package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ac7  reason: default package */
/* loaded from: classes.dex */
public final class ac7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public ac7(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ac7) {
                ac7 ac7Var = (ac7) obj;
                if (Float.compare(this.a, ac7Var.a) != 0 || Float.compare(this.b, ac7Var.b) != 0 || Float.compare(this.c, ac7Var.c) != 0 || Float.compare(this.d, ac7Var.d) != 0 || Float.compare(this.e, ac7Var.e) != 0 || Float.compare(4.0f, 4.0f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(4.0f) + nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("MeteorState(startX=", this.a, ", startY=", this.b, ", angle=");
        s21.D(x, this.c, ", length=", this.d, ", depth=");
        x.append(this.e);
        x.append(", thickness=4.0)");
        return x.toString();
    }
}
