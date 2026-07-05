package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r99  reason: default package */
/* loaded from: classes.dex */
public final class r99 {
    public final int a;
    public final int b;
    public final Integer c;
    public final Integer d;

    public r99(int i, int i2, Integer num, Integer num2) {
        this.a = i;
        this.b = i2;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r99) {
                r99 r99Var = (r99) obj;
                if (this.a != r99Var.a || this.b != r99Var.b || !c16.i(this.c, r99Var.c) || !c16.i(this.d, r99Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int a = hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
        int i = 0;
        Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        Integer num2 = this.d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "Ptagx(tag=", ", tagValueCount=", ", valueCount=");
        r.append(this.c);
        r.append(", valueBytes=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}
