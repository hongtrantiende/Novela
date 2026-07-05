package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xc0  reason: default package */
/* loaded from: classes.dex */
public final class xc0 extends j18 {
    public final i18 a;
    public final h18 b;

    public xc0(i18 i18Var, h18 h18Var) {
        this.a = i18Var;
        this.b = h18Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j18) {
            j18 j18Var = (j18) obj;
            i18 i18Var = this.a;
            if (i18Var != null ? i18Var.equals(((xc0) j18Var).a) : ((xc0) j18Var).a == null) {
                h18 h18Var = this.b;
                if (h18Var != null ? h18Var.equals(((xc0) j18Var).b) : ((xc0) j18Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        i18 i18Var = this.a;
        if (i18Var == null) {
            hashCode = 0;
        } else {
            hashCode = i18Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        h18 h18Var = this.b;
        if (h18Var != null) {
            i = h18Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
