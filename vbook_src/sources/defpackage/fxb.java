package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fxb  reason: default package */
/* loaded from: classes.dex */
public final class fxb {
    public static final long b = sze.a(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ fxb(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        boolean z;
        boolean z2 = false;
        if (g(j) <= g(j2)) {
            z = true;
        } else {
            z = false;
        }
        if (f(j2) <= f(j)) {
            z2 = true;
        }
        return z & z2;
    }

    public static boolean b(Object obj, long j) {
        if (!(obj instanceof fxb) || j != ((fxb) obj).a) {
            return false;
        }
        return true;
    }

    public static final boolean c(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j) {
        if (((int) (j >> 32)) == ((int) (j & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static final int e(long j) {
        return f(j) - g(j);
    }

    public static final int f(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int g(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean h(long j) {
        if (((int) (j >> 32)) > ((int) (j & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static String i(long j) {
        return hl5.i((int) (j >> 32), (int) (j & 4294967295L), "TextRange(", ", ", ")");
    }

    public final boolean equals(Object obj) {
        return b(obj, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
