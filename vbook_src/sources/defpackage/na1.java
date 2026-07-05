package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: na1  reason: default package */
/* loaded from: classes.dex */
public final class na1 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;

    public na1(String str, long j, long j2, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof na1) {
                na1 na1Var = (na1) obj;
                if (!this.a.equals(na1Var.a) || this.b != na1Var.b || this.c != na1Var.c || this.d != na1Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(hl5.a(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("CfbDirEntry(name=", this.a, ", type=", this.b, ", startSector=");
        s.append(this.c);
        return a82.n(s, ", size=", this.d, ")");
    }
}
