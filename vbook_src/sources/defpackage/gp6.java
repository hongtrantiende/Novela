package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gp6  reason: default package */
/* loaded from: classes3.dex */
public final class gp6 {
    public final int a;
    public final int b;
    public final String c;

    public gp6(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gp6) {
                gp6 gp6Var = (gp6) obj;
                if (this.a != gp6Var.a || this.b != gp6Var.b || !this.c.equals(gp6Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return s21.q(hl5.r(this.a, this.b, "UrlMatch(start=", ", end=", ", url="), this.c, ")");
    }
}
