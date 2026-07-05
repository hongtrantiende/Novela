package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n32  reason: default package */
/* loaded from: classes.dex */
public final class n32 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public n32(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n32)) {
            return false;
        }
        n32 n32Var = (n32) obj;
        if (zl1.c(this.a, n32Var.a) && zl1.c(this.b, n32Var.b) && zl1.c(this.c, n32Var.c) && zl1.c(this.d, n32Var.d) && zl1.c(this.e, n32Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.e) + hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String i = zl1.i(this.a);
        String i2 = zl1.i(this.b);
        String i3 = zl1.i(this.c);
        String i4 = zl1.i(this.d);
        String i5 = zl1.i(this.e);
        StringBuilder y = nk2.y("ContextMenuColors(backgroundColor=", i, ", textColor=", i2, ", iconColor=");
        nk2.C(y, i3, ", disabledTextColor=", i4, ", disabledIconColor=");
        return s21.q(y, i5, ")");
    }
}
