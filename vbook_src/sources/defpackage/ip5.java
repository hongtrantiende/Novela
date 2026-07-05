package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ip5  reason: default package */
/* loaded from: classes3.dex */
public final class ip5 {
    public final xq5 a;
    public final String b;
    public final String c;

    public ip5(xq5 xq5Var, String str, String str2) {
        str.getClass();
        this.a = xq5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ip5) {
                ip5 ip5Var = (ip5) obj;
                if (!this.a.equals(ip5Var.a) || !c16.i(this.b, ip5Var.b) || !this.c.equals(ip5Var.c)) {
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
        StringBuilder sb = new StringBuilder("ImageRequest(data=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", uuid=");
        return s21.q(sb, this.c, ")");
    }
}
