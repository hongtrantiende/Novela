package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xrc  reason: default package */
/* loaded from: classes3.dex */
public final class xrc {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final List k;
    public final String l;

    public xrc(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, String str4, int i, List list, String str5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = i;
        this.k = list;
        this.l = str5;
    }

    public static xrc a(xrc xrcVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, int i, List list, int i2) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String str4;
        String str5;
        String str6;
        int i3;
        List list2;
        if ((i2 & 1) != 0) {
            z6 = xrcVar.a;
        } else {
            z6 = z;
        }
        if ((i2 & 2) != 0) {
            z7 = xrcVar.b;
        } else {
            z7 = z2;
        }
        if ((i2 & 4) != 0) {
            z8 = xrcVar.c;
        } else {
            z8 = z3;
        }
        if ((i2 & 8) != 0) {
            z9 = xrcVar.d;
        } else {
            z9 = z4;
        }
        if ((i2 & 16) != 0) {
            z10 = xrcVar.e;
        } else {
            z10 = z5;
        }
        if ((i2 & 32) != 0) {
            str4 = xrcVar.f;
        } else {
            str4 = str;
        }
        if ((i2 & 64) != 0) {
            str5 = xrcVar.g;
        } else {
            str5 = str2;
        }
        if ((i2 & Token.CASE) != 0) {
            str6 = xrcVar.h;
        } else {
            str6 = str3;
        }
        String str7 = xrcVar.i;
        if ((i2 & 512) != 0) {
            i3 = xrcVar.j;
        } else {
            i3 = i;
        }
        if ((i2 & 1024) != 0) {
            list2 = xrcVar.k;
        } else {
            list2 = list;
        }
        String str8 = xrcVar.l;
        xrcVar.getClass();
        str5.getClass();
        return new xrc(z6, z7, z8, z9, z10, str4, str5, str6, str7, i3, list2, str8);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xrc) {
                xrc xrcVar = (xrc) obj;
                if (this.a != xrcVar.a || this.b != xrcVar.b || this.c != xrcVar.c || this.d != xrcVar.d || this.e != xrcVar.e || !this.f.equals(xrcVar.f) || !this.g.equals(xrcVar.g) || !this.h.equals(xrcVar.h) || !this.i.equals(xrcVar.i) || this.j != xrcVar.j || !c16.i(this.k, xrcVar.k) || !this.l.equals(xrcVar.l)) {
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
        int a = hl5.a(this.j, eub.j(eub.j(eub.j(eub.j(eub.k(eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
        List list = this.k;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return this.l.hashCode() + ((a + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("TxtState(isLoading=", this.a, ", isImporting=", this.b, ", isImported=");
        rs8.z(p, this.c, ", isChecking=", this.d, ", isError=");
        p.append(this.e);
        p.append(", bookName=");
        p.append(this.f);
        p.append(", bookLanguage=");
        nk2.C(p, this.g, ", bookCharset=", this.h, ", bookCover=");
        a82.u(this.j, this.i, ", regexCount=", ", chapters=", p);
        p.append(this.k);
        p.append(", errorMessage=");
        p.append(this.l);
        p.append(")");
        return p.toString();
    }
}
