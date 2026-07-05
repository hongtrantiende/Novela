package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c0d  reason: default package */
/* loaded from: classes3.dex */
public final class c0d {
    public final boolean a;

    public c0d(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c0d) || this.a != ((c0d) obj).a) {
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
        return "UserInfoState(isCreatingConversation=" + this.a + ")";
    }
}
