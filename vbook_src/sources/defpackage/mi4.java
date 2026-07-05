package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mi4  reason: default package */
/* loaded from: classes.dex */
public final class mi4 {
    public final float a;
    public final float b;
    public final long c;

    public mi4(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi4)) {
            return false;
        }
        mi4 mi4Var = (mi4) obj;
        if (Float.compare(this.a, mi4Var.a) == 0 && Float.compare(this.b, mi4Var.b) == 0 && this.c == mi4Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + nk2.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return hl5.q(nk2.x("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="), this.c, ")");
    }
}
