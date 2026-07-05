package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vs0  reason: default package */
/* loaded from: classes.dex */
public final class vs0 {
    public final float a;
    public final esa b;

    public vs0(float f, esa esaVar) {
        this.a = f;
        this.b = esaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vs0) {
                vs0 vs0Var = (vs0) obj;
                if (!rg3.b(this.a, vs0Var.a) || !this.b.equals(vs0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        String c = rg3.c(this.a);
        return "BorderStroke(width=" + c + ", brush=" + this.b + ")";
    }
}
