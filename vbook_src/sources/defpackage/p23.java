package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p23  reason: default package */
/* loaded from: classes3.dex */
public final class p23 implements s23 {
    public final bzc a;
    public final int b;
    public final String c;

    public p23(bzc bzcVar, int i, String str) {
        str.getClass();
        this.a = bzcVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p23) {
                p23 p23Var = (p23) obj;
                if (!this.a.equals(p23Var.a) || this.b != p23Var.b || !c16.i(this.c, p23Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportStatus(user=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", content=");
        return s21.q(sb, this.c, ")");
    }
}
