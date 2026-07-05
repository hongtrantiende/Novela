package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vq8  reason: default package */
/* loaded from: classes3.dex */
public final class vq8 {
    public final int a;
    public final int b;
    public final int c;

    public vq8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq8)) {
            return false;
        }
        vq8 vq8Var = (vq8) obj;
        if (this.a == vq8Var.a && this.b == vq8Var.b && this.c == vq8Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return rs8.g(this.c, ")", hl5.r(this.a, this.b, "PdfSearchMatch(pageIndex=", ", startCharIndex=", ", endCharIndex="));
    }
}
