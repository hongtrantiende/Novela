package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ula  reason: default package */
/* loaded from: classes3.dex */
public final class ula implements wx7 {
    public final int b;
    public final /* synthetic */ vla c;

    public ula(vla vlaVar, int i) {
        this.c = vlaVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wx7) {
                wx7 wx7Var = (wx7) obj;
                if (c16.i(getPrefix(), wx7Var.getPrefix()) && c16.i(getNamespaceURI(), wx7Var.getNamespaceURI())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wx7
    public final String getNamespaceURI() {
        return this.c.a(this.b);
    }

    @Override // defpackage.wx7
    public final String getPrefix() {
        return this.c.b(this.b);
    }

    public final int hashCode() {
        return getNamespaceURI().hashCode() + (getPrefix().hashCode() * 31);
    }

    public final String toString() {
        return "{" + getPrefix() + ':' + getNamespaceURI() + '}';
    }
}
