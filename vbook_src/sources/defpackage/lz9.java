package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lz9  reason: default package */
/* loaded from: classes.dex */
public final class lz9 {
    public static final long b = mz9.a(Float.NaN, Float.NaN);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ lz9(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float b(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        vs.k("ScaleFactorCompat is unspecified");
        return nae.e;
    }

    public static final float c(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        vs.k("ScaleFactorCompat is unspecified");
        return nae.e;
    }

    public static String d(long j) {
        if (j != b) {
            StringBuilder sb = new StringBuilder("ScaleFactorCompat(");
            float b2 = b(j) * 10.0f;
            int i = (int) b2;
            if (b2 - i >= 0.5f) {
                i++;
            }
            sb.append(i / 10.0f);
            sb.append(", ");
            float c2 = c(j) * 10.0f;
            int i2 = (int) c2;
            if (c2 - i2 >= 0.5f) {
                i2++;
            }
            sb.append(i2 / 10.0f);
            sb.append(')');
            return sb.toString();
        }
        return "ScaleFactorCompat.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lz9) {
            if (this.a != ((lz9) obj).a) {
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
        return d(this.a);
    }
}
