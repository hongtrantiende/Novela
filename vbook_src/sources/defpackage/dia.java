package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dia  reason: default package */
/* loaded from: classes3.dex */
public final class dia {
    public final wk3 a;
    public final String b;
    public final vt4 c;
    public final boolean d;
    public final boolean e;

    public dia(wk3 wk3Var, String str, vt4 vt4Var, int i) {
        boolean z;
        if ((i & 8) != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = (i & 16) == 0;
        wk3Var.getClass();
        str.getClass();
        vt4Var.getClass();
        this.a = wk3Var;
        this.b = str;
        this.c = vt4Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dia)) {
            return false;
        }
        dia diaVar = (dia) obj;
        if (c16.i(this.a, diaVar.a) && c16.i(this.b, diaVar.b) && c16.i(this.c, diaVar.c) && this.d == diaVar.d && this.e == diaVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + eub.k((this.c.hashCode() + eub.j(this.a.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShelfBookActionItem(icon=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(", isPremium=");
        sb.append(this.d);
        sb.append(", isDanger=");
        return rs8.m(")", sb, this.e);
    }
}
