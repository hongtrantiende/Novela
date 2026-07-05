package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iyb  reason: default package */
/* loaded from: classes.dex */
public final class iyb {
    public final int a;
    public final int b;
    public final tva c;

    public iyb(int i, int i2, tva tvaVar) {
        tvaVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = tvaVar;
        if (i >= 0) {
            if (i2 >= i) {
                return;
            }
            p1a.k(hl5.i(i2, i, "end (", ") must be >= start (", ")"));
            throw null;
        }
        p1a.k(a82.j(i, "start must be non-negative, got "));
        throw null;
    }

    public static iyb a(iyb iybVar, int i, int i2) {
        tva tvaVar = iybVar.c;
        tvaVar.getClass();
        return new iyb(i, i2, tvaVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyb)) {
            return false;
        }
        iyb iybVar = (iyb) obj;
        if (this.a == iybVar.a && this.b == iybVar.b && c16.i(this.c, iybVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "TextSpan(start=", ", end=", ", style=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
}
