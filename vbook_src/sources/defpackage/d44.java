package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d44  reason: default package */
/* loaded from: classes3.dex */
public final class d44 {
    public final boolean a;
    public final l54 b;
    public final q34 c;
    public final p34 d;
    public final d84 e;
    public final c84 f;
    public final q54 g;

    public d44(boolean z, l54 l54Var, q34 q34Var, p34 p34Var, d84 d84Var, c84 c84Var, q54 q54Var) {
        this.a = z;
        this.b = l54Var;
        this.c = q34Var;
        this.d = p34Var;
        this.e = d84Var;
        this.f = c84Var;
        this.g = q54Var;
    }

    public static d44 a(d44 d44Var, l54 l54Var, q34 q34Var, p34 p34Var, d84 d84Var, c84 c84Var, q54 q54Var, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = d44Var.a;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            l54Var = d44Var.b;
        }
        if ((i & 4) != 0) {
            q34Var = d44Var.c;
        }
        if ((i & 8) != 0) {
            p34Var = d44Var.d;
        }
        if ((i & 16) != 0) {
            d84Var = d44Var.e;
        }
        if ((i & 32) != 0) {
            c84Var = d44Var.f;
        }
        if ((i & 64) != 0) {
            q54Var = d44Var.g;
        }
        q54 q54Var2 = q54Var;
        d44Var.getClass();
        c84 c84Var2 = c84Var;
        d84 d84Var2 = d84Var;
        p34 p34Var2 = p34Var;
        q34 q34Var2 = q34Var;
        return new d44(z, l54Var, q34Var2, p34Var2, d84Var2, c84Var2, q54Var2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d44) {
                d44 d44Var = (d44) obj;
                if (this.a != d44Var.a || !c16.i(this.b, d44Var.b) || !this.c.equals(d44Var.c) || !c16.i(this.d, d44Var.d) || !this.e.equals(d44Var.e) || !c16.i(this.f, d44Var.f) || !c16.i(this.g, d44Var.g)) {
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
        int hashCode2;
        int hashCode3;
        int hashCode4 = Boolean.hashCode(this.a) * 31;
        int i = 0;
        l54 l54Var = this.b;
        if (l54Var == null) {
            hashCode = 0;
        } else {
            hashCode = l54Var.hashCode();
        }
        int hashCode5 = (this.c.hashCode() + ((hashCode4 + hashCode) * 31)) * 31;
        p34 p34Var = this.d;
        if (p34Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = p34Var.hashCode();
        }
        int a = rs8.a((hashCode5 + hashCode2) * 31, 31, this.e.a);
        c84 c84Var = this.f;
        if (c84Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c84Var.a.hashCode();
        }
        int i2 = (a + hashCode3) * 31;
        q54 q54Var = this.g;
        if (q54Var != null) {
            i = q54Var.a.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ExtensionDetailState(isLoading=" + this.a + ", extension=" + this.b + ", extensionConnectionConfig=" + this.c + ", extensionConnection=" + this.d + ", extensionSettingConfig=" + this.e + ", extensionSetting=" + this.f + ", extensionLocalStorage=" + this.g + ")";
    }
}
