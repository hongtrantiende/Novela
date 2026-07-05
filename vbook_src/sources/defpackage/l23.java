package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l23  reason: default package */
/* loaded from: classes3.dex */
public final class l23 implements s23 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final float g;

    public l23(String str, String str2, String str3, String str4, String str5, String str6, float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l23) {
                l23 l23Var = (l23) obj;
                if (!this.a.equals(l23Var.a) || !this.b.equals(l23Var.b) || !this.c.equals(l23Var.c) || !this.d.equals(l23Var.d) || !this.e.equals(l23Var.e) || !this.f.equals(l23Var.f) || Float.compare(this.g, l23Var.g) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + eub.j(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Book(name=", this.a, ", author=", this.b, ", cover=");
        nk2.C(y, this.c, ", extension=", this.d, ", path=");
        nk2.C(y, this.e, ", content=", this.f, ", rate=");
        y.append(this.g);
        y.append(")");
        return y.toString();
    }
}
