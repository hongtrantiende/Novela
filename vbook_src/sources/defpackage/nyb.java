package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nyb  reason: default package */
/* loaded from: classes.dex */
public final class nyb {
    public final nm1 a;
    public final e4c b;
    public final cq4 c;

    public nyb(nm1 nm1Var, e4c e4cVar, cq4 cq4Var, int i) {
        e4cVar = (i & 2) != 0 ? null : e4cVar;
        cq4Var = (i & 4) != 0 ? null : cq4Var;
        this.a = nm1Var;
        this.b = e4cVar;
        this.c = cq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyb)) {
            return false;
        }
        nyb nybVar = (nyb) obj;
        if (c16.i(this.a, nybVar.a) && c16.i(this.b, nybVar.b) && c16.i(this.c, nybVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        e4c e4cVar = this.b;
        if (e4cVar != null) {
            i = Long.hashCode(e4cVar.a);
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        if (this.c != null) {
            i2 = Integer.hashCode(700);
        }
        return (i3 + i2) * 923521;
    }

    public final String toString() {
        return "TextStyle(color=" + this.a + ", fontSize=" + this.b + ", fontWeight=" + this.c + ", fontStyle=null, textDecoration=null, textAlign=null, fontFamily=null)";
    }
}
