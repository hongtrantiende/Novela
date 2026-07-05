package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gl3  reason: default package */
/* loaded from: classes.dex */
public final class gl3 {
    public final float a;
    public final float b;

    public gl3(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl3)) {
            return false;
        }
        gl3 gl3Var = (gl3) obj;
        if (Float.compare(this.a, gl3Var.a) == 0 && Float.compare(this.b, gl3Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a82.l("DropIndicatorGeometry(startX=", this.a, ", endX=", this.b, ")");
    }
}
