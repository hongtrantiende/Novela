package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wp8  reason: default package */
/* loaded from: classes3.dex */
public final class wp8 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public wp8(int i, String str, int i2, int i3) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp8)) {
            return false;
        }
        wp8 wp8Var = (wp8) obj;
        if (c16.i(this.a, wp8Var.a) && this.b == wp8Var.b && this.c == wp8Var.c && this.d == wp8Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return hl5.j(this.c, this.d, ", endIndex=", ")", s21.s("PdfHighlightKey(bookId=", this.a, ", pageIndex=", this.b, ", startIndex="));
    }
}
