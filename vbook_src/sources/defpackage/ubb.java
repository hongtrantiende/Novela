package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ubb  reason: default package */
/* loaded from: classes3.dex */
public final class ubb {
    public static final tbb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final long l;

    public /* synthetic */ ubb(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        long j2;
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
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i2;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i3;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0;
        } else {
            this.h = i4;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i5;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i6;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i7;
        }
        if ((i & 2048) == 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        this.l = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubb)) {
            return false;
        }
        ubb ubbVar = (ubb) obj;
        if (c16.i(this.a, ubbVar.a) && c16.i(this.b, ubbVar.b) && c16.i(this.c, ubbVar.c) && c16.i(this.d, ubbVar.d) && c16.i(this.e, ubbVar.e) && this.f == ubbVar.f && this.g == ubbVar.g && this.h == ubbVar.h && this.i == ubbVar.i && this.j == ubbVar.j && this.k == ubbVar.k && this.l == ubbVar.l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.l) + hl5.a(this.k, hl5.a(this.j, hl5.a(this.i, hl5.a(this.h, hl5.a(this.g, hl5.a(this.f, eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncDownload(id=", this.a, ", bookId=", this.b, ", title=");
        nk2.C(y, this.c, ", image=", this.d, ", path=");
        a82.u(this.f, this.e, ", start=", ", end=", y);
        rs8.q(this.g, this.h, ", downloaded=", ", total=", y);
        rs8.q(this.i, this.j, ", type=", ", status=", y);
        y.append(this.k);
        y.append(", createAt=");
        y.append(this.l);
        y.append(")");
        return y.toString();
    }

    public ubb(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        s21.B(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = j;
    }
}
