package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nqb  reason: default package */
/* loaded from: classes3.dex */
public final class nqb implements erb {
    public final String a;

    public nqb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof nqb) || !this.a.equals(((nqb) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("FeatureNotSupport(featureName=", this.a, ")");
    }
}
