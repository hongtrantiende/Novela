package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rl1  reason: default package */
/* loaded from: classes.dex */
public final class rl1 {
    public final float a;
    public final float b;

    public rl1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl1)) {
            return false;
        }
        rl1 rl1Var = (rl1) obj;
        if (Float.compare(this.a, rl1Var.a) == 0 && Float.compare(this.b, rl1Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CollectionScrollPadding(start=" + this.a + ", end=" + this.b + ')';
    }
}
