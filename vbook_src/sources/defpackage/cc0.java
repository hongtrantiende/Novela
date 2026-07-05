package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cc0  reason: default package */
/* loaded from: classes.dex */
public final class cc0 extends ja2 {
    public final String a;
    public final String b;

    public cc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ja2) {
            cc0 cc0Var = (cc0) ((ja2) obj);
            if (this.a.equals(cc0Var.a) && this.b.equals(cc0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return s21.q(sb, this.b, "}");
    }
}
