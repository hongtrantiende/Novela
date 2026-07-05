package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a68  reason: default package */
/* loaded from: classes3.dex */
public final class a68 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;

    public a68(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
    }

    public static a68 a(a68 a68Var, boolean z, boolean z2, String str, int i) {
        boolean z3;
        if ((i & 1) != 0) {
            z3 = a68Var.a;
        } else {
            z3 = false;
        }
        boolean z4 = z3;
        if ((i & 2) != 0) {
            z = a68Var.b;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = a68Var.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            str = a68Var.d;
        }
        String str2 = a68Var.e;
        a68Var.getClass();
        return new a68(str, str2, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a68) {
                a68 a68Var = (a68) obj;
                if (this.a != a68Var.a || this.b != a68Var.b || this.c != a68Var.c || !this.d.equals(a68Var.d) || !this.e.equals(a68Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.j(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder p = rs8.p("NovelState(isLoading=", this.a, ", isImporting=", this.b, ", isError=");
        p.append(this.c);
        p.append(", bookName=");
        p.append(this.d);
        p.append(", errorMessage=");
        return s21.q(p, this.e, ")");
    }
}
