package defpackage;

import android.graphics.Insets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cx5  reason: default package */
/* loaded from: classes.dex */
public final class cx5 {
    public static final cx5 e = new cx5(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public cx5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static cx5 a(cx5 cx5Var, cx5 cx5Var2) {
        return b(Math.max(cx5Var.a, cx5Var2.a), Math.max(cx5Var.b, cx5Var2.b), Math.max(cx5Var.c, cx5Var2.c), Math.max(cx5Var.d, cx5Var2.d));
    }

    public static cx5 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new cx5(i, i2, i3, i4);
    }

    public static cx5 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return ff.v(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cx5.class != obj.getClass()) {
            return false;
        }
        cx5 cx5Var = (cx5) obj;
        if (this.d == cx5Var.d && this.a == cx5Var.a && this.c == cx5Var.c && this.b == cx5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return hl5.p(sb, this.d, '}');
    }
}
