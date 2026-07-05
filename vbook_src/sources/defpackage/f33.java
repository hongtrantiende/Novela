package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f33  reason: default package */
/* loaded from: classes3.dex */
public final class f33 {
    public final bzc a;
    public final ps b;
    public final boolean c;

    public f33(bzc bzcVar, ps psVar, boolean z) {
        bzcVar.getClass();
        psVar.getClass();
        this.a = bzcVar;
        this.b = psVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f33)) {
            return false;
        }
        f33 f33Var = (f33) obj;
        if (c16.i(this.a, f33Var.a) && c16.i(this.b, f33Var.b) && this.c == f33Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailQuote(user=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append((Object) this.b);
        sb.append(", isDeleted=");
        return rs8.m(")", sb, this.c);
    }
}
