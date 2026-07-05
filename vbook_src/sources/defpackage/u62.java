package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: u62  reason: default package */
/* loaded from: classes3.dex */
public final class u62 {
    public static final t62 Companion = new Object();
    public final int a;

    public /* synthetic */ u62(int i, int i2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u62) && this.a == ((u62) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.l("ConversationUnreadCountDto(unreadCount=", ")", this.a);
    }
}
