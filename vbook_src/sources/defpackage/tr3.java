package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tr3  reason: default package */
/* loaded from: classes3.dex */
public final class tr3 {
    public final boolean a;
    public final List b;
    public final List c;

    public tr3(boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tr3) {
                tr3 tr3Var = (tr3) obj;
                if (this.a != tr3Var.a || !c16.i(this.b, tr3Var.b) || !c16.i(this.c, tr3Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.l(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiState(isLoading=");
        sb.append(this.a);
        sb.append(", recentEmojis=");
        sb.append(this.b);
        sb.append(", emojiCategories=");
        return rs8.n(sb, this.c, ")");
    }
}
