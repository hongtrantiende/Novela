package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ea8  reason: default package */
/* loaded from: classes3.dex */
public final class ea8 {
    public static final da8 Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final long h;

    public /* synthetic */ ea8(int i, String str, String str2, String str3, int i2, int i3, int i4, boolean z, long j) {
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
            this.d = 0;
        } else {
            this.d = i2;
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
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0L;
        } else {
            this.h = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea8)) {
            return false;
        }
        ea8 ea8Var = (ea8) obj;
        if (c16.i(this.a, ea8Var.a) && c16.i(this.b, ea8Var.b) && c16.i(this.c, ea8Var.c) && this.d == ea8Var.d && this.e == ea8Var.e && this.f == ea8Var.f && this.g == ea8Var.g && this.h == ea8Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + eub.k(hl5.a(this.f, hl5.a(this.e, hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder y = nk2.y("OldSyncDownload(id=", this.a, ", name=", this.b, ", cover=");
        a82.u(this.d, this.c, ", downloadStatus=", ", downloaded=", y);
        rs8.q(this.e, this.f, ", chapterCount=", ", isFromLastRead=", y);
        y.append(this.g);
        y.append(", timestamp=");
        y.append(this.h);
        y.append(")");
        return y.toString();
    }
}
