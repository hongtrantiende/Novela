package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xqb  reason: default package */
/* loaded from: classes3.dex */
public final class xqb implements erb {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public xqb(String str, int i, int i2, int i3, String str2, String str3, String str4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xqb) {
                xqb xqbVar = (xqb) obj;
                if (!this.a.equals(xqbVar.a) || this.b != xqbVar.b || this.c != xqbVar.c || this.d != xqbVar.d || !this.e.equals(xqbVar.e) || !this.f.equals(xqbVar.f) || !this.g.equals(xqbVar.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + eub.j(eub.j(hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder s = s21.s("TextNote(id=", this.a, ", chapterIndex=", this.b, ", start=");
        rs8.q(this.c, this.d, ", end=", ", note=", s);
        nk2.C(s, this.e, ", description=", this.f, ", color=");
        return s21.q(s, this.g, ")");
    }
}
