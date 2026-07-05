package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xl0  reason: default package */
/* loaded from: classes3.dex */
public final class xl0 {
    public final String a;
    public final hn0 b;
    public final dm0 c;
    public final yl0 d;

    public xl0(String str, hn0 hn0Var, dm0 dm0Var, yl0 yl0Var) {
        str.getClass();
        yl0Var.getClass();
        this.a = str;
        this.b = hn0Var;
        this.c = dm0Var;
        this.d = yl0Var;
    }

    public static xl0 a(xl0 xl0Var, hn0 hn0Var, dm0 dm0Var, yl0 yl0Var, int i) {
        String str = xl0Var.a;
        if ((i & 2) != 0) {
            hn0Var = xl0Var.b;
        }
        if ((i & 4) != 0) {
            dm0Var = xl0Var.c;
        }
        if ((i & 8) != 0) {
            yl0Var = xl0Var.d;
        }
        xl0Var.getClass();
        str.getClass();
        hn0Var.getClass();
        dm0Var.getClass();
        yl0Var.getClass();
        return new xl0(str, hn0Var, dm0Var, yl0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl0)) {
            return false;
        }
        xl0 xl0Var = (xl0) obj;
        if (c16.i(this.a, xl0Var.a) && c16.i(this.b, xl0Var.b) && c16.i(this.c, xl0Var.c) && c16.i(this.d, xl0Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Integer.hashCode(this.d.a) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        String a = pm0.a(this.a);
        return "Block(id=" + a + ", type=" + this.b + ", content=" + this.c + ", attributes=" + this.d + ")";
    }

    public xl0(String str, hn0 hn0Var, dm0 dm0Var) {
        this(str, hn0Var, dm0Var, yl0.b);
    }
}
