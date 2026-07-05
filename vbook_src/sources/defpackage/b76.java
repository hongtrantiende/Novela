package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b76  reason: default package */
/* loaded from: classes.dex */
public final class b76 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public b76(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b76)) {
            return false;
        }
        b76 b76Var = (b76) obj;
        if (this.a == b76Var.a && this.b == b76Var.b && this.c == b76Var.c && this.d == b76Var.d && this.e == b76Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "KF8Header(fdst=", ", numFdst=", ", frag=");
        rs8.q(this.c, this.d, ", skel=", ", guide=", r);
        return rs8.g(this.e, ")", r);
    }
}
