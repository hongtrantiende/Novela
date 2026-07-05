package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ic0  reason: default package */
/* loaded from: classes.dex */
public final class ic0 {
    public final Object a;
    public final c69 b;
    public final bd0 c;

    public ic0(Object obj, c69 c69Var, bd0 bd0Var) {
        if (obj != null) {
            this.a = obj;
            this.b = c69Var;
            this.c = bd0Var;
            return;
        }
        xk5.k("Null payload");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ic0) {
                ic0 ic0Var = (ic0) obj;
                if (this.a.equals(ic0Var.a) && this.b.equals(ic0Var.b)) {
                    bd0 bd0Var = ic0Var.c;
                    bd0 bd0Var2 = this.c;
                    if (bd0Var2 == null) {
                        if (bd0Var == null) {
                            return true;
                        }
                        return false;
                    } else if (bd0Var2.equals(bd0Var)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        bd0 bd0Var = this.c;
        if (bd0Var == null) {
            hashCode = 0;
        } else {
            hashCode = bd0Var.hashCode();
        }
        return (hashCode ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
