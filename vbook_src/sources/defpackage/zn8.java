package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zn8  reason: default package */
/* loaded from: classes.dex */
public final class zn8 extends fo8 {
    public final float c;
    public final float d;

    public zn8(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn8)) {
            return false;
        }
        zn8 zn8Var = (zn8) obj;
        if (Float.compare(this.c, zn8Var.c) == 0 && Float.compare(this.d, zn8Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return a82.l("RelativeMoveTo(dx=", this.c, ", dy=", this.d, ")");
    }
}
