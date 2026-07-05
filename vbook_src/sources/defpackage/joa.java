package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: joa  reason: default package */
/* loaded from: classes3.dex */
public final class joa {
    public final String a;
    public final String b;
    public final apa c;
    public final eb5 d;

    public joa(String str, String str2, apa apaVar, eb5 eb5Var) {
        str.getClass();
        str2.getClass();
        apaVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = apaVar;
        this.d = eb5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof joa) {
            joa joaVar = (joa) obj;
            if (c16.i(this.a, joaVar.a) && c16.i(this.b, joaVar.b) && c16.i(this.c, joaVar.c) && this.d == joaVar.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        return this.d.hashCode() + ((this.c.hashCode() + j) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SlashCommandContext(anchorBlockId=", pm0.a(this.a), ", query=", this.b, ", queryRange=");
        y.append(this.c);
        y.append(", editor=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
