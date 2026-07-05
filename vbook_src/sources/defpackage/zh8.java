package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zh8  reason: default package */
/* loaded from: classes.dex */
public final class zh8 {
    public final long a;
    public final long b;
    public final boolean c;

    public zh8(long j, int i) {
        j = (i & 1) != 0 ? zl1.e : j;
        long j2 = zl1.b;
        this.a = j;
        this.b = j2;
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zh8) {
                zh8 zh8Var = (zh8) obj;
                if (!zl1.c(this.a, zh8Var.a) || !zl1.c(this.b, zh8Var.b) || this.c != zh8Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Boolean.hashCode(this.c) + hl5.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("PageColors(backgroundColor=", zl1.i(this.a), ", progressIndicatorColor=", zl1.i(this.b), ", alwaysShowBackground="), this.c);
    }
}
