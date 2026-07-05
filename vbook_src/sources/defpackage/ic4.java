package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ic4  reason: default package */
/* loaded from: classes3.dex */
public final class ic4 {
    public final String a;
    public final int b;
    public final int c;

    public ic4(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic4)) {
            return false;
        }
        ic4 ic4Var = (ic4) obj;
        if (c16.i(this.a, ic4Var.a) && this.b == ic4Var.b && this.c == ic4Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rs8.g(this.c, ")", s21.s("FileChapterContent(title=", this.a, ", offset=", this.b, ", length="));
    }
}
