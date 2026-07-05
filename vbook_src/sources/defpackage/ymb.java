package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ymb  reason: default package */
/* loaded from: classes3.dex */
public final class ymb {
    public final List a;

    public ymb(List list) {
        list.getClass();
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ymb) && c16.i(this.a, ((ymb) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TextBookmarkState(bookmarks=" + this.a + ")";
    }
}
