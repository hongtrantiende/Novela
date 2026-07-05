package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: va0  reason: default package */
/* loaded from: classes.dex */
public final class va0 extends lt1 {
    public final nc0 a;

    public va0(nc0 nc0Var) {
        kt1 kt1Var = kt1.a;
        this.a = nc0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof lt1) {
                if (this.a.equals(((va0) ((lt1) obj)).a)) {
                    Object obj2 = kt1.a;
                    if (obj2.equals(obj2)) {
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
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ kt1.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + kt1.a + "}";
    }
}
