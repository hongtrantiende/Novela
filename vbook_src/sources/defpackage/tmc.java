package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tmc  reason: default package */
/* loaded from: classes3.dex */
public final class tmc {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public tmc(String str, boolean z, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tmc) {
                tmc tmcVar = (tmc) obj;
                if (!this.a.equals(tmcVar.a) || !this.b.equals(tmcVar.b) || !this.c.equals(tmcVar.c) || this.d != tmcVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Engine(id=", this.a, ", name=", this.b, ", description=");
        y.append(this.c);
        y.append(", isNetworkRequired=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
