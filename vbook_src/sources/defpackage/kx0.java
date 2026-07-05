package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kx0  reason: default package */
/* loaded from: classes3.dex */
public final class kx0 {
    public final String a;
    public final String b;
    public final String c;

    public kx0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kx0) {
                kx0 kx0Var = (kx0) obj;
                if (!this.a.equals(kx0Var.a) || !this.b.equals(kx0Var.b) || !this.c.equals(kx0Var.c)) {
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
        return s21.q(nk2.y("BrowserSearchEngine(id=", this.a, ", name=", this.b, ", url="), this.c, ")");
    }
}
