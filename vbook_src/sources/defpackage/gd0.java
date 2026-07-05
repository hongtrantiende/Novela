package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gd0  reason: default package */
/* loaded from: classes.dex */
public final class gd0 {
    public final hd0 a;
    public final jd0 b;
    public final id0 c;

    public gd0(hd0 hd0Var, jd0 jd0Var, id0 id0Var) {
        this.a = hd0Var;
        this.b = jd0Var;
        this.c = id0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof gd0) {
                gd0 gd0Var = (gd0) obj;
                if (this.a.equals(gd0Var.a) && this.b.equals(gd0Var.b) && this.c.equals(gd0Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
