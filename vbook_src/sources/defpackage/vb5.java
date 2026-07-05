package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vb5  reason: default package */
/* loaded from: classes.dex */
public final class vb5 {
    public final String a;
    public final String b;

    public vb5(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb5)) {
            return false;
        }
        vb5 vb5Var = (vb5) obj;
        if (c16.i(this.a, vb5Var.a) && c16.i(this.b, vb5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("HtmlSection(title=", this.a, ", html=", this.b, ")");
    }
}
