package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u9c  reason: default package */
/* loaded from: classes.dex */
public final class u9c implements Comparable {
    public final long a;

    public /* synthetic */ u9c(long j) {
        this.a = j;
    }

    public static long a(long j) {
        long a = yq7.a();
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return wl3.k(xwe.g(j));
        }
        return xwe.q(a, j);
    }

    public static final long b(long j, long j2) {
        int i = yq7.b;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                hq7 hq7Var = wl3.b;
                return 0L;
            }
            return wl3.k(xwe.g(j2));
        } else if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return xwe.g(j);
        } else {
            return xwe.q(j, j2);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u9c u9cVar = (u9c) obj;
        u9cVar.getClass();
        return wl3.c(b(this.a, u9cVar.a), 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u9c) {
            if (this.a != ((u9c) obj).a) {
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
        return "ValueTimeMark(reading=" + this.a + ')';
    }
}
