package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x8b  reason: default package */
/* loaded from: classes3.dex */
public final class x8b {
    public final String a;
    public final String b;
    public final String c;

    public x8b(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x8b) {
                x8b x8bVar = (x8b) obj;
                if (!c16.i(this.a, x8bVar.a) || !this.b.equals(x8bVar.b) || !this.c.equals(x8bVar.c)) {
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
        return s21.q(nk2.y("SuggestSection(id=", this.a, ", name=", this.b, ", data="), this.c, ")");
    }
}
