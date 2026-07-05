package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xq6  reason: default package */
/* loaded from: classes3.dex */
public final class xq6 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final String i;
    public final List j;

    public xq6(long j, boolean z, boolean z2, String str, boolean z3, int i, int i2, boolean z4, String str2, List list) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.f = i;
        this.g = i2;
        this.h = z4;
        this.i = str2;
        this.j = list;
    }

    public static xq6 a(xq6 xq6Var, long j, boolean z, boolean z2, String str, boolean z3, int i, int i2, boolean z4, String str2, List list, int i3) {
        boolean z5;
        String str3;
        boolean z6;
        int i4;
        int i5;
        boolean z7;
        String str4;
        List list2;
        if ((i3 & 1) != 0) {
            j = xq6Var.a;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            z = xq6Var.b;
        }
        boolean z8 = z;
        if ((i3 & 4) != 0) {
            z5 = xq6Var.c;
        } else {
            z5 = z2;
        }
        if ((i3 & 8) != 0) {
            str3 = xq6Var.d;
        } else {
            str3 = str;
        }
        if ((i3 & 16) != 0) {
            z6 = xq6Var.e;
        } else {
            z6 = z3;
        }
        if ((i3 & 32) != 0) {
            i4 = xq6Var.f;
        } else {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            i5 = xq6Var.g;
        } else {
            i5 = i2;
        }
        if ((i3 & Token.CASE) != 0) {
            z7 = xq6Var.h;
        } else {
            z7 = z4;
        }
        if ((i3 & 256) != 0) {
            str4 = xq6Var.i;
        } else {
            str4 = str2;
        }
        if ((i3 & 512) != 0) {
            list2 = xq6Var.j;
        } else {
            list2 = list;
        }
        xq6Var.getClass();
        str3.getClass();
        str4.getClass();
        list2.getClass();
        return new xq6(j2, z8, z5, str3, z6, i4, i5, z7, str4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq6)) {
            return false;
        }
        xq6 xq6Var = (xq6) obj;
        if (this.a == xq6Var.a && this.b == xq6Var.b && this.c == xq6Var.c && c16.i(this.d, xq6Var.d) && this.e == xq6Var.e && this.f == xq6Var.f && this.g == xq6Var.g && this.h == xq6Var.h && c16.i(this.i, xq6Var.i) && c16.i(this.j, xq6Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + eub.j(eub.k(hl5.a(this.g, hl5.a(this.f, eub.k(eub.j(eub.k(eub.k(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "ListItemState(lastUpdateTime=" + this.a + ", isLoading=" + this.b + ", hasPageSource=" + this.c + ", pageSource=" + this.d + ", hasMore=" + this.e + ", displayType=" + this.f + ", columnSize=" + this.g + ", isError=" + this.h + ", errorMessage=" + this.i + ", books=" + this.j + ")";
    }

    public /* synthetic */ xq6() {
        this(0L, true, false, "", false, -1, 0, false, "", ks3.a);
    }
}
