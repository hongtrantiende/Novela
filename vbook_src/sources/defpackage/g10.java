package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g10  reason: default package */
/* loaded from: classes.dex */
public final class g10 {
    public static final g10 a = new Object();

    public final boolean a(Object obj, Object obj2) {
        if (this != obj2) {
            if ((obj instanceof jp5) && (obj2 instanceof jp5)) {
                jp5 jp5Var = (jp5) obj;
                jp5 jp5Var2 = (jp5) obj2;
                if (c16.i(jp5Var.a, jp5Var2.a) && jp5Var.b.equals(jp5Var2.b) && jp5Var.d.equals(jp5Var2.d) && c16.i(jp5Var.o, jp5Var2.o) && jp5Var.p == jp5Var2.p && jp5Var.q == jp5Var2.q) {
                    return true;
                }
                return false;
            }
            return c16.i(obj, obj2);
        }
        return true;
    }

    public final int b(Object obj) {
        if (!(obj instanceof jp5)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        jp5 jp5Var = (jp5) obj;
        int a2 = rs8.a((jp5Var.b.hashCode() + (jp5Var.a.hashCode() * 31)) * 961, 961, jp5Var.d);
        int hashCode = jp5Var.p.hashCode();
        return jp5Var.q.hashCode() + ((hashCode + ((jp5Var.o.hashCode() + a2) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
