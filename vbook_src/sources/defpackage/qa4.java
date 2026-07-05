package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qa4  reason: default package */
/* loaded from: classes.dex */
public final class qa4 {
    public final float a;
    public final lf4 b;

    public qa4(float f, lf4 lf4Var) {
        this.a = f;
        this.b = lf4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa4)) {
            return false;
        }
        qa4 qa4Var = (qa4) obj;
        if (Float.compare(this.a, qa4Var.a) == 0 && c16.i(this.b, qa4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
