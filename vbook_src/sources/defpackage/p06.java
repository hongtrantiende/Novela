package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p06  reason: default package */
/* loaded from: classes.dex */
public class p06 {
    public final float a;
    public final float b;
    public final Object c;

    public p06(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p06 p06Var = (p06) obj;
            if (this.a == p06Var.a && this.b == p06Var.b && c16.i(this.c, p06Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int d = nk2.d(this.b, Float.hashCode(this.a) * 31, 31);
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return d + i;
    }

    public final String toString() {
        StringBuilder x = nk2.x("Interval(start=", this.a, ", end=", this.b, ", data=");
        x.append(this.c);
        x.append(")");
        return x.toString();
    }
}
