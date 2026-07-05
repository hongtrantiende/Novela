package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: et9  reason: default package */
/* loaded from: classes3.dex */
public final class et9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public final List g;
    public final float h;

    public et9(float f, float f2, float f3, float f4, int i, int i2, List list, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = i2;
        this.g = list;
        this.h = f5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof et9) {
                et9 et9Var = (et9) obj;
                if (Float.compare(this.a, et9Var.a) != 0 || Float.compare(this.b, et9Var.b) != 0 || Float.compare(this.c, et9Var.c) != 0 || Float.compare(this.d, et9Var.d) != 0 || this.e != et9Var.e || this.f != et9Var.f || !this.g.equals(et9Var.g) || Float.compare(this.h, et9Var.h) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + eub.l(hl5.a(this.f, hl5.a(this.e, nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("RingConfig(startX=", this.a, ", startY=", this.b, ", endX=");
        s21.D(x, this.c, ", endY=", this.d, ", durationX=");
        rs8.q(this.e, this.f, ", durationY=", ", radii=", x);
        x.append(this.g);
        x.append(", depth=");
        x.append(this.h);
        x.append(")");
        return x.toString();
    }
}
