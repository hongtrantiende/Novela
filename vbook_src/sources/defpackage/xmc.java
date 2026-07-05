package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xmc  reason: default package */
/* loaded from: classes3.dex */
public final class xmc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public xmc(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
    }

    public static xmc a(xmc xmcVar, int i, int i2) {
        return new xmc(i, xmcVar.b, i2, xmcVar.f, xmcVar.d, xmcVar.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmc)) {
            return false;
        }
        xmc xmcVar = (xmc) obj;
        if (this.a == xmcVar.a && this.b == xmcVar.b && this.c == xmcVar.c && this.d == xmcVar.d && this.e == xmcVar.e && this.f == xmcVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + hl5.a(this.e, hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "Segment(srcStart=", ", srcLen=", ", transStart=");
        rs8.q(this.c, this.d, ", transLen=", ", type=", r);
        r.append(this.e);
        r.append(", isPriv=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
