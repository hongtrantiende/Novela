package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xv3  reason: default package */
/* loaded from: classes3.dex */
public final class xv3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public xv3(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public static xv3 a(xv3 xv3Var, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, int i) {
        String str4;
        if ((i & 1) != 0) {
            z = xv3Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = xv3Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = xv3Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = xv3Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            str = xv3Var.e;
        }
        String str5 = str;
        if ((i & 32) != 0) {
            str2 = xv3Var.f;
        }
        String str6 = str2;
        if ((i & 64) != 0) {
            str4 = xv3Var.g;
        } else {
            str4 = str3;
        }
        String str7 = xv3Var.h;
        xv3Var.getClass();
        str4.getClass();
        return new xv3(z5, z6, z7, z8, str5, str6, str4, str7);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xv3) {
                xv3 xv3Var = (xv3) obj;
                if (this.a != xv3Var.a || this.b != xv3Var.b || this.c != xv3Var.c || this.d != xv3Var.d || !this.e.equals(xv3Var.e) || !this.f.equals(xv3Var.f) || !this.g.equals(xv3Var.g) || !this.h.equals(xv3Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.h.hashCode() + eub.j(eub.j(eub.j(eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder p = rs8.p("EpubState(isLoading=", this.a, ", isImporting=", this.b, ", isImported=");
        rs8.z(p, this.c, ", isError=", this.d, ", bookName=");
        nk2.C(p, this.e, ", bookAuthor=", this.f, ", bookLanguage=");
        return nk2.w(p, this.g, ", errorMessage=", this.h, ")");
    }
}
