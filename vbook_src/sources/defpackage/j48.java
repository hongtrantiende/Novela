package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j48  reason: default package */
/* loaded from: classes3.dex */
public final class j48 {
    public final String a;
    public final int b;
    public final u48 c;
    public final boolean d;
    public final long e;

    public j48(String str, int i, u48 u48Var, boolean z, long j) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = u48Var;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j48) {
            j48 j48Var = (j48) obj;
            if (c16.i(this.a, j48Var.a) && this.b == j48Var.b && this.c.equals(j48Var.c) && this.d == j48Var.d && this.e == j48Var.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return o58.a.hashCode() + hl5.c(eub.k((this.c.hashCode() + hl5.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("Notification(id=", this.a, ", type=", this.b, ", content=");
        s.append(this.c);
        s.append(", read=");
        s.append(this.d);
        s.append(", createAt=");
        s.append(this.e);
        s.append(", source=");
        s.append(o58.a);
        s.append(")");
        return s.toString();
    }
}
