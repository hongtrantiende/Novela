package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y67  reason: default package */
/* loaded from: classes.dex */
public final class y67 {
    public final Class a;
    public final Object b;
    public boolean c = false;
    public x67 d;

    public y67(Class cls, Object obj, x67 x67Var) {
        this.a = cls;
        this.b = obj;
        this.d = x67Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y67) {
                y67 y67Var = (y67) obj;
                if (!c16.i(this.a, y67Var.a) || !c16.i(this.b, y67Var.b) || this.c != y67Var.c || this.d != y67Var.d) {
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
        int hashCode2 = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.d.hashCode() + eub.k((hashCode2 + hashCode) * 961, 31, this.c);
    }

    public final String toString() {
        boolean z = this.c;
        x67 x67Var = this.d;
        return "Configuration(declaringClass=" + this.a + ", memberInstance=" + this.b + ", processorResolver=null, superclass=" + z + ", optional=" + x67Var + ")";
    }
}
