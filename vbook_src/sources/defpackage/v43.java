package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v43  reason: default package */
/* loaded from: classes3.dex */
public final class v43 {
    public final boolean a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final k23 i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;

    public v43(boolean z, String str, String str2, List list, int i, boolean z2, boolean z3, String str3, k23 k23Var, boolean z4, String str4, boolean z5, boolean z6) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = i;
        this.f = z2;
        this.g = z3;
        this.h = str3;
        this.i = k23Var;
        this.j = z4;
        this.k = str4;
        this.l = z5;
        this.m = z6;
    }

    public static v43 a(v43 v43Var, boolean z, String str, String str2, List list, int i, boolean z2, boolean z3, String str3, k23 k23Var, boolean z4, String str4, boolean z5, boolean z6, int i2) {
        String str5;
        String str6;
        List list2;
        int i3;
        boolean z7;
        boolean z8;
        String str7;
        k23 k23Var2;
        boolean z9;
        String str8;
        boolean z10;
        boolean z11;
        if ((i2 & 1) != 0) {
            z = v43Var.a;
        }
        boolean z12 = z;
        if ((i2 & 2) != 0) {
            str5 = v43Var.b;
        } else {
            str5 = str;
        }
        if ((i2 & 4) != 0) {
            str6 = v43Var.c;
        } else {
            str6 = str2;
        }
        if ((i2 & 8) != 0) {
            list2 = v43Var.d;
        } else {
            list2 = list;
        }
        if ((i2 & 16) != 0) {
            i3 = v43Var.e;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            z7 = v43Var.f;
        } else {
            z7 = z2;
        }
        if ((i2 & 64) != 0) {
            z8 = v43Var.g;
        } else {
            z8 = z3;
        }
        if ((i2 & Token.CASE) != 0) {
            str7 = v43Var.h;
        } else {
            str7 = str3;
        }
        if ((i2 & 256) != 0) {
            k23Var2 = v43Var.i;
        } else {
            k23Var2 = k23Var;
        }
        if ((i2 & 512) != 0) {
            z9 = v43Var.j;
        } else {
            z9 = z4;
        }
        if ((i2 & 1024) != 0) {
            str8 = v43Var.k;
        } else {
            str8 = str4;
        }
        if ((i2 & 2048) != 0) {
            z10 = v43Var.l;
        } else {
            z10 = z5;
        }
        if ((i2 & 4096) != 0) {
            z11 = v43Var.m;
        } else {
            z11 = z6;
        }
        v43Var.getClass();
        str7.getClass();
        str8.getClass();
        return new v43(z12, str5, str6, list2, i3, z7, z8, str7, k23Var2, z9, str8, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v43) {
                v43 v43Var = (v43) obj;
                if (this.a != v43Var.a || !c16.i(this.b, v43Var.b) || !c16.i(this.c, v43Var.c) || !c16.i(this.d, v43Var.d) || this.e != v43Var.e || this.f != v43Var.f || this.g != v43Var.g || !this.h.equals(v43Var.h) || !c16.i(this.i, v43Var.i) || this.j != v43Var.j || !this.k.equals(v43Var.k) || this.l != v43Var.l || this.m != v43Var.m) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = Boolean.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.d;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int j = eub.j(eub.k(eub.k(hl5.a(this.e, (i3 + hashCode3) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
        k23 k23Var = this.i;
        if (k23Var != null) {
            i = k23Var.hashCode();
        }
        return Boolean.hashCode(this.m) + eub.k(eub.j(eub.k((j + i) * 31, 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailState(isLoading=");
        sb.append(this.a);
        sb.append(", extensionId=");
        sb.append(this.b);
        sb.append(", lastReadChapter=");
        sb.append(this.c);
        sb.append(", sections=");
        sb.append(this.d);
        sb.append(", chapterCount=");
        eub.w(sb, this.e, ", hasMoreChapter=", this.f, ", isLoadingChapter=");
        sb.append(this.g);
        sb.append(", source=");
        sb.append(this.h);
        sb.append(", detail=");
        sb.append(this.i);
        sb.append(", isError=");
        sb.append(this.j);
        sb.append(", errorMessage=");
        rs8.y(sb, this.k, ", isInShelf=", this.l, ", isSupportDownload=");
        return rs8.m(")", sb, this.m);
    }
}
