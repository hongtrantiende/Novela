package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r24  reason: default package */
/* loaded from: classes3.dex */
public final class r24 {
    public final q24 a;
    public final int b;
    public final int c;

    public r24(q24 q24Var, int i, int i2) {
        this.a = q24Var;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        int i = this.c;
        if (i > 0) {
            return (this.b * 100) / i;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r24)) {
            return false;
        }
        r24 r24Var = (r24) obj;
        if (this.a == r24Var.a && this.b == r24Var.b && this.c == r24Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExportProgress(phase=");
        sb.append(this.a);
        sb.append(", current=");
        sb.append(this.b);
        sb.append(", total=");
        return rs8.g(this.c, ")", sb);
    }
}
