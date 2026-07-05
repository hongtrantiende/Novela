package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lq1  reason: default package */
/* loaded from: classes3.dex */
public final class lq1 {
    public final String a;
    public final String b;
    public final String c;

    public lq1(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lq1) {
                lq1 lq1Var = (lq1) obj;
                if (!c16.i(this.a, lq1Var.a) || !this.b.equals(lq1Var.b) || !this.c.equals(lq1Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("CommentSection(id=", this.a, ", name=", this.b, ", data="), this.c, ")");
    }
}
