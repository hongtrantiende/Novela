package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s48  reason: default package */
/* loaded from: classes3.dex */
public final class s48 implements u48 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public s48(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s48) {
                s48 s48Var = (s48) obj;
                if (!this.a.equals(s48Var.a) || !this.b.equals(s48Var.b) || this.c != s48Var.c || this.d != s48Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return hl5.j(this.c, this.d, ", newChapterCount=", ")", nk2.y("NewChapter(bookId=", this.a, ", bookName=", this.b, ", bookType="));
    }
}
