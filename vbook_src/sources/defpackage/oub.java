package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oub  reason: default package */
/* loaded from: classes.dex */
public final class oub {
    public final int a;

    public /* synthetic */ oub(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oub) {
            if (this.a != ((oub) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.l("TextHighlightType(value=", ")", this.a);
    }
}
