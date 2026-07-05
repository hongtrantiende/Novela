package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jx5  reason: default package */
/* loaded from: classes.dex */
public final class jx5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public jx5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx5)) {
            return false;
        }
        jx5 jx5Var = (jx5) obj;
        if (this.a == jx5Var.a && this.b == jx5Var.b && this.c == jx5Var.c && this.d == jx5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return hl5.j(this.c, this.d, ", bottom=", ")", hl5.r(this.a, this.b, "InsetsValues(left=", ", top=", ", right="));
    }
}
