package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ibb  reason: default package */
/* loaded from: classes3.dex */
public final class ibb {
    public static final hbb Companion = new Object();
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final long j;
    public final long k;

    public /* synthetic */ ibb(int i, String str, String str2, int i2, String str3, int i3, boolean z, boolean z2, boolean z3, long j, long j2, long j3) {
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
            this.c = 0;
        } else {
            this.c = i2;
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
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        if ((i & Token.CASE) == 0) {
            this.h = false;
        } else {
            this.h = z3;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j;
        }
        if ((i & 512) == 0) {
            this.j = 0L;
        } else {
            this.j = j2;
        }
        if ((i & 1024) == 0) {
            this.k = 0L;
        } else {
            this.k = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibb)) {
            return false;
        }
        ibb ibbVar = (ibb) obj;
        if (c16.i(this.a, ibbVar.a) && c16.i(this.b, ibbVar.b) && this.c == ibbVar.c && c16.i(this.d, ibbVar.d) && this.e == ibbVar.e && this.f == ibbVar.f && this.g == ibbVar.g && this.h == ibbVar.h && this.i == ibbVar.i && this.j == ibbVar.j && this.k == ibbVar.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + hl5.c(hl5.c(eub.k(eub.k(eub.k(hl5.a(this.e, eub.j(hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncChapter(id=", this.a, ", pathId=", this.b, ", position=");
        nk2.z(this.c, ", path=", this.d, ", count=", y);
        eub.w(y, this.e, ", downloaded=", this.f, ", pay=");
        rs8.z(y, this.g, ", lock=", this.h, ", lastRead=");
        y.append(this.i);
        rs8.x(y, ", createAt=", this.j, ", updateAt=");
        return hl5.q(y, this.k, ")");
    }

    public ibb(String str, String str2, int i, String str3, int i2, boolean z, boolean z2, boolean z3, long j, long j2, long j3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = j;
        this.j = j2;
        this.k = j3;
    }
}
