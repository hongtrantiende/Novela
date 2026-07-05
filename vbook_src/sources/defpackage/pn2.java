package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pn2  reason: default package */
/* loaded from: classes3.dex */
public final class pn2 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public pn2(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn2)) {
            return false;
        }
        pn2 pn2Var = (pn2) obj;
        if (c16.i(this.a, pn2Var.a) && c16.i(this.b, pn2Var.b) && this.c == pn2Var.c && this.d == pn2Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(eub.j(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbEmojiCategory(id=", this.a, ", thumb=", this.b, ", count=");
        y.append(this.c);
        return a82.n(y, ", position=", this.d, ")");
    }
}
