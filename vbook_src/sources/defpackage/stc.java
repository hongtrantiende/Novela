package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: stc  reason: default package */
/* loaded from: classes3.dex */
public final class stc implements Comparable {
    public final long a;

    public /* synthetic */ stc(long j) {
        this.a = j;
    }

    public static String a(long j) {
        if (j >= 0) {
            nqe.u(10);
            String l = Long.toString(j, 10);
            l.getClass();
            return l;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        nqe.u(10);
        String l2 = Long.toString(j2, 10);
        l2.getClass();
        nqe.u(10);
        String l3 = Long.toString(j3, 10);
        l3.getClass();
        return l2.concat(l3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c16.m(this.a ^ Long.MIN_VALUE, ((stc) obj).a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof stc) {
            if (this.a != ((stc) obj).a) {
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
        return a(this.a);
    }
}
