package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rb0  reason: default package */
/* loaded from: classes.dex */
public final class rb0 extends ba2 {
    public final String a;
    public final String b;
    public final long c;

    public rb0(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ba2) {
            rb0 rb0Var = (rb0) ((ba2) obj);
            if (this.a.equals(rb0Var.a) && this.b.equals(rb0Var.b) && this.c == rb0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        return ((int) ((j >>> 32) ^ j)) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return hl5.q(sb, this.c, "}");
    }
}
