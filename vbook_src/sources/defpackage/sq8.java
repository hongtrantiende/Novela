package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sq8  reason: default package */
/* loaded from: classes3.dex */
public final class sq8 {
    public final String a;
    public final int b;

    public sq8(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return s21.k("pdf_thumb:", this.b, this.a, ":", ":240");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sq8) {
            sq8 sq8Var = (sq8) obj;
            if (c16.i(this.a, sq8Var.a) && this.b == sq8Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(240) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return s21.k("PdfPageThumbnail(bookId=", this.b, this.a, ", pageIndex=", ", targetWidth=240)");
    }
}
