package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r1a  reason: default package */
/* loaded from: classes.dex */
public final class r1a {
    public final float a;
    public final float b;

    public r1a(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1a)) {
            return false;
        }
        r1a r1aVar = (r1a) obj;
        if (Float.compare(this.a, r1aVar.a) == 0 && Float.compare(this.b, r1aVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ScrollAreaOffsets(start=" + this.a + ", end=" + this.b + ')';
    }
}
