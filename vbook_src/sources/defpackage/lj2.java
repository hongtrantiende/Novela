package defpackage;

import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = xj2.class)
/* renamed from: lj2  reason: default package */
/* loaded from: classes3.dex */
public final class lj2 extends jj2 {
    public static final kj2 Companion = new Object();
    public final int d;

    public lj2(int i) {
        this.d = i;
        if (i > 0) {
            return;
        }
        p1a.k(hl5.l("Unit duration must be positive, but was ", " days.", i));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lj2) {
                if (this.d != ((lj2) obj).d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d ^ Parser.ARGC_LIMIT;
    }

    public final String toString() {
        int i = this.d;
        if (i % 7 == 0) {
            return qj2.a(i / 7, "WEEK");
        }
        return qj2.a(i, "DAY");
    }
}
