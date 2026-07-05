package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ylb  reason: default package */
/* loaded from: classes.dex */
public final class ylb {
    public final ps a;
    public ps b;
    public boolean c = false;
    public lt7 d = null;

    public ylb(ps psVar, ps psVar2) {
        this.a = psVar;
        this.b = psVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylb)) {
            return false;
        }
        ylb ylbVar = (ylb) obj;
        if (c16.i(this.a, ylbVar.a) && c16.i(this.b, ylbVar.b) && this.c == ylbVar.c && c16.i(this.d, ylbVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        lt7 lt7Var = this.d;
        if (lt7Var == null) {
            hashCode = 0;
        } else {
            hashCode = lt7Var.hashCode();
        }
        return k + hashCode;
    }

    public final String toString() {
        ps psVar = this.b;
        boolean z = this.c;
        lt7 lt7Var = this.d;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) psVar) + ", isShowingSubstitution=" + z + ", layoutCache=" + lt7Var + ")";
    }
}
