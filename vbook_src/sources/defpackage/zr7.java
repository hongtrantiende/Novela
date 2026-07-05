package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zr7  reason: default package */
/* loaded from: classes.dex */
public final class zr7 {
    public final long a;
    public final long b;
    public final boolean c;

    public zr7(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final zr7 a(zr7 zr7Var) {
        return new zr7(y78.j(this.a, zr7Var.a), Math.max(this.b, zr7Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zr7) {
                zr7 zr7Var = (zr7) obj;
                if (!y78.d(this.a, zr7Var.a) || this.b != zr7Var.b || this.c != zr7Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + hl5.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String l = y78.l(this.a);
        return "MouseWheelScrollDelta(value=" + l + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
