package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vn2  reason: default package */
/* loaded from: classes3.dex */
public final class vn2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public vn2(String str, String str2, String str3, String str4) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn2)) {
            return false;
        }
        vn2 vn2Var = (vn2) obj;
        if (c16.i(this.a, vn2Var.a) && c16.i(this.b, vn2Var.b) && c16.i(this.c, vn2Var.c) && c16.i(this.d, vn2Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nk2.w(nk2.y("DbExtensionLocalStorage(id=", this.a, ", extensionId=", this.b, ", key="), this.c, ", content=", this.d, ")");
    }
}
