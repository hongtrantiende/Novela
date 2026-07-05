package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vy5  reason: default package */
/* loaded from: classes.dex */
public final class vy5 {
    public static final vy5 e = new vy5(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vy5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean a(vy5 vy5Var) {
        vy5Var.getClass();
        if (this.c <= vy5Var.a || vy5Var.c <= this.a || this.d <= vy5Var.b || vy5Var.d <= this.b) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy5)) {
            return false;
        }
        vy5 vy5Var = (vy5) obj;
        if (this.a == vy5Var.a && this.b == vy5Var.b && this.c == vy5Var.c && this.d == vy5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRectCompat.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return hl5.p(sb, this.d, ')');
    }
}
