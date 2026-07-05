package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mp1  reason: default package */
/* loaded from: classes3.dex */
public final class mp1 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;

    public mp1(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = str2;
    }

    public static mp1 a(mp1 mp1Var, boolean z, String str, boolean z2, String str2, int i) {
        boolean z3;
        if ((i & 1) != 0) {
            z3 = mp1Var.a;
        } else {
            z3 = false;
        }
        if ((i & 2) != 0) {
            z = mp1Var.b;
        }
        if ((i & 4) != 0) {
            str = mp1Var.c;
        }
        if ((i & 8) != 0) {
            z2 = mp1Var.d;
        }
        if ((i & 16) != 0) {
            str2 = mp1Var.e;
        }
        mp1Var.getClass();
        return new mp1(str, str2, z3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mp1) {
                mp1 mp1Var = (mp1) obj;
                if (this.a != mp1Var.a || this.b != mp1Var.b || !this.c.equals(mp1Var.c) || this.d != mp1Var.d || !this.e.equals(mp1Var.e)) {
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
        StringBuilder p = rs8.p("ComicState(isLoading=", this.a, ", isImporting=", this.b, ", bookName=");
        rs8.y(p, this.c, ", isError=", this.d, ", errorMessage=");
        return s21.q(p, this.e, ")");
    }
}
