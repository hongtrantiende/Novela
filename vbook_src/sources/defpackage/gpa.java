package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gpa  reason: default package */
/* loaded from: classes.dex */
public final class gpa {
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

    public gpa(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return this.b;
            }
            return this.d;
        } else if (z2) {
            return this.g;
        } else {
            return this.i;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gpa)) {
            return false;
        }
        gpa gpaVar = (gpa) obj;
        if (zl1.c(this.a, gpaVar.a) && zl1.c(this.b, gpaVar.b) && zl1.c(this.c, gpaVar.c) && zl1.c(this.d, gpaVar.d) && zl1.c(this.e, gpaVar.e) && zl1.c(this.f, gpaVar.f) && zl1.c(this.g, gpaVar.g) && zl1.c(this.h, gpaVar.h) && zl1.c(this.i, gpaVar.i) && zl1.c(this.j, gpaVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.j) + hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
    }
}
