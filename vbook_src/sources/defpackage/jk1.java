package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jk1  reason: default package */
/* loaded from: classes.dex */
public final class jk1 {
    public final float a;
    public final float b;

    public jk1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static boolean c(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).floatValue() <= ((Number) comparable2).floatValue()) {
            return true;
        }
        return false;
    }

    public final Comparable a() {
        return Float.valueOf(this.b);
    }

    public final Comparable b() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jk1) {
            float f = this.a;
            float f2 = this.b;
            if (f > f2) {
                jk1 jk1Var = (jk1) obj;
                if (jk1Var.a > jk1Var.b) {
                    return true;
                }
            }
            jk1 jk1Var2 = (jk1) obj;
            if (f == jk1Var2.a && f2 == jk1Var2.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        float f = this.a;
        float f2 = this.b;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
