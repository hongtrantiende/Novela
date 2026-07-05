package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lpc  reason: default package */
/* loaded from: classes3.dex */
public final class lpc {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public lpc(int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpc)) {
            return false;
        }
        lpc lpcVar = (lpc) obj;
        if (c16.i(this.a, lpcVar.a) && this.b == lpcVar.b && this.c == lpcVar.c && this.d == lpcVar.d && this.e == lpcVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("Progress(bookId=", this.a, ", chapterIndex=", this.b, ", startIndex=");
        rs8.q(this.c, this.d, ", endIndex=", ", chapterLength=", s);
        return rs8.g(this.e, ")", s);
    }

    public /* synthetic */ lpc() {
        this(0, -1, -1, 0, "");
    }
}
