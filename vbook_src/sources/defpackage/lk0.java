package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lk0  reason: default package */
/* loaded from: classes.dex */
public final class lk0 {
    public final float a;

    public lk0(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, tc6 tc6Var) {
        float f = (i2 - i) / 2.0f;
        tc6 tc6Var2 = tc6.a;
        float f2 = this.a;
        if (tc6Var != tc6Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lk0) && Float.compare(this.a, ((lk0) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return a82.k("Horizontal(bias=", this.a, ")");
    }
}
