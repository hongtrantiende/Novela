package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aj9  reason: default package */
/* loaded from: classes3.dex */
public final class aj9 {
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;

    public aj9(boolean z, String str, String str2, int i, int i2, boolean z2) {
        str.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = z2;
    }

    public static aj9 a(aj9 aj9Var, boolean z, boolean z2) {
        String str = aj9Var.b;
        String str2 = aj9Var.c;
        int i = aj9Var.d;
        int i2 = aj9Var.e;
        aj9Var.getClass();
        str.getClass();
        return new aj9(z, str, str2, i, i2, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aj9) {
                aj9 aj9Var = (aj9) obj;
                if (this.a != aj9Var.a || !c16.i(this.b, aj9Var.b) || !this.c.equals(aj9Var.c) || this.d != aj9Var.d || this.e != aj9Var.e || this.f != aj9Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + hl5.a(this.e, hl5.a(this.d, eub.j(eub.j(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderState(isLoading=");
        sb.append(this.a);
        sb.append(", bookId=");
        sb.append(this.b);
        sb.append(", bookName=");
        a82.u(this.d, this.c, ", bookType=", ", bookFormat=", sb);
        sb.append(this.e);
        sb.append(", isError=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
