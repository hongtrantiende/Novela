package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vg9  reason: default package */
/* loaded from: classes.dex */
public final class vg9 {
    public static final vg9 c;
    public final xg9 a;
    public final xg9 b;

    static {
        xg9 xg9Var = xg9.c;
        c = new vg9(xg9Var, xg9Var);
    }

    public vg9(xg9 xg9Var, xg9 xg9Var2) {
        xg9Var.getClass();
        xg9Var2.getClass();
        this.a = xg9Var;
        this.b = xg9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg9)) {
            return false;
        }
        vg9 vg9Var = (vg9) obj;
        if (c16.i(this.a, vg9Var.a) && c16.i(this.b, vg9Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder b = d4b.b();
        b.append(this.a);
        b.append('=');
        b.append(this.b);
        String sb = b.toString();
        d4b.m(b);
        return sb;
    }
}
