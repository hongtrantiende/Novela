package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ua0  reason: default package */
/* loaded from: classes.dex */
public final class ua0 extends fj1 {
    public final ra0 a;

    public ua0(ra0 ra0Var) {
        this.a = ra0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof fj1) {
                fj1 fj1Var = (fj1) obj;
                Object obj2 = ej1.a;
                if (obj2.equals(obj2)) {
                    if (this.a.equals(((ua0) fj1Var).a)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((ej1.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + ej1.a + ", androidClientInfo=" + this.a + "}";
    }
}
