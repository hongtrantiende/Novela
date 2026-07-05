package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t79  reason: default package */
/* loaded from: classes.dex */
public final class t79 {
    public final float a;
    public final ob4 b;

    public t79(float f, ob4 ob4Var) {
        ob4Var.getClass();
        this.a = f;
        this.b = ob4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t79)) {
            return false;
        }
        t79 t79Var = (t79) obj;
        if (Float.compare(this.a, t79Var.a) == 0 && c16.i(this.b, t79Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
