package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ra1  reason: default package */
/* loaded from: classes.dex */
public final class ra1 {
    public int a;
    public int b;
    public int c;
    public int d;

    public ra1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra1)) {
            return false;
        }
        ra1 ra1Var = (ra1) obj;
        if (this.a == ra1Var.a && this.b == ra1Var.b && this.c == ra1Var.c && this.d == ra1Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return hl5.j(this.c, this.d, ", originalEnd=", ")", hl5.r(this.a, this.b, "Change(preStart=", ", preEnd=", ", originalStart="));
    }
}
