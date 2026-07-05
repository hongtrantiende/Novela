package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yc0  reason: default package */
/* loaded from: classes.dex */
public final class yc0 {
    public final long a;
    public final ld0 b;
    public final jc0 c;

    public yc0(long j, ld0 ld0Var, jc0 jc0Var) {
        this.a = j;
        this.b = ld0Var;
        this.c = jc0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof yc0) {
                yc0 yc0Var = (yc0) obj;
                if (this.a == yc0Var.a && this.b.equals(yc0Var.b) && this.c.equals(yc0Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
