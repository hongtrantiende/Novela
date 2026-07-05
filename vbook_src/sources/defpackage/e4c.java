package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e4c  reason: default package */
/* loaded from: classes.dex */
public final class e4c {
    public static final f4c[] b = {new f4c(0), new f4c(4294967296L), new f4c(8589934592L)};
    public static final long c = zr1.x(Float.NaN, 0);
    public final long a;

    public /* synthetic */ e4c(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean d(long j) {
        if ((j & 1095216660480L) == 8589934592L) {
            return true;
        }
        return false;
    }

    public static String e(long j) {
        long b2 = b(j);
        if (f4c.a(b2, 0L)) {
            return "Unspecified";
        }
        if (f4c.a(b2, 4294967296L)) {
            float c2 = c(j);
            return c2 + ".sp";
        } else if (f4c.a(b2, 8589934592L)) {
            float c3 = c(j);
            return c3 + ".em";
        } else {
            return "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e4c) {
            if (this.a != ((e4c) obj).a) {
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
        return e(this.a);
    }
}
