package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wza  reason: default package */
/* loaded from: classes3.dex */
public final class wza {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;

    public wza(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wza)) {
            return false;
        }
        wza wzaVar = (wza) obj;
        if (zl1.c(this.a, wzaVar.a) && zl1.c(this.b, wzaVar.b) && zl1.c(this.c, wzaVar.c) && zl1.c(this.d, wzaVar.d) && zl1.c(this.e, wzaVar.e) && zl1.c(this.f, wzaVar.f) && zl1.c(this.g, wzaVar.g) && zl1.c(this.h, wzaVar.h) && zl1.c(this.i, wzaVar.i) && zl1.c(this.j, wzaVar.j) && zl1.c(this.k, wzaVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.k) + hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31);
    }

    public final String toString() {
        String i = zl1.i(this.a);
        String i2 = zl1.i(this.b);
        String i3 = zl1.i(this.c);
        String i4 = zl1.i(this.d);
        String i5 = zl1.i(this.e);
        String i6 = zl1.i(this.f);
        String i7 = zl1.i(this.g);
        String i8 = zl1.i(this.h);
        String i9 = zl1.i(this.i);
        String i10 = zl1.i(this.j);
        String i11 = zl1.i(this.k);
        StringBuilder y = nk2.y("StatisticColors(readHighlightContainer=", i, ", readHighlightContent=", i2, ", listenHighlightContainer=");
        nk2.C(y, i3, ", listenHighlightContent=", i4, ", totalHighlightContainer=");
        nk2.C(y, i5, ", totalHighlightContent=", i6, ", readAccent=");
        nk2.C(y, i7, ", listenAccent=", i8, ", splitTrack=");
        nk2.C(y, i9, ", segmentDivider=", i10, ", tabTrack=");
        return s21.q(y, i11, ")");
    }
}
