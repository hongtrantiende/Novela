package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z66  reason: default package */
/* loaded from: classes.dex */
public final class z66 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public z66(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z66) {
                z66 z66Var = (z66) obj;
                if (this.a != z66Var.a || this.b != z66Var.b || this.c != z66Var.c || this.d != z66Var.d || !this.e.equals(z66Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return eub.j(hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "KF6Section(index=", ", start=", ", end=");
        rs8.q(this.c, this.d, ", length=", ", href=", r);
        return s21.q(r, this.e, ", next=null)");
    }
}
