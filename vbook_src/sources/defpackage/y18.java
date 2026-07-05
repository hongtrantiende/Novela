package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y18  reason: default package */
/* loaded from: classes.dex */
public final class y18 {
    public final int a;
    public final long b;
    public final long c;
    public final s18 d;
    public final ta6 e;
    public final Object f;

    public y18(int i, long j, long j2, s18 s18Var, ta6 ta6Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = s18Var;
        this.e = ta6Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y18)) {
            return false;
        }
        y18 y18Var = (y18) obj;
        if (this.a == y18Var.a && this.b == y18Var.b && this.c == y18Var.c && c16.i(this.d, y18Var.d) && c16.i(this.e, y18Var.e) && c16.i(this.f, y18Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = rs8.a(hl5.c(hl5.c(this.a * 31, this.b, 31), this.c, 31), 31, this.d.a);
        int i = 0;
        ta6 ta6Var = this.e;
        if (ta6Var == null) {
            hashCode = 0;
        } else {
            hashCode = ta6Var.a.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        Object obj = this.f;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        rs8.x(sb, ", responseMillis=", this.c, ", headers=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
