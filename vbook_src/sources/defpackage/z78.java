package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z78  reason: default package */
/* loaded from: classes.dex */
public final class z78 {
    public static final long b = mue.b(nae.e, nae.e);
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        mue.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        c = mue.b(Float.NaN, Float.NaN);
    }

    public /* synthetic */ z78(long j) {
        this.a = j;
    }

    public static final long a(float f, long j) {
        return mue.b(b(j) / f, c(j) / f);
    }

    public static final float b(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        vs.k("OffsetCompat is unspecified");
        return nae.e;
    }

    public static final float c(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        vs.k("OffsetCompat is unspecified");
        return nae.e;
    }

    public static final long d(long j, long j2) {
        return mue.b(b(j) - b(j2), c(j) - c(j2));
    }

    public static final long e(long j, long j2) {
        return mue.b(b(j2) + b(j), c(j2) + c(j));
    }

    public static final long f(float f, long j) {
        return mue.b(b(j) * f, c(j) * f);
    }

    public static String g(long j) {
        if (j != c) {
            return "OffsetCompat(" + yz1.A(b(j)) + ", " + yz1.A(c(j)) + ')';
        }
        return "OffsetCompat.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z78) {
            if (this.a != ((z78) obj).a) {
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
        return g(this.a);
    }
}
