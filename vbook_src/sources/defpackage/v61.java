package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v61  reason: default package */
/* loaded from: classes3.dex */
public final class v61 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public v61(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v61)) {
            return false;
        }
        v61 v61Var = (v61) obj;
        if (zl1.c(this.a, v61Var.a) && zl1.c(this.b, v61Var.b) && zl1.c(this.c, v61Var.c) && zl1.c(this.d, v61Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.d) + hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
