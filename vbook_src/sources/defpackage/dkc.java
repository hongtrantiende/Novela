package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dkc  reason: default package */
/* loaded from: classes.dex */
public final class dkc {
    public static final /* synthetic */ int b = 0;
    public final long a;

    static {
        ekc.a(0.5f, 0.5f);
    }

    public /* synthetic */ dkc(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static String b(long j) {
        return "TransformOriginCompat(" + yz1.k(2, Float.intBitsToFloat((int) (j >> 32))) + ", " + yz1.k(2, Float.intBitsToFloat((int) (j & 4294967295L))) + "))";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dkc) {
            if (this.a != ((dkc) obj).a) {
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
        return b(this.a);
    }
}
