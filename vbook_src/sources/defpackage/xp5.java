package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xp5  reason: default package */
/* loaded from: classes3.dex */
public final class xp5 {
    public final int a;
    public final int b;
    public final int c;

    public xp5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static xp5 a(xp5 xp5Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = xp5Var.a;
        }
        int i4 = xp5Var.c;
        xp5Var.getClass();
        return new xp5(i, i2, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp5)) {
            return false;
        }
        xp5 xp5Var = (xp5) obj;
        if (this.a == xp5Var.a && this.b == xp5Var.b && this.c == xp5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return rs8.g(this.c, ")", hl5.r(this.a, this.b, "ImageScrollState(chapterIndex=", ", pageIndex=", ", pageCount="));
    }
}
