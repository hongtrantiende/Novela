package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xfc  reason: default package */
/* loaded from: classes.dex */
public final class xfc {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public xfc(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xfc)) {
            return false;
        }
        xfc xfcVar = (xfc) obj;
        if (zl1.c(this.a, xfcVar.a) && zl1.c(this.b, xfcVar.b) && zl1.c(this.c, xfcVar.c) && zl1.c(this.d, xfcVar.d) && zl1.c(this.e, xfcVar.e) && zl1.c(this.f, xfcVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.f) + hl5.c(hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }
}
