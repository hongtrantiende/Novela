package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lb5  reason: default package */
/* loaded from: classes.dex */
public final class lb5 {
    public final int a;
    public final int b;
    public final int c;
    public final sc5 d;

    public lb5(int i, int i2, int i3, sc5 sc5Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = sc5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lb5) {
                lb5 lb5Var = (lb5) obj;
                if (this.a != lb5Var.a || this.b != lb5Var.b || this.c != lb5Var.c || !this.d.equals(lb5Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "EncodedSpan(start=", ", end=", ", index=");
        r.append(this.c);
        r.append(", tagPair=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}
