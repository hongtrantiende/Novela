package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rl8  reason: default package */
/* loaded from: classes.dex */
public final class rl8 {
    public final yya a;
    public final yya b;

    public rl8(dm8 dm8Var, dm8 dm8Var2) {
        dm8Var.getClass();
        dm8Var2.getClass();
        this.a = dm8Var;
        this.b = dm8Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl8)) {
            return false;
        }
        rl8 rl8Var = (rl8) obj;
        if (c16.i(this.a, rl8Var.a) && c16.i(this.b, rl8Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ParallaxState(tiltX=" + this.a + ", tiltY=" + this.b + ")";
    }
}
