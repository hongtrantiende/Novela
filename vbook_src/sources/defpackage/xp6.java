package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xp6  reason: default package */
/* loaded from: classes3.dex */
public final class xp6 {
    public final String a;
    public final int b;
    public final int c;

    public xp6(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                return;
            }
            p1a.k(a82.j(i2, "rangeEnd must be non-negative, got "));
            throw null;
        }
        p1a.k(a82.j(i, "rangeStart must be non-negative, got "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xp6) {
                xp6 xp6Var = (xp6) obj;
                if (!this.a.equals(xp6Var.a) || this.b != xp6Var.b || this.c != xp6Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rs8.g(this.c, ")", s21.s("LinkTarget(blockId=", pm0.a(this.a), ", rangeStart=", this.b, ", rangeEnd="));
    }
}
