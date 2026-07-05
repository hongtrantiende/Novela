package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s10  reason: default package */
/* loaded from: classes3.dex */
public final class s10 {
    public final Object a;
    public final g10 b;
    public final io5 c;

    public s10(Object obj, g10 g10Var, io5 io5Var) {
        this.a = obj;
        this.b = g10Var;
        this.c = io5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s10) {
                s10 s10Var = (s10) obj;
                g10 g10Var = s10Var.b;
                g10 g10Var2 = this.b;
                if (c16.i(g10Var2, g10Var) && g10Var2.a(this.a, s10Var.a) && c16.i(this.c, s10Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        g10 g10Var = this.b;
        int b = g10Var.b(this.a);
        return this.c.hashCode() + ((b + (g10Var.hashCode() * 31)) * 31);
    }
}
