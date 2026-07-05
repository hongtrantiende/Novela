package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hcb  reason: default package */
/* loaded from: classes3.dex */
public final class hcb implements jcb {
    public final String a;

    public hcb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hcb) && c16.i(this.a, ((hcb) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return hl5.n("WebDavTestFailed(message=", this.a, ")");
    }
}
