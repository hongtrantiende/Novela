package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tp6  reason: default package */
/* loaded from: classes3.dex */
public final class tp6 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public tp6(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tp6) {
                tp6 tp6Var = (tp6) obj;
                if (this.a != tp6Var.a || this.b != tp6Var.b || this.c != tp6Var.c || this.d != tp6Var.d || !this.e.equals(tp6Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "LinkIntersection(rangeStart=", ", rangeEnd=", ", sourceStart=");
        rs8.q(this.c, this.d, ", sourceEnd=", ", url=", r);
        return s21.q(r, this.e, ")");
    }
}
