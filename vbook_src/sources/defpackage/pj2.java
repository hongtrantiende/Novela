package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = h9c.class)
/* renamed from: pj2  reason: default package */
/* loaded from: classes3.dex */
public final class pj2 extends qj2 {
    public static final oj2 Companion = new Object();
    public final long d;
    public final String e;
    public final long f;

    public pj2(long j) {
        this.d = j;
        if (j > 0) {
            if (j % 3600000000000L == 0) {
                this.e = "HOUR";
                this.f = j / 3600000000000L;
                return;
            } else if (j % 60000000000L == 0) {
                this.e = "MINUTE";
                this.f = j / 60000000000L;
                return;
            } else if (j % 1000000000 == 0) {
                this.e = "SECOND";
                this.f = j / 1000000000;
                return;
            } else if (j % 1000000 == 0) {
                this.e = "MILLISECOND";
                this.f = j / 1000000;
                return;
            } else if (j % 1000 == 0) {
                this.e = "MICROSECOND";
                this.f = j / 1000;
                return;
            } else {
                this.e = "NANOSECOND";
                this.f = j;
                return;
            }
        }
        p1a.k(nk2.t(j, "Unit duration must be positive, but was ", " ns."));
        throw null;
    }

    public final pj2 b(int i) {
        return new pj2(Math.multiplyExact(this.d, i));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pj2) {
                if (this.d != ((pj2) obj).d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.d;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final String toString() {
        String str = this.e;
        str.getClass();
        long j = this.f;
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }
}
