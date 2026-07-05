package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dt5  reason: default package */
/* loaded from: classes3.dex */
public final class dt5 {
    public final ct5 a;
    public final int b;
    public final int c;

    public dt5(ct5 ct5Var, int i, int i2) {
        this.a = ct5Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt5)) {
            return false;
        }
        dt5 dt5Var = (dt5) obj;
        if (this.a == dt5Var.a && this.b == dt5Var.b && this.c == dt5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImportProgress(phase=");
        sb.append(this.a);
        sb.append(", current=");
        sb.append(this.b);
        sb.append(", total=");
        return rs8.g(this.c, ")", sb);
    }
}
