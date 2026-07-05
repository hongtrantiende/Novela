package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r23  reason: default package */
/* loaded from: classes3.dex */
public final class r23 implements s23 {
    public final ps a;

    public r23(ps psVar) {
        this.a = psVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof r23) || !this.a.equals(((r23) obj).a)) {
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
        return "Text(text=" + ((Object) this.a) + ")";
    }
}
