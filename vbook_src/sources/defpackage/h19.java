package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h19  reason: default package */
/* loaded from: classes.dex */
public final class h19 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof h19) {
            if (this.a != ((h19) obj).a) {
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
        return hl5.l("PointerKeyboardModifiers(packedValue=", ")", this.a);
    }
}
