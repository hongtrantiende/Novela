package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vmc  reason: default package */
/* loaded from: classes3.dex */
public final class vmc {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public vmc(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vmc) {
                vmc vmcVar = (vmc) obj;
                if (!this.a.equals(vmcVar.a) || !this.b.equals(vmcVar.b) || this.c != vmcVar.c || this.d != vmcVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.k(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Language(id=", this.a, ", name=", this.b, ", isSupportFrom=");
        y.append(this.c);
        y.append(", isSupportTo=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
