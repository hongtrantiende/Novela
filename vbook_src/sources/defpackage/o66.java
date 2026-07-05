package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o66  reason: default package */
/* loaded from: classes3.dex */
public final class o66 {
    public static final mfb d = new mfb(new v16(9));
    public final r66 a;
    public final bl5 b;
    public final String c;

    public o66(r66 r66Var, bl5 bl5Var, String str) {
        r66Var.getClass();
        this.a = r66Var;
        this.b = bl5Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o66) {
                o66 o66Var = (o66) obj;
                if (!c16.i(this.a, o66Var.a) || !this.b.equals(o66Var.b) || !c16.i(this.c, o66Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Jwt(header=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(", signature=");
        return s21.q(sb, this.c, ")");
    }
}
