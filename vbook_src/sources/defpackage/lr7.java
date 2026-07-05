package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lr7  reason: default package */
/* loaded from: classes.dex */
public final class lr7 {
    public final long a;

    public /* synthetic */ lr7(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lr7) {
            if (this.a != ((lr7) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nk2.t(this.a, "IndirectPointerEventData(packedValue=", ")");
    }
}
