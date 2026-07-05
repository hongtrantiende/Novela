package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rx6  reason: default package */
/* loaded from: classes3.dex */
public final class rx6 {
    public final boolean a;
    public final boolean b;

    public rx6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static rx6 a(rx6 rx6Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = rx6Var.a;
        }
        if ((i & 2) != 0) {
            z2 = rx6Var.b;
        }
        rx6Var.getClass();
        return new rx6(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx6)) {
            return false;
        }
        rx6 rx6Var = (rx6) obj;
        if (this.a == rx6Var.a && this.b == rx6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LoginState(isLoading=" + this.a + ", isGoogleLoading=" + this.b + ")";
    }
}
