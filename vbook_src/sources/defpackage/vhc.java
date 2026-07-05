package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: vhc  reason: default package */
/* loaded from: classes3.dex */
public final class vhc {
    public static final uhc Companion = new Object();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final vzc g;
    public final int h;
    public final String i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final long n;
    public final long o;

    /* JADX WARN: Type inference failed for: r0v0, types: [uhc, java.lang.Object] */
    static {
        uzc uzcVar = vzc.Companion;
    }

    public /* synthetic */ vhc(int i, int i2, String str, String str2, String str3, int i3, int i4, vzc vzcVar, int i5, String str4, int i6, boolean z, boolean z2, int i7, long j, long j2) {
        long j3;
        long j4;
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i4;
        }
        if ((i & 64) == 0) {
            this.g = new vzc();
        } else {
            this.g = vzcVar;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0;
        } else {
            this.h = i5;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i6;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z2;
        }
        if ((i & 4096) == 0) {
            this.m = 0;
        } else {
            this.m = i7;
        }
        if ((i & 8192) == 0) {
            j3 = -1;
        } else {
            j3 = j;
        }
        this.n = j3;
        if ((i & 16384) == 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
        this.o = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhc)) {
            return false;
        }
        vhc vhcVar = (vhc) obj;
        if (this.a == vhcVar.a && c16.i(this.b, vhcVar.b) && c16.i(this.c, vhcVar.c) && c16.i(this.d, vhcVar.d) && this.e == vhcVar.e && this.f == vhcVar.f && c16.i(this.g, vhcVar.g) && this.h == vhcVar.h && c16.i(this.i, vhcVar.i) && this.j == vhcVar.j && this.k == vhcVar.k && this.l == vhcVar.l && this.m == vhcVar.m && this.n == vhcVar.n && this.o == vhcVar.o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a = hl5.a(this.f, hl5.a(this.e, eub.j(eub.j(eub.j(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
        return Long.hashCode(this.o) + hl5.c(hl5.a(this.m, eub.k(eub.k(hl5.a(this.j, eub.j(hl5.a(this.h, (this.g.hashCode() + a) * 31, 31), 31, this.i), 31), 31, this.k), 31, this.l), 31), this.n, 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("TopicDto(id=", this.a, ", title=", this.b, ", content=");
        nk2.C(r, this.c, ", background=", this.d, ", category=");
        rs8.q(this.e, this.f, ", type=", ", user=", r);
        r.append(this.g);
        r.append(", status=");
        r.append(this.h);
        r.append(", tag=");
        a82.u(this.j, this.i, ", likes=", ", liked=", r);
        rs8.z(r, this.k, ", pined=", this.l, ", comments=");
        r.append(this.m);
        r.append(", updatedAt=");
        r.append(this.n);
        return a82.n(r, ", createdAt=", this.o, ")");
    }
}
