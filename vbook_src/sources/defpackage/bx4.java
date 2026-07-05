package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bx4  reason: default package */
/* loaded from: classes3.dex */
public final class bx4 {
    public long a = -1;
    public long b = 9205357640488583168L;
    public long c = 9205357640488583168L;
    public long d = 9205357640488583168L;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bx4) {
            bx4 bx4Var = (bx4) obj;
            if (y09.a(this.a, bx4Var.a) && y78.d(this.b, bx4Var.b) && y78.d(this.c, bx4Var.c) && y78.d(this.d, bx4Var.d) && this.e == bx4Var.e && this.f == bx4Var.f && this.g == bx4Var.g && this.h == bx4Var.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + eub.k(eub.k(hl5.a(this.f, hl5.a(this.e, hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String b = y09.b(this.a);
        String l = y78.l(this.b);
        String l2 = y78.l(this.c);
        String l3 = y78.l(this.d);
        int i = this.e;
        int i2 = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder y = nk2.y("GestureData(dragId=", b, ", firstPos=", l, ", pos=");
        nk2.C(y, l2, ", nextPos=", l3, ", pointers=");
        rs8.q(i, i2, ", maxPointers=", ", isDrag=", y);
        y.append(z);
        y.append(", isZoom=");
        y.append(z2);
        y.append(", isTap=false)");
        return y.toString();
    }
}
