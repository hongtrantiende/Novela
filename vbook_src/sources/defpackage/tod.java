package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tod  reason: default package */
/* loaded from: classes3.dex */
public final class tod implements wx7 {
    public final String b;
    public final String c;

    public tod(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wx7) {
                wx7 wx7Var = (wx7) obj;
                if (!this.b.equals(wx7Var.getPrefix()) || !this.c.equals(wx7Var.getNamespaceURI())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wx7
    public final String getNamespaceURI() {
        return this.c;
    }

    @Override // defpackage.wx7
    public final String getPrefix() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.b);
        sb.append(':');
        return s21.p(sb, this.c, '}');
    }
}
