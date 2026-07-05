package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ox5  reason: default package */
/* loaded from: classes3.dex */
public final class ox5 {
    public final String a;
    public final ux5 b;
    public final l54 c;

    public ox5(String str, ux5 ux5Var, l54 l54Var) {
        str.getClass();
        ux5Var.getClass();
        this.a = str;
        this.b = ux5Var;
        this.c = l54Var;
    }

    public static ox5 a(ox5 ox5Var, ux5 ux5Var, l54 l54Var, int i) {
        String str = ox5Var.a;
        if ((i & 4) != 0) {
            l54Var = ox5Var.c;
        }
        ox5Var.getClass();
        str.getClass();
        return new ox5(str, ux5Var, l54Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox5)) {
            return false;
        }
        ox5 ox5Var = (ox5) obj;
        if (c16.i(this.a, ox5Var.a) && this.b == ox5Var.b && c16.i(this.c, ox5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        l54 l54Var = this.c;
        if (l54Var == null) {
            hashCode = 0;
        } else {
            hashCode = l54Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "InstallExtensionState(url=" + this.a + ", status=" + this.b + ", info=" + this.c + ")";
    }

    public /* synthetic */ ox5(String str, int i) {
        this((i & 1) != 0 ? "" : str, ux5.a, null);
    }
}
