package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: am5  reason: default package */
/* loaded from: classes3.dex */
public final class am5 {
    public final int a;
    public final String b;
    public final int c;

    public am5(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public static am5 a(am5 am5Var, int i, String str, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = am5Var.a;
        }
        if ((i3 & 2) != 0) {
            str = am5Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = am5Var.c;
        }
        am5Var.getClass();
        str.getClass();
        return new am5(i, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am5)) {
            return false;
        }
        am5 am5Var = (am5) obj;
        if (this.a == am5Var.a && c16.i(this.b, am5Var.b) && this.c == am5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + eub.j(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.g(this.c, ")", s21.r("ImageChapterState(currentChapterIndex=", this.a, ", currentChapterName=", this.b, ", totalChapter="));
    }

    public /* synthetic */ am5() {
        this(0, "", 0);
    }
}
