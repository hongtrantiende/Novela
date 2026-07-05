package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zyb  reason: default package */
/* loaded from: classes3.dex */
public final class zyb extends kzb {
    public final boolean a;

    public zyb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zyb) || this.a != ((zyb) obj).a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "ChangeExpand(isExpand=" + this.a + ")";
    }
}
