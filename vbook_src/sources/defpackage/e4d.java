package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e4d  reason: default package */
/* loaded from: classes3.dex */
public final class e4d {
    public final float a;
    public final float b;
    public final float c;

    public e4d(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4d)) {
            return false;
        }
        e4d e4dVar = (e4d) obj;
        if (Float.compare(this.a, e4dVar.a) == 0 && Float.compare(this.b, e4dVar.b) == 0 && Float.compare(this.c, e4dVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nk2.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("Vec3(x=", this.a, ", y=", this.b, ", z=");
        x.append(this.c);
        x.append(")");
        return x.toString();
    }
}
