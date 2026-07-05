package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: rbb  reason: default package */
/* loaded from: classes3.dex */
public final class rbb {
    public static final qbb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;

    public /* synthetic */ rbb(int i, String str, String str2, String str3, boolean z, long j, long j2, long j3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j2;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbb)) {
            return false;
        }
        rbb rbbVar = (rbb) obj;
        if (c16.i(this.a, rbbVar.a) && c16.i(this.b, rbbVar.b) && c16.i(this.c, rbbVar.c) && this.d == rbbVar.d && this.e == rbbVar.e && this.f == rbbVar.f && this.g == rbbVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + hl5.c(hl5.c(eub.k(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncDomain(id=", this.a, ", domain=", this.b, ", replace=");
        rs8.y(y, this.c, ", enabled=", this.d, ", position=");
        y.append(this.e);
        rs8.x(y, ", createAt=", this.f, ", updateAt=");
        return hl5.q(y, this.g, ")");
    }

    public rbb(String str, String str2, String str3, boolean z, long j, long j2, long j3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }
}
