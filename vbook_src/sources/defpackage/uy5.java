package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uy5  reason: default package */
/* loaded from: classes.dex */
public final class uy5 {
    public static final uy5 e = new uy5(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public uy5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        int e2 = (e() / 2) + this.a;
        return (((b() / 2) + this.b) & 4294967295L) | (e2 << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (e() << 32) | (b() & 4294967295L);
    }

    public final long d() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final int e() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy5)) {
            return false;
        }
        uy5 uy5Var = (uy5) obj;
        if (this.a == uy5Var.a && this.b == uy5Var.b && this.c == uy5Var.c && this.d == uy5Var.d) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.a < this.c && this.b < this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return hl5.j(this.c, this.d, ", ", ")", hl5.r(this.a, this.b, "IntRect.fromLTRB(", ", ", ", "));
    }
}
