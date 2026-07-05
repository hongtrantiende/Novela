package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w76  reason: default package */
/* loaded from: classes3.dex */
public final class w76 {
    public static final w76 c = new w76(null, null);
    public final y76 a;
    public final t76 b;

    public w76(y76 y76Var, nsc nscVar) {
        boolean z;
        String str;
        this.a = y76Var;
        this.b = nscVar;
        if (y76Var == null) {
            z = true;
        } else {
            z = false;
        }
        if (z == (nscVar == null)) {
            return;
        }
        if (y76Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + y76Var + " requires type to be specified.";
        }
        p1a.k(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w76)) {
            return false;
        }
        w76 w76Var = (w76) obj;
        if (this.a == w76Var.a && c16.i(this.b, w76Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        y76 y76Var = this.a;
        if (y76Var == null) {
            hashCode = 0;
        } else {
            hashCode = y76Var.hashCode();
        }
        int i2 = hashCode * 31;
        t76 t76Var = this.b;
        if (t76Var != null) {
            i = t76Var.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        int i;
        y76 y76Var = this.a;
        if (y76Var == null) {
            i = -1;
        } else {
            i = v76.a[y76Var.ordinal()];
        }
        if (i != -1) {
            t76 t76Var = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "out " + t76Var;
                    }
                    xk5.o();
                    return null;
                }
                return "in " + t76Var;
            }
            return String.valueOf(t76Var);
        }
        return "*";
    }
}
