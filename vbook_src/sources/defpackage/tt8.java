package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tt8  reason: default package */
/* loaded from: classes.dex */
public final class tt8 implements vt8 {
    public final boolean a;

    public tt8(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tt8) && this.a == ((tt8) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "Denied(shouldShowRationale=" + this.a + ")";
    }
}
