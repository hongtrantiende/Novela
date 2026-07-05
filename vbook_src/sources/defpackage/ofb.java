package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ofb  reason: default package */
/* loaded from: classes3.dex */
public final class ofb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public ofb(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofb)) {
            return false;
        }
        ofb ofbVar = (ofb) obj;
        if (this.a == ofbVar.a && this.b == ofbVar.b && this.c == ofbVar.c && this.d == ofbVar.d && this.e == ofbVar.e && this.f == ofbVar.f && this.g == ofbVar.g && this.h == ofbVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder o = rs8.o(this.a, "SyntaxColors(keyword=", ", string=");
        o.append(this.b);
        rs8.x(o, ", comment=", this.c, ", number=");
        o.append(this.d);
        rs8.x(o, ", function=", this.e, ", type=");
        o.append(this.f);
        rs8.x(o, ", variable=", this.g, ", operator=");
        return hl5.q(o, this.h, ")");
    }
}
