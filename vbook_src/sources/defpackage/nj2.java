package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = br7.class)
/* renamed from: nj2  reason: default package */
/* loaded from: classes3.dex */
public final class nj2 extends jj2 {
    public static final mj2 Companion = new Object();
    public final int d;

    public nj2(int i) {
        this.d = i;
        if (i > 0) {
            return;
        }
        p1a.k(hl5.l("Unit duration must be positive, but was ", " months.", i));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nj2) {
                if (this.d != ((nj2) obj).d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d ^ 131072;
    }

    public final String toString() {
        int i = this.d;
        if (i % 1200 == 0) {
            return qj2.a(i / 1200, "CENTURY");
        }
        if (i % 12 == 0) {
            return qj2.a(i / 12, "YEAR");
        }
        if (i % 3 == 0) {
            return qj2.a(i / 3, "QUARTER");
        }
        return qj2.a(i, "MONTH");
    }
}
