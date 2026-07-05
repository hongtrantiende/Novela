package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oz9  reason: default package */
/* loaded from: classes3.dex */
public final class oz9 {
    public final xr4 a;
    public final pi8 b;
    public final long c;

    public /* synthetic */ oz9(long j, int i) {
        this(null, null, (i & 4) != 0 ? 0L : j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oz9) {
                oz9 oz9Var = (oz9) obj;
                if (!c16.i(this.a, oz9Var.a) || !c16.i(this.b, oz9Var.b) || !zy5.b(this.c, oz9Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        xr4 xr4Var = this.a;
        if (xr4Var == null) {
            hashCode = 0;
        } else {
            hashCode = xr4Var.hashCode();
        }
        int i2 = hashCode * 31;
        pi8 pi8Var = this.b;
        if (pi8Var != null) {
            i = pi8Var.hashCode();
        }
        return Long.hashCode(this.c) + ((i2 + i) * 31);
    }

    public final String toString() {
        String c = zy5.c(this.c);
        StringBuilder sb = new StringBuilder("ScaledCache(key=");
        sb.append(this.a);
        sb.append(", tile=");
        sb.append(this.b);
        sb.append(", pageSize=");
        return s21.q(sb, c, ")");
    }

    public oz9(xr4 xr4Var, pi8 pi8Var, long j) {
        this.a = xr4Var;
        this.b = pi8Var;
        this.c = j;
    }
}
