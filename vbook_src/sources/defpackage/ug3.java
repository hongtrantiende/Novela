package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ug3  reason: default package */
/* loaded from: classes.dex */
public final class ug3 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String c(long j) {
        if (j != 9205357640488583168L) {
            return eub.o(rg3.c(b(j)), " x ", rg3.c(a(j)));
        }
        return "DpSize.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ug3) {
            if (this.a != ((ug3) obj).a) {
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
        return c(this.a);
    }
}
