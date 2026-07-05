package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vta  reason: default package */
/* loaded from: classes3.dex */
public final class vta {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final uta f;

    public vta(String str, String str2, String str3, String str4, String str5, uta utaVar) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = utaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vta) {
                vta vtaVar = (vta) obj;
                if (!this.a.equals(vtaVar.a) || !this.b.equals(vtaVar.b) || !this.c.equals(vtaVar.c) || !this.d.equals(vtaVar.d) || !c16.i(this.e, vtaVar.e) || !c16.i(this.f, vtaVar.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        uta utaVar = this.f;
        if (utaVar == null) {
            hashCode = 0;
        } else {
            hashCode = utaVar.hashCode();
        }
        return j + hashCode;
    }

    public final String toString() {
        StringBuilder y = nk2.y("SourceExploreItem(name=", this.a, ", cover=", this.b, ", description=");
        nk2.C(y, this.c, ", tag=", this.d, ", data=");
        y.append(this.e);
        y.append(", action=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
