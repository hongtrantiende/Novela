package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f23  reason: default package */
/* loaded from: classes.dex */
public final class f23 {
    public static final f23 c = new f23(0, 0);
    public final long a;
    public final long b;

    public f23(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f23) {
            f23 f23Var = (f23) obj;
            if (zy5.b(this.a, f23Var.a) && this.b == f23Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
