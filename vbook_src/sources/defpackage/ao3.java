package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ao3  reason: default package */
/* loaded from: classes3.dex */
public final class ao3 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;

    public ao3(String str, boolean z, String str2, String str3) {
        str3.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ao3) {
                ao3 ao3Var = (ao3) obj;
                if (this.a != ao3Var.a || !this.b.equals(ao3Var.b) || !this.c.equals(ao3Var.c) || !c16.i(this.d, ao3Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditDetailState(isLoading=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", author=");
        return nk2.w(sb, this.c, ", language=", this.d, ")");
    }
}
