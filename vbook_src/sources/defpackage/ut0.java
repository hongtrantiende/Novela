package defpackage;

import android.graphics.Rect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ut0  reason: default package */
/* loaded from: classes.dex */
public final class ut0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new ut0(0, 0, 0, 0);
    }

    public ut0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i <= i3) {
            if (i2 <= i4) {
                return;
            }
            p1a.k(rs8.k("top must be less than or equal to bottom, top: ", i2, i4, ", bottom: "));
            throw null;
        }
        p1a.k(rs8.k("Left must be less than or equal to right, left: ", i, i3, ", right: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!ut0.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        ut0 ut0Var = (ut0) obj;
        if (this.a == ut0Var.a && this.b == ut0Var.b && this.c == ut0Var.c && this.d == ut0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ut0.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return rs8.g(this.d, "] }", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ut0(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
