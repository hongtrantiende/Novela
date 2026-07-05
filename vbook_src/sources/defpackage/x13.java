package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x13  reason: default package */
/* loaded from: classes.dex */
public final class x13 {
    public final mf9 a;
    public final int b;
    public final int c;

    public x13(mf9 mf9Var, int i, int i2) {
        oc2.v(mf9Var, "Null dependency anInterface.");
        this.a = mf9Var;
        this.b = i;
        this.c = i2;
    }

    public static x13 a(mf9 mf9Var) {
        return new x13(mf9Var, 1, 0);
    }

    public static x13 b(Class cls) {
        return new x13(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x13) {
            x13 x13Var = (x13) obj;
            if (this.a.equals(x13Var.a) && this.b == x13Var.b && this.c == x13Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "deferred";
                } else {
                    vs.j(a82.j(i2, "Unsupported injection: "));
                    return null;
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return s21.q(sb, str2, "}");
    }

    public x13(int i, int i2, Class cls) {
        this(mf9.a(cls), i, i2);
    }
}
