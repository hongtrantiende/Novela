package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: itc  reason: default package */
/* loaded from: classes3.dex */
public final class itc implements Comparable {
    public final byte a;

    public /* synthetic */ itc(byte b) {
        this.a = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return c16.l(this.a & 255, ((itc) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof itc) {
            if (this.a != ((itc) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
