package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cd7  reason: default package */
/* loaded from: classes.dex */
public final class cd7 {
    public String a = "";
    public String b = "";
    public boolean c = false;
    public String d = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cd7) {
                cd7 cd7Var = (cd7) obj;
                if (!this.a.equals(cd7Var.a) || !this.b.equals(cd7Var.b) || this.c != cd7Var.c || !this.d.equals(cd7Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.k(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        String str3 = this.d;
        StringBuilder y = nk2.y("MobiChapter(href=", str, ", title=", str2, ", isVolume=");
        y.append(z);
        y.append(", nextHref=");
        y.append(str3);
        y.append(")");
        return y.toString();
    }
}
