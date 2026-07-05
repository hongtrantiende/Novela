package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xja  reason: default package */
/* loaded from: classes.dex */
public final class xja {
    public final int a;
    public final int b;
    public final float c;

    public xja(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xja)) {
            return false;
        }
        xja xjaVar = (xja) obj;
        if (this.a == xjaVar.a && this.b == xjaVar.b && Float.compare(this.c, xjaVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "ShiftPointRange(fromStepIndex=", ", toStepIndex=", ", steppedInterpolation=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
}
