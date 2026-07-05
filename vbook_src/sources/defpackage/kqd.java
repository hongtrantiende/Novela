package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kqd  reason: default package */
/* loaded from: classes3.dex */
public final class kqd {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;

    public kqd(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = str2;
    }

    public static kqd a(kqd kqdVar, boolean z, boolean z2, String str, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = kqdVar.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = kqdVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = kqdVar.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z3 = kqdVar.d;
        }
        String str3 = kqdVar.e;
        kqdVar.getClass();
        return new kqd(str2, str3, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kqd) {
                kqd kqdVar = (kqd) obj;
                if (this.a != kqdVar.a || this.b != kqdVar.b || !this.c.equals(kqdVar.c) || this.d != kqdVar.d || !this.e.equals(kqdVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.k(eub.j(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder p = rs8.p("ZipState(isLoading=", this.a, ", isImporting=", this.b, ", bookName=");
        rs8.y(p, this.c, ", isError=", this.d, ", errorMessage=");
        return s21.q(p, this.e, ")");
    }
}
