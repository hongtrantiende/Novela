package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mna  reason: default package */
/* loaded from: classes.dex */
public final class mna {
    public static final long b;
    public static final /* synthetic */ int c = 0;
    public final long a;

    static {
        ctd.p(nae.e, nae.e);
        b = ctd.p(Float.NaN, Float.NaN);
    }

    public static final float a(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        vs.k("SizeCompat is unspecified");
        return nae.e;
    }

    public static final float b(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        vs.k("SizeCompat is unspecified");
        return nae.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mna) {
            if (this.a != ((mna) obj).a) {
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
        long j = b;
        long j2 = this.a;
        if (j2 != j) {
            return "SizeCompat(" + yz1.A(b(j2)) + ", " + yz1.A(a(j2)) + ')';
        }
        return "SizeCompat.Unspecified";
    }
}
