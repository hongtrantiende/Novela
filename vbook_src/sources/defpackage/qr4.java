package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qr4  reason: default package */
/* loaded from: classes.dex */
public final class qr4 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public qr4(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qr4) {
                qr4 qr4Var = (qr4) obj;
                if (this.a != qr4Var.a || !this.b.equals(qr4Var.b) || this.c != qr4Var.c || this.d != qr4Var.d || this.e != qr4Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + hl5.a(this.d, hl5.a(this.c, eub.j(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("Fragment(insertOffset=", this.a, ", selector=", this.b, ", index=");
        rs8.q(this.c, this.d, ", offset=", ", length=", r);
        return rs8.g(this.e, ")", r);
    }
}
