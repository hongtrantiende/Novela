package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rta  reason: default package */
/* loaded from: classes3.dex */
public final class rta {
    public final String a;
    public final String b;
    public final String c;

    public rta(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rta) {
                rta rtaVar = (rta) obj;
                if (!this.a.equals(rtaVar.a) || !this.b.equals(rtaVar.b) || !this.c.equals(rtaVar.c)) {
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
        return s21.q(nk2.y("SourceDiscovery(name=", this.a, ", input=", this.b, ", script="), this.c, ")");
    }
}
