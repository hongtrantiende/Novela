package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tqb  reason: default package */
/* loaded from: classes3.dex */
public final class tqb implements erb {
    public final boolean a;
    public final long b;
    public final ikb c;

    public tqb(boolean z, long j, ikb ikbVar) {
        ikbVar.getClass();
        this.a = z;
        this.b = j;
        this.c = ikbVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tqb) {
                tqb tqbVar = (tqb) obj;
                if (this.a != tqbVar.a || !y78.d(this.b, tqbVar.b) || this.c != tqbVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.c(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String l = y78.l(this.b);
        return "TextDirection(enabled=" + this.a + ", offset=" + l + ", direction=" + this.c + ")";
    }
}
