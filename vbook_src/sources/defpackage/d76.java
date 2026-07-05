package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d76  reason: default package */
/* loaded from: classes.dex */
public final class d76 {
    public final String a;
    public final int b;
    public final String c;

    public d76(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d76)) {
            return false;
        }
        d76 d76Var = (d76) obj;
        if (c16.i(this.a, d76Var.a) && this.b == d76Var.b && c16.i(this.c, d76Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return s21.q(s21.s("KF8Resource(resourceType=", this.a, ", id=", this.b, ", type="), this.c, ")");
    }
}
