package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iz9  reason: default package */
/* loaded from: classes.dex */
public final class iz9 {
    public final float a;
    public final long b;
    public final lf4 c;

    public iz9(float f, long j, lf4 lf4Var) {
        this.a = f;
        this.b = j;
        this.c = lf4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz9)) {
            return false;
        }
        iz9 iz9Var = (iz9) obj;
        if (Float.compare(this.a, iz9Var.a) == 0 && ckc.a(this.b, iz9Var.b) && c16.i(this.c, iz9Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ckc.c;
        return this.c.hashCode() + hl5.c(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String d = ckc.d(this.b);
        return "Scale(scale=" + this.a + ", transformOrigin=" + d + ", animationSpec=" + this.c + ")";
    }
}
