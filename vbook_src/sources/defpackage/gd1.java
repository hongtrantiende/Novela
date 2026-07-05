package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gd1  reason: default package */
/* loaded from: classes3.dex */
public final class gd1 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public gd1(long j, long j2, String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final long a() {
        return this.c + this.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gd1) {
                gd1 gd1Var = (gd1) obj;
                if (!c16.i(this.a, gd1Var.a) || !this.b.equals(gd1Var.b) || this.c != gd1Var.c || this.d != gd1Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(eub.j(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ChartPoint(label=", this.a, ", key=", this.b, ", readValue=");
        y.append(this.c);
        return a82.n(y, ", listenValue=", this.d, ")");
    }
}
