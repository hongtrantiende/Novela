package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rg9  reason: default package */
/* loaded from: classes.dex */
public final class rg9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public rg9(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rg9)) {
            return false;
        }
        rg9 rg9Var = (rg9) obj;
        if (zl1.c(this.a, rg9Var.a) && zl1.c(this.b, rg9Var.b) && zl1.c(this.c, rg9Var.c) && zl1.c(this.d, rg9Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.d) + hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
