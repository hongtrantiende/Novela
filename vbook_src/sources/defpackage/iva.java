package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iva  reason: default package */
/* loaded from: classes3.dex */
public final class iva implements tva {
    public final long a;

    public iva(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof iva) && this.a == ((iva) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nk2.t(this.a, "Foreground(colorArgb=", ")");
    }
}
