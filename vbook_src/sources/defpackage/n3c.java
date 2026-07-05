package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n3c  reason: default package */
/* loaded from: classes3.dex */
public final class n3c {
    public final String a;
    public final String b;
    public final String c;

    public n3c(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3c)) {
            return false;
        }
        n3c n3cVar = (n3c) obj;
        if (c16.i(this.a, n3cVar.a) && c16.i(this.b, n3cVar.b) && c16.i(this.c, n3cVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("TextTranslateEngine(id=", this.a, ", name=", this.b, ", language="), this.c, ")");
    }

    public /* synthetic */ n3c(String str) {
        this("qt", "", str);
    }
}
