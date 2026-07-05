package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: me9  reason: default package */
/* loaded from: classes3.dex */
public final class me9 {
    public final fb9 a;
    public final fb9 b;
    public final fb9 c;
    public final fb9 d;
    public final fb9 e;
    public final boolean f;
    public final long g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final boolean p;

    public me9(fb9 fb9Var, fb9 fb9Var2, fb9 fb9Var3, fb9 fb9Var4, fb9 fb9Var5, boolean z, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        this.a = fb9Var;
        this.b = fb9Var2;
        this.c = fb9Var3;
        this.d = fb9Var4;
        this.e = fb9Var5;
        this.f = z;
        this.g = j;
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = i6;
        this.o = z2;
        this.p = z3;
    }

    public static me9 a(me9 me9Var, fb9 fb9Var, fb9 fb9Var2, fb9 fb9Var3, fb9 fb9Var4, fb9 fb9Var5, boolean z, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3, int i7) {
        fb9 fb9Var6;
        fb9 fb9Var7;
        fb9 fb9Var8;
        fb9 fb9Var9;
        fb9 fb9Var10;
        boolean z4;
        long j3;
        long j4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        boolean z6;
        if ((i7 & 1) != 0) {
            fb9Var6 = me9Var.a;
        } else {
            fb9Var6 = fb9Var;
        }
        if ((i7 & 2) != 0) {
            fb9Var7 = me9Var.b;
        } else {
            fb9Var7 = fb9Var2;
        }
        if ((i7 & 4) != 0) {
            fb9Var8 = me9Var.c;
        } else {
            fb9Var8 = fb9Var3;
        }
        if ((i7 & 8) != 0) {
            fb9Var9 = me9Var.d;
        } else {
            fb9Var9 = fb9Var4;
        }
        if ((i7 & 16) != 0) {
            fb9Var10 = me9Var.e;
        } else {
            fb9Var10 = fb9Var5;
        }
        if ((i7 & 32) != 0) {
            z4 = me9Var.f;
        } else {
            z4 = z;
        }
        if ((i7 & 64) != 0) {
            j3 = me9Var.g;
        } else {
            j3 = j;
        }
        if ((i7 & Token.CASE) != 0) {
            j4 = me9Var.h;
        } else {
            j4 = j2;
        }
        if ((i7 & 256) != 0) {
            i8 = me9Var.i;
        } else {
            i8 = i;
        }
        if ((i7 & 512) != 0) {
            i9 = me9Var.j;
        } else {
            i9 = i2;
        }
        if ((i7 & 1024) != 0) {
            i10 = me9Var.k;
        } else {
            i10 = i3;
        }
        if ((i7 & 2048) != 0) {
            i11 = me9Var.l;
        } else {
            i11 = i4;
        }
        fb9 fb9Var11 = fb9Var6;
        if ((i7 & 4096) != 0) {
            i12 = me9Var.m;
        } else {
            i12 = i5;
        }
        int i14 = i12;
        if ((i7 & 8192) != 0) {
            i13 = me9Var.n;
        } else {
            i13 = i6;
        }
        int i15 = i13;
        if ((i7 & 16384) != 0) {
            z5 = me9Var.o;
        } else {
            z5 = z2;
        }
        if ((i7 & 32768) != 0) {
            z6 = me9Var.p;
        } else {
            z6 = z3;
        }
        me9Var.getClass();
        return new me9(fb9Var11, fb9Var7, fb9Var8, fb9Var9, fb9Var10, z4, j3, j4, i8, i9, i10, i11, i14, i15, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me9)) {
            return false;
        }
        me9 me9Var = (me9) obj;
        if (c16.i(this.a, me9Var.a) && c16.i(this.b, me9Var.b) && c16.i(this.c, me9Var.c) && c16.i(this.d, me9Var.d) && c16.i(this.e, me9Var.e) && this.f == me9Var.f && this.g == me9Var.g && this.h == me9Var.h && this.i == me9Var.i && this.j == me9Var.j && this.k == me9Var.k && this.l == me9Var.l && this.m == me9Var.m && this.n == me9Var.n && this.o == me9Var.o && this.p == me9Var.p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        fb9 fb9Var = this.a;
        if (fb9Var == null) {
            hashCode = 0;
        } else {
            hashCode = fb9Var.hashCode();
        }
        int i2 = hashCode * 31;
        fb9 fb9Var2 = this.b;
        if (fb9Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fb9Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        fb9 fb9Var3 = this.c;
        if (fb9Var3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fb9Var3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        fb9 fb9Var4 = this.d;
        if (fb9Var4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fb9Var4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        fb9 fb9Var5 = this.e;
        if (fb9Var5 != null) {
            i = fb9Var5.hashCode();
        }
        return Boolean.hashCode(this.p) + eub.k(hl5.a(this.n, hl5.a(this.m, hl5.a(this.l, hl5.a(this.k, hl5.a(this.j, hl5.a(this.i, hl5.c(hl5.c(eub.k((i5 + i) * 31, 31, this.f), this.g, 31), this.h, 31), 31), 31), 31), 31), 31), 31), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QtSettingState(vietPhrase=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", phienAm=");
        sb.append(this.c);
        sb.append(", pronouns=");
        sb.append(this.d);
        sb.append(", luatNhan=");
        sb.append(this.e);
        sb.append(", isDownloading=");
        sb.append(this.f);
        sb.append(", downloadProgress=");
        sb.append(this.g);
        rs8.x(sb, ", downloadTotal=", this.h, ", nameVpPriority=");
        rs8.q(this.i, this.j, ", personalGeneralPriority=", ", vpPriority=", sb);
        rs8.q(this.k, this.l, ", longestWord=", ", luatNhanMode=", sb);
        rs8.q(this.m, this.n, ", wordBreakMode=", ", isAutoConvertSimplified=", sb);
        sb.append(this.o);
        sb.append(", isDialogueItalicized=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
