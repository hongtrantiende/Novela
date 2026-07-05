package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: zab  reason: default package */
/* loaded from: classes3.dex */
public final class zab {
    public static final yab Companion = new Object();
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final long j;

    public /* synthetic */ zab(int i, String str, int i2, String str2, int i3, String str3, String str4, String str5, long j, long j2, long j3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str5;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0L;
        } else {
            this.h = j;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j2;
        }
        if ((i & 512) == 0) {
            this.j = 0L;
        } else {
            this.j = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zab)) {
            return false;
        }
        zab zabVar = (zab) obj;
        if (c16.i(this.a, zabVar.a) && this.b == zabVar.b && c16.i(this.c, zabVar.c) && this.d == zabVar.d && c16.i(this.e, zabVar.e) && c16.i(this.f, zabVar.f) && c16.i(this.g, zabVar.g) && this.h == zabVar.h && this.i == zabVar.i && this.j == zabVar.j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + hl5.c(hl5.c(eub.j(eub.j(eub.j(hl5.a(this.d, eub.j(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), this.h, 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("SyncBookmark(id=", this.a, ", chapterIndex=", this.b, ", chapterName=");
        a82.u(this.d, this.c, ", type=", ", content=", s);
        nk2.C(s, this.e, ", description=", this.f, ", color=");
        s.append(this.g);
        s.append(", startPosition=");
        s.append(this.h);
        rs8.x(s, ", endPosition=", this.i, ", createAt=");
        return hl5.q(s, this.j, ")");
    }

    public zab(String str, int i, String str2, int i2, String str3, String str4, String str5, long j, long j2, long j3) {
        s21.B(str, str2, str3, str4, str5);
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = j;
        this.i = j2;
        this.j = j3;
    }
}
